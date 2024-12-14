## ConcurrentModificationException in Groovy List Iteration

This repository demonstrates a common error when removing elements from a List while iterating over it in Groovy. The provided code uses the `eachWithIndex` method, which implicitly creates an iterator. Modifying the list during iteration results in a `ConcurrentModificationException` or, worse, unpredictable behavior where elements are skipped.

The `bug.groovy` file contains the buggy code. The `bugSolution.groovy` file presents the corrected code using an iterator or a safer approach. 