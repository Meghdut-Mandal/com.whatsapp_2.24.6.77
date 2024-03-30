package X;

import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.3qM  reason: invalid class name and case insensitive filesystem */
public final class C77353qM implements C23045B1q {
    public String A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AnonymousClass01L A05;
    public final C19630wG A06;
    public final C20830yE A07;
    public final C19420v0 A08;
    public final C29501Ww A09;
    public final boolean A0A;
    public final int A0B;

    public void BmG() {
        this.A01 = false;
        A00();
    }

    public void Bus() {
        this.A01 = true;
        A00();
    }

    private final void A00() {
        String str = this.A00;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 114009) {
                if (hashCode != 97513456) {
                    if (hashCode == 112386354 && str.equals("voice")) {
                        Log.i("PrimaryFlashCallHelper/verifyWithCall");
                        C29501Ww.A02(this.A09, 5, true);
                        AnonymousClass01L r1 = this.A05;
                        r1.startActivity(AnonymousClass190.A0O(r1, this.A03, this.A04, this.A01, false));
                        r1.finish();
                    }
                } else if (str.equals("flash")) {
                    C20830yE r3 = this.A07;
                    if (!r3.A0A()) {
                        Log.i("PrimaryFlashCallHelper/request-flash-call-permissions");
                        AnonymousClass3US.A07(this.A05, r3, this.A02, true);
                        return;
                    }
                    A03(this);
                    A01();
                }
            } else if (!str.equals("sms")) {
            } else {
                if (this.A01 || this.A07.A02("android.permission.RECEIVE_SMS") == 0) {
                    A02();
                } else {
                    C65983Uf.A0N(C36401kF.A0L(this.A05), 1);
                }
            }
        }
    }

    private final void A01() {
        Log.i("PrimaryFlashCallHelper/attempt-flash-call");
        C29501Ww.A02(this.A09, 8, true);
        AnonymousClass01L r4 = this.A05;
        r4.startActivity(AnonymousClass190.A19(r4, (String) null, this.A0B, 0, 0, this.A03, this.A04, 0, 0, this.A01, false, false, true, false));
        r4.finish();
    }

    public static final void A03(C77353qM r4) {
        if (Build.VERSION.SDK_INT >= 28) {
            C19420v0 r0 = r4.A08;
            C20830yE r42 = r4.A07;
            boolean A092 = r42.A09();
            AnonymousClass005 r3 = r0.A00;
            C36341k9.A0v(C36391kE.A0H(r3).edit(), "pref_flash_call_manage_call_permission_granted", A092 ? 1 : 0);
            C36341k9.A0v(C36391kE.A0H(r3).edit(), "pref_flash_call_call_log_permission_granted", r42.A08() ? 1 : 0);
        }
    }

    public final void A04(int i, int i2) {
        String str = "granted";
        if (i == this.A02) {
            A03(this);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PrimaryFlashCallHelper/activity-result/request-flash-call-permissions/");
            if (i2 != -1) {
                str = "denied";
            }
            C36321k7.A1a(A0u, str);
            if (i2 == -1) {
                A01();
                return;
            }
            this.A08.A1T("primary_eligible");
        } else if (i == 1) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("PrimaryFlashCallHelper/activity-result/request-sms-permissions/");
            if (i2 != -1) {
                str = "denied";
            }
            C36321k7.A1a(A0u2, str);
        } else {
            return;
        }
        A02();
    }

    public C77353qM(AnonymousClass01L r1, C19630wG r2, C20830yE r3, C19420v0 r4, C29501Ww r5, int i, int i2, long j, long j2, boolean z) {
        C36321k7.A18(r3, r5, r4, r2);
        this.A07 = r3;
        this.A09 = r5;
        this.A08 = r4;
        this.A06 = r2;
        this.A05 = r1;
        this.A02 = i;
        this.A0B = i2;
        this.A03 = j;
        this.A04 = j2;
        this.A0A = z;
    }

    private final void A02() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrimaryFlashCallHelper/startverifysms/usesmsretriever=");
        C36331k8.A1S(A0u, this.A01);
        C29501Ww.A02(this.A09, 4, true);
        AnonymousClass01L r1 = this.A05;
        r1.startActivity(AnonymousClass190.A19(r1, (String) null, -1, 0, 0, this.A03, this.A04, 0, 0, this.A01, true, false, false, false));
        r1.finish();
    }
}
