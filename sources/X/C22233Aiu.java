package X;

/* renamed from: X.Aiu  reason: case insensitive filesystem */
public final class C22233Aiu extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22233Aiu(AnonymousClass8AA r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        C195999Xe A00;
        AnonymousClass9QJ r1;
        int i;
        C20958A0r a0r = this.$obj;
        boolean z = false;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r5 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r32 = this.this$0.A00;
            AnonymousClass9QJ r12 = r32.A0C;
            C17960sM[] r2 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r12, r32, r5, r2, 9)) {
                C23090B4a b4a = this.this$0.A00.A0H;
                if (b4a != null) {
                    b4a.BPK("socket_connection_connected");
                }
                r3 = this.this$0.A00;
                if (r3.A0J.intValue() == 2) {
                    r1 = r3.A0B;
                    i = 3;
                } else {
                    r1 = r3.A09;
                    i = 4;
                }
                A00 = AnonymousClass9QJ.A00(r1, r3, r2, i);
            }
            return Boolean.valueOf(z);
        }
        if ((a0r instanceof AnonymousClass8AK) || (a0r instanceof AnonymousClass8AS)) {
            r3 = this.this$0.A00;
            A00 = AnonymousClass9QJ.A00(r3.A06, r3, AnonymousClass84B.A0S, 1);
        }
        return Boolean.valueOf(z);
        r3.A00.A03 = A00;
        z = true;
        return Boolean.valueOf(z);
    }
}
