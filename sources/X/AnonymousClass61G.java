package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.61G  reason: invalid class name */
public class AnonymousClass61G {
    public final /* synthetic */ AnonymousClass5NQ A00;

    public AnonymousClass61G(AnonymousClass5NQ r1) {
        this.A00 = r1;
    }

    @JavascriptInterface
    public void postPlayerEvent(int i, int i2) {
        if (i2 >= 0 && i2 < 2147483) {
            this.A00.A0C.A0H(new C80353vG(this, i, i2, 7));
        }
    }
}
