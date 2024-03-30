package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Aft  reason: case insensitive filesystem */
public final class C22046Aft extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8A8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22046Aft(AnonymousClass8A8 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22046Aft.super.A07();
        C007403e r1 = this.this$0.A00.A01.A0H;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
            AnonymousClass9AO.A01.A01("sup:ConnectedStateDelegate", "[CONNECTED]: Cancelling timeout job");
        }
        this.this$0.A00.A0L.invoke(AnonymousClass89R.A00);
        AnonymousClass84B r3 = this.this$0.A00;
        r3.A00.A03 = AnonymousClass9QJ.A00(r3.A07, r3, AnonymousClass84B.A0S, 7);
        return AnonymousClass0AJ.A00;
    }
}
