package X;

import android.content.SharedPreferences;

/* renamed from: X.6Dd  reason: invalid class name and case insensitive filesystem */
public class C128666Dd {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final C19420v0 A04;
    public final AnonymousClass9Q5 A05;
    public final C117945n5 A06;

    public void A00(long j, boolean z, long j2) {
        SharedPreferences.Editor A002;
        SharedPreferences A0E;
        String str;
        AnonymousClass11F r1 = this.A06.A00.A0B;
        long j3 = j;
        long j4 = j2;
        this.A05.A00(1, j3, j4, this.A01, this.A02, this.A00, z, this.A03);
        if (r1 != null) {
            if (r1 instanceof C177618e5) {
                C19420v0 r0 = this.A04;
                A002 = C19420v0.A00(r0);
                A0E = C36341k9.A0E(r0);
                str = "ptt_send_broadcast";
            } else if (AnonymousClass143.A0G(r1)) {
                C19420v0 r02 = this.A04;
                A002 = C19420v0.A00(r02);
                A0E = C36341k9.A0E(r02);
                str = "ptt_send_group";
            } else {
                boolean A0H = AnonymousClass143.A0H(r1);
                C19420v0 r03 = this.A04;
                A002 = C19420v0.A00(r03);
                A0E = C36341k9.A0E(r03);
                if (A0H) {
                    str = "ptt_send_interop";
                } else {
                    str = "ptt_send_individual";
                }
            }
            C36341k9.A0w(A002, str, C36341k9.A0B(A0E, str) + 1);
        }
    }

    public void A01(long j, boolean z, long j2) {
        SharedPreferences.Editor A002;
        SharedPreferences A0E;
        String str;
        SharedPreferences.Editor putLong;
        long j3 = j;
        long j4 = j2;
        this.A05.A00(2, j3, j4, this.A01, this.A02, this.A00, z, this.A03);
        AnonymousClass11F r1 = this.A06.A00.A0B;
        if (r1 != null) {
            if (r1 instanceof C177618e5) {
                C19420v0 r0 = this.A04;
                A002 = C19420v0.A00(r0);
                A0E = C36341k9.A0E(r0);
                str = "ptt_cancel_broadcast";
            } else if (AnonymousClass143.A0G(r1)) {
                C19420v0 r02 = this.A04;
                A002 = C19420v0.A00(r02);
                A0E = C36341k9.A0E(r02);
                str = "ptt_cancel_group";
            } else {
                boolean A0H = AnonymousClass143.A0H(r1);
                C19420v0 r03 = this.A04;
                if (A0H) {
                    putLong = C19420v0.A00(r03).putLong("ptt_cancel_interop", C36341k9.A0B(C36341k9.A0E(r03), "ptt_cancel_individual") + 1);
                    putLong.apply();
                }
                A002 = C19420v0.A00(r03);
                A0E = C36341k9.A0E(r03);
                str = "ptt_cancel_individual";
            }
            putLong = A002.putLong(str, C36341k9.A0B(A0E, str) + 1);
            putLong.apply();
        }
    }

    public C128666Dd(C19420v0 r1, AnonymousClass9Q5 r2, C117945n5 r3) {
        this.A05 = r2;
        this.A04 = r1;
        this.A06 = r3;
    }
}
