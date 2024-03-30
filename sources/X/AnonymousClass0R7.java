package X;

/* renamed from: X.0R7  reason: invalid class name */
public abstract class AnonymousClass0R7 {
    public static final Object A00(Object obj, C009003v r2, C15540nV r3) {
        Object obj2;
        Object A0Y;
        try {
            C07710Yz.A03(r2, 2);
            obj2 = r2.invoke(obj, r3);
        } catch (Throwable th) {
            obj2 = new AnonymousClass0AT(th);
        }
        AnonymousClass0AO r22 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        if (obj2 == r22 || (A0Y = r3.A0Y(obj2)) == C007803i.A00) {
            return r22;
        }
        if (!(A0Y instanceof AnonymousClass0AT)) {
            return C007803i.A01(A0Y);
        }
        throw ((AnonymousClass0AT) A0Y).A00;
    }
}
