public class ImmutableStrings {
    public static void main(String[] args){
        String s1="Jyothika";
        String s2="Reddy";
        s1.concat(s2);
        System.out.println(s1);
        String s3=s1.concat(s2);
        System.out.println(s3);
        if(s1==s3){
            System.out.println("s1 and s3 same references");
        }
        else{
            System.out.println("s1 and s3 have different references");
        }
    }
}
