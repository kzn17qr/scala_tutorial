package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>button clicked.</p>")
  }

  def setupUI(): Unit = {
    jQuery("body").append("<p>Hello World</p>")
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
  }

  def main(): Unit = {
    jQuery(setupUI _)
  }
}
