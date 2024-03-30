package com.whatsapp.ui.media;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C05250Oz;
import X.C21060yb;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C37881nM;
import X.C47942gR;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.GridView;
import com.whatsapp.R;
import java.util.ArrayList;

public final class MediaCardGrid extends C47942gR {
    public GridView A00;
    public C37881nM A01;
    public ArrayList A02;
    public boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public int getThumbnailPixelSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C21060yb.A01(getContext()).getDefaultDisplay().getMetrics(displayMetrics);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2;
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            i = i2;
        }
        return ((i - dimensionPixelSize) - dimensionPixelSize2) / 3;
    }

    public void A03() {
        super.A03();
        C36331k8.A0y(this.A00);
    }

    public void A04() {
        super.A04();
        C36361kB.A14(this.A00);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        View A0E = C36401kF.A0E((ViewStub) C36361kB.A0G(this, R.id.media_card_grid_stub), R.layout.f9nameremoved);
        AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type android.widget.GridView");
        this.A00 = (GridView) A0E;
    }

    public String getError() {
        return super.getError();
    }

    public void setError(String str) {
        super.setError(str);
        C36331k8.A0y(this.A00);
    }

    public /* synthetic */ MediaCardGrid(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A02 = AnonymousClass001.A0I();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
