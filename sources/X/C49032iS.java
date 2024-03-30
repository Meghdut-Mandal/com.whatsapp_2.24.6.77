package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.payments.ui.IndiaPaymentMerchantContactPickerFragment;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2iS  reason: invalid class name and case insensitive filesystem */
public abstract class C49032iS extends C132446Tt {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C61143As r11 = (C61143As) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            List list = r11.A01;
            list.size();
            r11.A08.size();
            List list2 = r11.A02;
            if (list2 != null) {
                list2.size();
            }
            contactPickerFragment.A0u = null;
            if (!(contactPickerFragment instanceof PaymentContactPickerFragment) && !(contactPickerFragment instanceof IndiaPaymentMerchantContactPickerFragment) && ((contactPickerFragment.A30 || contactPickerFragment.A31 || contactPickerFragment.A36 || contactPickerFragment.A33 || contactPickerFragment.A32) && !list.isEmpty())) {
                AnonymousClass07B A002 = C68733cN.A00(contactPickerFragment);
                C18820ts r6 = contactPickerFragment.A1D;
                long size = (long) list.size();
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, list.size(), 0);
                A002.A0P(r6.A0L(A0L, R.plurals.f10nameremoved, size));
            }
            contactPickerFragment.A1u(r11);
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        C61143As[] r3 = (C61143As[]) objArr;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            contactPickerFragment.A1u(r3[0]);
        }
    }

    public C49032iS(ContactPickerFragment contactPickerFragment) {
        this.A00 = AnonymousClass001.A0F(contactPickerFragment);
    }
}
