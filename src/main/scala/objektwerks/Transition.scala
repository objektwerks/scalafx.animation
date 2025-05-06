package objektwerks

import scalafx.animation.{FadeTransition, Interpolator, Timeline}
import scalafx.scene.Node
import scalafx.util.Duration

object Transition:
  def fade(node: Node): Node =
    val transition = FadeTransition(Duration.apply(5000), node)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.INDEFINITE)
    transition.play()
    node