package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.{Tab, TabPane}
import scalafx.scene.layout.{Priority, VBox}

final class AnimationPane extends VBox:
  padding = Insets(6)

  val transitionTab = new Tab:
    text = "Transition"
    closable = false
    content = TransitionPane()

  val tabPane = new TabPane:
    tabs = List(transitionTab)

  children = List(tabPane)
  VBox.setVgrow(this, Priority.Always)