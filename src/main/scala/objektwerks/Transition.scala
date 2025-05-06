package objektwerks

import scalafx.animation.{FadeTransition, FillTransition, Interpolator, Timeline}
import scalafx.scene.Node
import scalafx.scene.paint.Color
import scalafx.scene.shape.Shape
import scalafx.util.Duration

object Transition:
  def fade(node: Node): Node =
    val transition = FadeTransition(Duration.apply(5000), node)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    node

  def fill(shape: Shape): Shape =
    val transition = FillTransition(Duration.apply(5000), shape)
    transition.setFromValue(Color.Red)
    transition.setToValue(Color.Green)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape