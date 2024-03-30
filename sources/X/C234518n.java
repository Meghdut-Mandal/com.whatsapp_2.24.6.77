package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.18n  reason: invalid class name and case insensitive filesystem */
public final class C234518n {
    public final C232417s A00;
    public final C19970wo A01;
    public final AnonymousClass18I A02;
    public final AnonymousClass18M A03;
    public final C233918h A04;
    public final AnonymousClass187 A05;
    public final C20810yC A06;

    public C234518n(C232417s r2, C19970wo r3, C233918h r4, AnonymousClass187 r5, AnonymousClass18I r6, AnonymousClass18M r7, C20810yC r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r4, 7);
        this.A01 = r3;
        this.A06 = r8;
        this.A02 = r6;
        this.A05 = r5;
        this.A03 = r7;
        this.A00 = r2;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass6EU r7, byte[] r8) {
        /*
            r6 = this;
            r5 = 1
            X.18M r0 = r6.A03
            X.1M0 r3 = r0.A04()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "sender_id"
            X.6EZ r2 = r7.A00     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "sender_type"
            int r0 = r2.A01     // Catch:{ all -> 0x0051 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "device_id"
            int r0 = r2.A00     // Catch:{ all -> 0x0051 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "record"
            r4.put(r0, r8)     // Catch:{ all -> 0x0051 }
            X.18h r0 = r6.A04     // Catch:{ all -> 0x0051 }
            java.lang.Long r1 = r0.A00(r2, r5)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = "sender_lid_identifier"
            r4.put(r0, r1)     // Catch:{ all -> 0x0051 }
        L_0x0044:
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "fast_ratchet_sender_keys"
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/saveFastRatchetSenderKey"
            r2.A07(r1, r0, r4)     // Catch:{ all -> 0x0051 }
            r3.close()
            return
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234518n.A03(X.6EU, byte[]):void");
    }

    public static final Long A00(C234518n r4, AnonymousClass6EU r5) {
        C233918h r3 = r4.A04;
        String str = r5.A01;
        C234018i r2 = r3.A01;
        if (r2.A00.A0O(GroupJid.Companion.A02(str))) {
            return null;
        }
        if (!C20800yB.A01(C21000yV.A02, r4.A06, 6488)) {
            return null;
        }
        AnonymousClass6EZ r1 = r5.A00;
        AnonymousClass00C.A08(r1);
        return r3.A00(r1, 1);
    }

    public C198519dh A02(C1268866a r4) {
        this.A05.A00();
        C18740tg.A06(r4);
        C119005p5 A012 = A01(new AnonymousClass6EU(AnonymousClass6R2.A00(r4.A01), r4.A00));
        if (A012 != null) {
            return new C198519dh(A012.A01);
        }
        try {
            return new C198519dh();
        } catch (IOException e) {
            Log.w("axolotl ioexception while reading fast ratchet sender key record", e);
            return new C198519dh();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C1268866a r8, X.C198519dh r9) {
        /*
            r7 = this;
            X.6Aq r0 = r8.A01
            X.6EZ r1 = X.AnonymousClass6R2.A00(r0)
            java.lang.String r0 = r8.A00
            X.6EU r4 = new X.6EU
            r4.<init>(r1, r0)
            X.8Nc r0 = X.C172248Nc.DEFAULT_INSTANCE
            X.8NN r6 = r0.A0p()
            java.util.LinkedList r0 = r9.A00
            java.util.Iterator r5 = r0.iterator()
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r5.next()
            X.9di r0 = (X.C198529di) r0
            X.8QS r3 = r0.A00
            r6.A0S()
            X.8Hz r2 = r6.A00
            X.8Nc r2 = (X.C172248Nc) r2
            r3.getClass()
            X.B6c r1 = r2.senderKeyStates_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0040
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.senderKeyStates_ = r1
        L_0x0040:
            r1.add(r3)
            goto L_0x0019
        L_0x0044:
            X.8Hz r0 = r6.A0R()
            byte[] r1 = r0.A0o()
            X.18I r0 = r7.A02
            X.79X r3 = X.AnonymousClass18I.A01(r0, r4)
            r3.lock()
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x008e }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x008e }
            X.8dv r0 = X.C177518dv.A00     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x008e }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "signalCoordinator/savefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x008e }
            r1.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x008e }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x008e }
            goto L_0x008a
        L_0x007b:
            r7.A03(r4, r1)     // Catch:{ all -> 0x008e }
            X.17s r0 = r7.A00     // Catch:{ all -> 0x008e }
            X.5zh r1 = new X.5zh     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            X.17t r0 = r0.A00     // Catch:{ all -> 0x008e }
            r0.A01(r1)     // Catch:{ all -> 0x008e }
        L_0x008a:
            r3.close()
            return
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234518n.A04(X.66a, X.9dh):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C119005p5 A01(X.AnonymousClass6EU r9) {
        /*
            r8 = this;
            java.lang.Long r6 = A00(r8, r9)
            if (r6 != 0) goto L_0x0014
            java.lang.String[] r4 = r9.A00()
            java.lang.String r3 = "SELECT record  FROM fast_ratchet_sender_keys WHERE group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
        L_0x000c:
            r7 = 0
            X.18M r0 = r8.A03
            X.1M0 r5 = r0.get()
            goto L_0x001f
        L_0x0014:
            long r0 = r6.longValue()
            java.lang.String[] r4 = X.AnonymousClass5ZZ.A00(r9, r0)
            java.lang.String r3 = "SELECT record  FROM fast_ratchet_sender_keys WHERE group_id = ? AND sender_lid_identifier = ? AND sender_type = ? AND device_id = ?"
            goto L_0x000c
        L_0x001f:
            X.14e r2 = r5.A02     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/getFastRatchetSenderKey"
            r1.append(r0)     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x0030
            java.lang.String r0 = "_lid_identifier"
            goto L_0x0032
        L_0x0030:
            java.lang.String r0 = ""
        L_0x0032:
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006d }
            android.database.Cursor r6 = r2.A09(r3, r0, r4)     // Catch:{ all -> 0x006d }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "record"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            byte[] r4 = r6.getBlob(r0)     // Catch:{ all -> 0x0066 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x0066 }
            X.0wo r0 = r8.A01     // Catch:{ all -> 0x0066 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0066 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x0066 }
            long r2 = r2 / r0
            X.5p5 r7 = new X.5p5     // Catch:{ all -> 0x0066 }
            r7.<init>(r4, r2)     // Catch:{ all -> 0x0066 }
        L_0x005f:
            r6.close()     // Catch:{ all -> 0x006d }
            r5.close()
            return r7
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234518n.A01(X.6EU):X.5p5");
    }
}
