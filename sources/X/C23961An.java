package X;

import java.util.Objects;

/* renamed from: X.1An  reason: invalid class name and case insensitive filesystem */
public final class C23961An extends C23931Ak<Object> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient int offset;
    public final transient int size;

    public boolean isPartialView() {
        return true;
    }

    public Object get(int i) {
        C20740y5.A01(i, this.size);
        Object obj = this.alternatingKeysAndValues[(i * 2) + this.offset];
        Objects.requireNonNull(obj);
        return obj;
    }

    public C23961An(Object[] objArr, int i, int i2) {
        this.alternatingKeysAndValues = objArr;
        this.offset = i;
        this.size = i2;
    }

    public int size() {
        return this.size;
    }
}
