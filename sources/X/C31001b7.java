package X;

import android.content.SharedPreferences;

/* renamed from: X.1b7  reason: invalid class name and case insensitive filesystem */
public final class C31001b7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30991b6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31001b7(C30991b6 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("pref_consumer_marketing_disclosure_tos");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
