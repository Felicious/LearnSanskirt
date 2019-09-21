

object MainClass {
  def main (args: Array[String]){
    /*
     * #1 Create one list by alternating the elements between two lists  
     * 
     */
    
    def alternating_List(xs:List[Int], ys:List[Int]):List[Int] = {
      //xs is shorter than ys
      if(xs.isEmpty) ys
      else if(ys.isEmpty) xs 
      else xs.head::ys.head::alternating_List(xs.tail, ys.tail)
    }
    
    def xs = List(1, 2, 3, 4)
    def ys = List(7, 8, 9, 10, 11, 12)
    
    println(alternating_List(xs, ys))
    
    /*
     * #2 Same as above except you apply f to the additions of the list
     */
    
    def apply_f(f:(Int,Int)=>Int, l1:List[Int], l2:List[Int]):List[Int] = {
      if(l1.isEmpty || l2.isEmpty) Nil
      else f(l1.head, l2.head)::apply_f(f, l1.tail, l2.tail)
    }
    
    def l1 = List(3, 8, 1, 5)
    def l2 = List(12, 6, 23, 1, 8, 4)
    
    //Can also be apply_f(x:Int, y:Int)=> x+y
    //println(apply_f((x, y)=> x*x+y, l1, l2))
    
    /*
     * #3 Prints out whatever is true in the function
     */
    def check_Cond(xs:List[Int], f:Int=>Boolean):List[Int] = {//Create a copy of xs with all copies of x removed
      if(xs.isEmpty) Nil
      //if f(x) evaluates to true, add
      else if(f(xs.head)) xs.head::check_Cond(xs.tail, f)//Construct a list to return - use cons
      //ignore if false
      else check_Cond(xs.tail, f)
    }
    
    /*
     * #4 Curried version of 3
     */
    def check_Cond_c(f:Int=>Boolean): List[Int] => List[Int] = 
      (xs) => {
         //Create a copy of xs with all copies of x removed
        if(xs.isEmpty) Nil
        //if f(x) evaluates to true, add
        else if(f(xs.head)) xs.head::check_Cond_c(f)(xs.tail)//Construct a list to return - use cons
        //ignore if false
        else check_Cond_c(f)(xs.tail)
      }
     
    def l3 = 1.to(16).toList
    
    println(check_Cond(l3, x => x % 2 == 0))
    println(check_Cond_c(x => x % 2 == 0)(l3))
    
    println(check_Cond(l3, x => x > 10))
    println(check_Cond_c(x => x > 10)(l3))
    
    
  }
}