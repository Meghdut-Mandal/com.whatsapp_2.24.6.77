package X;

import android.content.SharedPreferences;

/* renamed from: X.1Co  reason: invalid class name and case insensitive filesystem */
public final class C24471Co extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C24461Cn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24471Co(C24461Cn r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("backup_prefs");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
