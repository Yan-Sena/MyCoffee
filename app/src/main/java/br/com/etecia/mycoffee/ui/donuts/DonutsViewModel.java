package br.com.etecia.mycoffee.ui.donuts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DonutsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DonutsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}