G2B - CS102 Group Project - WorkingVironment

## Project Description
This project is designed for user to create shortcuts 
and open many external programs on one's desktop or 
browse many webpages at the same time with one click. 

## Instructions for oppening project sourcecode
- First JDK 8 or higher should be installed already.
- Go to WorkingVironment.workingNvironment.GUI Hierarchy.workingvironment directory 
and open the MainScreen.drjava with Drjava.(Compiler version must be 1.8.242).
- One can also laucnh the WorkingVironment.jar file.


## Project Status
- Core functionalaty of the program works perfect, 
a user can open files and links simultaneously without any problem.
- Application's status is saved via java Serializable interface 
in a textfile with application's current root.
- User can't see the name changes of a box immediatly.
One needs to close and reopen the application to see the name changes.

## What remains to be done
- Updating the box name could have been improved.
- Location of the user data file could be better(User being able to choose the root would have been nice.).


## List of the group members' contributions
- Eyüp Berkan Sivrikaya
    I wrote the BoxView hiearachy(LaunchButton, ManageButton, label, LaunchManageBox)
    in that part i used the javaFX 8 classes and extended them according to our needs.
    and worked on the problem for transfering Box objects into UI.
    I also helped Saitcan and Osman in MainScreen and MainScreenPanel classes.
- Yiğit Ekin
    I primarily worked on the files AppOpener.java, Shortcut.java, WebPageOpener.java. 
    I used JDK 8  
- Osman Semih Tiryaki
    Actually, Me and Berkan and Saitcan worked together on discord most of the time and supported each other for most of problems.
    As an individual, I wrote the MainScreenPanel class whose main mission is to initialize Main screen of our project.
    I researched and used javafx 8 components such as VBox, Hbox, ListView and its related classes such as ObservableList and ObservableArrayList to search and edit items of a ListView.
    However ListView is only the GUI part of the job and I had to update the profile whenever ListView has been shifted.
    So I added setBoxes method to profile class provided by Yiğit and Arda in order to update profiles boxes property.
    With this method I updated the boxes list of profile everytime something added or deleted via using ArrayList.
    Finally, I added everybutton and HBox into an VBox to start the scene. 			 
- Ezgi Lena Sönmez
    Mert and me worked on ManageScreenPanel.java. 
    I used the JavaFX 8 and worked on compiling the Box.java with our class to add links into one Box (for each Boxes).
    I used Tableview, Vbox and Hboxes to show buttons textfields and names of links.
    We could do a hierarchy for buttons, textfields, and methods for our class.
- Mert Tereci
    Me and Ezgi Lena worked on ManageScreenPanel.java, the manage screen GUI for the inside of a box. I learned to use Vbox class and developed understanding of using Java Api for a 
    spesific goal. I used JDK 8 and Netbeans compiler.
- Saitcan Başkol
    I did main screen, other main screen panels and other gui like fileorlink main screen panel i helped my groupmates Berkan and Osman.
    In the main screen, we are inputting and outputting files with serializable class, we are adding elements to our view, we are setting our scenes and their attributes.
    I used getter classes and static scene and windows variables to reach them in a different class otherwise reaching them will be very hard.
    I used action listener to changing scenes( a mouse listener).
- Arda Eren
    I primarily worked on the files Box.java, Profile.java. 
    I used JDK 8  








