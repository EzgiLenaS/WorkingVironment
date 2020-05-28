# CS102 ~ Personal Log page ~
****
## Yiğit Ekin
****

On this page I will keep a weekly record of what I have done for the CS102 group project. This page will be submitted together with the rest of the repository, in partial fulfillment of the CS102 course requirements.

### ~ date ~ week beginning with 3 February 2020
- this week I have talked with 2 possible groups and decided to join my current one

### ~ date ~ week beginning with 10 February 2020
- this week we have shared our numbers with each other and created a whatsapp group for the project
- in that group we had a chat about what should we do for this semesters project

### ~ date ~ week beginning with 17 February 2020
- looked at the possible projects stated by our instructor and thought even more by also considering the ones that our constructors shared with us
- saw the requirements stage document and had a chat about it with the group in our whatsapp group
- decided on the project topic 

### ~ date ~ week beginning with 24 February 2020
- did a presentation 
- presented the idea to the whole section gathered feedback from TA's, friends and instructor
- chat about the feedbacks with the group and decided on whether to implement or not 

### ~ date ~ week beginning with 2 March 2020
- made the requirements stage document as a group

### ~ date ~ week beginning with 9 March 2020
- saw the UI stage document and thought about how can we implement the UI
- looked at some popular websites and applications and noted down possible ideas to implement
- looked for colors that looks good so that we can implement it in the UI for an aesthetic look

### ~ date ~ week beginning with 16 March 2020
- thinking more about the UI 
- looked at what are the essentials for an UI ( scroll bar, pop up, ...)
- chat with the group about making the project global rather than local where people can share their boxes comment on them search for them and even give a grade out of 5

### ~ date ~ week beginning with 30 March 2020
- presented the UI

### ~ date ~ week beginning with 6 April 2020
- search how to open a file briefly by looking at stackoverflow.com and java apı

### ~ date ~ week beginning with 13 April 2020
- searched about the mvc pattern and how can it be implemented to our project ( mainly at model's with arraylist)

### ~ date ~ week beginning with 20 April 2020
- This weekend I looked for how to browse a website using java
- I come up with multiple solutions and tried all of it give them some test to see if they actually work (most of them didn't even open html pages so there were actually 2 possible solutions to actually browsing through java)
- but considering that we will need some input from the user and as user are prone to give unsatisfactory input I am thinking of using Desktop class (will ask the group next week)
- I also looked at how can we open external programs by using java again (the proper one would be Runtime class as it opens from the terminal directly)
- Found out that, runtime class works perfectly for windows but does not even work for mac ( maybe it is due to my improper input??)
- Looked for how to use Serializable interface efficiently so that our program can actually store links or directories
- Worked on a Serializable and actually made it work by implementing a quick Person class written by me with name and age properties ( Try with ArrayLists next week)
- Really need a file to use Serializable? will ask the group next week (if not how? look into it) if we need, how to store it in our executable application

### ~ date ~ week beginning with 27 April 2020
- I researched and learned that the extension of the external applicaitons are .app which means that it is not a runnable file it is a nonexecutable file with different setup
- Because of that fact i figured that we should open external app on macos with Java.awt.Desktop.open( String path) method tried it with all of the apps on my computer and it opened it all( even pdf and docx files and chess game) 
- so now i am planning on knowing whether the same idea can be implemented on windows for the ones that without the extension .exe 
- (If it can be used while inputting the maybe use a substring check to see whether it is an executable path? or ask the user for it? ask to the team)
- Today ( May 3) in our discussion with the members, i showed runtime classes and desktop classes
- Berkan found out that i can open .exe files with Desktop class as well and agreed on there is no need for runtime as it will make the user ask for their operating system which is not user friendly.
- This is actually a huge improvement in our project as it will make our application independant from the operating system( Mac, windows and etc.)
- Also in our discussion, we looked at java apı and found out that we can actually use finder menu so that user can choose applications by clicking them rather than copy pasting their path. ( Very user friendly compared to the previous solution in our mind) 
- Also, Arda and I are selected for writing the code for the classes that are apart from the gui and i checked whether open method is reliable in all platforms( it turned out to open all applicaitons in my computer and arda's) (My computer is macos while arda's is windows)
- browse method does not open ftp but opens all the types of webpages with https ( .htm, .html, .xml etc).
- For ftp, i learned that it is file transfer protocol (the user can download it and open it externally? or use java classes to access the data in it?)
- decided on asking the user to download ftp as i thougt looking at the url for ftp can be improper 
- Also, as a team, we conlcuded that database is unnecessary as our application is local and should function  even offline and decided to use Serializable interface to store data on a text file
- I tried the Serializable class with an ArrayList and succesfully unserialize it after turning object into null

### ~ date ~ week beginning with 4 May 2020
- This week we had discussed with Arda about sharing the work for coding the back-end of our project
- After that we finished the classes without any problem with all comments and such 
- created a package called workingNvrionment.backEnd (thinking that our friends will create workingNvironment.frontEnd and combine those two in a package. will discuss it)
- Tested the classes with arda and saw that it worked perfectly
- sent my code to arda so that he can test as well ( worked for 2 operating systems)
- uploaded my share to github
- as my work is done early, will talk the others, get a part of GUI and help them about the GUI coding
- also tried it with the UI part that Berkan shared with us and it also worked perfectly without any errors
- As our project is mainly about File class, i read chapter 7 in our coursebook and expanded my knowledge about the class and files in general
- Learned how to create a folder with file class ( will use it to store all the .txt files that comes form the serializable interface)
- Also tried whether Serializable creates a new file for all the changes, turned out it does not ( better for our project a new txr file for all changes could have been bad)
- Looked at how can we create application with multiple framed apps .
- i attended to a meeting with the friends and helped them thorugh the process of decision making about what to do in UI

### ~ date ~ week beginning with 11 May 2020
- did the draft of the detailed desing report and uploaded it
- help the group implement serializable for the project
- added the missing methods for the shortcut class ( setName( String) and getName() )

### ~ date ~ week beginning with 18 May 2020
- recorded a video for the project

### ~ date ~ week beginning with 25 May 2020
- wrote reflection2.txt and readme2.txt
- uploaded the final code