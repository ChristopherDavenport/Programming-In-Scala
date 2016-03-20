trait Philosophical {
  def philosophize(): Unit ={
    println("I consume memory, therefore I am!")
  }
}
class Animal
trait HasLegs
class Frog extends Animal with  Philosophical with HasLegs {
  override def toString = "green"
}

val frog = new Frog
frog.philosophize()

val phil: Philosophical = frog

class Point(val x: Int, val y: Int)

trait Rectangular{
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x}
}

val queue = new BasicIntQueue
queue.put(10)
queue.put(20)

queue.get()
queue.get()

trait Doubling extends IntQueue {
  abstract override def put(x: Int){ super.put(2 * x)}
}

class MyQueue extends BasicIntQueue with Doubling
val queue2 = new MyQueue
queue2.put(10)
queue2.get()

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x+1)}
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = {
    if (x >= 0) super.put(x)
  }
}