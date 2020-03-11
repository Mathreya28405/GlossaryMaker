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
        if (this.contains(word) == false) {
            GlossaryEntry e = new GlossaryEntry(word);

        }
    }

    public void addWord(String word, int num) {
        foundOrInserted(word);
    }
}
