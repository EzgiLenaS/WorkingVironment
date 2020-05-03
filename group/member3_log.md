# CS102 ~ Personal Log page ~
****
## Yiğit Ekin 
****

On this page I will keep a weekly record of what I have done for the CS102 group project. This page will be submitted together with the rest of the repository, in partial fulfillment of the CS102 course requirements.

### ~ date ~ 25 and 26 April 2020
- This weekend I looked for how to browse a website using java
- I come up with multiple solutions and tried all of it give them some test to see if they actually work 
- most of them didn't even open html pages so there were actually 2 possible solutions to actually browsing through java
- but considering that we will need some input from the user and as user are prone to give unsatisfactory input I am thinking of using Desktop class (will ask the group next week)
- I also looked at how can we open external programs by using java (the easiest one for the user would be Runtime class in my opinion)
- However, runtime class works perfectly for windows but does not even work for mac (maybe it is due to my unsatisfactory input?? look into it deeply next week)
- Looked for how to use Serializable interface efficiently so that our program can actually store links or directories
- Worked on a Serializable and actually made it work by implementing a quick Person class ( Looking forward to actually using it for my project)
- need a file to use Serializable? (if not how? look into it) if we need, how to store it in our application ( maybe bring the java code and the file in a folder and use .zip?)

### ~ date ~ 2 May 2020
- I researched and learned that the extension of the external applicaitons are .app which means that it is not a runnable file it is a normal file with different setup
- Because of that fact i figrued that we can open external app on macos with Java.awt.Desktop.open( String path) method tried it with all of the app on my computer and it opened it all( even pdf and docx files) 
- so now i am planning on knowing whether the same idea can be implemented on windows for the ones that without the extension .exe 
- (If it can be used while inputting the maybe use a substring check to see whether it is an executable path? or ask the user for it? ask to the team)
****