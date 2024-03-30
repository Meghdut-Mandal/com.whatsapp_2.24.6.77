package com.whatsapp.settings;

import X.AnonymousClass00E;
import X.AnonymousClass4RR;
import X.C605438g;
import X.C64683Pa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public class SettingsRowNoticeView extends SettingsRowIconText implements AnonymousClass4RR {
    public Drawable A00;
    public boolean A01;
    public int A02;

    public SettingsRowNoticeView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setNotice(C64683Pa r3) {
        C605438g r1 = r3.A05;
        this.A02 = r1.A00;
        setText((CharSequence) r1.A03);
        this.A02.setVisibility(4);
    }

    public int getNoticeId() {
        return this.A02;
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = AnonymousClass00E.A00(context, R.drawable.ic_settings_row_badge);
    }
}
