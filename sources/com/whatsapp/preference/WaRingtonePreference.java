package com.whatsapp.preference;

import X.AnonymousClass80G;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;

public class WaRingtonePreference extends Preference {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;

    public Intent A0S() {
        Uri parse;
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        if (TextUtils.isEmpty(this.A01)) {
            parse = null;
        } else {
            parse = Uri.parse(this.A01);
        }
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parse);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", this.A02);
        if (this.A02) {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(this.A00));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", this.A03);
        intent.putExtra("android.intent.extra.ringtone.TYPE", this.A00);
        intent.putExtra("android.intent.extra.ringtone.TITLE", this.A0F);
        if (this.A02) {
            int i = this.A00;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        }
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", intent);
        return intent2;
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        View view = r2.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaRingtonePreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
