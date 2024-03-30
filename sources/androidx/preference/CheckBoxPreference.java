package androidx.preference;

import X.AnonymousClass0Yh;
import X.AnonymousClass80G;
import X.AnonymousClass9BI;
import X.C165577te;
import X.C165597tg;
import X.C207499vJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.whatsapp.R;

public class CheckBoxPreference extends TwoStatePreference {
    public final C207499vJ A00;

    private void A00(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16842895));
    }

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(16908289));
            A0S(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        A00(r2.A0B(16908289));
        A0S(r2.A0B(16908304));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = new C207499vJ(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A01, i, i2);
        this.A01 = C165577te.A0j(obtainStyledAttributes, 5, 0);
        if (this.A02) {
            A05();
        }
        this.A00 = C165577te.A0j(obtainStyledAttributes, 4, 1);
        if (!this.A02) {
            A05();
        }
        C165597tg.A10(obtainStyledAttributes, this, 3);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
