package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

/* renamed from: X.3Cb  reason: invalid class name and case insensitive filesystem */
public abstract class C61483Cb {
    public C87834Qi A00;

    public void A00(C87834Qi r6, C61953Ed r7, ArrayList arrayList) {
        WaTextView waTextView;
        int i;
        if (this instanceof AnonymousClass2VF) {
            AnonymousClass2VF r1 = (AnonymousClass2VF) this;
            r1.A00 = r6;
            String str = ((C75093mf) r6).A00;
            if (TextUtils.isEmpty(str)) {
                waTextView = r1.A00;
                i = R.string.f12nameremoved;
            } else {
                r1.A00.setText(C36321k7.A0A(r1.A01, str, R.string.f12nameremoved));
                return;
            }
        } else {
            AnonymousClass2VE r12 = (AnonymousClass2VE) this;
            r12.A00 = r6;
            if (r6 instanceof C75073md) {
                int i2 = ((C75073md) r6).A00;
                WaTextView waTextView2 = r12.A00;
                Resources resources = r12.A01.getResources();
                Object[] A0L = AnonymousClass001.A0L();
                C36331k8.A1W(A0L, i2);
                C36351kA.A16(resources, waTextView2, A0L, R.plurals.f10nameremoved, i2);
                return;
            } else if (r6 instanceof C75063mc) {
                waTextView = r12.A00;
                i = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        waTextView.setText(i);
    }
}
