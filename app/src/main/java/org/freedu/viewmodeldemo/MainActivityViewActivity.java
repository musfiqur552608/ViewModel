package org.freedu.viewmodeldemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewActivity extends ViewModel {
    private MutableLiveData<Integer> counterLiveData = new MutableLiveData<>();
    private int counter = 0;

    public MutableLiveData<Integer> getInitialCounter(){
        counterLiveData.setValue(counter);
        return counterLiveData;
    }
    public void getCounter(){
        counter++;
        counterLiveData.setValue(counter);
    }
}
