package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4XJ  reason: invalid class name */
public class AnonymousClass4XJ implements AnonymousClass4SC {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XJ(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTp(View view, AnonymousClass3A6 r17) {
        if (this.A02 != 0) {
            AnonymousClass3HB r3 = (AnonymousClass3HB) this.A01;
            AnonymousClass2bU r9 = (AnonymousClass2bU) this.A00;
            r3.A00 = r9;
            View view2 = view;
            if (r9.A1I == 23) {
                C46852bm r92 = (C46852bm) r9;
                UserJid userJid = r92.A01;
                if (userJid == null) {
                    r3.A01.A06(R.string.f12nameremoved, 0);
                    return;
                }
                r3.A06.A01(3);
                boolean A0M = r3.A02.A0M(userJid);
                if (view != null) {
                    AnonymousClass3SM.A02(view2.getContext(), view2, r3.A04, r3.A05, r3.A07, r92, r3.A0B, 5, false, A0M, A0M);
                    return;
                }
                return;
            }
            AnonymousClass155 r2 = r3.A03;
            if (!r3.A08.A0B()) {
                r2.startActivityForResult(AnonymousClass3US.A00(r2, C53112qn.A00()), 34);
            } else {
                r3.A00(view2);
            }
        } else {
            C69393dS r1 = (C69393dS) this.A00;
            String str = ((C207269up) this.A01).A0E;
            if (str != null) {
                r1.A02.Bp7(r1.A04.getContext(), Uri.parse(str), (AnonymousClass3T1) null);
            }
        }
    }
}
