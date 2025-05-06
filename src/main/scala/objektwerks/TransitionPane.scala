package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.layout.{Priority, VBox}

final class TransitionPane extends VBox:
  padding = Insets(6)

  children = List( Label("TODO") )
  VBox.setVgrow(this, Priority.Always)