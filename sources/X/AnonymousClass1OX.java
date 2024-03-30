package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1OX  reason: invalid class name */
public class AnonymousClass1OX {
    public final C19730wQ A00;
    public final C236419g A01;
    public final AnonymousClass1OD A02;
    public final AnonymousClass1OE A03;
    public final C231417i A04;
    public final C19420v0 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r12 >= r10.A02) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3QO A00(X.C20760y7 r9, X.AnonymousClass3QO r10, int r11, long r12, boolean r14) {
        /*
            r3 = r12
            if (r14 != 0) goto L_0x000c
            if (r10 == 0) goto L_0x000c
            long r1 = r10.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            X.9ww r0 = X.C207759ww.A00
            boolean r0 = X.AnonymousClass6XG.A02(r0, r9)
            r2 = 0
            if (r0 == 0) goto L_0x0017
            r2 = 1
        L_0x0017:
            if (r1 == 0) goto L_0x0026
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x001f:
            X.3QO r0 = new X.3QO
            r1 = r11
            r0.<init>((int) r1, (int) r2, (long) r3, (long) r5, (long) r7, (long) r9)
            return r0
        L_0x0026:
            X.C18740tg.A06(r10)
            long r5 = r10.A02
            X.C18740tg.A06(r10)
            long r7 = r10.A04
            X.C18740tg.A06(r10)
            long r9 = r10.A03
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OX.A00(X.0y7, X.3QO, int, long, boolean):X.3QO");
    }

    public static boolean A01(AnonymousClass1OX r7, UserJid userJid, long j, long j2) {
        AnonymousClass3QO A052 = r7.A04.A05(userJid);
        if (j > 0 && A052 != null) {
            long j3 = A052.A02;
            if (j < j3 && j2 == j3 && A052.A04 < ((SharedPreferences) r7.A05.A00.get()).getLong("adv_last_device_job_ts", 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("contactsyncDevicesupdater/update/usync fetch error, expectedTs=");
                sb.append(j2);
                sb.append("; responseTs=");
                sb.append(j);
                Log.e(sb.toString());
                AnonymousClass1OE r0 = r7.A03;
                r0.A00.Bly(new C44242Mp());
                return true;
            }
        }
        return false;
    }

    public AnonymousClass1OX(C19730wQ r1, C19420v0 r2, C236419g r3, AnonymousClass1OD r4, AnonymousClass1OE r5, C231417i r6) {
        this.A00 = r1;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }
}
