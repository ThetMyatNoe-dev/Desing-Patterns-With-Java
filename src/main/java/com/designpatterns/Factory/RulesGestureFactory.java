package com.designpatterns.Factory;

// Any type 'T' used in 'RuleGestureFactory' must be a subtype of 'Gesture'.

import java.util.List;
import java.util.Map;

public interface RulesGestureFactory <T extends  Gesture> {

    Map<T, List<T>> winMapping();

    Map<T, List<T>> tieMapping();

    Map<T,List<T>> loseMapping();


}
