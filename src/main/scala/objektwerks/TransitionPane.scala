package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.layout.{Pane, Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

import Transition.*

final class TransitionPane extends VBox:
  padding = Insets(6)

  val fadePane = new Pane:
    children = List( fade( Circle(100, 100, 20, Color.Green) ) )

  children = List(fadePane)
  VBox.setVgrow(this, Priority.Always)