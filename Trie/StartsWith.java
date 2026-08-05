package Trie;

class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

public class StartsWith {

    TrieNode root;

    public StartsWith() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean startsWith(String prefix) {

        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return true;
    }

    public static void main(String[] args) {

        StartsWith trie = new StartsWith();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");

        System.out.println("app : " + trie.startsWith("app"));
        System.out.println("appl : " + trie.startsWith("appl"));
        System.out.println("bat : " + trie.startsWith("bat"));
    }
}