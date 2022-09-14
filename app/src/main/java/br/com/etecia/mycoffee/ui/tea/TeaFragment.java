package br.com.etecia.mycoffee.ui.tea;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import br.com.etecia.mycoffee.databinding.FragmentTeaBinding;

public class TeaFragment extends Fragment {

    private FragmentTeaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        br.com.etecia.mycoffee.ui.tea.DonutsViewModel donutsViewModel =
                new ViewModelProvider(this).get(br.com.etecia.mycoffee.ui.tea.DonutsViewModel.class);

        binding = FragmentTeaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        donutsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}