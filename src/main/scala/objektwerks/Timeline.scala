package objektwerks

import scalafx.animation.{KeyFrame, KeyValue, Timeline}
import scalafx.scene.shape.Shape
import scalafx.util.Duration

/**
  * See: https://dev.java/learn/javafx-animations/
  */
object Timeline:
  def timeline(shape: Shape): Shape =
    val translate = KeyValue(shape.translateXProperty(), 10)
    val frames = KeyFrame(Duration(millis = 5000), values = Set(translate))
    val timeline = Timeline( List(frames) )
    timeline.setCycleCount(Timeline.Indefinite)
    timeline.play()