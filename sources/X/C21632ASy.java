package X;

/* renamed from: X.ASy  reason: case insensitive filesystem */
public final class C21632ASy implements AnonymousClass4S5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public void BmK(AnonymousClass3T1 r5, C52942qQ r6, int i) {
        AnonymousClass00C.A0D(r5, 0);
        byte[] bArr = r5.A1b;
        if (r5.A1I() && bArr != null) {
            ((C26181Je) this.A01.get()).A00(r5.A1N, bArr);
            if (r6 != null) {
                new C019308f(C21632ASy.class);
                throw AnonymousClass001.A0A("onProcessorExecuted");
            }
        } else if (AnonymousClass6HP.A00(r5)) {
            C26271Jn.A01((C21010yW) this.A02.get(), "msgstore/updateMessageOnCurrentThread", ((AnonymousClass1DT) this.A00.get()).A0C(r5));
        }
    }

    public C21632ASy(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
