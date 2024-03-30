package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: X.0FE  reason: invalid class name */
public class AnonymousClass0FE extends ToggleButton {
    public final C015706u A00;
    public final C015906w A01;

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public AnonymousClass0FE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        C015606t.A04(this);
        C015706u r0 = new C015706u(this);
        this.A00 = r0;
        r0.A05(attributeSet, 16842827);
        C015906w r02 = new C015906w(this);
        this.A01 = r02;
        r02.A0A(attributeSet, 16842827);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        C015906w r02 = this.A01;
        if (r02 != null) {
            r02.A04();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A02(i);
        }
    }
}
