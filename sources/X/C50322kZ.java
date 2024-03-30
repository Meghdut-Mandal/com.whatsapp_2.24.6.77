package X;

import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2kZ  reason: invalid class name and case insensitive filesystem */
public class C50322kZ extends C132446Tt {
    public Set A00;
    public Set A01;
    public final UserJid A02;
    public final WeakReference A03;
    public final /* synthetic */ AnonymousClass3FF A04;

    public static AnonymousClass8NN A00(AnonymousClass8NN r5, String str, byte[] bArr) {
        AnonymousClass8NN A0p = AnonymousClass8PY.DEFAULT_INSTANCE.A0p();
        byte[] bytes = str.getBytes();
        AnonymousClass8I5 A012 = C21674AUx.A01(bytes, 0, bytes.length);
        A0p.A0S();
        AnonymousClass8PY r1 = (AnonymousClass8PY) A0p.A00;
        r1.bitField0_ |= 2;
        r1.identifier_ = A012;
        AnonymousClass8I5 A013 = C21674AUx.A01(bArr, 0, bArr.length);
        A0p.A0S();
        AnonymousClass8PY r12 = (AnonymousClass8PY) A0p.A00;
        r12.bitField0_ |= 1;
        r12.content_ = A013;
        r5.A0S();
        return A0p;
    }

    public C50322kZ(AnonymousClass4TF r2, AnonymousClass3FF r3, UserJid userJid) {
        this.A04 = r3;
        this.A02 = userJid;
        this.A03 = AnonymousClass001.A0F(r2);
    }

