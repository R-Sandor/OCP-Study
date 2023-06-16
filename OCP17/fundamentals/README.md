# Text Blocks 

## Incidental White Space VS Essential 
In Java17 the texts blocks essential white spaces is considered from the left most position of the closing """" characters of the block. 

## New Line - (Trailing Carriage Return)
Remember that a new line is automatically included if the textblock does not end on the same line for example 
```
  String txtBlock = """
    No New Line Here!"""

  String newLnTxtBlock = """
    A newline at the end. 
  """
