package com.whatsapp.radio;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0Q6;
import X.AnonymousClass2xF;
import X.C015006m;
import X.C05250Oz;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import X.C37291m8;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

public final class RadioButtonWithSubtitle extends AppCompatRadioButton {
    public CharSequence A00;
    public CharSequence A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context) {
        this(context, (AttributeSet) null, 16842878);
        AnonymousClass00C.A0D(context, 1);
    }

    private final void A00() {
        CharSequence charSequence = this.A01;
        CharSequence charSequence2 = this.A00;
        if (charSequence2 == null || charSequence2.length() == 0 || charSequence == null || charSequence.length() == 0) {
            setText(charSequence);
            return;
        }
        StringBuilder A11 = C36381kD.A11(charSequence);
        A11.append(10);
        String A0o = AnonymousClass000.A0o(this.A00, A11);
        C37291m8 r4 = new C37291m8(this, C015006m.A00((Resources.Theme) null, getResources(), R.color.f6nameremoved));
        SpannableString A0O = C36441kJ.A0O(A0o);
        A0O.setSpan(r4, charSequence.length() + 1, A0o.length(), 33);
        setText(A0O);
    }

    private final void setParams(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0G, 0, 0);
            AnonymousClass00C.A08(obtainStyledAttributes);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setTitle(getResources().getString(resourceId));
                }
                if (resourceId2 != 0) {
                    setSubTitle(getResources().getString(resourceId2));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.A00 = charSequence;
        A00();
    }

    public final void setTitle(CharSequence charSequence) {
        this.A01 = charSequence;
        A00();
    }

    public final CharSequence getSubTitle() {
        return this.A00;
    }

    public final CharSequence getTitle() {
        return this.A01;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), (i2 & 4) != 0 ? 16842878 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        setParams(attributeSet);
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        A0N.setMargins(0, 0, 0, dimensionPixelSize);
        setLayoutParams(A0N);
        setPaddingRelative(dimensionPixelSize2, getPaddingTop(), dimensionPixelSize2, getPaddingBottom());
        setTextSize(0, getResources().getDimension(R.dimen.f7nameremoved));
        if (Build.VERSION.SDK_INT >= 28) {
            setLineHeight(C36441kJ.A05(getResources(), R.dimen.f7nameremoved));
        }
        AnonymousClass0Q6.A00(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C36351kA.A01(C36371kC.A0B(this), R.attr.f4nameremoved, R.color.f6nameremoved), C36351kA.A01(C36371kC.A0B(this), R.attr.f4nameremoved, R.color.f6nameremoved)}), this);
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842878);
        AnonymousClass00C.A0D(context, 1);
    }
}