    public static String A01(String str, List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            byte[] A042 = A04(list);
            byte[] bArr = new byte[2];
            byte b = (byte) 0;
            bArr[1] = b;
            bArr[0] = b;
            byte[] A05 = C203239na.A05(bArr, A042, str.getBytes());
            for (int i = 0; i < 5200; i++) {
                instance.update(A05);
                A05 = instance.digest(A042);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A02(A05, 0));
            A0u.append(A02(A05, 5));
            A0u.append(A02(A05, 10));
            A0u.append(A02(A05, 15));
            A0u.append(A02(A05, 20));
            return AnonymousClass000.A0q(A02(A05, 25), A0u);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A02(byte[] bArr, int i) {
        long j = ((((long) bArr[i]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 8);
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = Long.valueOf(((((long) bArr[i + 4]) & 255) | j) % 100000);
        return String.format("%05d", A0L);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            r7 = r24
            com.whatsapp.jid.UserJid r0 = r7.A02
            if (r0 != 0) goto L_0x0008
            r2 = 0
        L_0x0007:
            return r2
        L_0x0008:
            X.3FF r8 = r7.A04
            X.17i r5 = r8.A07
            java.util.HashSet r1 = r5.A0B(r0)
            java.util.Set r2 = r8.A00(r1)
            r7.A01 = r2
            X.3GL r1 = r8.A06
            java.util.HashMap r4 = r1.A00(r2)
            boolean r1 = r4.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0007
            java.util.Set r1 = r7.A01
            int r3 = r1.size()
            int r1 = r4.size()
            if (r3 != r1) goto L_0x0007
            X.0y7 r1 = r5.A02()
            java.util.Set r1 = r8.A00(r1)
            r7.A00 = r1
            X.0wQ r11 = r8.A00
            com.whatsapp.jid.PhoneUserJid r6 = X.C36371kC.A0e(r11)
            com.whatsapp.jid.DeviceJid r1 = r0.getPrimaryDevice()
            X.6EZ r3 = X.C133256Xm.A02(r1)
            java.util.Collection r1 = r4.values()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r1.iterator()
        L_0x0053:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r4.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            X.3IG r1 = r1.A00
            r5.add(r1)
            goto L_0x0053
        L_0x0065:
            java.util.ArrayList r4 = X.C36441kJ.A15(r5)
            boolean r1 = r0 instanceof X.C223313w
            if (r1 != 0) goto L_0x0138
            boolean r1 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 != 0) goto L_0x0138
            X.189 r2 = r8.A01
            java.lang.String r0 = r6.user
            java.lang.String r8 = X.C55212uG.A00(r0)
            r0 = 0
            java.util.ArrayList r1 = r7.A03(r0)
            java.lang.String r0 = r3.A02
            java.lang.String r7 = X.C55212uG.A00(r0)
            X.18u r3 = r2.A00
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            X.3IG r1 = (X.AnonymousClass3IG) r1
            X.3FZ r0 = new X.3FZ
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x008e
        L_0x00a3:
            X.34P r0 = r3.A04()
            X.3FZ r0 = r0.A01
            r5.add(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r4.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r1 = r2.next()
            X.3IG r1 = (X.AnonymousClass3IG) r1
            X.3FZ r0 = new X.3FZ
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x00b4
        L_0x00c9:
            java.lang.String r1 = A01(r8, r5)
            java.lang.String r0 = A01(r7, r3)
            if (r1 == 0) goto L_0x0136
            if (r0 == 0) goto L_0x0136
            X.3Fv r2 = new X.3Fv
            r2.<init>(r1, r0)
        L_0x00da:
            byte[] r6 = A04(r5)
            byte[] r5 = A04(r3)
            X.8QQ r0 = X.AnonymousClass8QQ.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            r4.A0S()
            X.8Hz r3 = r4.A00
            X.8QQ r3 = (X.AnonymousClass8QQ) r3
            r1 = 0
            int r0 = r3.bitField0_
            r0 = r0 | 1
            r3.bitField0_ = r0
            r3.version_ = r1
            X.8NN r0 = A00(r4, r8, r6)
            X.8Hz r1 = r4.A00
            X.8QQ r1 = (X.AnonymousClass8QQ) r1
            X.8Hz r0 = r0.A0R()
            X.8PY r0 = (X.AnonymousClass8PY) r0
            r0.getClass()
            r1.localFingerprint_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.8NN r0 = A00(r4, r7, r5)
            X.8Hz r1 = r4.A00
            X.8QQ r1 = (X.AnonymousClass8QQ) r1
            X.8Hz r0 = r0.A0R()
            X.8PY r0 = (X.AnonymousClass8PY) r0
            r0.getClass()
            r1.remoteFingerprint_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            X.8Hz r0 = r4.A0R()
            X.8QQ r0 = (X.AnonymousClass8QQ) r0
            X.36a r3 = new X.36a
            r3.<init>(r2, r0)
            return r3
        L_0x0136:
            r2 = 0
            goto L_0x00da
        L_0x0138:
            X.13w r13 = r11.A08()
            boolean r9 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r9 == 0) goto L_0x02a7
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.12O r1 = r8.A04
            X.13w r1 = r1.A09(r0)
        L_0x0148:
            X.0yC r10 = r8.A08
            r3 = 7468(0x1d2c, float:1.0465E-41)
            boolean r5 = r10.A0E(r3)
            r3 = 7587(0x1da3, float:1.0632E-41)
            boolean r10 = r10.A0E(r3)
            if (r5 == 0) goto L_0x02a3
            java.lang.String r16 = r11.A0B()
        L_0x015c:
            int r3 = r16.length()
            r12 = 0
            if (r3 != 0) goto L_0x0165
            r16 = r2
        L_0x0165:
            if (r5 == 0) goto L_0x029f
            if (r1 == 0) goto L_0x029f
            X.16y r3 = r8.A03
            java.lang.String r20 = r3.A01(r1)
        L_0x016f:
            X.189 r5 = r8.A01
            r3 = 1
            java.util.ArrayList r7 = r7.A03(r3)
            if (r9 != 0) goto L_0x0188
            if (r1 == 0) goto L_0x0189
            X.1FV r3 = r8.A05
            java.lang.Boolean r3 = r3.A06(r1)
            if (r3 == 0) goto L_0x0189
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0189
        L_0x0188:
            r12 = r6
        L_0x0189:
            if (r10 == 0) goto L_0x029b
            X.0xV r3 = r8.A02
            boolean r9 = r3.A01(r6)
            boolean r11 = r3.A01(r0)
        L_0x0195:
            X.18v r6 = r5.A01
            java.util.ArrayList r17 = X.C235318v.A00(r6, r7)
            r3 = 0
            if (r17 != 0) goto L_0x01a4
            java.lang.String r0 = "wamsys/generateFingerprint/local-identity-key-conversion-failed"
        L_0x01a0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x01a4:
            java.util.ArrayList r21 = X.C235318v.A00(r6, r4)
            if (r21 != 0) goto L_0x01ad
            java.lang.String r0 = "wamsys/generateFingerprint/remote-identity-key-conversion-failed"
            goto L_0x01a0
        L_0x01ad:
            X.0yC r8 = r6.A03
            r5 = 7468(0x1d2c, float:1.0465E-41)
            boolean r10 = r8.A0E(r5)
            r5 = 7587(0x1da3, float:1.0632E-41)
            boolean r8 = r8.A0E(r5)
            if (r8 != 0) goto L_0x0220
            if (r10 != 0) goto L_0x0220
            java.util.ArrayList r15 = X.C235318v.A00(r6, r7)
            r7 = 0
            if (r15 != 0) goto L_0x01cc
            java.lang.String r0 = "wamsys/generateFingerprint/local-identity-key-conversion-failed"
        L_0x01c8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x01cc:
            java.util.ArrayList r16 = X.C235318v.A00(r6, r4)
            if (r16 != 0) goto L_0x01d5
            java.lang.String r0 = "wamsys/generateFingerprint/remote-identity-key-conversion-failed"
            goto L_0x01c8
        L_0x01d5:
            X.00b r4 = r6.A04
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4
            java.util.concurrent.atomic.AtomicReference r4 = r4.wajContext
            java.lang.Object r14 = r4.get()
            r20 = 0
            if (r12 != 0) goto L_0x0208
            r17 = r2
        L_0x01e5:
            if (r0 != 0) goto L_0x0203
            r18 = r2
        L_0x01e9:
            if (r13 == 0) goto L_0x01ef
            java.lang.String r2 = r13.getRawString()
        L_0x01ef:
            if (r1 == 0) goto L_0x01f5
            java.lang.String r20 = r1.getRawString()
        L_0x01f5:
            r13 = 0
            r19 = r2
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOOO(r13, r14, r15, r16, r17, r18, r19, r20)
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5
            if (r5 != 0) goto L_0x020d
            java.lang.String r0 = "wamsys/generateFingerprint/create-fingerprint-failed"
            goto L_0x01c8
        L_0x0203:
            java.lang.String r18 = r0.getRawString()
            goto L_0x01e9
        L_0x0208:
            java.lang.String r17 = r12.getRawString()
            goto L_0x01e5
        L_0x020d:
            r0 = 4
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r0, r5)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            if (r1 == 0) goto L_0x021d
            X.33Z r0 = new X.33Z
            r0.<init>(r1)
            goto L_0x02b3
        L_0x021d:
            java.lang.String r0 = "wamsys/generateFingerprint/processing-fingerprints-failed"
            goto L_0x01c8
        L_0x0220:
            X.00b r4 = r6.A04
            if (r10 != 0) goto L_0x0226
            r16 = r2
        L_0x0226:
            r5 = -1
            if (r8 != 0) goto L_0x022a
            r9 = -1
        L_0x022a:
            long r14 = (long) r9
            r19 = 0
            if (r12 != 0) goto L_0x0284
            r18 = r2
        L_0x0231:
            if (r13 == 0) goto L_0x0237
            java.lang.String r19 = r13.getRawString()
        L_0x0237:
            r13 = 4
            java.lang.Object r6 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r13, r14, r16, r17, r18, r19)
            com.facebook.simplejni.NativeHolder r6 = (com.facebook.simplejni.NativeHolder) r6
            X.33Y r7 = new X.33Y
            r7.<init>(r6)
            if (r10 != 0) goto L_0x0247
            r20 = r2
        L_0x0247:
            if (r8 == 0) goto L_0x024a
            r5 = r11
        L_0x024a:
            long r5 = (long) r5
            r23 = 0
            if (r0 != 0) goto L_0x027f
            r22 = r2
        L_0x0251:
            if (r1 == 0) goto L_0x0257
            java.lang.String r23 = r1.getRawString()
        L_0x0257:
            r17 = 4
            r18 = r5
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r17, r18, r20, r21, r22, r23)
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0
            X.33Y r1 = new X.33Y
            r1.<init>(r0)
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4
            java.util.concurrent.atomic.AtomicReference r0 = r4.wajContext
            java.lang.Object r5 = r0.get()
            com.facebook.simplejni.NativeHolder r4 = r7.A00
            com.facebook.simplejni.NativeHolder r1 = r1.A00
            r0 = 1
            java.lang.Object r6 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r0, r5, r4, r1)
            com.facebook.simplejni.NativeHolder r6 = (com.facebook.simplejni.NativeHolder) r6
            if (r6 != 0) goto L_0x0289
            java.lang.String r0 = "wamsys/generateFingerprint/create-fingerprint-failed"
            goto L_0x01a0
        L_0x027f:
            java.lang.String r22 = r0.getRawString()
            goto L_0x0251
        L_0x0284:
            java.lang.String r18 = r12.getRawString()
            goto L_0x0231
        L_0x0289:
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r13, r6)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            if (r1 == 0) goto L_0x0297
            X.33Z r0 = new X.33Z
            r0.<init>(r1)
            goto L_0x02fa
        L_0x0297:
            java.lang.String r0 = "wamsys/generateFingerprint/processing-fingerprints-failed"
            goto L_0x01a0
        L_0x029b:
            r9 = 0
            r11 = 0
            goto L_0x0195
        L_0x029f:
            r20 = r2
            goto L_0x016f
        L_0x02a3:
            java.lang.String r16 = ""
            goto L_0x015c
        L_0x02a7:
            X.13w r0 = (X.C223313w) r0
            X.12O r1 = r8.A04
            com.whatsapp.jid.PhoneUserJid r3 = r1.A0A(r0)
            r1 = r0
            r0 = r3
            goto L_0x0148
        L_0x02b3:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x02f4 }
            com.facebook.simplejni.NativeHolder r6 = r0.A00     // Catch:{ 186 -> 0x02f4 }
            r0 = 61
            long r1 = (long) r0     // Catch:{ 186 -> 0x02f4 }
            r0 = 2
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r1, r6)     // Catch:{ 186 -> 0x02f4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 186 -> 0x02f4 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x02f4 }
            r0 = 62
            long r1 = (long) r0     // Catch:{ 186 -> 0x02f4 }
            r0 = 2
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r1, r6)     // Catch:{ 186 -> 0x02f4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 186 -> 0x02f4 }
            if (r4 == 0) goto L_0x02d8
            if (r0 == 0) goto L_0x02d8
            X.3Fv r3 = new X.3Fv     // Catch:{ 186 -> 0x02f4 }
            r3.<init>(r4, r0)     // Catch:{ 186 -> 0x02f4 }
        L_0x02d8:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x02f4 }
            r0 = 60
            long r0 = (long) r0     // Catch:{ 186 -> 0x02f4 }
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r13, r0, r6)     // Catch:{ 186 -> 0x02f4 }
            byte[] r1 = (byte[]) r1     // Catch:{ 186 -> 0x02f4 }
            X.8QQ r0 = X.AnonymousClass8QQ.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x02f4 }
            X.8Hz r1 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x02f4 }
            X.8QQ r1 = (X.AnonymousClass8QQ) r1     // Catch:{ 186 -> 0x02f4 }
            X.36a r0 = new X.36a     // Catch:{ 186 -> 0x02f4 }
            r0.<init>(r3, r1)     // Catch:{ 186 -> 0x02f4 }
            r0.A00 = r5     // Catch:{ 186 -> 0x02f4 }
            return r0
        L_0x02f4:
            java.lang.String r0 = "wamsys/generateFingerprint/protobuf-parsing-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x02fa:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x033c }
            com.facebook.simplejni.NativeHolder r7 = r0.A00     // Catch:{ 186 -> 0x033c }
            r0 = 61
            long r0 = (long) r0     // Catch:{ 186 -> 0x033c }
            r4 = 2
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r0, r7)     // Catch:{ 186 -> 0x033c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 186 -> 0x033c }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x033c }
            r0 = 62
            long r4 = (long) r0     // Catch:{ 186 -> 0x033c }
            r0 = 2
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r4, r7)     // Catch:{ 186 -> 0x033c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 186 -> 0x033c }
            if (r1 == 0) goto L_0x031f
            if (r0 == 0) goto L_0x031f
            X.3Fv r2 = new X.3Fv     // Catch:{ 186 -> 0x033c }
            r2.<init>(r1, r0)     // Catch:{ 186 -> 0x033c }
        L_0x031f:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 186 -> 0x033c }
            r0 = 60
            long r4 = (long) r0     // Catch:{ 186 -> 0x033c }
            r0 = 0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r4, r7)     // Catch:{ 186 -> 0x033c }
            byte[] r1 = (byte[]) r1     // Catch:{ 186 -> 0x033c }
            X.8QQ r0 = X.AnonymousClass8QQ.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x033c }
            X.8Hz r1 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x033c }
            X.8QQ r1 = (X.AnonymousClass8QQ) r1     // Catch:{ 186 -> 0x033c }
            X.36a r0 = new X.36a     // Catch:{ 186 -> 0x033c }
            r0.<init>(r2, r1)     // Catch:{ 186 -> 0x033c }
            r0.A00 = r6     // Catch:{ 186 -> 0x033c }
            return r0
        L_0x033c:
            java.lang.String r0 = "wamsys/generateFingerprint/protobuf-parsing-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50322kZ.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        AnonymousClass4TF r0 = (AnonymousClass4TF) this.A03.get();
        if (r0 != null) {
            r0.BdB();
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C599836a r4 = (C599836a) obj;
        AnonymousClass4TF r2 = (AnonymousClass4TF) this.A03.get();
        if (r2 != null) {
            r2.BXz(r4, this.A00, this.A01);
        }
    }

    private ArrayList A03(boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (z) {
            byte[] bArr = this.A04.A01.A07.A04().A01;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
            C18740tg.A06(copyOfRange);
            A0I.add(new AnonymousClass3FZ(new AnonymousClass3IG(copyOfRange, (byte) 5)).A00);
        }
        AnonymousClass3FF r2 = this.A04;
        Iterator A10 = C36391kE.A10(r2.A06.A00(r2.A00(r2.A07.A02())));
        while (A10.hasNext()) {
            A0I.add(((AnonymousClass3FZ) A10.next()).A00);
        }
        return A0I;
    }

    public static byte[] A04(List list) {
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((AnonymousClass3FZ) it.next()).A00.A00());
        }
        Collections.sort(A0r, new C81363wt());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
