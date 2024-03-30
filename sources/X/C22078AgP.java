package X;

/* renamed from: X.AgP  reason: case insensitive filesystem */
public final class C22078AgP extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C200219gt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22078AgP(C200219gt r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C23090B4a b4a = this.this$0.A07;
        if (b4a != null && ((AnonymousClass6n9) b4a).A00 == 1) {
            b4a.BPK("first_video_frame_rendered");
            b4a.BPF(2);
            synchronized (C199259ez.A03) {
            }
            ((AnonymousClass6n9) b4a).A00 = 2;
        }
        C200219gt r1 = this.this$0;
        r1.A07(r1.A03 + 1);
        return AnonymousClass0AJ.A00;
    }
}
