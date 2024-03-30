package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6WE  reason: invalid class name */
public class AnonymousClass6WE {
    public static final String A09 = AnonymousClass6VD.A01("WorkContinuationImpl");
    public boolean A00;
    public C161147mG A01;
    public final AnonymousClass6VR A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public static boolean A01(AnonymousClass6WE r5, Set set) {
        List list = r5.A05;
        set.addAll(list);
        HashSet A002 = A00(r5);
        for (Object contains : set) {
            if (A002.contains(contains)) {
                return true;
            }
        }
        List<AnonymousClass6WE> list2 = r5.A06;
        if (list2 != null && !list2.isEmpty()) {
            for (AnonymousClass6WE A012 : list2) {
                if (A01(A012, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }

    public C161147mG A02() {
        if (!this.A00) {
            AnonymousClass75C r1 = new AnonymousClass75C(this);
            this.A02.A06.B74(r1);
            this.A01 = (C138776ig) r1.A00;
        } else {
            AnonymousClass6VD.A00();
            String str = A09;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Already enqueued work ids (");
            A0u.append(TextUtils.join(", ", this.A05));
            A0u.append(")");
            AnonymousClass000.A1A(A0u, str);
        }
        return this.A01;
    }

    public AnonymousClass6WE(AnonymousClass6VR r4, Integer num, String str, List list, List list2) {
        this.A02 = r4;
        this.A04 = str;
        this.A03 = num;
        this.A07 = list;
        this.A06 = list2;
        this.A05 = C36361kB.A0r(list);
        this.A08 = AnonymousClass001.A0I();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A08.addAll(((AnonymousClass6WE) it.next()).A08);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String A0y = C36381kD.A0y(((C120745s0) list.get(i)).A02);
            this.A05.add(A0y);
            this.A08.add(A0y);
        }
    }

    public static HashSet A00(AnonymousClass6WE r3) {
        HashSet A16 = C36441kJ.A16();
        List<AnonymousClass6WE> list = r3.A06;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass6WE r0 : list) {
                A16.addAll(r0.A05);
            }
        }
        return A16;
    }

    public final AnonymousClass6WE A03(C97404pG r7) {
        List singletonList = Collections.singletonList(r7);
        if (singletonList.isEmpty()) {
            return this;
        }
        return new AnonymousClass6WE(this.A02, C023109s.A01, this.A04, singletonList, Collections.singletonList(this));
    }

    public AnonymousClass6WE() {
    }
}
