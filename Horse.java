//Create the Horse class here.
public class Horse{

String name;
double weight;
boolean tame;

public Horse(String name, double weight, boolean tame){
  this.name = name;
  this.weight = weight;
  this.tame = tame;
 } 
@Override
  public String toString(){
    return "Name: " + name + " Weight: " + weight + " Tame: " + tame;
  }
}