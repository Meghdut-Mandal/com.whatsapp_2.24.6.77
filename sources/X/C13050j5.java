package X;

/* renamed from: X.0j5  reason: invalid class name and case insensitive filesystem */
public final class C13050j5 implements AnonymousClass05G {
    public final Object A00;
    public final C005102h A01;
    public final C009003v A02;

    /* JADX INFO: finally extract failed */
    public Object B6N(Object obj, C023509x r7) {
        C005102h r4 = this.A01;
        Object obj2 = this.A00;
        C009003v r3 = this.A02;
        Object A002 = AnonymousClass0AF.A00(obj2, r4);
        try {
            C12590iL r1 = new C12590iL(r7, r4);
            C07710Yz.A03(r3, 2);
            Object invoke = r3.invoke(obj, r1);
            AnonymousClass0AF.A01(A002, r4);
            return AnonymousClass0AO.A00(invoke);
        } catch (Throwable th) {
            AnonymousClass0AF.A01(A002, r4);
            throw th;
        }
    }

    public C13050j5(C005102h r3, AnonymousClass05G r4) {
        this.A01 = r3;
        Object fold = r3.fold(0, AnonymousClass0AF.A00);
        AnonymousClass00C.A0B(fold);
        this.A00 = fold;
        this.A02 = new AnonymousClass0l7((C023509x) null, r4);
    }
}
