abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

val v = Var("x")

val op = BinOp("+", Number(1), v)

v.name
op.left

op.right == Var("x")
op.copy(operator = "-")

def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e)) => e // double negation
  case BinOp("+", e, Number(0)) => e // adding zero
  case BinOp("*", e, Number(1)) => e // Multiplying by one
  case UnOp("abs" , e @ UnOp("abs", _)) => e // Double abs deletion
  case BinOp("+", x, y) if x ==y => BinOp("*", x, Number(2)) //add same number make doubled
  case _ => expr
}

simplifyTop(UnOp("-", UnOp("-", Var("x"))))

def deepMatch(expr:Expr) = expr match {
  case BinOp("+", e, Number(0)) => println("a deep match")
  case _ =>
}

def tupleDemo(expr: Any) =
  expr match {
    case (a, b, c)  =>  println("matched "+ a + b + c)
    case _ =>
  }

tupleDemo(("a", 3, "-tuple"))

def generalSize(x:Any) = x match {
  case s: String => s.length
  case m: Map[_,_] => m.size
  case _ => -1
}

def describe(e: Expr): String = (e: @unchecked) match {
  case Number(_) => "a number"
  case Var(_)    => "a variable"
}

val exp = new BinOp("*", Number(5), Number(1))
val BinOp(oper, left, right) = exp

val withDefault: Option[Int] => Int = {
  case Some(x) => x
  case None => 0
}

