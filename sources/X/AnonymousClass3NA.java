package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3NA  reason: invalid class name */
public final class AnonymousClass3NA {
    public final C225314u A00;

    public static final void A00(AnonymousClass3NA r3, AnonymousClass00S r4, int i) {
        C225314u r2 = r3.A00;
        if (!AnonymousClass3SJ.A04(r2)) {
            View A0D = C36421kH.A0D(r2, R.layout.f9nameremoved);
            C36391kE.A0P(A0D, R.id.passkey_success_dialog_message).setText(i);
            C39001qm A002 = AnonymousClass3LW.A00(r2);
            A002.A0j(A0D);
            AnonymousClass0FM A0O = C36371kC.A0O(A002);
            A0O.show();
            r2.A05.A0I(C80313vC.A00(A0O, r4, 22), 1000);
        }
    }

    public AnonymousClass3NA(C225314u r1) {
        this.A00 = r1;
    }
}
