package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3SC  reason: invalid class name */
public final class AnonymousClass3SC {
    public int A00;
    public AnonymousClass2bU A01;
    public final CopyOnWriteArrayList A02;

    public AnonymousClass3SC(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A02 = new CopyOnWriteArrayList(list);
        this.A01 = (AnonymousClass2bU) C36391kE.A0t(list);
        A00();
    }

    public synchronized AnonymousClass2bU A01() {
        return this.A01;
    }

    public synchronized void A03(C64933Qa r6) {
        Object obj;
        StringBuilder A0t = C36401kF.A0t(r6, 0);
        A0t.append("messagelist/remove ");
        A0t.append(r6);
        A0t.append(" from ");
        C36321k7.A1a(A0t, A02());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r6.equals(((AnonymousClass3T1) obj).A1J)) {
                break;
            }
        }
        copyOnWriteArrayList.remove((AnonymousClass2bU) obj);
        if (!copyOnWriteArrayList.isEmpty()) {
            Object obj2 = copyOnWriteArrayList.get(0);
            AnonymousClass00C.A08(obj2);
            this.A01 = (AnonymousClass2bU) obj2;
        }
    }

    private final void A00() {
        C65013Qj r2 = this.A01.A01;
        C18740tg.A0D(AnonymousClass000.A1V(r2), "First media data is null");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass2bU A0r = C36441kJ.A0r(it);
            AnonymousClass00C.A0B(A0r);
            C65013Qj r3 = A0r.A01;
            C18740tg.A0D(AnonymousClass000.A1V(r3), "Media data is null");
            C18740tg.A0D(AnonymousClass000.A1S(this.A01.A1I, A0r.A1I), "Media type mismatch");
            C18740tg.A0D(AnonymousClass000.A1S(this.A01.A09, A0r.A09), "Origin mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A1a(), A0r.A1a()), "Caption mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A04, A0r.A04), "Hash mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A03, A0r.A03), "Encrypted hash mismatch");
            C18740tg.A0D(AnonymousClass000.A1S(this.A01.A0B, A0r.A0B), "Duration mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A05, A0r.A05), "Mime mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A1b(), A0r.A1b()), "Name mismatch");
            C18740tg.A0D(C1901797e.A00(this.A01.A08, A0r.A08), "Multicast id mismatch");
            C18740tg.A06(r2);
            String str = r2.A0L;
            C18740tg.A06(r3);
            C18740tg.A0D(C1901797e.A00(str, r3.A0L), "Media Job Id mismatch");
        }
    }

    public boolean A04() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (!(C64933Qa.A02(it) instanceof C177528dw)) {
                return true;
            }
        }
        return false;
    }

    public boolean A05() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C64933Qa.A02(it) instanceof C177528dw) {
                    return true;
                }
            }
        }
        return false;
    }

    public String A02() {
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0u.length() > 0) {
                A0u.append(',');
            }
            A0u.append(A0l.A1J);
        }
        return C36381kD.A0y(A0u);
    }

    public AnonymousClass3SC(List list, int i) {
        AnonymousClass00C.A0D(list, 1);
        this.A02 = new CopyOnWriteArrayList(list);
        this.A01 = (AnonymousClass2bU) C36391kE.A0t(list);
        A00();
        this.A00 = i;
    }
}
