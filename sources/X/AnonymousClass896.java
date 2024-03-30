package X;

import android.os.Handler;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.896  reason: invalid class name */
public class AnonymousClass896 extends A0U implements B5Y {
    public synchronized void A08(B5X b5x) {
        synchronized (this) {
            this.A0F.add(b5x);
        }
    }

    public void B39(C21664AUg aUg, byte[] bArr) {
    }

    public synchronized long BIR(String str) {
        long j;
        synchronized (this) {
            Long l = (Long) this.A0H.get(str);
            if (l == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
        }
        return j;
    }

    public byte[] Bmu(C21664AUg aUg) {
        return null;
    }

    public synchronized void Bny(C21664AUg aUg) {
        Bnz(aUg, "not_provided");
    }

    public synchronized void Bnz(C21664AUg aUg, String str) {
        HashMap hashMap = this.A0G;
        String str2 = aUg.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str2);
        long j = this.A00;
        long j2 = aUg.A04;
        this.A00 = j - j2;
        if (treeSet == null || !treeSet.remove(aUg)) {
            this.A0E.BWv((int) aUg.A05, (int) j2, "removeSpan failed", str2);
        }
        aUg.A06.delete();
        if (treeSet != null && treeSet.isEmpty()) {
            hashMap.remove(str2);
            Set set = this.A0N;
            if (set != null) {
                set.remove(str2);
            }
        }
        A09(aUg, str);
    }

    public synchronized void BsX(String str, long j) {
        synchronized (this) {
            C36421kH.A1K(str, this.A0H, j);
        }
    }

    public synchronized C21664AUg Buj(Integer num, String str, long j) {
        C21664AUg Buk;
        synchronized (this) {
            Buk = Buk(num, str, j, 0);
        }
        return Buk;
    }

    public synchronized C21664AUg Bul(Integer num, String str, long j) {
        C21664AUg A01;
        synchronized (this) {
            A01 = A0U.A01(C202829mj.A02(str, j), this, num);
        }
        return A01;
    }

    public void A09(C21664AUg aUg, String str) {
        HashMap hashMap = this.A0I;
        C21664AUg aUg2 = aUg;
        String str2 = aUg2.A07;
        AbstractList abstractList = (AbstractList) hashMap.get(str2);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((B2F) abstractList.get(size)).Bgu(this, aUg2);
            }
        }
        B5X b5x = this.A0E;
        if (b5x != null) {
            b5x.Bgu(this, aUg2);
        }
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            B5X b5x2 = (B5X) it.next();
            if (b5x2 instanceof A0X) {
                A0X a0x = (A0X) b5x2;
                Tracer.A00("CacheInstrumentationListener.onSpanRemoved");
                try {
                    C130376Kv r2 = a0x.A01;
                    if (r2 != null) {
                        r2.A01.add(new AUS(C188228zF.SPAN_REMOVED, a0x.A02, (String) null, (String) null, str2, (String) null, str, "unknown", "unknown", aUg2.A05, aUg2.A04, 0, 0, false));
                    }
                } finally {
                    Systrace.A00();
                }
            } else {
                b5x2.Bgu(this, aUg2);
            }
        }
    }

    public AnonymousClass896(Handler handler, B5X b5x, File file, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(handler, b5x, file, i, j, j2, z, z2, z3, z4, z5, z6, z7, z8);
    }
}
