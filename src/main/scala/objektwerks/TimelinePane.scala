package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Node
import scalafx.scene.control.Label
import scalafx.scene.layout.{Pane, Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

import Timeline.*

final class TimelinePane extends VBox:
  padding = Insets(6)

  val timeLineLabel = Label("Time Line:")
  val timeLinePane: Pane = new Pane: // won't compile without type declaration!!!
    children = List( timeline( Circle(10, 10, 10, Color.Red) ) )

    val controls = List[(Label, Node)](
      timeLineLabel -> timeLinePane
    )
    val controlGrid = ControlGrid(controls)

  children = List( Label("TODO") )
  VBox.setVgrow(this, Priority.Always)