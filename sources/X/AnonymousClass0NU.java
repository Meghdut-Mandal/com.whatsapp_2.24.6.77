package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0NU  reason: invalid class name */
public class AnonymousClass0NU extends C132446Tt {
    public final C226815j A00 = new AnonymousClass0NS(this);
    public final /* synthetic */ AnonymousClass09F A01;
    public final /* synthetic */ C63673Ky A02;
    public final /* synthetic */ AnonymousClass3T1 A03;

    public AnonymousClass0NU(AnonymousClass09F r2, C63673Ky r3, AnonymousClass3T1 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public AnonymousClass141 A0G() {
        AnonymousClass09F r4 = this.A01;
        AnonymousClass16D A022 = r4.A0D;
        UserJid A002 = this.A02.A00();
        AnonymousClass141 A08 = A022.A08(A002);
        if (A08 != null && A08.A0t) {
            return A08;
        }
        r4.A06.A0H(new C11400gF(this));
        C131666Pz r1 = new C131666Pz(C108515Tu.A05);
        r1.A02();
        r1.A03(AnonymousClass6NS.A0F);
        r1.A04(A002);
        if (r4.A0F.A02(r1.A01()) == C131626Pu.A03) {
            Log.e("Unable to fetch the verified name");
        }
        return A022.A08(A002);
    }

    public /* synthetic */ void A0H() {
        this.A01.A0E.registerObserver(this.A00);
    }

    /* renamed from: A0I */
    public void A0C(AnonymousClass141 r4) {
        if (r4 != null) {
            this.A02.A01(r4);
            this.A01.A0T.A05(this.A03, 38);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }
}
