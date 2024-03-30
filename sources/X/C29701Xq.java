package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1Xq  reason: invalid class name and case insensitive filesystem */
public final class C29701Xq {
    public final AnonymousClass1Pp A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C27731Pn A03;
    public final C19630wG A04;
    public final C25271Fq A05;
    public final C19970wo A06;
    public final C220412q A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1CR A09;

    public C29701Xq(AnonymousClass1Pp r2, AnonymousClass16D r3, AnonymousClass171 r4, C27731Pn r5, C19970wo r6, C19630wG r7, C25271Fq r8, C220412q r9, AnonymousClass190 r10, AnonymousClass1CR r11) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r10, 3);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r5, 8);
        AnonymousClass00C.A0D(r11, 9);
        AnonymousClass00C.A0D(r8, 10);
        this.A06 = r6;
        this.A04 = r7;
        this.A08 = r10;
        this.A07 = r9;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A09 = r11;
        this.A05 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0 = r12.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass2bT r13, com.whatsapp.jid.UserJid r14) {
        /*
            r12 = this;
            r7 = 0
            r3 = 1
            X.0wG r0 = r12.A04
            android.content.Context r6 = r0.A00
            X.AnonymousClass00C.A08(r6)
            X.3Qa r10 = r13.A1J
            X.11F r2 = r10.A00
            if (r2 == 0) goto L_0x00e8
            X.12q r0 = r12.A07
            X.3Qp r4 = r0.A09(r2, r7)
            if (r4 == 0) goto L_0x00e8
            X.1CR r1 = r12.A09
            java.lang.String r0 = r2.getRawString()
            X.3LI r5 = X.AnonymousClass1CR.A02(r1, r0)
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r4.A0i
            if (r0 != 0) goto L_0x00e8
            X.16D r0 = r12.A01
            X.141 r4 = r0.A08(r2)
            if (r4 == 0) goto L_0x00e8
            java.lang.String r9 = r4.A0J()
            if (r9 == 0) goto L_0x00e8
            X.141 r8 = r0.A08(r14)
            if (r8 == 0) goto L_0x00e8
            X.171 r1 = r12.A02
            int r0 = r1.A08(r8, r2)
            java.lang.String r11 = r1.A0R(r8, r0, r7)
            if (r11 == 0) goto L_0x00e8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00e9
            X.2dt r5 = (X.C47192dt) r5
            java.lang.String r8 = r5.A0E()
            if (r8 != 0) goto L_0x005b
            java.lang.String r8 = "other_notifications@1"
        L_0x005b:
            long r0 = java.lang.System.currentTimeMillis()
            int r5 = (int) r0
            X.190 r0 = r12.A08
            android.content.Intent r2 = r0.A1Z(r6, r2, r7)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.AnonymousClass3UJ.A08(r1, r10)
            java.lang.String r0 = "show_event_message_on_create_bundle"
            r2.putExtra(r0, r1)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C65743Th.A00(r6, r5, r2, r0)
            boolean r0 = r13.A06
            r2 = 2131896553(0x7f1228e9, float:1.942797E38)
            if (r0 == 0) goto L_0x0083
            r2 = 2131896552(0x7f1228e8, float:1.9427968E38)
        L_0x0083:
            X.0Yy r5 = X.C20600xp.A02(r6)
            r5.A0F(r9)
            java.lang.String r0 = "event"
            r5.A0L = r0
            r5.A0I(r3)
            r5.A0M = r8
            r5.A0D = r1
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r7] = r11
            java.lang.String r0 = r13.A05
            r1[r3] = r0
            java.lang.String r0 = r6.getString(r2, r1)
            r5.A0E(r0)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r5.A0B
            r0.icon = r1
            android.content.res.Resources r1 = r6.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.1Pn r0 = r12.A03
            android.graphics.Bitmap r0 = r0.A02(r6, r4, r3, r3)
            if (r0 != 0) goto L_0x00d3
            X.1Pp r2 = r12.A00
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168343(0x7f070c57, float:1.7950985E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r0 = r2.A04(r4, r0, r3)
            X.AnonymousClass00C.A08(r0)
        L_0x00d3:
            r5.A0A(r0)
            android.app.Notification r3 = r5.A05()
            X.AnonymousClass00C.A08(r3)
            X.1Fq r2 = r12.A05
            r1 = 85
            java.lang.String r0 = A00(r13)
            r2.A07(r0, r1, r3)
        L_0x00e8:
            return
        L_0x00e9:
            java.lang.String r8 = ""
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29701Xq.A01(X.2bT, com.whatsapp.jid.UserJid):void");
    }

    public static final String A00(AnonymousClass2bT r3) {
        C64933Qa r0;
        String str;
        AnonymousClass37F A0X = r3.A0X();
        if (!(A0X == null || (r0 = A0X.A02) == null || (str = r0.A01) == null)) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                AnonymousClass00C.A0B(instance);
                byte[] bytes = str.getBytes(AnonymousClass0S4.A05);
                AnonymousClass00C.A08(bytes);
                String encodeToString = Base64.encodeToString(instance.digest(bytes), 0);
                AnonymousClass00C.A08(encodeToString);
                return encodeToString;
            } catch (NoSuchAlgorithmException unused) {
                Log.e("EventNotificationHelper SHA-256 not supported");
            }
        }
        return "";
    }
}
