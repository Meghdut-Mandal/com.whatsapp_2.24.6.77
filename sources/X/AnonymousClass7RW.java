package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7RW  reason: invalid class name */
public final class AnonymousClass7RW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RW(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = ((AnonymousClass68L) obj).A00;
        boolean isInTouchMode = this.this$0.isInTouchMode();
        if (i != 1) {
            if (isInTouchMode) {
                isInTouchMode = this.this$0.requestFocusFromTouch();
            } else {
                isInTouchMode = true;
            }
        }
        return Boolean.valueOf(isInTouchMode);
    }
}
