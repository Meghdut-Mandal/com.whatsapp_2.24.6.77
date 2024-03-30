package X;

import android.content.SharedPreferences;

public final class AA3 implements C30631aW {
    public final C32791eC A00;

    public AA3(C32791eC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        C32791eC r6 = this.A00;
        for (Integer num : C32791eC.A02) {
            String[] split = r6.A01.A01(num.intValue()).split(",");
            if (split.length != 3) {
                break;
            }
            int A08 = C165617ti.A08(split, 0);
            int A082 = C165617ti.A08(split, 1);
            int A083 = C165617ti.A08(split, 2);
            if (A08 > 0 || A082 > 0 || A083 > 0) {
                C176378c1 r1 = new C176378c1();
                r1.A00 = 0;
                r1.A04 = C36441kJ.A0y(A08);
                r1.A02 = C36441kJ.A0y(A082);
                r1.A03 = C36441kJ.A0y(A083);
                r1.A01 = num;
                r6.A00.Bly(r1);
            }
        }
        C32781eB r2 = r6.A01;
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences == null) {
            sharedPreferences = r2.A01.A00("privacy_highlight");
            r2.A00 = sharedPreferences;
        }
        C90504aG.A12(sharedPreferences);
    }
}
