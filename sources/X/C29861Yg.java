package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Yg  reason: invalid class name and case insensitive filesystem */
public final class C29861Yg {
    public final C19970wo A00;
    public final AnonymousClass1C7 A01;
    public final C220412q A02;
    public final AnonymousClass1GQ A03;
    public final AnonymousClass1SM A04;
    public final AnonymousClass1SQ A05;
    public final AnonymousClass1A1 A06;
    public final C19770wU A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass164 A09;
    public final AnonymousClass19I A0A;
    public final C28621Tj A0B;
    public final AnonymousClass1SP A0C;

    public C29861Yg(AnonymousClass1DT r2, AnonymousClass164 r3, C19970wo r4, AnonymousClass1C7 r5, C220412q r6, AnonymousClass19I r7, AnonymousClass1GQ r8, AnonymousClass1SM r9, AnonymousClass1SQ r10, C28621Tj r11, AnonymousClass1SP r12, AnonymousClass1A1 r13, C19770wU r14) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r14, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r13, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass00C.A0D(r5, 8);
        AnonymousClass00C.A0D(r2, 9);
        AnonymousClass00C.A0D(r9, 10);
        AnonymousClass00C.A0D(r10, 12);
        AnonymousClass00C.A0D(r11, 13);
        this.A00 = r4;
        this.A07 = r14;
        this.A02 = r6;
        this.A09 = r3;
        this.A06 = r13;
        this.A0A = r7;
        this.A03 = r8;
        this.A01 = r5;
        this.A08 = r2;
        this.A04 = r9;
        this.A0C = r12;
        this.A05 = r10;
        this.A0B = r11;
    }

    public final void A01(AnonymousClass3T1 r18) {
        AnonymousClass3T1 r1 = r18;
        C64933Qa r0 = r1.A1J;
        C28981Uw r10 = (C28981Uw) r0.A00;
        if (r10 != null) {
            String str = r0.A01;
            if (!C22730Aut.A0C.containsKey(new AnonymousClass9Vh(r10.getRawString(), str))) {
                this.A0A.A01((DeviceJid) null, r1);
                long A002 = C19970wo.A00(this.A00) + 86400000;
                try {
                    C28621Tj r2 = this.A0B;
                    AnonymousClass8SX r11 = null;
                    if (!(r1 instanceof AnonymousClass2bO) && !(r1 instanceof AnonymousClass2bM)) {
                        AnonymousClass8NL r8 = (AnonymousClass8NL) AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
                        boolean A1T = r1.A1T(C132986Wc.A0F);
                        AnonymousClass37F A0X = r1.A0X();
                        int i = r1.A01;
                        if (A1T) {
                            r1.A11((AnonymousClass37F) null);
                            r1.A0k(C132986Wc.A0F);
                            r1.A01 = 0;
                        }
                        C20520xh r22 = r2.A00;
                        AnonymousClass00C.A0B(r8);
                        r22.A02(C1899396e.A00(r8).A00(), r1);
                        if (A1T) {
                            r1.A11(A0X);
                            r1.A0j(C132986Wc.A0F);
                            r1.A01 = i;
                        }
                        r11 = (AnonymousClass8SX) r8.A0R();
                    }
                    AnonymousClass164 r23 = this.A09;
                    AnonymousClass00C.A07(str);
                    r23.A01(new C22730Aut(r10, r11, str, r1.A1I, A002, r1.A1T(C132986Wc.A0F)));
                } catch (C25311Fu e) {
                    Log.e("NewsletterMessageManager/sendMessage/failed", e);
                    this.A08.A0N(r1, 13, 1, 1, 1, true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C29861Yg r16, X.AnonymousClass3T1 r17) {
        /*
            r10 = r17
            X.3Qa r2 = r10.A1J
            boolean r0 = r2.A02
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x00b1
            X.11F r5 = r2.A00
            boolean r0 = r5 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00ab
            r8 = r16
            X.12q r2 = r8.A02
            X.1GQ r1 = r8.A03
            r0 = r5
            X.1Uw r0 = (X.C28981Uw) r0
            boolean r0 = X.C65903Tx.A06(r2, r0, r1)
            r16 = 0
            if (r0 == 0) goto L_0x00aa
            X.1SP r3 = r8.A0C
            X.0wI r2 = r3.A02
            r1 = 36
            X.1jB r0 = new X.1jB
            r0.<init>(r3, r10, r1)
            r2.A00(r0)
            X.1SM r4 = r8.A04
            r2 = 9223372036854675807(0x7ffffffffffe795f, double:NaN)
            if (r5 == 0) goto L_0x008a
            X.12P r0 = r4.A03
            X.1M0 r7 = r0.get()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0078 }
            X.163 r0 = r4.A00     // Catch:{ all -> 0x0078 }
            long r0 = r0.A08(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0078 }
            r6[r16] = r0     // Catch:{ all -> 0x0078 }
            X.14e r5 = r7.A02     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "SELECT server_message_id FROM newsletter_message  WHERE chat_row_id = ?  ORDER BY server_message_id DESC LIMIT 1 "
            java.lang.String r0 = "GET_LAST_SERVER_ID"
            android.database.Cursor r9 = r5.A09(r1, r0, r6)     // Catch:{ all -> 0x0078 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ all -> 0x0078 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0063
            r5 = -1
            goto L_0x006d
        L_0x0063:
            java.lang.String r0 = "server_message_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0071 }
            long r5 = r9.getLong(r0)     // Catch:{ all -> 0x0071 }
        L_0x006d:
            r9.close()     // Catch:{ all -> 0x0078 }
            goto L_0x007f
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        L_0x007f:
            r7.close()
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            r0 = 1
            long r2 = r5 + r0
        L_0x008a:
            r10.A1O = r2
            X.1SQ r9 = r8.A05
            X.0wo r0 = r8.A00
            long r14 = X.C19970wo.A00(r0)
            r11 = 0
            r13 = r11
            r17 = 0
            r12 = r11
            r9.A02(r10, r11, r12, r13, r14, r16, r17)
            boolean r0 = r4.A06(r10)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r16
        L_0x00a8:
            r0 = 1
            return r0
        L_0x00aa:
            return r16
        L_0x00ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29861Yg.A00(X.1Yg, X.3T1):boolean");
    }
}
