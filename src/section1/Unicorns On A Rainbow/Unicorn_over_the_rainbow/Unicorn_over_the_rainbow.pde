PImage rainbow;
PImage unicorn;
void setup() {
  size(1100, 1100);
  rainbow = loadImage("Rainbow.jpeg");
  rainbow.resize(1100, 1100);
  background(rainbow);
  unicorn = loadImage("unicorn.png");
}
void draw() {
  background(rainbow);
  image(unicorn, mouseX, mouseY);

}