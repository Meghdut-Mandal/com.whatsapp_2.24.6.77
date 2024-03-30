package com.whatsapp.preference;

import X.AnonymousClass80G;
import X.C36331k8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.whatsapp.R;

public class WaPreferenceCategory extends PreferenceCategory {
    public void A0G(AnonymousClass80G r4) {
        super.A0G(r4);
        View findViewById = r4.A0H.findViewById(16908310);
        if (findViewById != null && (findViewById instanceof TextView)) {
            C36331k8.A0r(this.A05, (TextView) findViewById, R.color.f6nameremoved);
        }
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreferenceCategory(Context context) {
        super(context, (AttributeSet) null);
    }
}
