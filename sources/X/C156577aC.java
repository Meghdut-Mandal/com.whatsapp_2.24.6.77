package X;

/* renamed from: X.7aC  reason: invalid class name and case insensitive filesystem */
public final class C156577aC extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C157467da $indication;
    public final /* synthetic */ C156897b8 $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156577aC(C157467da r2, C156897b8 r3) {
        super(3);
        this.$indication = r2;
        this.$interactionSource = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C161337ma A0L = C90474aD.A0L(obj2, obj3);
        A0L.Bum(-353972293);
        C157467da r2 = this.$indication;
        if (r2 == null) {
            r2 = C136476eS.A00;
        }
        C157477db BnY = r2.BnY(this.$interactionSource, A0L, 0);
        boolean A1T = C90494aF.A1T(A0L, BnY);
        Object BnZ = A0L.BnZ();
        if (A1T || BnZ == C129736Ig.A00) {
            BnZ = new C137336fy(BnY);
            ((C136916fF) A0L).A0R(BnZ);
        }
        C136916fF.A0G((C136916fF) A0L);
        return BnZ;
    }
}
