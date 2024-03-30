package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.TreeSet;

/* renamed from: X.3uy  reason: invalid class name and case insensitive filesystem */
public class C80173uy implements Comparable {
    public int A00 = 0;
    public final C19730wQ A01;
    public final String A02;
    public final HashMap A03 = AnonymousClass001.A0J();
    public final TreeSet A04 = new TreeSet();

    public int A00() {
        if (this instanceof AnonymousClass28g) {
            return (int) ((AnonymousClass28g) this).A00;
        }
        return this.A04.size();
    }

    public void A01(C80143uv r5) {
        AnonymousClass11F r3 = r5.A04;
        Pair A0Q = C36441kJ.A0Q(r3, Long.valueOf(r5.A00));
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(A0Q)) {
            hashMap.put(A0Q, r5);
            this.A04.add(r5);
            if (this.A01.A0M(r3)) {
                this.A00++;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        boolean A1R;
        boolean A1R2;
        C80173uy r7 = (C80173uy) obj;
        if (this instanceof AnonymousClass28g) {
            A1R = ((AnonymousClass28g) this).A01;
        } else {
            A1R = AnonymousClass000.A1R(this.A00);
        }
        if (r7 instanceof AnonymousClass28g) {
            A1R2 = ((AnonymousClass28g) r7).A01;
        } else {
            A1R2 = AnonymousClass000.A1R(r7.A00);
        }
        if (A1R == A1R2) {
            TreeSet treeSet = this.A04;
            TreeSet treeSet2 = r7.A04;
            int compare = Long.compare((long) treeSet.size(), (long) treeSet2.size());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Long.compare(((C80143uv) treeSet.first()).A02, ((C80143uv) treeSet2.first()).A02);
            if (compare2 == 0) {
                return this.A02.compareTo(r7.A02);
            }
            return compare2;
        } else if (A1R) {
            return 1;
        } else {
            return -1;
        }
    }

    public C80173uy(C19730wQ r2, C80143uv r3, String str) {
        this.A01 = r2;
        this.A02 = str;
        A01(r3);
    }
}
