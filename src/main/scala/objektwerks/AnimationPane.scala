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

  val timelineTab = new Tab:
    text = "Timeline"
    closable = false
    content = TimelinePane()

  val tabPane = new TabPane:
    tabs = List(transitionTab, timelineTab)

  children = List(tabPane)
  VBox.setVgrow(this, Priority.Always)