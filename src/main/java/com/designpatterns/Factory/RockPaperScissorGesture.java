package com.designpatterns.Factory;

import java.util.List;

public enum RockPaperScissorGesture implements Gesture, RulesGestureFactoryImpl{

    ROCK,
    PAPER,
    SCISSORS;

    @Override
    public List<RockPaperScissorGesture> winsForm() {
        return winMapping().get(this);
    }

    @Override
    public List<RockPaperScissorGesture> tiesTo() {
        return tieMapping().get(this);
    }

    @Override
    public List<RockPaperScissorGesture> loseTo() {
        return loseMapping().get(this);
    }
}
