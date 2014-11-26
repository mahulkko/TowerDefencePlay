package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class WebController extends Controller {
	
    public static Result index() {
    	return ok(views.html.index.render());
    }
    
    public static Result index2() {
    	return ok(views.html.test.render());
    }
}