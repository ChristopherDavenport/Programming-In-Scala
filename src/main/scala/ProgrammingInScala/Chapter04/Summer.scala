package ProgrammingInScala.Chapter04
import ChecksumAccumulator.calculate

/**
  * Created by davenpcm on 3/18/2016.
  */
object Summer {
  def main(args: Array[String]): Unit ={
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
