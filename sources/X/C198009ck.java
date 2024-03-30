package X;

/* renamed from: X.9ck  reason: invalid class name and case insensitive filesystem */
public class C198009ck {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;
    public final AnonymousClass19A A02;
    public final C29221Vu A03;
    public final AnonymousClass16T A04;

    public static final C207119ua A00(C198009ck r6, C184308sE r7) {
        String str = r7.A03;
        AnonymousClass00C.A08(str);
        String str2 = r7.A02;
        AnonymousClass00C.A08(str2);
        String str3 = r7.A01;
        AnonymousClass00C.A08(str3);
        AnonymousClass16U A012 = r6.A04.A01(str3);
        C199449fK r2 = new C199449fK();
        Long valueOf = Long.valueOf(str);
        AnonymousClass00C.A08(valueOf);
        r2.A01 = valueOf.longValue();
        Integer valueOf2 = Integer.valueOf(str2);
        AnonymousClass00C.A08(valueOf2);
        r2.A00 = valueOf2.intValue();
        r2.A02 = A012;
        return r2.A01();
    }

    public C198009ck(AnonymousClass17Y r1, C19630wG r2, AnonymousClass16T r3, AnonymousClass19A r4, C29221Vu r5) {
        C36321k7.A1B(r2, r1, r4, r3, r5);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
        this.A04 = r3;
        this.A03 = r5;
    }
}
