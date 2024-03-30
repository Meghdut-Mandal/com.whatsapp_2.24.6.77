package X;

/* renamed from: X.Aiw  reason: case insensitive filesystem */
public final class C22235Aiw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22235Aiw(C20958A0r a0r, AnonymousClass8AE r3) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        C195999Xe A06;
        C20958A0r a0r = this.$obj;
        boolean z = true;
        if (a0r instanceof AnonymousClass8AJ) {
            this.this$0.A00.A09((AnonymousClass8AJ) a0r);
        } else if (a0r instanceof AnonymousClass8AM) {
            this.this$0.A00.A0A((AnonymousClass8AM) a0r);
        } else {
            if (a0r instanceof AnonymousClass8AW) {
                AnonymousClass8AE.A00(this.this$0);
            } else if (a0r instanceof AnonymousClass8AS) {
                AnonymousClass8AE.A00(this.this$0);
                r3 = this.this$0.A00;
                A06 = r3.A06();
                r3.A00.A03 = A06;
            } else if (a0r instanceof AnonymousClass8AX) {
                AnonymousClass9AO.A01.A01("sup:StreamingStateDelegate", "Already streaming, ignoring message");
            } else if (!(a0r instanceof AnonymousClass8AT)) {
                z = false;
            }
            r3 = this.this$0.A00;
            A06 = AnonymousClass9QJ.A00(r3.A07, r3, AnonymousClass84B.A0S, 7);
            r3.A00.A03 = A06;
        }
        return Boolean.valueOf(z);
    }
}
