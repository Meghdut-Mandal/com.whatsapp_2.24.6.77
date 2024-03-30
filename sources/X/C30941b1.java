package X;

import android.content.SharedPreferences;

/* renamed from: X.1b1  reason: invalid class name and case insensitive filesystem */
public final class C30941b1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30931b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30941b1(C30931b0 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("pref_consumer_marketing_disclosure_cooldown");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
