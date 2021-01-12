class Str{
    public static void main(String args[]){
        String me="MANASA";
        System.out.println(me);
        //char[] Madhuri={'Manasa','Aswini'};
        char[] Madhuri={'A','S','W','I','N','I'};
        String Ashwini=new String(Madhuri);
        System.out.println(Ashwini+"\t\t"+me);
        //adding two strings
        String Mads=me.concat(Ashwini);
        System.out.println(Mads);

        //string length method
        System.out.println("Size after adding is:"+Mads.length());

        //CharAt() and IndexOf() methods for finding corresponding character and index
        String Madh="ASWINI";
        System.out.println("At position 4:"+Madh.charAt(4));
        System.out.println("Index of char W:"+Madh.indexOf('W'));    
        //CompareTo Method
        //for comparing two strings
        //The result will have the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.
        System.out.println("Comparing with aswini"+Madh.compareTo("aswini"));       
        System.out.println("Comparing without case(Capital) using IgnoreCase"+Madh.compareToIgnoreCase("aswini"));    
        //contain Method
        // Returns true if and only if this string contains the specified sequence of char values.
        System.out.println("Checks if it contains 'win':"+Madh.contains("WIN"));
        //endswith method-- Returns true if the character sequence represented by the argument is a suffix of the character sequence represented by this object.
        System.out.println("Checks if it end with :"+Madh.endsWith("WINI"));
        //replaceall and replace first methods
        String Ma="Mans";
        System.out.println("Replace ns with as:"+Ma.replace("ns","as"));
        //Lower case
        //System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        //Upper case
        //System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
    }
}