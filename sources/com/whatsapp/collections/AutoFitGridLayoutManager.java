package com.whatsapp.collections;

import X.AnonymousClass00C;
import X.AnonymousClass0C4;
import X.C02760Bu;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class AutoFitGridLayoutManager extends GridLayoutManager {
    public int A00;
    public boolean A01 = true;
    public final Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoFitGridLayoutManager(Context context, int i) {
        super(1);
        AnonymousClass00C.A0D(context, 1);
        this.A02 = context;
        this.A00 = i;
        if (i > 0 && i != i) {
            this.A00 = i;
            this.A01 = true;
        }
    }

    public void A0o(RecyclerView recyclerView) {
        this.A01 = true;
    }

    public void A1D(C02760Bu r6, AnonymousClass0C4 r7) {
        int i;
        int i2;
        int A0Q;
        int A0N;
        if (this.A01 && (i = this.A00) > 0 && (i2 = this.A03) > 0 && r7 != null && !r7.A09) {
            if (this.A00 == 1) {
                A0Q = i2 - A0P();
                A0N = A0O();
            } else {
                A0Q = this.A00 - A0Q();
                A0N = A0N();
            }
            A1o(Math.max(1, (A0Q - A0N) / i));
            this.A01 = false;
        }
        super.A1D(r6, r7);
    }
}
