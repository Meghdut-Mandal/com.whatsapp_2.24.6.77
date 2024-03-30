package com.whatsapp.notification;

import X.AnonymousClass01L;
import X.AnonymousClass04G;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1TF;
import X.AnonymousClass1Y3;
import X.C18700tb;
import X.C19770wU;
import X.C27011Mj;
import X.C28721Tt;
import X.C36321k7;
import X.C36441kJ;
import X.C80393vK;
import X.C89344We;
import android.os.Bundle;

public final class OtpOneTapNotificationHandlerActivity extends AnonymousClass01L implements C18700tb {
    public AnonymousClass17Y A00;
    public AnonymousClass1Y3 A01;
    public AnonymousClass1TF A02;
    public AnonymousClass1A1 A03;
    public C19770wU A04;
    public boolean A05;
    public final Object A06;
    public volatile C27011Mj A07;

    public final Object generatedComponent() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new C27011Mj(this);
                }
            }
        }
        return this.A07.generatedComponent();
    }

    public OtpOneTapNotificationHandlerActivity(int i) {
        this.A06 = C36441kJ.A11();
        this.A05 = false;
        C89344We.A00(this, 33);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_remote_jid");
        String stringExtra2 = getIntent().getStringExtra("extra_message_key_id");
        if (stringExtra != null && stringExtra2 != null) {
            C19770wU r2 = this.A04;
            if (r2 != null) {
                r2.Boy(new C80393vK(this, stringExtra, stringExtra2, 12));
                finish();
                return;
            }
            throw C36321k7.A08();
        }
    }

    public OtpOneTapNotificationHandlerActivity() {
        this(0);
    }
}
