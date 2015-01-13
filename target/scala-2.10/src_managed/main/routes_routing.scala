// @SOURCE:C:/Users/Chris/Play/TowerDefencePlay/conf/routes
// @HASH:34750b8458139f1ca646df5a5c211b7c7d7c0ec9
// @DATE:Tue Jan 13 16:34:04 CET 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:4
private[this] lazy val controllers_WebController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:5
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rules"))))
        

// @LINE:7
private[this] lazy val controllers_WebController_updateGameContext2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update"))))
        

// @LINE:8
private[this] lazy val controllers_WebController_setTower3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settower/"),DynamicPart("x", """[^/]+""",true),StaticPart("/"),DynamicPart("y", """[^/]+""",true))))
        

// @LINE:9
private[this] lazy val controllers_WebController_sendMob4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendMob"))))
        

// @LINE:10
private[this] lazy val controllers_WebController_upgradeTower5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upgradetower/"),DynamicPart("x", """[^/]+""",true),StaticPart("/"),DynamicPart("y", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_WebController_startNewGame6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("startnewgame/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"),DynamicPart("life", """[^/]+""",true),StaticPart("/"),DynamicPart("money", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("x", """[^/]+""",true),StaticPart("/"),DynamicPart("y", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_WebController_protectedGame7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("protected"))))
        

// @LINE:14
private[this] lazy val org_pac4j_play_CallbackController_callback8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("callback"))))
        

// @LINE:15
private[this] lazy val org_pac4j_play_CallbackController_callback9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("callback"))))
        

// @LINE:16
private[this] lazy val org_pac4j_play_CallbackController_logoutAndRedirect10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:21
private[this] lazy val controllers_WebJarAssets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:24
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("file", """.+""",false))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("html/"),DynamicPart("file", """.+""",false))))
        

// @LINE:26
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("js/"),DynamicPart("file", """.+""",false))))
        

// @LINE:27
private[this] lazy val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("css/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.WebController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rules""","""controllers.Assets.at(path:String = "/public/html", file:String = "rules.html")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update""","""controllers.WebController.updateGameContext()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settower/$x<[^/]+>/$y<[^/]+>""","""controllers.WebController.setTower(x:Integer, y:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendMob""","""controllers.WebController.sendMob()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upgradetower/$x<[^/]+>/$y<[^/]+>""","""controllers.WebController.upgradeTower(x:Integer, y:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """startnewgame/$name<[^/]+>/$life<[^/]+>/$money<[^/]+>/$email<[^/]+>/$x<[^/]+>/$y<[^/]+>""","""controllers.WebController.startNewGame(name:String, life:Integer, money:Integer, email:String, x:Integer, y:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """protected""","""controllers.WebController.protectedGame()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """callback""","""org.pac4j.play.CallbackController.callback()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """callback""","""org.pac4j.play.CallbackController.callback()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""org.pac4j.play.CallbackController.logoutAndRedirect()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """html/$file<.+>""","""controllers.Assets.at(path:String = "/public/html", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """js/$file<.+>""","""controllers.Assets.at(path:String = "/public/js", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """css/$file<.+>""","""controllers.Assets.at(path:String = "/public/css", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:4
case controllers_WebController_index0(params) => {
   call { 
        invokeHandler(controllers.WebController.index(), HandlerDef(this, "controllers.WebController", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:5
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public/html")), Param[String]("file", Right("rules.html"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """rules"""))
   }
}
        

// @LINE:7
case controllers_WebController_updateGameContext2(params) => {
   call { 
        invokeHandler(controllers.WebController.updateGameContext(), HandlerDef(this, "controllers.WebController", "updateGameContext", Nil,"POST", """""", Routes.prefix + """update"""))
   }
}
        

// @LINE:8
case controllers_WebController_setTower3(params) => {
   call(params.fromPath[Integer]("x", None), params.fromPath[Integer]("y", None)) { (x, y) =>
        invokeHandler(controllers.WebController.setTower(x, y), HandlerDef(this, "controllers.WebController", "setTower", Seq(classOf[Integer], classOf[Integer]),"POST", """""", Routes.prefix + """settower/$x<[^/]+>/$y<[^/]+>"""))
   }
}
        

// @LINE:9
case controllers_WebController_sendMob4(params) => {
   call { 
        invokeHandler(controllers.WebController.sendMob(), HandlerDef(this, "controllers.WebController", "sendMob", Nil,"POST", """""", Routes.prefix + """sendMob"""))
   }
}
        

// @LINE:10
case controllers_WebController_upgradeTower5(params) => {
   call(params.fromPath[Integer]("x", None), params.fromPath[Integer]("y", None)) { (x, y) =>
        invokeHandler(controllers.WebController.upgradeTower(x, y), HandlerDef(this, "controllers.WebController", "upgradeTower", Seq(classOf[Integer], classOf[Integer]),"POST", """""", Routes.prefix + """upgradetower/$x<[^/]+>/$y<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_WebController_startNewGame6(params) => {
   call(params.fromPath[String]("name", None), params.fromPath[Integer]("life", None), params.fromPath[Integer]("money", None), params.fromPath[String]("email", None), params.fromPath[Integer]("x", None), params.fromPath[Integer]("y", None)) { (name, life, money, email, x, y) =>
        invokeHandler(controllers.WebController.startNewGame(name, life, money, email, x, y), HandlerDef(this, "controllers.WebController", "startNewGame", Seq(classOf[String], classOf[Integer], classOf[Integer], classOf[String], classOf[Integer], classOf[Integer]),"POST", """""", Routes.prefix + """startnewgame/$name<[^/]+>/$life<[^/]+>/$money<[^/]+>/$email<[^/]+>/$x<[^/]+>/$y<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_WebController_protectedGame7(params) => {
   call { 
        invokeHandler(controllers.WebController.protectedGame(), HandlerDef(this, "controllers.WebController", "protectedGame", Nil,"GET", """""", Routes.prefix + """protected"""))
   }
}
        

// @LINE:14
case org_pac4j_play_CallbackController_callback8(params) => {
   call { 
        invokeHandler(org.pac4j.play.CallbackController.callback(), HandlerDef(this, "org.pac4j.play.CallbackController", "callback", Nil,"GET", """""", Routes.prefix + """callback"""))
   }
}
        

// @LINE:15
case org_pac4j_play_CallbackController_callback9(params) => {
   call { 
        invokeHandler(org.pac4j.play.CallbackController.callback(), HandlerDef(this, "org.pac4j.play.CallbackController", "callback", Nil,"POST", """""", Routes.prefix + """callback"""))
   }
}
        

// @LINE:16
case org_pac4j_play_CallbackController_logoutAndRedirect10(params) => {
   call { 
        invokeHandler(org.pac4j.play.CallbackController.logoutAndRedirect(), HandlerDef(this, "org.pac4j.play.CallbackController", "logoutAndRedirect", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:20
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:21
case controllers_WebJarAssets_at12(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:24
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Server Resources for html/css/js """, Routes.prefix + """$file<.+>"""))
   }
}
        

// @LINE:25
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public/html")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """html/$file<.+>"""))
   }
}
        

// @LINE:26
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public/js")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """js/$file<.+>"""))
   }
}
        

// @LINE:27
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public/css")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """css/$file<.+>"""))
   }
}
        
}

}
     