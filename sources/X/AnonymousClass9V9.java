package X;

import java.util.List;

/* renamed from: X.9V9  reason: invalid class name */
public class AnonymousClass9V9 {
    public List A00 = null;

    public void A00(AnonymousClass9RD r4) {
        if (this.A00 == null) {
            this.A00 = AnonymousClass001.A0I();
        }
        int i = 0;
        while (true) {
            int size = this.A00.size();
            List list = this.A00;
            if (i >= size) {
                list.add(r4);
                return;
            } else if (((AnonymousClass9RD) list.get(i)).A00.A00 > r4.A00.A00) {
                this.A00.add(i, r4);
                return;
            } else {
                i++;
            }
        }
    }

    public void A01(AnonymousClass9V9 r3) {
        List list = r3.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = C36361kB.A0r(list);
            }
            for (AnonymousClass9RD A002 : r3.A00) {
                A00(A002);
            }
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        for (Object A1K : list) {
            C36351kA.A1K(A1K, A0u);
            A0u.append(10);
        }
        return A0u.toString();
    }
}
