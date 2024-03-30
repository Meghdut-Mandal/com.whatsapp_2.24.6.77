package X;

import android.os.Build;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.3eb  reason: invalid class name and case insensitive filesystem */
public final class C70103eb implements AnonymousClass7gL {
    public final /* synthetic */ AnonymousClass01L A00;
    public final /* synthetic */ HomePlaceholderActivity.HomePlaceholderView A01;

    public C70103eb(AnonymousClass01L r1, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        this.A00 = r1;
        this.A01 = homePlaceholderView;
    }

    public void BkW(int i) {
        int i2;
        if (Build.VERSION.SDK_INT > 21) {
            AnonymousClass01L r4 = this.A00;
            Window window = r4.getWindow();
            if (i == 0) {
                if (window != null) {
                    i2 = this.A01.getVoipReturnToCallBannerBridge().getBackgroundColorRes();
                }
                HomePlaceholderActivity.HomePlaceholderView.A02(this.A01);
            }
            if (window != null) {
                boolean z = this.A01.A0G;
                i2 = R.color.f6nameremoved;
                if (!z) {
                    i2 = C36441kJ.A04(r4);
                }
            }
            HomePlaceholderActivity.HomePlaceholderView.A02(this.A01);
            window.setStatusBarColor(AnonymousClass00F.A00(r4, i2));
            HomePlaceholderActivity.HomePlaceholderView.A02(this.A01);
        }
    }
}
