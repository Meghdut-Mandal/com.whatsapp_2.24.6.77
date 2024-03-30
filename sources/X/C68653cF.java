package X;

import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.3cF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68653cF implements C22908AyK {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C68653cF(ContactPickerFragment contactPickerFragment, String str, boolean z) {
        this.A00 = contactPickerFragment;
        this.A01 = str;
        this.A02 = z;
    }

    public final void BTc() {
        ContactPickerFragment contactPickerFragment = this.A00;
        String str = this.A01;
        int i = 20;
        if (this.A02) {
            i = 19;
        }
        contactPickerFragment.A10.A02(contactPickerFragment.A1D(), Integer.valueOf(i), str, "sms:");
    }
}
