package com.whatsapp.registration;

import X.C18830tt;
import X.C19420v0;
import X.C20380xT;
import X.C24801Dv;
import X.C25271Fq;
import X.C36391kE;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public C24801Dv A00;
    public C25271Fq A01;
    public C19420v0 A02;
    public C20380xT A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C18830tt.APl(C56042vd.A00(context), this);
                    this.A05 = true;
                }
            }
        }
        this.A00.A06(context, C36391kE.A0G(this.A03.A03("30035737")).setFlags(268435456));
        SharedPreferences.Editor A002 = C19420v0.A00(this.A02);
        A002.remove("show_pre_reg_do_not_share_code_warning");
        A002.apply();
        this.A01.A03(20, "PreRegNotificationLearnMoreReceiver");
    }

    public PreRegNotificationLearnMoreReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public PreRegNotificationLearnMoreReceiver() {
        this(0);
    }
}
