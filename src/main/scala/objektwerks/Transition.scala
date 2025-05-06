package objektwerks

import scalafx.animation.{FadeTransition, Interpolator}
import scalafx.scene.shape.Circle
import scalafx.util.Duration

object Transition:
  def fade(circle: Circle): Unit =
    val transition = FadeTransition(Duration.apply(5000), circle)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.play()