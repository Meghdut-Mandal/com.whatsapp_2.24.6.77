package X;

/* renamed from: X.Aix  reason: case insensitive filesystem */
public final class C22236Aix extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22236Aix(C20958A0r a0r, AnonymousClass8AB r3) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C20958A0r a0r = this.$obj;
        boolean z = false;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r4 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r2 = this.this$0.A00;
            AnonymousClass9QJ r1 = r2.A0G;
            C17960sM[] r3 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r1, r2, r4, r3, 11)) {
                AnonymousClass84B r22 = this.this$0.A00;
                r22.A00.A03 = AnonymousClass9QJ.A00(r22.A0D, r22, r3, 10);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
