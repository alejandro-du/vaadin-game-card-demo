package com.example;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Alejandro Duarte
 */
@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents-lite.js")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        GameCard card = new GameCard("♠", "k");

        VerticalLayout layout = new VerticalLayout(card);
        setContent(layout);
    }

}
