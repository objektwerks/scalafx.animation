package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.layout.{Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

import Transition.*

final class TransitionPane extends VBox:
  padding = Insets(6)

  val fadeLabel = Label("fade:")
  val fadePane = new VBox:
    children = List( fadeLabel, fade( Circle(50, 50, 10, Color.Red) ) )

  children = List(fadePane)
  VBox.setVgrow(this, Priority.Always)