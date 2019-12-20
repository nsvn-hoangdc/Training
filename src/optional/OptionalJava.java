package optional;
import java.util.Optional;

public class OptionalJava {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
        
        String[] words = new String[10];   
        words[5] = "";
        if (words[5].isEmpty()) {
        	System.out.println(1);
        } else {
        	System.out.println(2);
        }
//        String word = words[5].toLowerCase();   
//        System.out.print(word); 

        Integer int1 = new Integer(1);
        Integer int2 = null;
//        System.out.println(int1 + int2);
        
        Optional<Integer> opt1 = Optional.of(int1);
        Optional<Integer> opt2 = Optional.ofNullable(int2);
        Optional<Integer> opt3 = Optional.empty();
        Integer int11 = opt1.orElse(new Integer(2));
        System.out.println(opt2.get());
	}
}