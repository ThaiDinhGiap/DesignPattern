package com.java.giaptd.BehavioralPattern.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();
}
