package ru.job4j.array;

public class EndWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length-1-index] != post[post.length-1-index]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] words = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] posts = new char[] {'l', 'o'};
        boolean rsl = endsWith(words, posts);
        System.out.println(rsl);
       }
    }
