public class Grading {
    public String gradeCalculator(String m, int credit){
        double m2 = Double.parseDouble(m);
        int mark = (int) Math.ceil(m2);
        System.out.println("M : " + m + ", Mark : " + mark);
        if(credit == 3) {
            if (mark < 0) {
                System.out.println("Invalid Input");
            } else if (mark < 180) {
                return "F";
            } else if (mark < 210) {
                return "C";
            } else if (mark < 240) {
                return "B";
            } else if (mark <= 400) {
                return "A";
            }
        } else if(credit == 4){
            if (mark < 0) {
                System.out.println("Invalid Input");
            } else if (mark < 240) {
                return "F";
            } else if (mark < 280) {
                return "C";
            } else if (mark < 320) {
                return "B";
            } else if (mark <= 400) {
                return "A";
            }
        }
        return "Invalid Input";
    }
}
