package com.example;

import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

/**
 * @author Alejandro Duarte
 */
@JavaScript("GameCard.js")
@HtmlImport("vaadin://bower_components/game-card/game-card.html")
public class GameCard extends AbstractJavaScriptComponent {

    public GameCard(String symbol, String rank) {
        callFunction("setCard", symbol, rank);
    }

}
