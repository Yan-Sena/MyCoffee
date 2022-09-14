package br.com.etecia.mycoffee.ui.donuts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import br.com.etecia.mycoffee.databinding.FragmentDonutsBinding;
import br.com.etecia.mycoffee.ui.tea.DonutsViewModel;

public class DonutsFragment extends Fragment {

    private FragmentDonutsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DonutsViewModel donutsViewModel =
                new ViewModelProvider(this).get(DonutsViewModel.class);

        binding = FragmentDonutsBinding.inflate(inflater, container, false);
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