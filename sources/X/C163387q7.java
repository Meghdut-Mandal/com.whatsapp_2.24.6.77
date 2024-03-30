package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

/* renamed from: X.7q7  reason: invalid class name and case insensitive filesystem */
public class C163387q7 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public C163387q7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScrollChanged() {
        switch (this.A01) {
            case 0:
                AndroidComposeView.A0B((AndroidComposeView) this.A00);
                return;
            case 1:
                AnonymousClass8WH r4 = (AnonymousClass8WH) this.A00;
                int i = 0;
                int bottom = r4.A06.getChildAt(0).getBottom();
                int height = r4.A06.getHeight() + r4.A06.getScrollY();
                View view = r4.A05;
                if (bottom <= height) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            default:
                BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) this.A00;
                boolean z = false;
                boolean z2 = false;
                Rect rect = new Rect(0, 0, C90484aE.A0P().widthPixels, C36411kG.A00());
                if (bloksVideoPlayerView.getLocalVisibleRect(rect) && (rect.height() * 100) / bloksVideoPlayerView.getHeight() >= 60 && (rect.width() * 100) / bloksVideoPlayerView.getWidth() >= 60) {
                    z2 = true;
                }
                C128186Bg r0 = bloksVideoPlayerView.A0B;
                if (z2) {
                    z = true;
                }
                bloksVideoPlayerView.A0B = new C128186Bg(r0.A01, z, r0.A00);
                bloksVideoPlayerView.A02();
                return;
        }
    }
}
