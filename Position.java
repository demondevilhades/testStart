package com.hades.strategy.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 仓位情况
 * 
 * @author hades
 *
 */
public class Position {
    private Date date;
    private BigDecimal cash;
    private BigDecimal langHands;
    private BigDecimal langPosition;
    private BigDecimal shortHands;
    private BigDecimal shortPosition;

    public Position(BigDecimal cash) {
        this.cash = cash;
        langHands = BigDecimal.ZERO;
        langPosition = BigDecimal.ZERO;
        shortHands = BigDecimal.ZERO;
        shortPosition = BigDecimal.ZERO;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getLangHands() {
        return langHands;
    }

    public void setLangHands(BigDecimal langHands) {
        this.langHands = langHands;
    }

    public BigDecimal getLangPosition() {
        return langPosition;
    }

    public void setLangPosition(BigDecimal langPosition) {
        this.langPosition = langPosition;
    }

    public BigDecimal getShortHands() {
        return shortHands;
    }

    public void setShortHands(BigDecimal shortHands) {
        this.shortHands = shortHands;
    }

    public BigDecimal getShortPosition() {
        return shortPosition;
    }

    public void setShortPosition(BigDecimal shortPosition) {
        this.shortPosition = shortPosition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Position [date=" + date + ", cash=" + cash + ", langHands=" + langHands + ", langPosition="
                        + langPosition + ", shortHands=" + shortHands + ", shortPosition=" + shortPosition + "]";
    }
}
