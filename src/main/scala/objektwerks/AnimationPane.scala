package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.control.{Label, Tab}
import scalafx.scene.layout.VBox

final class AnimationPane extends VBox:
  padding = Insets(3)

  val transitionTab = new Tab:
    text = "Transition"
    closable = false
    content = Label("TODO")