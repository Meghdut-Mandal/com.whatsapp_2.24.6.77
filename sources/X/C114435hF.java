package X;

import android.os.Build;

/* renamed from: X.5hF  reason: invalid class name and case insensitive filesystem */
public class C114435hF {
    public final C158907iR A00;

    public C114435hF() {
        C158907iR r0;
        if (Build.VERSION.SDK_INT >= 26) {
            r0 = new C95534lh();
        } else {
            r0 = new C138546iH();
        }
        this.A00 = r0;
    }
}
