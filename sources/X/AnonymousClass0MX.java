package X;

/* renamed from: X.0MX  reason: invalid class name */
public final class AnonymousClass0MX extends AnonymousClass0MZ {
    public final transient AnonymousClass0MZ A00;

    public final AnonymousClass0MZ A09() {
        return this.A00;
    }

    public final AnonymousClass0MZ A0A(int i, int i2) {
        AnonymousClass0MZ r2 = this.A00;
        C07320Xe.A02(i, i2, r2.size());
        return r2.subList(r2.size() - i2, r2.size() - i).A09();
    }

    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public final Object get(int i) {
        AnonymousClass0MZ r1 = this.A00;
        C07320Xe.A01(i, r1.size());
        return r1.get((r1.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        AnonymousClass0MZ r0 = this.A00;
        int lastIndexOf = r0.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        AnonymousClass0MZ r0 = this.A00;
        int indexOf = r0.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    public final int size() {
        return this.A00.size();
    }

    public AnonymousClass0MX(AnonymousClass0MZ r1) {
        this.A00 = r1;
    }
}
