package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7NY  reason: invalid class name */
public final class AnonymousClass7NY extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ boolean $gainFocus;
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NY(AndroidComposeView androidComposeView, boolean z) {
        super(0);
        this.$gainFocus = z;
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = this.$gainFocus;
        AndroidComposeView androidComposeView = this.this$0;
        if (z) {
            androidComposeView.clearFocus();
        } else {
            androidComposeView.requestFocus();
        }
        return AnonymousClass0AJ.A00;
    }
}
