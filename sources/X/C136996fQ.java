package X;

import android.os.Trace;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6fQ  reason: invalid class name and case insensitive filesystem */
public final class C136996fQ implements AnonymousClass7bJ {
    public AnonymousClass0GB A00;
    public final List A01 = AnonymousClass001.A0I();
    public final List A02 = AnonymousClass001.A0I();
    public final List A03 = AnonymousClass001.A0I();
    public final Set A04;

    public final void A00() {
        Set set = this.A04;
        if (C90514aH.A1a(set)) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((C159847k1) it.next()).BQW();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void A01() {
        List list = this.A01;
        if (C36401kF.A1a(list)) {
            Trace.beginSection("Compose:onForgotten");
            try {
                AnonymousClass0GB r3 = this.A00;
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = list.get(size);
                    C07710Yz.A00(this.A04).remove(obj);
                    if (obj instanceof C159847k1) {
                        ((C159847k1) obj).BYM();
                    }
                    if (obj instanceof C159837k0) {
                        if (r3 == null || !r3.A03(obj)) {
                            ((C159837k0) obj).BVE();
                        } else {
                            ((C159837k0) obj).BeU();
                        }
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        List list2 = this.A02;
        if (C36401kF.A1a(list2)) {
            Trace.beginSection("Compose:onRemembered");
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                C159847k1 r1 = (C159847k1) list2.get(i);
                this.A04.remove(r1);
                r1.BeY();
            }
            Trace.endSection();
        }
    }

    public C136996fQ(Set set) {
        this.A04 = set;
    }
}
