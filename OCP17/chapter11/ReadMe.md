# Note on Exceptions
A often forgotten piece about programmer added _finally_ is that if _finally_ throws an exception it will return that exception. This is also important to note that if finally returns a value, then the exception is not handled by the default JVM handler. This can be observed if one modifies Finally.java

## Catch
Important that catch can only declare exceptions that need to be handled or declared. 
For example a function that does not throw a IOException can not catch one. 

## Closable vs AutoCloseable 
- Closeable can through an exception while autoclosable can not. 

## Exception Class 
- The exception class has multiple constructors, one that takes a string, a Throwable, and no-args.

