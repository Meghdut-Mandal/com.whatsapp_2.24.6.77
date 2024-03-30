package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.3Hn  reason: invalid class name and case insensitive filesystem */
public final class C62783Hn {
    public C25271Fq A00;
    public C20810yC A01;

    public final String A00(AnonymousClass141 r2, AnonymousClass1CR r3) {
        AnonymousClass3LI r0;
        AnonymousClass00C.A0D(r3, 0);
        Jid A0h = C36411kG.A0h(r2);
        if (A0h != null) {
            r0 = C36361kB.A0d(A0h, r3);
        } else {
            r0 = null;
        }
        C47192dt r02 = (C47192dt) r0;
        if (r02 != null) {
            return r02.A0E();
        }
        return null;
    }

    public final String A01(AnonymousClass141 r2, AnonymousClass1CR r3) {
        AnonymousClass3LI r0;
        AnonymousClass00C.A0D(r3, 0);
        Jid A0h = C36411kG.A0h(r2);
        if (A0h != null) {
            r0 = C36361kB.A0d(A0h, r3);
        } else {
            r0 = null;
        }
        C47192dt r02 = (C47192dt) r0;
        if (r02 != null) {
            return r02.A0F();
        }
        return null;
    }

    public final String A02(AnonymousClass141 r14, AnonymousClass1CR r15) {
        AnonymousClass3LI r2;
        String str;
        AnonymousClass00C.A0D(r15, 0);
        Jid A0h = C36411kG.A0h(r14);
        if (A0h != null) {
            r2 = C36361kB.A0d(A0h, r15);
        } else {
            r2 = null;
        }
        C47192dt r22 = (C47192dt) r2;
        if (this.A01.A0E(6307)) {
            if (r22 == null) {
                return null;
            }
            str = "voip_notification";
            String A002 = C24481Cp.A0L.A00(str);
            if (A002 != null) {
                return A002;
            }
        } else if (r22 == null) {
            return null;
        } else {
            C24491Cq r0 = C24481Cp.A0L;
            str = "voip_notification";
            String A003 = r0.A00(str);
            if (A003 != null) {
                C24481Cp r5 = r22.A00;
                String A012 = r0.A01(A003);
                if (!r5.A0J(A003)) {
                    return A003;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("chat-settings-store/repairVoIPNotificationChannel repairing channel:");
                C36321k7.A1a(A0u, AnonymousClass143.A04(A012));
                try {
                    r5.A0H(A012);
                    return r5.A05((Uri) null, r5.A07(str), str, (String) null, (String) null, (String) null, 4);
                } catch (SecurityException unused) {
                    Log.w("chat-settings-store/repairVoIPNotificationChannel SecurityException in deleteNotificationChannel");
                    return A003;
                }
            }
        }
        C24481Cp r1 = r22.A00;
        return r1.A05((Uri) null, r1.A07(str), str, (String) null, (String) null, (String) null, 4);
    }

    public C62783Hn(C25271Fq r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
