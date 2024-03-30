package X;

import android.view.KeyEvent;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.util.Log;

/* renamed from: X.3f1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70353f1 implements C87624Pn {
    public final /* synthetic */ CaptionView A00;
    public final /* synthetic */ AnonymousClass4UT A01;

    public /* synthetic */ C70353f1(CaptionView captionView, AnonymousClass4UT r2) {
        this.A00 = captionView;
        this.A01 = r2;
    }

    public final void BZV(KeyEvent keyEvent, int i) {
        CaptionView captionView = this.A00;
        AnonymousClass4UT r2 = this.A01;
        if (i == 4) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                Log.i("MediaCaptionDialog/dismiss/send");
                r2.onDismiss();
            }
        } else if (i != 66 || keyEvent.getAction() != 1 || !captionView.A04) {
        } else {
            if (keyEvent.isCtrlPressed()) {
                C36371kC.A1H(captionView.A0E);
            } else {
                r2.BT7();
            }
        }
    }
}
