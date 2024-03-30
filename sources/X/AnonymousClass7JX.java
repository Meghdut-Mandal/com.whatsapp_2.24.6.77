package X;

import android.content.SharedPreferences;

/* renamed from: X.7JX  reason: invalid class name */
public final class AnonymousClass7JX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C118975p2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JX(C118975p2 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("app_health");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
