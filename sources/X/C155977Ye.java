package X;

/* renamed from: X.7Ye  reason: invalid class name and case insensitive filesystem */
public final class C155977Ye extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C019408g $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C156907b9 $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155977Ye(C156907b9 r2, C019408g r3, int i, long j) {
        super(2);
        this.$contentColor = j;
        this.$contentPadding = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r8 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r8.BHg()) {
            C120655rr[] r5 = new C120655rr[1];
            C120655rr.A00(C112215dX.A00, new C133336Xx(this.$contentColor), r5, 0, true);
            AnonymousClass6Fz.A01(r8, AnonymousClass5WH.A00(r8, new AnonymousClass7YS(this.$contentPadding, this.$content, this.$$dirty), 1582292974), r5, 56);
        } else {
            r8.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
