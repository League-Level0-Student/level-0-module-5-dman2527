int x1 = 200;
 int x2 = 800;
void setup() {
 
  // set the size of your sketch
  size(1000,1000);



}
void draw() {
 background(#FFFFFF);
  for (int i = 0; i < 5; i++) {
noFill();
   ellipse(x1,250,i*100,i*100);
    noFill();
     ellipse(x2,250,i*100,i*100);

}
if(x1>1000){
 x1=0; 
}
if(x2<0){
 x2=1000; 
}
x1++;
 x2--;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

}
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
