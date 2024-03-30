package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.10Q  reason: invalid class name */
public class AnonymousClass10Q {
    public final AnonymousClass005 A00;

    public synchronized void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) this.A00.get();
        synchronized (sigquitBasedANRDetector.A08) {
            if (!sigquitBasedANRDetector.A0B) {
                Log.i("SigquitBasedANRDetector/start called");
                HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                sigquitBasedANRDetector.A00 = handlerThread;
                handlerThread.start();
                sigquitBasedANRDetector.A09 = new Handler(sigquitBasedANRDetector.A00.getLooper());
                Log.i("SigquitBasedANRDetector/start thread started");
                SigquitBasedANRDetector.startDetector();
                sigquitBasedANRDetector.A0B = true;
                Log.i("SigquitBasedANRDetector/started");
            }
        }
    }

    public AnonymousClass10Q(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}
