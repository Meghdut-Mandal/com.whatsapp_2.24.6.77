package X;

/* renamed from: X.0A2  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass0A2 {
    public static final Object A00(C023509x r4, C005102h r5, C009003v r6) {
        C005102h A00;
        C005102h context = r4.getContext();
        if (!((Boolean) r5.fold(false, AnonymousClass0A4.A00)).booleanValue()) {
            A00 = context.plus(r5);
        } else {
            A00 = AnonymousClass0A3.A00(context, r5, false);
        }
        C07570Yj.A04(A00);
        if (A00 == context) {
            C15540nV r0 = new C15540nV(r4, A00);
            return AnonymousClass0R7.A00(r0, r6, r0);
        }
        C006202s r02 = C005402k.A00;
        if (AnonymousClass00C.A0J(A00.get(r02), context.get(r02))) {
            C15510nS r3 = new C15510nS(r4, A00);
            C005102h context2 = r3.getContext();
            Object A002 = AnonymousClass0AF.A00((Object) null, context2);
            try {
                return AnonymousClass0R7.A00(r3, r6, r3);
            } finally {
                AnonymousClass0AF.A01(A002, context2);
            }
        } else {
            C15520nT r03 = new C15520nT(r4, A00);
            AnonymousClass0A9.A00(r03, r03, r6);
            return r03.A11();
        }
    }

    public static final C15140ml A01(Integer num, C005102h r3, C009003v r4, AnonymousClass040 r5) {
        C15140ml r0 = new C15140ml(AnonymousClass0A3.A01(r3, r5));
        r0.A0x(num, r0, r4);
        return r0;
    }

    public static final AnonymousClass0A6 A02(Integer num, C005102h r4, C009003v r5, AnonymousClass040 r6) {
        AnonymousClass0A6 r1;
        C005102h A01 = AnonymousClass0A3.A01(r4, r6);
        if (num == C023109s.A01) {
            r1 = new AnonymousClass0n7(A01, r5);
        } else {
            r1 = new AnonymousClass0A6(A01, true);
        }
        r1.A0x(num, r1, r5);
        return r1;
    }
}
