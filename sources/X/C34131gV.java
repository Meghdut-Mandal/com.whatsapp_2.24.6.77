package X;

import android.content.Context;
import android.view.Window;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gV  reason: invalid class name and case insensitive filesystem */
public class C34131gV implements C34121gU {
    public Integer A00;
    public final Map A01 = new HashMap();
    public final C34151gX A02;
    public final C21010yW A03;
    public final C21430zE A04;

    public void Bfv(Window window, int i, boolean z, boolean z2) {
        if (z2 || z) {
            C34151gX r1 = this.A02;
            if (!r1.A03) {
                r1.A03 = true;
                C34171gZ r3 = r1.A05;
                if (!r3.A03) {
                    r3.A00 = -1;
                }
                r3.A03 = true;
                r3.A05.postFrameCallback(r3.A04);
            }
            this.A00 = Integer.valueOf(i);
        }
    }

    public void Bfw(Window window) {
        C34151gX r4 = this.A02;
        if (r4.A03) {
            r4.A03 = false;
            C34171gZ r0 = r4.A05;
            r0.A03 = false;
            r0.A05.removeFrameCallback(r0.A04);
            double min = Math.min(r4.A01, 3600.0d);
            double min2 = Math.min(r4.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(r4.A02, C34151gX.A07));
            C34141gW r5 = r4.A06;
            AnonymousClass364 r7 = new AnonymousClass364(min, min2, millis);
            C34131gV r3 = r5.A00;
            Integer num = r3.A00;
            if (num != null) {
                Map map = r3.A01;
                if (!map.containsKey(num)) {
                    map.put(r3.A00, new C605238e());
                }
                C605238e r6 = (C605238e) map.get(r3.A00);
                r6.A02++;
                r6.A00 += r7.A00;
                r6.A01 += r7.A01;
                r6.A03 += r7.A02;
            }
            r5.A01.markerEnd(689639794, 2);
            r4.A01 = 0.0d;
            r4.A00 = 0.0d;
            r4.A02 = 0;
        }
        this.A00 = null;
    }

    public void report() {
        Map map = this.A01;
        for (Map.Entry entry : map.entrySet()) {
            C176308bu r8 = new C176308bu();
            C605238e r10 = (C605238e) entry.getValue();
            r8.A03 = Long.valueOf(r10.A03);
            r8.A02 = (Integer) entry.getKey();
            long j = r10.A03;
            if (j > 0) {
                double d = (double) j;
                r8.A00 = Double.valueOf((r10.A01 * 60000.0d) / d);
                r8.A01 = Double.valueOf((r10.A00 * 60000.0d) / d);
            }
            this.A03.Bly(r8);
        }
        map.clear();
    }

    public C34131gV(Context context, AnonymousClass1JJ r4, C21010yW r5, C21430zE r6) {
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = new C34151gX(context, r4, new C34141gW(this, r6));
    }
}
