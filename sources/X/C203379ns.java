package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ns  reason: invalid class name and case insensitive filesystem */
public abstract class C203379ns {
    public static final C203539oF A00 = new C203539oF();

    public static Object A01(C203399nx r2, C22993Azj azj) {
        String[] strArr = new String[0];
        AnonymousClass00C.A0D(r2, 0);
        try {
            return C203539oF.A06(r2, azj, strArr);
        } catch (C235919b unused) {
            return null;
        }
    }

    public static final Object A02(C203399nx r9, C22993Azj azj, String[] strArr) {
        AnonymousClass00C.A0D(r9, 0);
        ArrayList A09 = C203539oF.A09(r9, azj, strArr, 0, 1);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    public static final Object A03(C203399nx r1, Class cls, Long l, Long l2, Object obj, String[] strArr, boolean z) {
        return A00.A0Z(r1, cls, l, l2, obj, strArr, z);
    }

    public static Object A04(C203399nx r8, Class cls, Long l, Long l2, String[] strArr) {
        return A00.A0Z(r8, cls, l, l2, (Object) null, strArr, false);
    }

    public static final String A09(C203399nx r7, List list, String[] strArr) {
        C36331k8.A1I(r7, list);
        String str = (String) C203539oF.A07(r7, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        C203539oF.A0H(str, list);
        return str;
    }

    public static final ArrayList A0C(C203399nx r1, C22993Azj azj, String[] strArr, long j, long j2) {
        AnonymousClass00C.A0D(r1, 0);
        return C203539oF.A09(r1, azj, strArr, j, j2);
    }

    public static void A0D(C203399nx r7, Class cls, Long l, Long l2, String[] strArr) {
        A03(r7, cls, l, l2, (Object) null, strArr, false);
    }

    public static final Jid A00(C203399nx r9, List list, String[] strArr) {
        C36331k8.A1I(r9, list);
        Jid jid = (Jid) A00.A0Z(r9, Jid.class, (Long) null, (Long) null, (Object) null, strArr, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C165587tf.A1b((Class) it.next(), jid)) {
                return jid;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("JID was expected to be one of '");
        A0u.append(C007103b.A0Q(", ", "", "", list, (C006302t) null));
        A0u.append("' but was '");
        AnonymousClass000.A1C(jid, A0u);
        throw C165577te.A0X("'.", A0u);
    }

    public static Object A06(C203399nx r1, String str, List list, String[] strArr) {
        return A00.A0a(r1, str, list, strArr);
    }

    public static final String A0A(C203399nx r8, List list, String[] strArr) {
        C36331k8.A1I(r8, list);
        String str = (String) A00.A0Z(r8, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        C203539oF.A0H(str, list);
        return str;
    }

    public static String A0B(C203399nx r8, String[] strArr) {
        return (String) A00.A0Z(r8, String.class, 1L, 20L, (Object) null, strArr, false);
    }

    public static void A0E(C203399nx r9, Long l, Long l2, String[] strArr) {
        C203399nx r2 = r9;
        Long l3 = l;
        Long l4 = l2;
        A03(r2, String.class, l3, l4, "item-not-found", strArr, false);
        A03(r2, Long.class, l3, l4, 404L, new String[]{"code"}, false);
    }

    public static boolean A0I(C203399nx r7, Long l, Long l2, String[] strArr) {
        A03(r7, String.class, l, l2, "bad-request", strArr, false);
        return false;
    }

    public static boolean A0J(C203399nx r7, Long l, Long l2, String[] strArr) {
        A03(r7, String.class, l, l2, "internal-server-error", strArr, false);
        return false;
    }

    public static String[] A0K(C203399nx r9, Long l, Long l2, String[] strArr) {
        C203399nx r2 = r9;
        Long l3 = l;
        Long l4 = l2;
        A03(r2, String.class, l3, l4, "not-acceptable", strArr, false);
        A03(r2, Long.class, l3, l4, 406L, new String[]{"code"}, false);
        return new String[]{"field"};
    }

    public static Object A05(C203399nx r8, Class cls, String[] strArr, long j) {
        return A00.A0Z(r8, cls, Long.valueOf(j), 9007199254740991L, (Object) null, strArr, false);
    }

    public static String A07(C203399nx r1, String str, String str2, List list) {
        return A0A(r1, list, new String[]{str, str2});
    }

    public static String A08(C203399nx r1, String str, List list) {
        return A0A(r1, list, new String[]{str});
    }

    public static void A0F(C203399nx r1, String str, String str2, List list) {
        A0A(r1, list, new String[]{str, str2});
    }

    public static void A0G(C203399nx r1, String str, List list) {
        A0A(r1, list, new String[]{str});
    }

    public static void A0H(C203399nx r1, String str, List list) {
        A09(r1, list, new String[]{str});
    }
}
