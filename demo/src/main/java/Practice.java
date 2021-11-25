public class Practice {
    public static void main(String[] args) {
        String data = "[{R1:C1,R2:C2,R3:C3}]";
        System.out.println(data);
        data = data.replaceAll("\\[", "");
        data = data.replaceAll("]", "");
        data = data.replaceAll("\\{", "");
        data = data.replaceAll("}", "");

        System.out.println(data);
;
        String []d1 = data.split(",");  //R1:C1 R2:C2 :C3R3
        System.out.println(d1.length);
        String last = d1[d1.length - 1];    //0 1 2
        System.out.println(last);

        String []d2 = last.split(":");
        String last2 = d2[d2.length - 1];

        System.out.println(last2);
    }
}
