# House Baratheon Family Tree
Development of a JAVA application that reads, edits, searches and visualizes genealogical trees.
Requirements covered by the application:
1. Read a csv file and load the data into an appropriate data structure into the computer's main memory.
2. Sort people in lexicographical order and write one line for each in a text file (name and gender only).
3. Accept two names and show the relationship between them.
4. Save the data in DOT format so that they can be visualized by GraphViz and visualize it.
5. Create a text menu so that the user can select the above functions.

![CodeExecution](https://user-images.githubusercontent.com/91207835/203865756-57f4f678-3157-44c4-b5bd-5fcd9ca402d9.png)

![VisualizedFamilyTree](https://user-images.githubusercontent.com/91207835/203865387-3aae73aa-de03-4859-b42a-fccad05fcdea.jpg)

**Known Issues**

In the code of the Graph file.java a graph was created that shows that there is a relationship between the two nodes but it was not possible to show the kind of relationship they have, so the FindRelation.java class was created and used.
