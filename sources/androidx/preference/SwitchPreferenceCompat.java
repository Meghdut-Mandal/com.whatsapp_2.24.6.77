package androidx.preference;

import X.AnonymousClass80G;
import X.AnonymousClass9BI;
import X.C165577te;
import X.C165597tg;
import X.C207519vL;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C207519vL A02 = new C207519vL(this);

    private void A00(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4nameremoved, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A0C, R.attr.f4nameremoved, 0);
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

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(R.id.switchWidget));
            A0S(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        A00(r2.A0B(R.id.switchWidget));
        A0S(r2.A0B(16908304));
    }
}
