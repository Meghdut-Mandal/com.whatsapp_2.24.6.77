package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.12m  reason: invalid class name and case insensitive filesystem */
public class C220012m extends C19580wB implements ComponentCallbacks2 {
    public long A00;
    public long A01;
    public final C21400zB A02;
    public final C19770wU A03;
    public final C19760wT A04;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        boolean z;
        if (i >= 60) {
            if (SystemClock.uptimeMillis() > this.A00 + 60000) {
                this.A00 = SystemClock.uptimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("OnTrimMemory/level: ");
                sb.append(i);
                sb.append(", trimming memory, app in background");
                Log.i(sb.toString());
                z = false;
            } else {
                return;
            }
        } else if (i >= 15 && i < 20 && SystemClock.uptimeMillis() > this.A01 + AnonymousClass6X5.A0L) {
            this.A01 = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OnTrimMemory/level: ");
            sb2.append(i);
            sb2.append(", trimming memory, app in foreground");
            Log.i(sb2.toString());
            z = true;
        } else {
            return;
        }
        this.A03.Boy(new C35241iN(this, i, 1, z));
    }

    public C220012m(C21400zB r2, C19760wT r3, C19630wG r4, C19770wU r5) {
        this.A03 = r5;
        this.A04 = r3;
        this.A02 = r2;
        r4.A00.registerComponentCallbacks(this);
    }
}
