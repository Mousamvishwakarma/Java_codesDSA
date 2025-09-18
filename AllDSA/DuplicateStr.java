
// given a string s to revemo adjesent duplicate
// String[] str={"greeksforgreeks"};
// output=gksforgks
package AllDSA;

import java.util.*;
public class DuplicateStr {

static String duplicatestringadjecentremove(String str){

char[] c = str.toCharArray();
StringBuilder sb =new StringBuilder();
for(int i=0;i<c.length;i++){
if(i<c.length-1 && c[i]==c[i+1]){
i++;
}else{
sb.append(c[i]);
}
}
return sb.toString();
}
public static void main(String[] args) {
String[] str={"geeksforgeeks"};
String result=duplicatestringadjecentremove(str[0]);
System.out.println("String after removing adjacent duplicates: "+result);
}
}