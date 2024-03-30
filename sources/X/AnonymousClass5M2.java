package X;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5M2  reason: invalid class name */
public class AnonymousClass5M2 extends C132446Tt {
    public WeakReference A00;
    public final C24881Ed A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List<C202319lY> list = (List) obj;
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            C95454l5 r5 = (C95454l5) weakReference.get();
            C36341k9.A18(r5.A00, false);
            C36341k9.A18(r5.A01, true);
            C1276068y r3 = r5.A07;
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass5Gk r7 = null;
            for (C202319lY r0 : list) {
                AnonymousClass5Gk A002 = r3.A00(r0.A05);
                if (r7 != null) {
                    if (r7.get(2) == A002.get(2) && r7.get(1) == A002.get(1)) {
                        r7.count++;
                    } else {
                        A0I.add(r7);
                    }
                }
                A002.count = 0;
                r7 = A002;
                r7.count++;
            }
            if (r7 != null) {
                A0I.add(r7);
            }
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (int i = 0; i < list.size(); i++) {
                C202319lY r9 = (C202319lY) list.get(i);
                AnonymousClass5H2 r72 = new AnonymousClass5H2();
                r72.A01 = C20040wv.A09(r5.A05, r5.A04.A08(r9.A05));
                r72.A00 = r5.A08.A0P(r9);
                boolean z = true;
                if (i < list.size() - 1) {
                    AnonymousClass5Gk A003 = r3.A00(r9.A05);
                    AnonymousClass5Gk A004 = r3.A00(((C202319lY) list.get(i + 1)).A05);
                    if (A003.get(2) != A004.get(2) || A003.get(1) != A004.get(1)) {
                        z = false;
                    }
                }
                r72.A02 = z;
                A0I2.add(r72);
            }
            r5.A02.A0D(Pair.create(A0I2, A0I));
        }
    }

    public AnonymousClass5M2(C24881Ed r2, C95454l5 r3) {
        this.A01 = r2;
        this.A00 = AnonymousClass001.A0F(r3);
    }
}
