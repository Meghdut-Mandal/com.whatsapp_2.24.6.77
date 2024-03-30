package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2il  reason: invalid class name and case insensitive filesystem */
public class C49222il extends C132446Tt {
    public WeakReference A00;
    public final C19460v5 A01;
    public final C236419g A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass346 r4 = (AnonymousClass346) obj;
        C32041cr r2 = (C32041cr) this.A00.get();
        if (r2 != null) {
            r2.BcD(r4.A00, r4.A01);
        }
    }

    public C49222il(C19460v5 r2, C32041cr r3, C236419g r4) {
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        int i2;
        List emptyList = Collections.emptyList();
        C19460v5 r1 = this.A01;
        ArrayList arrayList = emptyList;
        if (r1.A05()) {
            C33241ex r4 = (C33241ex) r1.A02();
            if (!r4.A00.A00.A09(C21100yf.A0P)) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0I = AnonymousClass001.A0I();
                AnonymousClass1VE r3 = r4.A02;
                Iterator it = r3.A02().iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    C33251ey r12 = r4.A01;
                    Number number = (Number) r12.A01.get(A0C);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = R.string.f12nameremoved;
                    }
                    Number number2 = (Number) r12.A00.get(A0C);
                    if (number2 != null) {
                        i2 = number2.intValue();
                    } else {
                        i2 = R.drawable.device_list_ic_unknown_device;
                    }
                    A0I.add(new AnonymousClass38U(i, i2, A0C, C36341k9.A0B(AnonymousClass1VE.A00(r3), AnonymousClass1VE.A01(A0C, "metadata/last_active_time"))));
                }
                arrayList = A0I;
            }
        }
        C236419g r7 = this.A02;
        ArrayList A09 = r7.A09();
        Collections.sort(A09, r7.A02);
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it2 = A09.iterator();
        long A002 = C19970wo.A00(r7.A0C);
        int i3 = 0;
        while (it2.hasNext()) {
            AnonymousClass3SB r122 = (AnonymousClass3SB) it2.next();
            long j = r122.A01;
            if (j > 0) {
                if (AnonymousClass6XI.A00(A002, j) > 5) {
                    it2.remove();
                    A0I2.add(r122.A07);
                } else {
                    i3++;
                }
            }
        }
        if (i3 > 20) {
            int size = A09.size();
            ArrayList A15 = C36441kJ.A15(A09.subList(size - (i3 - 20), size));
            A09.removeAll(A15);
            Iterator it3 = A15.iterator();
            while (it3.hasNext()) {
                A0I2.add(((AnonymousClass3SB) it3.next()).A07);
            }
        }
        if (!A0I2.isEmpty()) {
            r7.A0I.A08(C20760y7.copyOf((Collection) A0I2));
        }
        return new AnonymousClass346(A09, arrayList);
    }
}
