package X;

import java.util.Iterator;

/* renamed from: X.73I  reason: invalid class name */
public class AnonymousClass73I implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass73I(Object obj, String str, int i, long j, boolean z) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
    }

    public void run() {
        int i = this.A04;
        Object obj = this.A01;
        if (i != 0) {
            String str = this.A02;
            boolean z = this.A03;
            ((C98544rb) obj).A00.BVF(this.A00, str, z);
            return;
        }
        Iterator A0h = C90494aF.A0h(obj);
        while (A0h.hasNext()) {
            ((C161067m6) A0h.next()).BVF(this.A00, this.A02, this.A03);
        }
    }
}
