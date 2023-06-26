# Methods 

## Method selection 
- Java ensures backward comptablility by applying the role as follows: 
|Rule|Example of what will be choosen for glide(1,2) | 
|Exact Match by type | String glide(int i, int j) | 
|Larger primitive type | String glide(long i, long j) | 
|Autoboxed Type | String glide(Integer i, Integer j) | 
|Varargs | String glide(int... nums) |

The reason for this is that autoboxing and varargs did not exist in Java 5.0.
