package com.whatsapp.filter;

import X.AnonymousClass0C4;
import X.C162497og;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public void A1G(AnonymousClass0C4 r4, RecyclerView recyclerView, int i) {
        C162497og r0 = new C162497og(recyclerView.getContext(), this, 0);
        r0.A00 = i;
        A0g(r0);
    }

    public SmoothScrollLinearLayoutManager(int i) {
        super(i);
    }
}
