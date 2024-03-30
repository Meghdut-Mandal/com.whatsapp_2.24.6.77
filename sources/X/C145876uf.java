package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6uf  reason: invalid class name and case insensitive filesystem */
public final class C145876uf implements C159487jR {
    public final /* synthetic */ AnonymousClass6QG A00;
    public final /* synthetic */ C122315ue A01;
    public final /* synthetic */ C132406Tm A02;
    public final /* synthetic */ C006302t A03;

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C124875yw r9 = (C124875yw) obj;
        AnonymousClass00C.A0D(r9, 0);
        C132406Tm r10 = this.A02;
        if (r10 != null) {
            r10.A06("text_search_local_business_request_end");
            r10.A06("qpl_business_ranking_start");
        }
        List list = r9.A0C;
        AnonymousClass6QG r2 = this.A00;
        C131836Qv.A01(r2, list);
        ArrayList A15 = C36441kJ.A15(list);
        C130846Mq r0 = this.A01.A01;
        ArrayList A0r = C90484aE.A0r(A15);
        String str = r9.A03;
        r0.A00(new AnonymousClass6DV(r2, new C165407tN(r9, r10, this.A03, A15, 0), r9.A02, str, A0r, 1));
    }

    public C145876uf(AnonymousClass6QG r1, C122315ue r2, C132406Tm r3, C006302t r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void BWx(C1261662u r3, int i) {
        this.A03.invoke(new AnonymousClass519(i));
        C132406Tm r1 = this.A02;
        if (r1 != null) {
            r1.A06("text_search_local_business_request_end");
        }
    }
}
