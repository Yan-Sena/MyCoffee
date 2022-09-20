package br.com.etecia.mycoffee;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import br.com.etecia.mycoffee.ui.coffee.CoffeeFragment;
import br.com.etecia.mycoffee.ui.donuts.DonutsFragment;
import br.com.etecia.mycoffee.ui.muffin.MuffinFragment;
import br.com.etecia.mycoffee.ui.tea.TeaFragment;

public class CafeteriaAdapter extends FragmentStateAdapter {

    public CafeteriaAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new CoffeeFragment();
            case 1:
                return new DonutsFragment();
            case 2:
                return new MuffinFragment();
            default:
                return new TeaFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}