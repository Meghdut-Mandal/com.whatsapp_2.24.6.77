package X;

import com.whatsapp.util.Log;

/* renamed from: X.7qs  reason: invalid class name and case insensitive filesystem */
public class C163857qs implements C159567jZ {
    public Object A00;
    public final int A01;

    public C163857qs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BWY() {
        C105535Fa r1;
        int i;
        if (this.A01 != 0) {
            Log.e("fpm/WifiDirectScannerConnectionHandler/Unable to get IP");
            r1 = ((AnonymousClass6TN) this.A00).A03;
            i = 603;
        } else {
            Log.e("fpm/WifiDirectCreatorConnectionHandler/Failure sending IP address");
            AnonymousClass64J r2 = (AnonymousClass64J) this.A00;
            Runnable runnable = r2.A01;
            if (runnable != null) {
                r2.A04.Bnx(runnable);
            }
            if (r2.A00 != null) {
                Log.i("fpm/WifiDirectCreatorConnectionHandler/stopping WifiDirect");
                r2.A00.A00();
            }
            r1 = r2.A02;
            i = 602;
        }
        r1.A02(i);
    }

    public void BiD(String str) {
        if (this.A01 != 0) {
            ((AnonymousClass6TN) this.A00).A04.A00(str);
        } else {
            Log.i("fpm/WifiDirectCreatorConnectionHandler/Successfully sent IP address");
        }
    }
}
