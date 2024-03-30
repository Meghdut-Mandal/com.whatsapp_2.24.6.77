package com.whatsapp.search;

import X.AnonymousClass00C;
import X.AnonymousClass0C4;
import X.AnonymousClass0CZ;
import X.C02760Bu;
import X.C162477oe;
import X.C36321k7;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public final class SearchGridLayoutManager extends GridLayoutManager {
    public final AnonymousClass0CZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchGridLayoutManager(Context context, AnonymousClass0CZ r4) {
        super(6);
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r4;
        this.A02 = new C162477oe(context, this, 5);
    }

    public void A1D(C02760Bu r2, AnonymousClass0C4 r3) {
        C36321k7.A0w(r2, r3);
        try {
            super.A1D(r2, r3);
        } catch (IndexOutOfBoundsException e) {
            Log.e((Throwable) e);
        }
    }
}
