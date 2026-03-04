package demo

case class Dog(name:String):
  def bark=s"warf!"
  def sayName=s"my name is $name"

@main def moreThings()=
  println("Welcome to my program")
  val d = Dog("charlie")
  d.bark