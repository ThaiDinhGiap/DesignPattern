package com.java.giaptd.BehavioralPattern.Strategy;

import java.util.List;

public class MergeSort implements SortStrategy {
    @Override
    public void sortPriceAsc(ItemType[] itemArray) {
        sortAsc(itemArray, 0, itemArray.length - 1);
    }

    public void sortAsc(ItemType[] itemArray, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sortAsc(itemArray, l, mid);
            sortAsc(itemArray, mid + 1, r);

            mergeAsc(itemArray, l, mid, r);
        }
    }

    public void mergeAsc(ItemType arr[], int l, int m, int r){
        int lengthL = m - l + 1;
        int lengthR = r - m;

        ItemType[] arrL = new ItemType[lengthL];
        ItemType[] arrR = new ItemType[lengthR];

        for (int i = 0; i < lengthL; i++) {
            arrL[i] = arr[l + i];
        }

        for (int i = 0; i < lengthR; i++) {
            arrR[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < lengthL && j < lengthR) {
            if (arrL[i].getItemPrice() <= arrR[j].getItemPrice()) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < lengthL) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < lengthR) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }

    @Override
    public void sortPriceDesc(ItemType[] itemArray) {
        sortDesc(itemArray, 0, itemArray.length - 1);
    }

    public void sortDesc(ItemType[] itemArray, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sortDesc(itemArray, l, mid);
            sortDesc(itemArray, mid + 1, r);

            mergeDesc(itemArray, l, mid, r);
        }
    }

    public void mergeDesc(ItemType arr[], int l, int m, int r){
        int lengthL = m - l + 1;
        int lengthR = r - m;

        ItemType[] arrL = new ItemType[lengthL];
        ItemType[] arrR = new ItemType[lengthR];

        for (int i = 0; i < lengthL; i++) {
            arrL[i] = arr[l + i];
        }

        for (int i = 0; i < lengthR; i++) {
            arrR[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < lengthL && j < lengthR) {
            if (arrL[i].getItemPrice() >= arrR[j].getItemPrice()) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < lengthL) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < lengthR) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}
