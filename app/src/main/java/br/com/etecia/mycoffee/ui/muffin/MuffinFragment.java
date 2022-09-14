package br.com.etecia.mycoffee.ui.muffin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import br.com.etecia.mycoffee.databinding.FragmentMuffinBinding;
import br.com.etecia.mycoffee.databinding.FragmentMuffinBinding;

public class MuffinFragment extends Fragment {

    private FragmentMuffinBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MuffinViewModel muffinViewModel =
                new ViewModelProvider(this).get(MuffinViewModel.class);

        binding = FragmentMuffinBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        muffinViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}