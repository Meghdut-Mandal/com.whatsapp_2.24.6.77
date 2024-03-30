package X;

import com.whatsapp.jid.Jid;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.9lb  reason: invalid class name and case insensitive filesystem */
public abstract class C202329lb {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass1O5 r6, X.AnonymousClass141 r7, java.security.MessageDigest r8, java.util.List r9) {
        /*
            X.11F r2 = r7.A0H
            X.C18740tg.A06(r2)
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.0yC r4 = r6.A00
            r3 = 7114(0x1bca, float:9.969E-42)
            boolean r0 = r4.A0E(r3)
            if (r0 == 0) goto L_0x0042
            java.util.Map r1 = r6.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0042
            byte[] r5 = X.C165617ti.A0j(r2, r1)
            if (r5 == 0) goto L_0x0042
        L_0x0021:
            r4 = 0
        L_0x0022:
            int r0 = r9.size()
            if (r4 >= r0) goto L_0x0075
            java.lang.Object r3 = r9.get(r4)
            byte[] r3 = (byte[]) r3
            int r1 = r5.length
            int r0 = r3.length
            if (r1 < r0) goto L_0x003f
            r2 = 0
        L_0x0033:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x0073
            byte r1 = r5[r2]
            byte r0 = r3[r2]
            if (r1 != r0) goto L_0x003f
            int r2 = r2 + 1
            goto L_0x0033
        L_0x003f:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r2.user
            r1.append(r0)
            java.lang.String r0 = "WA_ADD_NOTIF"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r8.reset()
            byte[] r0 = r0.getBytes()
            r8.update(r0)
            byte[] r5 = r8.digest()
            if (r5 == 0) goto L_0x0075
            boolean r0 = r4.A0E(r3)
            if (r0 == 0) goto L_0x0021
            java.util.Map r1 = r6.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0021
            r1.put(r2, r5)
            goto L_0x0021
        L_0x0073:
            r0 = 1
            return r0
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202329lb.A02(X.1O5, X.141, java.security.MessageDigest, java.util.List):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass141 r3, java.util.Set r4, boolean r5) {
        /*
            X.11F r1 = r3.A0H
            boolean r0 = X.AnonymousClass143.A0I(r1)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r2 = 1
        L_0x000f:
            return r2
        L_0x0010:
            X.11F r0 = r3.A0H
            boolean r0 = X.AnonymousClass143.A0I(r0)
            r2 = 0
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0s
            if (r0 == 0) goto L_0x0023
            int r1 = r3.A07
            r0 = 2
            if (r1 != r0) goto L_0x0023
            return r2
        L_0x0023:
            X.3IL r0 = r3.A0F
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000e
            X.11F r0 = r3.A0H
            if (r0 != 0) goto L_0x0036
            if (r5 != 0) goto L_0x000f
            goto L_0x000e
        L_0x0036:
            boolean r0 = A04(r0)
            if (r0 == 0) goto L_0x000f
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202329lb.A03(X.141, java.util.Set, boolean):boolean");
    }

    public static boolean A04(Jid jid) {
        if (jid == null || !jid.isProtocolCompliant() || (jid instanceof C177638e7)) {
            return true;
        }
        return false;
    }

    public static String A00(String str) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append('_');
        C36351kA.A1K(UUID.randomUUID(), A0v);
        return A0v.toString();
    }

    public static ArrayList A01(AnonymousClass1O5 r4, MessageDigest messageDigest, List list, List list2) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (!A04(A0f.A0H) && A02(r4, A0f, messageDigest, list)) {
                A0I.add(A0f);
            }
        }
        return A0I;
    }
}
