```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (item == "someValue") {
      list.remove(item) // This is the problematic line
    }
  }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
```