package androidx.preference;

import X.AnonymousClass0Yh;
import X.AnonymousClass80G;
import X.AnonymousClass9BI;
import X.C165577te;
import X.C165597tg;
import X.C207509vK;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.whatsapp.R;

public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C207509vK A02;

    private void A01(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.A01);
            switchR.setTextOff(this.A00);
            switchR.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16843629));
    }

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A01(view.findViewById(16908352));
            A0S(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        A01(r2.A0B(16908352));
        A0S(r2.A0B(16908304));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = new C207509vK(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A0B, i, i2);
        this.A01 = C165577te.A0j(obtainStyledAttributes, 7, 0);
        if (this.A02) {
            A05();
        }
        this.A00 = C165577te.A0j(obtainStyledAttributes, 6, 1);
        if (!this.A02) {
            A05();
        }
        this.A01 = C165577te.A0j(obtainStyledAttributes, 9, 3);
        A05();
        this.A00 = C165577te.A0j(obtainStyledAttributes, 8, 4);
        A05();
        C165597tg.A10(obtainStyledAttributes, this, 5);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
