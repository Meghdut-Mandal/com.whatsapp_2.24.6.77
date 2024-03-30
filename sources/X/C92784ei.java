package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.Switch;

/* renamed from: X.4ei  reason: invalid class name and case insensitive filesystem */
public class C92784ei extends FrameLayout implements C160577lE {
    public final Switch A00;

    public void BsT(ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        Switch switchR = this.A00;
        if (i >= 23) {
            switchR.setThumbTintList(colorStateList);
            return;
        }
        Drawable thumbDrawable = switchR.getThumbDrawable();
        if (thumbDrawable != null) {
            Drawable mutate = AnonymousClass08I.A01(thumbDrawable).mutate();
            AnonymousClass076.A01(colorStateList, mutate);
            if (mutate.isStateful()) {
                AnonymousClass000.A13(mutate, switchR);
            }
            switchR.setThumbDrawable(mutate);
        }
    }

    public void BsY(ColorStateList colorStateList, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            Switch switchR = this.A00;
            switchR.setTrackTintList(colorStateList);
            switchR.setTrackTintMode(PorterDuff.Mode.SRC_OVER);
            return;
        }
        Switch switchR2 = this.A00;
        Drawable trackDrawable = switchR2.getTrackDrawable();
        if (trackDrawable != null) {
            Drawable mutate = AnonymousClass08I.A01(trackDrawable).mutate();
            AnonymousClass076.A01(colorStateList, mutate);
            if (mutate.isStateful()) {
                AnonymousClass000.A13(mutate, switchR2);
            }
            switchR2.setTrackDrawable(mutate);
        }
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }

    public C92784ei(Context context) {
        super(context);
        Switch switchR = new Switch(context);
        this.A00 = switchR;
        addView(switchR, -2, -2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }
}
