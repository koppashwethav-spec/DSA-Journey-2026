package Trie;

class TrieNode 
{
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

public class SearchWord 
{
    TrieNode root;

    public SearchWord() 
    {
        root = new TrieNode();
    }

    public void insert(String word) 
    {
        TrieNode current = root;

        for (char ch : word.toCharArray())
        {
            int index = ch - 'a';

            if (current.children[index] == null)
            {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) 
    {

        TrieNode current = root;

        for (char ch : word.toCharArray()) 
        {
            int index = ch - 'a';

            if (current.children[index] == null) 
            {
                return false;
            }

            current = current.children[index];
        }

        return current.isEndOfWord;
    }

    public static void main(String[] args) 
    {

        SearchWord trie = new SearchWord();

        trie.insert("apple");
        trie.insert("app");

        System.out.println("apple : " + trie.search("apple"));
        System.out.println("app : " + trie.search("app"));
        System.out.println("bat : " + trie.search("bat"));
    }
}