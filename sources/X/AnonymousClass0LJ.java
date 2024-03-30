package X;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* renamed from: X.0LJ  reason: invalid class name */
public abstract class AnonymousClass0LJ extends AnonymousClass0YG implements SafeParcelable {
    public Object A05(String str) {
        return null;
    }

    public boolean A08(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    AnonymousClass0YG r7 = (AnonymousClass0YG) obj;
                    Iterator A0z = AnonymousClass000.A0z(A06());
                    while (A0z.hasNext()) {
                        C04530Kz r2 = (C04530Kz) A0z.next();
                        boolean A07 = A07(r2);
                        boolean A072 = r7.A07(r2);
                        if (A07) {
                            if (A072 && AnonymousClass0QM.A00(A04(r2), r7.A04(r2))) {
                            }
                        } else if (A072) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Iterator A0z = AnonymousClass000.A0z(A06());
        int i = 0;
        while (A0z.hasNext()) {
            C04530Kz r2 = (C04530Kz) A0z.next();
            if (A07(r2)) {
                Object A04 = A04(r2);
                AnonymousClass006.A01(A04);
                i = (i * 31) + A04.hashCode();
            }
        }
        return i;
    }
}
