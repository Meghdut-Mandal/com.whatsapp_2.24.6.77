package com.whatsapp.preference;

import X.AnonymousClass80G;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;

public class WaCheckBoxPreference extends CheckBoxPreference {
    public void A0G(AnonymousClass80G r3) {
        super.A0G(r3);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaCheckBoxPreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
