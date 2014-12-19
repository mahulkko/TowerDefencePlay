package controllers;

import de.htwg.towerdefence.controller.IGameController;
import de.htwg.towerdefence.controller.impl.GameController;
import play.mvc.Controller;
import play.mvc.Result;

public class WebController extends Controller {
	
	private static IGameController gameController = new GameController(); 
	
    public static Result index() {
    	return ok(views.html.index.render());
    }
    
    public static Result updateGameContext() {
    	return ok(gameController.updateGameContext("Update Methode"));
    }
    
    public static Result postGameContext() {
    	String currentGameContext = request().body().asJson().toString();
    	System.out.println("WEBCONTROLLER  Current Game Context: " + currentGameContext);
    	return ok(gameController.updateGameContext(currentGameContext));
    }
    
    public static Result setTower(int x, int y) {
    	String currentGameContext = request().body().asJson().toString();
    	System.out.println("WEBCONTROLLER  Current Game Context for Set Tower: " + currentGameContext);
    	return ok(gameController.setTowerToPostion(currentGameContext, x, y));
    }

}