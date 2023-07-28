# National Parks in Turkey

## Listing National Parks in Turkey with using Generic List
The names of the 48 National Parks in Turkey, the provinces they are located in, the dates they were declared as National Parks, and their surface areas (in hectares) are provided at the following links:

https://en.wikipedia.org/wiki/List_of_national_parks_of_Turkey <br>
:star:**(I used jsoup to taking informations from wikipedia using HTML elements so my program has designed working with jsoup-1.15.3.jar)**:star:

Write an efficient Java program to create National Park objects from this data and place them in the appropriate compound data structure.

**a)** Create a NationalPark class that contains the following fields (you can determine suitable data types/data structures):
NationalPark class (Park_Name, Province_Names, Declaration_Year, Area)
You can use a Generic List to store the names of the provinces where a National Park is located. Storing only the year of declaration for a National Park will be sufficient, but you can optionally store the date in the format day.month.year if desired.

**b)** Create a 2-element Generic List array. Each element of the array should contain a Generic list of National Park objects. Retrieve the data from one of the links above in order. First, create an object for the 1st National Park; then, if the area is less than 15,000 hectares, add the object to the list at index 0 of the array, otherwise add it to the list at index 1 of the array. Then, add the remaining National Park objects to the appropriate list based on the given criteria. 

**c)** Write a method to print all the information in each list of the array. Also, calculate and print the total area of each list.

## STACK and QUEUE
**a)** Update the code to create a stack of National Parks (composed of objects of the National Park class) or implement it from scratch. Add all National Parksto the stack (you can retrieve the data from files or from the lists you created, it's up to you). Remove all elements from the stack and print the National Park information to the screen.

**b)** Examine the queue program in LISTING 4.4 in Chapter 4 of the textbook (pages 138-140). Read the relevant sections. Repeat the process in 2a, but this time use a Queue data structure for the National Parks.

## PRIORITY QUEUE
Design and implement a Priority Queue (class) in C# or Java that allows O(1) time complexity for insertion (although deletion of the most prioritized element is slower) with elements sorted in ascending order. The priority queue should be implemented using a List data structure to store elements of the National Park class. Write all necessary methods for the PriorityQueue class (insert, delete, isEmpty, constructor) and their implementations. Test the class with the data from Question 1, sorting the National Parks by area in ascending order and printing them out one by one (from smallest to largest).
