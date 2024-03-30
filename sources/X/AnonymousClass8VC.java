package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8VC  reason: invalid class name */
public class AnonymousClass8VC extends AnonymousClass8VH {
    public final C19700wN A00;
    public final AnonymousClass1KK A01;
    public final C22917AyT A02;
    public final C199349fA A03;
    public final AnonymousClass19A A04;
    public final AnonymousClass3L6 A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final C31791cO A09;

    public void BVN(String str) {
        this.A05.A01("plm_details_view_tag");
        Log.e("RequestBizProductListProtocolHelper/onDeliveryFailure");
        C21114A8z.A00(this.A02, 3);
    }

    public void BiM(C203399nx r5, String str) {
        this.A05.A01("plm_details_view_tag");
        UserJid userJid = this.A00;
        C31791cO r2 = this.A09;
        C21112A8x A022 = r2.A02(r5);
        r2.A04(this.A01, userJid, r5);
        if (A022 == null) {
            C21114A8z.A00(this.A02, 4);
            this.A00.A0E("RequestBizProductListProtocolHelper/get product catalog error", "error_code=0", true);
            return;
        }
        List list = A022.A02;
        C22917AyT ayT = this.A02;
        C21114A8z a8z = new C21114A8z(1);
        a8z.A01 = list;
        ayT.Blo(a8z);
    }

    public AnonymousClass8VC(C19700wN r3, AnonymousClass1KK r4, C22917AyT ayT, C31791cO r6, UserJid userJid, C199349fA r8, AnonymousClass19A r9, AnonymousClass1LA r10, String str, String str2, List list) {
        super(r4, userJid);
        this.A02 = ayT;
        this.A05 = C165597tg.A0U((C18800tq) C19570wA.A00(C18800tq.class, r10.A00.A00));
        this.A04 = r9;
        this.A01 = r4;
        this.A09 = r6;
        this.A00 = r3;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = list;
        this.A03 = r8;
    }
}
