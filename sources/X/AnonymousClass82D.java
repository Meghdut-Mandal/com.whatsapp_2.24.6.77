package X;

import android.util.SparseIntArray;
import com.facebook.android.exoplayer2.Timeline;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.82D  reason: invalid class name */
public final class AnonymousClass82D extends AnonymousClass82N {
    public final int A00;
    public final int A01;
    public final SparseIntArray A02 = new SparseIntArray();
    public final int[] A03;
    public final int[] A04;
    public final int[] A05;
    public final Timeline[] A06;

    public AnonymousClass82D(B3L b3l, Collection collection, int i, int i2) {
        super(b3l);
        this.A01 = i;
        this.A00 = i2;
        int size = collection.size();
        this.A03 = new int[size];
        this.A04 = new int[size];
        this.A06 = new Timeline[size];
        this.A05 = new int[size];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C21662AUe aUe = (C21662AUe) it.next();
            this.A06[i3] = aUe.A03;
            this.A03[i3] = aUe.A01;
            this.A04[i3] = aUe.A02;
            int[] iArr = this.A05;
            int i4 = aUe.A07;
            iArr[i3] = i4;
            this.A02.put(i4, i3);
            i3++;
        }
    }
}
