package net.javaci;

public class TimeComplexities {
    public static void main(String[] args) {
        String[][] timeComplexities = {
                {"\t\t\t", "addLast |\t", "get |\t", "contains |\t", "addFirst |\t", "shiftRight |\t",
                        "enLargeArray |\t","Size |\t", "isEmpty |\t", "Clean |\t", "Removelast |\t", "Removefirst |\t"},
                {"Array List  |", "\tO(1) |\t", "O(1)|\t", "O(n)     |\t", "O(n)     |\t", "O(n)       |\t", "O(1)     " +
                        "    |\t", "O(1) |\t", "O(1)    |\t", "O(1)  |\t", "O(1)       |\t", "O(n)        |\t"},
                {"Linked List |", "\tO(n) |\t", "O(n)|\t", "O(n)     |\t", "O(1)     |\t", "           |\t", "         " +
                        "    |\t", "O(n) |\t", "O(1)    |\t", "O(1)? |\t", "O(n)       |\t", "O(1)        |\t"},
        };

        for (int i = 0; i < timeComplexities.length; i++) {  // Satır sayısı
            for (int j = 0; j < timeComplexities[i].length; j++) {  // Sütun sayısı
                System.out.print(timeComplexities[i][j] + " ");
            }
            System.out.println();
        }
    }
}
