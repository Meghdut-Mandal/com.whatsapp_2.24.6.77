package X;

/* renamed from: X.8tV  reason: invalid class name */
public class AnonymousClass8tV extends C118095nK implements C22835Awk {
    public Object A00;
    public final int A01;

    public AnonymousClass8tV(C203399nx r10, int i) {
        String[] A1Z;
        Class<Long> cls;
        long j;
        this.A01 = i;
        C203399nx r2 = r10;
        String[] A0L = C203399nx.A0L(r10);
        Class<String> cls2 = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        if (i != 0) {
            C203379ns.A03(r2, cls2, A0P, A0Q, "email-otp-stale", A0L, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 536;
        } else {
            C203379ns.A03(r2, cls2, A0P, A0Q, "email-guess-too-recent", A0L, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 537;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, false);
        this.A00 = C203539oF.A07(r2, cls, C36411kG.A0t(), A0Q, (Object) null, new String[]{"wait_time"}, false);
        this.A00 = r10;
    }
}
