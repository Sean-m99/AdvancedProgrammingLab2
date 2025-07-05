# AdvancedProgrammingLab2
Lab 2 completed as part of my advanced programming module


Exercise 2a: Inheritance
Define a class Pet that extends the abstract class AbstractPet provided on Moodle. Are there any methods that need definition in Pet? Why or why not?

Exercise 2b: Constructors
Define 2 constructors of Pet: one with 2 parameters, and another with just one (to initiliase the name and set age to 0).

Exercise 2c: Getters and Setters
Define getter and setter methods for the 2 instance variables of the Pet class. Carry out some error checking in the setters, such that the name is a non-empty string and that the age is a positive integer.

Exercise 2d: Method Overriding
Create a toString method in Pet to print name + " is my pet and is aged " + age. Which method is this overriding?
Note: The toString method in AbstractPet is itself overriding another. Which is it?

Exercise 2e: Inheritance II
Extend the Pet class in 2 new classes: Cat and Dog. Add suitable instance variables to hold breed and furColour in each. Further specialise each individually as such: cats have a favouriteSpot, while dogs have a favouriteToy.
Add a method giveTreat to the class Dog that prints name + " says thanks for the treat!". 

Exercise 2f: Method Overloading
In each of Cat and Dog, overload the toString method with one that takes an extra parameter and prints an additional sentence about the pet, such as <name> is a <breed> and enjoys playing with <favouriteToy> <extra-String> (edit according to each subclass). e.g. "Rex is a collie and enjoys playing with a tennis ball every day."

Exercise 2g: Testing
Build a class PetTest to test the different classes you defined. In it, create a Pet array to hold a number of objects of types Pet, Cat, and Dog. Instantiate the objects with suitable values. Now invoke toString on each of the elements of the array. Which of the different variants of the method get called? Why?
Pick one of the array elements that holds an instance of Dog. Invoke the method giveTreat on it (e.g. pets[2].giveTreat()). What happened? Why?
