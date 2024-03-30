package X;

import android.util.LruCache;

public class B6p extends LruCache {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B6p(Object obj, int i, int i2) {
        super(i);
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.A01) {
            case 1:
                C204369pt r7 = (C204369pt) obj2;
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = Long.valueOf(r7.A0k);
                C200599hh.A02("entryRemoved, playerId=%d", A0L);
                int size = size();
                Object[] A0M = AnonymousClass001.A0M();
                AnonymousClass000.A1N(A0M, 0, z);
                AnonymousClass000.A1K(A0M, size);
                C200599hh.A00(r7, "HeroService", "removed from pool, evicted = %s, remaining size = %d", A0M);
                synchronized (r7) {
                    C204369pt.A0F(r7, "Release player", new Object[0]);
                    if (r7.A14) {
                        C204369pt.A0F(r7, "Player already released", new Object[0]);
                    } else {
                        C204369pt.A09(r7.A0l.obtainMessage(8), r7);
                        r7.A0o.BeV(z);
                    }
                }
                return;
            case 2:
                synchronized (C196569a4.class) {
                    C196569a4.A00.offer(obj2);
                }
                return;
            case 3:
            case 4:
                AnonymousClass9JV r72 = (AnonymousClass9JV) obj2;
                C198079cs r0 = (C198079cs) this.A00;
                if (z) {
                    C202289lT r3 = r0.A02.A00;
                    r3.A07(new C166157vC(r72, r3), r72.A01);
                    return;
                }
                return;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                return;
        }
    }

    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        if (this.A01 != 0) {
            return super.sizeOf(obj, obj2);
        }
        return ((byte[]) obj2).length;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B6p(C197359ba r2) {
        super(32);
        this.A01 = 2;
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B6p(C198079cs r2) {
        super(1);
        this.A01 = 4;
        this.A00 = r2;
    }
}
