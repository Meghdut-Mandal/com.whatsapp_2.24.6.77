package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3cl  reason: invalid class name and case insensitive filesystem */
public final class C68973cl implements C88944Uq {
    public final List A00;

    public void B0j(AnonymousClass2bM r1) {
    }

    public void BoC(AnonymousClass2bM r1, AnonymousClass2bM r2, boolean z) {
    }

    public /* bridge */ /* synthetic */ C80173uy B8N(String str) {
        Object obj;
        AnonymousClass28g r1;
        List list = this.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AnonymousClass00C.A0J(((AnonymousClass28g) obj).A02, str)) {
                    break;
                }
            }
            r1 = (AnonymousClass28g) obj;
        }
        return r1;
    }

    public Iterator B8O() {
        C225614x it;
        List list = this.A00;
        synchronized (list) {
            C23931Ak copyOf = C23931Ak.copyOf((Collection) list);
            AnonymousClass00C.A08(copyOf);
            it = copyOf.iterator();
            AnonymousClass00C.A08(it);
        }
        return it;
    }

    public int B8P() {
        int size;
        List list = this.A00;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    public int BGT() {
        long j;
        List list = this.A00;
        synchronized (list) {
            C23931Ak copyOf = C23931Ak.copyOf((Collection) list);
            AnonymousClass00C.A08(copyOf);
            j = 0;
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                j += ((AnonymousClass28g) it.next()).A00;
            }
        }
        return (int) j;
    }

    public String BGU(AnonymousClass11F r6, long j) {
        String str;
        Object obj;
        List list = this.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AnonymousClass28g) obj).A01) {
                    break;
                }
            }
            AnonymousClass28g r1 = (AnonymousClass28g) obj;
            if (r1 != null) {
                str = r1.A02;
            }
        }
        return str;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        List list = this.A00;
        synchronized (list) {
            isEmpty = list.isEmpty();
        }
        return isEmpty;
    }

    public C68973cl(List list) {
        this.A00 = list;
    }

    public C88944Uq B4P() {
        return this;
    }

    public Collection B8Y() {
        return AnonymousClass001.A0I();
    }
}
