package Moderate.spinWords.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpinWords {

    public String spinWords(String sentence) {
        Pattern pattern = Pattern.compile("(\\w{5,})");
        Matcher matcher = pattern.matcher(sentence);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, new StringBuilder(matcher.group(1)).reverse().toString());
        }
        matcher.appendTail(sb);

        return sb.toString();
    }

}