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
    
    public static Result updateGameContext() {
    	String newGameContext = "NULL";
    	String currentGameContext = request().body().asJson().toString();
    	
    	if(currentGameContext.length() < 3) {
    		newGameContext = gameController.createNewGame("Master", 1, 9999, 10, 10).toString();
    	} else {
    		try {
        		newGameContext = gameController.updateGameContext(currentGameContext).toString();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
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