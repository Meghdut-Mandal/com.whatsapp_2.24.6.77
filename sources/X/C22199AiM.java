package X;

import android.content.SharedPreferences;

/* renamed from: X.AiM  reason: case insensitive filesystem */
public final class C22199AiM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9IT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22199AiM(AnonymousClass9IT r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = ((C19890wg) this.this$0.A00.get()).A00("pref_quick_action_bar_display_state");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
