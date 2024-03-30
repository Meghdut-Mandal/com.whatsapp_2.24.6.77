package X;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.0Me  reason: invalid class name and case insensitive filesystem */
public final class C04830Me extends C04860Mh {
    public final transient Object A00;

    public final C12200hf A07() {
        return new C04910Mm(this.A00);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C04910Mm(this.A00);
    }

    public final int size() {
        return 1;
    }

    public final int A06(Object[] objArr, int i) {
        objArr[0] = this.A00;
        return 1;
    }

    public final AnonymousClass0MZ A0A() {
        return AnonymousClass0MZ.A01(this.A00);
    }

    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String obj = this.A00.toString();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[");
        A0u.append(obj);
        return AnonymousClass000.A0q("]", A0u);
    }

    public C04830Me(Object obj) {
        Objects.requireNonNull(obj);
        this.A00 = obj;
    }
}
