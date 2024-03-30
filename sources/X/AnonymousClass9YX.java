package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.9YX  reason: invalid class name */
public class AnonymousClass9YX {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public AnonymousClass6FY A03;
    public String A04;
    public final ArrayList A05 = AnonymousClass001.A0I();
    public final HashMap A06 = AnonymousClass001.A0J();
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public synchronized void A00(String str) {
        AnonymousClass6FY r1 = this.A03;
        if (r1 != null) {
            r1.A05(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A01(String str) {
        AnonymousClass6FY r1 = this.A03;
        if (r1 != null) {
            r1.A05(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A02(String str) {
        AnonymousClass6FY r1 = this.A03;
        if (r1 != null) {
            r1.A05(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A03(String str) {
        this.A05.add(str);
        this.A07.add(AnonymousClass000.A0q("-success", AnonymousClass000.A0v(str)));
    }

    public synchronized void A04(String str, int i) {
        int i2;
        HashMap hashMap = this.A06;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        Integer valueOf = Integer.valueOf(Integer.valueOf(i2).intValue() + 1);
        hashMap.put(str, valueOf);
        this.A00 = i;
        this.A04 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A07;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("-error-");
        A0v.append(valueOf);
        copyOnWriteArrayList.add(AnonymousClass000.A0r("-", A0v, i));
    }

    public boolean A05(String str) {
        Number A10 = C36441kJ.A10(str, this.A06);
        if (this.A05.contains(str)) {
            return false;
        }
        if (A10 == null || A10.intValue() < 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.A07.toString();
    }
}
