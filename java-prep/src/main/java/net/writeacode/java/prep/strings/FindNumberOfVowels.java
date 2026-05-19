package net.writeacode.java.prep.strings;

public class FindNumberOfVowels {
    public int getVowels(String str){
        long vowelsCounter = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        return (int) vowelsCounter;
    }
}
