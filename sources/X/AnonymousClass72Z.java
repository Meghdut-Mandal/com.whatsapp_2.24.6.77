package X;

import java.util.Iterator;

/* renamed from: X.72Z  reason: invalid class name */
public class AnonymousClass72Z implements Iterable {
    public final int A00;
    public final Object[] A01;

    public Iterator iterator() {
        return new AnonymousClass76M(this.A01, this.A00);
    }

    public AnonymousClass72Z(Object[] objArr, int i) {
        if (i >= 1) {
            this.A01 = objArr;
            this.A00 = i;
            return;
        }
        throw AnonymousClass001.A08("Chunk size must be positive.");
    }
}
