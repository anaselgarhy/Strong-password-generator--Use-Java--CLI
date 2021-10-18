package helpers;

import java.util.ArrayList;
import java.util.Collection;

public class Functions {
    public static String getAllUpperCaseCharacters() {
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < 26; i++)
            chars.append((char)(i + 65));
        return chars.toString();
    }

    public static StringBuilder shuffle(String str) {
        StringBuilder shuffledString = new StringBuilder();
        ArrayList<Character> tempList = new ArrayList<>();
        for (char c : str.toCharArray())
            tempList.add(c);
        do {
            int randomIndex = (int) (Math.random() * tempList.size());
            shuffledString.append(tempList.get(randomIndex));
            tempList.remove(randomIndex);
        } while (tempList.size() > 0);
        return shuffledString;
    }
}
