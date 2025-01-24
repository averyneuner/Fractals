<h1>Fractals</h1>
This visualization was created for the Advanced Topics in Computer Science: Object-Oriented Programming class. The goal of this project was to demonstrate the applications of recursion by creating a creative recursive fractal to show how mathematics and computer science can be used to create art. 

<h2>How It's Made</h2>
<b>Used: Java, Processing 3, IntelliJ IDEA </b> <br> <br> 

This project uses two recursive functions to display concentric circles that are increasing exponentially in size. The first, drawPattern, creates circles. Each new circle created will create four new circles on the edges of it that are double the size of the original circle. This is what makes the image a fractal. It is repeated instances of the same shape. The second, drawLayer, allows the pattern to be redrawn. <br>
When handling user input, I created a different color scheme for each key on the user's keyboard and, for each recursion of the pattern, the color will shift slightly. This creates a riot of color in addition to the fractal pattern. This choice was made for one reason: it was fun. Personally, I find integrating humanities disciplines like art into computer science extremely important and exciting. I also find it incredibly important, when teaching computer science, to give students a reason to be excited about the subject. 

<h2>Lessons Learned</h2>
This project was vital to my understanding of recursion. Using two different recursive functions, one that branches in its recursive and another that does not, allowed me to understand the different uses of recursion. It also taught me, mostly through my negligence, that my code must have comments and be organized to be clear. Having lots of similar pieces of code without using generic functions makes code much less readable and harder to interface with. It also taught me about generating images and graphics. 
