package com.example;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

/**
 * @author Alejandro Duarte
 */
@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents-lite.js")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout layout = new HorizontalLayout(
                new GameCard("♠", "j"),
                new GameCard("♥", "q"),
                new GameCard("♣", "k"));

        layout.setMargin(true);
        setContent(layout);
    }

}
