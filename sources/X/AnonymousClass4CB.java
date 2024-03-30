package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4CB  reason: invalid class name */
public class AnonymousClass4CB implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4CB(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void accept(Object obj) {
        String A032;
        if (this.A03 != 0) {
            AnonymousClass2dS r9 = (AnonymousClass2dS) this.A00;
            Object obj2 = this.A01;
            List list = (List) this.A02;
            C607139b r11 = (C607139b) obj;
            if (obj2 instanceof AnonymousClass2bX) {
                C65643Sx r3 = r11.A04;
                if (r3 != null) {
                    r9.A0E.A0C(r9.A07, r3);
                    r9.A0A.setTitleAndDescription(AnonymousClass14B.A0C(r3.A03(), 128), (String) null, list);
                    List list2 = r3.A06;
                    if (list2 != null && !list2.isEmpty()) {
                        r9.A0A.setSubText(((C607439e) C36391kE.A0t(r3.A06)).A02, list);
                        return;
                    }
                    return;
                }
                return;
            }
            List list3 = r11.A03;
            for (int i = 0; i < r9.A0B.size(); i++) {
                if (i < list3.size()) {
                    r9.A0E.A0C((ImageView) r9.A0B.get(i), (C65643Sx) list3.get(i));
                }
            }
            int i2 = r11.A00;
            C65643Sx r0 = r11.A04;
            if (r0 == null) {
                A032 = null;
            } else {
                A032 = r0.A03();
            }
            if (A032 != null) {
                int i3 = i2 - 1;
                Object[] A1b = C36411kG.A1b(AnonymousClass14B.A0C(A032, 128));
                AnonymousClass000.A1L(A1b, i3, 1);
                r9.A0A.setTitleAndDescription(r9.A09.A0L(A1b, R.plurals.f10nameremoved, (long) i3), (String) null, list);
                return;
            }
            r9.A0A.setTitleAndDescription(C36331k8.A0g(r9.A09, i2, 0, R.plurals.f10nameremoved), (String) null, (List) null);
            return;
        }
        AnonymousClass196 r32 = (AnonymousClass196) this.A00;
        Object obj3 = this.A02;
        r32.A0W.Bnx((Runnable) this.A01);
        r32.A08.unregisterObserver(obj3);
    }
}
