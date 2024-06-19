public class StringMethodeDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String search = "              SamSung          ";

        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));

        System.out.println("search.trim() = " + search.trim());
        System.out.println("s.concat(search) = " + s.concat(search.trim()));
        System.out.println("s.replace('a', 'e') = " + s.replace('a', 'e'));
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));
        System.out.println("s.substring(5) = " + s.substring(5));
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
    }
}
