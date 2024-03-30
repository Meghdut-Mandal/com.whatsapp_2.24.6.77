package X;

import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.739  reason: invalid class name */
public final /* synthetic */ class AnonymousClass739 implements Runnable {
    public final /* synthetic */ SigquitBasedANRDetector A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass739(SigquitBasedANRDetector sigquitBasedANRDetector, String str, String str2, String str3) {
        this.A00 = sigquitBasedANRDetector;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void run() {
        int i;
        SigquitBasedANRDetector sigquitBasedANRDetector = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        Log.i("SigquitBasedANRDetector/processing ANR start");
        Log.i("SigquitBasedANRDetector/persisting ANR report start");
        if (str2 != null) {
            str = str.replace(str2, AnonymousClass000.A0p("  | detected using Sigquit based detector\n", str2, AnonymousClass000.A0u()));
        }
        StackTraceElement[] stackTrace = C90514aH.A11().getStackTrace();
        Exception exc = new Exception("ANR detected");
        exc.setStackTrace(stackTrace);
        Log.e("SigquitBasedANRDetector/Generating ANR Report", exc);
        try {
            File A032 = sigquitBasedANRDetector.A04.A03(str, (String) null, str3);
            synchronized (sigquitBasedANRDetector.A08) {
                AnonymousClass11d r6 = sigquitBasedANRDetector.A05;
                synchronized (r6) {
                    try {
                        i = r6.A00;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                if (i != 0) {
                    synchronized (r6) {
                        try {
                            if (r6.A00 != 0) {
                                AnonymousClass5N6 r3 = r6.A02;
                                Object obj = r3.A05;
                                synchronized (obj) {
                                    r3.A01 = true;
                                    obj.notifyAll();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                Log.i("SigquitBasedANRDetector/About to start process anr error monitor");
                C118965p1 r7 = new C118965p1(sigquitBasedANRDetector, A032);
                synchronized (r6) {
                    try {
                        AnonymousClass5N6 r32 = r6.A02;
                        if (!(r32 == null || r6.A00 == 0)) {
                            Object obj2 = r32.A05;
                            synchronized (obj2) {
                                r32.A01 = true;
                                obj2.notifyAll();
                            }
                        }
                        long j = r6.A01 + 1;
                        r6.A01 = j;
                        AnonymousClass5N6 r5 = new AnonymousClass5N6(r6, r7, r6.A03, j);
                        r6.A02 = r5;
                        r6.A00 = 1;
                        r5.start();
                    } catch (Throwable th3) {
                        while (true) {
                            th = th3;
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("SigquitBasedANRDetector/Error saving ANR report", e);
            Log.e("SigquitBasedANRDetector/couldn't write ANR to file, aborting");
            Log.i("SigquitBasedANRDetector/abortANR");
            sigquitBasedANRDetector.A0A = false;
        }
        Log.i("SigquitBasedANRDetector/processing ANR finish");
    }
}
