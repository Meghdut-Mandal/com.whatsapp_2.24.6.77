package com.whatsapp.bonsai.discovery;

import X.AnonymousClass00C;
import X.AnonymousClass1R1;
import X.AnonymousClass3R7;
import X.C001700s;
import X.C36321k7;
import X.C36431kI;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public final class BonsaiDiscoveryRecyclerView extends RecyclerView {
    public final C001700s A00 = C36431kI.A0S();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiDiscoveryRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static /* synthetic */ void getSizeClass$app_product_bonsai_bonsai_non_modified$annotations() {
    }

    public final C001700s getSizeClass$app_product_bonsai_bonsai_non_modified() {
        return this.A00;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            AnonymousClass3R7.A01(this.A00, Integer.valueOf(AnonymousClass1R1.A02(getContext(), (float) i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiDiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C36321k7.A0x(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiDiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36321k7.A0x(context, attributeSet);
    }
}
