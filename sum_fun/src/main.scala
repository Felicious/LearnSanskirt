

object main {
  def main(args: Array[String]){
    
    /* General version of sum_fun (#1)
     * Applies function f on ints from 1 to x, and 
     * combines those values with g (takes in 2 ints and returns int)
     * 
     * Resulting return type is Int
     * */ 
    def apply_combine(f:Int=>Int, x: Int, g:(Int, Int) =>Int):Int =
    {
      // base case
      if(x == 1) return f(1) //which is essentially 1
      
      // recursive case
      //g takes in f(x) (apply) and combines it with f(x-1), recursively
      else g(f(x), apply_combine(f, x-1, g))
     
    }
    
    def add(x:Int, y:Int) :Int = x+y
    def square(x:Int):Int = x*x
    def mult(x: Int, y: Int):Int = x*y
    
    println(apply_combine(square, 4, add))
    
    println(apply_combine(x=>x, 4, mult))
    
    /* #2 Curried version of #1
		 * Returns a function, which returns a function, then an int
     */
    def apply_combine2(f:Int=>Int):
      Int => (((Int, Int) => Int) => Int) = {
      (x: Int) => {
        (g: (Int, Int) => Int) => {
          if (x == 1) f(1)
          else g(f(x), apply_combine2(f)(x-1)(g))
        }
      }      
    }

    
    def apply_square = apply_combine2(x=>x*x)
    def apply_square_5 = apply_square(5)
    println(apply_combine2(x=>x*x)(5)((x, y)=>x*y))
    
    println(apply_combine2(square)(4)(add))

  }  
 
}