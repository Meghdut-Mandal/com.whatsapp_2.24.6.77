package X;

/* renamed from: X.7aN  reason: invalid class name and case insensitive filesystem */
public final class C156687aN extends AnonymousClass00R implements C019508h {
    public final /* synthetic */ C019408g $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156687aN(C019408g r2) {
        super(4);
        this.$content = r2;
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        C161337ma r6 = (C161337ma) obj3;
        int A0I = AnonymousClass000.A0I(obj4);
        if ((A0I & 14) == 0) {
            A0I |= C90484aE.A04(r6.B2f(obj) ? 1 : 0);
        }
        if ((A0I & 651) != 130 || !r6.BHg()) {
            this.$content.BKt(obj, r6, Integer.valueOf(A0I & 14));
        } else {
            r6.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
