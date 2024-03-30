package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Pl  reason: invalid class name and case insensitive filesystem */
public class C27711Pl extends AnonymousClass1Pk {
    public final /* synthetic */ C27671Pf A00;
    public final /* synthetic */ C19970wo A01;
    public final /* synthetic */ C19630wG A02;
    public final /* synthetic */ C20810yC A03;
    public final /* synthetic */ AnonymousClass1NF A04;
    public final /* synthetic */ AnonymousClass1NE A05;

    public C27711Pl(AnonymousClass1NF r1, AnonymousClass1NE r2, C27671Pf r3, C19970wo r4, C19630wG r5, C20810yC r6) {
        this.A05 = r2;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = r1;
    }

    public void A05(String str, boolean z) {
        C18740tg.A01();
        AnonymousClass1NE r3 = this.A05;
        AnonymousClass6NW r5 = r3.A0Z;
        StringBuilder sb = new StringBuilder();
        sb.append("app/startOutgoingCall/onCreateOutgoingConnection ");
        sb.append(str);
        sb.append(", pendingCallCommand: ");
        sb.append(r5);
        Log.i(sb.toString());
        if (r5 == null || !str.equals(r5.A0A)) {
            C27671Pf.A00(this.A00).A0B(str);
            return;
        }
        long j = r3.A00;
        if (j > 0) {
            r5.A01 = SystemClock.elapsedRealtime() - j;
        } else {
            C18740tg.A0D(false, "selfManagedConnectionNewCallTs is not set");
        }
        if (!z) {
            r3.A0N.Boy(new C35651j2(r3, r5, 10));
        } else {
            boolean z2 = r5.A0D;
            boolean z3 = r5.A05;
            if (z2 && !z3 && C34681hT.A0N(r3.A0K)) {
                if (C20800yB.A01(C21000yV.A02, this.A03, 6688)) {
                    r3.B07(this.A02.A00, true);
                }
            }
            AnonymousClass1NE.A07(r3, r5);
        }
        r3.A0Z = null;
        r3.A02.removeMessages(1);
    }
}
