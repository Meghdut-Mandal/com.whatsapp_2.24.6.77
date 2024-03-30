package X;

import java.util.Map;

/* renamed from: X.9Qy  reason: invalid class name and case insensitive filesystem */
public class C194719Qy {
    public final /* synthetic */ AH6 A00;
    public final /* synthetic */ C21430zE A01;

    public C194719Qy(AH6 ah6, C21430zE r2) {
        this.A00 = ah6;
        this.A01 = r2;
    }

    public void A00(AnonymousClass9RG r13, int i) {
        AH6 ah6 = this.A00;
        if (ah6.A01) {
            Map map = ah6.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, new C193569Lz());
            }
            C193569Lz r4 = (C193569Lz) map.get(valueOf);
            r4.A02++;
            r4.A00 += r13.A00;
            r4.A01 += r13.A01;
            r4.A03 += r13.A02;
        }
        if (ah6.A00) {
            double d = r13.A00;
            if (!Double.isNaN(d)) {
                long j = r13.A02;
                if (j > 0) {
                    C21430zE r9 = ah6.A03;
                    r9.markerAnnotate(689639794, "timeSpent", j);
                    double d2 = (double) j;
                    r9.markerAnnotate(689639794, "smallFrames", (r13.A01 * 60000.0d) / d2);
                    r9.markerAnnotate(689639794, "largeFrames", (d * 60000.0d) / d2);
                    r9.markerAnnotate(689639794, "scrollSurface", i);
                }
            }
        }
    }
}
