```groovy
def myMethod(List<String> list) {
  //Solution 1: Using an iterator
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    println "Item: $item"
    if (item == "someValue") {
      iterator.remove() 
    }
  }
  println list //Print the modified List
  
  //Solution 2: Create a new list
  List<String> newList = list.findAll { it != "someValue" }
  println newList // Print the new list
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
```