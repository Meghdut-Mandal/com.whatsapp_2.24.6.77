package X;

import android.content.SharedPreferences;

/* renamed from: X.1EC  reason: invalid class name */
public final class AnonymousClass1EC extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1EB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1EC(AnonymousClass1EB r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("tos_gating_prefs");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
