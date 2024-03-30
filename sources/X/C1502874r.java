package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.74r  reason: invalid class name and case insensitive filesystem */
public class C1502874r implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08 = 0;

    public C1502874r(C139556k5 r2, C124595yT r3, C125235zX r4, C159007ic r5, AnonymousClass5YD r6, C135056c3 r7, AnonymousClass6SG r8, boolean z) {
        this.A00 = r2;
        this.A07 = z;
        this.A02 = r6;
        this.A04 = r3;
        this.A01 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = r4;
    }

    public void run() {
        AnonymousClass6SG r7;
        C123005vm r6;
        if (this.A08 != 0) {
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
            C63393Jw r8 = (C63393Jw) this.A01;
            C28981Uw r72 = (C28981Uw) this.A02;
            Object obj = this.A03;
            List list = (List) this.A04;
            Collection collection = (Collection) this.A05;
            C132366Tg r9 = (C132366Tg) this.A06;
            boolean z = this.A07;
            contactPickerFragment.A0w.Bnv();
            C225014r r11 = contactPickerFragment.A0Q.A00;
            if (r11 instanceof C161947nj) {
                C75683nd r12 = new C75683nd(contactPickerFragment, r72, r8);
                C19770wU r3 = contactPickerFragment.A2L;
                AnonymousClass60O r73 = contactPickerFragment.A0N;
                List singletonList = Collections.singletonList(obj);
                Map emptyMap = Collections.emptyMap();
                HashSet A16 = C36441kJ.A16();
                C36391kE.A1Q(r73.A00(contactPickerFragment.A1W, r9, (AnonymousClass6BX) null, (C161947nj) r11, r12, (AnonymousClass3T1) null, 1, 0L, (Long) null, (Long) null, collection, A16, C90524aI.A0k(list), singletonList, list, emptyMap, 3, 0, -1, false, true, false, true, false, false), r3);
                if (z) {
                    contactPickerFragment.A0w.A02();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.A07) {
            r6 = null;
            r7 = (AnonymousClass6SG) this.A01;
            if (!r7.A02) {
                C139556k5.A01((C139556k5) this.A00, (C159007ic) this.A03, (C135056c3) this.A05, r7, AnonymousClass001.A09("Non prefetch request should have effect available."));
                return;
            }
        } else {
            C124595yT r1 = (C124595yT) this.A04;
            AnonymousClass60A r82 = r1.A00;
            C114655hb r4 = r1.A01;
            if (r4 == null) {
                r4 = new C114655hb(AnonymousClass001.A0J());
            }
            AnonymousClass5oF r32 = r1.A02;
            r7 = (AnonymousClass6SG) this.A01;
            String str = r7.A01;
            String str2 = r7.A00;
            r6 = new C123005vm(r82, r4);
            if (r32 != null) {
                r6.A04.add(r32);
            }
            r6.A01 = str;
            r6.A02 = str2;
        }
        C139556k5 r42 = (C139556k5) this.A00;
        r42.A05.A03(((C124595yT) this.A04).A07, (AnonymousClass5VK) null, r7, true);
        C101284xI r43 = r42.A06;
        if (!C36331k8.A1b(r43.A00) && !r7.A02) {
            long A002 = C101284xI.A00(r7, r43);
            String str3 = r7.A00;
            AnonymousClass00C.A08(str3);
            r43.A05(A002, "effect_fetched", str3);
        }
        ((C159007ic) this.A03).onSuccess(r6);
    }

    public C1502874r(ContactPickerFragment contactPickerFragment, C132366Tg r3, AnonymousClass11F r4, C28981Uw r5, C63393Jw r6, List list, List list2, boolean z) {
        this.A00 = contactPickerFragment;
        this.A01 = r6;
        this.A02 = r5;
        this.A03 = r4;
        this.A04 = list;
        this.A05 = list2;
        this.A06 = r3;
        this.A07 = z;
    }
}
