package com.whatsapp.preference;

import X.AnonymousClass00F;
import X.AnonymousClass80G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.whatsapp.R;

public class WaPreference extends Preference {
    public static void A00(View view) {
        View findViewById = view.findViewById(16908304);
        if (findViewById != null && (findViewById instanceof TextView)) {
            ((TextView) findViewById).setTextColor(AnonymousClass00F.A04(findViewById.getContext(), R.color.f6nameremoved));
        }
    }

    public static void A01(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(AnonymousClass00F.A04(findViewById.getContext(), R.color.f6nameremoved));
        }
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        A01(r2.A0H);
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaPreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
