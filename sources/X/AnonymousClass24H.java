package X;

import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.24H  reason: invalid class name */
public abstract class AnonymousClass24H extends C100804vn {
    public boolean A00 = false;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            ContactPicker contactPicker = (ContactPicker) this;
            C18800tq r2 = ((C27111My) C36421kH.A0H(this)).A5g;
            C36321k7.A0c(r2, contactPicker);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, contactPicker, C36321k7.A05(r2, r1, contactPicker));
            A01(r2, r1, contactPicker);
        }
    }

    public AnonymousClass24H() {
        C89324Wc.A00(this, 30);
    }

    public static void A01(C18800tq r1, C18830tt r2, ContactPicker contactPicker) {
        contactPicker.A00 = r2.A56();
        contactPicker.A03 = (AnonymousClass1XY) r1.A7c.get();
        contactPicker.A09 = (AnonymousClass1DU) r1.A4T.get();
        contactPicker.A02 = (C21360z5) r1.A7P.get();
        contactPicker.A08 = (C21010yW) r1.A79.get();
        contactPicker.A04 = (AnonymousClass1X4) r1.A8h.get();
        contactPicker.A0A = (WhatsAppLibLoader) r1.A9W.get();
        contactPicker.A05 = (C229216m) r1.A27.get();
        contactPicker.A0B = (C29501Ww) r1.A7K.get();
        contactPicker.A07 = (C20830yE) r1.A9E.get();
    }
}
