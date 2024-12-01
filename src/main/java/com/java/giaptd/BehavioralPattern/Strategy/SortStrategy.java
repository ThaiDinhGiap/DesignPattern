package com.java.giaptd.BehavioralPattern.Strategy;

import java.util.List;

public interface SortStrategy {
    void sortPriceAsc(ItemType[] itemTypes);
    void sortPriceDesc(ItemType[] itemTypes);
}
