package homework2.Ilona;

public class Questions {

/* Task 5 - The following code creates one array and one string object. How many references to those objects exist after the code executes?
Is either object eligible for garbage collection?
...
1 String[] students = new String[10]; // String Object
2 String studentName = "Peter Parker";
3 students[0] = studentName;
4 studentName = null;

No object eligible for garbage collection as String Object is reachable. "students" is a reference to the String Object.
Even if the variable studentName = null, String Object is still referenced by studentName on line 3.

Task 6 - How does a program destroy an object that it creates?
An object can be removed during garbage collection (gc) - cleaning up memory, if there are no variables left that refer to this object (no more references to this object).
GC frees the memory when the objects are not reachable (Note: not removing objects from the codebase), objects are no longer in use by the program.
 */
}
