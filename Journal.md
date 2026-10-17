# Journal
Phase 1
I created a template for generating a vehicle report. Using a template method allows the base
class rather than the subclass to control when or in what order the methods are called.

Phase 2
When you generate a report using the template method it is actually the base abstract class driving the execution.
The subclasses only define the abstract methods. It does feel less intuitive to define and drive execution of methods 
from the base class. Usually you want the subclasses to have their own individual behavior, but when you want all
of them to do something in the same sequence the template method will ensure that they all execute in the same way.

Phase 3
The hook method only lets the subclass choose to execute the method or not execute it. The abstract method gives more
flexibility by letting you define the method in the subclass. Hook methods preserve the Open/Closed principle by
letting subclasses skip operations without changing anything in the parent's code.