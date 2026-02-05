package com.example.dacuycuy_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class PerfumeViewModel extends ViewModel {

    private MutableLiveData<List<PerfumeItem>> perfumeList;

    public LiveData<List<PerfumeItem>> getPerfumes() {
        if (perfumeList == null) {
            perfumeList = new MutableLiveData<>();
            loadPerfumes();
        }
        return perfumeList;
    }

    private void loadPerfumes() {
        List<PerfumeItem> list = new ArrayList<>();

        list.add(new PerfumeItem(R.drawable.perfume1, "Dior Sauvage", "₱6,500"));
        list.add(new PerfumeItem(R.drawable.perfume2, "Chanel No.5", "₱7,200"));
        list.add(new PerfumeItem(R.drawable.perfume3, "Versace Eros", "₱5,800"));
        list.add(new PerfumeItem(R.drawable.perfume4, "Bleu de Chanel", "₱6,900"));

        // NEW PERFUMES
        list.add(new PerfumeItem(R.drawable.perfume5, "YSL Y", "₱6,300"));
        list.add(new PerfumeItem(R.drawable.perfume6, "Armani Code", "₱6,700"));
        list.add(new PerfumeItem(R.drawable.perfume7, "Bvlgari Man", "₱5,900"));
        list.add(new PerfumeItem(R.drawable.perfume8, "Hugo Boss Bottled", "₱5,500"));

        perfumeList.setValue(list);
    }

}
