package controllers;


import java.io.IOException;

import de.htwg.towerdefence.controller.IGameController;
import de.htwg.towerdefence.controller.impl.GameController;
import play.mvc.Controller;
import play.mvc.Result;

public class WebController extends Controller {
	
	private static IGameController gameController = new GameController(false); 
	
    public static Result index() {
    	return ok(views.html.index.render());
    }
    
    public static Result startNewGame(String name, int life, int money, String email, int sizeX, int sizeY) {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
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