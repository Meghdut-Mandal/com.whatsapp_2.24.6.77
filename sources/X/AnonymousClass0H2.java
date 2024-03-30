package X;

import android.view.View;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0H2  reason: invalid class name */
public class AnonymousClass0H2 extends AnonymousClass0H3 {
    public void A00(boolean z) {
        if (z) {
            Window window = this.A00;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        View decorView2 = this.A00.getDecorView();
        decorView2.setSystemUiVisibility((~DefaultCrypto.BUFFER_SIZE) & decorView2.getSystemUiVisibility());
    }

    public boolean A01() {
        return AnonymousClass000.A1P(this.A00.getDecorView().getSystemUiVisibility() & DefaultCrypto.BUFFER_SIZE);
    }

    public AnonymousClass0H2(Window window, AnonymousClass0SI r2) {
        super(window, r2);
    }
}
