package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9kp  reason: invalid class name and case insensitive filesystem */
public class C201989kp {
    public C22906AyI A00;
    public C195299Tr A01;
    public Boolean A02 = C36381kD.A0j();
    public Integer A03;
    public String A04;

    public C201989kp(C195299Tr r2) {
        this.A01 = r2;
        this.A03 = C023109s.A01;
    }

    public static ArrayList A00(C199959gK r5, Class cls, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((C201989kp) it.next()).A00.get();
            C23091B4b b4b = r5.A01.A00;
            if (obj instanceof List) {
                for (Object next : b4b.Bvj(obj)) {
                    if (next != null) {
                        if (!C165587tf.A1b(cls, next)) {
                            if (cls == String.class) {
                                next = next.toString();
                            }
                        }
                        A0I.add(next);
                    }
                }
            } else if (obj != null) {
                if (C165587tf.A1b(cls, obj)) {
                    A0I.add(obj);
                } else if (cls == String.class) {
                    A0I.add(obj.toString());
                }
            }
        }
        return A0I;
    }

    public C201989kp(String str) {
        this.A04 = str;
        this.A03 = C023109s.A00;
    }

    public C201989kp() {
    }
}
