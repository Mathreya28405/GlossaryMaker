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
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getWord().equals(word)) {
                return i;
            }
            int x = this.getWord().compareTo(word);
            if (x < 0) {
                this.add((this.indexOf())
            }
        }

    }


    public void addWord(String word, int num) {
        foundOrInserted(word);
    }
}
