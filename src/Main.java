import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String> coreBranch = new HashSet<>();
        coreBranch.add("MECHANICAL");
        coreBranch.add("CIVIL");
        coreBranch.add("ELECTRICAL");

        Set<String> nonCoreBranch = new HashSet<>();
        nonCoreBranch.add("ELECTRONICS AND TELECOM");
        nonCoreBranch.add("COMPUTER SCIENCE");
        nonCoreBranch.add("INSTRUMENTATION");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your branch name:");
        String chubby = scan.next().toUpperCase();

        if (coreBranch.contains(chubby))
        {
            System.out.println(chubby + " is a core branch");
            if (chubby.equals("MECHANICAL"))
            {
                //Set<String> subjects = new HashSet<>();
                Set<String> subjects = branchSubjects(chubby);
                System.out.println("You will study the subjects: "+ subjects);
            }
        }
        else if (nonCoreBranch.contains(chubby))
        {
            System.out.println(chubby + " is a non-core branch");
        }
        else
        {
            System.out.println("Given input is invalid");
        }
        scan.close();
    }

    private static Set<String> branchSubjects(String chubby)
    {
        Set<String> outSubjects = new HashSet<>();
        Set<String> mechSubjects = new HashSet<>();
        mechSubjects.add("Gear");
        mechSubjects.add("Welding");

        if (chubby.equals("MECHANICAL"))
        {
            outSubjects = mechSubjects;
        }
        return outSubjects;
    }
}