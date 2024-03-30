package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7RT  reason: invalid class name */
public final class AnonymousClass7RT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6Q5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RT(AnonymousClass6Q5 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0G;
        C161677nI r6 = (C161677nI) obj;
        if (r6.BMj()) {
            AnonymousClass6Q5 B8S = r6.B8S();
            if (B8S.A01) {
                r6.BO2();
            }
            Map map = B8S.A05;
            AnonymousClass6Q5 r4 = this.this$0;
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                AnonymousClass6Q5.A00((AnonymousClass5h8) A11.getKey(), r4, r6.BCj(), C90484aE.A0G(A11));
            }
            C94894iy BCj = r6.BCj();
            while (true) {
                BCj = BCj.A06;
                AnonymousClass00C.A0B(BCj);
                if (AnonymousClass00C.A0J(BCj, this.this$0.A04.BCj())) {
                    break;
                }
                Set<AnonymousClass5h8> keySet = this.this$0.A01(BCj).keySet();
                AnonymousClass6Q5 r3 = this.this$0;
                for (AnonymousClass5h8 r1 : keySet) {
                    if (r3 instanceof C94794in) {
                        C94924j1 A0N = BCj.A0N();
                        AnonymousClass00C.A0B(A0N);
                        A0G = A0N.A0G(r1);
                    } else {
                        A0G = BCj.A0G(r1);
                    }
                    AnonymousClass6Q5.A00(r1, r3, BCj, A0G);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
