package com.anjin.jetpack;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> liveDataA;
    private MutableLiveData<Integer> liveDataB;

    private int aBack;
    private int bBack;

    public MutableLiveData<Integer> getLiveDataA() {
        if (liveDataA == null) {
            liveDataA = new MutableLiveData<>();
            liveDataA.postValue(0);
        }
        return liveDataA;
    }

    public MutableLiveData<Integer> getLiveDataB() {
        if (liveDataB == null) {
            liveDataB = new MutableLiveData<>();
            liveDataB.postValue(0);
        }
        return liveDataB;
    }

    public void addAScore(int score) {
        aBack = liveDataA.getValue();
        bBack = liveDataB.getValue();
        liveDataA.postValue(aBack + score);
    }

    public void addBScore(int score) {
        aBack = liveDataA.getValue();
        bBack = liveDataB.getValue();
        liveDataB.postValue(bBack + score);
    }

    public void reset() {
        aBack = liveDataA.getValue();
        bBack = liveDataB.getValue();
        liveDataA.postValue(0);
        liveDataB.postValue(0);
    }

    public void undo() {
        liveDataA.postValue(aBack);
        liveDataB.postValue(bBack);
    }
}
