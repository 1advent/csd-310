/**
 * jwelch_module_6
 */
public class jwelch_module_6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int row;
        int start;
        int column = 1;
        int spaces = 32;
        String space= "";
        String s = "";
        for (row = 1; row <= 7; ++row ) {
            column = row;
            s = "";
            start = 1;
            for (column = row; column >=2; --column){
                start = start *2;
            }
            while (start >= 1) {
                s = s + " " + start;
                start = (start)/2;
                if (start == 0) {
                    break;
                }
                s = " " + start + s;
            }
            int len = s.length()/2;
            spaces = (16 - len);
            while (spaces >= 0) {
                space = space + " ";
                spaces = spaces - 1;
            }
            s= space + s + space;
            if (len > 8){
                s = s.substring(0, s.length()-1);
            }
            space = "";
            System.out.println(s + "@");
        }
    }
}