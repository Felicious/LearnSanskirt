

object MainClass {
  /*
   * #1 Typical for loop
   * 
   * forLoop should have two parameter groups.
	 * The first parameter group should take in an integer value i, 
	 * a condition function that must yield true when applied to i 
	 * in order for the loop to continue, 
	 * and an increment function that when applied to i yields the 
	 * value of i on the next iteration of the loop.
   */
  def loopity(i:Int, cond: Int=>Boolean, incr: Int=>Int)
  (body: =>Unit): Unit = 
  {//To make it CBN, and SPACE => to type
      // if condition is true, then eval
      if(cond(i)) {
        body 
        // in the next iteration of loop, pass in i+1 (incre(i) incre
        // for you, and the two functions: cond and incr
        loopity(incr(i), cond, incr)(body)
      }
      // dont do anything if the if-statement isn't true
      /*
       * Most important shortcoming is that the condition and increment
       * functions are quite fixed; cond needs to be an Int to boolean
       * specifying when it stops while in C++ you could leave that 
       * parameter empty for a forever loop, for example. In C++ the 
       * for loop is more flexible than the Scala version, which is 
       * not generic and has to be Int=>Boolean
       */
      
      
  }
  
  def contains(set:Int=>Boolean, elem:Int):Boolean = set(elem)
  def singletonSet(elem:Int):Int=>Boolean = {
      def ret(x:Int):Boolean = {
        x==elem
      }
      ret
    }
  def union(s1:Int=>Boolean, s2:Int=>Boolean):Int=>Boolean = 
      x=>s1(x) || s2(x)
  def intersect(s1:Int=>Boolean, s2:Int=>Boolean):Int=>Boolean = 
      x=>contains(s1, x) && contains(s2, x)  //Using contains makes it easier to read, does the same thing.
  
  /*
   * #2 Building on Set Stuff
   * Part A
   * Define a function  which takes in a list of Ints and 
   * returns a set consisting of all Ints in the list.
   */
  def setList(xs: List[Int]):Int=>Boolean = {
    if(xs.isEmpty) x => false
    else union(singletonSet(xs.head), setList(xs.tail))
  }
  
  /*
   * Part B
   * Define the function  which takes in a set s and a predicate p, 
   * and returns a new set that consists of the elements of s that 
   * satisfy the predicate. You MUST use an anonymous function.
   */
  def filter(s: Int=>Boolean, p:Int=>Boolean): Int=>Boolean = {
    x=>contains(s, x) && contains(p, x)
  }
  
  /*
   * Part C
   * Define a function that tests whether a predicate p is true for 
   * all elements of a set s. In order to make it possible to 
   * implement this function, we will consider a predicate true for 
   * all integers if it is true for integers from -1000 to 1000
   */
  
  def forall(s:Int=>Boolean, p:Int=>Boolean):Boolean = {
    def check2000(x:Int): Boolean = {
      if (x > 1000) true
      else if (!contains(s, x)) check2000(x + 1)
      else if (contains(s, x) && contains(p, x)) check2000(x + 1)
      else false
    }
    check2000(-1000)
  }
  
  
  def main(args: Array[String]): Unit = {
    /*
    loopity(0, i=> i<10, i=> i+1) {
      println("Hello World")
    }
    */
    
    val l1 = setList(List(2, 4, 6, 8, 10))
    val l2 = setList(List(12, 14, 16, 17))
    
    println(forall(l1, x=> x % 2 == 0)) // true
    println(forall(l2, x=> x % 2 == 0)) //false 
    
  }
  
  
}