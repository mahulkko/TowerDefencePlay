// @SOURCE:C:/Users/Chris/Play/TowerDefencePlay/conf/routes
// @HASH:4165c046933162cc1b1e68d07f170c51cb1678a1
// @DATE:Thu Dec 11 13:39:59 CET 2014


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


// @LINE:5
private[this] lazy val controllers_WebController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("1"))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/css/bootstrap.css"))))
        

// @LINE:10
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/js/jquerry/jquery.js"))))
        

// @LINE:11
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/js/angular/angular.js"))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/js/angular/angular-route.js"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:16
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/html/"),DynamicPart("file", """.+""",false))))
        

// @LINE:17
private[this] lazy val controllers_WebJarAssets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.WebController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """1""","""controllers.Assets.at(path:String = "/public/html", file:String = "index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/css/bootstrap.css""","""controllers.Assets.at(path:String = "/public/css", file:String = "bootstrap.css")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/js/jquerry/jquery.js""","""controllers.Assets.at(path:String = "/public/js/jquerry", file:String = "jquery.js")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/js/angular/angular.js""","""controllers.Assets.at(path:String = "/public/js/angular", file:String = "angular.js")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/js/angular/angular-route.js""","""controllers.Assets.at(path:String = "/public/js/angular", file:String = "angular-route.js")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/html/$file<.+>""","""controllers.Assets.at(path:String = "/public/html", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_WebController_index0(params) => {
   call { 
        invokeHandler(controllers.WebController.index(), HandlerDef(this, "controllers.WebController", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public/html")), Param[String]("file", Right("index.html"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """1"""))
   }
}
        

// @LINE:9
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public/css")), Param[String]("file", Right("bootstrap.css"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Server Site Resources""", Routes.prefix + """public/css/bootstrap.css"""))
   }
}
        

// @LINE:10
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public/js/jquerry")), Param[String]("file", Right("jquery.js"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/js/jquerry/jquery.js"""))
   }
}
        

// @LINE:11
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public/js/angular")), Param[String]("file", Right("angular.js"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/js/angular/angular.js"""))
   }
}
        

// @LINE:12
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public/js/angular")), Param[String]("file", Right("angular-route.js"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/js/angular/angular-route.js"""))
   }
}
        

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:16
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public/html")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/html/$file<.+>"""))
   }
}
        

// @LINE:17
case controllers_WebJarAssets_at8(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        
}

}
     