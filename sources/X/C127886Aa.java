package X;

import android.content.res.TypedArray;

/* renamed from: X.6Aa  reason: invalid class name and case insensitive filesystem */
public final class C127886Aa {
    public final int A00;
    public final Integer A01;

    public static C127886Aa A00(TypedArray typedArray, int i, int i2, int i3) {
        return new C127886Aa(typedArray.getInt(i2, i3), Integer.valueOf(typedArray.getInt(i, 0)));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127886Aa) {
                C127886Aa r5 = (C127886Aa) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A01) * 31) + this.A00;
    }

    public C127886Aa(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("QuickActionIcon(icon=");
        A0u.append(this.A01);
        A0u.append(", tintColor=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
