package X;

import android.content.SharedPreferences;

/* renamed from: X.1HZ  reason: invalid class name */
public final class AnonymousClass1HZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1HY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1HZ(AnonymousClass1HY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A01.A00("bonsai_prefs");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
