package X;

/* renamed from: X.6JI  reason: invalid class name */
public class AnonymousClass6JI {
    public final C100674vP A00;

    public static Object A00(C100674vP r4, AnonymousClass6MO r5, C160377ku r6) {
        Object obj;
        AnonymousClass6WZ A01;
        AnonymousClass6RN.A00("LispyEvaluation");
        C114095gd.A04.incrementAndGet();
        C1271967i r3 = r4.A00;
        if (!(r3 == null || (A01 = C133266Xn.A01(r3)) == null || !C132926Vv.A03())) {
            A01.A00++;
        }
        try {
            obj = AnonymousClass5ZN.A00(r5, r6, r4);
        } catch (AnonymousClass5VI e) {
            AnonymousClass6RS.A00(r3, "BloksInterpreter", "Exception while evaluating Lispy Script", e);
            obj = null;
        } catch (Throwable th) {
            AnonymousClass68E.A00();
            if (r3 != null) {
                C133266Xn.A07(r3);
            }
            throw th;
        }
        AnonymousClass68E.A00();
        if (r3 != null) {
            C133266Xn.A07(r3);
        }
        return obj;
    }

    public AnonymousClass6JI(C100674vP r1) {
        this.A00 = r1;
    }

    public static void A01(C160377ku r2, Object obj) {
        A00(C142326oh.A03(obj), AnonymousClass6MO.A01, r2);
    }
}
