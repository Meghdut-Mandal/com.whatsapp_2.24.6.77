package X;

import android.os.Handler;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.11d  reason: invalid class name */
public class AnonymousClass11d {
    public int A00 = 0;
    public long A01;
    public AnonymousClass5N6 A02;
    public final C21060yb A03;

    public static synchronized void A00(AnonymousClass11d r5, C118965p1 r6, String str, String str2, int i) {
        Handler handler;
        C1496972k r1;
        synchronized (r5) {
            if (r5.A02.A02 == r5.A01) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            r5.A00 = 0;
                        } else {
                            r5.A00 = 0;
                            Log.e("SigquitBasedANRDetector/onCheckFailed");
                        }
                        SigquitBasedANRDetector sigquitBasedANRDetector = r6.A01;
                        if (sigquitBasedANRDetector.A09 != null) {
                            handler = sigquitBasedANRDetector.A09;
                            r1 = new C1496972k(r6, 30);
                        }
                    } else {
                        r5.A00 = 2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SigquitBasedANRDetector/On error detected ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(str2);
                        Log.i(sb.toString());
                        if (str != null) {
                            SigquitBasedANRDetector sigquitBasedANRDetector2 = r6.A01;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(" : ");
                            sb2.append(str2);
                            SigquitBasedANRDetector.A00(sigquitBasedANRDetector2, sb2.toString());
                        }
                        SigquitBasedANRDetector sigquitBasedANRDetector3 = r6.A01;
                        if (sigquitBasedANRDetector3.A09 != null) {
                            handler = sigquitBasedANRDetector3.A09;
                            r1 = new C1496972k(r6, 31);
                        }
                    }
                    handler.post(r1);
                } else {
                    Log.i("SigquitBasedANRDetector/Started monitoring");
                }
            }
        }
    }

    public AnonymousClass11d(C21060yb r2) {
        this.A03 = r2;
    }
}
