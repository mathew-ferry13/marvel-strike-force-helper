package com.mferry.msf.config;

import com.mferry.msf.Character;

import java.util.Map;

public class RosterConfig {
    private Map<String, Character> characters;

    public Map<String, Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Map<String, Character> characters) {
        this.characters = characters;
    }
}
