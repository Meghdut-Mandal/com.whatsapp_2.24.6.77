package X;

public final class ATP implements C23059B2f {
    public final /* synthetic */ AI0 A00;

    public ATP(AI0 ai0) {
        this.A00 = ai0;
    }

    public void BJS(C186198vZ r6) {
        AI0 ai0 = this.A00;
        String str = r6.A01;
        AnonymousClass00C.A08(str);
        C27611Oy r2 = ai0.A02;
        Class cls = ai0.A00.A00.A01;
        AnonymousClass00C.A0E(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.infra.graphql.MexIqHandler>");
        Object A002 = r2.A00(str, cls);
        if (!(A002 instanceof AnonymousClass03N)) {
            try {
                B6H b6h = ai0.A01;
                AnonymousClass0AN.A00(A002);
                AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.infra.graphql.MexResponse<T of com.whatsapp.infra.graphql.MexIqHandler>");
                b6h.Bey((C177278dX) A002);
            } catch (Throwable th) {
                ai0.A01.BXQ(th);
            }
        } else {
            B6H b6h2 = ai0.A01;
            Throwable A003 = AnonymousClass0AK.A00(A002);
            if (A003 == null) {
                A003 = new C177308da("Unknown error", (Throwable) null);
            }
            b6h2.BXQ(A003);
        }
    }

    public void BJT(C186278vh r3) {
        AI0 ai0 = this.A00;
        ai0.A01.BXQ(new C177338dd(r3));
    }

    public void BJU(C186118vR r3) {
        AI0 ai0 = this.A00;
        ai0.A01.BXQ(new C177348de(r3));
    }
}
