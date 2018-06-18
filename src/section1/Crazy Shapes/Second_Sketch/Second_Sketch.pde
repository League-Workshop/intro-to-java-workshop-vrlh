void setup(){
  size(1100, 1100);
  background(#080808);
}
void draw (){
  background(random(255), random(255), random(255));
  ellipse(mouseX,mouseY,550,550);
  rect(mouseY,mouseX, 550,550);
  ellipse(550, 550, mouseX, mouseY);
  rect(mouseX, mouseX, mouseX, mouseX);
  ellipse(mouseY, mouseY, mouseY, mouseY);
rect(mouseY, mouseX, 550, 550);
  if (mousePressed){
    fill(random(255), random(255), random(255));
  }
  
  
}