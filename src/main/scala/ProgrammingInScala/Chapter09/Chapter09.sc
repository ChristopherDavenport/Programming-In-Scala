import java.io.{File, PrintWriter}

import scala.io._

def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ * 2, 5)

def withPrintWriter(file: File, op: PrintWriter => Unit): Unit ={
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}
//withPrintWriter(new File("date.txt"), writer => writer.println(new java.util.Date))

