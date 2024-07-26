package org.example.LeetCode;

public class GoalParserInterpretation1678 {

    public static void main(String[] args) {
        System.out.println(interpretSolutionTwo("G()()()()(al)"));
    }

    public static String interpret(String command) {
        command = command.replace("()", "о");
        command = command.replace("(", "");
        command = command.replace(")", "");
        return command;

    }

    public static String interpretSolutionTwo(String command) {
        StringBuilder stringBuilder = new StringBuilder();


        for (int item = 0; item < command.toCharArray().length - 1; item++) {

            if (command.charAt(item) == 'G') {
                stringBuilder.append('G');
            }


            if (command.charAt(item) == '(') {
                if (command.charAt(item + 1) == ')') {
                    stringBuilder.append('o');
                    item++;
                } else {
                    stringBuilder.append("al");
                    item += 3;
                }
            }


        }

        return stringBuilder.toString();
    }
}
