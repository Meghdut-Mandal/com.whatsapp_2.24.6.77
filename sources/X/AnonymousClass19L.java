package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.19L  reason: invalid class name */
public class AnonymousClass19L {
    public final C20810yC A00;
    public final AnonymousClass19K A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final int[] A05 = {0, 1, 2, 3};
    public final C19970wo A06;
    public final Map A07;

    public static synchronized C201579ju A00(AnonymousClass19L r3, int i, long j) {
        C201579ju r0;
        synchronized (r3) {
            if (j <= 0) {
                r0 = null;
            } else {
                r0 = (C201579ju) r3.A02(i).get(Long.valueOf(j));
            }
        }
        return r0;
    }

    public C201579ju A01(long j) {
        if (j > 0) {
            int[] iArr = this.A05;
            int i = 0;
            do {
                C201579ju A002 = A00(this, iArr[i], j);
                if (A002 != null) {
                    return A002;
                }
                i++;
            } while (i < 4);
        }
        return null;
    }

    public synchronized void A04(long j) {
        C201579ju A012 = A01(j);
        if (A012 != null) {
            A02(A012.A02).remove(Long.valueOf(A012.A03));
            for (AnonymousClass19N BWI : this.A01.getObservers()) {
                BWI.BWI(A012);
            }
        }
    }

    public synchronized void A05(C201579ju r4) {
        Map A022 = A02(r4.A02);
        Long valueOf = Long.valueOf(r4.A03);
        if (A022.containsKey(valueOf)) {
            StringBuilder sb = new StringBuilder();
            sb.append("LoggableStanzaCache/skipped caching loggable stanza:");
            sb.append(r4);
            Log.w(sb.toString());
        } else {
            A022.put(valueOf, r4);
            for (AnonymousClass19N Bh6 : this.A01.getObservers()) {
                Bh6.Bh6(r4);
            }
        }
    }

    public Map A02(int i) {
        if (i == 0) {
            return this.A07;
        }
        if (i == 1) {
            return this.A04;
        }
        if (i == 2) {
            return this.A03;
        }
        if (i == 3) {
            return this.A02;
        }
        throw new RuntimeException("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public AnonymousClass19L(C19970wo r2, C20810yC r3, AnonymousClass19K r4) {
        this.A06 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = new HashMap();
        this.A04 = new HashMap();
        this.A03 = new HashMap();
        this.A02 = new HashMap();
    }

    public void A03(long j) {
        int i;
        C201579ju A012 = A01(j);
        if (!(A012 instanceof C177818eQ)) {
            if (A012 instanceof C177808eP) {
                i = 6;
            } else if (A012 instanceof C177798eO) {
                i = 5;
            } else if (!(A012 instanceof C177828eR)) {
                return;
            }
            A012.A04(i);
            return;
        }
        A012.A04(4);
    }
}
