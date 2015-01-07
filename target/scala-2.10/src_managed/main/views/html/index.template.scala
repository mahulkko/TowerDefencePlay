
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html ng-app="towerdefenceApp">
  <head>
    <meta charset="utf-8">
    <title>Tower Defence</title>
    
    <link rel='stylesheet' type='text/css' href='/css/bootstrap.css'>
    
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/bootstrap/bootstrap.js"></script>
    <script type="text/javascript" src="/js/angular/angular.js"></script>
    <script type="text/javascript" src="/js/angular/angular-route.js"></script>
    
    <script type='text/javascript' src="/assets/javascript/app.js"></script>
    <script type='text/javascript' src="/assets/javascript/controllers.js"></script>
    <script type='text/javascript' src="/assets/javascript/gamecontextfactory.js"></script>
    <script type='text/javascript' src="/assets/javascript/directives.js"></script>
    
  </head>
  <body>
    <div ng-view></div>
  </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 07 14:27:41 CET 2015
                    SOURCE: C:/Users/Chris/Play/TowerDefencePlay/app/views/index.scala.html
                    HASH: 8d8f2070f875505d6a3446ccb365f0edfb9155fc
                    MATRIX: 855->0
                    LINES: 29->1
                    -- GENERATED --
                */
            