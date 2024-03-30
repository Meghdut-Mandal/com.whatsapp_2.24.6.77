package X;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.00r  reason: invalid class name and case insensitive filesystem */
public abstract class C001600r {
    public static final Object A0A = new Object();
    public int A00;
    public int A01;
    public C001800t A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public void A05() {
    }

    public void A06() {
    }

    private void A00(AnonymousClass04T r3) {
        if (!r3.A01) {
            return;
        }
        if (!r3.A02()) {
            r3.A01(false);
            return;
        }
        int i = r3.A00;
        int i2 = this.A01;
        if (i < i2) {
            r3.A00 = i2;
            r3.A02.BTH(this.A09);
        }
    }

    public Object A04() {
        Object obj = this.A09;
        if (obj == A0A) {
            return null;
        }
        return obj;
    }

    public void A07(AnonymousClass012 r4) {
        A01("removeObservers");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((AnonymousClass04T) entry.getValue()).A03(r4)) {
                A0B((AnonymousClass04S) entry.getKey());
            }
        }
    }

    public void A08(AnonymousClass012 r3, AnonymousClass04S r4) {
        A01("observe");
        if (((AnonymousClass01N) r3.getLifecycle()).A02 != AnonymousClass01P.DESTROYED) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(r3, this, r4);
            AnonymousClass04T r0 = (AnonymousClass04T) this.A02.A02(r4, liveData$LifecycleBoundObserver);
            if (r0 == null) {
                r3.getLifecycle().A04(liveData$LifecycleBoundObserver);
            } else if (!r0.A03(r3)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public void A09(AnonymousClass04T r5) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (r5 == null) {
                C001800t r0 = this.A02;
                AnonymousClass05S r2 = new AnonymousClass05S(r0);
                r0.A03.put(r2, false);
                while (r2.hasNext()) {
                    A00((AnonymousClass04T) ((Map.Entry) r2.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            } else {
                A00(r5);
                r5 = null;
            }
        } while (this.A04);
        this.A05 = false;
    }

    public void A0A(AnonymousClass04S r4) {
        A01("observeForever");
        C03720Hl r2 = new C03720Hl(this, r4);
        Object A022 = this.A02.A02(r4, r2);
        if (A022 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (A022 == null) {
            r2.A01(true);
        }
    }

    public void A0B(AnonymousClass04S r3) {
        A01("removeObserver");
        AnonymousClass04T r1 = (AnonymousClass04T) this.A02.A01(r3);
        if (r1 != null) {
            r1.A00();
            r1.A01(false);
        }
    }

    public void A0C(Object obj) {
        boolean z;
        synchronized (this.A06) {
            z = false;
            if (this.A08 == A0A) {
                z = true;
            }
            this.A08 = obj;
        }
        if (z) {
            C002601b.A00().A02(this.A07);
        }
    }

    public void A0D(Object obj) {
        A01("setValue");
        this.A01++;
        this.A09 = obj;
        A09((AnonymousClass04T) null);
    }

    public C001600r(Object obj) {
        this.A06 = new Object();
        this.A02 = new C001800t();
        this.A00 = 0;
        this.A08 = A0A;
        this.A07 = new C001900u(this);
        this.A09 = obj;
        this.A01 = 0;
    }

    public static void A01(String str) {
        if (!C002601b.A00().A03()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    public C001600r() {
        this.A06 = new Object();
        this.A02 = new C001800t();
        this.A00 = 0;
        Object obj = A0A;
        this.A08 = obj;
        this.A07 = new C001900u(this);
        this.A09 = obj;
        this.A01 = -1;
    }
}
