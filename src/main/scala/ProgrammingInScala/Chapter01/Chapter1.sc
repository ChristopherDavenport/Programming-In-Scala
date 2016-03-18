/**
  * Chapter 1
  * A Scalable Language
  **/

var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")

println(capital("France"))

def factorial(x: BigInt): BigInt =
  if (x==0) 1 else x * factorial(x-1)

def factorial2(x: BigInt): Option[BigInt] = x match {
  case a if a ==0 => Some(1)
  case b if b < 0 => None
  case c if c > 0 => Some( c * factorial2(c-1).get )
}

factorial(30)
factorial2(30)

class NameHolder(name:String){

  val nameHasUpperCase = name.exists(_.isUpper)
}

new NameHolder("yellow").nameHasUpperCase

//s.exists(p) || s.exists(q) == s.exists( x => p(x) || q(x))