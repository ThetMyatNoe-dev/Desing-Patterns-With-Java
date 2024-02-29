package com.designpatterns.Factory;

import java.util.List;

public interface Gesture {

    public List<? extends  Gesture> winsForm();

    public List<? extends Gesture> tiesTo();

    public List<? extends Gesture> loseTo();
}
