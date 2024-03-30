package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.0Mz  reason: invalid class name and case insensitive filesystem */
public final class C05040Mz extends C10930fS {
    public final int A00;
    public final AnonymousClass0MZ A01;

    public final int A01() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C10930fS r7 = (C10930fS) obj;
        int A02 = r7.A02();
        if (4 != A02) {
            return 4 - A02;
        }
        AnonymousClass0MZ r5 = this.A01;
        int size = r5.size();
        AnonymousClass0MZ r4 = ((C05040Mz) r7).A01;
        if (size != r4.size()) {
            return r5.size() - r4.size();
        }
        for (int i = 0; i < r5.size(); i++) {
            int compareTo = ((C10930fS) r5.get(i)).compareTo(r4.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C05040Mz) obj).A01);
    }

    public final String toString() {
        CharSequence obj;
        AnonymousClass0MZ r6 = this.A01;
        if (r6.isEmpty()) {
            return "[]";
        }
        ArrayList A0I = AnonymousClass001.A0I();
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            A0I.add(r6.get(i).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = A0I.iterator();
        try {
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    next.getClass();
                    if (next instanceof CharSequence) {
                        obj = (CharSequence) next;
                    } else {
                        obj = next.toString();
                    }
                    sb.append(obj);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(",\n  ");
                }
            }
            return AnonymousClass000.A0q("\n]", sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C05040Mz(AnonymousClass0MZ r5) {
        Objects.requireNonNull(r5);
        this.A01 = r5;
        int i = 0;
        int i2 = 0;
        while (true) {
            AnonymousClass0MZ r1 = this.A01;
            if (i >= r1.size()) {
                break;
            }
            int A012 = ((C10930fS) r1.get(i)).A01();
            if (i2 < A012) {
                i2 = A012;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 4) {
            throw new AnonymousClass0NY("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, 4);
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public final int A02() {
        return 4;
    }
}
