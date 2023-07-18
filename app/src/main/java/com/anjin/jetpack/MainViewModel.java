package com.anjin.jetpack;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<Integer> numberLivedata;

    public MutableLiveData<Integer> getNumberLivedata() {
        if (numberLivedata == null) {
            numberLivedata = new MutableLiveData<>();
            numberLivedata.postValue(0);
        }
        return numberLivedata;
    }

    public void addNumber() {
        numberLivedata.postValue(numberLivedata.getValue() + 1);
    }
}
