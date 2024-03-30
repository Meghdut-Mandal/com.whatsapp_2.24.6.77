package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.2iz  reason: invalid class name and case insensitive filesystem */
public class C49362iz extends C132446Tt {
    public final C20430xY A00;
    public final WeakReference A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass1A6 A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C131666Pz r1 = new C131666Pz(C108515Tu.A0A);
        r1.A00 = AnonymousClass6NS.A0C;
        r1.A02 = true;
        return this.A00.A02(r1.A01());
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C131626Pu r5 = (C131626Pu) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            contactPickerFragment.A0w.A00.A2C(false);
            ContactPickerFragment.A0G(contactPickerFragment);
            int i = r5.A00;
            if (i == 0) {
                contactPickerFragment.A0w.BO5(R.string.f12nameremoved);
            } else if (i == 1 || i == 2 || i == 3) {
                if (contactPickerFragment.A0i.A00()) {
                    C99304t3 r0 = contactPickerFragment.A0G;
                    if (r0 == null || !r0.A0W()) {
                        contactPickerFragment.A0Q.A06(R.string.f12nameremoved, 0);
                    }
                }
            } else if (i == 4 || i == 6) {
                contactPickerFragment.A0w.BO5(R.string.f12nameremoved);
                contactPickerFragment.A13.A06();
            }
        }
    }

    public C49362iz(AnonymousClass16D r2, ContactPickerFragment contactPickerFragment, C20430xY r4, AnonymousClass1A6 r5) {
        this.A01 = AnonymousClass001.A0F(contactPickerFragment);
        this.A02 = r2;
        this.A00 = r4;
        this.A03 = r5;
    }
}
