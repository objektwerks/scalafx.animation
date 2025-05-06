package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.layout.{Pane, Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle

import Timeline.*

final class TimelinePane extends VBox:
  padding = Insets(6)

  val timeLineLabel = Label("Time Line:")
  val timeLinePane = new Pane:
    children = List( timeline( Circle(10, 10, 10, Color.Red) ) )

  children = List( Label("TODO") )
  VBox.setVgrow(this, Priority.Always)