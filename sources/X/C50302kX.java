package X;

import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2kX  reason: invalid class name and case insensitive filesystem */
public abstract class C50302kX extends C132446Tt {
    public final C19730wQ A00;
    public final AnonymousClass185 A01;
    public final AnonymousClass171 A02;
    public final C18820ts A03;
    public final String A04;
    public final WeakReference A05;
    public final ArrayList A06;
    public final HashSet A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final Set A0B;
    public final AnonymousClass16D A0C;

    public static void A02(C50302kX r1, ContactPickerFragment contactPickerFragment, AbstractCollection abstractCollection) {
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            abstractCollection.add(new C70203el(r1.A0G(contactPickerFragment)));
        }
    }

    public static boolean A04(C50302kX r3, AnonymousClass141 r4) {
        return r3.A02.A0h(r4, r3.A06, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass34A r3 = (AnonymousClass34A) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            contactPickerFragment.A0t = null;
            contactPickerFragment.A1t(r3);
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        AnonymousClass34A[] r3 = (AnonymousClass34A[]) objArr;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            contactPickerFragment.A1t(r3[0]);
        }
    }

    public String A0G(ContactPickerFragment contactPickerFragment) {
        if (this instanceof C43232Fs) {
            C43232Fs r4 = (C43232Fs) this;
            if (r4.A06 != null) {
                return C36401kF.A0q(contactPickerFragment, r4.A04, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            }
            boolean z = r4.A0e;
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            return contactPickerFragment.A0n(i);
        } else if (this.A06 == null) {
            return contactPickerFragment.A0n(R.string.f12nameremoved);
        } else {
            return C36401kF.A0q(contactPickerFragment, this.A04, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        }
    }

    public void A0H(ArrayList arrayList, List list, int i, boolean z) {
        AnonymousClass02E r1 = (AnonymousClass02E) this.A05.get();
        if (r1 != null && r1.A12() && !list.isEmpty()) {
            if (!z) {
                C43232Fs.A00(r1, arrayList, i);
            }
            C19730wQ r0 = this.A00;
            r0.A0G();
            AnonymousClass142 r12 = r0.A0E;
            if (r12 != null && A0L() && !list.isEmpty() && list.remove(r12)) {
                list.add(0, r12);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C70183ej(C36391kE.A0f(it)));
        }
    }

    public void A0I(ArrayList arrayList, List list, List list2, List list3, List list4, List list5) {
        int i;
        AnonymousClass02E r1 = (AnonymousClass02E) this.A05.get();
        if (r1 != null && r1.A12()) {
            if ((!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty() || !list4.isEmpty()) && !list5.isEmpty()) {
                if (this instanceof C43222Fr) {
                    i = R.string.f12nameremoved;
                } else {
                    i = R.string.f12nameremoved;
                }
                C43232Fs.A00(r1, arrayList, i);
                if (A0L()) {
                    C19730wQ r0 = this.A00;
                    r0.A0G();
                    AnonymousClass142 r12 = r0.A0E;
                    if (r12 != null && !list.contains(r12) && !list2.contains(r12)) {
                        arrayList.add(new C70183ej(r12));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K() {
        /*
            r4 = this;
            java.util.HashSet r1 = r4.A07
            boolean r0 = r1.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r2 = r1.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            int r1 = X.C36341k9.A0A(r2)
            r0 = 42
            if (r1 == r0) goto L_0x001f
            r0 = 43
            if (r1 != r0) goto L_0x000d
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50302kX.A0K():boolean");
    }

    public boolean A0L() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && (contactPickerFragment.A36 || contactPickerFragment.A34 || contactPickerFragment.A3A)) {
            C20810yC r1 = contactPickerFragment.A1g;
            if (!C36391kE.A1X(r1) || !r1.A0E(2630)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C50302kX(C19730wQ r2, AnonymousClass16D r3, AnonymousClass185 r4, AnonymousClass171 r5, ContactPickerFragment contactPickerFragment, C18820ts r7, String str, HashSet hashSet, List list, List list2, List list3, List list4, Set set) {
        ArrayList arrayList;
        this.A05 = AnonymousClass001.A0F(contactPickerFragment);
        this.A08 = list2;
        this.A09 = list3;
        this.A0A = list4;
        if (list != null) {
            arrayList = C36441kJ.A15(list);
        } else {
            arrayList = null;
        }
        this.A06 = arrayList;
        this.A04 = str;
        this.A07 = hashSet;
        this.A0B = set;
        this.A00 = r2;
        this.A03 = r7;
        this.A0C = r3;
        this.A02 = r5;
        this.A01 = r4;
    }

    public static void A03(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C70183ej(C36391kE.A0f(it)));
        }
        list.size();
        arrayList.size();
    }

    public void A0J(List list, List list2, Set set, Set set2, boolean z) {
        AnonymousClass11F r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (A0f != null && (r2 = A0f.A0H) != null && !set.contains(r2) && !set2.contains(r2) && A0f.A0z && A04(this, A0f)) {
                AnonymousClass11F r1 = A0f.A0H;
                if (AnonymousClass143.A0E(r1) && !(r1 instanceof C177638e7)) {
                    set.add(r2);
                    if (A0M(A0f, z)) {
                        list2.add(A0f);
                    } else {
                        set2.add(r2);
                    }
                }
            }
        }
    }

    public boolean A0M(AnonymousClass141 r6, boolean z) {
        UserJid A0l;
        if (r6.A0G()) {
            A0l = r6.A0I;
        } else {
            A0l = C36351kA.A0l(r6);
        }
        if (!z && A0l != null && this.A01.A04(A0l)) {
            return false;
        }
        if ((this instanceof C43212Fq) || (this instanceof C43222Fr)) {
            return true;
        }
        C43232Fs r1 = (C43232Fs) this;
        if (r1.A0R && (r1.A0d || r1.A0f || r1.A0Z || r1.A0T)) {
            UserJid A0l2 = C36351kA.A0l(r6);
            if (AnonymousClass3RB.A01(r1.A06, A0l2) || !new AnonymousClass3U1(r1.A01, (C235618y) null, A0l2).A04()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
