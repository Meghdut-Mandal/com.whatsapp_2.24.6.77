package androidx.appcompat.widget;

import X.AnonymousClass02X;
import X.AnonymousClass0X3;
import X.C015606t;
import X.C015706u;
import X.C015806v;
import X.C015906w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.whatsapp.R;

public class AppCompatRadioButton extends RadioButton {
    public final C015706u A00;
    public final AnonymousClass0X3 A01;
    public final C015906w A02;

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

    public ColorStateList getSupportButtonTintList() {
        AnonymousClass0X3 r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        AnonymousClass0X3 r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        AnonymousClass0X3 r1 = this.A01;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A01();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        AnonymousClass0X3 r1 = this.A01;
        if (r1 != null) {
            r1.A01 = mode;
            r1.A03 = true;
            r1.A01();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        C015906w r02 = this.A02;
        if (r02 != null) {
            r02.A04();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AnonymousClass0X3 r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (r1.A04) {
            r1.A04 = false;
            return;
        }
        r1.A04 = true;
        r1.A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C015606t.A04(this);
        AnonymousClass0X3 r0 = new AnonymousClass0X3(this);
        this.A01 = r0;
        r0.A02(attributeSet, i);
        C015706u r02 = new C015706u(this);
        this.A00 = r02;
        r02.A05(attributeSet, i);
        C015906w r03 = new C015906w(this);
        this.A02 = r03;
        r03.A0A(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass02X.A02(this, i));
    }

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
