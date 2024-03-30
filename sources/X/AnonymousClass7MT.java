package X;

import android.content.SharedPreferences;

/* renamed from: X.7MT  reason: invalid class name */
public final class AnonymousClass7MT extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1W9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7MT(AnonymousClass1W9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A03.A00("incoming_stanza_processing_cache_msgs");
        AnonymousClass00C.A08(A00);
        AnonymousClass1W9 r0 = this.this$0;
        return new C130436Lb(A00, r0.A06, C36371kC.A07(r0.A02.A07(7729)));
    }
}
