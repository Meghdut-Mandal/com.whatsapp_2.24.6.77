package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5vb  reason: invalid class name and case insensitive filesystem */
public class C122895vb {
    public C160377ku A00;
    public String A01;
    public List A02;
    public final String A03;

    public C122895vb(C140456lc r5) {
        List A0d;
        String str = "";
        this.A03 = r5 != null ? r5.A0a(38, str) : str;
        if (r5 != null) {
            SparseArray sparseArray = r5.A05;
            sparseArray.get(45);
            sparseArray.get(46);
        }
        C160377ku r1 = null;
        this.A01 = r5 != null ? C140456lc.A0O(r5) : null;
        this.A00 = r5 != null ? r5.A0X(43) : r1;
        if (r5 != null && (A0d = r5.A0d(44)) != null) {
            this.A02 = AnonymousClass001.A0I();
            Iterator it = A0d.iterator();
            while (it.hasNext()) {
                this.A02.add(new C121945ty(C90514aH.A0Y(it)));
            }
        }
    }

    public static C122895vb A00(C158057fj r1) {
        return new C122895vb(r1.B7w().A0W(40));
    }
}
