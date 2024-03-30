package com.whatsapp.gallery.views;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass099;
import X.AnonymousClass4VV;
import X.C05250Oz;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C38201o2;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class GalleryPartialPermissionBanner extends C38201o2 {
    public AnonymousClass00S A00;
    public WaTextView A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final AnonymousClass00S getManageActionCallback() {
        return this.A00;
    }

    public final void setManageActionCallback(AnonymousClass00S r1) {
        this.A00 = r1;
    }

    public /* synthetic */ GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        Object systemService = context.getSystemService("layout_inflater");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.f9nameremoved, this, true);
        this.A01 = C36341k9.A0Q(inflate, R.id.bannerTextView);
        String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
        String A0x = C36351kA.A0x(context, A0m, new Object[1], 0, R.string.f12nameremoved);
        int A0C = AnonymousClass099.A0C(A0x, A0m, 0, false);
        AnonymousClass4VV r3 = new AnonymousClass4VV(inflate, this, 2);
        SpannableString A0O = C36441kJ.A0O(A0x);
        A0O.setSpan(r3, A0C, C36441kJ.A09(A0m, A0C), 33);
        WaTextView waTextView = this.A01;
        waTextView.setText(A0O);
        waTextView.setContentDescription(A0O.toString());
        C36391kE.A1J(waTextView);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
