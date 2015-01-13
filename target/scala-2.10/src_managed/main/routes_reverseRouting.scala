// @SOURCE:C:/Users/Chris/Play/TowerDefencePlay/conf/routes
// @HASH:34750b8458139f1ca646df5a5c211b7c7d7c0ec9
// @DATE:Tue Jan 13 16:34:04 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
package controllers {

// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:4
class ReverseWebController {
    

// @LINE:7
def updateGameContext(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "update")
}
                                                

// @LINE:13
def protectedGame(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "protected")
}
                                                

// @LINE:10
def upgradeTower(x:Integer, y:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upgradetower/" + implicitly[PathBindable[Integer]].unbind("x", x) + "/" + implicitly[PathBindable[Integer]].unbind("y", y))
}
                                                

// @LINE:9
def sendMob(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sendMob")
}
                                                

// @LINE:11
def startNewGame(name:String, life:Integer, money:Integer, email:String, x:Integer, y:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "startnewgame/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/" + implicitly[PathBindable[Integer]].unbind("life", life) + "/" + implicitly[PathBindable[Integer]].unbind("money", money) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[Integer]].unbind("x", x) + "/" + implicitly[PathBindable[Integer]].unbind("y", y))
}
                                                

// @LINE:8
def setTower(x:Integer, y:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "settower/" + implicitly[PathBindable[Integer]].unbind("x", x) + "/" + implicitly[PathBindable[Integer]].unbind("y", y))
}
                                                

// @LINE:4
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:5
class ReverseAssets {
    

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:5
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:5
case (path, file) if path == "/public/html" && file == "rules.html" => Call("GET", _prefix + { _defaultPrefix } + "rules")
                                                        
// @LINE:20
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:24
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:25
case (path, file) if path == "/public/html" => Call("GET", _prefix + { _defaultPrefix } + "html/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:26
case (path, file) if path == "/public/js" => Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:27
case (path, file) if path == "/public/css" => Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          
}
                  

// @LINE:16
// @LINE:15
// @LINE:14
package org.pac4j.play {

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseCallbackController {
    

// @LINE:15
// @LINE:14
def callback(): Call = {
   () match {
// @LINE:14
case () if true => Call("GET", _prefix + { _defaultPrefix } + "callback")
                                                        
// @LINE:15
case () if true => Call("POST", _prefix + { _defaultPrefix } + "callback")
                                                        
   }
}
                                                

// @LINE:16
def logoutAndRedirect(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                
    
}
                          
}
                  


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
package controllers.javascript {

// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:4
class ReverseWebController {
    

// @LINE:7
def updateGameContext : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.updateGameContext",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
      }
   """
)
                        

// @LINE:13
def protectedGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.protectedGame",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "protected"})
      }
   """
)
                        

// @LINE:10
def upgradeTower : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.upgradeTower",
   """
      function(x,y) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upgradetower/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("x", x) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("y", y)})
      }
   """
)
                        

// @LINE:9
def sendMob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.sendMob",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendMob"})
      }
   """
)
                        

// @LINE:11
def startNewGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.startNewGame",
   """
      function(name,life,money,email,x,y) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "startnewgame/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("life", life) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("money", money) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("x", x) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("y", y)})
      }
   """
)
                        

// @LINE:8
def setTower : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.setTower",
   """
      function(x,y) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settower/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("x", x) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("y", y)})
      }
   """
)
                        

// @LINE:4
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:5
class ReverseAssets {
    

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:5
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/html") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("rules.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rules"})
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
        

// @LINE:16
// @LINE:15
// @LINE:14
package org.pac4j.play.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseCallbackController {
    

// @LINE:15
// @LINE:14
def callback : JavascriptReverseRoute = JavascriptReverseRoute(
   "org.pac4j.play.CallbackController.callback",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "callback"})
      }
      }
   """
)
                        

// @LINE:16
def logoutAndRedirect : JavascriptReverseRoute = JavascriptReverseRoute(
   "org.pac4j.play.CallbackController.logoutAndRedirect",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
package controllers.ref {


// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:4
class ReverseWebController {
    

// @LINE:7
def updateGameContext(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.updateGameContext(), HandlerDef(this, "controllers.WebController", "updateGameContext", Seq(), "POST", """""", _prefix + """update""")
)
                      

// @LINE:13
def protectedGame(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.protectedGame(), HandlerDef(this, "controllers.WebController", "protectedGame", Seq(), "GET", """""", _prefix + """protected""")
)
                      

// @LINE:10
def upgradeTower(x:Integer, y:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.upgradeTower(x, y), HandlerDef(this, "controllers.WebController", "upgradeTower", Seq(classOf[Integer], classOf[Integer]), "POST", """""", _prefix + """upgradetower/$x<[^/]+>/$y<[^/]+>""")
)
                      

// @LINE:9
def sendMob(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.sendMob(), HandlerDef(this, "controllers.WebController", "sendMob", Seq(), "POST", """""", _prefix + """sendMob""")
)
                      

// @LINE:11
def startNewGame(name:String, life:Integer, money:Integer, email:String, x:Integer, y:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.startNewGame(name, life, money, email, x, y), HandlerDef(this, "controllers.WebController", "startNewGame", Seq(classOf[String], classOf[Integer], classOf[Integer], classOf[String], classOf[Integer], classOf[Integer]), "POST", """""", _prefix + """startnewgame/$name<[^/]+>/$life<[^/]+>/$money<[^/]+>/$email<[^/]+>/$x<[^/]+>/$y<[^/]+>""")
)
                      

// @LINE:8
def setTower(x:Integer, y:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.setTower(x, y), HandlerDef(this, "controllers.WebController", "setTower", Seq(classOf[Integer], classOf[Integer]), "POST", """""", _prefix + """settower/$x<[^/]+>/$y<[^/]+>""")
)
                      

// @LINE:4
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebController.index(), HandlerDef(this, "controllers.WebController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:20
// @LINE:5
class ReverseAssets {
    

// @LINE:5
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """rules""")
)
                      
    
}
                          
}
        

// @LINE:16
// @LINE:15
// @LINE:14
package org.pac4j.play.ref {


// @LINE:16
// @LINE:15
// @LINE:14
class ReverseCallbackController {
    

// @LINE:14
def callback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   org.pac4j.play.CallbackController.callback(), HandlerDef(this, "org.pac4j.play.CallbackController", "callback", Seq(), "GET", """""", _prefix + """callback""")
)
                      

// @LINE:16
def logoutAndRedirect(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   org.pac4j.play.CallbackController.logoutAndRedirect(), HandlerDef(this, "org.pac4j.play.CallbackController", "logoutAndRedirect", Seq(), "GET", """""", _prefix + """logout""")
)
                      
    
}
                          
}
        
    