package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7tX  reason: invalid class name and case insensitive filesystem */
public class C165507tX implements C159487jR {
    public Object A00;
    public final int A01;

    public C165507tX(C1265264j r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BWx(C1261662u r4, int i) {
        AnonymousClass6AS r1;
        int i2 = this.A01;
        C1265264j r0 = (C1265264j) this.A00;
        if (i2 != 0) {
            C121355t0 r02 = r0.A00;
            if (r02 != null) {
                C001700s r2 = r02.A00;
                C130186Kb r03 = (C130186Kb) r2.A04();
                if (r03 != null) {
                    r1 = r03.A03;
                } else {
                    r1 = null;
                }
                r2.A0C(new C130186Kb(r1, i));
                return;
            }
            return;
        }
        C124145xf r04 = r0.A01;
        if (r04 != null) {
            r04.A00.A0C(new C130416Kz(i));
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        if (this.A01 != 0) {
            AnonymousClass6BF r5 = (AnonymousClass6BF) obj2;
            C121355t0 r7 = ((C1265264j) this.A00).A00;
            if (r7 != null) {
                AnonymousClass00C.A0D(r5, 0);
                ArrayList A0I = AnonymousClass001.A0I();
                int i = 62;
                if (r5.A01.equals("popular_biz")) {
                    i = 70;
                }
                for (C144416s9 r2 : r5.A02) {
                    A0I.add(new AnonymousClass5E0(r2, new C163287px(r7, r2, 0), i));
                }
                String str = r5.A00;
                if (str != null) {
                    A0I.add(new AnonymousClass5EQ(66));
                }
                r7.A00.A0C(new C130186Kb(new AnonymousClass6AS(150, str), (List) A0I));
                return;
            }
            return;
        }
        AnonymousClass6BE r52 = (AnonymousClass6BE) obj2;
        C124145xf r3 = ((C1265264j) this.A00).A01;
        if (r3 != null) {
            ArrayList A0l = C36341k9.A0l(r52);
            int i2 = 0;
            for (Object next : r52.A00) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    throw C36351kA.A0v();
                }
                AnonymousClass543 r6 = (AnonymousClass543) next;
                List list = r52.A02;
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (Object next2 : list) {
                    if (AnonymousClass00C.A0J(((AnonymousClass6CA) next2).A00, r6.A00)) {
                        A0I2.add(next2);
                    }
                }
                if (A0I2.isEmpty()) {
                    String str2 = r6.A01;
                    String str3 = r6.A01;
                    A0l.add(new AnonymousClass5EK(r6.A00, str2, str3, new C154997Uj(r6, r3, i2), new AnonymousClass7Y3(r3)));
                }
                i2 = i3;
            }
            r3.A00.A0C(new C130416Kz(r52.A01, A0l, r52.A02));
        }
    }
}
