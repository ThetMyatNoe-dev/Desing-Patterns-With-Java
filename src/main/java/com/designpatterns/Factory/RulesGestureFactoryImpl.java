package com.designpatterns.Factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RulesGestureFactoryImpl extends RulesGestureFactory<RockPaperScissorGesture>{

    @Override
    default Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> winMapping(){

        Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> mapping= new HashMap<>();
        mapping.put(RockPaperScissorGesture.valueOf("ROCK"), Arrays.asList(RockPaperScissorGesture.valueOf("SCISSORS")));
        mapping.put(RockPaperScissorGesture.valueOf("PAPER"), Arrays.asList(RockPaperScissorGesture.valueOf("ROCK")));
        mapping.put(RockPaperScissorGesture.valueOf("SCISSORS"), Arrays.asList(RockPaperScissorGesture.valueOf("PAPER")));
        return mapping;
    }

    @Override
    default Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> tieMapping(){

        Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> mapping= new HashMap<>();
        mapping.put(RockPaperScissorGesture.valueOf("ROCK"), Arrays.asList(RockPaperScissorGesture.valueOf("ROCK")));
        mapping.put(RockPaperScissorGesture.valueOf("PAPER"), Arrays.asList(RockPaperScissorGesture.valueOf("PAPER")));
        mapping.put(RockPaperScissorGesture.valueOf("SCISSORS"), Arrays.asList(RockPaperScissorGesture.valueOf("SCISSORS")));
        return mapping;
    }

    @Override
    default Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> loseMapping(){

        Map<RockPaperScissorGesture, List<RockPaperScissorGesture>> mapping= new HashMap<>();
        mapping.put(RockPaperScissorGesture.valueOf("ROCK"), Arrays.asList(RockPaperScissorGesture.valueOf("PAPER")));
        mapping.put(RockPaperScissorGesture.valueOf("PAPER"), Arrays.asList(RockPaperScissorGesture.valueOf("SCISSORS")));
        mapping.put(RockPaperScissorGesture.valueOf("SCISSORS"), Arrays.asList(RockPaperScissorGesture.valueOf("ROCK")));
        return mapping;
    }
}
