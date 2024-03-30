package X;

import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7RY  reason: invalid class name */
public final class AnonymousClass7RY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RY(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        int i;
        KeyEvent keyEvent = ((AnonymousClass68M) obj).A00;
        long A01 = C109135Wk.A01(keyEvent);
        if (A01 == C131386Ov.A0C) {
            i = C36371kC.A00(keyEvent.isShiftPressed() ? 1 : 0);
        } else if (A01 == C131386Ov.A05) {
            i = 4;
        } else if (A01 == C131386Ov.A04) {
            i = 3;
        } else if (A01 == C131386Ov.A06 || A01 == C131386Ov.A0B) {
            i = 5;
        } else if (A01 == C131386Ov.A03 || A01 == C131386Ov.A0A) {
            i = 6;
        } else if (A01 == C131386Ov.A02 || A01 == C131386Ov.A07 || A01 == C131386Ov.A09) {
            i = 7;
        } else {
            if (A01 == C131386Ov.A01 || A01 == C131386Ov.A08) {
                i = 8;
            }
            z = false;
            return Boolean.valueOf(z);
        }
        C131226Of r2 = new C131226Of(i);
        if (keyEvent.getAction() == 0) {
            z = this.this$0.A0R.BPy(r2.A00);
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
