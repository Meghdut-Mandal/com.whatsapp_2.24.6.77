package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.A9f  reason: case insensitive filesystem */
public final class C21120A9f implements C88414Sp {
    public final /* synthetic */ C25621Ha A00;
    public final /* synthetic */ AnonymousClass00S A01;

    public C21120A9f(C25621Ha r1, AnonymousClass00S r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BXH() {
        Log.i("BonsaiTos/error/error");
        this.A01.invoke();
    }

    public void BiH(Map map) {
        C188328zP r0;
        C188328zP r02;
        C188328zP r03;
        Log.i("BonsaiTos/sync/success");
        boolean A1Y = C90494aF.A1Y((Boolean) map.get(20230902L));
        boolean A1Y2 = C90494aF.A1Y((Boolean) map.get(20230901L));
        boolean A1Y3 = C90494aF.A1Y((Boolean) map.get(20240216L));
        C25621Ha r3 = this.A00;
        C63473Ke r1 = (C63473Ke) r3.A03.getValue();
        if (A1Y) {
            r0 = C188328zP.ACCEPTED;
        } else {
            r0 = C188328zP.UNACCEPTED;
        }
        r1.A03(r0, true);
        C63473Ke r12 = (C63473Ke) r3.A02.getValue();
        if (A1Y2) {
            r02 = C188328zP.ACCEPTED;
        } else {
            r02 = C188328zP.UNACCEPTED;
        }
        r12.A03(r02, true);
        C63473Ke r13 = (C63473Ke) r3.A04.getValue();
        if (A1Y3) {
            r03 = C188328zP.ACCEPTED;
        } else {
            r03 = C188328zP.UNACCEPTED;
        }
        r13.A03(r03, true);
        this.A01.invoke();
    }
}
