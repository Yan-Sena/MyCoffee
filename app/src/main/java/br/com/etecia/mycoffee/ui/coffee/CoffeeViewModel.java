package br.com.etecia.mycoffee.ui.coffee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CoffeeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CoffeeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}