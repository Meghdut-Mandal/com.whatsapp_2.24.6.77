package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1Jp  reason: invalid class name and case insensitive filesystem */
public class C26291Jp {
    public final AnonymousClass12P A00;
    public final AnonymousClass12O A01;
    public final C26301Jq A02;
    public final C20170x8 A03;
    public final C19700wN A04;
    public final C19730wQ A05;
    public final C20310xM A06;
    public final C219712j A07;

    public static C180868mY A00(C26291Jp r13, AnonymousClass11F r14, AnonymousClass3T1 r15, boolean z) {
        long j;
        Cursor A032;
        long j2 = r15.A1N;
        if (r14 != null) {
            j = r13.A07.A07(r14);
        } else {
            j = -1;
        }
        AnonymousClass1M0 A042 = r13.A00.get();
        try {
            C20170x8 r5 = r13.A03;
            A032 = r5.A03(A042, 56, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A012 = C65733Tg.A01(A032, 56);
                AnonymousClass2bM A052 = r5.A05(A032, A012);
                if (!(A052 instanceof C180868mY)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnReactionManager/getMessageAddOnReactionForMessageAndSender unexpected fmessage ");
                    sb.append(A052);
                    Log.e(sb.toString());
                } else {
                    C180868mY r3 = (C180868mY) A052;
                    r3.A1c(A032, r13.A07, A012);
                    r3.A04 = new C195759Vv(r15.A0J(), r15.A1J);
                    A032.close();
                    A042.close();
                    return r3;
                }
            }
            A032.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(C26291Jp r4, AnonymousClass3T1 r5, C180868mY r6, C180868mY r7) {
        if (!(r5.A1J.A00 instanceof C28981Uw)) {
            C88944Uq r3 = r5.A0J;
            if (r3 != null) {
                if (r6 != null) {
                    AnonymousClass12O r2 = r4.A01;
                    AnonymousClass11F A0J = r6.A0J();
                    C222813r r0 = UserJid.Companion;
                    r3.BoC(r6, r7, r2.A0I(C222813r.A00(A0J), C222813r.A00(r7.A0J())));
                } else {
                    r3.B0j(r7);
                }
                r4.A06.A0W.A0B(r5);
            } else if (!r5.A1S(1)) {
                r5.A1U(new C68983cm(r4.A05, Collections.singletonList(r7)));
                r5.A0i(1);
                r4.A06.A0j(r5);
            }
        }
    }

    public C26291Jp(C19700wN r1, C19730wQ r2, C20310xM r3, C219712j r4, AnonymousClass12P r5, AnonymousClass12O r6, C26301Jq r7, C20170x8 r8) {
        this.A07 = r4;
        this.A04 = r1;
        this.A05 = r2;
        this.A01 = r6;
        this.A03 = r8;
        this.A00 = r5;
        this.A06 = r3;
        this.A02 = r7;
    }
}
