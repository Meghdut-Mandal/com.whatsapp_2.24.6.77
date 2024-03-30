package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public final class C12240hj implements Iterator, Map.Entry {
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public final /* synthetic */ AnonymousClass008 A03;

    public C12240hj(AnonymousClass008 r2) {
        this.A03 = r2;
        this.A00 = r2.size() - 1;
    }

    public boolean equals(Object obj) {
        if (!this.A02) {
            throw AnonymousClass001.A09("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AnonymousClass008 r2 = this.A03;
            if (!AnonymousClass00C.A0J(key, r2.A04(this.A01)) || !AnonymousClass00C.A0J(entry.getValue(), r2.A06(this.A01))) {
                return false;
            }
            return true;
        }
    }

    public Object getKey() {
        if (this.A02) {
            return this.A03.A04(this.A01);
        }
        throw AnonymousClass001.A09("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.A02) {
            return this.A03.A06(this.A01);
        }
        throw AnonymousClass001.A09("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A01, this.A00);
    }

    public int hashCode() {
        if (this.A02) {
            AnonymousClass008 r2 = this.A03;
            int i = this.A01;
            Object A04 = r2.A04(i);
            Object A06 = r2.A06(i);
            int i2 = 0;
            int A0H = AnonymousClass000.A0H(A04);
            if (A06 != null) {
                i2 = A06.hashCode();
            }
            return A0H ^ i2;
        }
        throw AnonymousClass001.A09("This container does not support retaining Map.Entry objects");
    }

    public void remove() {
        if (this.A02) {
            this.A03.A05(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.A02) {
            return this.A03.A07(this.A01, obj);
        }
        throw AnonymousClass001.A09("This container does not support retaining Map.Entry objects");
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(getKey());
        A0u.append("=");
        return AnonymousClass000.A0o(getValue(), A0u);
    }
}
