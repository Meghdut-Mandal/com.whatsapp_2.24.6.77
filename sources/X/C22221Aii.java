package X;

/* renamed from: X.Aii  reason: case insensitive filesystem */
public final class C22221Aii extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22221Aii(AnonymousClass8AC r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        C195999Xe A00;
        C20958A0r a0r = this.$obj;
        boolean z = true;
        if (a0r instanceof AnonymousClass8AL) {
            r3 = this.this$0.A00;
            A00 = AnonymousClass9QJ.A00(r3.A0B, r3, AnonymousClass84B.A0S, 3);
        } else if ((a0r instanceof AnonymousClass8AK) || (a0r instanceof AnonymousClass8AS)) {
            r3 = this.this$0.A00;
            A00 = AnonymousClass9QJ.A00(r3.A06, r3, AnonymousClass84B.A0S, 1);
        } else {
            z = false;
            return Boolean.valueOf(z);
        }
        r3.A00.A03 = A00;
        return Boolean.valueOf(z);
    }
}
