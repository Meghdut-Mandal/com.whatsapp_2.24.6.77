package com.whatsapp.media;

import X.AnonymousClass00C;
import X.AnonymousClass0C4;
import X.C02760Bu;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public final class GridLayoutManagerNonPredictiveAnimations extends GridLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridLayoutManagerNonPredictiveAnimations(Context context, int i) {
        super(i);
        AnonymousClass00C.A0D(context, 1);
    }

    public boolean A1Q() {
        return false;
    }

    public void A1D(C02760Bu r3, AnonymousClass0C4 r4) {
        try {
            super.A1D(r3, r4);
        } catch (IndexOutOfBoundsException e) {
            Log.e("GridLayoutManagerNonPredictiveAnimations/onLayoutChildren/exception", e);
        }
    }
}
