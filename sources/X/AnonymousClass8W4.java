package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8W4  reason: invalid class name */
public final class AnonymousClass8W4 extends C177058d8 {
    public final C19700wN A00;
    public final AnonymousClass1KK A01;
    public final C195189Sv A02;
    public final C23025B0v A03;
    public final AnonymousClass8VF A04;
    public final C19600wD A05;
    public final C200939iV A06;
    public final C20810yC A07;
    public final AnonymousClass3L6 A08;
    public final C199349fA A09;
    public final AnonymousClass19A A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8W4(X.C19700wN r10, X.AnonymousClass1KK r11, X.C194309Pd r12, X.C198409dV r13, X.C193349Lc r14, X.C603237k r15, X.C195189Sv r16, X.C23025B0v r17, X.AnonymousClass8VF r18, X.C19600wD r19, X.C200939iV r20, X.C20810yC r21, X.C199349fA r22, X.AnonymousClass19A r23, X.AnonymousClass3L6 r24, X.AnonymousClass9IN r25, X.C19770wU r26) {
        /*
            r9 = this;
            r8 = 1
            r3 = r13
            r2 = r12
            r5 = r15
            X.C36321k7.A17(r13, r12, r15, r8)
            r1 = r9
            r7 = r26
            r6 = r25
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r17
            r9.A03 = r0
            r9.A00 = r10
            r0 = r24
            r9.A08 = r0
            r9.A01 = r11
            r0 = r19
            r9.A05 = r0
            r0 = r16
            r9.A02 = r0
            r0 = r20
            r9.A06 = r0
            r0 = r23
            r9.A0A = r0
            r0 = r22
            r9.A09 = r0
            r0 = r18
            r9.A04 = r0
            r0 = r21
            r9.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8W4.<init>(X.0wN, X.1KK, X.9Pd, X.9dV, X.9Lc, X.37k, X.9Sv, X.B0v, X.8VF, X.0wD, X.9iV, X.0yC, X.9fA, X.19A, X.3L6, X.9IN, X.0wU):void");
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        A00(this, iOException, "/delivery-error", -1, -1, false, true);
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        A00(this, exc, "/onError", 0, 0, false, false);
    }

    public static final void A00(AnonymousClass8W4 r3, Exception exc, String str, int i, int i2, boolean z, boolean z2) {
        C21700zf A0V;
        Log.e("GetProductCatalogGraphQLService/onError/response-error");
        C200939iV r2 = r3.A06;
        if (r2.A08 == null && (A0V = C165597tg.A0V(r3.A08)) != null) {
            A0V.A06("datasource_catalog");
        }
        UserJid userJid = r2.A07;
        AnonymousClass00C.A07(userJid);
        if (!r3.A08(userJid, i, z)) {
            String A0D = C36321k7.A0D("GetProductCatalogGraphQLService", str);
            if (exc != null) {
                Log.e(A0D, exc);
            } else {
                Log.e(A0D);
            }
            r3.A03.BXL(r2, i2);
            if (!z2) {
                r3.A00.A0E(C36321k7.A0D("GetProductCatalogGraphQLService", str), AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), i2), true);
            }
        }
    }

    public void BVl(UserJid userJid) {
        C36321k7.A1J(userJid, "GetProductCatalogGraphQLServicesendGetBizProductCatalog/direct-connection-error/jid=", C36341k9.A0i(userJid));
        this.A03.BXL(this.A06, 422);
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
