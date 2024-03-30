package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.06r  reason: invalid class name and case insensitive filesystem */
public class C015506r extends Button implements C015306p, C015406q {
    public final C015706u A00;
    public final C015906w A01;

    public int getAutoSizeMaxTextSize() {
        if (C015306p.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C015306p.A00) {
            return super.getAutoSizeMinTextSize();
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C015306p.A00) {
            return super.getAutoSizeStepGranularity();
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C015306p.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            return r0.A0C.A07;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C015306p.A00) {
            C015906w r0 = this.A01;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C015806v r0 = this.A01.A07;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C015806v r0 = this.A01.A07;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A06(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A0B(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A05(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A0B.setAllCaps(z);
        }
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C015906w r0 = this.A01;
        r0.A08(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C015906w r0 = this.A01;
        r0.A09(mode);
        r0.A04();
    }

    public void setTextSize(int i, float f) {
        if (C015306p.A00) {
            super.setTextSize(i, f);
            return;
        }
        C015906w r0 = this.A01;
        if (r0 != null) {
            C016006x r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass074)) || r1.A03 == 0) {
                r1.A08(i, f);
            }
        }
    }

    public C015506r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C015906w r1 = this.A01;
        if (r1 != null && !C015306p.A00) {
            r1.A0C.A07();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C015906w r1 = this.A01;
        if (r1 != null && !C015306p.A00) {
            C016006x r12 = r1.A0C;
            if ((!(r12.A09 instanceof AnonymousClass074)) && r12.A03 != 0) {
                r12.A07();
            }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A07(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C015506r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C015606t.A03(getContext(), this);
        C015706u r0 = new C015706u(this);
        this.A00 = r0;
        r0.A05(attributeSet, i);
        C015906w r02 = new C015906w(this);
        this.A01 = r02;
        r02.A0A(attributeSet, i);
        r02.A04();
    }
}
