package X;

import java.util.Set;

/* renamed from: X.14C  reason: invalid class name */
public class AnonymousClass14C {
    public final /* synthetic */ C220712t A00;

    public AnonymousClass14C(C220712t r1) {
        this.A00 = r1;
    }

    public static void A00(AnonymousClass14C r5) {
        int i;
        AnonymousClass005 r3 = r5.A00.A01;
        ((C24731Do) r3.get()).A0T.A09("ChatManager_loadHostedJids");
        if (((C24731Do) r3.get()).A0Q.A00()) {
            C20400xV r0 = ((C24731Do) r3.get()).A0E;
            C20400xV.A00(r0);
            Set set = r0.A00;
            if (set == null) {
                AnonymousClass00C.A0G("hostedUserJids");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            i = set.size();
        } else {
            i = -1;
        }
        AnonymousClass11e r02 = ((C24731Do) r3.get()).A0T;
        String valueOf = String.valueOf(i);
        C21700zf r4 = r02.A03;
        if (r4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatManager_loadHostedJids");
            sb.append("_end");
            String obj = sb.toString();
            C21710zg r2 = r4.A04;
            if (r2.A01()) {
                r4.A06.markerPoint(r2.A06, obj, valueOf);
            }
        }
    }
}
