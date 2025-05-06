package objektwerks

import scalafx.animation.{FadeTransition, FillTransition, Interpolator, Timeline}
import scalafx.scene.paint.Color
import scalafx.scene.shape.Shape
import scalafx.util.Duration

object Transition:
  def fade(shape: Shape): Shape =
    val transition = FadeTransition(Duration(millis = 5000), shape)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def fill(shape: Shape): Shape =
    val transition = FillTransition(Duration(millis = 5000), shape)
    transition.setFromValue(Color.Red)
    transition.setToValue(Color.Blue)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape