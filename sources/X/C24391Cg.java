package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Cg  reason: invalid class name and case insensitive filesystem */
public class C24391Cg {
    public boolean A00;
    public final StringBuilder A01 = new StringBuilder();

    public void A00(String str, int i) {
        boolean z;
        AnonymousClass00C.A0D(str, 0);
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                Log.i(str);
            } else if (i != 3) {
                Log.e(str);
            } else {
                Log.w(str);
            }
        }
        synchronized (this) {
            z = this.A00;
        }
        if (z) {
            synchronized (this) {
                StringBuilder sb = this.A01;
                sb.append("\n");
                sb.append(str);
            }
        }
    }
}
