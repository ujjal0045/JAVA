package String;

public class shortestPath {
  public static void findShortestPAth(String s){
    int x=0,y=0;
    for(int i=0;i<s.length();i++){
      char dir = s.charAt(i);
      if(dir == 'W'){
        x -=1;
      } else if(dir == 'E'){
        x += 1;
      } else if(dir == 'N'){
        y++;
      } else if(dir == 'S'){
        y--;
      }
    }
    int x2 = x*x;
    int y2= y*y;
    System.out.println( (float) Math.sqrt(x2+y2)); 
  }
  public static void main(String[] args) {
    String s = "WNEENESENNN";
    findShortestPAth(s);
  }
}
