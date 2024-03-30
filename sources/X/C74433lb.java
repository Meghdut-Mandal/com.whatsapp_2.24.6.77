package X;

import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.3lb  reason: invalid class name and case insensitive filesystem */
public final class C74433lb implements AnonymousClass4U1 {
    public final C588031c A00;

    public C74433lb(C588031c r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean BJq(C63503Kh r3) {
        return AnonymousClass000.A1S(r3.A03.A0A & 4194304, 4194304);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOL(X.C63503Kh r9) {
        /*
            r8 = this;
            X.3T1 r7 = r9.A03
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r7.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x004f
            X.31c r0 = r8.A00
            r6 = 0
            X.12P r0 = r0.A00
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = "SELECT campaign_id FROM premium_message_info WHERE message_row_id = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0045 }
            long r0 = r7.A1N     // Catch:{ all -> 0x0045 }
            X.C36351kA.A1V(r2, r6, r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "GET_PREMIUM_MESSAGE_CAMPAIGN_ID"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "campaign_id"
            java.lang.String r1 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x003e }
            X.3Kh r0 = r7.A1L     // Catch:{ all -> 0x003e }
            r0.A01(r1)     // Catch:{ all -> 0x003e }
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0045 }
            goto L_0x004c
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x004c:
            r3.close()
        L_0x004f:
            r9.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74433lb.BOL(X.3Kh):void");
    }

    public Set BI3() {
        return C36411kG.A15(Integer.valueOf(R.id.lazy_field_campaign_id));
    }
}
