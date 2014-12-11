// @SOURCE:C:/Users/Chris/Play/TowerDefencePlay/conf/routes
// @HASH:4165c046933162cc1b1e68d07f170c51cb1678a1
// @DATE:Thu Dec 11 13:39:59 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers {

// @LINE:5
class ReverseWebController {
    

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:17
class ReverseWebJarAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseAssets {
    

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:6
case (path, file) if path == "/public/html" && file == "index.html" => Call("GET", _prefix + { _defaultPrefix } + "1")
                                                        
// @LINE:9
case (path, file) if path == "/public/css" && file == "bootstrap.css" => Call("GET", _prefix + { _defaultPrefix } + "public/css/bootstrap.css")
                                                        
// @LINE:10
case (path, file) if path == "/public/js/jquerry" && file == "jquery.js" => Call("GET", _prefix + { _defaultPrefix } + "public/js/jquerry/jquery.js")
                                                        
// @LINE:11
case (path, file) if path == "/public/js/angular" && file == "angular.js" => Call("GET", _prefix + { _defaultPrefix } + "public/js/angular/angular.js")
                                                        
// @LINE:12
case (path, file) if path == "/public/js/angular" && file == "angular-route.js" => Call("GET", _prefix + { _defaultPrefix } + "public/js/angular/angular-route.js")
                                                        
// @LINE:15
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:16
case (path, file) if path == "/public/html" => Call("GET", _prefix + { _defaultPrefix } + "public/html/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:5
class ReverseWebController {
    

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:17
class ReverseWebJarAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseAssets {
    

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "1"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/css") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("bootstrap.css") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/css/bootstrap.css"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/js/jquerry") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("jquery.js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/js/jquerry/jquery.js"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/js/angular") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("angular.js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/js/angular/angular.js"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/js/angular") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("angular-route.js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/js/angular/angular-route.js"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/html/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:5
class ReverseWebController {
    

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.index(), HandlerDef(this, "controllers.WebController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:17
class ReverseWebJarAssets {
    

// @LINE:17
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseAssets {
    

// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """1""")
)
                      
    
}
                          
}
        
    