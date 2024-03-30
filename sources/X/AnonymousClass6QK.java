package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6QK  reason: invalid class name */
public class AnonymousClass6QK {
    public List A00;
    public Set A01 = C36441kJ.A16();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C18820ts A05;
    public final AnonymousClass7g9 A06;
    public final C119255pW A07;
    public final AnonymousClass1QW A08;

    public void A07() {
        this.A03 = false;
        this.A04 = false;
        this.A01 = C36441kJ.A16();
        this.A02 = false;
    }

    public static C105235Dw A00(AnonymousClass6QK r9, C160627lJ r10, int i) {
        Integer num;
        if (r9.A04) {
            num = C36361kB.A0i();
        } else {
            num = null;
        }
        C119255pW r0 = r9.A07;
        Set set = r9.A01;
        List list = r9.A00;
        boolean z = r9.A03;
        boolean z2 = r9.A02;
        ArrayList A0I = AnonymousClass001.A0I();
        if (r0.A00.BLo()) {
            A0I.add(new AnonymousClass51R(z2));
        }
        boolean z3 = true;
        if (list != null && !list.isEmpty()) {
            A0I.add(new AnonymousClass51Q(set, C90514aH.A1a(set)));
        }
        if (num == null) {
            z3 = false;
        }
        A0I.add(new AnonymousClass51T(z3));
        A0I.add(new AnonymousClass51S(z));
        if (!set.isEmpty() || num != null || z || z2) {
            A0I.add(new AnonymousClass51P());
        }
        if (!A0I.isEmpty()) {
            return new C105235Dw(r10, A0I, i);
        }
        return null;
    }

    public C119305pb A04() {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        ArrayList A15 = C36441kJ.A15(list);
        Collections.sort(A15, new C163897qw(Collator.getInstance(C36401kF.A0x(this.A05)), 11));
        return new C119305pb(A15, C36441kJ.A15(this.A01));
    }

    public Boolean A05() {
        if (this.A06.BLo()) {
            return Boolean.valueOf(this.A02);
        }
        return null;
    }

    public String A06() {
        if (this.A01.isEmpty()) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C134986bw r0 : this.A01) {
            A0I.add(r0.A00);
        }
        return TextUtils.join(",", A0I);
    }

    public void A08(Bundle bundle) {
        HashSet A16;
        boolean z = bundle.getBoolean("saved_open_now");
        boolean z2 = false;
        if (Boolean.valueOf(z) == null) {
            z = false;
        }
        this.A04 = z;
        boolean z3 = bundle.getBoolean("saved_has_catalog");
        if (Boolean.valueOf(z3) == null) {
            z3 = false;
        }
        this.A03 = z3;
        boolean z4 = bundle.getBoolean("saved_distance");
        if (Boolean.valueOf(z4) != null) {
            z2 = z4;
        }
        this.A02 = z2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
        if (parcelableArrayList != null) {
            A16 = C90524aI.A0k(parcelableArrayList);
        } else {
            A16 = C36441kJ.A16();
        }
        this.A01 = A16;
        this.A00 = bundle.getParcelableArrayList("saved_current_filter_categories");
    }

    public void A09(AnonymousClass08M r4) {
        HashSet A16;
        Map map = r4.A03;
        boolean z = false;
        this.A04 = C90494aF.A1Y((Boolean) map.get("saved_open_now"));
        this.A03 = C90494aF.A1Y((Boolean) map.get("saved_has_catalog"));
        Boolean bool = (Boolean) map.get("saved_distance");
        if (bool != null) {
            z = bool.booleanValue();
        }
        this.A02 = z;
        Collection collection = (Collection) map.get("saved_selected_multiple_choice_category");
        if (collection != null) {
            A16 = C90524aI.A0k(collection);
        } else {
            A16 = C36441kJ.A16();
        }
        this.A01 = A16;
        this.A00 = C90524aI.A0o("saved_current_filter_categories", map);
    }

    public void A0A(AnonymousClass08M r3) {
        r3.A03("saved_open_now", Boolean.valueOf(this.A04));
        r3.A03("saved_has_catalog", Boolean.valueOf(this.A03));
        r3.A03("saved_distance", Boolean.valueOf(this.A02));
        r3.A03("saved_selected_multiple_choice_category", C36441kJ.A15(this.A01));
        r3.A03("saved_current_filter_categories", this.A00);
    }

    public boolean A0B() {
        if (!this.A01.isEmpty() || this.A04 || this.A03) {
            return false;
        }
        return true;
    }

    public boolean A0C(Bundle bundle) {
        if (bundle.getBoolean("saved_open_now") == this.A04 && this.A03 == bundle.getBoolean("saved_has_catalog") && this.A02 == bundle.getBoolean("saved_distance")) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("saved_selected_multiple_choice_category");
            if (this.A01.size() == parcelableArrayList.size()) {
                Iterator it = parcelableArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!this.A01.contains(it.next())) {
                            break;
                        }
                    } else {
                        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("saved_current_filter_categories");
                        List list = this.A00;
                        if (list == null || parcelableArrayList2 == null) {
                            return false;
                        }
                        if (list.size() == parcelableArrayList2.size()) {
                            for (Object contains : this.A00) {
                                if (!parcelableArrayList2.contains(contains)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public AnonymousClass6QK(AnonymousClass7g8 r3, AnonymousClass7g9 r4, C18820ts r5, AnonymousClass1QW r6) {
        C18800tq r0;
        this.A05 = r5;
        this.A08 = r6;
        C164437ro r32 = (C164437ro) r3;
        int i = r32.A01;
        Object obj = r32.A00;
        if (i != 0) {
            r0 = ((AnonymousClass1U2) obj).A00;
        } else {
            r0 = ((C27121Mz) obj).A01;
        }
        this.A07 = new C119255pW(r4, C90494aF.A0N(r0.A00));
        this.A06 = r4;
    }

    public Bundle A01() {
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("saved_open_now", this.A04);
        A072.putBoolean("saved_has_catalog", this.A03);
        A072.putBoolean("saved_distance", this.A02);
        A072.putParcelableArrayList("saved_selected_multiple_choice_category", C36441kJ.A15(this.A01));
        List list = this.A00;
        if (list != null) {
            A072.putParcelableArrayList("saved_current_filter_categories", C36441kJ.A15(list));
        }
        return A072;
    }

    public C1260462i A02() {
        Integer num;
        ArrayList A0I = AnonymousClass001.A0I();
        for (C134986bw r0 : this.A01) {
            A0I.add(r0.A00);
        }
        if (A0I.isEmpty()) {
            A0I = null;
        }
        if (this.A04) {
            num = C36361kB.A0i();
        } else {
            num = null;
        }
        return new C1260462i(num, A0I, this.A03);
    }

    public C105235Dw A03(C160627lJ r7, List list) {
        HashSet A16 = C36441kJ.A16();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C134986bw r0 = (C134986bw) it.next();
            A16.add(new C134986bw(r0.A00, r0.A01));
        }
        A16.addAll(this.A01);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it2 = A16.iterator();
        while (it2.hasNext()) {
            C134986bw r02 = (C134986bw) it2.next();
            A0I.add(new AnonymousClass544(r02.A00, r02.A01));
        }
        this.A00 = A0I;
        return A00(this, r7, 76);
    }
}
