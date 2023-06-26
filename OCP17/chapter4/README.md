# Core APIs 

## Math functions and conversion between primitives
It is important to consider the input of a function to get the correct output type. 
Examine the following: 

| Type     | Size |
| -------- | ---- |
|  byte    |  8   | 
|  short   |  16  | 
|  int     |  32  | 
|  long    |  64  | 
|  float   |  32  | 
|  double  |  64  |

The reason this is important for example 
`int seven = Math.round(6.6) // does not compile`
The reason is that Java returns a long. Which makes sense if one considers that the function of Math.round() could take a very large value, one the size of (2-2^-52)*2^1023, which means that a rounded version that number would at least need to be as large to accomodate the mantisa. In that case the full 64 bits (8 bytes) of a long is enough. 

## Lossy Conversions 
- short to byte or char
- char to byte or short
- int to byte, short or char
- long to byte, short, char or int
- float to byte, short, char, int or long
- double to byte, short, char, int, long or float.

## When working numeric primitives always pay close attention to the return types, especially when working with functionalProgramming where types are inferred by the data.
