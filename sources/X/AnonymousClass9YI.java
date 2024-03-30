package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9YI  reason: invalid class name */
public class AnonymousClass9YI {
    public int A00 = 0;
    public final C22872AxR A01;
    public final LinkedHashMap A02 = C36431kI.A1G();

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        int i;
        remove = this.A02.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BHf(remove);
        }
        this.A00 = i2 - i;
        return remove;
    }

    public synchronized ArrayList A03(AnonymousClass9CI r7) {
        ArrayList A0I;
        int i;
        A0I = AnonymousClass001.A0I();
        Iterator A10 = C36371kC.A10(this.A02);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            Object key = A11.getKey();
            String str = r7.A00;
            String str2 = (String) key;
            AnonymousClass00C.A0D(str2, 1);
            if (AnonymousClass00C.A0J(str, str2)) {
                A0I.add(A11.getValue());
                int i2 = this.A00;
                Object value = A11.getValue();
                if (value == null) {
                    i = 0;
                } else {
                    i = this.A01.BHf(value);
                }
                this.A00 = i2 - i;
                A10.remove();
            }
        }
        return A0I;
    }

    public synchronized void A04(Object obj, Object obj2) {
        int i;
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BHf(remove);
        }
        this.A00 = i2 - i;
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.BHf(obj2);
    }

    public AnonymousClass9YI(C22872AxR axR) {
        this.A01 = axR;
    }
}
