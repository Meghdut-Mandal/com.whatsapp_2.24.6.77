package X;

/* renamed from: X.7aF  reason: invalid class name and case insensitive filesystem */
public final class C156607aF extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ boolean $enabled = true;
    public final /* synthetic */ AnonymousClass00S $onClick;
    public final /* synthetic */ String $onClickLabel = null;
    public final /* synthetic */ AnonymousClass68P $role = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156607aF(AnonymousClass00S r3) {
        super(3);
        this.$onClick = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C161337ma A0L = C90474aD.A0L(obj2, obj3);
        A0L.Bum(-756081143);
        C137296fu r5 = C161267mT.A00;
        C136916fF r2 = (C136916fF) A0L;
        C157467da r3 = (C157467da) AnonymousClass6G0.A01(r2, C112175dT.A00);
        Object A0X = C90494aF.A0X(A0L);
        if (A0X == C129736Ig.A00) {
            A0X = new C136726et();
            r2.A0R(A0X);
        }
        C136916fF.A0M(r2, false);
        boolean z = this.$enabled;
        C161267mT A00 = C108995Vu.A00(r3, (C161437mu) A0X, r5, this.$role, this.$onClickLabel, this.$onClick, z);
        C136916fF.A0M(r2, false);
        return A00;
    }
}
