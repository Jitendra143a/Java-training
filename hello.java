// class hello {
//     public static void main(String[] args) {
//         String str = "hello world";
//         String newstr1 = "";  // variable to store result

//         for (char ch : str.toCharArray()) {
//             if (newstr1.indexOf(ch) == -1) {  // check if character not already added
//                 newstr1 += ch;
//             }
//         }

//         System.out.println(newstr1);

import javax.print.DocFlavor.STRING;

class Hello {
    public static void main(String[] args) {
        String str ="java is powerful language";
       String a[]=str.split("");
       String largest ="";
       for(String val:a){ 
        if(val.length()>largest.length()){
            largest=val;
        }
       }System.out.println(largest);
}
}