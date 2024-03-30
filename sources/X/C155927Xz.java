package X;

/* renamed from: X.7Xz  reason: invalid class name and case insensitive filesystem */
public final class C155927Xz extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass6SD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155927Xz(AnonymousClass6SD r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C137846gp r3 = (C137846gp) obj;
        C009003v r4 = (C009003v) obj2;
        C136906fE r1 = this.this$0.A00;
        if (r1 != null) {
            r3.BrB(new C94874iw(r1, r4));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass001.A08("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
