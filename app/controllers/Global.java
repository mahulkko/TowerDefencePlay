package controllers;

import org.pac4j.core.client.Clients;
import org.pac4j.oauth.client.FacebookClient;
import org.pac4j.oauth.client.Google2Client;
import org.pac4j.play.Config;

import play.*;

public class Global extends GlobalSettings {

	 @Override
	  public void onStart(Application app) {
	    System.out.println("Application has started");
	    // OAuth
	    final Google2Client googleClient = new Google2Client (
	    		"134678913668-m92g9igaokp1jjknom4kbq5dnub66uhm.apps.googleusercontent.com", 
	    		"Ql5NPhYeLf5RuwC1w8FNjCYR");
	    
	    final FacebookClient facebookClient = new FacebookClient("132736803558924", "e461422527aeedb32ee6c10834d3e19e");
	    
	    final Clients clients = new Clients("http://localhost:9000/callback", googleClient, facebookClient);
	    Config.setClients(clients);
	  }  
	  
	  @Override
	  public void onStop(Application app) {
		  System.out.println("Application shutdown...");
	  }  
}
