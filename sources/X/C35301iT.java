package X;

import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.1iT  reason: invalid class name and case insensitive filesystem */
public class C35301iT implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C35301iT(Object obj, Object obj2, int i, int i2, boolean z) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A03 = z;
        this.A02 = obj2;
    }

    public final void run() {
        if (this.A04 != 0) {
            C18820ts r10 = (C18820ts) this.A01;
            int i = this.A00;
            boolean z = this.A03;
            AnonymousClass17Y r8 = (AnonymousClass17Y) this.A02;
            String A0D = r10.A0D(R.string.f12nameremoved, r10.A0K(new Object[]{String.format(C18820ts.A01(r10.A00), "%d", new Object[]{Integer.valueOf(i)})}, 283, (long) i));
            if (z) {
                r8.A0E(A0D, 1);
            } else {
                r8.A0K(A0D, 1);
            }
        } else {
            AnonymousClass1Y4 r2 = (AnonymousClass1Y4) this.A01;
            AnonymousClass3T1 r4 = (AnonymousClass3T1) this.A02;
            int i2 = this.A00;
            boolean z2 = this.A03;
            HashSet A002 = r2.A07.A00(r4.A1J);
            r2.A03.A0N(r4, i2, 1, AnonymousClass143.A09(r2.A00, A002).size(), A002.size(), z2);
        }
    }
}
