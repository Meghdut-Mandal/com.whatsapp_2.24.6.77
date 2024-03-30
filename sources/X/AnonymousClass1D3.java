package X;

import android.content.SharedPreferences;

/* renamed from: X.1D3  reason: invalid class name */
public final class AnonymousClass1D3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1D2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1D3(AnonymousClass1D2 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("media_bandwidth_shared_preferences_v2");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
