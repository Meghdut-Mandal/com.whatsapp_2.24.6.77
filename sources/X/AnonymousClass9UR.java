package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9UR  reason: invalid class name */
public class AnonymousClass9UR {
    public final LruCache A00;
    public final LruCache A01;
    public final AnonymousClass9OD A02;
    public final AUR A03;
    public final AtomicLong A04 = new AtomicLong(SystemClock.elapsedRealtime());

    public void A02(long j, boolean z) {
        boolean z2;
        Long valueOf = Long.valueOf(j);
        C200599hh.A02("id [%d]: Release player", valueOf);
        if (z && j > 0 && A01(j) != null) {
            C204369pt A012 = A01(j);
            C141066mc r3 = new C141066mc();
            C20992A2g a2g = A012.A0o;
            a2g.BgN(a2g.A00.A0k);
            a2g.A01 = r3;
        }
        if (this.A03.enableBackgroundServicePlayerReuse) {
            LruCache lruCache = this.A01;
            Number number = (Number) lruCache.get(valueOf);
            if (number != null) {
                int intValue = number.intValue();
                if (intValue <= 1) {
                    this.A00.remove(valueOf);
                    lruCache.remove(valueOf);
                    z2 = true;
                    Object[] A1Q = C36441kJ.A1Q();
                    A1Q[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                    A1Q[1] = valueOf;
                    AnonymousClass000.A1N(A1Q, 2, z2);
                    C200599hh.A02("HeroServicePlayerPool", A1Q);
                }
                lruCache.put(valueOf, Integer.valueOf(intValue - 1));
                C204369pt A013 = A01(j);
                if (A013 != null) {
                    C141066mc r32 = new C141066mc();
                    C20992A2g a2g2 = A013.A0o;
                    a2g2.BgN(a2g2.A00.A0k);
                    a2g2.A01 = r32;
                }
                z2 = false;
                Object[] A1Q2 = C36441kJ.A1Q();
                A1Q2[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                A1Q2[1] = valueOf;
                AnonymousClass000.A1N(A1Q2, 2, z2);
                C200599hh.A02("HeroServicePlayerPool", A1Q2);
            }
        }
        this.A00.remove(valueOf);
        z2 = true;
        Object[] A1Q22 = C36441kJ.A1Q();
        A1Q22[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
        A1Q22[1] = valueOf;
        AnonymousClass000.A1N(A1Q22, 2, z2);
        C200599hh.A02("HeroServicePlayerPool", A1Q22);
    }

    public C204369pt A01(long j) {
        return (C204369pt) this.A00.get(Long.valueOf(j));
    }

    public AnonymousClass9UR(AnonymousClass9OD r4, AUR aur) {
        this.A03 = aur;
        this.A02 = r4;
        int i = aur.playerPoolSize;
        i = i <= 0 ? 1 : i;
        this.A01 = new LruCache(i);
        this.A00 = new B6p(this, i, 1);
    }

    public static C204369pt A00(C202289lT r0, String str, Object[] objArr, long j) {
        C200599hh.A02(str, objArr);
        return r0.A0V.A01(j);
    }
}
