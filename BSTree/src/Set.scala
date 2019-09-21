

class Set(f:Int =>Boolean) {
  def contains(elem: Int): Boolean ={
  //returns true if elem is in the set and false for all other numbers
    f(elem)
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
  
class singletonSet(elem:Int) extends Set(x => x == elem){
//This class creates a set with only one element, elem.
//Now that we have a set with only one element, we can do better with
//forall. Implement this functions to work for ALL integers,
//not just those in the range -1000 to 1000
  override def forall(p:Int=>Boolean):Boolean = p(elem)
}