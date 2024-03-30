package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Cy  reason: invalid class name and case insensitive filesystem */
public final class C170318Cy<E> extends C21882Ac8<E> {
    public static final C170318Cy A01;
    public final List A00;

    public C170318Cy(List list) {
        this.A00 = list;
    }

    public final void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final Object get(int i) {
        return this.A00.get(i);
    }

    public final Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.A00.size();
    }

    static {
        C170318Cy r1 = new C170318Cy();
        A01 = r1;
        r1.A00 = false;
    }

    public C170318Cy() {
        this(C36441kJ.A14(10));
    }

    public final /* synthetic */ C23120B6a Byu(int i) {
        if (i >= size()) {
            ArrayList A14 = C36441kJ.A14(i);
            A14.addAll(this.A00);
            return new C170318Cy(A14);
        }
        throw C165617ti.A0U();
    }
}
