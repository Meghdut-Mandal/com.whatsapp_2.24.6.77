package X;

import android.view.View;
import com.whatsapp.R;

public final class A9U implements C22921AyX {
    public final AnonymousClass3SF A00;

    public void BSD(C22922AyY ayY) {
        this.A00.A01.setText(((A9Y) ayY).A00);
    }

    public A9U(View view, AnonymousClass1LI r4, AnonymousClass1Pp r5) {
        C36321k7.A0x(r5, r4);
        r5.A06(C36391kE.A0N(view, R.id.contactpicker_row_photo), R.drawable.avatar_contact);
        AnonymousClass3SF A01 = AnonymousClass3SF.A01(view, r4, R.id.contactpicker_row_name);
        this.A00 = A01;
        C33511fU.A03(A01.A01);
    }
}
