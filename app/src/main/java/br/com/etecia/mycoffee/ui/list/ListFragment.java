package br.com.etecia.mycoffee.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import br.com.etecia.mycoffee.databinding.FragmentListBinding;

public class ListFragment extends Fragment {


    private FragmentListBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;






    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}