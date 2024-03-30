package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class AI3 implements C236119d {
    public final /* synthetic */ C194969Ry A00;
    public final /* synthetic */ C35911jS A01;
    public final /* synthetic */ C31511bw A02;
    public final /* synthetic */ C16540pP A03;
    public final /* synthetic */ Set A04;

    public void BiM(C203399nx r6, String str) {
        AnonymousClass00C.A0D(r6, 1);
        C203539oF.A0C(r6, C23213B9v.A00(C90514aH.A0e(r6, this.A01), 48));
        ArrayList A012 = new C198359dQ().A01((List) ((C184078rr) C203539oF.A03(r6, ARN.A00, "surfaces")).A00);
        if (!A012.isEmpty()) {
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                C192669Ic r1 = (C192669Ic) it.next();
                C31261bX r0 = this.A02.A02;
                AnonymousClass00C.A0B(r1);
                r0.A04(r1);
            }
        }
        C31511bw r4 = this.A02;
        C31511bw.A00(this.A00, r4, this.A03, r4.A02.A03("whatsapp_push_notification_event", 11231), this.A04);
        Log.i("OnDemandFetch/fetched");
    }

    public AI3(C194969Ry r1, C35911jS r2, C31511bw r3, C16540pP r4, Set set) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = set;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BVN(String str) {
        this.A00.A00((C87374On) null);
        Log.e("OnDemandFetch/delivery fail");
    }

    public void BWw(C203399nx r4, String str) {
        int A05 = C165597tg.A05(r4);
        this.A00.A00((C87374On) null);
        C36321k7.A1S("OnDemandFetch/Error/", AnonymousClass000.A0u(), A05);
    }
}
