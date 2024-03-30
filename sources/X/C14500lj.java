package X;

/* renamed from: X.0lj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C14500lj extends C03030Cw implements C019408g {
    public static final C14500lj A00 = new C14500lj();

    public C14500lj() {
        super(3, AnonymousClass0SV.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        AnonymousClass0SV r7 = (AnonymousClass0SV) obj;
        C15200mr r8 = (C15200mr) obj2;
        long j = r7.A00;
        if (j <= 0) {
            r8.A01 = AnonymousClass0AJ.A00;
        } else {
            C11710gs r4 = new C11710gs(r7, r8);
            AnonymousClass00C.A0E(r8, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C005102h r1 = r8.A04;
            r8.A00 = C07330Xf.A02(r1).BL6(r4, r1, j);
        }
        return AnonymousClass0AJ.A00;
    }
}
