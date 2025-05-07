package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout.VBox

final class View():
  val vbox = new VBox:
    spacing = 6
    padding = Insets(6)
    children = List( TransitionPane() )

  val scene = new Scene:
    root = vbox