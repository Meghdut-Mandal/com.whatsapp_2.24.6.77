package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0H4  reason: invalid class name */
public class AnonymousClass0H4 extends AnonymousClass0UD {
    public Window A00;
    public final WindowInsetsController A01;
    public final AnonymousClass007 A02 = new AnonymousClass007(0);
    public final AnonymousClass0SI A03;
    public final AnonymousClass0SJ A04;

    public void A00(boolean z) {
        Window window = this.A00;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            this.A01.setSystemBarsAppearance(8, 8);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility((~DefaultCrypto.BUFFER_SIZE) & decorView2.getSystemUiVisibility());
        this.A01.setSystemBarsAppearance(0, 8);
    }

    public boolean A01() {
        return AnonymousClass000.A1P(this.A01.getSystemBarsAppearance() & 8);
    }

    public AnonymousClass0H4(Window window, AnonymousClass0SI r5, AnonymousClass0SJ r6) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.A01 = insetsController;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = window;
    }
}
