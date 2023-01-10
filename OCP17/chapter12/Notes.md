# Notes On Modules 

## Requires 
- Transitive requirements are only satisified with requires tranisitive. If a module requires a module that has it's own requires, then those dependencies must be met by the second module. 

## Module Path
- Modules on the module path can not interact or use modules on the class path. All requirements must be satisified in the module path. 
