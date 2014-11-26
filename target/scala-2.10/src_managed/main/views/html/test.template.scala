
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.2*/("""<div class="row">
        
	        <div class="col-md-4" id="TowerProperties">
	        	<h3><span class="label label-default">Eigenschaften:</span></h3>
	        	<ul>
	        		<li>
	        			<span>Speed:</span>
	        		</li>
	        		<li>
	        			<span>Damage:</span>
	        		</li>
	        		<li>
	        			<span>Range:</span>
	        		</li>
	        	</ul>
	        </div>
	        
	    </div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 26 16:03:10 CET 2014
                    SOURCE: E:/Martin/Studium/Play/projects/TowerDefence-play/app/views/test.scala.html
                    HASH: 01192d3ae4c7ff5d231060e27dfadfd70d889532
                    MATRIX: 854->1
                    LINES: 29->1
                    -- GENERATED --
                */
            