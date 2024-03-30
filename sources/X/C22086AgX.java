package X;

import android.content.SharedPreferences;

/* renamed from: X.AgX  reason: case insensitive filesystem */
public final class C22086AgX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9H7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22086AgX(AnonymousClass9H7 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("call_avatar_prefs");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
