package X;

import android.os.BaseBundle;

/* renamed from: X.4As  reason: invalid class name and case insensitive filesystem */
public final class C83784As extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C43922Kk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83784As(C43922Kk r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(((BaseBundle) this.this$0.A0G.getValue()).getInt("EXTRA_SELECTION_SAVE_STATE_HEIGHT", 0));
    }
}
