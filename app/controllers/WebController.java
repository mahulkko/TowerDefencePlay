package controllers;

import java.io.IOException;

import de.htwg.towerdefence.controller.IGameController;
import de.htwg.towerdefence.controller.impl.GameController;
import play.mvc.Result;

import org.pac4j.core.profile.CommonProfile;
import org.pac4j.play.java.JavaController;
import org.pac4j.play.java.RequiresAuthentication;

public class WebController extends JavaController {
	
	private static IGameController gameController = new GameController(false); 
	
    public static Result index() {
    	return ok(views.html.index.render());
    }
    
    @RequiresAuthentication(clientName = "FacebookClient")
    public static Result protectedGame() {
    	System.out.println("Get Profil");
    	final CommonProfile profile = getUserProfile();
    	if(profile != null) {
    		System.out.println("Profil != null");
    		return ok(views.html.index.render());
    	} else {
    		System.out.println("Profil == null");
    		return notFound();
    	}
    }
    
    public static Result startNewGame(String name, int life, int money, String email, int sizeX, int sizeY) {
    	String newGameContext = "NULL";
    	newGameContext = gameController.createNewGame(name, life, money, email, sizeX, sizeY).toString();
		return ok(newGameContext);
    }
    
    public static Result updateGameContext() {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
		try {
    		newGameContext = gameController.updateGameContext(currentGameContext).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		return ok(newGameContext);
    }
    
    public static Result setTower(int x, int y) {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
    	try {
    		newGameContext = gameController.setTowerToPostion(currentGameContext, x, y).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		return ok(newGameContext);
    }
    
    public static Result sendMob() {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
    	try {
    		newGameContext = gameController.sendNewMobFromStart(currentGameContext).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		return ok(newGameContext);
    }
    
    
    public static Result upgradeTower(int x, int y) {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
    	try {
    		newGameContext = gameController.upgradeTower(currentGameContext, x, y).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		return ok(newGameContext);
    }
    
}