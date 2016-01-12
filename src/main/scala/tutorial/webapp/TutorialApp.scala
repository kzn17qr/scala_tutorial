package tutorial.webapp

import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object TutorialApp extends JSApp {
  def appendPar(targetNode: dom.Node, text: String): Unit= {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def main(): Unit = {
    appendPar(document.body, "Hello world.")
    appendPar(document.body, "This is one of test pages.")
  }
}
