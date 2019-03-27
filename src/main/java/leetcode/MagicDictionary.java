package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MagicDictionary {

    private class Node {

        boolean isWord;
        Map<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new HashMap<>();
        }

        public Node() {
            this(false);
        }
    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        root = new Node();
    }

    /**
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
        if (dict.length <= 0)
            return;
        for (String word : dict) {
            insert(word);
        }
    }

    private void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null)
                cur.next.put(c, new Node());
            cur = cur.next.get(c);
        }
        cur.isWord = true;
    }

    /**
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        return search(0, root, word, true);
    }

    public boolean search(int index, Node node, String word, boolean flag) {

        if (index == word.length() - 1) {
            if (flag) {
                char c = word.charAt(index);
                if (node.next.keySet().size() != 0 && node.next.get(c) != null && node.next.get(c).isWord)
                    return true;
                if (node.next.get(c) == null || node.next.get(c).isWord)
                    return false;
                for (char temp : node.next.keySet()) {
                    if (node.next.get(temp).isWord)
                        return true;
                    return false;
                }
            } else {
                Node next = node.next.get(word.charAt(index));
                if (next == null)
                    return false;
                else
                    return next.isWord;
            }
        }
        char c = word.charAt(index);

        if (flag) {
            if (node.next.get(c) == null) {
                for (char temp : node.next.keySet()) {
                    if (search(index + 1, node.next.get(temp), word, false))
                        return true;
                    else
                        return false;
                }
            } else {
                if (search(index + 1, node.next.get(c), word, true))
                    return true;
                else {
                    for (char temp : node.next.keySet()) {
                        if (temp != c) {
                            if (search(index + 1, node.next.get(temp), word, false))
                                return true;
                            else
                                return false;
                        }
                    }
                }
            }
        } else {
            if (node.next.get(c) == null)
                return false;
            else
                return search(index + 1, node.next.get(c), word, false);
        }
        return false;
    }

    public static void main(String[] args) {
        MagicDictionary trie = new MagicDictionary();
        trie.buildDict(new String[]{"hello", "leetcode"});
        trie.buildDict(new String[]{});
        System.out.println(trie.search("leetcodd"));
    }

}
