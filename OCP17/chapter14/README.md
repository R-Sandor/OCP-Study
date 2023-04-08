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

