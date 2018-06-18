void setup(){
  size (1100, 1100);
  
}
int x = 1;
int direction = 5;

void draw (){
  background(random(255), random(255),random(255));
  
  x = x+direction;
  ellipse(x, 550, 550, 550);
  fill (random(255), random(255),random(255));
  if (mousePressed){
    delay (500);
  }
  if (x > 1100){
    direction *= -1;
  }
  if (x < 0){
    direction *= -1;
  }
  
  
}