# Notes on Chapter 14 IO/NIO

## Files.copy() 
### Shallow copy 
- Files and subdirectories are not copied. 
- Need to use a recursive copy algorithm to do such. 
- Copy takes paths very literal. 
  - For example copying ./foo.txt into /bar: 
    - This does not work File.copy(Paths.get("foo.txt"), Path.get("bar"));
  - Reason: 
    - bar is a directory that already exists. To put foo in bar directory it needs to be the following. 
      - File.copy(Paths.get("foo.txt"), Path.get("bar/foo.txt"));
## Files.mismatch() 
- Zero-indexed character based comparison. 
- If the second character is different then the return value 1.
- If the files are the same the return is -1.

## Serialization
- For an object to be serializable the class must implement Serializable (java.io.Serializable)
- instance members must implement serializable, marked transient, or null.
### _Note:_ This doesn't affect compilation. The third rule if violated will still compile.

## Performing a Parallel Reduction on a Collector
### Requirements to perform a parallel reduction: 
- The stream is parallel. 
- The parameter of the collect() operation has the Characteristics.UNORDERED
- Either the steam is unordered or the collector has the characteristic Characteristics.UNORDERED.

