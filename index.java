

int col1 = 100;

int col2 = col1 + 200;

int mov3 = 100;



void setup() {
	size(500, 500);
}


void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!



  background(255);
  stroke(0);
  fill(175);

mov3 = mov3 + 0.5;
println(mov3);

ellipse(col1,mov3,mov3,col1);
ellipse(col2,col1,col1,mov3);
ellipse(mov3,col2,mov3,col1);
ellipse(col2,col2,col1,mov3);
}