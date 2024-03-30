package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1XM  reason: invalid class name */
public abstract class AnonymousClass1XM {
    public AnonymousClass1XK A00;
    public final int A01;
    public final Comparator A02 = AnonymousClass1XO.A00;
    public volatile List A03;

    public void A07() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = Collections.synchronizedList(this.A00.BKI());
                }
            }
        }
    }

    public AnonymousClass1XM(AnonymousClass1XK r2, int i) {
        this.A00 = r2;
        this.A01 = i;
    }

    public int A02() {
        int min;
        A07();
        synchronized (this) {
            min = Math.min(this.A01, this.A03.size());
        }
        return min;
    }

    public Object A03(int i) {
        Object BCC;
        A07();
        synchronized (this) {
            BCC = ((C88794Ub) this.A03.get(i)).BCC();
        }
        return BCC;
    }

    public ArrayList A04() {
        ArrayList A05;
        A07();
        synchronized (this) {
            A05 = A05(Math.min(this.A01, this.A03.size()));
        }
        return A05;
    }

    public ArrayList A05(int i) {
        A07();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i2 = 0; i2 < Math.min(i, this.A03.size()); i2++) {
                arrayList.add(((C88794Ub) this.A03.get(i2)).BCC());
            }
        }
        return arrayList;
    }

    public HashMap A06() {
        HashMap hashMap;
        A07();
        synchronized (this) {
            hashMap = new HashMap();
            for (C88794Ub r0 : this.A03) {
                hashMap.put(r0.BCC(), Float.valueOf(r0.BJE()));
            }
        }
        return hashMap;
    }

    public void A08(Object obj) {
        A07();
        synchronized (this) {
            int size = this.A03.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.A00.Blb(this.A03);
                } else if (((C88794Ub) this.A03.get(size)).B3A(obj)) {
                    A0A(size);
                }
            }
        }
    }

    public boolean A09(Object obj) {
        boolean z;
        A07();
        synchronized (this) {
            z = false;
            for (C88794Ub r3 : this.A03) {
                float BJE = r3.BJE();
                if (!r3.B3A(obj)) {
                    r3.Bsm(((float) Math.round((BJE * 0.9f) * 100.0f)) / 100.0f);
                } else {
                    r3.Bsm(((float) Math.round((BJE + 1.0f) * 100.0f)) / 100.0f);
                    z = true;
                }
            }
            if (!z) {
                A0B(this.A00.B4V(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            C18740tg.A06(this.A03);
            int size = this.A03.size();
            while (true) {
                size--;
                if (size >= this.A01) {
                    A0A(size);
                } else {
                    this.A00.Blb(this.A03);
                }
            }
        }
        return z;
    }

    public void A0A(int i) {
        A07();
        synchronized (this) {
            this.A03.remove(i);
        }
    }

    public void A0B(C88794Ub r2) {
        A07();
        synchronized (this) {
            this.A03.add(r2);
        }
    }
}
