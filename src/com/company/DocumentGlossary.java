package com.company;
//Remember to uncomment in GlossaryMaker

import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {

    public DocumentGlossary() {
        super();
    }
    //Does x get put in the super()?
    public DocumentGlossary(int x) {
        super(x);
    }

    //what happen when list is empty
    private int foundOrInserted(String word) {
        GlossaryEntry e = new GlossaryEntry(word);
        if (this.isEmpty() == true) {
            this.add(e);
            return 0;
        }
        if (this.contains(e) == false) {
            int a = 0;
            while (a < this.size()) {
                int x = this.get(a).getWord().compareTo(word);
                if (x > 0) {
                    this.add(a, e);
                    return a;
                }
                a++;
            }
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getWord().equals(word)) {
                return i;
            }
        }
        return 0;

    }


    public void addWord(String word, int num) {
        foundOrInserted(word);
    }
}
