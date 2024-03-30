package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;

public final class AI5 implements C236119d {
    public final /* synthetic */ C194969Ry A00;
    public final /* synthetic */ C35911jS A01;
    public final /* synthetic */ C31511bw A02;
    public final /* synthetic */ C16540pP A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void BiM(C203399nx r14, String str) {
        List<C21642ATi> list;
        AnonymousClass00C.A0D(r14, 1);
        C203539oF.A0C(r14, C23213B9v.A00(C90514aH.A0e(r14, this.A01), 48));
        C192669Ic r0 = (C192669Ic) C36441kJ.A12(new C198359dQ().A01((List) ((C184078rr) C203539oF.A03(r14, ARN.A00, "surfaces")).A00));
        if (r0 != null) {
            list = C90524aI.A0o("whatsapp_push_notification_event", r0.A01);
        } else {
            list = null;
        }
        C31511bw r8 = this.A02;
        String str2 = this.A05;
        String str3 = this.A04;
        C194969Ry r4 = this.A00;
        C16540pP r3 = this.A03;
        if (list == null || list.isEmpty()) {
            r4.A00((C87374On) null);
        } else {
            for (C21642ATi aTi : list) {
                if (AnonymousClass00C.A0J(aTi.A0F, str2) && AnonymousClass00C.A0J(aTi.A0D, str3)) {
                    HashSet A16 = C36441kJ.A16();
                    A16.add("whatsapp_push_notification_event");
                    r4.A00(C31511bw.A03.A01(r8.A01.A00(r3, 11231, Integer.valueOf(C90484aE.A0B(aTi.A0B)), A16), C90484aE.A0r(aTi)));
                }
            }
        }
        Log.i("OnDemandFetch/fetched");
    }

    public AI5(C194969Ry r1, C35911jS r2, C31511bw r3, C16540pP r4, String str, String str2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BVN(String str) {
        Log.e("OnDemandFetch/delivery fail");
        this.A00.A00((C87374On) null);
    }

    public void BWw(C203399nx r4, String str) {
        C36321k7.A1S("OnDemandFetch/Error/", AnonymousClass000.A0u(), C165597tg.A05(r4));
        this.A00.A00((C87374On) null);
    }
}
