package X;

/* renamed from: X.0nK  reason: invalid class name and case insensitive filesystem */
public abstract class C15430nK extends C13130jD {
    public final AnonymousClass05H A00;

    public abstract Object A05(C023509x r1, AnonymousClass05G r2);

    public Object A00(C023509x r2, C18000sQ r3) {
        return AnonymousClass0AO.A00(A05(r2, new C13030j3(r3)));
    }

    /* JADX INFO: finally extract failed */
    public Object B36(C023509x r6, AnonymousClass05G r7) {
        Object B36;
        C005102h A002;
        if (this.A00 == -3) {
            C005102h context = r6.getContext();
            C005102h r2 = this.A02;
            if (!AnonymousClass000.A1X(r2.fold(false, AnonymousClass0A4.A00))) {
                A002 = context.plus(r2);
            } else {
                A002 = AnonymousClass0A3.A00(context, r2, false);
            }
            if (AnonymousClass00C.A0J(A002, context)) {
                B36 = A05(r6, r7);
            } else {
                C006202s r0 = C005402k.A00;
                if (AnonymousClass00C.A0J(A002.get(r0), context.get(r0))) {
                    C005102h context2 = r6.getContext();
                    if (!(r7 instanceof C13030j3) && !(r7 instanceof C13080j8)) {
                        r7 = new C13050j5(context2, r7);
                    }
                    AnonymousClass0l5 r3 = new AnonymousClass0l5((C023509x) null, this);
                    Object fold = A002.fold(0, AnonymousClass0AF.A00);
                    AnonymousClass00C.A0B(fold);
                    Object A003 = AnonymousClass0AF.A00(fold, A002);
                    try {
                        C12590iL r1 = new C12590iL(r6, A002);
                        C07710Yz.A03(r3, 2);
                        Object invoke = r3.invoke(r7, r1);
                        AnonymousClass0AF.A01(A003, A002);
                        B36 = AnonymousClass0AO.A00(invoke);
                    } catch (Throwable th) {
                        AnonymousClass0AF.A01(A003, A002);
                        throw th;
                    }
                }
            }
            return AnonymousClass0AO.A00(B36);
        }
        B36 = super.B36(r6, r7);
        return AnonymousClass0AO.A00(B36);
    }

    public C15430nK(Integer num, C005102h r2, AnonymousClass05H r3, int i) {
        super(num, r2, i);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(" -> ");
        return AnonymousClass000.A0q(super.toString(), A0u);
    }
}
