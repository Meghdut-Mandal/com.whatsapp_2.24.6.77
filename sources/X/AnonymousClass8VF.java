package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8VF  reason: invalid class name */
public class AnonymousClass8VF extends AnonymousClass8VH {
    public final C19700wN A00;
    public final C23025B0v A01;
    public final C200939iV A02;
    public final C199349fA A03;
    public final AnonymousClass19A A04;
    public final AnonymousClass3L6 A05;
    public final C31791cO A06;
    public final C19600wD A07;

    public AnonymousClass8VF(C19700wN r2, AnonymousClass1KK r3, C23025B0v b0v, C31791cO r5, C19600wD r6, C200939iV r7, C199349fA r8, AnonymousClass19A r9, AnonymousClass3L6 r10) {
        super(r3, r7.A07);
        this.A06 = r5;
        this.A00 = r2;
        this.A05 = r10;
        this.A04 = r9;
        this.A02 = r7;
        this.A07 = r6;
        this.A01 = b0v;
        this.A03 = r8;
    }

    public static void A00(AnonymousClass8VF r1) {
        C21700zf A0V;
        if (r1.A02.A08 == null && (A0V = C165597tg.A0V(r1.A05)) != null) {
            A0V.A06("datasource_catalog");
        }
    }

    public boolean A07() {
        if (!this.A07.A09()) {
            StringBuilder A0v = AnonymousClass000.A0v("app/sendGetBizProductCatalog jid=");
            A0v.append(this.A02.A07);
            C36321k7.A1a(A0v, " failed");
            return false;
        }
        AnonymousClass8VH.A01(this.A01, this);
        StringBuilder A0v2 = AnonymousClass000.A0v("app/sendGetBizProductCatalog jid=");
        A0v2.append(this.A02.A07);
        C36321k7.A1a(A0v2, " success");
        return true;
    }

    public void BVN(String str) {
        A00(this);
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A01.BXL(this.A02, -1);
    }

    public void BiM(C203399nx r6, String str) {
        A00(this);
        C200939iV r4 = this.A02;
        UserJid userJid = r4.A07;
        C31791cO r2 = this.A06;
        C21112A8x A022 = r2.A02(r6);
        r2.A04(this.A01, userJid, r6);
        if (A022 != null) {
            this.A01.BiO(A022, r4);
            return;
        }
        this.A01.BXL(r4, 0);
        this.A00.A0E("RequestBizProductCatalogProtocolHelper/get product catalog error", "error_code=0", true);
    }
}
