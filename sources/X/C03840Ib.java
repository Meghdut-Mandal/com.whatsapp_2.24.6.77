package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Ib  reason: invalid class name and case insensitive filesystem */
public class C03840Ib extends C06590Ue {
    public final /* synthetic */ C03470Fg A00;

    public C03840Ib(C03470Fg r1) {
        this.A00 = r1;
    }

    public void A01(Drawable drawable) {
        C03470Fg r0 = this.A00;
        ColorStateList colorStateList = r0.A02;
        if (colorStateList != null) {
            AnonymousClass076.A06(drawable, colorStateList.getColorForState(r0.A09, colorStateList.getDefaultColor()));
        }
    }

    public void A02(Drawable drawable) {
        ColorStateList colorStateList = this.A00.A02;
        if (colorStateList != null) {
            AnonymousClass076.A01(colorStateList, drawable);
        }
    }
}
