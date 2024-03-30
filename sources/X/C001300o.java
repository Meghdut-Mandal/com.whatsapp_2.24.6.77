package X;

import java.io.Serializable;
import java.lang.Enum;

/* renamed from: X.00o  reason: invalid class name and case insensitive filesystem */
public final class C001300o<T extends Enum<T>> extends C001100m<T> implements C001200n<T>, Serializable {
    public final Enum[] entries;

    private final Object writeReplace() {
        return new C10850fK(this.entries);
    }

    public int A08() {
        return this.entries.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            Enum enumR = (Enum) obj;
            AnonymousClass00C.A0D(enumR, 0);
            if (AnonymousClass02R.A08(this.entries, enumR.ordinal()) != enumR) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0YP.A01(i, this.entries.length);
        return this.entries[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        AnonymousClass00C.A0D(enumR, 0);
        int ordinal = enumR.ordinal();
        if (AnonymousClass02R.A08(this.entries, ordinal) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        AnonymousClass00C.A0D(obj, 0);
        return indexOf(obj);
    }

    public C001300o(Enum[] enumArr) {
        this.entries = enumArr;
    }
}
