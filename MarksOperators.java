/*

 class MarksOperators{
    public static void main(String args[]){
        int marks;

        // Generating marks randomly between 20% to 95%
        marks = 20 + (int)(Math.ceil(Math.random() * 75));
        String grd;
        grd = (marks>=40)?String.valueOf("Pass"):String.valueOf("Fail");
        System.out.println("The mark generated is: "+marks+" and the grade is "+grd);
    }
}

 */


 class MarksOperators{
    public static void main(String args[]){
    int marks;
    
    // Generating marks randomly between 20% to 95%
    marks = 20 + (int)(Math.ceil(Math.random() * 95));
    String grd;
    grd = (marks>=40)?String.valueOf("Pass"):String.valueOf("Fail");
    System.out.println("The mark generated is: "+marks+"and the grade is"+grd);
    }
    }
    
