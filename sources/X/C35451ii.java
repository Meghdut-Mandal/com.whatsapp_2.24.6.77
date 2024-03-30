package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1ii  reason: invalid class name and case insensitive filesystem */
public class C35451ii implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 1;

    public C35451ii(C106265Iz r2, AnonymousClass1FB r3, AnonymousClass1FC r4, AnonymousClass3T1 r5, AnonymousClass1A1 r6, AnonymousClass00S r7) {
        this.A00 = r4;
        this.A01 = r3;
        this.A02 = r6;
        this.A03 = r2;
        this.A04 = r5;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r7 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r3 = r22
            int r0 = r3.A06
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r2 = r3.A00
            X.1FC r2 = (X.AnonymousClass1FC) r2
            java.lang.Object r9 = r3.A01
            X.1FB r9 = (X.AnonymousClass1FB) r9
            java.lang.Object r1 = r3.A02
            X.1A1 r1 = (X.AnonymousClass1A1) r1
            java.lang.Object r4 = r3.A03
            X.5Iz r4 = (X.C106265Iz) r4
            java.lang.Object r10 = r3.A04
            X.3T1 r10 = (X.AnonymousClass3T1) r10
            java.lang.Object r3 = r3.A05
            r0 = 5
            X.AnonymousClass00C.A0D(r3, r0)
            X.3Qa r8 = r4.A1J
            X.3T1 r1 = r1.A03(r8)
            boolean r0 = r1 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0052
            X.5Iz r1 = (X.C106265Iz) r1
            if (r1 == 0) goto L_0x0052
            long r0 = r9.A00(r1)
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0052
            X.005 r6 = r2.A02
            java.lang.Object r5 = r6.get()
            X.1HJ r5 = (X.AnonymousClass1HJ) r5
            X.5Nh r7 = r5.A05(r0)
            if (r7 != 0) goto L_0x00e6
            java.lang.Object r5 = r6.get()
            X.1HJ r5 = (X.AnonymousClass1HJ) r5
            X.5Nh r7 = r5.A06(r0)
            if (r7 != 0) goto L_0x00e6
        L_0x0052:
            long r0 = r10.A1N
            X.12P r5 = r9.A00
            X.1M0 r5 = r5.get()
            X.14e r10 = r5.A02     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = "SELECT video_call, call_result FROM message_quoted_call_log WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x00a1 }
            r6 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r7[r6] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "GET_QUOTED_CALL_LOG_MESSAGE"
            android.database.Cursor r7 = r10.A09(r9, r0, r7)     // Catch:{ all -> 0x00a1 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x009a }
            r6 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "video_call"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x009a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "call_result"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009a }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            X.011 r6 = new X.011     // Catch:{ all -> 0x009a }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x009a }
        L_0x0096:
            r7.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a8
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x00a8:
            r5.close()
            boolean r7 = r8.A02
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            if (r7 != 0) goto L_0x00f8
            X.11F r0 = r4.A0J()
        L_0x00b5:
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r0)
            if (r6 == 0) goto L_0x00f7
            if (r5 == 0) goto L_0x00f7
            java.lang.String r1 = r8.A01
            r0 = -1
            X.6by r9 = new X.6by
            r9.<init>(r0, r5, r1, r7)
            long r11 = r4.A0I
            java.lang.Object r0 = r6.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            r13 = 0
            if (r1 != r0) goto L_0x00d4
            r13 = 1
        L_0x00d4:
            r8 = 0
            X.5Nh r7 = new X.5Nh
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r13)
            java.lang.Object r0 = r6.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.A0F(r0)
        L_0x00e6:
            X.3Kh r0 = r4.A01
            r0.A01(r7)
            X.17Y r2 = r2.A00
            r1 = 18
            X.1j4 r0 = new X.1j4
            r0.<init>(r3, r1)
            r2.A0H(r0)
        L_0x00f7:
            return
        L_0x00f8:
            X.11F r0 = r8.A00
            goto L_0x00b5
        L_0x00fb:
            java.lang.Object r4 = r3.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r9 = r3.A01
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r8 = r3.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r13 = r3.A03
            X.3T1 r13 = (X.AnonymousClass3T1) r13
            java.lang.Object r1 = r3.A05
            X.9up r1 = (X.C207269up) r1
            java.lang.Object r0 = r3.A04
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r3 = 0
            X.1GX r5 = r4.A1I     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r2 = 100
            android.graphics.Bitmap r7 = r5.A0e(r9, r2, r2)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r6.<init>()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x017c }
            r2 = 80
            r7.compress(r5, r2, r6)     // Catch:{ all -> 0x017c }
            byte[] r5 = r6.toByteArray()     // Catch:{ all -> 0x017c }
            r6.close()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r7.recycle()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            int r6 = r8.size()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r2.<init>(r6)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
        L_0x013f:
            boolean r6 = r7.hasNext()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            if (r6 == 0) goto L_0x0170
            java.lang.Object r12 = r7.next()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            X.11F r12 = (X.AnonymousClass11F) r12     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            X.3Qj r10 = new X.3Qj     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r10.<init>()     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            X.1D5 r8 = r4.A0p     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r18 = 23
            r11 = 0
            r15 = r11
            r16 = r11
            r17 = r11
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r11
            X.2bU r6 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            X.2bm r6 = (X.C46852bm) r6     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r1.A00(r6)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r6.A01 = r0     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r2.add(r6)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            goto L_0x013f
        L_0x0170:
            X.17Y r6 = r4.A02     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r1 = 6
            X.1iV r0 = new X.1iV     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r0.<init>(r4, r2, r5, r1)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            r6.A0H(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
            return
        L_0x017c:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0181 }
            goto L_0x0185
        L_0x0181:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
        L_0x0185:
            throw r1     // Catch:{ 1X5 | IOException | OutOfMemoryError -> 0x0186 }
        L_0x0186:
            r2 = move-exception
            X.17Y r1 = r4.A02
            r0 = 2131887619(0x7f120603, float:1.940985E38)
            r1.A04(r0, r3)
            java.lang.String r0 = "UserActions/userActionSendProductMessages/product thumbnail load failed"
            com.whatsapp.util.Log.e(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35451ii.run():void");
    }

    public C35451ii(Uri uri, AnonymousClass1X4 r3, C207269up r4, UserJid userJid, AnonymousClass3T1 r6, List list) {
        this.A00 = r3;
        this.A01 = uri;
        this.A02 = list;
        this.A03 = r6;
        this.A05 = r4;
        this.A04 = userJid;
    }
}
