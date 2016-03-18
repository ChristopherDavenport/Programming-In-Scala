package ProgrammingInScala.Chapter08

import scala.io.Source
/**
  * Created by davenpcm on 3/18/2016.
  */
object LongLines {
  def processFile(filename: String, width: Int): Unit ={

    def processLine(line: String){
      if (line.length > width)
        println(filename + ": " +  line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
