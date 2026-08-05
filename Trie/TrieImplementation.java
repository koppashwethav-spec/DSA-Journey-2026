package Trie;

class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

public class TrieImplementation {

    TrieNode root;

    public TrieImplementation() {
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

    public static void main(String[] args) {

        TrieImplementation trie = new TrieImplementation();

        trie.insert("apple");
        trie.insert("app");

        System.out.println("Words Inserted Successfully");
    }
}