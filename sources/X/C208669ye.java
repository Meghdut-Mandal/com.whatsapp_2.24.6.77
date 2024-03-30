package X;

import android.graphics.PointF;

/* renamed from: X.9ye  reason: invalid class name and case insensitive filesystem */
public class C208669ye implements C22855Ax5 {
    public static final C208669ye A00 = new C208669ye();
    public static final C197499bo A01 = C197499bo.A01("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    public /* bridge */ /* synthetic */ Object BlD(C21655ATw aTw, float f) {
        Integer num = C023109s.A0C;
        C21655ATw aTw2 = aTw;
        aTw2.A0M();
        String str = null;
        Integer num2 = num;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (aTw2.A0S()) {
            switch (aTw2.A0F(A01)) {
                case 0:
                    str = aTw2.A0J();
                    continue;
                case 1:
                    str2 = aTw2.A0J();
                    continue;
                case 2:
                    f2 = C21655ATw.A08(aTw2);
                    continue;
                case 3:
                    int A0E = aTw2.A0E();
                    if (A0E > 2 || A0E < 0) {
                        num2 = num;
                        break;
                    } else {
                        num2 = C023109s.A00(3)[A0E];
                        continue;
                    }
                case 4:
                    i = aTw2.A0E();
                    continue;
                case 5:
                    f3 = C21655ATw.A08(aTw2);
                    continue;
                case 6:
                    f4 = C21655ATw.A08(aTw2);
                    continue;
                case 7:
                    i2 = C202379li.A01(aTw2);
                    continue;
                case 8:
                    i3 = C202379li.A01(aTw2);
                    continue;
                case 9:
                    f5 = C21655ATw.A08(aTw2);
                    continue;
                case 10:
                    z = aTw2.A0T();
                    continue;
                case 11:
                    aTw2.A0L();
                    pointF = new PointF(C21655ATw.A08(aTw2) * f, C21655ATw.A08(aTw2) * f);
                    break;
                case 12:
                    aTw2.A0L();
                    pointF2 = new PointF(C21655ATw.A08(aTw2) * f, C21655ATw.A08(aTw2) * f);
                    break;
                default:
                    aTw2.A0P();
                    aTw2.A0Q();
                    continue;
            }
            aTw2.A0N();
        }
        aTw2.A0O();
        return new C199049ec(pointF, pointF2, num2, str, str2, f2, f3, f4, f5, i, i2, i3, z);
    }
}
