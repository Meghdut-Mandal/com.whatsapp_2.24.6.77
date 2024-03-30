package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6T0  reason: invalid class name */
public class AnonymousClass6T0 {
    public final C122255uY A00;
    public final C19420v0 A01;
    public final C21010yW A02;
    public final AnonymousClass18Z A03;
    public final C19970wo A04;
    public final C20810yC A05;
    public final AnonymousClass1VO A06;
    public final C31071bE A07;
    public final AnonymousClass1YU A08;
    public final AnonymousClass6OJ A09;
    public final AnonymousClass1VT A0A;
    public final C29251Vx A0B;
    public final AnonymousClass19O A0C;
    public final Set A0D;
    public final Set A0E;

    public static final byte[] A01(String str, String str2) {
        try {
            return Base64.decode(str, 11);
        } catch (IllegalArgumentException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PushEncryptionHelper/base64 exception decoding:");
            A0u.append(str2);
            A0u.append(" value:'");
            A0u.append(str);
            Log.e(AnonymousClass000.A0t(A0u, '\''));
            return null;
        }
    }

    public static final byte[] A02(StringBuilder sb, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(j);
            byte[] A022 = AnonymousClass6R0.A02(bArr, allocate.array(), (byte[]) null, 32);
            AnonymousClass00C.A08(A022);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022, "AES/GCM/NoPadding");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            C90504aG.A1P(secretKeySpec, instance, bArr3);
            instance.updateAAD(C36371kC.A1Z("WA_PUSH_NOTIFICATION", AnonymousClass0S4.A01));
            ByteBuffer allocate2 = ByteBuffer.allocate(bArr2.length + bArr4.length);
            allocate2.put(bArr2);
            allocate2.put(bArr4);
            return instance.doFinal(allocate2.array());
        } catch (Exception e) {
            boolean z6 = true;
            if (e instanceof BadPaddingException) {
                z = true;
            } else {
                z = e instanceof IllegalBlockSizeException;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = e instanceof InvalidAlgorithmParameterException;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = e instanceof InvalidKeyException;
            }
            if (z3) {
                z4 = true;
            } else {
                z4 = e instanceof InvalidKeySpecException;
            }
            if (z4) {
                z5 = true;
            } else {
                z5 = e instanceof NoSuchAlgorithmException;
            }
            if (!z5) {
                z6 = e instanceof NoSuchPaddingException;
            }
            if (z6) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("PushEncryptionHelper/decryptData/issue decrypting ");
                A0u.append(android.util.Log.getStackTraceString(e));
                A0u.append(10);
                C36351kA.A1K(A0u, sb);
                return null;
            }
            throw e;
        }
    }

    public AnonymousClass6T0(C122255uY r1, AnonymousClass18Z r2, C19970wo r3, C19420v0 r4, C20810yC r5, C21010yW r6, AnonymousClass1VO r7, C31071bE r8, AnonymousClass1YU r9, AnonymousClass6OJ r10, AnonymousClass1VT r11, C29251Vx r12, AnonymousClass19O r13, Set set, Set set2) {
        this.A04 = r3;
        this.A05 = r5;
        this.A02 = r6;
        this.A03 = r2;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A0A = r11;
        this.A01 = r4;
        this.A09 = r10;
        this.A0C = r13;
        this.A0E = set;
        this.A0B = r12;
        this.A0D = set2;
        this.A00 = r1;
    }

    public static void A00(AbstractCollection abstractCollection, AbstractCollection abstractCollection2, Iterator it) {
        Object next = it.next();
        if (AnonymousClass143.A0J((AnonymousClass11F) next)) {
            abstractCollection.add(next);
        } else {
            abstractCollection2.add(next);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.0Wx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.0Wx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.0Wx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v153, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: X.5JN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: X.5JN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v157, resolved type: X.03N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: X.5JM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: X.5JM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v175, resolved type: X.5JM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v176, resolved type: X.5JM} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r1v74, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v245, types: [android.database.sqlite.SQLiteDatabase$CursorFactory, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r0v260, types: [android.database.sqlite.SQLiteDatabase$CursorFactory, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r5v72, types: [android.database.sqlite.SQLiteDatabase$CursorFactory] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r24v5 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:41|42|43|44|116|(0)(0)|123|124|221|225) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:111|112) */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        X.C90504aG.A1G(r8);
        com.whatsapp.util.Log.e("PushEncryptionHelper/decryptPushPayloadToJSON bad JSON");
        r1 = new android.util.Pair((java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0481, code lost:
        if (r9.equals(r3) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r30 = r0.getString(r1);
        r25 = com.whatsapp.jid.DeviceJid.Companion.A02(r0.getString("from_device_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0499, code lost:
        if (r0.has("group_jid") == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x049b, code lost:
        r3 = com.whatsapp.jid.GroupJid.Companion;
        r27 = X.AnonymousClass6SZ.A01(r0.getString("group_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04a5, code lost:
        r37 = "1".equals(r0.getString("video_call"));
        r31 = java.lang.Long.parseLong(X.C90474aD.A0e("offer_ts_sec", r0));
        r33 = java.lang.Long.parseLong(X.C90474aD.A0e("offer_push_timeout_sec", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04cb, code lost:
        if (r0.has("secondary_account_offer_timeout_sec") == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04cd, code lost:
        r35 = java.lang.Long.parseLong(X.C90474aD.A0e("secondary_account_offer_timeout_sec", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04d5, code lost:
        r1 = "from_pn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d8, code lost:
        r35 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04db, code lost:
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04e2, code lost:
        if (r0.has(r1) == false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04e4, code lost:
        r26 = com.whatsapp.jid.DeviceJid.Companion.A02(r0.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04ee, code lost:
        X.AnonymousClass00C.A0B(r30);
        r24 = new X.AnonymousClass5JN(r25, r26, r27, r9, r10, r30, r31, r33, r35, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04fb, code lost:
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04fe, code lost:
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0507, code lost:
        if (r9.equals(r0) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0509, code lost:
        r2 = new X.AnonymousClass5JK(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x050e, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("IncomingPushHandler/received payload nt:");
        r0 = X.AnonymousClass000.A0q(r2.A00(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0521, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0523, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0530, code lost:
        X.C36321k7.A1P("PushPayloadParser/fromJSON missing ", r1, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07b5, code lost:
        if (r7.equals("group_message") != false) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07b7, code lost:
        r51 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07bb, code lost:
        if (r9 != null) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07bd, code lost:
        r16 = X.C19970wo.A00(r5.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07c3, code lost:
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/processMessageNotification");
        r12 = r51.A01;
        r19 = r12.A03(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07d0, code lost:
        if (r19 == null) goto L_0x0d7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07d4, code lost:
        if ((r2 instanceof X.AnonymousClass5JM) == false) goto L_0x0d7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07d6, code lost:
        r50 = false;
        r2 = (X.AnonymousClass5JM) r2;
        r40 = r51.A02;
        r39 = r2.A00;
        r10 = r39.getRawString();
        X.AnonymousClass00C.A0D(r10, 1);
        r15 = true;
        r5 = new java.lang.String[1];
        r3 = r19.A08;
        r5[r4] = r3;
        r6 = X.AnonymousClass02Q.A06(r5, new java.lang.String[]{"message", "group_message"});
        r5 = new java.lang.String[1];
        r5[r4] = r10;
        r10 = X.AnonymousClass02Q.A06(r6, r5);
        r9 = new java.lang.String[1];
        r23 = java.lang.String.valueOf(r19.A05);
        r9[r4] = r23;
        r13 = (java.lang.String[]) X.AnonymousClass02Q.A06(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r10 = ((X.AnonymousClass54Z) r40.A00.get()).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r9 = r10.A02;
        r6 = X.AnonymousClass000.A0u();
        X.C36351kA.A1O("SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN ", r6, 2);
        r5 = r9.A09(X.AnonymousClass000.A0q(" AND sender_jid = ? AND timestamp >= ?", r6), "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0849, code lost:
        if (r5.getCount() > 0) goto L_0x084c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x084b, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0852, code lost:
        if (r15 == false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(X.C19970wo.A00(r51.A06) - r19.A06);
        r6 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x086f, code lost:
        if (X.AnonymousClass00C.A0J(r6, "message") == false) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0878, code lost:
        if (X.AnonymousClass00C.A0J(r6, "group_message") == false) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x087a, code lost:
        r9 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x087d, code lost:
        r9 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0881, code lost:
        if (r13 <= r9) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0886, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        X.C05600Qi.A00(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x088a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x088d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        X.C05600Qi.A00(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0891, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0892, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        r6 = X.C90524aI.A0t(r5).exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0899, code lost:
        if (r6 != null) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x089b, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/doesMessageSenderExist/failed", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08a0, code lost:
        r9 = X.C19970wo.A00(r51.A06);
        r6 = X.AnonymousClass000.A0u();
        X.C90464aC.A1H("AccountSwitchingDataRepo/updateLastBuzzedTime/", r3, r6);
        X.C36321k7.A1V("/lastBuzzedTimeMs:", r6, r9);
        r5 = X.AnonymousClass001.A0I();
        r15 = X.AnonymousClass1Z0.A00(r12);
        r5.addAll(r15.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08c7, code lost:
        if (X.AnonymousClass1Z0.A02(r3, r5) == false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08c9, code lost:
        com.whatsapp.util.Log.e("AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08cf, code lost:
        r14 = X.C36321k7.A0J(r5);
        r24 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08db, code lost:
        if (r24.hasNext() != false) goto L_0x08dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08dd, code lost:
        r13 = (X.AnonymousClass3KU) r24.next();
        r5 = r13.A08;
        r26 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08eb, code lost:
        if (X.AnonymousClass00C.A0J(r5, r3) != false) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08ed, code lost:
        r25 = new X.AnonymousClass3KU(r26, r13.A07, r13.A09, r13.A00, r13.A01, r13.A05, r9, r13.A04, r13.A03, r13.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0918, code lost:
        r14.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x091c, code lost:
        X.AnonymousClass1Z0.A01(new X.AnonymousClass6C2(r15.A00, r14, r15.A03, r15.A02), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x092a, code lost:
        r50 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x092c, code lost:
        r27 = r39.getRawString();
        r5 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0932, code lost:
        if (r5 != null) goto L_0x0934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0934, code lost:
        r29 = r5.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0938, code lost:
        r5 = r2.A05;
        r2 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x093c, code lost:
        if (r2 != null) goto L_0x093e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x093e, code lost:
        r31 = r2.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0942, code lost:
        r40.A01(new X.C128816Ds(r8, r7, r27, r18, r29, r5, r31, 0, r16, 1));
        r5 = X.AnonymousClass000.A0u();
        X.C36321k7.A1a(r5, X.C90524aI.A0g("InactiveAccountNotificationManager/showMessageNotifications/", r3, r5));
        r2 = r51.A07;
        r25 = r2;
        r2 = r2.A00;
        r24 = r2;
        r16 = X.AnonymousClass190.A1B(r2, r3, 3, r4);
        r2 = r51.A04;
        r17 = X.AnonymousClass001.A0I();
        r8 = r2.A01;
        r6 = X.C133346Xy.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0986, code lost:
        if (r6 == null) goto L_0x0a19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x098e, code lost:
        r5 = X.C90524aI.A0T(r6.getAbsolutePath(), "chatsettings.db");
        r13 = r8.A02;
        r6 = r8.A01;
        r9 = r5.getAbsolutePath();
        r12 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x09a7, code lost:
        r31 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x09aa, code lost:
        r29 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:?, code lost:
        r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r9, r18, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        r15 = X.C224014d.A01(r9, r6, r13, "chatsettings.db");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        r7 = new java.lang.String[3];
        r7[r4] = java.lang.String.valueOf(r4);
        X.C36351kA.A1V(r7, 1, java.lang.System.currentTimeMillis());
        X.C36351kA.A1V(r7, 2, r0);
        r5 = r15.A09("SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC", "GET_INACTIVE_ACCOUNT_MUTED_CHAT_JID_WITH_END_TIME_SORTED", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        r1 = r5.getColumnIndex("jid");
        r5.getColumnIndex("mute_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09e3, code lost:
        if (r5.moveToNext() != false) goto L_0x09e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09e5, code lost:
        r0 = X.C36421kH.A0N(r5.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09ed, code lost:
        if (r0 != null) goto L_0x09ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09ef, code lost:
        r12.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x09f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x09f8, code lost:
        if (r5 != null) goto L_0x09fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x09fe, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a03, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountMutedChatsList", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a07, code lost:
        if (r9 != null) goto L_0x0a09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a0d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a0e, code lost:
        if (r9 != null) goto L_0x0a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a14, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a18, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90464aC.A1H("AccountSwitchingFileManager/getInactiveAccountMutedChats/account ", r3, r1);
        X.C36321k7.A1a(r1, " databases dir does not exist");
        X.C90464aC.A13(r8, "AccountSwitchingFileManager/getInactiveAccountMutedChats/stagingDirLogString/", X.AnonymousClass000.A0u());
        r12 = X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a33, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a34, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountMutedChatsList", r0);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a37, code lost:
        r1 = X.AnonymousClass001.A0I();
        r0 = X.AnonymousClass001.A0I();
        r5 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a47, code lost:
        if (r5.hasNext() != false) goto L_0x0a49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a49, code lost:
        A00(r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a4d, code lost:
        r0 = X.C36441kJ.A19(r1, r0);
        r14 = (java.util.List) r0.first;
        r12 = (java.util.List) r0.second;
        r1 = X.C133346Xy.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a5d, code lost:
        if (r1 == null) goto L_0x0acf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a65, code lost:
        r0 = X.C90524aI.A0T(r1.getAbsolutePath(), "msgstore.db");
        r5 = r8.A02;
        r1 = r8.A01;
        r10 = r0.getAbsolutePath();
        r9 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a7d, code lost:
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:?, code lost:
        r10 = android.database.sqlite.SQLiteDatabase.openDatabase(r10, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:?, code lost:
        r5 = X.C224014d.A01(r10, r1, r5, "msgstore.db").A09("SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE archived = 1", "GET_INACTIVE_ACCOUNT_ARCHIVED_CHAT_JID", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:?, code lost:
        r1 = r5.getColumnIndexOrThrow("raw_string");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a99, code lost:
        if (r5.moveToNext() != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a9b, code lost:
        r0 = X.C36421kH.A0N(r5.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0aa3, code lost:
        if (r0 != null) goto L_0x0aa5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0aa5, code lost:
        r9.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0aad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0aae, code lost:
        if (r5 != null) goto L_0x0ab0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0ab4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0ab9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountArchivedChatsList", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0abd, code lost:
        if (r10 != null) goto L_0x0abf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0ac3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0ac4, code lost:
        if (r10 != null) goto L_0x0ac6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0aca, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0ace, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90464aC.A1H("AccountSwitchingFileManager/getInactiveAccountArchivedChats/account ", r3, r1);
        X.C36321k7.A1a(r1, " databases dir does not exist");
        X.C90464aC.A13(r8, "AccountSwitchingFileManager/getInactiveAccountArchivedChats/stagingDirLogString/", X.AnonymousClass000.A0u());
        r9 = X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ae9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0aea, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountArchivedChatsList", r0);
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0aed, code lost:
        r1 = X.AnonymousClass001.A0I();
        r0 = X.AnonymousClass001.A0I();
        r5 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0afd, code lost:
        if (r5.hasNext() != false) goto L_0x0aff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0aff, code lost:
        A00(r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0b03, code lost:
        r0 = X.C36441kJ.A19(r1, r0);
        r10 = (java.util.List) r0.first;
        r9 = (java.util.List) r0.second;
        r1 = X.C133346Xy.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0b13, code lost:
        if (r1 == null) goto L_0x0b85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0b1b, code lost:
        r0 = X.C90524aI.A0T(r1.getAbsolutePath(), "msgstore.db");
        r13 = r8.A02;
        r5 = r8.A01;
        r6 = r0.getAbsolutePath();
        r8 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b33, code lost:
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:?, code lost:
        r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r6, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:?, code lost:
        r5 = X.C224014d.A01(r6, r5, r13, "msgstore.db").A09("SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE chat_lock > 0", "GET_INACTIVE_ACCOUNT_LOCKED_CHAT_JID", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:?, code lost:
        r1 = r5.getColumnIndexOrThrow("raw_string");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b4f, code lost:
        if (r5.moveToNext() != false) goto L_0x0b51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b51, code lost:
        r0 = X.C36421kH.A0N(r5.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b59, code lost:
        if (r0 != null) goto L_0x0b5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b5b, code lost:
        r8.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b63, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b64, code lost:
        if (r5 != null) goto L_0x0b66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b6a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b6f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountLockedChatsList", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b73, code lost:
        if (r6 != null) goto L_0x0b75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b79, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b7a, code lost:
        if (r6 != null) goto L_0x0b7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0b80, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0b84, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90464aC.A1H("AccountSwitchingFileManager/getInactiveAccountLockedChats/account ", r3, r1);
        X.C36321k7.A1a(r1, " databases dir does not exist");
        X.C90464aC.A13(r8, "AccountSwitchingFileManager/getInactiveAccountLockedChats/stagingDirLogString/", X.AnonymousClass000.A0u());
        r8 = X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b9f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0ba0, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountLockedChatsList", r0);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0ba3, code lost:
        r1 = X.AnonymousClass001.A0I();
        r0 = X.AnonymousClass001.A0I();
        r5 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0bb3, code lost:
        if (r5.hasNext() != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0bb5, code lost:
        A00(r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0bb9, code lost:
        r0 = X.C36441kJ.A19(r1, r0);
        r5 = (java.util.List) r0.first;
        r1 = (java.util.List) r0.second;
        r0 = X.C36351kA.A0z(r14);
        r6 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bd1, code lost:
        if (r6.hasNext() != false) goto L_0x0bd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0bd3, code lost:
        X.C90464aC.A1U(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0bd7, code lost:
        r6 = X.C36351kA.A0z(r10);
        r7 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0be3, code lost:
        if (r7.hasNext() != false) goto L_0x0be5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0be5, code lost:
        X.C90464aC.A1U(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0be9, code lost:
        r6 = X.C007103b.A0S(r6, r0);
        r0 = X.C36351kA.A0z(r5);
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0bf9, code lost:
        if (r5.hasNext() != false) goto L_0x0bfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0bfb, code lost:
        X.C90464aC.A1U(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0bff, code lost:
        r5 = X.C007103b.A0S(r0, r6);
        r0 = X.C36351kA.A0z(r12);
        r6 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c0f, code lost:
        if (r6.hasNext() != false) goto L_0x0c11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c11, code lost:
        X.C90464aC.A1U(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c15, code lost:
        r6 = X.C36351kA.A0z(r9);
        r7 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c21, code lost:
        if (r7.hasNext() != false) goto L_0x0c23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c23, code lost:
        X.C90464aC.A1U(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c27, code lost:
        r7 = X.C007103b.A0S(r6, r0);
        r6 = X.C36351kA.A0z(r1);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c37, code lost:
        if (r0.hasNext() != false) goto L_0x0c39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c39, code lost:
        X.C90464aC.A1U(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c3d, code lost:
        r0 = X.C36441kJ.A19(r5.toArray(new java.lang.String[r4]), X.C007103b.A0S(r6, r7).toArray(new java.lang.String[r4]));
        r5 = r2.A02;
        r1 = (java.lang.String[]) r0.first;
        r0 = (java.lang.String[]) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0c5b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:?, code lost:
        X.C36321k7.A0v(r1, 1, r0);
        com.whatsapp.util.Log.i("InactiveNotificationsStore/readAllUnreadMessageNotifications");
        r6 = new java.lang.String[1];
        r6[r4] = r3;
        r6 = X.AnonymousClass02Q.A06(X.AnonymousClass02Q.A06(X.AnonymousClass02Q.A06(r6, new java.lang.String[]{"message", "group_message"}), r1), r0);
        r7 = new java.lang.String[1];
        r7[r4] = r23;
        r10 = (java.lang.String[]) X.AnonymousClass02Q.A06(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:?, code lost:
        r6 = ((X.AnonymousClass54Z) r5.A00.get()).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:?, code lost:
        r9 = r6.A02;
        r12 = r1.length;
        r8 = r0.length;
        r7 = X.AnonymousClass000.A0u();
        r1 = X.C90484aE.A0q("SELECT account_lid, notification_type, sender_jid, timestamp, group_jid, display_name, count, sender_pn_jid FROM notifications WHERE account_lid = ? AND notification_type IN (?,?) AND ", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ca1, code lost:
        if (r12 > 0) goto L_0x0ca3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0ca3, code lost:
        r1.append("CASE WHEN group_jid IS NULL OR group_jid == '' ");
        X.C36351kA.A1O("THEN sender_jid NOT IN ", r1, r12);
        r1.append("ELSE 1 END AND ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0cb2, code lost:
        if (r8 > 0) goto L_0x0cb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0cb4, code lost:
        X.C36351kA.A1O("group_jid NOT IN ", r1, r8);
        r1.append(" AND ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0cbe, code lost:
        r7.append(X.C36381kD.A0y(r1));
        r0 = r9.A09(X.AnonymousClass000.A0q("timestamp >= ? ORDER BY timestamp DESC", r7), "GET_ALL_MSG_AND_GROUP_MSG_NOTIFICATIONS_SQL", r10);
        X.AnonymousClass00C.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:?, code lost:
        r1 = X.AnonymousClass001.A0I();
        r23 = r0.getColumnIndex("account_lid");
        r15 = r0.getColumnIndex("notification_type");
        r14 = r0.getColumnIndex("sender_jid");
        r13 = r0.getColumnIndex("timestamp");
        r12 = r0.getColumnIndex("group_jid");
        r10 = r0.getColumnIndex("display_name");
        r9 = r0.getColumnIndex("count");
        r8 = r0.getColumnIndex("sender_pn_jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0d0c, code lost:
        if (r0.moveToNext() != false) goto L_0x0d0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0d0e, code lost:
        r1.add(new X.C128816Ds(X.C90494aF.A0Z(r0, r23), X.C90494aF.A0Z(r0, r15), X.C90494aF.A0Z(r0, r14), r18, r0.getString(r12), r0.getString(r10), r0.getString(r8), 0, r0.getLong(r13), r0.getLong(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:?, code lost:
        r6.close();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0d48, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:?, code lost:
        X.C05600Qi.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0d4c, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0d4f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:?, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0d53, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0d54, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:?, code lost:
        r1 = X.C90524aI.A0t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0d59, code lost:
        r6 = X.AnonymousClass0AK.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0d5d, code lost:
        if (r6 != null) goto L_0x0d5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0d5f, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/readAllUnreadMessageNotifications/failed", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0d64, code lost:
        r6 = X.C023409w.A00;
        r0 = r1 instanceof X.AnonymousClass03N;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d68, code lost:
        if (r0 != false) goto L_0x0d6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d6a, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0d6b, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0d6e, code lost:
        r23 = X.AnonymousClass6N4.A00(r19, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d78, code lost:
        if (r23.isEmpty() != false) goto L_0x0d7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d7a, code lost:
        com.whatsapp.util.Log.e("InactiveAccountNotificationManager/showMessageNotifications/empty notificationsTextPair");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d7f, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("AccountSwitchingDataRepo/incrementInactivePushMessageCount/");
        r3 = r11.A08;
        X.C36321k7.A1a(r1, X.AnonymousClass3LV.A01(r3));
        r6 = X.AnonymousClass001.A0I();
        r7 = X.AnonymousClass1Z0.A00(r52);
        r6.addAll(r7.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0da2, code lost:
        if (X.AnonymousClass1Z0.A02(r3, r6) == false) goto L_0x0da4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0da4, code lost:
        r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Account doesn't exists";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0da8, code lost:
        r15 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0db1, code lost:
        if (r15.hasNext() != false) goto L_0x0db3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0db3, code lost:
        r6 = (X.AnonymousClass6DT) r15.next();
        r1 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0dc1, code lost:
        if (X.AnonymousClass00C.A0J(r1, "message") != false) goto L_0x0dc3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0dc3, code lost:
        r10 = X.C36421kH.A0B(r2.A04);
        r7 = (int) r6.A00;
        r0 = new java.lang.Object[1];
        r9 = r6.A04;
        r0[r4] = r9;
        r0 = r10.getQuantityString(com.whatsapp.R.plurals.f10nameremoved, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0dd9, code lost:
        X.AnonymousClass00C.A08(r0);
        r7 = r9.length();
        r6 = X.C36441kJ.A0O(r0);
        r6.setSpan(new android.text.style.StyleSpan(1), r4, r7, 33);
        r17.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0dfa, code lost:
        if (X.AnonymousClass00C.A0J(r1, "group_message") != false) goto L_0x0dfc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0dfc, code lost:
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0e01, code lost:
        if (r0 == 1) goto L_0x0e03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0e03, code lost:
        r12 = X.C36421kH.A0B(r2.A04);
        r8 = (int) r6.A00;
        r0 = new java.lang.Object[2];
        r9 = r6.A04;
        r0[r4] = r9;
        r0[1] = r6.A02;
        r0 = r12.getQuantityString(com.whatsapp.R.plurals.f10nameremoved, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0e23, code lost:
        if (r0 == 2) goto L_0x0e25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0e25, code lost:
        r10 = r2.A04;
        r1 = new java.lang.Object[3];
        r9 = r6.A04;
        r1[r4] = r9;
        r1[1] = r6.A02;
        r1[2] = r6.A03;
        r0 = r10.A02(com.whatsapp.R.string.f12nameremoved, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:?, code lost:
        r14 = r2.A04;
        r8 = new java.lang.Object[4];
        r10 = r6.A04;
        r8[r4] = r10;
        r8[1] = r6.A02;
        r8[2] = r6.A03;
        X.AnonymousClass000.A1M(r8, 3, r0 - ((long) 2));
        r0 = r14.A02(com.whatsapp.R.string.f12nameremoved, r8);
        X.AnonymousClass00C.A08(r0);
        r7 = r10.length();
        r6 = X.C36441kJ.A0O(r0);
        r6.setSpan(new android.text.style.StyleSpan(1), r4, r7, 33);
        r17.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:?, code lost:
        com.whatsapp.util.Log.e("NotificationUiBuilder/getNotificationTextForMessages/error in string resource");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0e7d, code lost:
        X.C36321k7.A1P("NotificationUiBuilder/getNotificationTextForMessages/unknown message type/", r1, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0e8c, code lost:
        if (r23.size() != 1) goto L_0x0ef8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0e9c, code lost:
        r2 = r2.A04;
        r0 = new java.lang.Object[1];
        X.AnonymousClass000.A1L(r0, 1, r4);
        r1 = r2.A02(com.whatsapp.R.string.f12nameremoved, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0eaa, code lost:
        X.AnonymousClass00C.A0B(r1);
        r6 = X.C36441kJ.A19(r1, r17);
        r0 = r51;
        r0.A03.A04(r16, new X.C07250Wx(r4, r25.A01(com.whatsapp.R.string.f12nameremoved), X.C65743Th.A03(r24, r16, r4)), X.AnonymousClass6V1.A00(X.C108325Tb.A04, r3), r0.A03(r19), (java.lang.String) r6.first, (java.util.List) r6.second, r50);
        X.AnonymousClass6V1.A02(r19, r51);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0ef8, code lost:
        r7 = X.C36421kH.A0B(r2.A04);
        r2 = r23.size();
        r1 = new java.lang.Object[1];
        X.AnonymousClass000.A1L(r1, r23.size(), r4);
        r1 = r7.getQuantityString(com.whatsapp.R.plurals.f10nameremoved, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0f13, code lost:
        r2 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0f17, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0f1c, code lost:
        if (r2.hasNext() != false) goto L_0x0f1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0f1e, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0f2b, code lost:
        if (X.AnonymousClass00C.A0J(((X.AnonymousClass3KU) r1).A08, r3) != false) goto L_0x0f2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0f2d, code lost:
        r1 = (X.AnonymousClass3KU) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0f2f, code lost:
        if (r1 != null) goto L_0x0f31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0f31, code lost:
        r8 = java.lang.Integer.valueOf(r1.A01 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0f39, code lost:
        r2 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0f41, code lost:
        if (r2.hasNext() != false) goto L_0x0f43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0f43, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0f50, code lost:
        if (X.AnonymousClass00C.A0J(r1.A08, r3) != false) goto L_0x0f52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0f53, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0f55, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0f57, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0f58, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0f5a, code lost:
        if (r5 != null) goto L_0x0f5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0f5c, code lost:
        if (r8 != null) goto L_0x0f5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0f5f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0f61, code lost:
        r0 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0f65, code lost:
        r5.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0f78, code lost:
        if (X.AnonymousClass1Z0.A01(new X.AnonymousClass6C2(r7.A00, r6, r7.A03, r7.A02), r52) == false) goto L_0x0f7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0f7a, code lost:
        com.whatsapp.util.Log.w("AccountSwitchingDataRepo/incrementInactivePushMessageCount/Failed to update inactiveAccounts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0f8b, code lost:
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/showOfflineMessagesCountWarning");
        r1 = r51.A03;
        r6 = X.AnonymousClass6V1.A00(X.C108325Tb.A08, r3);
        r0 = r51;
        r7 = r0.A03(r11);
        r2 = r0.A07;
        r1.A03(X.AnonymousClass190.A1B(r2.A00, r3, 11, r4), r18, X.C36371kC.A0v(r2, com.whatsapp.R.string.f12nameremoved), r6, r7, com.whatsapp.R.drawable.notifybar, 11, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x101e, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x11ba, code lost:
        if (r11 != null) goto L_0x11bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x1367, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v2, types: [boolean, int] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0335 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x013c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0354 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0539 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0551 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x059a A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x059b A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05b7 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x064c A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0664 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0678 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0679 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0720 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0745 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x074b A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x077b A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0132 A[SYNTHETIC, Splitter:B:41:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0207 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021a A[SYNTHETIC, Splitter:B:67:0x021a] */
    /* JADX WARNING: Removed duplicated region for block: B:734:0x113d A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:737:0x1146 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:742:0x1175 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:752:0x11c1 A[Catch:{ IOException | SAXException -> 0x0273 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:222:0x0541=Splitter:B:222:0x0541, B:205:0x0503=Splitter:B:205:0x0503, B:105:0x0324=Splitter:B:105:0x0324, B:212:0x0524=Splitter:B:212:0x0524, B:543:0x0b85=Splitter:B:543:0x0b85, B:176:0x0466=Splitter:B:176:0x0466, B:437:0x0a19=Splitter:B:437:0x0a19, B:43:0x013c=Splitter:B:43:0x013c, B:490:0x0acf=Splitter:B:490:0x0acf} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.Integer r54, java.lang.Integer r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, int r71, boolean r72) {
        /*
            r53 = this;
            r22 = r54
            r20 = r53
            monitor-enter(r20)
            r0 = r20
            X.0wo r0 = r0.A04     // Catch:{ all -> 0x136f }
            long r18 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            r13 = r71
            if (r71 == 0) goto L_0x00a8
            java.lang.String r0 = "FBNS"
        L_0x0017:
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " push received; id="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r45 = r56
            r0 = r45
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; ip="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r44 = r57
            r0 = r44
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; sessionId = "
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r43 = r58
            r0 = r43
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; mmsOverride="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r14 = r59
            r1.append(r14)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; fbips="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r23 = r60
            r0 = r23
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; notifyOnFailure="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r41 = r72
            r0 = r41
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; routingInfo="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r42 = r61
            r0 = r42
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; pushTs="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r15 = r64
            r1.append(r15)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; pushTransport="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r1.append(r13)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; originalPriority="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r0 = r22
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; deliveredPriority="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r46 = r55
            r0 = r46
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; pushNonce is empty="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r21 = r65
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x136f }
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "; has encPayload="
            r1.append(r0)     // Catch:{ all -> 0x136f }
            goto L_0x00ac
        L_0x00a8:
            java.lang.String r0 = "GCM"
            goto L_0x0017
        L_0x00ac:
            r2 = 1
            r4 = r67
            boolean r0 = X.AnonymousClass000.A1V(r4)
            X.C36331k8.A1S(r1, r0)     // Catch:{ all -> 0x136f }
            r0 = -1
            long r16 = X.AnonymousClass6R8.A01(r15, r0)     // Catch:{ all -> 0x136f }
            if (r13 != r2) goto L_0x00ce
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x1365
            r0 = r20
            X.1bE r0 = r0.A07     // Catch:{ all -> 0x136f }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x00ce
            goto L_0x1365
        L_0x00ce:
            if (r67 == 0) goto L_0x0542
            r0 = r20
            X.6OJ r12 = r0.A09     // Catch:{ all -> 0x136f }
            r6 = 0
            r0 = r68
            if (r68 == 0) goto L_0x0341
            r2 = r69
            if (r69 == 0) goto L_0x0341
            r3 = r70
            if (r70 == 0) goto L_0x0341
            java.lang.String r1 = "payload"
            byte[] r29 = A01(r4, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r1 = "IV"
            byte[] r30 = A01(r0, r1)     // Catch:{ all -> 0x136f }
            r0 = -1
            long r32 = X.AnonymousClass6R8.A01(r2, r0)     // Catch:{ all -> 0x136f }
            java.lang.String r2 = "tag"
            byte[] r31 = A01(r3, r2)     // Catch:{ all -> 0x136f }
            if (r29 == 0) goto L_0x0344
            if (r30 == 0) goto L_0x0344
            int r2 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0344
            if (r31 == 0) goto L_0x0344
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            byte[] r28 = X.AnonymousClass6OJ.A00(r12)     // Catch:{ all -> 0x136f }
            if (r28 != 0) goto L_0x0113
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to get pKey"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x0125
        L_0x0113:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal attempting decrypt\n"
            r8.append(r0)     // Catch:{ all -> 0x136f }
            r27 = r8
            byte[] r2 = A02(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x136f }
            if (r2 != 0) goto L_0x0127
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to decrypt\n"
            r8.append(r0)     // Catch:{ all -> 0x136f }
        L_0x0125:
            r1 = r6
            goto L_0x012e
        L_0x0127:
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ all -> 0x136f }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x136f }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x136f }
        L_0x012e:
            java.lang.String r28 = "PushEncryptionHelper/decryptPushPayloadToJSON bad JSON"
            if (r1 == 0) goto L_0x0149
            org.json.JSONObject r0 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x013c }
            android.util.Pair r1 = X.C36441kJ.A0Q(r6, r0)     // Catch:{ JSONException -> 0x013c }
            goto L_0x034e
        L_0x013c:
            X.C90504aG.A1G(r8)     // Catch:{ all -> 0x136f }
            com.whatsapp.util.Log.e((java.lang.String) r28)     // Catch:{ all -> 0x136f }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x136f }
            r1.<init>(r6, r6)     // Catch:{ all -> 0x136f }
            goto L_0x034e
        L_0x0149:
            X.5oz r10 = r12.A00     // Catch:{ all -> 0x136f }
            java.util.HashMap r27 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x136f }
            X.005 r0 = r10.A01     // Catch:{ all -> 0x136f }
            java.util.List r0 = X.AnonymousClass6C2.A00(r0)     // Catch:{ all -> 0x136f }
            java.util.Iterator r26 = r0.iterator()     // Catch:{ all -> 0x136f }
        L_0x0159:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0281
            java.lang.Object r0 = r26.next()     // Catch:{ all -> 0x136f }
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r0.A08     // Catch:{ all -> 0x136f }
            X.005 r0 = r10.A00     // Catch:{ all -> 0x136f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x136f }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ all -> 0x136f }
            java.lang.String r25 = ": "
            r7 = 0
            java.lang.String r1 = "AccountSwitcher/getPKeyFromSharedPrefForInactiveAccount"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x136f }
            X.005 r0 = r0.A0E     // Catch:{ all -> 0x136f }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x136f }
            X.6Xy r4 = (X.C133346Xy) r4     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.C19420v0.A05     // Catch:{ all -> 0x136f }
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = ".xml"
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x136f }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x136f }
            X.00T r0 = r4.A06     // Catch:{ all -> 0x136f }
            boolean r1 = X.C90474aD.A1Y(r0)     // Catch:{ all -> 0x136f }
            r5 = 0
            if (r1 != 0) goto L_0x01a1
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/Staging Directory don't exist"
        L_0x019d:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x01db
        L_0x01a1:
            java.io.File r1 = X.C90464aC.A0L(r9, r0)     // Catch:{ all -> 0x136f }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x136f }
            java.lang.String r11 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/stagingDirLogString/"
            java.lang.String r2 = " does not exist"
            if (r0 != 0) goto L_0x01c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/Account "
        L_0x01b5:
            java.lang.String r0 = X.C90524aI.A0g(r0, r9, r1)     // Catch:{ all -> 0x136f }
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            X.C90464aC.A13(r4, r11, r0)     // Catch:{ all -> 0x136f }
            goto L_0x01db
        L_0x01c4:
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "shared_prefs"
            java.io.File r1 = X.C90524aI.A0T(r1, r0)     // Catch:{ all -> 0x136f }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x01dd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/shared prefs for "
            goto L_0x01b5
        L_0x01db:
            r0 = r6
            goto L_0x0203
        L_0x01dd:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.io.File r0 = X.C90524aI.A0T(r0, r3)     // Catch:{ all -> 0x136f }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x136f }
            if (r1 != 0) goto L_0x0203
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getSharedPrefFileForInactiveAccount/"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            r1.append(r3)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " file for "
            X.C90464aC.A1H(r0, r9, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " doesn't exist"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x136f }
            goto L_0x019d
        L_0x0203:
            java.lang.String r4 = "AccountSwitcher/getPKeyFromSharedPrefForInactiveAccount/"
            if (r0 != 0) goto L_0x021a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            X.C90464aC.A1H(r4, r9, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = ": file does not exists"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x136f }
        L_0x0213:
            r0 = r27
            r0.put(r9, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0159
        L_0x021a:
            javax.xml.parsers.DocumentBuilderFactory r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException | SAXException -> 0x0273 }
            javax.xml.parsers.DocumentBuilder r1 = r1.newDocumentBuilder()     // Catch:{ IOException | SAXException -> 0x0273 }
            org.w3c.dom.Document r1 = r1.parse(r0)     // Catch:{ IOException | SAXException -> 0x0273 }
            java.lang.String r0 = "string"
            org.w3c.dom.NodeList r11 = r1.getElementsByTagName(r0)     // Catch:{ IOException | SAXException -> 0x0273 }
            int r3 = r11.getLength()     // Catch:{ IOException | SAXException -> 0x0273 }
            if (r3 < 0) goto L_0x0213
            r2 = 0
        L_0x0233:
            org.w3c.dom.Node r24 = r11.item(r2)     // Catch:{ IOException | SAXException -> 0x0273 }
            if (r24 == 0) goto L_0x026e
            org.w3c.dom.NamedNodeMap r0 = r24.getAttributes()     // Catch:{ IOException | SAXException -> 0x0273 }
            int r0 = r0.getLength()     // Catch:{ IOException | SAXException -> 0x0273 }
            if (r0 <= 0) goto L_0x026e
            org.w3c.dom.NamedNodeMap r0 = r24.getAttributes()     // Catch:{ IOException | SAXException -> 0x0273 }
            org.w3c.dom.Node r0 = r0.item(r7)     // Catch:{ IOException | SAXException -> 0x0273 }
            java.lang.String r1 = r0.getNodeValue()     // Catch:{ IOException | SAXException -> 0x0273 }
            java.lang.String r0 = "push:push_pkey_data"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ IOException | SAXException -> 0x0273 }
            if (r0 == 0) goto L_0x026e
            org.w3c.dom.NodeList r0 = r24.getChildNodes()     // Catch:{ IOException | SAXException -> 0x0273 }
            int r0 = r0.getLength()     // Catch:{ IOException | SAXException -> 0x0273 }
            if (r0 <= 0) goto L_0x026e
            org.w3c.dom.NodeList r0 = r24.getChildNodes()     // Catch:{ IOException | SAXException -> 0x0273 }
            org.w3c.dom.Node r0 = r0.item(r7)     // Catch:{ IOException | SAXException -> 0x0273 }
            java.lang.String r5 = r0.getNodeValue()     // Catch:{ IOException | SAXException -> 0x0273 }
            goto L_0x0213
        L_0x026e:
            if (r2 == r3) goto L_0x0213
            int r2 = r2 + 1
            goto L_0x0233
        L_0x0273:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            X.C90464aC.A1H(r4, r9, r0)     // Catch:{ all -> 0x136f }
            r2 = r25
            X.C36321k7.A1J(r1, r2, r0)     // Catch:{ all -> 0x136f }
            goto L_0x0213
        L_0x0281:
            java.util.Iterator r5 = X.C36371kC.A10(r27)     // Catch:{ all -> 0x136f }
        L_0x0285:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x02d9
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r5)     // Catch:{ all -> 0x136f }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x136f }
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != 0) goto L_0x02af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts pKey not found for {"
        L_0x029d:
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.C90494aF.A0f(r4)     // Catch:{ all -> 0x136f }
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r2)     // Catch:{ all -> 0x136f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x0285
        L_0x02af:
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x136f }
            X.C90494aF.A10(r1)     // Catch:{ all -> 0x136f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x136f }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x136f }
            r0.<init>(r1)     // Catch:{ all -> 0x136f }
            X.63z r3 = X.AnonymousClass132.A00(r0)     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x02d2
            X.133 r1 = r12.A03     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass6JD.A0V     // Catch:{ all -> 0x136f }
            byte[] r35 = r1.A02(r3, r0)     // Catch:{ all -> 0x136f }
            if (r35 != 0) goto L_0x02e4
            java.lang.String r0 = "PushEncryptionHelper/getSavedPKey failed to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
        L_0x02d2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to get pKey for {"
            goto L_0x029d
        L_0x02d9:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to decrypt"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x136f }
            r1.<init>(r6, r6)     // Catch:{ all -> 0x136f }
            goto L_0x031b
        L_0x02e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts attempting decrypt for {"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.C90494aF.A0f(r4)     // Catch:{ all -> 0x136f }
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "}\n"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            X.C36351kA.A1K(r1, r8)     // Catch:{ all -> 0x136f }
            r34 = r8
            r36 = r29
            r37 = r30
            r38 = r31
            r39 = r32
            byte[] r0 = A02(r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0285
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x136f }
            java.nio.charset.Charset r2 = X.AnonymousClass0S4.A05     // Catch:{ all -> 0x136f }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x136f }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x136f }
            android.util.Pair r1 = X.C36441kJ.A0Q(r3, r1)     // Catch:{ all -> 0x136f }
        L_0x031b:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0324
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x136f }
            goto L_0x0346
        L_0x0324:
            java.lang.Object r1 = r1.first     // Catch:{ JSONException -> 0x0335 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0335 }
            if (r0 == 0) goto L_0x0333
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0335 }
        L_0x032e:
            android.util.Pair r1 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ JSONException -> 0x0335 }
            goto L_0x034e
        L_0x0333:
            r0 = r6
            goto L_0x032e
        L_0x0335:
            X.C90504aG.A1G(r8)     // Catch:{ all -> 0x136f }
            com.whatsapp.util.Log.e((java.lang.String) r28)     // Catch:{ all -> 0x136f }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x136f }
            r1.<init>(r6, r6)     // Catch:{ all -> 0x136f }
            goto L_0x034e
        L_0x0341:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON missing payload attributes"
            goto L_0x0346
        L_0x0344:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON bad payload attributes"
        L_0x0346:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x136f }
            r1.<init>(r6, r6)     // Catch:{ all -> 0x136f }
        L_0x034e:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x136f }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0539
            java.lang.Object r10 = r1.first     // Catch:{ all -> 0x136f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x136f }
            java.lang.String r2 = "nt"
            r1 = 0
            java.lang.String r9 = X.C63893Lv.A00(r2, r0, r1)     // Catch:{ all -> 0x136f }
            r2 = 0
            if (r9 == 0) goto L_0x0371
            int r6 = r9.hashCode()     // Catch:{ all -> 0x136f }
            java.lang.String r4 = "PushPayloadParser/fromJSON missing "
            java.lang.String r3 = "display_name"
            java.lang.String r5 = "from_jid"
            java.lang.String r1 = "call_id"
            switch(r6) {
                case -1127809222: goto L_0x047b;
                case -395094592: goto L_0x043b;
                case -318861064: goto L_0x0501;
                case 143478273: goto L_0x040e;
                case 239102022: goto L_0x040b;
                case 757346421: goto L_0x0381;
                case 954925063: goto L_0x03cd;
                case 1006153287: goto L_0x0385;
                default: goto L_0x0371;
            }     // Catch:{ all -> 0x136f }
        L_0x0371:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "PushPayloadParser/fromJSON unknown nt: "
            X.C36321k7.A1P(r0, r9, r1)     // Catch:{ all -> 0x136f }
        L_0x037a:
            java.lang.String r0 = "IncomingPushHandler/payload failed to extract"
        L_0x037c:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x053c
        L_0x0381:
            java.lang.String r0 = "post_reg"
            goto L_0x0503
        L_0x0385:
            java.lang.String r1 = "group_message"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0371
            X.13q r1 = X.AnonymousClass11F.A00     // Catch:{ Exception -> 0x03ba }
            java.lang.String r4 = "participant_jid"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x03ba }
            X.11F r6 = X.C222713q.A01(r4)     // Catch:{ Exception -> 0x03ba }
            X.6SZ r4 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x03ba }
            java.lang.String r4 = r0.getString(r5)     // Catch:{ Exception -> 0x03ba }
            com.whatsapp.jid.GroupJid r8 = X.AnonymousClass6SZ.A01(r4)     // Catch:{ Exception -> 0x03ba }
            java.lang.String r4 = "participant_pn"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Exception -> 0x03ba }
            X.11F r7 = r1.A02(r4)     // Catch:{ Exception -> 0x03ba }
            java.lang.String r11 = r0.optString(r3)     // Catch:{ Exception -> 0x03ba }
            X.5JM r24 = new X.5JM     // Catch:{ Exception -> 0x03ba }
            r5 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x03ba }
            goto L_0x04fe
        L_0x03ba:
            r3 = move-exception
            boolean r0 = r3 instanceof X.C19740wR     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x03c7
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x03c7
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0541
        L_0x03c7:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_GROUP_MESSAGE"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x136f }
            goto L_0x037a
        L_0x03cd:
            java.lang.String r1 = "message"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0371
            X.13q r1 = X.AnonymousClass11F.A00     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r4 = r0.getString(r5)     // Catch:{ Exception -> 0x03f7 }
            X.11F r6 = X.C222713q.A01(r4)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r11 = r0.optString(r3)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r3 = "sender_pn"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ Exception -> 0x03f7 }
            X.11F r7 = r1.A02(r0)     // Catch:{ Exception -> 0x03f7 }
            X.5JM r24 = new X.5JM     // Catch:{ Exception -> 0x03f7 }
            r5 = r24
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x03f7 }
            goto L_0x04fe
        L_0x03f7:
            r3 = move-exception
            boolean r0 = r3 instanceof X.C19740wR     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0404
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0404
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0541
        L_0x0404:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_MESSAGE"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x136f }
            goto L_0x037a
        L_0x040b:
            java.lang.String r3 = "voip_call_offer_1on1"
            goto L_0x047d
        L_0x040e:
            java.lang.String r1 = "wfac_ban"
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0371
            java.lang.String r1 = "decision"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0427 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ Exception -> 0x0427 }
            X.5JL r0 = new X.5JL     // Catch:{ Exception -> 0x0427 }
            r0.<init>(r9, r10, r1)     // Catch:{ Exception -> 0x0427 }
            r2 = r0
            goto L_0x050e
        L_0x0427:
            r3 = move-exception
            boolean r0 = r3 instanceof X.C19740wR     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0434
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0434
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0541
        L_0x0434:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_WFAC_BAN missing decision"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x136f }
            goto L_0x037a
        L_0x043b:
            java.lang.String r3 = "call_terminate"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x0371
            java.lang.String r30 = r0.getString(r1)     // Catch:{ Exception -> 0x0465 }
            X.AnonymousClass00C.A0B(r30)     // Catch:{ Exception -> 0x0465 }
            r31 = 0
            r26 = r2
            r27 = r2
            r33 = 0
            r35 = 0
            r37 = 0
            X.5JN r24 = new X.5JN     // Catch:{ Exception -> 0x0463 }
            r25 = r2
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r33, r35, r37)     // Catch:{ Exception -> 0x0463 }
            goto L_0x04fe
        L_0x0463:
            r3 = move-exception
            goto L_0x0466
        L_0x0465:
            r3 = move-exception
        L_0x0466:
            boolean r0 = r3 instanceof X.C19740wR     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0472
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0472
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0541
        L_0x0472:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            X.C36321k7.A1P(r4, r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x037a
        L_0x047b:
            java.lang.String r3 = "voip_call_offer_group"
        L_0x047d:
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x0371
            java.lang.String r30 = r0.getString(r1)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "from_device_jid"
            X.13u r5 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ Exception -> 0x0523 }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ Exception -> 0x0523 }
            com.whatsapp.jid.DeviceJid r25 = r5.A02(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "group_jid"
            boolean r3 = r0.has(r1)     // Catch:{ Exception -> 0x0523 }
            if (r3 == 0) goto L_0x04db
            X.6SZ r3 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x0523 }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ Exception -> 0x0523 }
            com.whatsapp.jid.GroupJid r27 = X.AnonymousClass6SZ.A01(r3)     // Catch:{ Exception -> 0x0523 }
        L_0x04a5:
            java.lang.String r1 = "video_call"
            java.lang.String r5 = "1"
            java.lang.String r3 = r0.getString(r1)     // Catch:{ Exception -> 0x0523 }
            boolean r37 = r5.equals(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "offer_ts_sec"
            java.lang.String r3 = X.C90474aD.A0e(r1, r0)     // Catch:{ Exception -> 0x0523 }
            long r31 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "offer_push_timeout_sec"
            java.lang.String r3 = X.C90474aD.A0e(r1, r0)     // Catch:{ Exception -> 0x0523 }
            long r33 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "secondary_account_offer_timeout_sec"
            boolean r3 = r0.has(r1)     // Catch:{ Exception -> 0x0523 }
            if (r3 == 0) goto L_0x04d8
            java.lang.String r3 = X.C90474aD.A0e(r1, r0)     // Catch:{ Exception -> 0x0523 }
            long r35 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0523 }
        L_0x04d5:
            java.lang.String r1 = "from_pn"
            goto L_0x04de
        L_0x04d8:
            r35 = 0
            goto L_0x04d5
        L_0x04db:
            r27 = r2
            goto L_0x04a5
        L_0x04de:
            boolean r3 = r0.has(r1)     // Catch:{ Exception -> 0x0521 }
            if (r3 == 0) goto L_0x04fb
            X.13u r3 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ Exception -> 0x0521 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0521 }
            com.whatsapp.jid.DeviceJid r26 = r3.A02(r0)     // Catch:{ Exception -> 0x0521 }
        L_0x04ee:
            X.AnonymousClass00C.A0B(r30)     // Catch:{ Exception -> 0x0521 }
            X.5JN r24 = new X.5JN     // Catch:{ Exception -> 0x0521 }
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r33, r35, r37)     // Catch:{ Exception -> 0x0521 }
            goto L_0x04fe
        L_0x04fb:
            r26 = r2
            goto L_0x04ee
        L_0x04fe:
            r2 = r24
            goto L_0x050e
        L_0x0501:
            java.lang.String r0 = "pre_reg"
        L_0x0503:
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0371
            X.5JK r2 = new X.5JK     // Catch:{ all -> 0x136f }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x136f }
        L_0x050e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "IncomingPushHandler/received payload nt:"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r2.A00()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x136f }
            goto L_0x037c
        L_0x0521:
            r3 = move-exception
            goto L_0x0524
        L_0x0523:
            r3 = move-exception
        L_0x0524:
            boolean r0 = r3 instanceof X.C19740wR     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0530
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0530
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0541
        L_0x0530:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            X.C36321k7.A1P(r4, r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x037a
        L_0x0539:
            r2 = 0
            goto L_0x037a
        L_0x053c:
            boolean r0 = X.AnonymousClass000.A1V(r2)
            goto L_0x0545
        L_0x0541:
            throw r3     // Catch:{ all -> 0x136f }
        L_0x0542:
            r2 = 0
            r3 = 0
            goto L_0x0549
        L_0x0545:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x136f }
        L_0x0549:
            r7 = r62
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0594
            r5 = r63
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0594
            r0 = -1
            r4 = 0
            X.58A r6 = new X.58A     // Catch:{ all -> 0x136f }
            r6.<init>()     // Catch:{ all -> 0x136f }
            long r9 = X.AnonymousClass6R8.A01(r15, r0)     // Catch:{ all -> 0x136f }
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0586
            r6.A05 = r7     // Catch:{ all -> 0x136f }
            r6.A04 = r5     // Catch:{ all -> 0x136f }
            r6.A00 = r3     // Catch:{ all -> 0x136f }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x136f }
            r6.A03 = r5     // Catch:{ all -> 0x136f }
            java.lang.Long r5 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x136f }
            r6.A02 = r5     // Catch:{ all -> 0x136f }
            r5 = r46
            r6.A01 = r5     // Catch:{ all -> 0x136f }
            r5 = r20
            X.0yW r5 = r5.A02     // Catch:{ all -> 0x136f }
            r5.Bly(r6)     // Catch:{ all -> 0x136f }
        L_0x0586:
            r5 = r20
            X.18Z r5 = r5.A03     // Catch:{ all -> 0x136f }
            java.util.concurrent.atomic.AtomicInteger r5 = r5.A07     // Catch:{ all -> 0x136f }
            r5.getAndIncrement()     // Catch:{ all -> 0x136f }
            boolean r12 = X.C36421kH.A1a(r43)     // Catch:{ all -> 0x136f }
            goto L_0x0598
        L_0x0594:
            r4 = 0
            r0 = -1
            goto L_0x0586
        L_0x0598:
            if (r12 == 0) goto L_0x059b
            goto L_0x059d
        L_0x059b:
            r11 = 0
            goto L_0x05ab
        L_0x059d:
            r5 = r20
            X.0v0 r5 = r5.A01     // Catch:{ all -> 0x136f }
            java.util.List r6 = r5.A0o()     // Catch:{ all -> 0x136f }
            r5 = r43
            boolean r11 = r6.contains(r5)     // Catch:{ all -> 0x136f }
        L_0x05ab:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x136f }
            long r7 = X.AnonymousClass6R8.A01(r15, r0)     // Catch:{ all -> 0x136f }
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0611
            X.58S r9 = new X.58S     // Catch:{ all -> 0x136f }
            r9.<init>()     // Catch:{ all -> 0x136f }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x136f }
            r9.A08 = r5     // Catch:{ all -> 0x136f }
            r5 = r22
            r9.A05 = r5     // Catch:{ all -> 0x136f }
            r5 = r46
            r9.A04 = r5     // Catch:{ all -> 0x136f }
            r5 = r18
            java.lang.Long r5 = X.C90504aG.A0h(r5, r7)     // Catch:{ all -> 0x136f }
            r9.A07 = r5     // Catch:{ all -> 0x136f }
            r9.A06 = r10     // Catch:{ all -> 0x136f }
            r5 = r20
            X.0v0 r5 = r5.A01     // Catch:{ all -> 0x136f }
            X.005 r7 = r5.A00     // Catch:{ all -> 0x136f }
            android.content.SharedPreferences r6 = X.C36391kE.A0H(r7)     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "c2dm_reg_id"
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x136f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x136f }
            r9.A01 = r5     // Catch:{ all -> 0x136f }
            android.content.SharedPreferences r6 = X.C36391kE.A0H(r7)     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "fbns_token"
            java.lang.String r5 = X.C36371kC.A0t(r6, r5)     // Catch:{ all -> 0x136f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x136f }
            java.lang.Boolean r5 = X.C36441kJ.A0x(r5)     // Catch:{ all -> 0x136f }
            r9.A00 = r5     // Catch:{ all -> 0x136f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x136f }
            r9.A02 = r5     // Catch:{ all -> 0x136f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x136f }
            r9.A03 = r5     // Catch:{ all -> 0x136f }
            r5 = r20
            X.0yW r5 = r5.A02     // Catch:{ all -> 0x136f }
            r5.Bly(r9)     // Catch:{ all -> 0x136f }
        L_0x0611:
            r5 = r20
            X.0v0 r7 = r5.A01     // Catch:{ all -> 0x136f }
            r6 = -1
            X.005 r12 = r7.A00     // Catch:{ all -> 0x136f }
            android.content.SharedPreferences r5 = X.C36391kE.A0H(r12)     // Catch:{ all -> 0x136f }
            java.lang.String r11 = "push:recent_push_transport"
            int r10 = r5.getInt(r11, r6)     // Catch:{ all -> 0x136f }
            r5 = 0
            android.content.SharedPreferences r9 = X.C36391kE.A0H(r12)     // Catch:{ all -> 0x136f }
            java.lang.String r8 = "push:recent_push_ts"
            long r18 = r9.getLong(r8, r5)     // Catch:{ all -> 0x136f }
            int r15 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x0634
            goto L_0x135b
        L_0x0634:
            android.content.SharedPreferences$Editor r5 = X.C90464aC.A0C(r12)     // Catch:{ all -> 0x136f }
            X.C36341k9.A0v(r5, r11, r13)     // Catch:{ all -> 0x136f }
            if (r15 == 0) goto L_0x064a
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x064a
            android.content.SharedPreferences$Editor r9 = X.C90464aC.A0C(r12)     // Catch:{ all -> 0x136f }
            r5 = r16
            X.C36341k9.A0w(r9, r8, r5)     // Catch:{ all -> 0x136f }
        L_0x064a:
            if (r71 != 0) goto L_0x065c
            r7.A1C(r4)     // Catch:{ all -> 0x136f }
            r5 = r20
            X.1YU r8 = r5.A08     // Catch:{ all -> 0x136f }
            r5 = 1
            r8.A01 = r5     // Catch:{ all -> 0x136f }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x136f }
            r8.A00 = r5     // Catch:{ all -> 0x136f }
        L_0x065c:
            java.lang.String r5 = "CLEAR"
            boolean r5 = r5.equalsIgnoreCase(r14)     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x0679
            r18 = 0
            android.content.SharedPreferences$Editor r6 = X.C19420v0.A00(r7)     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "mms_authority_override"
            r6.remove(r5)     // Catch:{ all -> 0x136f }
            r6.apply()     // Catch:{ all -> 0x136f }
        L_0x0672:
            boolean r5 = android.text.TextUtils.isEmpty(r42)     // Catch:{ all -> 0x136f }
            if (r5 != 0) goto L_0x071e
            goto L_0x06d4
        L_0x0679:
            r18 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x136f }
            if (r5 != 0) goto L_0x0672
            java.lang.String r5 = "\\|"
            r6 = 3
            java.lang.String[] r8 = r14.split(r5, r6)     // Catch:{ all -> 0x136f }
            int r5 = r8.length     // Catch:{ all -> 0x136f }
            if (r5 != r6) goto L_0x06ca
            r5 = 1
            r5 = r8[r5]     // Catch:{ NumberFormatException -> 0x06bc }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x06bc }
            r9 = 2
            r9 = r8[r9]     // Catch:{ NumberFormatException -> 0x06bc }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x06bc }
            long r5 = r5 + r9
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r9
            r8 = r8[r4]     // Catch:{ NumberFormatException -> 0x06bc }
            android.content.SharedPreferences$Editor r10 = X.C19420v0.A00(r7)     // Catch:{ NumberFormatException -> 0x06bc }
            java.lang.String r9 = "mms_authority_override"
            if (r8 == 0) goto L_0x06b8
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r8)     // Catch:{ NumberFormatException -> 0x06bc }
            java.lang.String r7 = "|"
            java.lang.String r5 = X.C36381kD.A0z(r7, r8, r5)     // Catch:{ NumberFormatException -> 0x06bc }
            r10.putString(r9, r5)     // Catch:{ NumberFormatException -> 0x06bc }
        L_0x06b4:
            r10.apply()     // Catch:{ NumberFormatException -> 0x06bc }
            goto L_0x0672
        L_0x06b8:
            r10.remove(r9)     // Catch:{ NumberFormatException -> 0x06bc }
            goto L_0x06b4
        L_0x06bc:
            r7 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "c2dm/mms_override/invalid_numbers:"
            r6.append(r5)     // Catch:{ all -> 0x136f }
            X.C36351kA.A1P(r14, r6, r7)     // Catch:{ all -> 0x136f }
            goto L_0x0672
        L_0x06ca:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "c2dm/mms_override/invalid_override:"
            X.C36321k7.A1R(r5, r14, r6)     // Catch:{ all -> 0x136f }
            goto L_0x0672
        L_0x06d4:
            r5 = r20
            X.1VT r10 = r5.A0A     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            char[] r9 = r42.toCharArray()     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            int r8 = r9.length     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            r5 = r8 & 1
            if (r5 != 0) goto L_0x070a
            int r5 = r8 >> 1
            byte[] r7 = new byte[r5]     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            r6 = 0
            r13 = 0
        L_0x06e7:
            if (r6 >= r8) goto L_0x0706
            char r5 = r9[r6]     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            r11 = 16
            int r5 = java.lang.Character.digit(r5, r11)     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            int r5 = r5 << 4
            int r12 = r6 + 1
            char r6 = r9[r12]     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            int r6 = java.lang.Character.digit(r6, r11)     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            r5 = r5 | r6
            int r6 = r12 + 1
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            r7[r13] = r5     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            int r13 = r13 + 1
            goto L_0x06e7
        L_0x0706:
            r10.A00(r7)     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            goto L_0x071e
        L_0x070a:
            java.lang.String r5 = "Odd number of characters."
            java.io.IOException r5 = X.C90524aI.A0X(r5)     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
            throw r5     // Catch:{ IOException -> 0x0718, IllegalArgumentException -> 0x0711 }
        L_0x0711:
            r6 = move-exception
            java.lang.String r5 = "GcmListenerService/handleGcmPush/routingInfo/failed to save edgeRoutingRoutingInfo, routing info is too big"
            com.whatsapp.util.Log.w(r5, r6)     // Catch:{ all -> 0x136f }
            goto L_0x071e
        L_0x0718:
            r6 = move-exception
            java.lang.String r5 = "GcmListenerService/handleGcmPush/routingInfo/failed to parse edgeRoutingRoutingInfo"
            com.whatsapp.util.Log.w(r5, r6)     // Catch:{ all -> 0x136f }
        L_0x071e:
            if (r60 == 0) goto L_0x072f
            r5 = r20
            X.1VO r7 = r5.A06     // Catch:{ all -> 0x136f }
            java.lang.String r6 = ","
            r5 = r23
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ all -> 0x136f }
            r7.A02(r5)     // Catch:{ all -> 0x136f }
        L_0x072f:
            r5 = r20
            X.5uY r5 = r5.A00     // Catch:{ all -> 0x136f }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x136f }
            X.1RU r6 = r5.A00     // Catch:{ all -> 0x136f }
            boolean r6 = r6.A0A()     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x12dd
            if (r2 == 0) goto L_0x12dd
            boolean r6 = r2 instanceof X.AnonymousClass5JL     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x074b
            r6 = r2
            X.5JL r6 = (X.AnonymousClass5JL) r6     // Catch:{ all -> 0x136f }
            java.lang.String r8 = r6.A01     // Catch:{ all -> 0x136f }
            goto L_0x0764
        L_0x074b:
            boolean r6 = r2 instanceof X.AnonymousClass5JM     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x0755
            r6 = r2
            X.5JM r6 = (X.AnonymousClass5JM) r6     // Catch:{ all -> 0x136f }
            java.lang.String r8 = r6.A04     // Catch:{ all -> 0x136f }
            goto L_0x0764
        L_0x0755:
            boolean r6 = r2 instanceof X.AnonymousClass5JK     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x075f
            r6 = r2
            X.5JK r6 = (X.AnonymousClass5JK) r6     // Catch:{ all -> 0x136f }
            java.lang.String r8 = r6.A01     // Catch:{ all -> 0x136f }
            goto L_0x0764
        L_0x075f:
            r6 = r2
            X.5JN r6 = (X.AnonymousClass5JN) r6     // Catch:{ all -> 0x136f }
            java.lang.String r8 = r6.A08     // Catch:{ all -> 0x136f }
        L_0x0764:
            if (r8 == 0) goto L_0x12dd
            int r6 = r8.length()     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x12dd
            java.lang.String r3 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x136f }
            X.1Z0 r3 = r5.A01     // Catch:{ all -> 0x136f }
            r52 = r3
            X.3KU r11 = r3.A03(r8)     // Catch:{ all -> 0x136f }
            if (r11 == 0) goto L_0x1365
            boolean r3 = r11.A03     // Catch:{ all -> 0x136f }
            if (r3 != 0) goto L_0x0798
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage/"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r11.A08     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)     // Catch:{ all -> 0x136f }
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " account logged out, ignoring notification"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x0798:
            java.lang.String r7 = r2.A00()     // Catch:{ all -> 0x136f }
            int r3 = r7.hashCode()     // Catch:{ all -> 0x136f }
            switch(r3) {
                case -1127809222: goto L_0x10da;
                case -395094592: goto L_0x1096;
                case -318861064: goto L_0x105a;
                case 239102022: goto L_0x1056;
                case 757346421: goto L_0x0fc0;
                case 954925063: goto L_0x07a5;
                case 1006153287: goto L_0x07af;
                default: goto L_0x07a3;
            }     // Catch:{ all -> 0x136f }
        L_0x07a3:
            goto L_0x1365
        L_0x07a5:
            java.lang.String r3 = "message"
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x136f }
            if (r3 != 0) goto L_0x07b7
            goto L_0x1365
        L_0x07af:
            java.lang.String r3 = "group_message"
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x1365
        L_0x07b7:
            X.6V1 r3 = r5.A02     // Catch:{ all -> 0x136f }
            r51 = r3
            if (r9 != 0) goto L_0x07c3
            X.0wo r3 = r5.A03     // Catch:{ all -> 0x136f }
            long r16 = X.C19970wo.A00(r3)     // Catch:{ all -> 0x136f }
        L_0x07c3:
            java.lang.String r3 = "InactiveAccountNotificationManager/processMessageNotification"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x136f }
            r3 = r51
            X.1Z0 r12 = r3.A01     // Catch:{ all -> 0x136f }
            X.3KU r19 = r12.A03(r8)     // Catch:{ all -> 0x136f }
            if (r19 == 0) goto L_0x0d7f
            boolean r3 = r2 instanceof X.AnonymousClass5JM     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x0d7f
            r50 = 0
            X.5JM r2 = (X.AnonymousClass5JM) r2     // Catch:{ all -> 0x136f }
            r3 = r51
            X.6On r3 = r3.A02     // Catch:{ all -> 0x136f }
            r40 = r3
            X.11F r3 = r2.A00     // Catch:{ all -> 0x136f }
            r39 = r3
            java.lang.String r10 = r39.getRawString()     // Catch:{ all -> 0x136f }
            r9 = 1
            X.AnonymousClass00C.A0D(r10, r9)     // Catch:{ all -> 0x136f }
            java.lang.String r22 = "message"
            java.lang.String r21 = "group_message"
            r5 = r22
            r3 = r21
            java.lang.String[] r6 = new java.lang.String[]{r5, r3}     // Catch:{ all -> 0x136f }
            r15 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x136f }
            r3 = r19
            java.lang.String r3 = r3.A08     // Catch:{ all -> 0x136f }
            r5[r4] = r3     // Catch:{ all -> 0x136f }
            java.lang.Object[] r6 = X.AnonymousClass02Q.A06(r5, r6)     // Catch:{ all -> 0x136f }
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x136f }
            r5[r4] = r10     // Catch:{ all -> 0x136f }
            java.lang.Object[] r10 = X.AnonymousClass02Q.A06(r6, r5)     // Catch:{ all -> 0x136f }
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x136f }
            r5 = r19
            long r5 = r5.A05     // Catch:{ all -> 0x136f }
            java.lang.String r23 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x136f }
            r9[r4] = r23     // Catch:{ all -> 0x136f }
            java.lang.Object[] r13 = X.AnonymousClass02Q.A06(r10, r9)     // Catch:{ all -> 0x136f }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x136f }
            r5 = r40
            X.005 r5 = r5.A00     // Catch:{ all -> 0x0892 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0892 }
            X.54Z r5 = (X.AnonymousClass54Z) r5     // Catch:{ all -> 0x0892 }
            X.1M0 r10 = r5.get()     // Catch:{ all -> 0x0892 }
            X.14e r9 = r10.A02     // Catch:{ all -> 0x088b }
            r14 = 2
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x088b }
            java.lang.String r5 = "SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN "
            X.C36351kA.A1O(r5, r6, r14)     // Catch:{ all -> 0x088b }
            java.lang.String r5 = " AND sender_jid = ? AND timestamp >= ?"
            java.lang.String r6 = X.AnonymousClass000.A0q(r5, r6)     // Catch:{ all -> 0x088b }
            java.lang.String r5 = "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE"
            android.database.Cursor r5 = r9.A09(r6, r5, r13)     // Catch:{ all -> 0x088b }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0884 }
            if (r6 > 0) goto L_0x084c
            r15 = 0
        L_0x084c:
            r5.close()     // Catch:{ all -> 0x088b }
            r10.close()     // Catch:{ all -> 0x0892 }
            if (r15 == 0) goto L_0x08a0
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x136f }
            r5 = r51
            X.0wo r5 = r5.A06     // Catch:{ all -> 0x136f }
            long r5 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x136f }
            r9 = r19
            long r9 = r9.A06     // Catch:{ all -> 0x136f }
            long r5 = r5 - r9
            long r13 = r13.toSeconds(r5)     // Catch:{ all -> 0x136f }
            java.lang.String r6 = r2.A03     // Catch:{ all -> 0x136f }
            r5 = r22
            boolean r5 = X.AnonymousClass00C.A0J(r6, r5)     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x0872
            goto L_0x087d
        L_0x0872:
            r5 = r21
            boolean r5 = X.AnonymousClass00C.A0J(r6, r5)     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x092c
            r9 = 120(0x78, double:5.93E-322)
            goto L_0x087f
        L_0x087d:
            r9 = 30
        L_0x087f:
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x092c
            goto L_0x08a0
        L_0x0884:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0886 }
        L_0x0886:
            r9 = move-exception
            X.C05600Qi.A00(r5, r6)     // Catch:{ all -> 0x088b }
            throw r9     // Catch:{ all -> 0x088b }
        L_0x088b:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x088d }
        L_0x088d:
            r6 = move-exception
            X.C05600Qi.A00(r10, r5)     // Catch:{ all -> 0x0892 }
            throw r6     // Catch:{ all -> 0x0892 }
        L_0x0892:
            r5 = move-exception
            X.03N r5 = X.C90524aI.A0t(r5)     // Catch:{ all -> 0x136f }
            java.lang.Throwable r6 = r5.exception     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x08a0
            java.lang.String r5 = "InactiveNotificationsStore/doesMessageSenderExist/failed"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ all -> 0x136f }
        L_0x08a0:
            r5 = r51
            X.0wo r5 = r5.A06     // Catch:{ all -> 0x136f }
            long r9 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "AccountSwitchingDataRepo/updateLastBuzzedTime/"
            X.C90464aC.A1H(r5, r3, r6)     // Catch:{ all -> 0x136f }
            java.lang.String r5 = "/lastBuzzedTimeMs:"
            X.C36321k7.A1V(r5, r6, r9)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            X.6C2 r15 = X.AnonymousClass1Z0.A00(r12)     // Catch:{ all -> 0x136f }
            java.util.List r6 = r15.A01     // Catch:{ all -> 0x136f }
            r5.addAll(r6)     // Catch:{ all -> 0x136f }
            boolean r6 = X.AnonymousClass1Z0.A02(r3, r5)     // Catch:{ all -> 0x136f }
            if (r6 != 0) goto L_0x08cf
            java.lang.String r5 = "AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x136f }
            goto L_0x092a
        L_0x08cf:
            java.util.ArrayList r14 = X.C36321k7.A0J(r5)     // Catch:{ all -> 0x136f }
            java.util.Iterator r24 = r5.iterator()     // Catch:{ all -> 0x136f }
        L_0x08d7:
            boolean r5 = r24.hasNext()     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x091c
            java.lang.Object r13 = r24.next()     // Catch:{ all -> 0x136f }
            X.3KU r13 = (X.AnonymousClass3KU) r13     // Catch:{ all -> 0x136f }
            java.lang.String r5 = r13.A08     // Catch:{ all -> 0x136f }
            r26 = r5
            boolean r5 = X.AnonymousClass00C.A0J(r5, r3)     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x0918
            java.lang.String r5 = r13.A07     // Catch:{ all -> 0x136f }
            r27 = r5
            java.lang.String r5 = r13.A09     // Catch:{ all -> 0x136f }
            r28 = r5
            int r5 = r13.A00     // Catch:{ all -> 0x136f }
            r29 = r5
            boolean r5 = r13.A03     // Catch:{ all -> 0x136f }
            r37 = r5
            boolean r5 = r13.A02     // Catch:{ all -> 0x136f }
            r38 = r5
            int r5 = r13.A01     // Catch:{ all -> 0x136f }
            r30 = r5
            long r5 = r13.A05     // Catch:{ all -> 0x136f }
            r33 = r5
            long r5 = r13.A04     // Catch:{ all -> 0x136f }
            X.3KU r13 = new X.3KU     // Catch:{ all -> 0x136f }
            r25 = r13
            r31 = r33
            r33 = r9
            r35 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r33, r35, r37, r38)     // Catch:{ all -> 0x136f }
        L_0x0918:
            r14.add(r13)     // Catch:{ all -> 0x136f }
            goto L_0x08d7
        L_0x091c:
            java.lang.String r9 = r15.A00     // Catch:{ all -> 0x136f }
            boolean r6 = r15.A03     // Catch:{ all -> 0x136f }
            boolean r10 = r15.A02     // Catch:{ all -> 0x136f }
            X.6C2 r5 = new X.6C2     // Catch:{ all -> 0x136f }
            r5.<init>(r9, r14, r6, r10)     // Catch:{ all -> 0x136f }
            X.AnonymousClass1Z0.A01(r5, r12)     // Catch:{ all -> 0x136f }
        L_0x092a:
            r50 = 1
        L_0x092c:
            java.lang.String r27 = r39.getRawString()     // Catch:{ all -> 0x136f }
            com.whatsapp.jid.GroupJid r5 = r2.A02     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x09aa
            java.lang.String r29 = r5.getRawString()     // Catch:{ all -> 0x136f }
        L_0x0938:
            java.lang.String r5 = r2.A05     // Catch:{ all -> 0x136f }
            X.11F r2 = r2.A01     // Catch:{ all -> 0x136f }
            if (r2 == 0) goto L_0x09a7
            java.lang.String r31 = r2.getRawString()     // Catch:{ all -> 0x136f }
        L_0x0942:
            r35 = 1
            X.6Ds r2 = new X.6Ds     // Catch:{ all -> 0x136f }
            r32 = 0
            r24 = r2
            r25 = r8
            r26 = r7
            r28 = r18
            r30 = r5
            r33 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)     // Catch:{ all -> 0x136f }
            r5 = r40
            r5.A01(r2)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r2 = "InactiveAccountNotificationManager/showMessageNotifications/"
            java.lang.String r2 = X.C90524aI.A0g(r2, r3, r5)     // Catch:{ all -> 0x136f }
            X.C36321k7.A1a(r5, r2)     // Catch:{ all -> 0x136f }
            r5 = 3
            r2 = r51
            X.0wG r2 = r2.A07     // Catch:{ all -> 0x136f }
            r25 = r2
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x136f }
            r24 = r2
            android.content.Intent r16 = X.AnonymousClass190.A1B(r2, r3, r5, r4)     // Catch:{ all -> 0x136f }
            r2 = r51
            X.6N4 r2 = r2.A04     // Catch:{ all -> 0x136f }
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            X.6Xy r8 = r2.A01     // Catch:{ all -> 0x136f }
            java.io.File r6 = X.C133346Xy.A00(r8, r3)     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x0a19
            boolean r5 = r6.exists()     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x0a19
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r7 = "chatsettings.db"
            java.io.File r5 = X.C90524aI.A0T(r5, r7)     // Catch:{ all -> 0x136f }
            X.12S r13 = r8.A02     // Catch:{ all -> 0x136f }
            X.11g r6 = r8.A01     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r5.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r10 = "ChatStore/getInactiveAccountMutedChatsList"
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            goto L_0x09ad
        L_0x09a7:
            r31 = r18
            goto L_0x0942
        L_0x09aa:
            r29 = r18
            goto L_0x0938
        L_0x09ad:
            r5 = r18
            android.database.sqlite.SQLiteDatabase r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r9, r5, r4)     // Catch:{ SQLiteException -> 0x0a33 }
            X.14e r15 = X.C224014d.A01(r9, r6, r13, r7)     // Catch:{ all -> 0x0a0d }
            java.lang.String r14 = "SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC"
            r5 = 3
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0a03 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0a03 }
            r7[r4] = r5     // Catch:{ SQLiteException -> 0x0a03 }
            r13 = 1
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0a03 }
            X.C36351kA.A1V(r7, r13, r5)     // Catch:{ SQLiteException -> 0x0a03 }
            r5 = 2
            X.C36351kA.A1V(r7, r5, r0)     // Catch:{ SQLiteException -> 0x0a03 }
            java.lang.String r0 = "GET_INACTIVE_ACCOUNT_MUTED_CHAT_JID_WITH_END_TIME_SORTED"
            android.database.Cursor r5 = r15.A09(r14, r0, r7)     // Catch:{ SQLiteException -> 0x0a03 }
            java.lang.String r0 = "jid"
            int r1 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x09f7 }
            java.lang.String r0 = "mute_end"
            r5.getColumnIndex(r0)     // Catch:{ all -> 0x09f7 }
        L_0x09df:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x09f7 }
            if (r0 == 0) goto L_0x09f3
            java.lang.String r0 = r5.getString(r1)     // Catch:{ all -> 0x09f7 }
            X.11F r0 = X.C36421kH.A0N(r0)     // Catch:{ all -> 0x09f7 }
            if (r0 == 0) goto L_0x09df
            r12.add(r0)     // Catch:{ all -> 0x09f7 }
            goto L_0x09df
        L_0x09f3:
            r5.close()     // Catch:{ SQLiteException -> 0x0a03 }
            goto L_0x0a07
        L_0x09f7:
            r0 = move-exception
            if (r5 == 0) goto L_0x0a02
            r5.close()     // Catch:{ all -> 0x09fe }
            goto L_0x0a02
        L_0x09fe:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0a03 }
        L_0x0a02:
            throw r0     // Catch:{ SQLiteException -> 0x0a03 }
        L_0x0a03:
            r0 = move-exception
            com.whatsapp.util.Log.e(r10, r0)     // Catch:{ all -> 0x0a0d }
        L_0x0a07:
            if (r9 == 0) goto L_0x0a37
            r9.close()     // Catch:{ SQLiteException -> 0x0a33 }
            goto L_0x0a37
        L_0x0a0d:
            r0 = move-exception
            if (r9 == 0) goto L_0x0a18
            r9.close()     // Catch:{ all -> 0x0a14 }
            goto L_0x0a18
        L_0x0a14:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0a33 }
        L_0x0a18:
            throw r0     // Catch:{ SQLiteException -> 0x0a33 }
        L_0x0a19:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/account "
            X.C90464aC.A1H(r0, r3, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " databases dir does not exist"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/stagingDirLogString/"
            X.C90464aC.A13(r8, r0, r1)     // Catch:{ all -> 0x136f }
            X.09w r12 = X.C023409w.A00     // Catch:{ all -> 0x136f }
            goto L_0x0a37
        L_0x0a33:
            r0 = move-exception
            com.whatsapp.util.Log.e(r10, r0)     // Catch:{ all -> 0x136f }
        L_0x0a37:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.Iterator r5 = r12.iterator()     // Catch:{ all -> 0x136f }
        L_0x0a43:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x0a4d
            A00(r1, r0, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0a43
        L_0x0a4d:
            X.011 r0 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.Object r14 = r0.first     // Catch:{ all -> 0x136f }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x136f }
            java.lang.Object r12 = r0.second     // Catch:{ all -> 0x136f }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x136f }
            java.io.File r1 = X.C133346Xy.A00(r8, r3)     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0acf
            boolean r0 = r1.exists()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0acf
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r6 = "msgstore.db"
            java.io.File r0 = X.C90524aI.A0T(r0, r6)     // Catch:{ all -> 0x136f }
            X.12S r5 = r8.A02     // Catch:{ all -> 0x136f }
            X.11g r1 = r8.A01     // Catch:{ all -> 0x136f }
            java.lang.String r10 = r0.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r7 = "ChatStore/getInactiveAccountArchivedChatsList"
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            r0 = r18
            android.database.sqlite.SQLiteDatabase r10 = android.database.sqlite.SQLiteDatabase.openDatabase(r10, r0, r4)     // Catch:{ SQLiteException -> 0x0ae9 }
            X.14e r6 = X.C224014d.A01(r10, r1, r5, r6)     // Catch:{ all -> 0x0ac3 }
            java.lang.String r5 = "SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE archived = 1"
            java.lang.String r1 = "GET_INACTIVE_ACCOUNT_ARCHIVED_CHAT_JID"
            android.database.Cursor r5 = r6.A09(r5, r1, r0)     // Catch:{ SQLiteException -> 0x0ab9 }
            java.lang.String r0 = "raw_string"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0aad }
        L_0x0a95:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0aad }
            if (r0 == 0) goto L_0x0aa9
            java.lang.String r0 = r5.getString(r1)     // Catch:{ all -> 0x0aad }
            X.11F r0 = X.C36421kH.A0N(r0)     // Catch:{ all -> 0x0aad }
            if (r0 == 0) goto L_0x0a95
            r9.add(r0)     // Catch:{ all -> 0x0aad }
            goto L_0x0a95
        L_0x0aa9:
            r5.close()     // Catch:{ SQLiteException -> 0x0ab9 }
            goto L_0x0abd
        L_0x0aad:
            r0 = move-exception
            if (r5 == 0) goto L_0x0ab8
            r5.close()     // Catch:{ all -> 0x0ab4 }
            goto L_0x0ab8
        L_0x0ab4:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0ab9 }
        L_0x0ab8:
            throw r0     // Catch:{ SQLiteException -> 0x0ab9 }
        L_0x0ab9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x0ac3 }
        L_0x0abd:
            if (r10 == 0) goto L_0x0aed
            r10.close()     // Catch:{ SQLiteException -> 0x0ae9 }
            goto L_0x0aed
        L_0x0ac3:
            r0 = move-exception
            if (r10 == 0) goto L_0x0ace
            r10.close()     // Catch:{ all -> 0x0aca }
            goto L_0x0ace
        L_0x0aca:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0ae9 }
        L_0x0ace:
            throw r0     // Catch:{ SQLiteException -> 0x0ae9 }
        L_0x0acf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/account "
            X.C90464aC.A1H(r0, r3, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " databases dir does not exist"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/stagingDirLogString/"
            X.C90464aC.A13(r8, r0, r1)     // Catch:{ all -> 0x136f }
            X.09w r9 = X.C023409w.A00     // Catch:{ all -> 0x136f }
            goto L_0x0aed
        L_0x0ae9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x136f }
        L_0x0aed:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.Iterator r5 = r9.iterator()     // Catch:{ all -> 0x136f }
        L_0x0af9:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x0b03
            A00(r1, r0, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0af9
        L_0x0b03:
            X.011 r0 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.Object r10 = r0.first     // Catch:{ all -> 0x136f }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x136f }
            java.lang.Object r9 = r0.second     // Catch:{ all -> 0x136f }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x136f }
            java.io.File r1 = X.C133346Xy.A00(r8, r3)     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0b85
            boolean r0 = r1.exists()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0b85
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r1 = "msgstore.db"
            java.io.File r0 = X.C90524aI.A0T(r0, r1)     // Catch:{ all -> 0x136f }
            X.12S r13 = r8.A02     // Catch:{ all -> 0x136f }
            X.11g r5 = r8.A01     // Catch:{ all -> 0x136f }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ all -> 0x136f }
            java.lang.String r7 = "ChatStore/getInactiveAccountLockedChatsList"
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            r0 = r18
            android.database.sqlite.SQLiteDatabase r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r6, r0, r4)     // Catch:{ SQLiteException -> 0x0b9f }
            X.14e r13 = X.C224014d.A01(r6, r5, r13, r1)     // Catch:{ all -> 0x0b79 }
            java.lang.String r5 = "SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE chat_lock > 0"
            java.lang.String r1 = "GET_INACTIVE_ACCOUNT_LOCKED_CHAT_JID"
            android.database.Cursor r5 = r13.A09(r5, r1, r0)     // Catch:{ SQLiteException -> 0x0b6f }
            java.lang.String r0 = "raw_string"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0b63 }
        L_0x0b4b:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0b63 }
            if (r0 == 0) goto L_0x0b5f
            java.lang.String r0 = r5.getString(r1)     // Catch:{ all -> 0x0b63 }
            X.11F r0 = X.C36421kH.A0N(r0)     // Catch:{ all -> 0x0b63 }
            if (r0 == 0) goto L_0x0b4b
            r8.add(r0)     // Catch:{ all -> 0x0b63 }
            goto L_0x0b4b
        L_0x0b5f:
            r5.close()     // Catch:{ SQLiteException -> 0x0b6f }
            goto L_0x0b73
        L_0x0b63:
            r0 = move-exception
            if (r5 == 0) goto L_0x0b6e
            r5.close()     // Catch:{ all -> 0x0b6a }
            goto L_0x0b6e
        L_0x0b6a:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0b6f }
        L_0x0b6e:
            throw r0     // Catch:{ SQLiteException -> 0x0b6f }
        L_0x0b6f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x0b79 }
        L_0x0b73:
            if (r6 == 0) goto L_0x0ba3
            r6.close()     // Catch:{ SQLiteException -> 0x0b9f }
            goto L_0x0ba3
        L_0x0b79:
            r0 = move-exception
            if (r6 == 0) goto L_0x0b84
            r6.close()     // Catch:{ all -> 0x0b80 }
            goto L_0x0b84
        L_0x0b80:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLiteException -> 0x0b9f }
        L_0x0b84:
            throw r0     // Catch:{ SQLiteException -> 0x0b9f }
        L_0x0b85:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/account "
            X.C90464aC.A1H(r0, r3, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = " databases dir does not exist"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/stagingDirLogString/"
            X.C90464aC.A13(r8, r0, r1)     // Catch:{ all -> 0x136f }
            X.09w r8 = X.C023409w.A00     // Catch:{ all -> 0x136f }
            goto L_0x0ba3
        L_0x0b9f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r7, r0)     // Catch:{ all -> 0x136f }
        L_0x0ba3:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x136f }
        L_0x0baf:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x136f }
            if (r6 == 0) goto L_0x0bb9
            A00(r1, r0, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0baf
        L_0x0bb9:
            X.011 r0 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x136f }
            java.lang.Object r5 = r0.first     // Catch:{ all -> 0x136f }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x136f }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x136f }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.C36351kA.A0z(r14)     // Catch:{ all -> 0x136f }
            java.util.Iterator r6 = r14.iterator()     // Catch:{ all -> 0x136f }
        L_0x0bcd:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x136f }
            if (r7 == 0) goto L_0x0bd7
            X.C90464aC.A1U(r0, r6)     // Catch:{ all -> 0x136f }
            goto L_0x0bcd
        L_0x0bd7:
            java.util.ArrayList r6 = X.C36351kA.A0z(r10)     // Catch:{ all -> 0x136f }
            java.util.Iterator r7 = r10.iterator()     // Catch:{ all -> 0x136f }
        L_0x0bdf:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x136f }
            if (r8 == 0) goto L_0x0be9
            X.C90464aC.A1U(r6, r7)     // Catch:{ all -> 0x136f }
            goto L_0x0bdf
        L_0x0be9:
            java.util.ArrayList r6 = X.C007103b.A0S(r6, r0)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.C36351kA.A0z(r5)     // Catch:{ all -> 0x136f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x136f }
        L_0x0bf5:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x136f }
            if (r7 == 0) goto L_0x0bff
            X.C90464aC.A1U(r0, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0bf5
        L_0x0bff:
            java.util.ArrayList r5 = X.C007103b.A0S(r0, r6)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = X.C36351kA.A0z(r12)     // Catch:{ all -> 0x136f }
            java.util.Iterator r6 = r12.iterator()     // Catch:{ all -> 0x136f }
        L_0x0c0b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x136f }
            if (r7 == 0) goto L_0x0c15
            X.C90464aC.A1U(r0, r6)     // Catch:{ all -> 0x136f }
            goto L_0x0c0b
        L_0x0c15:
            java.util.ArrayList r6 = X.C36351kA.A0z(r9)     // Catch:{ all -> 0x136f }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x136f }
        L_0x0c1d:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x136f }
            if (r8 == 0) goto L_0x0c27
            X.C90464aC.A1U(r6, r7)     // Catch:{ all -> 0x136f }
            goto L_0x0c1d
        L_0x0c27:
            java.util.ArrayList r7 = X.C007103b.A0S(r6, r0)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r6 = X.C36351kA.A0z(r1)     // Catch:{ all -> 0x136f }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x136f }
        L_0x0c33:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0c3d
            X.C90464aC.A1U(r6, r0)     // Catch:{ all -> 0x136f }
            goto L_0x0c33
        L_0x0c3d:
            java.util.ArrayList r6 = X.C007103b.A0S(r6, r7)     // Catch:{ all -> 0x136f }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x136f }
            java.lang.Object[] r1 = r5.toArray(r0)     // Catch:{ all -> 0x136f }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x136f }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x136f }
            X.011 r0 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x136f }
            X.6On r5 = r2.A02     // Catch:{ all -> 0x136f }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x136f }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x136f }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x136f }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x136f }
            monitor-enter(r5)     // Catch:{ all -> 0x136f }
            r8 = 1
            X.C36321k7.A0v(r1, r8, r0)     // Catch:{ all -> 0x1367 }
            java.lang.String r6 = "InactiveNotificationsStore/readAllUnreadMessageNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x1367 }
            r6 = r22
            r7 = r21
            java.lang.String[] r7 = new java.lang.String[]{r6, r7}     // Catch:{ all -> 0x1367 }
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ all -> 0x1367 }
            r6[r4] = r3     // Catch:{ all -> 0x1367 }
            java.lang.Object[] r6 = X.AnonymousClass02Q.A06(r6, r7)     // Catch:{ all -> 0x1367 }
            java.lang.Object[] r6 = X.AnonymousClass02Q.A06(r6, r1)     // Catch:{ all -> 0x1367 }
            java.lang.Object[] r6 = X.AnonymousClass02Q.A06(r6, r0)     // Catch:{ all -> 0x1367 }
            java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ all -> 0x1367 }
            r7[r4] = r23     // Catch:{ all -> 0x1367 }
            java.lang.Object[] r10 = X.AnonymousClass02Q.A06(r6, r7)     // Catch:{ all -> 0x1367 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x1367 }
            X.005 r6 = r5.A00     // Catch:{ all -> 0x0d54 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0d54 }
            X.54Z r6 = (X.AnonymousClass54Z) r6     // Catch:{ all -> 0x0d54 }
            X.1M0 r6 = r6.get()     // Catch:{ all -> 0x0d54 }
            X.14e r9 = r6.A02     // Catch:{ all -> 0x0d4d }
            int r12 = r1.length     // Catch:{ all -> 0x0d4d }
            int r8 = r0.length     // Catch:{ all -> 0x0d4d }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = "SELECT account_lid, notification_type, sender_jid, timestamp, group_jid, display_name, count, sender_pn_jid FROM notifications WHERE account_lid = ? AND notification_type IN (?,?) AND "
            java.lang.StringBuilder r1 = X.C90484aE.A0q(r0, r7)     // Catch:{ all -> 0x0d4d }
            if (r12 <= 0) goto L_0x0cb2
            java.lang.String r0 = "CASE WHEN group_jid IS NULL OR group_jid == '' "
            r1.append(r0)     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = "THEN sender_jid NOT IN "
            X.C36351kA.A1O(r0, r1, r12)     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = "ELSE 1 END AND "
            r1.append(r0)     // Catch:{ all -> 0x0d4d }
        L_0x0cb2:
            if (r8 <= 0) goto L_0x0cbe
            java.lang.String r0 = "group_jid NOT IN "
            X.C36351kA.A1O(r0, r1, r8)     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0d4d }
        L_0x0cbe:
            java.lang.String r0 = X.C36381kD.A0y(r1)     // Catch:{ all -> 0x0d4d }
            r7.append(r0)     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = "timestamp >= ? ORDER BY timestamp DESC"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r7)     // Catch:{ all -> 0x0d4d }
            java.lang.String r0 = "GET_ALL_MSG_AND_GROUP_MSG_NOTIFICATIONS_SQL"
            android.database.Cursor r0 = r9.A09(r1, r0, r10)     // Catch:{ all -> 0x0d4d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0d4d }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "account_lid"
            int r23 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "notification_type"
            int r15 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "sender_jid"
            int r14 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "timestamp"
            int r13 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "group_jid"
            int r12 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "display_name"
            int r10 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "count"
            int r9 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r7 = "sender_pn_jid"
            int r8 = r0.getColumnIndex(r7)     // Catch:{ all -> 0x0d46 }
        L_0x0d08:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x0d46 }
            if (r7 == 0) goto L_0x0d3f
            r7 = r23
            java.lang.String r38 = X.C90494aF.A0Z(r0, r7)     // Catch:{ all -> 0x0d46 }
            java.lang.String r39 = X.C90494aF.A0Z(r0, r15)     // Catch:{ all -> 0x0d46 }
            java.lang.String r40 = X.C90494aF.A0Z(r0, r14)     // Catch:{ all -> 0x0d46 }
            long r46 = r0.getLong(r13)     // Catch:{ all -> 0x0d46 }
            java.lang.String r42 = r0.getString(r12)     // Catch:{ all -> 0x0d46 }
            java.lang.String r43 = r0.getString(r10)     // Catch:{ all -> 0x0d46 }
            long r48 = r0.getLong(r9)     // Catch:{ all -> 0x0d46 }
            java.lang.String r44 = r0.getString(r8)     // Catch:{ all -> 0x0d46 }
            X.6Ds r7 = new X.6Ds     // Catch:{ all -> 0x0d46 }
            r45 = 0
            r37 = r7
            r41 = r18
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r48)     // Catch:{ all -> 0x0d46 }
            r1.add(r7)     // Catch:{ all -> 0x0d46 }
            goto L_0x0d08
        L_0x0d3f:
            r0.close()     // Catch:{ all -> 0x0d4d }
            r6.close()     // Catch:{ all -> 0x0d54 }
            goto L_0x0d59
        L_0x0d46:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d48 }
        L_0x0d48:
            r7 = move-exception
            X.C05600Qi.A00(r0, r1)     // Catch:{ all -> 0x0d4d }
            throw r7     // Catch:{ all -> 0x0d4d }
        L_0x0d4d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0d4f }
        L_0x0d4f:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)     // Catch:{ all -> 0x0d54 }
            throw r1     // Catch:{ all -> 0x0d54 }
        L_0x0d54:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x1367 }
        L_0x0d59:
            java.lang.Throwable r6 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x1367 }
            if (r6 == 0) goto L_0x0d64
            java.lang.String r0 = "InactiveNotificationsStore/readAllUnreadMessageNotifications/failed"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x1367 }
        L_0x0d64:
            X.09w r6 = X.C023409w.A00     // Catch:{ all -> 0x1367 }
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x1367 }
            if (r0 == 0) goto L_0x0d6b
            r1 = r6
        L_0x0d6b:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x1367 }
            monitor-exit(r5)     // Catch:{ all -> 0x136f }
            r0 = r19
            java.util.ArrayList r23 = X.AnonymousClass6N4.A00(r0, r2, r1)     // Catch:{ all -> 0x136f }
            boolean r0 = r23.isEmpty()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0da8
            java.lang.String r0 = "InactiveAccountNotificationManager/showMessageNotifications/empty notificationsTextPair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
        L_0x0d7f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/"
            r1.append(r0)     // Catch:{ all -> 0x136f }
            java.lang.String r3 = r11.A08     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r3)     // Catch:{ all -> 0x136f }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            X.6C2 r7 = X.AnonymousClass1Z0.A00(r52)     // Catch:{ all -> 0x136f }
            java.util.List r0 = r7.A01     // Catch:{ all -> 0x136f }
            r6.addAll(r0)     // Catch:{ all -> 0x136f }
            boolean r0 = X.AnonymousClass1Z0.A02(r3, r6)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0f13
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Account doesn't exists"
            goto L_0x101e
        L_0x0da8:
            java.util.Iterator r15 = r23.iterator()     // Catch:{ all -> 0x136f }
        L_0x0dac:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x136f }
            r5 = 1
            if (r0 == 0) goto L_0x0e88
            java.lang.Object r6 = r15.next()     // Catch:{ all -> 0x136f }
            X.6DT r6 = (X.AnonymousClass6DT) r6     // Catch:{ all -> 0x136f }
            java.lang.String r1 = r6.A05     // Catch:{ all -> 0x136f }
            r0 = r22
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0df4
            X.0wG r0 = r2.A04     // Catch:{ all -> 0x136f }
            android.content.res.Resources r10 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x136f }
            r8 = 2131755244(0x7f1000ec, float:1.9141362E38)
            long r0 = r6.A00     // Catch:{ all -> 0x136f }
            int r7 = (int) r0     // Catch:{ all -> 0x136f }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r6.A04     // Catch:{ all -> 0x136f }
            r0[r4] = r9     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r10.getQuantityString(r8, r7, r0)     // Catch:{ all -> 0x136f }
        L_0x0dd9:
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x136f }
            int r7 = r9.length()     // Catch:{ all -> 0x136f }
            android.text.SpannableString r6 = X.C36441kJ.A0O(r0)     // Catch:{ all -> 0x136f }
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan     // Catch:{ all -> 0x136f }
            r1.<init>(r5)     // Catch:{ all -> 0x136f }
            r0 = 33
            r6.setSpan(r1, r4, r7, r0)     // Catch:{ all -> 0x136f }
            r0 = r17
            r0.add(r6)     // Catch:{ all -> 0x136f }
            goto L_0x0dac
        L_0x0df4:
            r0 = r21
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0e7d
            long r0 = r6.A01     // Catch:{ all -> 0x136f }
            r7 = 2
            int r8 = (r0 > r35 ? 1 : (r0 == r35 ? 0 : -1))
            if (r8 != 0) goto L_0x0e1e
            X.0wG r0 = r2.A04     // Catch:{ all -> 0x136f }
            android.content.res.Resources r12 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x136f }
            r10 = 2131755245(0x7f1000ed, float:1.9141364E38)
            long r0 = r6.A00     // Catch:{ all -> 0x136f }
            int r8 = (int) r0     // Catch:{ all -> 0x136f }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r6.A04     // Catch:{ all -> 0x136f }
            r0[r4] = r9     // Catch:{ all -> 0x136f }
            java.lang.String r1 = r6.A02     // Catch:{ all -> 0x136f }
            r0[r5] = r1     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r12.getQuantityString(r10, r8, r0)     // Catch:{ all -> 0x136f }
            goto L_0x0dd9
        L_0x0e1e:
            r12 = 2
            r9 = 3
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x0e3d
            X.0wG r10 = r2.A04     // Catch:{ all -> 0x136f }
            r8 = 2131891756(0x7f12162c, float:1.9418241E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r6.A04     // Catch:{ all -> 0x136f }
            r1[r4] = r9     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x136f }
            r1[r5] = r0     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x136f }
            r1[r7] = r0     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r10.A02(r8, r1)     // Catch:{ all -> 0x136f }
            goto L_0x0dd9
        L_0x0e3d:
            X.0wG r14 = r2.A04     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r13 = 2131891755(0x7f12162b, float:1.941824E38)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            java.lang.String r10 = r6.A04     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r8[r4] = r10     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            java.lang.String r12 = r6.A02     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r8[r5] = r12     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            java.lang.String r6 = r6.A03     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r8[r7] = r6     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            long r6 = (long) r7     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            long r0 = r0 - r6
            X.AnonymousClass000.A1M(r8, r9, r0)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            java.lang.String r0 = r14.A02(r13, r8)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            int r7 = r10.length()     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            android.text.SpannableString r6 = X.C36441kJ.A0O(r0)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r1.<init>(r5)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r0 = 33
            r6.setSpan(r1, r4, r7, r0)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            r0 = r17
            r0.add(r6)     // Catch:{ IllegalFormatConversionException -> 0x0e76 }
            goto L_0x0dac
        L_0x0e76:
            java.lang.String r0 = "NotificationUiBuilder/getNotificationTextForMessages/error in string resource"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x0dac
        L_0x0e7d:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "NotificationUiBuilder/getNotificationTextForMessages/unknown message type/"
            X.C36321k7.A1P(r0, r1, r5)     // Catch:{ all -> 0x136f }
            goto L_0x0dac
        L_0x0e88:
            int r0 = r23.size()     // Catch:{ all -> 0x136f }
            if (r0 != r5) goto L_0x0ef8
            r0 = r23
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x136f }
            X.6DT r0 = (X.AnonymousClass6DT) r0     // Catch:{ all -> 0x136f }
            long r0 = r0.A00     // Catch:{ all -> 0x136f }
            int r6 = (r0 > r35 ? 1 : (r0 == r35 ? 0 : -1))
            if (r6 != 0) goto L_0x0ef8
            X.0wG r2 = r2.A04     // Catch:{ all -> 0x136f }
            r1 = 2131891757(0x7f12162d, float:1.9418243E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x136f }
            X.AnonymousClass000.A1L(r0, r5, r4)     // Catch:{ all -> 0x136f }
            java.lang.String r1 = r2.A02(r1, r0)     // Catch:{ all -> 0x136f }
        L_0x0eaa:
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x136f }
            r0 = r17
            X.011 r6 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x136f }
            X.5Tb r1 = X.C108325Tb.MESSAGES     // Catch:{ all -> 0x136f }
            r0 = r51
            X.3S9 r2 = r0.A03     // Catch:{ all -> 0x136f }
            java.lang.String r46 = X.AnonymousClass6V1.A00(r1, r3)     // Catch:{ all -> 0x136f }
            r1 = r0
            r0 = r19
            java.lang.String r47 = r1.A03(r0)     // Catch:{ all -> 0x136f }
            java.lang.Object r5 = r6.second     // Catch:{ all -> 0x136f }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x136f }
            java.lang.Object r3 = r6.first     // Catch:{ all -> 0x136f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x136f }
            r1 = 2131886327(0x7f1200f7, float:1.940723E38)
            r0 = r25
            java.lang.String r6 = r0.A01(r1)     // Catch:{ all -> 0x136f }
            r1 = r24
            r0 = r16
            android.app.PendingIntent r1 = X.C65743Th.A03(r1, r0, r4)     // Catch:{ all -> 0x136f }
            X.0Wx r0 = new X.0Wx     // Catch:{ all -> 0x136f }
            r0.<init>(r4, r6, r1)     // Catch:{ all -> 0x136f }
            r43 = r2
            r44 = r16
            r45 = r0
            r48 = r3
            r49 = r5
            r43.A04(r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x136f }
            r1 = r19
            r0 = r51
            X.AnonymousClass6V1.A02(r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x0d7f
        L_0x0ef8:
            X.0wG r0 = r2.A04     // Catch:{ all -> 0x136f }
            android.content.res.Resources r7 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x136f }
            r6 = 2131755246(0x7f1000ee, float:1.9141366E38)
            int r2 = r23.size()     // Catch:{ all -> 0x136f }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x136f }
            int r0 = r23.size()     // Catch:{ all -> 0x136f }
            X.AnonymousClass000.A1L(r1, r0, r4)     // Catch:{ all -> 0x136f }
            java.lang.String r1 = r7.getQuantityString(r6, r2, r1)     // Catch:{ all -> 0x136f }
            goto L_0x0eaa
        L_0x0f13:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x136f }
        L_0x0f17:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x136f }
            r5 = 0
            if (r0 == 0) goto L_0x0f55
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x136f }
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r0.A08     // Catch:{ all -> 0x136f }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0f17
        L_0x0f2d:
            X.3KU r1 = (X.AnonymousClass3KU) r1     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x0f53
            int r0 = r1.A01     // Catch:{ all -> 0x136f }
            int r0 = r0 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x136f }
        L_0x0f39:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x136f }
        L_0x0f3d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0f58
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x136f }
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r0.A08     // Catch:{ all -> 0x136f }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x0f3d
            goto L_0x0f57
        L_0x0f53:
            r8 = r5
            goto L_0x0f39
        L_0x0f55:
            r1 = r5
            goto L_0x0f2d
        L_0x0f57:
            r5 = r1
        L_0x0f58:
            X.3KU r5 = (X.AnonymousClass3KU) r5     // Catch:{ all -> 0x136f }
            if (r5 == 0) goto L_0x0f67
            if (r8 == 0) goto L_0x0f5f
            goto L_0x0f61
        L_0x0f5f:
            r0 = 0
            goto L_0x0f65
        L_0x0f61:
            int r0 = r8.intValue()     // Catch:{ all -> 0x136f }
        L_0x0f65:
            r5.A01 = r0     // Catch:{ all -> 0x136f }
        L_0x0f67:
            java.lang.String r5 = r7.A00     // Catch:{ all -> 0x136f }
            boolean r2 = r7.A03     // Catch:{ all -> 0x136f }
            boolean r0 = r7.A02     // Catch:{ all -> 0x136f }
            X.6C2 r1 = new X.6C2     // Catch:{ all -> 0x136f }
            r1.<init>(r5, r6, r2, r0)     // Catch:{ all -> 0x136f }
            r0 = r52
            boolean r0 = X.AnonymousClass1Z0.A01(r1, r0)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x0f81
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/Failed to update inactiveAccounts"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x0f81:
            if (r8 == 0) goto L_0x1365
            int r1 = r8.intValue()     // Catch:{ all -> 0x136f }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x1365
            java.lang.String r0 = "InactiveAccountNotificationManager/showOfflineMessagesCountWarning"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            r0 = r51
            X.3S9 r1 = r0.A03     // Catch:{ all -> 0x136f }
            X.5Tb r0 = X.C108325Tb.UNREAD_MSG_LIMIT     // Catch:{ all -> 0x136f }
            java.lang.String r6 = X.AnonymousClass6V1.A00(r0, r3)     // Catch:{ all -> 0x136f }
            r0 = r51
            java.lang.String r7 = r0.A03(r11)     // Catch:{ all -> 0x136f }
            X.0wG r2 = r0.A07     // Catch:{ all -> 0x136f }
            r0 = 2131886311(0x7f1200e7, float:1.9407197E38)
            java.lang.String r5 = X.C36371kC.A0v(r2, r0)     // Catch:{ all -> 0x136f }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x136f }
            r0 = 11
            android.content.Intent r3 = X.AnonymousClass190.A1B(r2, r3, r0, r4)     // Catch:{ all -> 0x136f }
            r8 = 2131231578(0x7f08035a, float:1.807924E38)
            r9 = 11
            r10 = 0
            r11 = 0
            r2 = r1
            r4 = r18
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x0fc0:
            java.lang.String r0 = "post_reg"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1365
            X.6V1 r2 = r5.A02     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPostRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            X.3S9 r3 = r2.A03     // Catch:{ all -> 0x136f }
            java.lang.String r1 = r11.A08     // Catch:{ all -> 0x136f }
            X.5Tb r0 = X.C108325Tb.REGISTRATION     // Catch:{ all -> 0x136f }
            java.lang.String r9 = X.AnonymousClass6V1.A00(r0, r1)     // Catch:{ all -> 0x136f }
            java.lang.String r10 = r2.A03(r11)     // Catch:{ all -> 0x136f }
            X.0wG r2 = r2.A07     // Catch:{ all -> 0x136f }
            r0 = 2131891731(0x7f121613, float:1.941819E38)
            java.lang.String r8 = X.C36371kC.A0v(r2, r0)     // Catch:{ all -> 0x136f }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x136f }
            r0 = 10
            android.content.Intent r6 = X.AnonymousClass190.A1B(r2, r1, r0, r4)     // Catch:{ all -> 0x136f }
            r13 = 1
            r11 = 2131231578(0x7f08035a, float:1.807924E38)
            r12 = 10
            r14 = 1
            r5 = r3
            r7 = r18
            r5.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/"
            X.C90464aC.A1H(r0, r1, r2)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "/isLoggedIn/"
            X.C36321k7.A1X(r0, r2, r4)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x136f }
            X.6C2 r6 = X.AnonymousClass1Z0.A00(r52)     // Catch:{ all -> 0x136f }
            java.util.List r0 = r6.A01     // Catch:{ all -> 0x136f }
            r5.addAll(r0)     // Catch:{ all -> 0x136f }
            boolean r0 = X.AnonymousClass1Z0.A02(r1, r5)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x1023
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/Account doesn't exists"
        L_0x101e:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x1023:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x136f }
        L_0x1027:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1054
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x136f }
            r0 = r2
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r0.A08     // Catch:{ all -> 0x136f }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1027
        L_0x103c:
            X.3KU r2 = (X.AnonymousClass3KU) r2     // Catch:{ all -> 0x136f }
            if (r2 == 0) goto L_0x1042
            r2.A03 = r4     // Catch:{ all -> 0x136f }
        L_0x1042:
            java.lang.String r3 = r6.A00     // Catch:{ all -> 0x136f }
            boolean r2 = r6.A03     // Catch:{ all -> 0x136f }
            boolean r0 = r6.A02     // Catch:{ all -> 0x136f }
            X.6C2 r1 = new X.6C2     // Catch:{ all -> 0x136f }
            r1.<init>(r3, r5, r2, r0)     // Catch:{ all -> 0x136f }
            r0 = r52
            X.AnonymousClass1Z0.A01(r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x1054:
            r2 = 0
            goto L_0x103c
        L_0x1056:
            java.lang.String r0 = "voip_call_offer_1on1"
            goto L_0x10dc
        L_0x105a:
            java.lang.String r0 = "pre_reg"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1365
            X.6V1 r1 = r5.A02     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPreRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            X.3S9 r2 = r1.A03     // Catch:{ all -> 0x136f }
            java.lang.String r3 = r11.A08     // Catch:{ all -> 0x136f }
            X.5Tb r0 = X.C108325Tb.REGISTRATION     // Catch:{ all -> 0x136f }
            java.lang.String r6 = X.AnonymousClass6V1.A00(r0, r3)     // Catch:{ all -> 0x136f }
            java.lang.String r7 = r1.A03(r11)     // Catch:{ all -> 0x136f }
            X.0wG r1 = r1.A07     // Catch:{ all -> 0x136f }
            r0 = 2131891735(0x7f121617, float:1.9418198E38)
            java.lang.String r5 = X.C36371kC.A0v(r1, r0)     // Catch:{ all -> 0x136f }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x136f }
            r0 = 9
            android.content.Intent r3 = X.AnonymousClass190.A1B(r1, r3, r0, r4)     // Catch:{ all -> 0x136f }
            r10 = 1
            r8 = 2131231578(0x7f08035a, float:1.807924E38)
            r9 = 9
            r11 = 1
            r4 = r18
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x1096:
            java.lang.String r0 = "call_terminate"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1365
            X.6V1 r3 = r5.A02     // Catch:{ all -> 0x136f }
            X.5JN r2 = (X.AnonymousClass5JN) r2     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A0D(r2, r4)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/terminateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            java.lang.String r4 = r2.A08     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x136f }
            java.lang.String r5 = r2.A06     // Catch:{ all -> 0x136f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ all -> 0x136f }
            X.5Tb r0 = X.C108325Tb.RINGING_CALL     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass6V1.A00(r0, r4)     // Catch:{ all -> 0x136f }
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x136f }
            X.0yb r0 = r3.A05     // Catch:{ all -> 0x136f }
            android.app.NotificationManager r1 = r0.A07()     // Catch:{ all -> 0x136f }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x136f }
            r0 = 64
            r1.cancel(r2, r0)     // Catch:{ all -> 0x136f }
            X.0zS r0 = r3.A08     // Catch:{ all -> 0x136f }
            X.6VR r0 = X.C90514aH.A0V(r0)     // Catch:{ all -> 0x136f }
            r0.A0A(r2)     // Catch:{ all -> 0x136f }
            if (r4 == 0) goto L_0x1365
            goto L_0x11aa
        L_0x10da:
            java.lang.String r0 = "voip_call_offer_group"
        L_0x10dc:
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1365
            X.6V1 r3 = r5.A02     // Catch:{ all -> 0x136f }
            X.5JN r2 = (X.AnonymousClass5JN) r2     // Catch:{ all -> 0x136f }
            r5 = 1
            X.AnonymousClass00C.A0D(r2, r5)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/showRingingCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            java.lang.String r9 = r11.A08     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x136f }
            r19 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r19)     // Catch:{ all -> 0x136f }
            X.5Tb r0 = X.C108325Tb.RINGING_CALL     // Catch:{ all -> 0x136f }
            java.lang.String r0 = X.AnonymousClass6V1.A00(r0, r9)     // Catch:{ all -> 0x136f }
            java.lang.String r7 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x136f }
            com.whatsapp.jid.DeviceJid r0 = r2.A03     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x136a
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x136f }
            java.lang.String r17 = r0.getRawString()     // Catch:{ all -> 0x136f }
            com.whatsapp.jid.DeviceJid r0 = r2.A04     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x112b
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x112b
            java.lang.String r14 = r0.getRawString()     // Catch:{ all -> 0x136f }
        L_0x1119:
            boolean r6 = r2.A09     // Catch:{ all -> 0x136f }
            java.lang.String r13 = r2.A07     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "voip_call_offer_group"
            boolean r0 = X.AnonymousClass00C.A0J(r13, r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x112e
            com.whatsapp.jid.GroupJid r0 = r2.A05     // Catch:{ all -> 0x136f }
            r12 = 1
            if (r0 != 0) goto L_0x112f
            goto L_0x112e
        L_0x112b:
            r14 = r18
            goto L_0x1119
        L_0x112e:
            r12 = 0
        L_0x112f:
            X.6N4 r8 = r3.A04     // Catch:{ all -> 0x136f }
            r1 = r18
            r0 = r17
            java.lang.String r10 = r8.A01(r11, r0, r1, r14)     // Catch:{ all -> 0x136f }
            X.0wG r8 = r3.A07     // Catch:{ all -> 0x136f }
            if (r12 == 0) goto L_0x1146
            r1 = 2131890412(0x7f1210ec, float:1.9415515E38)
            if (r6 == 0) goto L_0x114e
            r1 = 2131890411(0x7f1210eb, float:1.9415513E38)
            goto L_0x114e
        L_0x1146:
            r1 = 2131890414(0x7f1210ee, float:1.941552E38)
            if (r6 == 0) goto L_0x114e
            r1 = 2131890413(0x7f1210ed, float:1.9415517E38)
        L_0x114e:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x136f }
            r0[r4] = r10     // Catch:{ all -> 0x136f }
            java.lang.String r10 = r8.A02(r1, r0)     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A08(r10)     // Catch:{ all -> 0x136f }
            java.lang.String r12 = r3.A03(r11)     // Catch:{ all -> 0x136f }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x136f }
            long r5 = r2.A00     // Catch:{ all -> 0x136f }
            long r0 = r2.A02     // Catch:{ all -> 0x136f }
            long r5 = r5 + r0
            long r0 = r15.toMillis(r5)     // Catch:{ all -> 0x136f }
            X.0wo r5 = r3.A06     // Catch:{ all -> 0x136f }
            long r15 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x136f }
            long r0 = r0 - r15
            r15 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 > 0) goto L_0x11c1
            X.6On r0 = r3.A02     // Catch:{ all -> 0x136f }
            long r30 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x136f }
            com.whatsapp.jid.GroupJid r1 = r2.A05     // Catch:{ all -> 0x136f }
            if (r1 == 0) goto L_0x11a7
            java.lang.String r26 = r1.getRawString()     // Catch:{ all -> 0x136f }
        L_0x1183:
            r32 = 1
            X.6Ds r1 = new X.6Ds     // Catch:{ all -> 0x136f }
            r29 = 0
            r23 = r13
            r24 = r17
            r25 = r19
            r27 = r18
            r28 = r14
            r21 = r1
            r22 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x136f }
            r0.A01(r1)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/showRingingCallNotification/Inactive Account call expiry <= current time"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1365
            goto L_0x11bc
        L_0x11a7:
            r26 = r18
            goto L_0x1183
        L_0x11aa:
            X.6On r0 = r3.A02     // Catch:{ all -> 0x136f }
            r0.A03(r4, r5)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "InactiveAccountNotificationManager/showCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x136f }
            X.1Z0 r0 = r3.A01     // Catch:{ all -> 0x136f }
            X.3KU r11 = r0.A03(r4)     // Catch:{ all -> 0x136f }
            if (r11 == 0) goto L_0x1365
        L_0x11bc:
            X.AnonymousClass6V1.A01(r11, r3)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x11c1:
            long r15 = X.C113095ez.A00     // Catch:{ all -> 0x136f }
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x11c8
            r0 = r15
        L_0x11c8:
            X.6On r6 = r3.A02     // Catch:{ all -> 0x136f }
            long r30 = X.C19970wo.A00(r5)     // Catch:{ all -> 0x136f }
            com.whatsapp.jid.GroupJid r2 = r2.A05     // Catch:{ all -> 0x136f }
            if (r2 == 0) goto L_0x12d9
            java.lang.String r26 = r2.getRawString()     // Catch:{ all -> 0x136f }
        L_0x11d6:
            r32 = 1
            r5 = 1
            X.6Ds r2 = new X.6Ds     // Catch:{ all -> 0x136f }
            r29 = 1
            r23 = r13
            r24 = r17
            r25 = r19
            r27 = r18
            r28 = r14
            r21 = r2
            r22 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x136f }
            r6.A01(r2)     // Catch:{ all -> 0x136f }
            r2 = 64
            X.6EH r15 = new X.6EH     // Catch:{ all -> 0x136f }
            r15.<init>()     // Catch:{ all -> 0x136f }
            java.lang.String r14 = "inactiveAccountNotificationId"
            r15.A01(r14, r2)     // Catch:{ all -> 0x136f }
            java.lang.String r2 = "inactiveAccountNotificationLid"
            java.util.Map r13 = r15.A00     // Catch:{ all -> 0x136f }
            r13.put(r2, r9)     // Catch:{ all -> 0x136f }
            java.lang.String r11 = "inactiveAccountNotificationTag"
            r13.put(r11, r7)     // Catch:{ all -> 0x136f }
            java.lang.String r6 = "inactiveAccountNotificationCallId"
            r2 = r19
            r13.put(r6, r2)     // Catch:{ all -> 0x136f }
            X.6X2 r6 = r15.A00()     // Catch:{ all -> 0x136f }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker> r13 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker.class
            X.4pE r2 = new X.4pE     // Catch:{ all -> 0x136f }
            r2.<init>(r13)     // Catch:{ all -> 0x136f }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x136f }
            r2.A02(r0, r13)     // Catch:{ all -> 0x136f }
            X.6QA r0 = r2.A00     // Catch:{ all -> 0x136f }
            r0.A0A = r6     // Catch:{ all -> 0x136f }
            r2.A06(r7)     // Catch:{ all -> 0x136f }
            X.5s0 r1 = r2.A00()     // Catch:{ all -> 0x136f }
            X.4pG r1 = (X.C97404pG) r1     // Catch:{ all -> 0x136f }
            X.0zS r0 = r3.A08     // Catch:{ all -> 0x136f }
            X.6VR r0 = X.C90514aH.A0V(r0)     // Catch:{ all -> 0x136f }
            r0.A08(r1)     // Catch:{ all -> 0x136f }
            android.content.Context r2 = r8.A00     // Catch:{ all -> 0x136f }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver> r0 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver.class
            android.content.Intent r1 = X.C36441kJ.A0H(r2, r0)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall"
            r1.setAction(r0)     // Catch:{ all -> 0x136f }
            r0 = 64
            r1.putExtra(r14, r0)     // Catch:{ all -> 0x136f }
            r1.putExtra(r11, r7)     // Catch:{ all -> 0x136f }
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r13 = X.C65743Th.A01(r2, r4, r1, r0)     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x136f }
            r6 = 2131231799(0x7f080437, float:1.807969E38)
            r0 = 2131895959(0x7f122697, float:1.9426766E38)
            java.lang.String r0 = r8.A01(r0)     // Catch:{ all -> 0x136f }
            X.0Wx r1 = new X.0Wx     // Catch:{ all -> 0x136f }
            r1.<init>(r6, r0, r13)     // Catch:{ all -> 0x136f }
            r0 = 4
            android.content.Intent r6 = X.AnonymousClass190.A1B(r2, r9, r0, r4)     // Catch:{ all -> 0x136f }
            r0 = 64
            r6.putExtra(r14, r0)     // Catch:{ all -> 0x136f }
            r6.putExtra(r11, r7)     // Catch:{ all -> 0x136f }
            android.app.PendingIntent r13 = X.C65743Th.A03(r2, r6, r4)     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x136f }
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            r6 = 2131886327(0x7f1200f7, float:1.940723E38)
            java.lang.String r8 = r8.A01(r6)     // Catch:{ all -> 0x136f }
            X.0Wx r6 = new X.0Wx     // Catch:{ all -> 0x136f }
            r6.<init>(r0, r8, r13)     // Catch:{ all -> 0x136f }
            r0 = 4
            android.content.Intent r8 = X.AnonymousClass190.A1B(r2, r9, r0, r4)     // Catch:{ all -> 0x136f }
            r2 = 64
            r8.putExtra(r14, r2)     // Catch:{ all -> 0x136f }
            r8.putExtra(r11, r7)     // Catch:{ all -> 0x136f }
            X.3S9 r9 = r3.A03     // Catch:{ all -> 0x136f }
            X.AnonymousClass00C.A0D(r7, r5)     // Catch:{ all -> 0x136f }
            r13 = 3
            X.0wG r0 = r9.A00     // Catch:{ all -> 0x136f }
            android.content.Context r11 = r0.A00     // Catch:{ all -> 0x136f }
            X.0Yy r3 = X.C20600xp.A02(r11)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "call"
            r3.A0L = r0     // Catch:{ all -> 0x136f }
            r3.A09 = r5     // Catch:{ all -> 0x136f }
            r3.A06(r13)     // Catch:{ all -> 0x136f }
            r3.A0I(r5)     // Catch:{ all -> 0x136f }
            r3.A0E(r10)     // Catch:{ all -> 0x136f }
            r3.A0F(r12)     // Catch:{ all -> 0x136f }
            java.util.ArrayList r0 = r3.A0Q     // Catch:{ all -> 0x136f }
            r0.add(r1)     // Catch:{ all -> 0x136f }
            r0.add(r6)     // Catch:{ all -> 0x136f }
            android.app.PendingIntent r0 = X.C65743Th.A03(r11, r8, r4)     // Catch:{ all -> 0x136f }
            r3.A0D = r0     // Catch:{ all -> 0x136f }
            X.C36361kB.A1A(r3)     // Catch:{ all -> 0x136f }
            r3.A0J(r5)     // Catch:{ all -> 0x136f }
            java.lang.String r0 = "critical_app_alerts@1"
            r3.A0M = r0     // Catch:{ all -> 0x136f }
            r3.A0G(r10)     // Catch:{ all -> 0x136f }
            X.1Fq r1 = r9.A01     // Catch:{ all -> 0x136f }
            android.app.Notification r0 = r3.A05()     // Catch:{ all -> 0x136f }
            r1.A07(r7, r2, r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x12d9:
            r26 = r18
            goto L_0x11d6
        L_0x12dd:
            java.util.HashMap r5 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x136f }
            r1 = r66
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x136f }
            if (r0 != 0) goto L_0x12ee
            java.lang.String r0 = "registration_code"
            r5.put(r0, r1)     // Catch:{ all -> 0x136f }
        L_0x12ee:
            if (r2 == 0) goto L_0x12f5
            java.lang.String r0 = "push_payload"
            r5.put(r0, r2)     // Catch:{ all -> 0x136f }
        L_0x12f5:
            r0 = r20
            java.util.Set r0 = r0.A0D     // Catch:{ all -> 0x136f }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x136f }
        L_0x12fd:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1313
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x136f }
            X.63b r6 = (X.AnonymousClass63b) r6     // Catch:{ all -> 0x136f }
            r4 = r44
            r1 = r43
            r0 = r41
            r6.A00(r4, r1, r0)     // Catch:{ all -> 0x136f }
            goto L_0x12fd
        L_0x1313:
            r0 = r20
            X.19O r1 = r0.A0C     // Catch:{ all -> 0x136f }
            if (r54 != 0) goto L_0x131b
            r22 = r46
        L_0x131b:
            r0 = r22
            r1.A09(r0)     // Catch:{ all -> 0x136f }
            if (r3 == 0) goto L_0x1328
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x134f
        L_0x1328:
            r0 = r20
            java.util.Set r0 = r0.A0E     // Catch:{ all -> 0x136f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x136f }
        L_0x1330:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x134f
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x136f }
            X.7mR r3 = (X.C161247mR) r3     // Catch:{ all -> 0x136f }
            r1 = r18
            if (r15 == 0) goto L_0x1341
            r1 = r9
        L_0x1341:
            r0 = r45
            boolean r0 = r3.BtD(r2, r1, r0)     // Catch:{ all -> 0x136f }
            if (r0 == 0) goto L_0x1330
            r0 = r45
            r3.BJc(r0, r5)     // Catch:{ all -> 0x136f }
            goto L_0x1330
        L_0x134f:
            if (r65 == 0) goto L_0x1365
            r0 = r20
            X.1Vx r1 = r0.A0B     // Catch:{ all -> 0x136f }
            r0 = r21
            r1.A01(r0)     // Catch:{ all -> 0x136f }
            goto L_0x1365
        L_0x135b:
            int r9 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0634
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x0634
            if (r10 == r13) goto L_0x0634
        L_0x1365:
            monitor-exit(r20)
            return
        L_0x1367:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x136f }
            goto L_0x136e
        L_0x136a:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x136f }
        L_0x136e:
            throw r0     // Catch:{ all -> 0x136f }
        L_0x136f:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T0.A03(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }
}
