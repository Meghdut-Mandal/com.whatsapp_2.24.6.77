package X;

/* renamed from: X.7aH  reason: invalid class name and case insensitive filesystem */
public final class C156627aH extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C157597dn $currentItemProvider;
    public final /* synthetic */ C009003v $measurePolicy;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C114265gw $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156627aH(C114265gw r2, C157597dn r3, C161267mT r4, C009003v r5) {
        super(3);
        this.$prefetchState = r2;
        this.$modifier = r4;
        this.$measurePolicy = r5;
        this.$currentItemProvider = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C158807iG r12 = (C158807iG) obj;
        C161337ma A0L = C90474aD.A0L(obj2, obj3);
        C157597dn r4 = this.$currentItemProvider;
        A0L.Bum(-492369756);
        Object BnZ = A0L.BnZ();
        Object obj4 = C129736Ig.A00;
        if (BnZ == obj4) {
            BnZ = new C1268966b(r12, new C151887Ij(r4));
            ((C136916fF) A0L).A0R(BnZ);
        }
        C136916fF r42 = (C136916fF) A0L;
        C136916fF.A0M(r42, false);
        C1268966b r3 = (C1268966b) BnZ;
        A0L.Bum(-492369756);
        Object BnZ2 = A0L.BnZ();
        if (BnZ2 == obj4) {
            BnZ2 = new AnonymousClass6SD(new C137826gn(r3));
            r42.A0R(BnZ2);
        }
        C136916fF.A0M(r42, false);
        AnonymousClass6SD r7 = (AnonymousClass6SD) BnZ2;
        C114265gw r1 = this.$prefetchState;
        A0L.Bum(-1523807258);
        if (r1 != null) {
            AnonymousClass5W5.A00(r3, this.$prefetchState, A0L, r7, 576);
        }
        C136916fF.A0M(r42, false);
        C161267mT r6 = this.$modifier;
        C009003v r13 = this.$measurePolicy;
        boolean A1X = C90464aC.A1X(A0L, r3, r13, 511388516);
        Object BnZ3 = A0L.BnZ();
        if (A1X || BnZ3 == obj4) {
            BnZ3 = new AnonymousClass7YE(r3, r13);
            r42.A0R(BnZ3);
        }
        C136916fF.A0M(r42, false);
        C129576Hp.A00(A0L, r6, r7, (C009003v) BnZ3, 8, 0);
        return AnonymousClass0AJ.A00;
    }
}
