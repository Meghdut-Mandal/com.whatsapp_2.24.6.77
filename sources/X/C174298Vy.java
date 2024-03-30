package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8Vy  reason: invalid class name and case insensitive filesystem */
public final class C174298Vy extends C177058d8 {
    public final AnonymousClass9HC A00;
    public final AnonymousClass9HF A01;
    public final C195189Sv A02;
    public final C19600wD A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174298Vy(AnonymousClass9HC r10, AnonymousClass9HF r11, C194309Pd r12, C198409dV r13, C193349Lc r14, C603237k r15, C195189Sv r16, C19600wD r17, AnonymousClass9IN r18, C19770wU r19) {
        super(r12, r13, r14, r15, r18, r19, 8);
        C36321k7.A17(r13, r12, r15, 1);
        this.A02 = r16;
        this.A03 = r17;
        this.A01 = r11;
        this.A00 = r10;
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onDeliveryFailure", iOException);
        if (!A08(this.A01.A00, -1, false)) {
            A00(this, -1);
        }
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onError", exc);
        if (!A08(this.A01.A00, 0, false)) {
            A00(this, 0);
        }
    }

    public static final void A00(C174298Vy r4, int i) {
        AnonymousClass9HC r1 = r4.A00;
        r1.A01.A07.A0H(new C81333wq(r1.A00, i, 11, r4.A01));
    }

    public void BVl(UserJid userJid) {
        A00(this, 422);
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
