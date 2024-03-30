package X;

import android.database.Observable;

/* renamed from: X.0Ca  reason: invalid class name and case insensitive filesystem */
public class C02820Ca extends Observable {
    public void A00() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C02740Bs) this.mObservers.get(size)).A01();
            } else {
                return;
            }
        }
    }

    public void A01(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C02740Bs) this.mObservers.get(size)).A05(i, i2, 1);
        }
    }

    public void A02(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C02740Bs) this.mObservers.get(size)).A03(i, i2);
            } else {
                return;
            }
        }
    }

    public void A03(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C02740Bs) this.mObservers.get(size)).A04(i, i2);
            } else {
                return;
            }
        }
    }

    public void A04(Object obj, int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C02740Bs) this.mObservers.get(size)).A06(obj, i, i2);
            } else {
                return;
            }
        }
    }

    public boolean A05() {
        return !this.mObservers.isEmpty();
    }
}
