package org.ThompsonEmployeeDatabase;

public class CheckEmployeePassword {
    private static String checkPass;
    public static String[] checkSymbols = {"!","#", "$", "%", "&", "*"};


    public String getCheckPass() {
        return checkPass;
    }

    public void setCheckPass(String checkPass) {
        for (String i : checkSymbols) {
            if (checkPass.contains(i)) {
                this.checkPass = checkPass;
            } else {
                System.out.println("Password must contain \"!\",\"#\", \"$\", \"%\", \"&\", \"*\"");
            }
        }
    }
}
