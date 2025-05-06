package objektwerks

import scalafx.animation.{FadeTransition, Interpolator}
import scalafx.scene.Node
import scalafx.util.Duration

object Transition:
  def fade(node: Node): Unit =
    val transition = FadeTransition(Duration.apply(5000), node)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.play()