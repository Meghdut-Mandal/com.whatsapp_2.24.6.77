package X;

import android.content.SharedPreferences;
import android.os.Handler;

/* renamed from: X.1uJ  reason: invalid class name and case insensitive filesystem */
public final class C39941uJ extends AnonymousClass04R {
    public final C001600r A00;
    public final AnonymousClass3KZ A01;
    public final C19420v0 A02;
    public final C34831hi A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(AnonymousClass4I4.A00);
    public final C19970wo A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (r13.A04 != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39941uJ(X.AnonymousClass17Y r12, X.AnonymousClass3KZ r13, X.C19970wo r14, X.C19420v0 r15) {
        /*
            r11 = this;
            r4 = 1
            X.AnonymousClass00C.A0D(r14, r4)
            r0 = 2
            X.C36341k9.A1E(r15, r0, r12)
            r11.<init>()
            r11.A05 = r14
            r11.A02 = r15
            r11.A01 = r13
            r2 = 0
            X.3QJ r1 = new X.3QJ
            r3 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            X.1hi r4 = X.C36441kJ.A0s(r1)
            r11.A03 = r4
            X.3a7 r1 = X.C67563a7.A00
            X.08S r1 = X.AnonymousClass0VV.A00(r1, r4)
            X.08S r3 = X.AnonymousClass0VV.A01(r1)
            r11.A00 = r3
            X.4I4 r1 = X.AnonymousClass4I4.A00
            X.00U r1 = X.C36431kI.A1I(r1)
            r11.A04 = r1
            java.lang.Object r2 = X.C36401kF.A0m(r4)
            X.3QJ r2 = (X.AnonymousClass3QJ) r2
            boolean r9 = r13.A01
            boolean r1 = r13.A03
            if (r1 == 0) goto L_0x0045
            boolean r1 = r13.A04
            r10 = 1
            if (r1 == 0) goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            boolean r7 = r2.A04
            int r6 = r2.A00
            boolean r8 = r2.A02
            X.3QJ r5 = new X.3QJ
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A0D(r5)
            X.3wU r1 = new X.3wU
            r1.<init>((java.lang.Object) r11, (int) r0)
            X.4M6 r2 = new X.4M6
            r2.<init>(r12, r1)
            r1 = 27
            X.3Uk r0 = new X.3Uk
            r0.<init>(r2, r1)
            r3.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39941uJ.<init>(X.17Y, X.3KZ, X.0wo, X.0v0):void");
    }

    public static final void A01(C39941uJ r7, int i) {
        long j;
        SharedPreferences A0E;
        String str;
        AnonymousClass3QJ r1 = (AnonymousClass3QJ) r7.A03.A04();
        if (r1.A01 && r1.A03) {
            if (i == 0 || i == 1 || i == 2) {
                C19420v0 r5 = r7.A02;
                if (r5.A0Q() > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - r5.A0Q();
                    if (i == 0) {
                        j = 604800000;
                    } else {
                        j = 7776000000L;
                    }
                    if (currentTimeMillis >= j) {
                        A0E = C36341k9.A0E(r5);
                        str = "push_to_video_camera_entry_point_nux_shown";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 3) {
                A0E = C36341k9.A0E(r7.A02);
                str = "push_to_video_first_time_watching_educational_nux_shown";
            } else {
                return;
            }
            if (!A0E.getBoolean(str, false)) {
                AnonymousClass00T r2 = r7.A04;
                ((Handler) r2.getValue()).removeCallbacksAndMessages((Object) null);
                ((Handler) r2.getValue()).postDelayed(new C81283wl((Object) r7, i, 26), 600);
            }
        }
    }

    public void A0R() {
        ((Handler) this.A04.getValue()).removeCallbacksAndMessages((Object) null);
    }

    public final void A0S() {
        ((Handler) this.A04.getValue()).removeCallbacksAndMessages((Object) null);
        C34831hi r2 = this.A03;
        AnonymousClass3QJ r1 = (AnonymousClass3QJ) C36401kF.A0m(r2);
        if (r1.A04) {
            r2.A0D(new AnonymousClass3QJ(r1.A00, false, r1.A02, r1.A01, r1.A03));
        }
    }

    public final void A0T(boolean z) {
        C34831hi r1 = this.A03;
        boolean z2 = z;
        if (((AnonymousClass3QJ) C36401kF.A0m(r1)).A02 != z) {
            AnonymousClass3QJ r0 = (AnonymousClass3QJ) C36401kF.A0m(r1);
            r1.A0D(new AnonymousClass3QJ(r0.A00, r0.A04, z2, r0.A01, r0.A03));
            if (!z) {
                A0S();
            }
        }
    }
}
