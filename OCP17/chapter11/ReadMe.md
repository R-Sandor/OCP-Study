# Note on Exceptions
A often forgotten piece about programmer added _finally_ is that if _finally_ throws an exception it will return that exception. This is also important to note that if finally returns a value, then the exception is not handled by the default JVM handler. This can be observed if one modifies Finally.java
