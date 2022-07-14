public class Grading {
    public String gradeCalculator(String m, int credit){
        try {
            double m2 = Double.parseDouble(m);
            int mark = (int) Math.ceil(m2);
            if (credit == 3) {
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
                } else {
                    return "Invalid Input";
                }
            } else if (credit == 4) {
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
                } else {
                    return "Invalid Input";
                }
            }
        }catch(Exception e) {
            return "Invalid Input";
        }
        return "Invalid Input";
    }
}
