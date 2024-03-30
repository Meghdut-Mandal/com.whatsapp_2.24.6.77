package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.0N0  reason: invalid class name */
public final class AnonymousClass0N0 extends C10930fS {
    public final C04800Mb A00;
    public final int A01;

    public final int A01() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        C10930fS r7 = (C10930fS) obj;
        int A02 = r7.A02();
        int i = 5;
        if (5 == A02) {
            C04800Mb r3 = this.A00;
            int size = r3.size();
            C04800Mb r1 = ((AnonymousClass0N0) r7).A00;
            if (size != r1.size()) {
                i = r3.size();
                A02 = r1.size();
            } else {
                C12200hf A07 = r3.A02().A07();
                C12200hf A072 = r1.A02().A07();
                do {
                    if (!A07.hasNext() && !A072.hasNext()) {
                        return 0;
                    }
                    Map.Entry A11 = AnonymousClass000.A11(A07);
                    Map.Entry A112 = AnonymousClass000.A11(A072);
                    int compareTo2 = ((C10930fS) A11.getKey()).compareTo(A112.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((C10930fS) A11.getValue()).compareTo(A112.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass0N0) obj).A00);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence obj;
        CharSequence obj2;
        C04800Mb r1 = this.A00;
        if (r1.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C12200hf A07 = r1.A02().A07();
        while (A07.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A07);
            linkedHashMap.put(A11.getKey().toString().replace("\n", "\n  "), A11.getValue().toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("{\n  ");
        Iterator A0y = AnonymousClass000.A0y(linkedHashMap);
        try {
            if (A0y.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y);
                Object key = A112.getKey();
                key.getClass();
                if (key instanceof CharSequence) {
                    charSequence = (CharSequence) key;
                } else {
                    charSequence = key.toString();
                }
                while (true) {
                    sb.append(charSequence);
                    sb.append(" : ");
                    Object value = A112.getValue();
                    value.getClass();
                    if (value instanceof CharSequence) {
                        obj = (CharSequence) value;
                    } else {
                        obj = value.toString();
                    }
                    sb.append(obj);
                    if (!A0y.hasNext()) {
                        break;
                    }
                    sb.append(",\n  ");
                    A112 = AnonymousClass000.A11(A0y);
                    Object key2 = A112.getKey();
                    key2.getClass();
                    if (key2 instanceof CharSequence) {
                        obj2 = (CharSequence) key2;
                    } else {
                        obj2 = key2.toString();
                    }
                }
            }
            return AnonymousClass000.A0q("\n}", sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public AnonymousClass0N0(C04800Mb r5) {
        Objects.requireNonNull(r5);
        this.A00 = r5;
        C12200hf A07 = r5.A02().A07();
        int i = 0;
        while (A07.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A07);
            int A012 = ((C10930fS) A11.getKey()).A01();
            i = i < A012 ? A012 : i;
            int A013 = ((C10930fS) A11.getValue()).A01();
            if (i < A013) {
                i = A013;
            }
        }
        int i2 = i + 1;
        this.A01 = i2;
        if (i2 > 4) {
            throw new AnonymousClass0NY("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, 5);
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public final int A02() {
        return 5;
    }
}
