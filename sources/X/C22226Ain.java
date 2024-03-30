package X;

/* renamed from: X.Ain  reason: case insensitive filesystem */
public final class C22226Ain extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22226Ain(AnonymousClass8AH r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        AnonymousClass9QJ r2;
        C17960sM[] r1;
        int i;
        C195999Xe A00;
        C20958A0r a0r = this.$obj;
        boolean z = false;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r4 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r32 = this.this$0.A00;
            AnonymousClass9QJ r12 = r32.A0A;
            C17960sM[] r22 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r12, r32, r4, r22, 5)) {
                r3 = this.this$0.A00;
                A00 = AnonymousClass9QJ.A00(r3.A05, r3, r22, 6);
            }
            return Boolean.valueOf(z);
        }
        if (a0r instanceof AnonymousClass8AK) {
            r3 = this.this$0.A00;
            r2 = r3.A0D;
            r1 = AnonymousClass84B.A0S;
            i = 10;
        } else {
            if (a0r instanceof AnonymousClass8AS) {
                r3 = this.this$0.A00;
                r2 = r3.A06;
                r1 = AnonymousClass84B.A0S;
                i = 1;
            }
            return Boolean.valueOf(z);
        }
        A00 = AnonymousClass9QJ.A00(r2, r3, r1, i);
        r3.A00.A03 = A00;
        z = true;
        return Boolean.valueOf(z);
    }
}
