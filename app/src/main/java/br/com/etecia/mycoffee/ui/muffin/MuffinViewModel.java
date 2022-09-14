package br.com.etecia.mycoffee.ui.muffin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MuffinViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MuffinViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}