package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8W0  reason: invalid class name */
public final class AnonymousClass8W0 extends C177058d8 {
    public final AnonymousClass9TW A00;
    public final C195189Sv A01;
    public final C193989Nr A02;
    public final AnonymousClass8VG A03;
    public final C19600wD A04;
    public final C20810yC A05;
    public final AnonymousClass3L6 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8W0(AnonymousClass9TW r10, C194309Pd r11, C198409dV r12, C193349Lc r13, C603237k r14, C195189Sv r15, C193989Nr r16, AnonymousClass8VG r17, C19600wD r18, C20810yC r19, AnonymousClass3L6 r20, AnonymousClass9IN r21, C19770wU r22) {
        super(r11, r12, r13, r14, r21, r22, 4);
        AnonymousClass00C.A0D(r12, 1);
        C36421kH.A1J(r11, 4, r14);
        this.A03 = r17;
        this.A01 = r15;
        this.A02 = r16;
        this.A06 = r20;
        this.A04 = r18;
        this.A00 = r10;
        this.A05 = r19;
    }

    public static final void A00(AnonymousClass8W0 r1) {
        C21700zf A0V;
        if (r1.A02.A06 == null && (A0V = C165597tg.A0V(r1.A06)) != null) {
            A0V.A06("datasource_collections");
        }
    }

    public void BVL(IOException iOException) {
        A00(this);
        Log.e("GetCollectionsGraphQLService/onDeliveryFailure");
        C193989Nr r3 = this.A02;
        if (!A08(r3.A05, -1, false)) {
            this.A00.A01(r3, -1);
        }
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0i = C36341k9.A0i(userJid);
        C36321k7.A1Z(A0i, C165607th.A0r(userJid, "GetCollectionsGraphQLService/onDirectConnectionError, jid = ", A0i));
        this.A00.A01(this.A02, 422);
    }

    public void BWk(Exception exc) {
        A00(this);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetCollectionsGraphQLService/onError/error - ");
        A0u.append(0);
        C90504aG.A1G(A0u);
        C193989Nr r1 = this.A02;
        if (!A08(r1.A05, 0, false)) {
            this.A00.A01(r1, 0);
        }
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
