public class HelloApp {
    public static void main(String[] args) {
        
        String name;
        
        if(args.length == 0) {
            name = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for(String arg : args) {
                nameBuilder.append(arg);
                nameBuilder.append(", ");  // ← always append comma after each name
            }
            // Remove the last ", " using substring
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        
        System.out.println("Hello, " + name + "!");
    }
}