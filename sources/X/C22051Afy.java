package X;

import android.content.Context;

/* renamed from: X.Afy  reason: case insensitive filesystem */
public final class C22051Afy extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22051Afy(AnonymousClass8AD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C23016B0h b0h;
        C200159gk r5 = AnonymousClass9AO.A01;
        r5.A01("sup:InitialStateDelegate", "[INITIAL]: Starting device discovery");
        this.this$0.A02.A0L.invoke(AnonymousClass89V.A00);
        AnonymousClass8AD r6 = this.this$0;
        AnonymousClass00T r0 = C1905398u.A00;
        AnonymousClass84B r3 = r6.A02;
        Context context = r6.A01;
        if (r3.A0J.intValue() == 2) {
            b0h = new A32(context, r3);
        } else {
            b0h = (C23016B0h) C1905398u.A00.getValue();
        }
        r6.A00 = b0h;
        AnonymousClass8AD r2 = this.this$0;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[INITIAL]: Attempt device discovery with manager ");
        r5.A01("sup:InitialStateDelegate", AnonymousClass000.A0o(r2.A00, A0u));
        AnonymousClass8AD r22 = this.this$0;
        C23016B0h b0h2 = r22.A00;
        if (b0h2 != null) {
            b0h2.BuL(AnonymousClass97B.A00(r22, 4));
        }
        return AnonymousClass0AJ.A00;
    }
}
