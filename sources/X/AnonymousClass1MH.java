package X;

import android.content.res.Configuration;

/* renamed from: X.1MH  reason: invalid class name */
public class AnonymousClass1MH extends AnonymousClass04R {
    public int A00;
    public final C001700s A01 = new C001700s();

    public void A0S(Configuration configuration) {
        int i;
        int i2 = C002300y.A00;
        if ((i2 != 3 && i2 != -1) || this.A00 == (i = configuration.uiMode & 48)) {
            this.A01.A0D(0);
        } else if (i == 16 || i == 32) {
            this.A01.A0D(1);
        }
    }
}
