package scala.lectures.part1

object DarkSugar extends App{
 //  syntatix sugar #1 method with single param
  def singleArgMethod(idk : Int ) : String = s"$idk"

  val description = singleArgMethod {

    // writed code

    42
  }


  trait  Action {
    def  act(x: Int):  Int
  }

val anInstance : Action = new Action {
  override def act(x: Int): Int = x + 1
}


  val aFunkyInstance : Action = (x : Int) => x +1



}
