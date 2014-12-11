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
    	return ok(gameController.updateGameContext("kein Game Context"));
    }
}