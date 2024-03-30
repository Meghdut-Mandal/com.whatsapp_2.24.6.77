package X;

/* renamed from: X.Aiv  reason: case insensitive filesystem */
public final class C22234Aiv extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8A9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22234Aiv(AnonymousClass8A9 r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r2;
        AnonymousClass9QJ r1;
        C17960sM r0;
        C20958A0r a0r = this.$obj;
        boolean z = true;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r4 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r22 = this.this$0.A00;
            AnonymousClass9QJ r12 = r22.A0D;
            C17960sM[] r3 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r12, r22, r4, r3, 10)) {
                C23090B4a b4a = this.this$0.A00.A0H;
                if (b4a != null) {
                    b4a.BPK("socket_connection_connected");
                }
                r2 = this.this$0.A00;
                r1 = r2.A0A;
                r0 = r3[5];
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if (a0r instanceof AnonymousClass8AK) {
            r2 = this.this$0.A00;
            r1 = r2.A06;
            r0 = AnonymousClass84B.A0S[1];
        }
        z = false;
        return Boolean.valueOf(z);
        r2.A00.A03 = r1.A02(r2, r0);
        return Boolean.valueOf(z);
    }
}
