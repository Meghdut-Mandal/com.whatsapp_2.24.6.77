package X;

import android.content.SharedPreferences;

/* renamed from: X.1FH  reason: invalid class name */
public final class AnonymousClass1FH extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1FG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1FH(AnonymousClass1FG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("community_shared_pref");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
