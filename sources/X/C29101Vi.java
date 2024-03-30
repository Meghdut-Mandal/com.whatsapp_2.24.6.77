package X;

import android.util.SparseIntArray;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Vi  reason: invalid class name and case insensitive filesystem */
public class C29101Vi {
    public boolean A00;
    public final C235819a A01;
    public final AnonymousClass005 A02;

    public synchronized void A00() {
        if (!this.A00) {
            for (C236319f r1 : (Set) this.A02.get()) {
                C235819a r8 = this.A01;
                int[] BCF = r1.BCF();
                List list = r8.A0B;
                int size = list.size();
                list.add(r1);
                int length = BCF.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        int i2 = BCF[i];
                        SparseIntArray sparseIntArray = r8.A03;
                        if (sparseIntArray.get(i2, -1) == -1) {
                            sparseIntArray.put(i2, size);
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Already have registered handler for recv message type:");
                            sb.append(i2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
            this.A00 = true;
        }
    }

    public C29101Vi(C235819a r1, AnonymousClass005 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }
}
