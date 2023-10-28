package org.freedu.viewmodeldemo;

import androidx.lifecycle.ViewModel;

public class MainActivityViewActivity extends ViewModel {
    private int counter = 0;

    public int getInitialCounter(){
        return counter;
    }
    public int getCounter(){
        counter++;
        return counter;
    }
}
