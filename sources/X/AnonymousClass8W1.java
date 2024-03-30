package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8W1  reason: invalid class name */
public final class AnonymousClass8W1 extends C177058d8 {
    public final C19700wN A00;
    public final AnonymousClass1KK A01;
    public final C195189Sv A02;
    public final C199899gC A03;
    public final C22917AyT A04;
    public final AnonymousClass8VC A05;
    public final C19600wD A06;
    public final C20810yC A07;
    public final AnonymousClass3L6 A08;
    public final C199349fA A09;
    public final AnonymousClass19A A0A;
    public final AnonymousClass1LA A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8W1(C19700wN r10, AnonymousClass1KK r11, C194309Pd r12, C198409dV r13, C193349Lc r14, C603237k r15, C195189Sv r16, C199899gC r17, C22917AyT ayT, AnonymousClass8VC r19, C19600wD r20, C20810yC r21, C199349fA r22, AnonymousClass19A r23, AnonymousClass3L6 r24, AnonymousClass1LA r25, AnonymousClass9IN r26, C19770wU r27) {
        super(r12, r13, r14, r15, r26, r27, 3);
        AnonymousClass00C.A0D(r13, 1);
        C36331k8.A1H(r12, r15);
        this.A04 = ayT;
        this.A08 = r24;
        this.A01 = r11;
        this.A00 = r10;
        this.A03 = r17;
        this.A02 = r16;
        this.A0A = r23;
        this.A0B = r25;
        this.A06 = r20;
        this.A09 = r22;
        this.A05 = r19;
        this.A07 = r21;
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        A00(new C21114A8z(3), this, iOException, "/onDeliveryFailure", -1, -1, false);
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        A00(new C21114A8z(2), this, exc, "/onError", 0, 0, false);
    }

    public static final void A00(C21114A8z a8z, AnonymousClass8W1 r3, Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductListGraphQLService/onError/response-error");
        r3.A08.A01("plm_details_view_tag");
        if (!r3.A08(r3.A03.A01, i2, z)) {
            String A0D = C36321k7.A0D("GetProductListGraphQLService", str);
            if (exc != null) {
                Log.e(A0D, exc);
            } else {
                Log.e(A0D);
            }
            r3.A04.Blo(a8z);
            r3.A00.A0E(C36321k7.A0D("GetProductListGraphQLService", str), AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), i), true);
        }
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0i = C36341k9.A0i(userJid);
        C36321k7.A1Z(A0i, C165607th.A0r(userJid, "GetProductListGraphQLService/onDirectConnectionError/jid=", A0i));
        this.A08.A01("plm_details_view_tag");
        C21114A8z.A00(this.A04, 2);
        C19700wN r3 = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("error_code=");
        r3.A0E("GetProductListGraphQLService/get product list error - direct connection failed", C36381kD.A10(A0u, 422), true);
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
