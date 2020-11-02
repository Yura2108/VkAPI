package com.petersamokhin.bots.sdk.objects;

import org.json.JSONObject;

import java.util.*;

public class Keyboard {

    boolean oneTime = false;
    boolean inLine;
    Map<Integer, List<Button>> buttons = new TreeMap<>();


    public Keyboard() {

    }

    public Keyboard setOneTime(boolean one_time) {
        this.oneTime = one_time;
        return this;
    }

    public Keyboard setInLine(boolean inLine) {
        this.inLine = inLine;
        return this;
    }

    public Keyboard addButtons(int line, Button bnt) {
        List<Button> bnts;
        if (buttons.containsKey(line)) {
            bnts = buttons.get(line);
        } else {
            bnts = new ArrayList<>();
            buttons.put(line, bnts);
        }
        bnts.add(bnt);
        return this;
    }

    public JSONObject getJson() {
        JSONObject me = new JSONObject();
        if (!this.inLine) {
            me.put("one_time", this.oneTime);
        }
        if (buttons.size() > 0) {
            List<List<JSONObject>> bnts = new ArrayList<>();
            buttons.forEach((key, val) -> {
                List l = Arrays.asList(val.stream().map(Button::getJSON).toArray());
                bnts.add(l);
            });
            me.put("buttons", bnts);
        }else{
            List<List<JSONObject>> bnts2 = new ArrayList<>();
            me.put("buttons", bnts2);
        }
        me.put("inline", this.inLine);
        return me;
    }

    public Map<Integer, List<Button>> getButtons() {
        return buttons;
    }
}
