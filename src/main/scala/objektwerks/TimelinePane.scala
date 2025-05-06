package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.layout.{Priority, VBox}

final class TimelinePane extends VBox:
  padding = Insets(6)

  children = List()
  VBox.setVgrow(this, Priority.Always)