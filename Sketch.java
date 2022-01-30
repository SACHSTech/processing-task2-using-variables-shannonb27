import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(width, height);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    strokeWeight(5);
    stroke(44, 176, 40);
    fill(44, 176, 26);
    rect(20, 300, 67, 200);
    
    fill(44, 200, 35);
    rect(10, 290, 87, 30);
    
    fill(255);
    stroke(254);
    ellipse(70, 100, 47, 30);
    ellipse(90, 90, 80, 100);
    
    
    //boo
     fill(240, 105, 87);
     stroke(240, 105, 95);
     triangle(100, 110, 115, 110, 105, 120);
    
      fill(0);
     stroke(0);
      ellipse(85, 90, 5, 10);
      ellipse(123, 90, 5, 10);
      
      line(75, 80, 95, 90);
      line(115, 90, 130, 80);
      
      
      
      
      //question block
      fill(206, 169, 0);
      stroke(206, 169, 0);
      square(300, 250, 40);
      
      fill(112, 53, 0);
      stroke(112, 53, 0);
      rect(290, 290, 80, 15);
      
      fill(255);
      textSize(53);
      text("?", 310, 285);
 }
  
  // define other methods down here.
}