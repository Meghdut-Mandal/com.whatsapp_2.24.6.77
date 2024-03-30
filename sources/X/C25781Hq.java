package X;

import android.os.SystemClock;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.Set;

/* renamed from: X.1Hq  reason: invalid class name and case insensitive filesystem */
public class C25781Hq implements C19680wL {
    public long A00;
    public WamCall A01;
    public final C19730wQ A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C19420v0 A05;
    public final C25831Hv A06;
    public final C21510zM A07;
    public final C20920yN A08;
    public final C19890wg A09;
    public final AnonymousClass005 A0A;
    public final Set A0B;
    public final C19600wD A0C;
    public final C19970wo A0D;
    public final C19770wU A0E;
    public volatile long A0F = -1;

    public void A00(long j) {
        if (j > 0) {
            this.A0E.BpM(new C35191iI(this, SystemClock.uptimeMillis(), 2), "FieldStatsSharedFields/clearCallingAbBucket", j);
        } else if (-1 >= this.A0F) {
            C19420v0 r2 = this.A05;
            C19420v0.A00(r2).remove("voip_call_id").remove("session_id_for_voip_call_id").apply();
            C19420v0.A00(r2).remove("voip_call_ab_test_bucket").apply();
            AnonymousClass1M3.A01(this.A08, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6.A06 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1M8 r6) {
        /*
            r5 = this;
            X.0yN r4 = r5.A08
            if (r6 == 0) goto L_0x0009
            boolean r1 = r6.A06
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            r0 = 23
            r4.BqE(r1, r0, r3)
            r2 = 1
            r4.BqE(r1, r0, r2)
            java.lang.Integer r1 = X.AnonymousClass1M9.A00(r6)
            r0 = 105(0x69, float:1.47E-43)
            r4.BqE(r1, r0, r3)
            r4.BqE(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25781Hq.A01(X.1M8):void");
    }

    public void BUP(AnonymousClass3K7 r2) {
        A01(r2.A01);
    }

    public C25781Hq(C19730wQ r3, C19600wD r4, C21060yb r5, C19970wo r6, C19630wG r7, C19420v0 r8, C25831Hv r9, C21510zM r10, C20920yN r11, C19890wg r12, C19770wU r13, AnonymousClass005 r14, Set set) {
        this.A0D = r6;
        this.A04 = r7;
        this.A0E = r13;
        this.A02 = r3;
        this.A07 = r10;
        this.A03 = r5;
        this.A08 = r11;
        this.A05 = r8;
        this.A09 = r12;
        this.A0C = r4;
        this.A0B = set;
        this.A06 = r9;
        this.A0A = r14;
    }
}
