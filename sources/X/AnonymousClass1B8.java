package X;

import android.content.SharedPreferences;

/* renamed from: X.1B8  reason: invalid class name */
public final class AnonymousClass1B8 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1B7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1B8(AnonymousClass1B7 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.this$0.A00.A00("pref_sticker_shared_file");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
