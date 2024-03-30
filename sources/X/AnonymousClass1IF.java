package X;

import android.content.SharedPreferences;

/* renamed from: X.1IF  reason: invalid class name */
public final class AnonymousClass1IF extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1IE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1IF(AnonymousClass1IE r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("pref_ctwa_entry_point_history");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
