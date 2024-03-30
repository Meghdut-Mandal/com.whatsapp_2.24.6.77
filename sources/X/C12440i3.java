package X;

import java.util.Map;

/* renamed from: X.0i3  reason: invalid class name and case insensitive filesystem */
public final class C12440i3 implements Map.Entry, C17920sI {
    public final int A00;
    public final C12460i5 A01;

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!AnonymousClass00C.A0J(entry.getKey(), getKey()) || !AnonymousClass00C.A0J(entry.getValue(), getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Object getKey() {
        C12460i5 r1 = this.A01;
        C12460i5 r0 = C12460i5.A00;
        return r1.keysArray[this.A00];
    }

    public Object getValue() {
        C12460i5 r1 = this.A01;
        C12460i5 r0 = C12460i5.A00;
        Object[] objArr = r1.valuesArray;
        AnonymousClass00C.A0B(objArr);
        return objArr[this.A00];
    }

    public Object setValue(Object obj) {
        C12460i5 r1 = this.A01;
        r1.A05();
        Object[] objArr = r1.valuesArray;
        if (objArr == null) {
            objArr = new Object[r1.keysArray.length];
            r1.valuesArray = objArr;
        }
        int i = this.A00;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public C12440i3(C12460i5 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public int hashCode() {
        int i = 0;
        int A0J = AnonymousClass000.A0J(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A0J ^ i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(getKey());
        A0u.append('=');
        return AnonymousClass000.A0o(getValue(), A0u);
    }
}
