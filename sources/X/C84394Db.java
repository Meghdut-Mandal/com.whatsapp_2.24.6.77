package X;

import android.content.SharedPreferences;

/* renamed from: X.4Db  reason: invalid class name and case insensitive filesystem */
public final class C84394Db extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass35I this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84394Db(AnonymousClass35I r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("pref_consumer_disclosure");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
