package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Fr  reason: invalid class name and case insensitive filesystem */
public class C43222Fr extends C50302kX {
    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        HashSet A16 = C36441kJ.A16();
        ArrayList A0I4 = AnonymousClass001.A0I();
        HashSet A162 = C36441kJ.A16();
        boolean A0K = A0K();
        A0J(this.A09, A0I2, A16, A162, A0K);
        C91494c6 r2 = this.A02;
        if (!r2.isCancelled()) {
            Iterator it = this.A08.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                Jid A0h = C36411kG.A0h(A0f);
                if (!A16.contains(A0h) && A0f.A0F != null && !A0f.A0G() && C50302kX.A04(this, A0f) && !this.A0B.contains(A0h) && !(A0h instanceof C177638e7) && !(A0h instanceof C177528dw) && A0M(A0f, A0K)) {
                    A0I3.add(A0f);
                    C36391kE.A1W(A0I4, C36391kE.A0C(A0f));
                }
            }
            if (!r2.isCancelled()) {
                Collections.sort(A0I3, new C81563xD(this.A02, this.A03));
                A0H(A0I, A0I2, R.string.f12nameremoved, false);
                if (!r2.isCancelled()) {
                    WeakReference weakReference = this.A05;
                    AnonymousClass02E r0 = (AnonymousClass02E) weakReference.get();
                    if (r0 != null && r0.A12()) {
                        A0I(A0I, A0I2, AnonymousClass001.A0I(), AnonymousClass001.A0I(), AnonymousClass001.A0I(), A0I3);
                    }
                    C50302kX.A03(A0I, A0I3);
                    if (!r2.isCancelled() && A0I.isEmpty()) {
                        C50302kX.A02(this, (ContactPickerFragment) weakReference.get(), A0I);
                    }
                }
            }
        }
        return new AnonymousClass34A(A0I, this.A06);
    }

    public C43222Fr(C19730wQ r1, AnonymousClass16D r2, AnonymousClass185 r3, AnonymousClass171 r4, ContactPickerFragment contactPickerFragment, C18820ts r6, String str, HashSet hashSet, List list, List list2, List list3, List list4, Set set) {
        super(r1, r2, r3, r4, contactPickerFragment, r6, str, hashSet, list, list2, list3, list4, set);
    }
}
