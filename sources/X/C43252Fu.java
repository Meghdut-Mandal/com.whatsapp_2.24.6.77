package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Fu  reason: invalid class name and case insensitive filesystem */
public class C43252Fu extends C49032iS {
    public final AnonymousClass16D A00;
    public final C24881Ed A01;
    public final AnonymousClass1EV A02;
    public final AnonymousClass1EU A03;

    public C43252Fu(AnonymousClass16D r1, ContactPickerFragment contactPickerFragment, C24881Ed r3, AnonymousClass1EV r4, AnonymousClass1EU r5) {
        super(contactPickerFragment);
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A00.A0n(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            if (AnonymousClass143.A0I(C36341k9.A0W(it))) {
                it.remove();
            }
        }
        if (this.A02.A02.A0E(2026)) {
            ArrayList A0N = this.A01.A0N();
            arrayList = AnonymousClass001.A0I();
            if (!A0N.isEmpty()) {
                HashMap A0J = AnonymousClass001.A0J();
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it2);
                    AnonymousClass11F r0 = A0f.A0H;
                    if (r0 != null) {
                        A0J.put(r0.getRawString(), A0f);
                    }
                }
                Iterator it3 = A0N.iterator();
                while (it3.hasNext()) {
                    Object obj = A0J.get(((C21668AUl) it3.next()).A04.getRawString());
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = AnonymousClass001.A0I();
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        ArrayList A0I4 = AnonymousClass001.A0I();
        A0F(new C61143As((AnonymousClass6O7) null, arrayList, A0I, A0I2, A0I3, (List) null, (List) null, A0I4, (List) null, (Set) null));
        AnonymousClass1EU r02 = this.A03;
        AnonymousClass1EU.A00(r02);
        return new C61143As((AnonymousClass6O7) null, arrayList, A0I, A0I2, A0I3, (List) null, r02.A06.A0B(), A0I4, (List) null, (Set) null);
    }
}
