PImage catPic;
void setup(){
  size (1100, 1100);
  catPic = loadImage("cat.jpeg");
                catPic.resize(1100, 1100);
background(catPic);
}
void draw (){
  ellipse (624, 407, 80, 80);
  ellipse (443, 368, 80, 80);
  if(mousePressed){
println("Mouse’s x-position: " +
mouseX + "\n" + 
"Mouse’s y-position: " + 
mouseY + "\n");}
}