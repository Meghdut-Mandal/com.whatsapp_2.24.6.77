package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8W2  reason: invalid class name */
public final class AnonymousClass8W2 extends C177058d8 {
    public final C19730wQ A00;
    public final AnonymousClass1KK A01;
    public final C29461Ws A02;
    public final C195189Sv A03;
    public final C23028B0y A04;
    public final AnonymousClass8VD A05;
    public final C19600wD A06;
    public final AnonymousClass9NZ A07;
    public final C20810yC A08;
    public final AnonymousClass1UG A09;
    public final AnonymousClass3L6 A0A;
    public final C202279lS A0B;
    public final C199349fA A0C;
    public final AnonymousClass19A A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8W2(X.C19730wQ r10, X.AnonymousClass1KK r11, X.C29461Ws r12, X.C202279lS r13, X.C194309Pd r14, X.C198409dV r15, X.C193349Lc r16, X.C603237k r17, X.C195189Sv r18, X.C23028B0y r19, X.AnonymousClass8VD r20, X.C19600wD r21, X.AnonymousClass9NZ r22, X.C20810yC r23, X.AnonymousClass1UG r24, X.C199349fA r25, X.AnonymousClass19A r26, X.AnonymousClass3L6 r27, X.AnonymousClass9IN r28, X.C19770wU r29) {
        /*
            r9 = this;
            r0 = 1
            r3 = r15
            X.AnonymousClass00C.A0D(r15, r0)
            r8 = 2
            r2 = r14
            r5 = r17
            X.C36331k8.A1H(r14, r5)
            r0 = 10
            X.AnonymousClass00C.A0D(r13, r0)
            r1 = r9
            r7 = r29
            r4 = r16
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A00 = r10
            r0 = r27
            r9.A0A = r0
            r9.A01 = r11
            r9.A0B = r13
            r9.A02 = r12
            r0 = r22
            r9.A07 = r0
            r0 = r18
            r9.A03 = r0
            r0 = r26
            r9.A0D = r0
            r0 = r21
            r9.A06 = r0
            r0 = r25
            r9.A0C = r0
            r0 = r19
            r9.A04 = r0
            r0 = r20
            r9.A05 = r0
            r0 = r23
            r9.A08 = r0
            r0 = r24
            r9.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8W2.<init>(X.0wQ, X.1KK, X.1Ws, X.9lS, X.9Pd, X.9dV, X.9Lc, X.37k, X.9Sv, X.B0y, X.8VD, X.0wD, X.9NZ, X.0yC, X.1UG, X.9fA, X.19A, X.3L6, X.9IN, X.0wU):void");
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        A00(this, iOException, "/onDeliveryFailure", 0, -1, false);
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0t = C36401kF.A0t(userJid, 0);
        C36321k7.A1Z(A0t, C165607th.A0r(userJid, "GetProductGraphQLService/direct-connection-error/jid=", A0t));
        this.A04.BXY(this.A07, 0);
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        A00(this, exc, "/onError", 0, 0, false);
    }

    public static final void A00(AnonymousClass8W2 r2, Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductGraphQLService/onError/response-error");
        r2.A0A.A01("view_product_tag");
        AnonymousClass9NZ r1 = r2.A07;
        UserJid userJid = r1.A01;
        AnonymousClass00C.A07(userJid);
        if (!r2.A08(userJid, i2, z)) {
            String A0D2 = C36321k7.A0D("GetProductGraphQLService", str);
            if (exc != null) {
                Log.e(A0D2, exc);
            } else {
                Log.e(A0D2);
            }
            r2.A04.BXY(r1, i);
        }
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
