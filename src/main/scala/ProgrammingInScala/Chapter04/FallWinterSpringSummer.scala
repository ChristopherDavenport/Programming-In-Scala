package ProgrammingInScala.Chapter04
import ChecksumAccumulator.calculate

/**
  * Created by davenpcm on 3/18/2016.
  */
object FallWinterSpringSummer extends App {
 for (season <- List("fall", "winter", "spring", "summer"))
   println( season +": " + calculate(season))
}
