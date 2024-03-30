package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7JB  reason: invalid class name */
public final class AnonymousClass7JB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JB(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int actionMasked;
        MotionEvent motionEvent = this.this$0.A03;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            AndroidComposeView androidComposeView = this.this$0;
            androidComposeView.A01 = SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.A0l);
        }
        return AnonymousClass0AJ.A00;
    }
}
