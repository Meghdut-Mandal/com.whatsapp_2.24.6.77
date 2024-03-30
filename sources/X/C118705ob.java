package X;

import android.util.Pair;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5ob  reason: invalid class name and case insensitive filesystem */
public class C118705ob {
    public HashMap A00 = AnonymousClass001.A0J();
    public List A01 = AnonymousClass001.A0I();

    public C118705ob(SparseArray sparseArray) {
        long j;
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (sparseArray.valueAt(i) != null) {
                AnonymousClass6F3 r0 = (AnonymousClass6F3) sparseArray.valueAt(i);
                j = TimeUnit.MICROSECONDS.convert(r0.A01, r0.A02);
            } else {
                j = -1;
            }
            this.A01.add(C36441kJ.A0Q(Integer.valueOf(keyAt), Long.valueOf(j)));
        }
        Collections.sort(this.A01, new C163897qw(this, 8));
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            C36341k9.A1K(((Pair) this.A01.get(i2)).first, this.A00, i2);
        }
    }
}
