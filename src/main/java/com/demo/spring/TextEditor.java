package com.demo.spring;

/**
 * Created by  on 2017/7/15.Wallace
 */
public class TextEditor {
    SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getText(){
        if(this.spellChecker.check()){
            return "check successfully";
        }
        return "check failed";
    }
}
