class Rational(n: Int, d:Int){
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numerator: Int = n/g
  val denominator: Int = d/g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational = new Rational(
    numerator * that.denominator + that.numerator * denominator,
    denominator * that.denominator
  )

  def + (i: Int): Rational = new Rational(
    numerator + i * denominator, denominator
  )

  def - (that: Rational): Rational = new Rational(
    numerator * that.denominator - that.numerator * denominator,
    denominator * that.denominator
  )

  def - (i: Int ): Rational = new Rational(
    numerator - i * denominator, denominator
  )

  def * (that: Rational): Rational = new Rational(
    numerator * that.numerator , denominator * that.denominator
  )

  def * (i: Int): Rational = new Rational(
    numerator * i, denominator
  )

  def / (that: Rational): Rational = new Rational(
    numerator * that.denominator, denominator * that.numerator
  )

  def / (i: Int): Rational = new Rational(
    numerator, denominator * i
  )

  def lessThan(that: Rational) =
    this.numerator * that.denominator < that.numerator * this.denominator

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  override def toString = numerator + "/" + denominator

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  implicit def toInt: Int =
    if(numerator % denominator == 0 ) numerator
    else throw new ClassCastException
}


val oneHalf = new Rational(1,2)
val twoThirds = new Rational(2,3)

oneHalf + twoThirds

implicit def intToRational (x: Int): Rational = new Rational(x)

val one = oneHalf + oneHalf

9 * twoThirds
8 + oneHalf
(8 + one).toInt

