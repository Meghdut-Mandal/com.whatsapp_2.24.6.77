package X;

import com.whatsapp.WaTextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3On  reason: invalid class name and case insensitive filesystem */
public final class C64573On {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final AnonymousClass12O A02;

    public static final void A00(WaTextView waTextView, C19970wo r13, long j) {
        long A002 = C19970wo.A00(r13);
        long j2 = j;
        if (j - A002 > 0) {
            waTextView.setText(AnonymousClass3UY.A00(waTextView.getContext(), waTextView.getWhatsAppLocale(), j2, A002));
            waTextView.setVisibility(0);
            return;
        }
        waTextView.setVisibility(4);
    }

    public final String A01(List list) {
        C223313w r1;
        PhoneUserJid A0A;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid A0o = C36441kJ.A0o(it);
            if (!(!(A0o instanceof C223313w) || (r1 = (C223313w) A0o) == null || (A0A = this.A02.A0A(r1)) == null)) {
                A0o = A0A;
            }
            A0J.add(C36381kD.A0v(this.A01, this.A00.A0D(A0o)));
        }
        return C36401kF.A0s(A0J, 0);
    }

    public C64573On(AnonymousClass16D r1, AnonymousClass171 r2, AnonymousClass12O r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
