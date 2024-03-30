package com.whatsapp.preference;

import X.AnonymousClass80G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.ListPreference;
import com.whatsapp.R;

public class WaListPreference extends ListPreference {
    public void A0G(AnonymousClass80G r3) {
        super.A0G(r3);
        this.A04 = this.A05.getString(R.string.f12nameremoved);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaListPreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
