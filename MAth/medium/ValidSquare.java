package MAth.medium;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        int d1 = distance(p1,p2);
        int d2 = distance(p1,p3);
        int d3 = distance(p1,p4);
        if(d1 * d2 * d3 == 0) return false;

        //if d1 == d2 then d3 == 2 * d1 and also (p2,p4)

        if(d1 == d2 && d3 == 2*d1 && distance(p3,p2) == 2 *distance(p3,p4)) return true;
        if(d2 == d3 && d1 == 2*d2 && distance(p4,p3) == 2 *distance(p4,p2)) return true;
        if(d1 == d3 && d2 == 2*d1 && distance(p4,p2) == 2 *distance(p2,p3)) return true;

return false;

    }
    public int distance(int[] p1,int p2[]) {
       return(int) (Math.pow(p1[0] -p2[0],2) + Math.pow(p1[1] -p2[1],2));
    }



}