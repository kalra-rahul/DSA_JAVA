public class ShortestPath {

   public static void main(String args[]){
        String route = "WNEENESENNN";

        int x=0; 
        int y=0;

        for (int i = 0; i < route.length(); i++) {
            char step = route.charAt(i);
            switch (step) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
                default:break;
            } 
        }

        int X2 = x*x, Y2 = y*y;
        double sp = Math.sqrt(X2+Y2);
        System.out.println(sp);
   }
    
}
