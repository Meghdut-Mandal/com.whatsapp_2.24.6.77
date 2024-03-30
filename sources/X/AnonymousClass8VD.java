package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8VD  reason: invalid class name */
public class AnonymousClass8VD extends AnonymousClass8VH {
    public final C23028B0y A00;
    public final C19600wD A01;
    public final AnonymousClass9NZ A02;
    public final C199349fA A03;
    public final AnonymousClass19A A04;
    public final AnonymousClass3L6 A05;
    public final C29461Ws A06;
    public final C31791cO A07;

    public AnonymousClass8VD(AnonymousClass1KK r2, C29461Ws r3, C23028B0y b0y, C31791cO r5, C19600wD r6, AnonymousClass9NZ r7, C199349fA r8, AnonymousClass19A r9, AnonymousClass3L6 r10) {
        super(r2, r7.A01);
        this.A07 = r5;
        this.A04 = r9;
        this.A05 = r10;
        this.A02 = r7;
        this.A06 = r3;
        this.A01 = r6;
        this.A03 = r8;
        this.A00 = b0y;
    }

    public void BVN(String str) {
        Log.e("ProductRequestProtocolHelper/onDeliveryFailure");
        this.A05.A01("view_product_tag");
        this.A00.BXY(this.A02, 0);
    }

    public void BiM(C203399nx r7, String str) {
        this.A05.A01("view_product_tag");
        C31791cO r2 = this.A07;
        C21112A8x A022 = r2.A02(r7);
        AnonymousClass9NZ r5 = this.A02;
        UserJid userJid = r5.A01;
        r2.A04(this.A01, userJid, r7);
        if (A022 != null) {
            List list = A022.A02;
            if (!list.isEmpty()) {
                this.A06.A0C((C207269up) list.get(0), userJid);
                this.A00.BXa(r5, ((C207269up) list.get(0)).A0F);
                return;
            }
        }
        Log.e("ProductRequestProtocolHelper/onSuccess/error: empty response");
    }
}
