package X;

import android.view.ViewTreeObserver;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.4Yp  reason: invalid class name and case insensitive filesystem */
public class C89974Yp implements C16610pn {
    public Object A00;
    public final int A01;

    public C89974Yp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BVt(C07200Ws r4) {
        ViewTreeObserver viewTreeObserver;
        switch (this.A01) {
            case 0:
                ((DeleteAccountFeedback) this.A00).A07 = false;
                return;
            case 1:
                AnonymousClass3TV r2 = (AnonymousClass3TV) this.A00;
                C18740tg.A0D(AnonymousClass000.A1V(r2.A00), "GroupConversationMenu/onPopupMenuDismissListener selected menu item is null");
                r2.A00.setAlpha(1.0f);
                return;
            default:
                C67123Yp r22 = (C67123Yp) this.A00;
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) r22.A06;
                if (!(viewTreeObserver2 == null || !viewTreeObserver2.isAlive() || (viewTreeObserver = (ViewTreeObserver) r22.A06) == null)) {
                    viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) r22.A02);
                }
                r22.A06 = null;
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) r22.A03;
                statusPlaybackBaseFragment.A06 = false;
                statusPlaybackBaseFragment.A1a();
                return;
        }
    }
}
