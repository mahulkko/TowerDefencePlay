
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
object index2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,de.htwg.towerdefence.controller.IGameController,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, controller:de.htwg.towerdefence.controller.IGameController):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.79*/("""

"""),_display_(Seq[Any](/*3.2*/main("TowerDefense 2014")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	<link rel='stylesheet' href='"""),_display_(Seq[Any](/*4.32*/routes/*4.38*/.Assets.at("stylesheets/playingfield.min.css"))),format.raw/*4.84*/("""'>
	<script type='text/javascript' src='"""),_display_(Seq[Any](/*5.39*/routes/*5.45*/.Assets.at("javascript/index.js"))),format.raw/*5.78*/("""'></script>
	 
	 
	<div class="well">
	
	        <div class="row" id="playingfield">
		        <table class="table table-bordered">
		        	"""),_display_(Seq[Any](/*12.13*/for(column <- -1 until controller.getSizeYOfPlayingField()+1) yield /*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
		        		<tr>
		        			"""),_display_(Seq[Any](/*14.15*/for(row <- -1 until controller.getSizeXOfPlayingField()+1) yield /*14.73*/ {_display_(Seq[Any](format.raw/*14.75*/("""
		        				"""),_display_(Seq[Any](/*15.16*/if(row == -1 || row == controller.getSizeXOfPlayingField() || column == -1 || column == controller.getSizeYOfPlayingField())/*15.140*/ {_display_(Seq[Any](format.raw/*15.142*/("""
		        					<td class="field border"  id=""""),_display_(Seq[Any](/*16.47*/row)),format.raw/*16.50*/(""","""),_display_(Seq[Any](/*16.52*/column)),format.raw/*16.58*/("""">"""),_display_(Seq[Any](/*16.61*/row)),format.raw/*16.64*/(""","""),_display_(Seq[Any](/*16.66*/column)),format.raw/*16.72*/("""</td>
		        				""")))}/*17.17*/else/*17.22*/{_display_(Seq[Any](format.raw/*17.23*/("""
		        					"""),_display_(Seq[Any](/*18.17*/if(controller.isTowerOnField(row, column))/*18.59*/ {_display_(Seq[Any](format.raw/*18.61*/("""
										<td class="field tower"  id=""""),_display_(Seq[Any](/*19.41*/row)),format.raw/*19.44*/(""","""),_display_(Seq[Any](/*19.46*/column)),format.raw/*19.52*/("""">"""),_display_(Seq[Any](/*19.55*/row)),format.raw/*19.58*/(""","""),_display_(Seq[Any](/*19.60*/column)),format.raw/*19.66*/("""</td>
									""")))}/*20.12*/else/*20.17*/{_display_(Seq[Any](format.raw/*20.18*/(""" """),_display_(Seq[Any](/*20.20*/if(controller.isMobOnField(row, column))/*20.60*/ {_display_(Seq[Any](format.raw/*20.62*/("""
										<td class="field mob"  id=""""),_display_(Seq[Any](/*21.39*/row)),format.raw/*21.42*/(""","""),_display_(Seq[Any](/*21.44*/column)),format.raw/*21.50*/("""">"""),_display_(Seq[Any](/*21.53*/row)),format.raw/*21.56*/(""","""),_display_(Seq[Any](/*21.58*/column)),format.raw/*21.64*/("""</td>
									""")))}/*22.12*/else/*22.17*/{_display_(Seq[Any](format.raw/*22.18*/("""
										<td class="field"  id=""""),_display_(Seq[Any](/*23.35*/row)),format.raw/*23.38*/(""","""),_display_(Seq[Any](/*23.40*/column)),format.raw/*23.46*/("""">"""),_display_(Seq[Any](/*23.49*/row)),format.raw/*23.52*/(""","""),_display_(Seq[Any](/*23.54*/column)),format.raw/*23.60*/("""</td>
									""")))}))))})),format.raw/*24.12*/("""
		        				""")))})),format.raw/*25.16*/("""
		        			""")))})),format.raw/*26.15*/("""
		        		</tr>
		        	""")))})),format.raw/*28.13*/("""
		        </table>
	        </div>



        <div class="row" id="TowerSelection">
        	<h4>
        	   <span class="label label-default">Tower Auswahl:</span>
        	   <div class="btn-group">
		           <button type="button" class="btn btn-primary active">Standart Tower</button>
				   <button id="frezzetower" type="button" class="btn btn-default active">Frezze Tower</button>
				   <button id="createmob" type="button" class="btn btn-default active">Send Mob</button>
			   </div>
			</h4>
        </div>
        
        
        <div class="row">
        
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
	        
	        <div class="col-md-4" id="PlayerProperties">
	        	<h3><span class="label label-default">Player: """),_display_(Seq[Any](/*64.58*/controller/*64.68*/.getPlayerName())),format.raw/*64.84*/("""</span></h3>
	        	<ul>
	        		<li>
	        			<span>Life: """),_display_(Seq[Any](/*67.26*/controller/*67.36*/.getPlayerMoney())),format.raw/*67.53*/("""</span>
	        		</li>
	        		<li>
	        			<span>Money: """),_display_(Seq[Any](/*70.27*/controller/*70.37*/.getPlayerLife())),format.raw/*70.53*/("""</span>
	        		</li>
	        	</ul>
	        </div>
	        
	    </div>
        
        
        <h6><span class="row" id="message">"""),_display_(Seq[Any](/*78.45*/message)),format.raw/*78.52*/("""</span></h6>
        <div class="row" id="result"></div>
        
    </div>
""")))})))}
    }
    
    def render(message:String,controller:de.htwg.towerdefence.controller.IGameController): play.api.templates.HtmlFormat.Appendable = apply(message,controller)
    
    def f:((String,de.htwg.towerdefence.controller.IGameController) => play.api.templates.HtmlFormat.Appendable) = (message,controller) => apply(message,controller)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 26 14:50:07 CET 2014
                    SOURCE: E:/Martin/Studium/Play/projects/TowerDefence-play/app/views/index2.scala.html
                    HASH: ba98bc307e3af8652e500a1632fcfacd0239d8e1
                    MATRIX: 823->1|994->78|1031->81|1064->106|1103->108|1170->140|1184->146|1251->192|1327->233|1341->239|1395->272|1575->416|1652->477|1692->479|1760->511|1834->569|1874->571|1926->587|2060->711|2101->713|2184->760|2209->763|2247->765|2275->771|2314->774|2339->777|2377->779|2405->785|2445->807|2458->812|2497->813|2550->830|2601->872|2641->874|2718->915|2743->918|2781->920|2809->926|2848->929|2873->932|2911->934|2939->940|2974->957|2987->962|3026->963|3064->965|3113->1005|3153->1007|3228->1046|3253->1049|3291->1051|3319->1057|3358->1060|3383->1063|3421->1065|3449->1071|3484->1088|3497->1093|3536->1094|3607->1129|3632->1132|3670->1134|3698->1140|3737->1143|3762->1146|3800->1148|3828->1154|3881->1171|3929->1187|3976->1202|4039->1233|5142->2300|5161->2310|5199->2326|5304->2395|5323->2405|5362->2422|5465->2489|5484->2499|5522->2515|5699->2656|5728->2663
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|51->23|51->23|51->23|52->24|53->25|54->26|56->28|92->64|92->64|92->64|95->67|95->67|95->67|98->70|98->70|98->70|106->78|106->78
                    -- GENERATED --
                */
            