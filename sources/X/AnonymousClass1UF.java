package X;

/* renamed from: X.1UF  reason: invalid class name */
public final class AnonymousClass1UF {
    public AnonymousClass1UA A00;
    public C19770wU A01;

    public final void A00(C128936Ee r6, C22998Azo azo, C46112Uy r8, Runnable runnable) {
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass1UA r1 = this.A00;
        if (r1 != null) {
            AnonymousClass6OQ A002 = r1.A00(C113435fX.A00);
            if (A002 == null) {
                azo.onError(1);
                return;
            }
            Object A003 = r8.A00((Object) null);
            C18740tg.A06(A003);
            Integer num = (Integer) A003;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 3489016) {
                    if (intValue == 3489018) {
                        if (r6.A04()) {
                            AnonymousClass1UA r2 = this.A00;
                            if (r2 != null) {
                                r2.A01(A002, new C23188B8w(azo, num, runnable, 0), r6);
                                return;
                            } else {
                                AnonymousClass00C.A0G("fbUserEntityManagement");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                        }
                    } else if (intValue == 3489017) {
                        if (r6.A04()) {
                            AnonymousClass1UA r22 = this.A00;
                            if (r22 != null) {
                                r22.A02(A002, new C23188B8w(azo, num, runnable, 1), r6);
                                return;
                            } else {
                                AnonymousClass00C.A0G("fbUserEntityManagement");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                        }
                    } else if (intValue == 3489014) {
                        Long A012 = r6.A01();
                        if (A012 != null) {
                            C19770wU r3 = this.A01;
                            if (r3 != null) {
                                r3.BpM(runnable, "WaffleGraphqlErrorHandler/retryWithBackoff", A012.longValue());
                                return;
                            } else {
                                AnonymousClass00C.A0G("waWorkers");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                        }
                    }
                }
                azo.onError(intValue);
                return;
            }
            AnonymousClass00C.A0B(num);
            azo.onError(num.intValue());
            return;
        }
        AnonymousClass00C.A0G("fbUserEntityManagement");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
