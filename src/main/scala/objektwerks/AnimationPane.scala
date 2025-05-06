package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.{Label, Tab, TabPane}
import scalafx.scene.layout.{Priority, VBox}

final class AnimationPane extends VBox:
  padding = Insets(3)

  val transitionTab = new Tab:
    text = "Transition"
    closable = false
    content = Label("TODO")

  val timelineTab = new Tab:
    text = "Timeline"
    closable = false
    content = Label("TODO")

  val tabPane = new TabPane:
    tabs = List(transitionTab, timelineTab)

  children = List(tabPane)
  VBox.setVgrow(this, Priority.Always)