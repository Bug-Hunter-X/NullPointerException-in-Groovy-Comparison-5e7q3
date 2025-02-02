```groovy
def myMethod(a, b) {
  // Solution 1: Using the Elvis operator
  def result = (a ?: 0) > (b ?: 0) ? a : b
  return result
  
  //Solution 2: Using safe navigation
  //return (a?.compareTo(b) ?: 0) > 0 ? a : b
}

println myMethod(5, 2)
println myMethod(2, 5)
println myMethod(null, 5)
println myMethod(5, null)
println myMethod(null,null) //Handles both nulls
```