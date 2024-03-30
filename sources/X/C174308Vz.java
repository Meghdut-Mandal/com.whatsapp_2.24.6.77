package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8Vz  reason: invalid class name and case insensitive filesystem */
public final class C174308Vz extends C177058d8 {
    public boolean A00;
    public final C128516Co A01;
    public final C195189Sv A02;
    public final C23023B0t A03;
    public final C19600wD A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174308Vz(C128516Co r10, C194309Pd r11, C198409dV r12, C193349Lc r13, C603237k r14, C195189Sv r15, C23023B0t b0t, C19600wD r17, AnonymousClass9IN r18, C19770wU r19) {
        super(r11, r12, r13, r14, r18, r19, 6);
        C36321k7.A17(r12, r11, r14, 1);
        this.A02 = r15;
        this.A04 = r17;
        this.A03 = b0t;
        this.A01 = r10;
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        Log.e("GetCategoriesGraphQLService/onDeliveryFailure", iOException);
        if (this.A00) {
            try {
                C128516Co r1 = this.A01;
                if (!A08(r1.A02, -1, false)) {
                    this.A03.BXJ(r1, -1);
                }
            } catch (Exception unused) {
                this.A03.BXJ(this.A01, 0);
            }
        } else {
            this.A00 = true;
            A06();
        }
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        Log.e("GetCategoriesGraphQLService/onError", exc);
        try {
            C128516Co r1 = this.A01;
            if (!A08(r1.A02, 0, false)) {
                this.A03.BXJ(r1, 0);
            }
        } catch (Exception unused) {
            this.A03.BXJ(this.A01, 0);
        }
    }

    public void BVl(UserJid userJid) {
        this.A03.BXJ(this.A01, 422);
    }

    public void BVm(UserJid userJid) {
        A06();
    }
}
