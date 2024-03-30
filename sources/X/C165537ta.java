package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ta  reason: invalid class name and case insensitive filesystem */
public class C165537ta implements C160087kR {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public C165537ta(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A01 = obj3;
        this.A03 = obj5;
        this.A05 = obj4;
        this.A04 = obj;
        this.A00 = obj2;
        this.A06 = str;
        this.A02 = obj6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0524, code lost:
        if (r2 == null) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x052a, code lost:
        r1 = r13.values();
        r2 = X.C36321k7.A0J(r1);
        r7 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x053b, code lost:
        if (r7.hasNext() == false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x053d, code lost:
        r2.add(((X.AnonymousClass6DX) r7.next()).A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0549, code lost:
        r7 = X.C007103b.A0Y(X.C007103b.A0e(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0556, code lost:
        if (r7.size() != 1) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0558, code lost:
        r19 = X.C36401kF.A0s(r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x055c, code lost:
        if (r19 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0560, code lost:
        if ((r6 instanceof X.AnonymousClass2bV) != false) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0562, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0564, code lost:
        r2 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x056c, code lost:
        if (r2.hasNext() == false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x056e, code lost:
        r11 = ((X.AnonymousClass6DX) r2.next()).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0576, code lost:
        if (r11 == null) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0582, code lost:
        if (r5.A00.A0X(r11).exists() == false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0584, code lost:
        r16 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0588, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x058d, code lost:
        if (r16.hasNext() == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x058f, code lost:
        r7 = r16.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x059f, code lost:
        if (r5.A02.A00(((X.AnonymousClass6DX) r7).A03, true) == null) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05a1, code lost:
        r7 = (X.AnonymousClass6DX) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05a3, code lost:
        if (r7 == null) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05a5, code lost:
        r10 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05a7, code lost:
        r2 = X.C90474aD.A0s(r13);
        r13 = X.AnonymousClass000.A0y(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05b3, code lost:
        if (r13.hasNext() == false) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b5, code lost:
        r1 = X.AnonymousClass000.A11(r13);
        r7 = r1.getKey();
        r6 = ((X.AnonymousClass6DX) r1.getValue()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05c6, code lost:
        if (1 != r6) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05c8, code lost:
        X.C36341k9.A1K(r7, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05cc, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05ce, code lost:
        r8.put(r14, new X.AnonymousClass6D4(r19, r11, r10, r2, r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05e2, code lost:
        r2 = new X.AnonymousClass5P4("invalid db data state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ea, code lost:
        r2 = new X.AnonymousClass5P4("media file path not exist for text status");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05f2, code lost:
        r2 = new X.AnonymousClass5P4("empty unique id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05fa, code lost:
        r2 = new X.AnonymousClass5P4("inconsistent uniqueId across target destinations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x060a, code lost:
        r2 = new X.AnonymousClass5P4("missing destination db information");
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r29) {
        /*
            r28 = this;
            r0 = r28
            int r2 = r0.A07
            r1 = 0
            r4 = r29
            X.AnonymousClass00C.A0D(r4, r1)
            boolean r1 = X.C224714l.A02()
            r1 = r1 ^ 1
            if (r2 == 0) goto L_0x02e9
            if (r1 == 0) goto L_0x02e2
            int r1 = r4.A00
            if (r1 == 0) goto L_0x0045
            java.lang.Object r9 = r0.A05
            X.6Kn r9 = (X.C130296Kn) r9
            X.6MQ r3 = r9.A01
            X.66O r2 = r4.A04
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r2, r1)
            X.2V1 r2 = (X.AnonymousClass2V1) r2
            java.lang.Object r5 = r0.A04
            X.6Ee r5 = (X.C128936Ee) r5
            java.lang.Object r6 = r0.A00
            java.lang.String r11 = r0.A06
            java.lang.Object r10 = r0.A02
            java.lang.Object r8 = r0.A01
            java.lang.Object r7 = r0.A03
            r12 = 2
            X.741 r4 = new X.741
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 3
            X.7s3 r0 = new X.7s3
            r0.<init>(r8, r1)
            r3.A00(r5, r0, r2, r4)
            return
        L_0x0045:
            X.60z r1 = r4.A03
            java.lang.Object r7 = r1.A00
            X.6Bo r7 = (X.C128266Bo) r7
            if (r7 != 0) goto L_0x0057
            java.lang.Object r2 = r0.A01
            X.63j r2 = (X.AnonymousClass63j) r2
            r1 = 2
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0057:
            X.6Dl r2 = r7.A00
            java.lang.Object r4 = r0.A03
            X.77f r4 = (X.C1509077f) r4
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.A00
            boolean r1 = r3.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02db
            byte[] r1 = r4.A02
            r2.A01 = r1
            X.6Dl r2 = r7.A00
            boolean r1 = r3.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02d4
            byte[] r1 = r4.A01
            r2.A00 = r1
            java.lang.Object r3 = r0.A01
            X.63j r3 = (X.AnonymousClass63j) r3
            X.64t r1 = r3.A01
            X.005 r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6Ja r0 = (X.C129926Ja) r0
            r6 = 0
            X.9P1 r5 = r0.A00     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.lang.String r4 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.lang.String r0 = "CN=Facebook Purpose Encryption Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.security.cert.X509Certificate r4 = r5.A00(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r5 = java.security.Signature.getInstance(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.security.PublicKey r0 = r4.getPublicKey()     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            r5.initVerify(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            byte[] r8 = r2.A07     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            r5.update(r8)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            java.lang.String r4 = r2.A03     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            boolean r0 = r5.verify(r0)     // Catch:{ UnsupportedEncodingException -> 0x00ba, GeneralSecurityException -> 0x00b7 }
            if (r0 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00b7:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams GeneralSecurityException: Credential data cannot be validated"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams UnsupportedEncodingException: Credential data cannot be validated"
        L_0x00bc:
            X.AnonymousClass1UT.A01(r0, r6)
        L_0x00bf:
            r0 = 0
            goto L_0x00ef
        L_0x00c1:
            byte[] r9 = r2.A06
            byte[] r10 = r2.A01
            java.lang.String r6 = "Required value was null."
            if (r10 == 0) goto L_0x02cf
            byte[] r11 = r2.A00
            if (r11 == 0) goto L_0x02ca
            byte[] r12 = X.C129926Ja.A01
            r13 = 2
            byte[] r5 = X.C201929kj.A02(r8, r9, r10, r11, r12, r13)
            byte[] r4 = r2.A05
            byte[] r0 = r2.A04
            byte[] r4 = X.C200419hN.A02(r5, r4, r0)
            byte[] r0 = r2.A01
            if (r0 == 0) goto L_0x02c5
            java.lang.String r0 = X.C90504aG.A0o(r0)
            X.AnonymousClass00C.A08(r0)
            byte[] r0 = X.C36351kA.A1b(r0)
            boolean r0 = java.util.Arrays.equals(r0, r4)
        L_0x00ef:
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback purpose encryption validation failed"
            r7 = 0
            X.AnonymousClass1UT.A01(r0, r7)
            java.util.List r0 = r3.A03
            java.util.ArrayList r6 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0101:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010b
            X.C90464aC.A1T(r6, r2)
            goto L_0x0101
        L_0x010b:
            r5 = 4
            X.17Y r4 = r1.A01
            X.1i1 r2 = r1.A02
            X.005 r0 = r1.A05
            X.AnonymousClass6Y4.A06(r4, r2, r0, r6, r5)
            X.7kg r1 = r3.A00
            r0 = -14
            r1.BWZ(r0, r7)
            return
        L_0x011d:
            java.util.List r13 = r3.A03
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.List r0 = r7.A01
            java.util.Iterator r15 = r0.iterator()
            r4 = 0
        L_0x012e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r15.next()
            int r14 = r4 + 1
            if (r4 >= 0) goto L_0x0141
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x0141:
            boolean r0 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r12 = r13.get(r4)
            X.3T1 r12 = (X.AnonymousClass3T1) r12
            if (r0 == 0) goto L_0x0152
            r11.add(r12)
        L_0x0150:
            r4 = r14
            goto L_0x012e
        L_0x0152:
            java.util.List r0 = r7.A02
            java.lang.Object r10 = r0.get(r4)
            X.6bk r10 = (X.C134876bk) r10
            X.005 r0 = r1.A05
            java.lang.Object r8 = r0.get()
            X.6Tl r8 = (X.C132396Tl) r8
            long r4 = r12.A1N
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            X.7OZ r6 = new X.7OZ
            r6.<init>(r8, r10, r4)
            r0 = 2
            X.C131886Rd.A01(r6, r0)
            r9.add(r12)
            goto L_0x0150
        L_0x0175:
            boolean r0 = X.C36411kG.A1a(r11)
            if (r0 == 0) goto L_0x0197
            java.util.ArrayList r7 = X.C36351kA.A0z(r11)
            java.util.Iterator r4 = r11.iterator()
        L_0x0183:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018d
            X.C90464aC.A1T(r7, r4)
            goto L_0x0183
        L_0x018d:
            r6 = 3
            X.17Y r5 = r1.A01
            X.1i1 r4 = r1.A02
            X.005 r0 = r1.A05
            X.AnonymousClass6Y4.A06(r5, r4, r0, r7, r6)
        L_0x0197:
            X.005 r0 = r1.A05
            java.lang.Object r6 = r0.get()
            X.6Tl r6 = (X.C132396Tl) r6
            java.util.ArrayList r5 = X.C36351kA.A0z(r9)
            java.util.Iterator r4 = r9.iterator()
        L_0x01a7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b1
            X.C90464aC.A1T(r5, r4)
            goto L_0x01a7
        L_0x01b1:
            java.util.HashMap r0 = r6.A02(r5)
            java.util.LinkedHashMap r7 = X.C000400e.A06(r0)
            java.lang.String r6 = r3.A02
            r8 = 1
            java.util.Iterator r11 = r9.iterator()
        L_0x01c0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02b3
            X.3T1 r10 = X.C36391kE.A0l(r11)
            long r4 = r10.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r5 = r7.get(r0)
            X.6Cs r5 = (X.C128556Cs) r5
            r4 = 0
            if (r5 == 0) goto L_0x02af
            X.6bk r0 = r5.A02
            if (r0 == 0) goto L_0x02af
            int r0 = r5.A00
            if (r0 != r8) goto L_0x02af
            java.lang.String r5 = r5.A04
            if (r5 == 0) goto L_0x01c0
            int r0 = r5.length()
            if (r0 == 0) goto L_0x01c0
            X.005 r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.632 r0 = (X.AnonymousClass632) r0
            X.1D8 r0 = r0.A00
            java.lang.String r0 = r0.A00(r5, r8)
            if (r0 == 0) goto L_0x0201
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01c0
        L_0x0201:
            boolean r0 = r10 instanceof X.AnonymousClass2bV
            if (r0 != 0) goto L_0x029f
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Invalid directURL path for non-text status"
        L_0x0207:
            r0 = 0
            X.C18740tg.A0D(r0, r2)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0229
            r0 = -17
        L_0x0213:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0217:
            X.011 r0 = X.C36441kJ.A19(r0, r4)
        L_0x021b:
            X.7kg r2 = r3.A00
            int r1 = X.C90484aE.A0H(r0)
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.BWZ(r1, r0)
            return
        L_0x0229:
            java.util.Iterator r11 = r9.iterator()
        L_0x022d:
            boolean r0 = r11.hasNext()
            r10 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r0 == 0) goto L_0x0299
            X.3T1 r6 = X.C36391kE.A0l(r11)
            long r8 = r6.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r5 = r7.get(r0)
            X.6Cs r5 = (X.C128556Cs) r5
            if (r5 != 0) goto L_0x024a
            r0 = -18
            goto L_0x0213
        L_0x024a:
            X.6bk r0 = r5.A02
            if (r0 != 0) goto L_0x0251
            r0 = -22
            goto L_0x0213
        L_0x0251:
            int r2 = r5.A00
            r0 = 1
            if (r2 == r0) goto L_0x0261
            r0 = -19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r0 = X.C36421kH.A0j(r0, r2)
            goto L_0x021b
        L_0x0261:
            java.lang.String r5 = r5.A04
            if (r5 == 0) goto L_0x0299
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0299
            X.005 r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.632 r0 = (X.AnonymousClass632) r0
            X.1D8 r2 = r0.A00
            r0 = 1
            java.lang.String r0 = r2.A00(r5, r0)
            if (r0 == 0) goto L_0x0282
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0299
        L_0x0282:
            boolean r0 = r6 instanceof X.AnonymousClass2bV
            if (r0 != 0) goto L_0x0289
            r0 = -20
            goto L_0x0213
        L_0x0289:
            X.0y0 r0 = r1.A00
            java.io.File r0 = r0.A0X(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x022d
            r0 = -21
            goto L_0x0213
        L_0x0299:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0217
        L_0x029f:
            X.0y0 r0 = r1.A00
            java.io.File r0 = r0.A0X(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x01c0
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Media file not exist for text status"
            goto L_0x0207
        L_0x02af:
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/DB Data UniqueID or State Invalid"
            goto L_0x0207
        L_0x02b3:
            X.1Ak r0 = X.C23931Ak.copyOf((java.util.Collection) r9)
            X.AnonymousClass00C.A08(r0)
            X.6Bn r1 = new X.6Bn
            r1.<init>(r0, r6, r7)
            X.7kg r0 = r3.A00
            r0.BiB(r1, r2)
            return
        L_0x02c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x02cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x02d4:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x02db:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x02e2:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x02e9:
            if (r1 == 0) goto L_0x06b1
            int r1 = r4.A00
            if (r1 == 0) goto L_0x031b
            java.lang.Object r9 = r0.A05
            X.6Kl r9 = (X.C130276Kl) r9
            X.1UF r3 = r9.A02
            X.66O r2 = r4.A04
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.waffle.utils.graphql.WaffleGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r2, r1)
            X.2Uy r2 = (X.C46112Uy) r2
            java.lang.Object r7 = r0.A04
            X.6Ee r7 = (X.C128936Ee) r7
            java.lang.Object r6 = r0.A02
            java.lang.String r11 = r0.A06
            java.lang.Object r10 = r0.A00
            java.lang.Object r8 = r0.A03
            java.lang.Object r5 = r0.A01
            r12 = 1
            X.741 r4 = new X.741
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.7s6 r0 = new X.7s6
            r0.<init>(r10, r12)
            r3.A00(r7, r0, r2, r4)
            return
        L_0x031b:
            X.60z r1 = r4.A03
            java.lang.Object r4 = r1.A00
            X.6D5 r4 = (X.AnonymousClass6D5) r4
            if (r4 != 0) goto L_0x0331
            java.lang.Object r2 = r0.A00
            X.67p r2 = (X.C1272667p) r2
            r1 = 1
            X.5P1 r0 = new X.5P1
            r0.<init>(r1)
        L_0x032d:
            r2.A01(r0)
            return
        L_0x0331:
            boolean r1 = r4.A04
            if (r1 != 0) goto L_0x033c
            java.lang.Object r2 = r0.A00
            X.67p r2 = (X.C1272667p) r2
            X.5P2 r0 = X.AnonymousClass5P2.A00
            goto L_0x032d
        L_0x033c:
            X.6Dk r3 = r4.A00
            if (r3 == 0) goto L_0x0352
            java.lang.Object r2 = r0.A03
            X.77e r2 = (X.C1508977e) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00
            boolean r1 = r1.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06aa
            byte[] r1 = r2.A02
            r3.A01 = r1
        L_0x0352:
            X.6Dk r3 = r4.A00
            if (r3 == 0) goto L_0x0368
            java.lang.Object r2 = r0.A03
            X.77e r2 = (X.C1508977e) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00
            boolean r1 = r1.get()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06a3
            byte[] r1 = r2.A01
            r3.A00 = r1
        L_0x0368:
            java.lang.Object r0 = r0.A00
            X.67p r0 = (X.C1272667p) r0
            if (r3 == 0) goto L_0x0670
            X.64s r5 = r0.A02
            X.005 r1 = r5.A04
            java.lang.Object r1 = r1.get()
            X.6JZ r1 = (X.AnonymousClass6JZ) r1
            X.9P1 r6 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.lang.String r2 = r3.A02     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.lang.String r1 = "CN=Facebook Purpose Encryption Signature"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.security.cert.X509Certificate r2 = r6.A00(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.lang.String r1 = "SHA256withRSA"
            java.security.Signature r6 = java.security.Signature.getInstance(r1)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.security.PublicKey r1 = r2.getPublicKey()     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            r6.initVerify(r1)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            byte[] r8 = r3.A07     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            r6.update(r8)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            java.lang.String r2 = r3.A03     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            r1 = 8
            byte[] r1 = android.util.Base64.decode(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            boolean r1 = r6.verify(r1)     // Catch:{ UnsupportedEncodingException -> 0x066b, GeneralSecurityException -> 0x0659 }
            if (r1 == 0) goto L_0x0670
            byte[] r9 = r3.A06
            byte[] r10 = r3.A01
            java.lang.String r7 = "Required value was null."
            if (r10 == 0) goto L_0x0654
            byte[] r11 = r3.A00
            if (r11 == 0) goto L_0x064f
            byte[] r12 = X.AnonymousClass6JZ.A01
            r13 = 2
            byte[] r6 = X.C201929kj.A02(r8, r9, r10, r11, r12, r13)
            byte[] r2 = r3.A05
            byte[] r1 = r3.A04
            byte[] r2 = X.C200419hN.A02(r6, r2, r1)
            byte[] r1 = r3.A01
            if (r1 == 0) goto L_0x064a
            java.lang.String r1 = X.C90504aG.A0o(r1)
            X.AnonymousClass00C.A08(r1)
            byte[] r1 = X.C36351kA.A1b(r1)
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0670
            java.util.List r13 = r0.A05
            java.util.List r15 = r0.A04
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Map r8 = r4.A03
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Collection r1 = r8.values()
            java.lang.Object r1 = X.C007103b.A0H(r1)
            java.util.List r1 = (java.util.List) r1
            int r7 = r1.size()
            r6 = 0
        L_0x03f7:
            if (r6 >= r7) goto L_0x041b
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = X.AnonymousClass000.A0z(r8)
        L_0x0401:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0415
            java.lang.Object r1 = r10.next()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r6)
            r2.add(r1)
            goto L_0x0401
        L_0x0415:
            r12.add(r2)
            int r6 = r6 + 1
            goto L_0x03f7
        L_0x041b:
            int r10 = r13.size()
            r8 = 0
        L_0x0420:
            if (r8 >= r10) goto L_0x0483
            java.lang.Object r7 = r13.get(r8)
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            java.lang.Object r2 = r12.get(r8)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0441
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0441
        L_0x043b:
            r11.add(r7)
        L_0x043e:
            int r8 = r8 + 1
            goto L_0x0420
        L_0x0441:
            java.util.Iterator r2 = r2.iterator()
        L_0x0445:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x043b
            java.lang.Object r1 = r2.next()
            boolean r1 = X.AnonymousClass000.A1X(r1)
            if (r1 != 0) goto L_0x0445
            java.util.List r1 = r4.A02
            java.lang.String r14 = X.C36401kF.A0s(r1, r8)
            X.005 r1 = r5.A05
            java.lang.Object r6 = r1.get()
            X.6VF r6 = (X.AnonymousClass6VF) r6
            long r1 = r7.A1N
            r16 = r1
            r1 = 1
            X.AnonymousClass00C.A0D(r14, r1)
            android.content.ContentValues r2 = X.C36441kJ.A0E()
            java.lang.String r1 = "crossposting_status_unique_id"
            r2.put(r1, r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.util.List r1 = X.C36371kC.A11(r1)
            X.AnonymousClass6VF.A02(r2, r6, r1)
            r9.add(r7)
            goto L_0x043e
        L_0x0483:
            boolean r1 = X.C36411kG.A1a(r11)
            if (r1 == 0) goto L_0x04aa
            java.util.ArrayList r7 = X.C36351kA.A0z(r11)
            java.util.Iterator r2 = r11.iterator()
        L_0x0491:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x049b
            X.C90464aC.A1T(r7, r2)
            goto L_0x0491
        L_0x049b:
            r16 = 3
            X.17Y r6 = r5.A01
            X.1hs r2 = r5.A03
            X.005 r1 = r5.A05
            r11 = r6
            r12 = r2
            r13 = r1
            r14 = r7
            X.AnonymousClass6R9.A00(r11, r12, r13, r14, r15, r16)
        L_0x04aa:
            X.005 r1 = r5.A05
            java.lang.Object r7 = r1.get()
            X.6VF r7 = (X.AnonymousClass6VF) r7
            java.util.ArrayList r6 = X.C36351kA.A0z(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x04ba:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x04c4
            X.C90464aC.A1T(r6, r2)
            goto L_0x04ba
        L_0x04c4:
            java.util.HashMap r12 = r7.A04(r6)
            java.lang.String r1 = r0.A03     // Catch:{ 5P5 -> 0x0643 }
            r27 = r1
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ 5P5 -> 0x0643 }
            java.util.Iterator r17 = r9.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x04d4:
            boolean r1 = r17.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x0612
            X.3T1 r6 = X.C36391kE.A0l(r17)     // Catch:{ 5P5 -> 0x0643 }
            long r1 = r6.A1N     // Catch:{ 5P5 -> 0x0643 }
            r25 = r1
            java.lang.Long r14 = java.lang.Long.valueOf(r25)     // Catch:{ 5P5 -> 0x0643 }
            java.util.List r16 = X.C90524aI.A0n(r14, r12)     // Catch:{ 5P5 -> 0x0643 }
            if (r16 == 0) goto L_0x0602
            r1 = 10
            int r1 = X.AnonymousClass03U.A06(r15, r1)     // Catch:{ 5P5 -> 0x0643 }
            int r2 = X.C000300d.A02(r1)     // Catch:{ 5P5 -> 0x0643 }
            r1 = 16
            if (r2 >= r1) goto L_0x04fc
            r2 = 16
        L_0x04fc:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ 5P5 -> 0x0643 }
            r13.<init>(r2)     // Catch:{ 5P5 -> 0x0643 }
            java.util.Iterator r11 = r15.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x0505:
            boolean r1 = r11.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x052a
            java.lang.Object r7 = r11.next()     // Catch:{ 5P5 -> 0x0643 }
            java.util.Iterator r10 = r16.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x0513:
            boolean r1 = r10.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x060a
            java.lang.Object r2 = r10.next()     // Catch:{ 5P5 -> 0x0643 }
            r1 = r2
            X.6DX r1 = (X.AnonymousClass6DX) r1     // Catch:{ 5P5 -> 0x0643 }
            X.5Tq r1 = r1.A02     // Catch:{ 5P5 -> 0x0643 }
            if (r1 != r7) goto L_0x0513
            if (r2 == 0) goto L_0x060a
            r13.put(r7, r2)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0505
        L_0x052a:
            r10 = 0
            java.util.Collection r1 = r13.values()     // Catch:{ 5P5 -> 0x0643 }
            java.util.ArrayList r2 = X.C36321k7.A0J(r1)     // Catch:{ 5P5 -> 0x0643 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x0537:
            boolean r1 = r7.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x0549
            java.lang.Object r1 = r7.next()     // Catch:{ 5P5 -> 0x0643 }
            X.6DX r1 = (X.AnonymousClass6DX) r1     // Catch:{ 5P5 -> 0x0643 }
            java.lang.String r1 = r1.A05     // Catch:{ 5P5 -> 0x0643 }
            r2.add(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0537
        L_0x0549:
            java.util.Set r1 = X.C007103b.A0e(r2)     // Catch:{ 5P5 -> 0x0643 }
            java.util.List r7 = X.C007103b.A0Y(r1)     // Catch:{ 5P5 -> 0x0643 }
            int r2 = r7.size()     // Catch:{ 5P5 -> 0x0643 }
            r1 = 1
            if (r2 != r1) goto L_0x05fa
            java.lang.String r19 = X.C36401kF.A0s(r7, r10)     // Catch:{ 5P5 -> 0x0643 }
            if (r19 == 0) goto L_0x05f2
            boolean r1 = r6 instanceof X.AnonymousClass2bV     // Catch:{ 5P5 -> 0x0643 }
            if (r1 != 0) goto L_0x0564
            r11 = 0
            goto L_0x0584
        L_0x0564:
            java.util.Iterator r2 = r16.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x0568:
            boolean r1 = r2.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x05ea
            java.lang.Object r1 = r2.next()     // Catch:{ 5P5 -> 0x0643 }
            X.6DX r1 = (X.AnonymousClass6DX) r1     // Catch:{ 5P5 -> 0x0643 }
            java.lang.String r11 = r1.A04     // Catch:{ 5P5 -> 0x0643 }
            if (r11 == 0) goto L_0x0568
            X.0y0 r1 = r5.A00     // Catch:{ 5P5 -> 0x0643 }
            java.io.File r1 = r1.A0X(r11)     // Catch:{ 5P5 -> 0x0643 }
            boolean r1 = r1.exists()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x0568
        L_0x0584:
            java.util.Iterator r16 = r16.iterator()     // Catch:{ 5P5 -> 0x0643 }
        L_0x0588:
            boolean r1 = r16.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            r10 = 0
            if (r1 == 0) goto L_0x05cc
            java.lang.Object r7 = r16.next()     // Catch:{ 5P5 -> 0x0643 }
            r1 = r7
            X.6DX r1 = (X.AnonymousClass6DX) r1     // Catch:{ 5P5 -> 0x0643 }
            X.1D8 r6 = r5.A02     // Catch:{ 5P5 -> 0x0643 }
            java.lang.String r2 = r1.A03     // Catch:{ 5P5 -> 0x0643 }
            r1 = 1
            java.lang.String r1 = r6.A00(r2, r1)     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x0588
        L_0x05a1:
            X.6DX r7 = (X.AnonymousClass6DX) r7     // Catch:{ 5P5 -> 0x0643 }
            if (r7 == 0) goto L_0x05a7
            java.lang.String r10 = r7.A03     // Catch:{ 5P5 -> 0x0643 }
        L_0x05a7:
            java.util.LinkedHashMap r2 = X.C90474aD.A0s(r13)     // Catch:{ 5P5 -> 0x0643 }
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r13)     // Catch:{ 5P5 -> 0x0643 }
        L_0x05af:
            boolean r1 = r13.hasNext()     // Catch:{ 5P5 -> 0x0643 }
            if (r1 == 0) goto L_0x05ce
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r13)     // Catch:{ 5P5 -> 0x0643 }
            java.lang.Object r7 = r1.getKey()     // Catch:{ 5P5 -> 0x0643 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ 5P5 -> 0x0643 }
            X.6DX r1 = (X.AnonymousClass6DX) r1     // Catch:{ 5P5 -> 0x0643 }
            int r6 = r1.A00     // Catch:{ 5P5 -> 0x0643 }
            r1 = 1
            if (r1 != r6) goto L_0x05e2
            X.C36341k9.A1K(r7, r2, r6)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x05af
        L_0x05cc:
            r7 = r10
            goto L_0x05a1
        L_0x05ce:
            X.6D4 r1 = new X.6D4     // Catch:{ 5P5 -> 0x0643 }
            r18 = r1
            r20 = r11
            r21 = r10
            r22 = r2
            r23 = r25
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ 5P5 -> 0x0643 }
            r8.put(r14, r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x04d4
        L_0x05e2:
            java.lang.String r1 = "invalid db data state"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0611
        L_0x05ea:
            java.lang.String r1 = "media file path not exist for text status"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0611
        L_0x05f2:
            java.lang.String r1 = "empty unique id"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0611
        L_0x05fa:
            java.lang.String r1 = "inconsistent uniqueId across target destinations"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0611
        L_0x0602:
            java.lang.String r1 = "empty db data"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
            goto L_0x0611
        L_0x060a:
            java.lang.String r1 = "missing destination db information"
            X.5P4 r2 = new X.5P4     // Catch:{ 5P5 -> 0x0643 }
            r2.<init>(r1)     // Catch:{ 5P5 -> 0x0643 }
        L_0x0611:
            throw r2     // Catch:{ 5P5 -> 0x0643 }
        L_0x0612:
            X.1Ak r10 = X.C23931Ak.copyOf((java.util.Collection) r9)     // Catch:{ 5P5 -> 0x0643 }
            X.AnonymousClass00C.A08(r10)     // Catch:{ 5P5 -> 0x0643 }
            java.util.List r1 = r4.A01     // Catch:{ 5P5 -> 0x0643 }
            X.1Ak r11 = X.C23931Ak.copyOf((java.util.Collection) r1)     // Catch:{ 5P5 -> 0x0643 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ 5P5 -> 0x0643 }
            X.6DN r9 = new X.6DN     // Catch:{ 5P5 -> 0x0643 }
            r12 = r3
            r13 = r27
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 5P5 -> 0x0643 }
            X.6CZ r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CrosspostRequestSessionManager/eligibility retry success for session: "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            X.C90464aC.A1R(r1, r0)
            X.1hw r1 = r2.A02
            X.692 r0 = r2.A01
            X.C34971hw.A00(r0, r1, r9, r3)
            return
        L_0x0643:
            r1 = move-exception
            X.6CZ r0 = r0.A01
            r0.A00(r1)
            return
        L_0x064a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r7)
            throw r0
        L_0x064f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r7)
            throw r0
        L_0x0654:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r7)
            throw r0
        L_0x0659:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "CrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams GeneralSecurityException: "
            java.lang.String r1 = X.C36331k8.A0i(r1, r2, r3)
            X.AnonymousClass3TI.A00(r1)
            r3.printStackTrace()
            goto L_0x0670
        L_0x066b:
            java.lang.String r1 = "CrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams UnsupportedEncodingException: Credential data cannot be validated"
            X.AnonymousClass3TI.A00(r1)
        L_0x0670:
            java.lang.String r1 = "EligibilityManager/generateEligibilityGraphqlCallback purpose encryption validation failed"
            X.AnonymousClass3TI.A00(r1)
            java.util.List r1 = r0.A05
            java.util.ArrayList r5 = X.C36351kA.A0z(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x067f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0689
            X.C90464aC.A1T(r5, r2)
            goto L_0x067f
        L_0x0689:
            java.util.List r6 = r0.A04
            r7 = 4
            X.64s r1 = r0.A02
            X.17Y r2 = r1.A01
            X.1hs r3 = r1.A03
            X.005 r4 = r1.A05
            X.AnonymousClass6R9.A00(r2, r3, r4, r5, r6, r7)
            X.6CZ r2 = r0.A01
            r1 = 0
            X.5P3 r0 = new X.5P3
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x06a3:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x06aa:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x06b1:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165537ta.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        if (this.A07 != 0) {
            AnonymousClass63j r5 = (AnonymousClass63j) this.A01;
            AnonymousClass1UT.A01("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback delivery failure", (Throwable) null);
            AnonymousClass66L r4 = (AnonymousClass66L) r5.A01.A06.get();
            String str = r5.A02;
            List list = r5.A03;
            ArrayList A0J = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C90464aC.A1T(A0J, it);
            }
            AnonymousClass00C.A0D(A0J, 1);
            C90494aF.A1G(str, A0J, r4.A01);
            r5.A00.BVK();
            return;
        }
        ((C1272667p) this.A00).A00();
    }

    public void BWk(Exception exc) {
        int i;
        Integer num;
        if (this.A07 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            boolean z = exc instanceof AnonymousClass5V0;
            AnonymousClass63j r2 = (AnonymousClass63j) this.A01;
            if (z) {
                C132286Sy r0 = ((AnonymousClass5V0) exc).error;
                i = r0.A01;
                num = Integer.valueOf(r0.A02);
            } else {
                i = 2;
                num = null;
            }
            r2.A00(i, num);
            return;
        }
        ((C1272667p) this.A00).A01(new AnonymousClass5P1(1));
    }
}
