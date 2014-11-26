
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

Seq[Any](format.raw/*1.1*/("""<html ng-app="towerdefence">
  <head>
    <meta charset="utf-8">
    <title>Angular.js Example</title>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.10/angular.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.10/angular-route.min.js"></script>
    
    <script type='text/javascript' src='"""),_display_(Seq[Any](/*8.42*/routes/*8.48*/.Assets.at("javascript/app.js"))),format.raw/*8.79*/("""'></script>
    <script type='text/javascript' src='"""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("javascript/controllers.js"))),format.raw/*9.87*/("""'></script>

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
                    DATE: Wed Nov 26 16:08:24 CET 2014
                    SOURCE: E:/Martin/Studium/Play/projects/TowerDefence-play/app/views/index.scala.html
                    HASH: c9fd68609f01486932c276b3c21b3e1028113e08
                    MATRIX: 855->0|1240->350|1254->356|1306->387|1395->441|1409->447|1469->486
                    LINES: 29->1|36->8|36->8|36->8|37->9|37->9|37->9
                    -- GENERATED --
                */
            