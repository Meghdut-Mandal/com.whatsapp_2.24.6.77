package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Sa  reason: invalid class name and case insensitive filesystem */
public final class C132076Sa {
    public static final C135066c4 A00(C134836bg r24) {
        C134836bg r1 = r24;
        AnonymousClass00C.A0D(r1, 0);
        C135066c4 r2 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r2.A03 = r1.A02;
        r2.A02 = r1.A01;
        r2.A0H = r1.A07;
        r2.A00 = r1.A00;
        r2.A0D = r1.A05;
        r2.A08 = r1.A03;
        r2.A0E = r1.A04;
        r2.A06 = r1.A06;
        r2.A0J = r1.A08;
        r2.A0K = r1.A09;
        r2.A0O = r1.A0A;
        r2.A0L = true;
        return r2;
    }

    public final AnonymousClass68B A02(C134836bg r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C135066c4 r7;
        String[] split;
        List list2 = list;
        AnonymousClass00C.A0D(list2, 8);
        String str8 = str;
        if (r27 != null) {
            r7 = A00(r27);
            r7.A0G = str8;
            r7.A0L = true;
        } else {
            r7 = null;
        }
        ArrayList A0J = C36321k7.A0J(list2);
        Iterator it = list2.iterator();
        while (true) {
            String str9 = str2;
            String str10 = str4;
            if (it.hasNext()) {
                C135066c4 A00 = A00((C134836bg) it.next());
                A00.A0G = str8;
                String str11 = A00.A08;
                AnonymousClass1XQ[] r3 = null;
                if (!(str11 == null || (split = TextUtils.split(str11, " ")) == null)) {
                    ArrayList A14 = C36441kJ.A14(r8);
                    for (String str12 : split) {
                        AnonymousClass00C.A0B(str12);
                        A14.add(new AnonymousClass1XQ(str12));
                    }
                    r3 = (AnonymousClass1XQ[]) A14.toArray(new AnonymousClass1XQ[0]);
                }
                A00.A04 = new AnonymousClass3S2(str8, str9, str10, (String) null, (String) null, A00.A06, r3, 0, true, false, true, false, A00.A0J, A00.A0K);
                A0J.add(A00);
            } else {
                return A01(r7, str8, str9, str10, str3, str5, str6, str7, A0J);
            }
        }
    }

    public static final AnonymousClass68B A01(C135066c4 r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        AnonymousClass65S r2 = new AnonymousClass65S();
        r2.A0E = str;
        r2.A0G = str2;
        r2.A0I = str3;
        r2.A03 = str4;
        r2.A0F = "-1";
        r2.A0K = "-1";
        r2.A0L = "-1";
        int i = 0;
        r2.A0O = false;
        r2.A0P = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i += C90504aG.A0U(it).A00;
        }
        r2.A01 = (long) i;
        r2.A0N = list;
        r2.A0R = true;
        r2.A0J = str5;
        r2.A0C = str6;
        r2.A0B = str7;
        r2.A02 = r4;
        return r2.A00();
    }
}
