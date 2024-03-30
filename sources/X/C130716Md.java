package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.6Md  reason: invalid class name and case insensitive filesystem */
public final class C130716Md {
    public C19770wU A00;
    public Set A01;

    public static final void A00(C130716Md r5) {
        Set set = r5.A01;
        if (set != null) {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, set.size(), 0);
            Log.i(C90494aF.A0e(locale, "WaffleDataDeletionManager/purgeWaffleData: purging waffle data. Running %d deleters", Arrays.copyOf(objArr, 1)));
            Set<AnonymousClass7i3> set2 = r5.A01;
            if (set2 != null) {
                for (AnonymousClass7i3 r0 : set2) {
                    if (r0 != null) {
                        r0.BmY();
                    }
                }
                return;
            }
            throw C36331k8.A0d("waffleDataDeleters");
        }
        throw C36331k8.A0d("waffleDataDeleters");
    }

    public final void A01() {
        if (C224714l.A02()) {
            C19770wU r2 = this.A00;
            if (r2 != null) {
                r2.Boy(new C1501674f(this, 8));
                return;
            }
            throw C36321k7.A08();
        }
        A00(this);
    }
}
