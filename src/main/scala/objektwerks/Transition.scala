package objektwerks

import scalafx.animation.{
  FadeTransition, FillTransition, Interpolator, PathTransition, PauseTransition, RotateTransition, ScaleTransition,
  SequentialTransition, StrokeTransition, Timeline, TranslateTransition
}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{LineTo, MoveTo, Path, Shape}
import scalafx.util.Duration

/**
  * See: https://dev.java/learn/javafx-animations/
  */
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

  def translate(shape: Shape): Shape =
    val transition = new TranslateTransition(Duration(millis = 5000), shape)
    transition.setToX(10)
    transition.setToY(10)
    transition.setInterpolator(Interpolator.LINEAR)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def path(shape: Shape): Shape =
    val path = new Path()
    path.getElements().add( MoveTo(10, 10) )
    path.getElements().add( LineTo(200, 20) )

    val transition = new PathTransition(Duration(millis = 5000), path, shape)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def rotate(shape: Shape): Shape =
    val transition = RotateTransition(Duration(millis = 5000), shape)
    transition.setFromAngle(0)
    transition.setToAngle(360)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def scale(shape: Shape): Shape =
    val transition = ScaleTransition(Duration(millis = 5000), shape)
    transition.setToX(0.1)
    transition.setToY(0.1)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def stroke(shape: Shape): Shape =
    val transition = new StrokeTransition(Duration(millis = 5000), shape)
    transition.setFromValue(Color.Red)
    transition.setToValue(Color.Blue)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def pause(shape: Shape): Shape =
    val smaller = ScaleTransition(Duration(1.5))
    smaller.setToX(0.25)
    smaller.setToY(0.25)
    smaller.setInterpolator(Interpolator.Linear)
    
    val larger = ScaleTransition(Duration(1.5))
    larger.setToX(1)
    larger.setToY(1)
    larger.setInterpolator(Interpolator.Linear)
    
    val transition = SequentialTransition(
            shape,
            smaller,
            PauseTransition(Duration(millis = 2000)),
            larger
          )
    transition.play()
    shape