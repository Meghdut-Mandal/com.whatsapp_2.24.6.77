package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass14B;
import X.AnonymousClass14K;
import X.AnonymousClass155;
import X.AnonymousClass3LW;
import X.AnonymousClass3PI;
import X.AnonymousClass3TF;
import X.AnonymousClass3UM;
import X.AnonymousClass3Y7;
import X.AnonymousClass4XP;
import X.AnonymousClass6XI;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20040wv;
import X.C20050ww;
import X.C27111My;
import X.C34191gb;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C39001qm;
import X.C601336p;
import X.C82343yY;
import X.C89364Wg;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.Statistics$Data;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsNetworkUsage extends AnonymousClass155 {
    public Handler A00;
    public C20050ww A01;
    public C18820ts A02;
    public AnonymousClass3PI A03;
    public TimerTask A04;
    public boolean A05;
    public final Timer A06;

    public class ResetUsageConfirmationDialog extends Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog {
        public Dialog A1a(Bundle bundle) {
            C39001qm A04 = AnonymousClass3LW.A04(this);
            A04.A0c(R.string.f12nameremoved);
            C39001qm.A03(new AnonymousClass4XP(this, 37), A04, R.string.f12nameremoved);
            return A04.create();
        }
    }

    public static void A07(SettingsNetworkUsage settingsNetworkUsage, boolean z) {
        String A0e;
        SettingsNetworkUsage settingsNetworkUsage2 = settingsNetworkUsage;
        if (z) {
            C20050ww r2 = settingsNetworkUsage2.A01;
            Log.i("statistics/reset");
            AnonymousClass14K r22 = r2.A00;
            C18740tg.A0C(AnonymousClass000.A1V(r22));
            r22.sendEmptyMessage(9);
        }
        Statistics$Data A012 = settingsNetworkUsage2.A01.A01();
        NumberFormat instance = NumberFormat.getInstance(C36401kF.A0x(settingsNetworkUsage2.A02));
        long j = A012.A0E + A012.A0G + A012.A0M + A012.A0D + A012.A0J;
        long j2 = A012.A01 + A012.A03 + A012.A0B + A012.A00 + A012.A08;
        long j3 = j + j2;
        C601336p A013 = AnonymousClass3TF.A01(settingsNetworkUsage2.A02, j3);
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = A013.A01;
        A0u.append(str);
        A0u.append(A013.A02);
        String str2 = A013.A00;
        SpannableString A0O = C36441kJ.A0O(AnonymousClass000.A0q(str2, A0u));
        if (!str.isEmpty()) {
            A0O.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            A0O.setSpan(new AbsoluteSizeSpan(16, true), A0O.length() - str2.length(), A0O.length(), 33);
        }
        C36401kF.A0H(settingsNetworkUsage2, R.id.total_network_usage).setText(A0O);
        AnonymousClass3TF.A05(C36401kF.A0H(settingsNetworkUsage2, R.id.total_network_usage_sent), settingsNetworkUsage2.A02, j);
        AnonymousClass3TF.A05(C36401kF.A0H(settingsNetworkUsage2, R.id.total_network_usage_received), settingsNetworkUsage2.A02, j2);
        long j4 = j3;
        SettingsNetworkUsage settingsNetworkUsage3 = settingsNetworkUsage2;
        settingsNetworkUsage3.A01(R.id.call_data_sent, R.id.call_data_received, R.id.calls_data_bar, A012.A0M, A012.A0B, j4);
        long j5 = A012.A0N;
        long j6 = A012.A0C;
        TextView A0H = C36401kF.A0H(settingsNetworkUsage2, R.id.calls_info);
        C18820ts r8 = settingsNetworkUsage2.A02;
        A0H.setText(AnonymousClass14B.A04(r8, r8.A0L(new Object[]{instance.format(j5)}, R.plurals.f10nameremoved, j5), settingsNetworkUsage2.A02.A0L(new Object[]{instance.format(j6)}, R.plurals.f10nameremoved, j6)));
        settingsNetworkUsage3.A01(R.id.media_data_sent, R.id.media_data_received, R.id.media_data_bar, A012.A0E, A012.A01, j4);
        long j7 = A012.A0D;
        long j8 = A012.A00;
        if (C34191gb.A08(settingsNetworkUsage2.getApplicationContext()) || j7 > 0 || j8 > 0) {
            settingsNetworkUsage3.A01(R.id.gdrive_data_sent, R.id.gdrive_data_received, R.id.gdrive_data_bar, j7, j8, j4);
        } else {
            C36391kE.A16(settingsNetworkUsage2, R.id.gdrive_row, 8);
        }
        settingsNetworkUsage3.A01(R.id.messages_data_sent, R.id.messages_data_received, R.id.messages_data_bar, A012.A0G, A012.A03, j4);
        long j9 = A012.A0L + A012.A0F;
        long j10 = A012.A0A + A012.A02;
        TextView A0H2 = C36401kF.A0H(settingsNetworkUsage2, R.id.messages_info);
        C18820ts r12 = settingsNetworkUsage2.A02;
        A0H2.setText(AnonymousClass14B.A04(r12, r12.A0L(new Object[]{instance.format(j9)}, R.plurals.f10nameremoved, j9), settingsNetworkUsage2.A02.A0L(new Object[]{instance.format(j10)}, R.plurals.f10nameremoved, j10)));
        settingsNetworkUsage3.A01(R.id.status_data_sent, R.id.status_data_received, R.id.status_data_bar, A012.A0J, A012.A08, j4);
        long j11 = A012.A0K;
        long j12 = A012.A09;
        TextView A0H3 = C36401kF.A0H(settingsNetworkUsage2, R.id.status_info);
        C18820ts r122 = settingsNetworkUsage2.A02;
        A0H3.setText(AnonymousClass14B.A04(r122, r122.A0L(new Object[]{instance.format(j11)}, R.plurals.f10nameremoved, j11), settingsNetworkUsage2.A02.A0L(new Object[]{instance.format(j12)}, R.plurals.f10nameremoved, j12)));
        SettingsNetworkUsage settingsNetworkUsage4 = settingsNetworkUsage2;
        settingsNetworkUsage4.A01(R.id.roaming_data_sent, R.id.roaming_data_received, R.id.roaming_data_bar, A012.A0I, A012.A07, j3);
        long j13 = A012.A0O;
        if (j13 != Long.MIN_VALUE) {
            C36391kE.A16(settingsNetworkUsage2, R.id.last_updated_date, 0);
            C18820ts r6 = settingsNetworkUsage2.A02;
            A0e = C36391kE.A0v(settingsNetworkUsage2, AnonymousClass6XI.A03(r6, C20040wv.A09(r6, j13), AnonymousClass3UM.A00(r6, j13)), new Object[1], 0, R.string.f12nameremoved);
            C36341k9.A0s(settingsNetworkUsage2, C36401kF.A0H(settingsNetworkUsage2, R.id.last_updated_date), new Object[]{C20040wv.A09(settingsNetworkUsage2.A02, j13)}, R.string.f12nameremoved);
        } else {
            A0e = C36341k9.A0e(settingsNetworkUsage2, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved);
            C36361kB.A0v(settingsNetworkUsage2, R.id.last_updated_date);
        }
        C36401kF.A0H(settingsNetworkUsage2, R.id.last_usage_reset).setText(A0e);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = C36381kD.A0U(r2);
            this.A02 = C36341k9.A0T(r2);
            this.A03 = C27111My.A3F(A0L);
        }
    }

    public SettingsNetworkUsage(int i) {
        this.A05 = false;
        C89364Wg.A00(this, 25);
    }

    private void A01(int i, int i2, int i3, long j, long j2, long j3) {
        TextView A0H = C36401kF.A0H(this, i);
        String A042 = AnonymousClass3TF.A04(this.A02, j);
        A0H.setText(A042);
        String A0G = this.A02.A0G(A042);
        int i4 = 0;
        C36371kC.A14(this, A0H, new Object[]{A0G}, R.string.f12nameremoved);
        TextView A0H2 = C36401kF.A0H(this, i2);
        String A043 = AnonymousClass3TF.A04(this.A02, j2);
        A0H2.setText(A043);
        Object[] objArr = new Object[1];
        C36411kG.A1H(this.A02, A043, objArr, 0);
        C36371kC.A14(this, A0H2, objArr, R.string.f12nameremoved);
        if (j3 > 0) {
            i4 = (int) ((((float) (j + j2)) * 100.0f) / ((float) j3));
        }
        ((RoundCornerProgressBar) C03570Gk.A0B(this, i3)).setProgress(i4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0O(this);
        AnonymousClass3Y7.A00(C03570Gk.A0B(this, R.id.reset_network_usage_row), this, 43);
        this.A00 = new Handler(Looper.myLooper());
        this.A03.A02(this.A00, "network_usage", C36381kD.A0q(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.cancel();
    }

    public void onPause() {
        super.onPause();
        this.A04.cancel();
    }

    public void onResume() {
        super.onResume();
        C82343yY r1 = new C82343yY(this);
        this.A04 = r1;
        this.A06.scheduleAtFixedRate(r1, 0, 1000);
    }

    public SettingsNetworkUsage() {
        this(0);
        this.A06 = new Timer("refresh-network-usage");
    }
}
