package X;

import android.view.View;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4WW  reason: invalid class name */
public class AnonymousClass4WW implements AnonymousClass4PL {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4WW(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BjC(boolean z) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ((View.OnClickListener) ((C67123Yp) obj).A03).onClick((View) this.A01);
            return;
        }
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) obj;
        contactPickerFragment.A0n.A01(contactPickerFragment.A1D(), (UserJid) this.A01, (String) null, (String) null, contactPickerFragment.A2e);
    }
}
