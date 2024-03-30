package X;

import androidx.fragment.app.DialogFragment;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4w9  reason: invalid class name and case insensitive filesystem */
public abstract class C100864w9 extends C100804vn {
    public final Map A00 = C36431kI.A1G();

    public final void A3n(DialogFragment dialogFragment, AnonymousClass6P2 r5, String str) {
        AnonymousClass02E r0;
        AnonymousClass00C.A0D(dialogFragment, 0);
        Map map = this.A00;
        AnonymousClass011 r02 = (AnonymousClass011) map.get(str);
        if (r02 == null || (r0 = (AnonymousClass02E) r02.first) == null || !r0.A12()) {
            map.put(str, C36441kJ.A19(dialogFragment, r5));
            Btn(dialogFragment, str);
        }
    }

    public final void A3o(DialogFragment dialogFragment, String str) {
        A3n(dialogFragment, new AnonymousClass6P2(false, true), str);
    }

    public final void A3p(C108255Su r8) {
        boolean z;
        Map map = this.A00;
        Iterator A0y = AnonymousClass000.A0y(C000400e.A0B(map));
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            AnonymousClass011 r0 = (AnonymousClass011) A11.getValue();
            DialogFragment dialogFragment = (DialogFragment) r0.first;
            AnonymousClass6P2 r2 = (AnonymousClass6P2) r0.second;
            if (dialogFragment.A12()) {
                int ordinal = r8.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        z = r2.A01;
                    }
                    dialogFragment.A1c();
                } else {
                    z = r2.A00;
                }
                if (!z) {
                }
                dialogFragment.A1c();
            }
            if (!r2.A01) {
                map.remove(key);
            }
        }
    }

    public final void A3q(String str) {
        A3D(str);
        this.A00.remove(str);
    }
}
