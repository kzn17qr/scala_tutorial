package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>button clicked.</p>")
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }

  def main(): Unit = {
    jQuery(setupUI _)
    jQuery("body").append("<p>This is one of test pages.</p>")
  }
}
