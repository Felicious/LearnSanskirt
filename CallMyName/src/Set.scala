
  
class Set(f:Int =>Boolean) {
  //the function f returns true for elements of the set and false for all other numbers
  
  def contains(elem: Int): Boolean ={
  //returns true if elem is in the set and false for all other numbers
    f(elem)
  }
    
  def \/ (t:Set):Set ={
  //Returns the union of this set and t.
    new Set((x:Int) => f(x) || t.contains(x))
  }
  
  def /\ (t:Set):Set = new Set((x:Int) => f(x) && t.contains(x))
  //Returns the intersection of this set and t
  
  def - (t:Set):Set = {
  //Returns the difference of this set and t
    new Set((x:Int) => f(x) && !t.contains(x))
  }
  
  def filter(p:Int=>Boolean):Set = {
  // Returns a new set that consists of the elements of s that satisfy the predicate.
    new Set((x:Int) => this.contains(x) && p(x))
  }
  
  def forall(p:Int=>Boolean):Boolean = {
  //Returns true if the predicate is true for all elements of this set, and false otherwise.
  // In order to make it possible to implement this function, we will consider a
  // predicate true for all integers if it is true for integers from -1000 to 1000.
    def check2000(x:Int): Boolean = {
      if (x > 1000) true
      else if (!this.contains(x)) check2000(x + 1)
      else if (this.contains(x) && p(x)) check2000(x + 1)
      else false
    }
    check2000(-1000)  
  }
}
