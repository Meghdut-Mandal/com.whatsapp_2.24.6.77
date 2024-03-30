package X;

import android.content.Intent;
import com.whatsapp.jid.Jid;

/* renamed from: X.3Sl  reason: invalid class name and case insensitive filesystem */
public final class C65533Sl {
    public static final boolean A05(String str) {
        int length;
        AnonymousClass00C.A0D(str, 0);
        if (!AnonymousClass099.A0O(str, "-", false) && (length = str.length()) >= 1 && length <= 20) {
            char charAt = str.charAt(0);
            if (AnonymousClass00C.A00(charAt, 49) >= 0 && AnonymousClass00C.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    if (AnonymousClass00C.A00(charAt2, 48) >= 0 && AnonymousClass00C.A00(charAt2, 57) <= 0) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static AnonymousClass147 A01(Jid jid) {
        C65533Sl r0 = AnonymousClass147.A01;
        return A03(jid);
    }

    public static AnonymousClass147 A02(Jid jid) {
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 A03 = A03(jid);
        C18740tg.A06(A03);
        return A03;
    }

    public static final AnonymousClass147 A03(Jid jid) {
        if (jid instanceof AnonymousClass147) {
            return (AnonymousClass147) jid;
        }
        return null;
    }

    public static final AnonymousClass147 A04(String str) {
        AnonymousClass147 r1;
        C222513o r0 = Jid.Companion;
        Jid A00 = C222513o.A00(str);
        if ((A00 instanceof AnonymousClass147) && (r1 = (AnonymousClass147) A00) != null) {
            return r1;
        }
        throw new C19740wR(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass147 A06(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x001f
            X.147 r1 = A04(r4)     // Catch:{ all -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0018:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x001d
            r2 = r1
        L_0x001d:
            X.147 r2 = (X.AnonymousClass147) r2
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65533Sl.A06(java.lang.String):X.147");
    }

    public static AnonymousClass147 A00(Intent intent, String str) {
        return AnonymousClass147.A01.A06(intent.getStringExtra(str));
    }
}
