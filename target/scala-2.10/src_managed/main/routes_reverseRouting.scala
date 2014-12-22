// @SOURCE:/home/chris/Play/projects/TowerDefencePlay/conf/routes
// @HASH:2e9678f3f3cf116151650a617b23579a90addc70
// @DATE:Mon Dec 22 11:32:15 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseWebController {
    

// @LINE:9
def postGameContext(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "post")
}
                                                

// @LINE:10
def setTower(x:Integer, y:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "settower/" + implicitly[PathBindable[Integer]].unbind("x", x) + "/" + implicitly[PathBindable[Integer]].unbind("y", y))
}
                                                

// @LINE:8
def updateGameContext(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "update")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:6
class ReverseAssets {
    

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:6
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:6
case (path, file) if path == "/public/html" && file == "test.html" => Call("GET", _prefix + { _defaultPrefix } + "test")
                                                        
// @LINE:13
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:17
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:18
case (path, file) if path == "/public/html" => Call("GET", _prefix + { _defaultPrefix } + "html/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:19
case (path, file) if path == "/public/js" => Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:20
case (path, file) if path == "/public/css" => Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseWebController {
    

// @LINE:9
def postGameContext : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.postGameContext",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
   """
)
                        

// @LINE:10
def setTower : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.setTower",
   """
      function(x,y) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settower/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("x", x) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("y", y)})
      }
   """
)
                        

// @LINE:8
def updateGameContext : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.updateGameContext",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
      }
   """
)
                        

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
              

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:6
class ReverseAssets {
    

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("test.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "html/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "js/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/css") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseWebController {
    

// @LINE:9
def postGameContext(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.postGameContext(), HandlerDef(this, "controllers.WebController", "postGameContext", Seq(), "POST", """""", _prefix + """post""")
)
                      

// @LINE:10
def setTower(x:Integer, y:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.setTower(x, y), HandlerDef(this, "controllers.WebController", "setTower", Seq(classOf[Integer], classOf[Integer]), "POST", """""", _prefix + """settower/$x<[^/]+>/$y<[^/]+>""")
)
                      

// @LINE:8
def updateGameContext(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.updateGameContext(), HandlerDef(this, "controllers.WebController", "updateGameContext", Seq(), "GET", """""", _prefix + """update""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.index(), HandlerDef(this, "controllers.WebController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:13
// @LINE:6
class ReverseAssets {
    

// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """test""")
)
                      
    
}
                          
}
        
    