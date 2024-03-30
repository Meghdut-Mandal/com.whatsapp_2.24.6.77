package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.76c  reason: invalid class name and case insensitive filesystem */
public final class C1506576c implements Map.Entry, C17920sI {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ C93964hQ A02;

    public C1506576c(C93964hQ r2) {
        this.A02 = r2;
        Map.Entry entry = r2.A01;
        AnonymousClass00C.A0B(entry);
        this.A01 = entry.getKey();
        Map.Entry entry2 = r2.A01;
        AnonymousClass00C.A0B(entry2);
        this.A00 = entry2.getValue();
    }

    public Object setValue(Object obj) {
        C93964hQ r3 = this.A02;
        C1506676d r2 = r3.A03;
        if (r2.A00().A00 == r3.A00) {
            Object value = getValue();
            r2.put(getKey(), obj);
            this.A00 = obj;
            return value;
        }
        throw new ConcurrentModificationException();
    }

    public Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }
}
