package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class WebController extends Controller {
	
    public static Result index() {
    	return ok(views.html.index.render());
    }
}