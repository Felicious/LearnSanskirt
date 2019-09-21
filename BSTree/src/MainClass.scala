

object MainClass {
  def findlast(xs:List[Int], x:Int):Int = {
    /*
     * (5 points) Write a function def findlast(xs:List[Int], x:Int):Int that returns
     * the index of the last time the element x appears in the list xs. 
     * Return -1 if the element does not appear in the list. 
     * For this function, you MUST use pattern matching, and you may NOT use any
     * built-in list functions. I will give 2 points extra credit if you do it without
     * a helper function.
     */
    
    val len = xs.length
    //index = len - length(tail)
    
    def inner(xs:List[Int], i:Int):Int = {
    xs match{
      case Nil => i
      case y::ys => {
        if(y == x) inner(ys, len-ys.length)
        else inner(ys, i)
        }
      }
    }
    inner(xs, -1)
  }
}