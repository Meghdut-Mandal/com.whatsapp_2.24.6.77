package X;

/* renamed from: X.Afx  reason: case insensitive filesystem */
public final class C22050Afx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22050Afx(AnonymousClass8AD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass8AD r3 = this.this$0;
        C23016B0h b0h = r3.A00;
        if (b0h != null) {
            b0h.stop();
            AnonymousClass9AO.A01.A01("sup:InitialStateDelegate", "[INITIAL]: Stopped device discovery manager");
            r3.A00 = null;
        }
        C22050Afx.super.A08();
        return AnonymousClass0AJ.A00;
    }
}
