com_example_GameCard = function () {
    var element = this.getElement();

    this.setCard = function (symbol, rank) {
        element.set("symbol", symbol);
        element.set("rank", rank);
    };
};

com_example_GameCard.tag = "game-card";
