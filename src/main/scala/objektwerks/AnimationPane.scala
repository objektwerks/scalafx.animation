package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.layout.{Priority, VBox}

final class AnimationPane extends VBox:
  padding = Insets(6)

  children = List( TransitionPane() )
  VBox.setVgrow(this, Priority.Always)