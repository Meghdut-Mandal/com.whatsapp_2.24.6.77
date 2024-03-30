package X;

import android.util.SparseIntArray;
import java.util.Objects;

/* renamed from: X.87p  reason: invalid class name */
public abstract class AnonymousClass87p extends A12 {
    public final int[] A00;

    public AnonymousClass87p(C22781Avs avs, C197879cW r6, B41 b41) {
        super(avs, r6, b41);
        SparseIntArray sparseIntArray = r6.A03;
        Objects.requireNonNull(sparseIntArray);
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
