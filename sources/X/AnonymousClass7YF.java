package X;

/* renamed from: X.7YF  reason: invalid class name */
public final class AnonymousClass7YF extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C019408g $content;
    public final /* synthetic */ C137196fk $holder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YF(C137196fk r2, C019408g r3) {
        super(2);
        this.$holder = r2;
        this.$content = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r5 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r5.BHg()) {
            C137196fk r3 = this.$holder;
            r5.Bum(15454635);
            C137156fg r2 = (C137156fg) AnonymousClass5WI.A00(r5, C137156fg.A03, AnonymousClass7PH.A00, C90524aI.A0w());
            C136916fF r1 = (C136916fF) r5;
            r2.A00 = (C160267kj) AnonymousClass6G0.A01(r1, C112315dh.A00);
            C136916fF.A0M(r1, false);
            r3.A00.setValue(r2);
            this.$content.BKt(this.$holder, r5, C36391kE.A0r());
        } else {
            r5.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
