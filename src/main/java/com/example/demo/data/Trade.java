package com.example.demo.data;

public class Trade {
    private double tradeRequest;
    private double sellProfit;
    private double sellLoss;
    private double buyProfit;
    private double buyLoss;

    public double getTradeRequest() {
        return tradeRequest;
    }

    public void setTradeRequest(double tradeRequest) {
        this.tradeRequest = tradeRequest;
    }

    public double getSellProfit() {
        return sellProfit;
    }

    public void setSellProfit(double sellProfit) {
        this.sellProfit = sellProfit;
    }

    public double getSellLoss() {
        return sellLoss;
    }

    public void setSellLoss(double sellLoss) {
        this.sellLoss = sellLoss;
    }

    public double getBuyProfit() {
        return buyProfit;
    }

    public void setBuyProfit(double buyProfit) {
        this.buyProfit = buyProfit;
    }

    public double getBuyLoss() {
        return buyLoss;
    }

    public void setBuyLoss(double buyLoss) {
        this.buyLoss = buyLoss;
    }
}

