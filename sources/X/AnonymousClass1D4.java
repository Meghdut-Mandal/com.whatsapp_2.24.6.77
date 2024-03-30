package X;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1D4  reason: invalid class name */
public class AnonymousClass1D4 {
    public final C19970wo A00;
    public final C19600wD A01;
    public final C20810yC A02;
    public final AnonymousClass1D2 A03;

    public static int A00(AnonymousClass1M8 r4) {
        if (r4 != null) {
            int i = r4.A00;
            if (r4.A04) {
                if (Build.VERSION.SDK_INT >= 29 && i == 20) {
                    return 3;
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 0;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                        return 1;
                    case 13:
                    case 15:
                        return 2;
                    default:
                        return 5;
                }
            } else if (r4.A06) {
                return 4;
            }
        }
        return 5;
    }

    public synchronized Float A01(int i) {
        Float f;
        float f2;
        float f3;
        int i2;
        int A002 = A00(this.A01.A04());
        int A003 = (int) ((((C19970wo.A00(this.A00) / 1000) / 60) / 60) % 24);
        AnonymousClass1D2 r3 = this.A03;
        C64453Oa r6 = new C64453Oa(r3.A01(i, A003, A002));
        List list = r6.A00;
        boolean z = false;
        if (list.size() >= 10) {
            z = true;
        }
        if (!z) {
            if (C20800yB.A01(C21000yV.A02, this.A02, 154)) {
                ArrayList A012 = r3.A01(i, (A003 + 23) % 24, A002);
                ArrayList A013 = r3.A01(i, (A003 + 1) % 24, A002);
                Iterator it = A012.iterator();
                Iterator it2 = A013.iterator();
                boolean z2 = false;
                while (true) {
                    boolean z3 = false;
                    if (list.size() >= 10) {
                        z3 = true;
                    }
                    if (!z3) {
                        if (z2 || !it.hasNext()) {
                            if (!it2.hasNext()) {
                                if (!it.hasNext()) {
                                    f = null;
                                    break;
                                }
                                i2 = ((Integer) it.next()).intValue();
                            } else {
                                i2 = ((Integer) it2.next()).intValue();
                                z2 = false;
                            }
                        } else {
                            i2 = ((Integer) it.next()).intValue();
                            z2 = true;
                        }
                        r6.A01(i2);
                    } else {
                        if (list.size() >= 10) {
                            f3 = (float) C54742tR.A00(list);
                        } else {
                            f3 = -1.0f;
                        }
                        f = Float.valueOf(f3);
                    }
                }
            }
        }
        if (list.size() >= 10) {
            f2 = (float) C54742tR.A00(list);
        } else {
            f2 = -1.0f;
        }
        f = Float.valueOf(f2);
        return f;
    }

    public synchronized void A02(C25471Gl r8, int i, long j, long j2) {
        int A002 = A00(this.A01.A04());
        int A003 = (int) ((((C19970wo.A00(this.A00) / 1000) / 60) / 60) % 24);
        if (!(A002 == 0 || A002 == 5 || ((r8 != C25471Gl.A0D && r8 != C25471Gl.A0J && r8 != C25471Gl.A0l && r8 != C25471Gl.A0T) || j < 51200 || j2 < 100))) {
            AnonymousClass1D2 r6 = this.A03;
            C64453Oa r1 = new C64453Oa(r6.A01(i, A003, A002));
            r1.A01((int) (((float) j) / ((float) j2)));
            List list = r1.A00;
            AnonymousClass00C.A0D(list, 4);
            ((SharedPreferences) r6.A01.getValue()).edit().putString(AnonymousClass1D2.A00(i, A003, A002), C007103b.A0Q(",", "", ",", list, (C006302t) null)).apply();
        }
    }

    public AnonymousClass1D4(C19600wD r1, C19970wo r2, C20810yC r3, AnonymousClass1D2 r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r1;
    }
}
