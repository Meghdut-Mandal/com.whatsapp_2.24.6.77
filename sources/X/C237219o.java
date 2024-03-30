package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.19o  reason: invalid class name and case insensitive filesystem */
public class C237219o {
    public C237419r A00 = new C237419r();
    public Runnable A01;
    public final C19730wQ A02;
    public final C21100yf A03;
    public final C237319q A04;
    public final AnonymousClass19p A05;
    public final C19770wU A06;

    public synchronized void A02(boolean z) {
        C237419r r1 = this.A00;
        if (!C237419r.A01(r1) && C237419r.A00(r1.A00, z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/onAppStateSyncComplete isSuccess=");
            sb.append(z);
            Log.i(sb.toString());
            A00(this);
        }
    }

    public static void A00(C237219o r5) {
        C237419r r4 = r5.A00;
        if (C237419r.A03(r4)) {
            boolean A022 = C237419r.A02(r4);
            boolean z = r4.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/handleCompleted isSuccess=");
            sb.append(A022);
            sb.append(", hasTimedOut=");
            sb.append(z);
            Log.i(sb.toString());
            synchronized (r5) {
                Runnable runnable = r5.A01;
                if (runnable != null) {
                    r5.A06.Bnx(runnable);
                    r5.A01 = null;
                }
                C20000wr r1 = r4.A01;
                synchronized (r1) {
                    r1.A00 = 1;
                }
                C20000wr r12 = r4.A00;
                synchronized (r12) {
                    r12.A00 = 1;
                }
                r4.A02 = false;
            }
            Iterator it = r5.A04.getObservers().iterator();
            if (A022) {
                while (it.hasNext()) {
                    ((AnonymousClass1IY) it.next()).onSuccess();
                }
                return;
            }
            while (it.hasNext()) {
                ((AnonymousClass1IY) it.next()).BXG(z);
            }
        }
    }

    public void A01(boolean z) {
        C237419r r1 = this.A00;
        if (!C237419r.A01(r1) && C237419r.A00(r1.A01, z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CriticalDataUploadManager/onHistorySyncComplete isSuccess=");
            sb.append(z);
            Log.i(sb.toString());
            A00(this);
        }
    }

    public C237219o(C19730wQ r2, C21100yf r3, C237319q r4, AnonymousClass19p r5, C19770wU r6) {
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }
}
