package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Node
import scalafx.scene.control.Label
import scalafx.scene.layout.{Pane, Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

import Transition.*

final class TransitionPane extends VBox:
  padding = Insets(6)

  val fadeLabel = Label("Fade:")
  val fadePane = new Pane:
    children = List( fade( Circle(10, 10, 10, Color.Red) ) )

  val fillLabel = Label("Fill:")
  val fillPane = new Pane:
    children = List( fill( Circle(10, 10, 10, Color.Red) ) )

  val translateLabel = Label("Translate:")
  val translatePane = new Pane:
    children = List( translate( Circle(10, 10, 10, Color.Red) ) )

  val pathLabel = Label("Path:")


  val controls = List[(Label, Node)](
    fadeLabel -> fadePane,
    fillLabel -> fillPane,
    translateLabel -> translatePane
  )
  val controlGrid = ControlGrid(controls)

  children = List(controlGrid)
  VBox.setVgrow(this, Priority.Always)