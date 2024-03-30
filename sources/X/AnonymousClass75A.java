package X;

import android.content.Context;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.75A  reason: invalid class name */
public class AnonymousClass75A implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public AnonymousClass75A(C587530x r2, C19600wD r3, C25701Hi r4, C20810yC r5, C24581Cz r6) {
        this.A06 = 5;
        this.A03 = new AtomicBoolean();
        this.A00 = r5;
        this.A04 = r6;
        this.A05 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x052f, code lost:
        r2 = ((java.util.concurrent.atomic.AtomicBoolean) r0.A03).get();
        r1 = ((X.C587530x) r0.A01).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x053d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r1.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08fb, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08fc, code lost:
        r1 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08fe, code lost:
        if (r2 == false) goto L_0x0908;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0900, code lost:
        r0 = X.C97324ov.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0904, code lost:
        r1.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0907, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0908, code lost:
        r0 = X.C97344ox.A00();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03cb A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v83 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:114:0x037e] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0772 A[Catch:{ Exception -> 0x0857 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x07b0 A[Catch:{ Exception -> 0x0857 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x09d1  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0a0d  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0a26  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0a39  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r55 = this;
            r0 = r55
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x04a5;
                case 1: goto L_0x04de;
                case 2: goto L_0x0042;
                case 3: goto L_0x01dc;
                case 4: goto L_0x0274;
                case 5: goto L_0x04fa;
                case 6: goto L_0x0924;
                case 7: goto L_0x0481;
                case 8: goto L_0x0aa3;
                case 9: goto L_0x0b24;
                case 10: goto L_0x0b40;
                case 11: goto L_0x0bd0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r0.A00
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            java.lang.Object r6 = r0.A01
            X.1Jd r6 = (X.C26171Jd) r6
            java.lang.Object r2 = r0.A02
            X.0xM r2 = (X.C20310xM) r2
            java.lang.Object r5 = r0.A03
            X.17Y r5 = (X.AnonymousClass17Y) r5
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A05
            int r1 = r7.A0D
            r0 = 7
            if (r1 != r0) goto L_0x0033
            r7.A0g()
            boolean r0 = r7 instanceof X.AnonymousClass2bM
            if (r0 == 0) goto L_0x003e
            X.3Qa r0 = r7.A1J
            X.0x8 r2 = r6.A0I
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 0
            r2.A09(r1, r0)
        L_0x0033:
            r1 = 47
            X.736 r0 = new X.736
            r0.<init>(r7, r4, r3, r1)
            r5.A0H(r0)
        L_0x003d:
            return
        L_0x003e:
            r2.A0k(r7)
            goto L_0x0033
        L_0x0042:
            java.lang.Object r9 = r0.A00
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r6 = r0.A01
            X.6VL r6 = (X.AnonymousClass6VL) r6
            java.lang.Object r10 = r0.A02
            java.lang.Object r1 = r0.A03
            X.6FR r1 = (X.AnonymousClass6FR) r1
            java.lang.Object r5 = r0.A04
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            java.lang.Object r14 = r0.A05
            java.util.concurrent.CountDownLatch r14 = (java.util.concurrent.CountDownLatch) r14
            java.lang.String r22 = "gdrive/backup/backup-file"
            java.lang.String r21 = "gdrive/backup/backup-file failed on "
            r4 = 0
            X.AnonymousClass00C.A0D(r9, r4)
            r7 = 1
            X.C36331k8.A1H(r5, r14)
            java.lang.Object r0 = r9.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 != 0) goto L_0x01c6
            java.lang.String r12 = "% bytes"
            java.lang.String r20 = "gdrive/backup/upload/failure-percentage/"
            java.lang.String r19 = "gdrive/backup/upload/failed-bytes/"
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.io.File r0 = r1.A01()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r11 = 0
            r3[r4] = r0     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.String r0 = r1.A03     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.Object[] r3 = X.C90524aI.A0x(r0, r3, r7, r2)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.String r0 = "gdrive-service/upload-file filePath:%s, fileUploadPath:%s"
            java.lang.String r0 = java.lang.String.format(r8, r0, r3)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.concurrent.atomic.AtomicLong r8 = r6.A0d     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r17 = r8.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b1
            java.util.concurrent.atomic.AtomicLong r0 = r6.A0e     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            double r17 = X.C90474aD.A00(r0, r8)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b1
            java.lang.String r0 = "gdrive/backup/upload-file/too-many-failures"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.58y r1 = r6.A0V     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r0 = 38
            X.C1042758y.A00(r1, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            goto L_0x01a4
        L_0x00b1:
            X.1el r0 = r6.A0J     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r16 = r0
            boolean r0 = r16.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 == 0) goto L_0x01a4
            X.1ei r3 = r6.A0F     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            int r0 = r3.A00     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 != r2) goto L_0x00c9
            X.58y r13 = r6.A0V     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.Long r0 = X.C36411kG.A0t()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r13.A0e = r0     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
        L_0x00c9:
            X.7p0 r13 = new X.7p0     // Catch:{ all -> 0x017a }
            r13.<init>(r10, r6, r1, r4)     // Catch:{ all -> 0x017a }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "gdrive-service/upload "
            r10.append(r0)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "<file>"
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r10)     // Catch:{ all -> 0x017a }
            r0 = r16
            java.lang.Object r10 = X.AnonymousClass6UR.A00(r13, r0, r10)     // Catch:{ all -> 0x017a }
            X.6Pk r10 = (X.C131526Pk) r10     // Catch:{ all -> 0x017a }
            if (r10 != 0) goto L_0x010e
            java.util.concurrent.atomic.AtomicLong r13 = r6.A0e     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r1.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r13.addAndGet(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0b     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r0.incrementAndGet()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0v(r19)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r13.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.C36351kA.A1S(r15, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0v(r20)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            double r0 = X.C90474aD.A00(r13, r8)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r15.append(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.C36321k7.A1a(r15, r12)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
        L_0x010e:
            boolean r0 = r16.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 == 0) goto L_0x01a4
            if (r10 == 0) goto L_0x01a4
            java.lang.String r0 = "gdrive/backup/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.Map r1 = r6.A0a     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.String r0 = r10.A01()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r1.put(r0, r10)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.concurrent.atomic.AtomicLong r11 = r6.A0f     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.6Cl r0 = r10.A02     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 == 0) goto L_0x0157
            long r0 = r0.A00     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
        L_0x012f:
            r11.addAndGet(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.0v0 r10 = r6.A0Q     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r11.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            android.content.SharedPreferences$Editor r12 = X.C19420v0.A00(r10)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.String r10 = "gdrive_already_uploaded_bytes"
            X.C36341k9.A0w(r12, r10, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0Q     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            boolean r0 = r0.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            if (r0 == 0) goto L_0x015a
            X.1ek r10 = r6.A0G     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r2 = r11.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r8.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r10.A04(r2, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            goto L_0x01a3
        L_0x0157:
            long r0 = r10.A00     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            goto L_0x012f
        L_0x015a:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r11.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.AnonymousClass000.A1M(r10, r4, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r8.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.AnonymousClass000.A1M(r10, r7, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r10, r2)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.String r0 = "gdrive-service/upload/success gdrive file map is null, notify backup progress suppressed: %d/%d"
            java.lang.String r0 = X.C90494aF.A0e(r3, r0, r1)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            goto L_0x01a3
        L_0x017a:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicLong r3 = r6.A0e     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r1.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r3.addAndGet(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0b     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r0.incrementAndGet()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r19)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            long r0 = r3.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.C36351kA.A1S(r2, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r20)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            double r0 = X.C90474aD.A00(r3, r8)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            r2.append(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            X.C36321k7.A1a(r2, r12)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
            throw r10     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x01bd, FileNotFoundException -> 0x01ad }
        L_0x01a3:
            r11 = 1
        L_0x01a4:
            r5.compareAndSet(r7, r11)
            r14.countDown()
            if (r11 != 0) goto L_0x003d
            goto L_0x01cc
        L_0x01ad:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bec }
            java.lang.String r0 = "gdrive/backup/upload/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0bec }
            java.lang.String r0 = "<file>"
            X.C36351kA.A1Q(r0, r1, r2)     // Catch:{ all -> 0x0bec }
            goto L_0x01c6
        L_0x01bd:
            r1 = move-exception
            r0 = r22
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bec }
            r9.set(r1)     // Catch:{ all -> 0x0bec }
        L_0x01c6:
            r5.compareAndSet(r7, r4)
            r14.countDown()
        L_0x01cc:
            X.1ei r0 = r6.A0F
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r21)
            goto L_0x0c28
        L_0x01dc:
            java.lang.Object r8 = r0.A00
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            java.lang.Object r2 = r0.A01
            X.65Q r2 = (X.AnonymousClass65Q) r2
            java.lang.Object r12 = r0.A02
            java.lang.Object r1 = r0.A03
            X.6FR r1 = (X.AnonymousClass6FR) r1
            java.lang.Object r5 = r0.A04
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            java.lang.Object r6 = r0.A05
            java.util.concurrent.CountDownLatch r6 = (java.util.concurrent.CountDownLatch) r6
            java.lang.String r9 = "gdrive/encrypted-re-upload/backup-file"
            java.lang.String r14 = "gdrive/encrypted-re-upload/backup-file failed on "
            r4 = 0
            X.AnonymousClass00C.A0D(r8, r4)
            r3 = 1
            X.C36331k8.A1H(r5, r6)
            java.lang.Object r0 = r8.get()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            if (r0 != 0) goto L_0x0c1e
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            r13 = 2
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.io.File r0 = r1.A01()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            r10 = 0
            r7[r4] = r0     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.String r0 = r1.A03     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.Object[] r7 = X.C90524aI.A0x(r0, r7, r3, r13)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload filePath:%s, fileUploadPath:%s"
            java.lang.String r0 = java.lang.String.format(r11, r0, r7)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            X.1el r11 = r2.A06     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            boolean r0 = r11.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            if (r0 == 0) goto L_0x026a
            X.7p0 r7 = new X.7p0     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            r7.<init>(r12, r2, r1, r3)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload "
            r1.append(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.Object r7 = X.AnonymousClass6UR.A00(r7, r11, r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            X.6Pk r7 = (X.C131526Pk) r7     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            boolean r0 = r11.A00()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            if (r0 == 0) goto L_0x026a
            if (r7 == 0) goto L_0x026a
            java.lang.String r0 = "gdrive/encrypted-re-upload/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.util.Map r1 = r2.A0K     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.lang.String r0 = r7.A01()     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            r1.put(r0, r7)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            java.util.concurrent.atomic.AtomicLong r2 = r2.A0R     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            X.6Cl r0 = r7.A02     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            if (r0 == 0) goto L_0x0266
            long r0 = r0.A00     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
        L_0x0262:
            r2.addAndGet(r0)     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            goto L_0x0269
        L_0x0266:
            long r0 = r7.A00     // Catch:{ 4yF | 4yH | 4yI | 4yJ | 4yP | 4yQ | 4yR -> 0x0c17, FileNotFoundException -> 0x0c07 }
            goto L_0x0262
        L_0x0269:
            r10 = 1
        L_0x026a:
            r5.compareAndSet(r3, r10)
            r6.countDown()
            if (r10 != 0) goto L_0x003d
            goto L_0x0c24
        L_0x0274:
            java.lang.Object r5 = r0.A00
            X.5zJ r5 = (X.C125095zJ) r5
            java.lang.Object r6 = r0.A01
            X.6Pk r6 = (X.C131526Pk) r6
            java.lang.Object r9 = r0.A02
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r7 = r0.A03
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            java.lang.Object r12 = r0.A04
            java.util.concurrent.atomic.AtomicInteger r12 = (java.util.concurrent.atomic.AtomicInteger) r12
            java.lang.Object r3 = r0.A05
            java.util.concurrent.CountDownLatch r3 = (java.util.concurrent.CountDownLatch) r3
            X.179 r8 = r5.A09     // Catch:{ all -> 0x0c43 }
            java.lang.String r10 = r6.A06     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = X.C34191gb.A06(r8, r10)     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x02a1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/null-local-path relative path:"
            X.C36321k7.A1P(r0, r10, r1)     // Catch:{ all -> 0x0c43 }
            goto L_0x0c3f
        L_0x02a1:
            java.io.File r2 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x0c43 }
            X.1el r4 = r5.A07     // Catch:{ all -> 0x0c43 }
            boolean r0 = r4.A00()     // Catch:{ all -> 0x0c43 }
            if (r0 == 0) goto L_0x0c3f
            java.lang.Object r0 = r9.get()     // Catch:{ all -> 0x0c43 }
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/another-thread-failed/aborting-restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c43 }
            goto L_0x0c3f
        L_0x02ba:
            java.util.concurrent.atomic.AtomicLong r11 = r5.A0K     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            X.6pU r1 = new X.6pU     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            r1.<init>(r11)     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            X.6Xi r0 = r5.A08     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            boolean r0 = X.AnonymousClass6YN.A0B(r1, r4, r0, r6, r2)     // Catch:{ 4yT -> 0x042a, 4yH | 4yJ | 4yL | 4yP | 4yQ | 4yR -> 0x0420 }
            if (r0 == 0) goto L_0x043b
            X.6Cl r0 = r6.A02     // Catch:{ all -> 0x0c43 }
            if (r0 == 0) goto L_0x032f
            long r0 = r0.A00     // Catch:{ all -> 0x0c43 }
        L_0x02d2:
            r11.addAndGet(r0)     // Catch:{ all -> 0x0c43 }
            X.0v0 r7 = r5.A0B     // Catch:{ all -> 0x0c43 }
            long r0 = r11.get()     // Catch:{ all -> 0x0c43 }
            android.content.SharedPreferences$Editor r9 = X.C19420v0.A00(r7)     // Catch:{ all -> 0x0c43 }
            java.lang.String r7 = "gdrive_already_downloaded_bytes"
            X.C36341k9.A0w(r9, r7, r0)     // Catch:{ all -> 0x0c43 }
            java.lang.String r1 = ".mcrypt1"
            boolean r0 = r10.endsWith(r1)     // Catch:{ all -> 0x0c43 }
            if (r0 == 0) goto L_0x03d0
            X.1Ck r11 = r5.A03     // Catch:{ all -> 0x0c43 }
            X.0v0 r0 = r11.A03     // Catch:{ all -> 0x0c43 }
            boolean r0 = r0.A2I()     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x02fd
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed encryption disabled"
        L_0x02f8:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0c43 }
            goto L_0x044c
        L_0x02fd:
            java.lang.String r7 = r2.getName()     // Catch:{ all -> 0x0c43 }
            boolean r0 = r7.endsWith(r1)     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x0318
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed no extension "
            r2.append(r0)     // Catch:{ all -> 0x0c43 }
            r2.append(r7)     // Catch:{ all -> 0x0c43 }
        L_0x0313:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0c43 }
            goto L_0x02f8
        L_0x0318:
            java.lang.String r1 = r6.A01()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = X.C34191gb.A06(r8, r1)     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x0332
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to get path for "
            r2.append(r0)     // Catch:{ all -> 0x0c43 }
            r2.append(r1)     // Catch:{ all -> 0x0c43 }
            goto L_0x0313
        L_0x032f:
            long r0 = r6.A00     // Catch:{ all -> 0x0c43 }
            goto L_0x02d2
        L_0x0332:
            java.io.File r10 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x0c43 }
            java.io.File r6 = r10.getParentFile()     // Catch:{ all -> 0x0c43 }
            if (r6 == 0) goto L_0x0348
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x0351
            boolean r0 = r6.mkdirs()     // Catch:{ all -> 0x0c43 }
            if (r0 != 0) goto L_0x0351
        L_0x0348:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to create parent "
            X.C36321k7.A1L(r6, r0, r1)     // Catch:{ all -> 0x0c43 }
        L_0x0351:
            r12 = 0
            int r0 = r7.length()     // Catch:{ all -> 0x0c43 }
            int r0 = r0 + -8
            java.lang.String r0 = r7.substring(r12, r0)     // Catch:{ all -> 0x0c43 }
            byte[] r6 = X.AnonymousClass14B.A0H(r0)     // Catch:{ all -> 0x0c43 }
            java.lang.String r7 = "encb/EncBackupManager/decrypt media failed"
            X.1Ci r0 = r11.A01     // Catch:{ all -> 0x0c43 }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x0c43 }
            if (r1 == 0) goto L_0x044c
            r0 = 48
            byte[] r8 = X.AnonymousClass6R0.A00(r1, r6, r0)     // Catch:{ all -> 0x0c43 }
            r6 = 32
            byte[] r1 = new byte[r6]     // Catch:{ all -> 0x0c43 }
            java.lang.System.arraycopy(r8, r12, r1, r12, r6)     // Catch:{ all -> 0x0c43 }
            r0 = 16
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x0c43 }
            java.lang.System.arraycopy(r8, r6, r9, r12, r0)     // Catch:{ all -> 0x0c43 }
            javax.crypto.Cipher r8 = X.C90514aH.A19()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            r6 = 2
            javax.crypto.spec.SecretKeySpec r1 = X.C90494aF.A0m(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            r0.<init>(r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            r8.init(r6, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            java.io.FileInputStream r0 = X.C90524aI.A0U(r2)     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            r6.<init>(r0, r8)     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            X.1Cb r0 = r11.A02     // Catch:{ all -> 0x03bb }
            X.0yG r1 = r0.A00()     // Catch:{ all -> 0x03bb }
            X.5RK r0 = new X.5RK     // Catch:{ all -> 0x03bb }
            r0.<init>(r1, r10)     // Catch:{ all -> 0x03bb }
            X.AnonymousClass6YY.A0J(r6, r0)     // Catch:{ all -> 0x03b1 }
            r0.close()     // Catch:{ all -> 0x03bb }
            r6.close()     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            r2.delete()     // Catch:{ all -> 0x0c43 }
            r2 = r10
            goto L_0x03d0
        L_0x03b1:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x03b6 }
            goto L_0x03ba
        L_0x03b6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03bb }
        L_0x03ba:
            throw r1     // Catch:{ all -> 0x03bb }
        L_0x03bb:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x03c0 }
            goto L_0x03c4
        L_0x03c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
        L_0x03c4:
            throw r1     // Catch:{ IOException -> 0x03c5, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
        L_0x03c5:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03cb }
            goto L_0x044c
        L_0x03cb:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)     // Catch:{ all -> 0x0c43 }
            goto L_0x044c
        L_0x03d0:
            java.util.concurrent.atomic.AtomicInteger r7 = r5.A0I     // Catch:{ all -> 0x0c43 }
            int r0 = r7.getAndDecrement()     // Catch:{ all -> 0x0c43 }
            if (r0 <= 0) goto L_0x040e
            X.1DF r6 = r5.A0C     // Catch:{ RuntimeException -> 0x0405 }
            X.C18740tg.A00()     // Catch:{ RuntimeException -> 0x0405 }
            java.lang.String r1 = X.AnonymousClass6UG.A00(r2)     // Catch:{ IOException -> 0x03e7 }
            r0 = 0
            java.util.ArrayList r0 = r6.A0C(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0405 }
            goto L_0x03f1
        L_0x03e7:
            r1 = move-exception
            java.lang.String r0 = "mediamessagestore/getMediaMessagesForFile/could not get file hash;"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ RuntimeException -> 0x0405 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ RuntimeException -> 0x0405 }
        L_0x03f1:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ RuntimeException -> 0x0405 }
        L_0x03f5:
            boolean r0 = r6.hasNext()     // Catch:{ RuntimeException -> 0x0405 }
            if (r0 == 0) goto L_0x040e
            X.3T1 r1 = X.C36391kE.A0l(r6)     // Catch:{ RuntimeException -> 0x0405 }
            X.1QB r0 = r5.A0F     // Catch:{ RuntimeException -> 0x0405 }
            r0.A01(r1)     // Catch:{ RuntimeException -> 0x0405 }
            goto L_0x03f5
        L_0x0405:
            r1 = move-exception
            r7.incrementAndGet()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/thumbnail regeneration failed."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c43 }
        L_0x040e:
            X.0y0 r0 = r5.A02     // Catch:{ IOException -> 0x044c }
            boolean r0 = r0.A0j(r2)     // Catch:{ IOException -> 0x044c }
            if (r0 == 0) goto L_0x044c
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0c43 }
            android.net.Uri r0 = android.net.Uri.fromFile(r2)     // Catch:{ all -> 0x0c43 }
            X.AnonymousClass1GW.A0O(r1, r0)     // Catch:{ all -> 0x0c43 }
            goto L_0x044c
        L_0x0420:
            r1 = move-exception
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c43 }
            r9.set(r1)     // Catch:{ all -> 0x0c43 }
            goto L_0x043b
        L_0x042a:
            r2 = move-exception
            int r1 = r12.incrementAndGet()     // Catch:{ all -> 0x0c43 }
            r0 = 20
            if (r1 <= r0) goto L_0x0446
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0c43 }
            r9.set(r2)     // Catch:{ all -> 0x0c43 }
        L_0x043b:
            r7.add(r6)     // Catch:{ all -> 0x0c43 }
            java.util.concurrent.atomic.AtomicLong r2 = r5.A0J     // Catch:{ all -> 0x0c43 }
            long r0 = r6.A00     // Catch:{ all -> 0x0c43 }
            r2.addAndGet(r0)     // Catch:{ all -> 0x0c43 }
            goto L_0x044c
        L_0x0446:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file (non-critical)"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0c43 }
            goto L_0x043b
        L_0x044c:
            r3.countDown()
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicLong r6 = r5.A0L
            long r3 = r6.get()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            X.1ek r1 = r5.A06
            java.util.concurrent.atomic.AtomicLong r0 = r5.A0K
            long r4 = r0.get()
            long r2 = r6.get()
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x0471:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()
            X.1eo r0 = (X.C33151eo) r0
            r0.Bak(r4, r2)
            goto L_0x0471
        L_0x0481:
            java.lang.Object r1 = r0.A04
            X.8rO r1 = (X.C183808rO) r1
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x003d
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A05
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.A00
            X.7gM r1 = (X.AnonymousClass7gM) r1
            java.lang.Object r0 = r0.A02
            android.text.Spannable r0 = (android.text.Spannable) r0
            r1.Bo4(r0)
            return
        L_0x04a5:
            java.lang.Object r1 = r0.A04
            X.6QA r1 = (X.AnonymousClass6QA) r1
            boolean r1 = r1.A0H
            if (r1 == 0) goto L_0x04d5
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r2 >= r1) goto L_0x04d5
            X.4pl r4 = new X.4pl
            r4.<init>()
            java.lang.Object r1 = r0.A03
            X.7eB r1 = (X.AnonymousClass7eB) r1
            X.6iy r1 = (X.C138956iy) r1
            java.util.concurrent.Executor r3 = r1.A02
            r2 = 18
            X.75C r1 = new X.75C
            r1.<init>((X.C97484pl) r4, (X.AnonymousClass75A) r0, (int) r2)
            r3.execute(r1)
            r2 = 19
            X.75C r1 = new X.75C
            r1.<init>((X.C97484pl) r4, (X.AnonymousClass75A) r0, (int) r2)
            r4.B0P(r1, r3)
            return
        L_0x04d5:
            java.lang.Object r1 = r0.A02
            X.A6T r1 = (X.A6T) r1
            r0 = 0
            r1.A06(r0)
            return
        L_0x04de:
            java.lang.Object r1 = r0.A05
            X.6u4 r1 = (X.AnonymousClass6u4) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.7kO r2 = (X.C160057kO) r2
            java.lang.Object r3 = r0.A02
            X.6Ee r3 = (X.C128936Ee) r3
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x04fa:
            java.lang.Object r1 = r0.A05
            r25 = r1
            r1 = r25
            X.1Hi r1 = (X.C25701Hi) r1
            r25 = r1
        L_0x0504:
            X.6E9 r1 = r25.A02()
            if (r1 == 0) goto L_0x052f
            java.lang.Object r2 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x052f
            java.lang.Object r2 = r0.A02
            X.0wD r2 = (X.C19600wD) r2
            boolean r2 = r2.A09()
            if (r2 != 0) goto L_0x0541
            java.lang.Object r3 = r0.A00
            X.0yB r3 = (X.C20800yB) r3
            r2 = 4879(0x130f, float:6.837E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x0541
            java.lang.String r1 = "HistorySyncWorkProcessor/run no network access"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x052f:
            java.lang.Object r1 = r0.A01
            X.30x r1 = (X.C587530x) r1
            java.lang.Object r0 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r2 = r0.get()
            com.whatsapp.companiondevice.sync.HistorySyncWorker r1 = r1.A00
            monitor-enter(r1)
            r0 = 1
            goto L_0x08f9
        L_0x0541:
            java.lang.Object r2 = r0.A04
            X.1Cz r2 = (X.C24581Cz) r2
            X.19g r9 = r2.A0M
            com.whatsapp.jid.DeviceJid r3 = r1.A0D
            r54 = r3
            int r4 = r54.getDevice()
            X.3SB r5 = r9.A08(r4)
            r26 = 0
            if (r5 != 0) goto L_0x056f
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "HistorySyncSendMethods/sendMsgHistoryChunk no device info for device id "
            X.C36321k7.A1U(r2, r3, r4)
        L_0x0560:
            long r5 = r1.A06
            X.C18740tg.A00()
            r1 = r25
            X.18P r1 = r1.A02
            X.1M0 r7 = r1.A04()
            goto L_0x085f
        L_0x056f:
            com.whatsapp.jid.DeviceJid r3 = r5.A07
            boolean r10 = X.AnonymousClass9ZV.A00(r3)
            long r3 = r1.A05
            r37 = 0
            int r6 = (r3 > r37 ? 1 : (r3 == r37 ? 0 : -1))
            if (r6 < 0) goto L_0x069a
            X.1AI r8 = r2.A0P
            X.8mn r7 = r8.A02(r3)
            X.5J9 r7 = (X.AnonymousClass5J9) r7
            if (r7 == 0) goto L_0x0560
            if (r10 == 0) goto L_0x0596
            X.0xM r10 = r2.A0C
            long r5 = r7.A08
            long r3 = r7.A06
            android.database.Cursor r16 = r10.A0M(r5, r3)
        L_0x0593:
            if (r16 == 0) goto L_0x0560
            goto L_0x05a7
        L_0x0596:
            X.0xM r12 = r2.A0C
            long r10 = r7.A08
            long r5 = r7.A06
            long r3 = r7.A0I
            r13 = r10
            r15 = r5
            r17 = r3
            android.database.Cursor r16 = r12.A0N(r13, r15, r17)
            goto L_0x0593
        L_0x05a7:
            com.whatsapp.jid.DeviceJid r3 = r7.A00     // Catch:{ all -> 0x0915 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x0915 }
            int r3 = r3.getDevice()     // Catch:{ all -> 0x0915 }
            X.3SB r3 = r9.A08(r3)     // Catch:{ all -> 0x0915 }
            if (r3 != 0) goto L_0x05c2
            java.lang.String r2 = "HistorySyncSendMethod/resendMsgHistoryChunk device no longer exists in db"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x0915 }
            long r2 = r7.A1N     // Catch:{ all -> 0x0915 }
            r8.A05(r2)     // Catch:{ all -> 0x0915 }
            goto L_0x0695
        L_0x05c2:
            X.6CO r17 = X.C24581Cz.A01(r3, r2)     // Catch:{ all -> 0x0915 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0915 }
            X.1HI r3 = r2.A0V     // Catch:{ all -> 0x0915 }
            r20 = 0
            r15 = r3
            r18 = r26
            r19 = r4
            java.util.LinkedHashMap r8 = r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0915 }
            int r6 = r16.getCount()     // Catch:{ all -> 0x0915 }
            X.4uP r3 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ all -> 0x0915 }
            X.8NN r5 = r3.A0p()     // Catch:{ all -> 0x0915 }
            X.4tx r5 = (X.C99784tx) r5     // Catch:{ all -> 0x0915 }
            int r3 = r7.A03     // Catch:{ all -> 0x0915 }
            X.5UH r3 = X.C24581Cz.A02(r3)     // Catch:{ all -> 0x0915 }
            r5.A0Y(r3)     // Catch:{ all -> 0x0915 }
            int r3 = r7.A00     // Catch:{ all -> 0x0915 }
            r5.A0U(r3)     // Catch:{ all -> 0x0915 }
            int r3 = r7.A01     // Catch:{ all -> 0x0915 }
            r5.A0V(r3)     // Catch:{ all -> 0x0915 }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x0915 }
            if (r3 != 0) goto L_0x05ff
            r5.A0Z(r4)     // Catch:{ all -> 0x0915 }
        L_0x05ff:
            java.util.Iterator r12 = X.AnonymousClass000.A0y(r8)     // Catch:{ all -> 0x0915 }
        L_0x0603:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x0915 }
            if (r3 == 0) goto L_0x063e
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r12)     // Catch:{ all -> 0x0915 }
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0915 }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ all -> 0x0915 }
            boolean r3 = r3 instanceof X.C28981Uw     // Catch:{ all -> 0x0915 }
            if (r3 != 0) goto L_0x0603
            java.lang.Object r11 = r4.getValue()     // Catch:{ all -> 0x0915 }
            X.4tv r11 = (X.C99764tv) r11     // Catch:{ all -> 0x0915 }
            java.lang.Object r10 = r4.getKey()     // Catch:{ all -> 0x0915 }
            X.11F r10 = (X.AnonymousClass11F) r10     // Catch:{ all -> 0x0915 }
            long r8 = r7.A08     // Catch:{ all -> 0x0915 }
            long r3 = r7.A09     // Catch:{ all -> 0x0915 }
            r17 = r10
            r18 = r2
            r19 = r11
            r20 = r8
            r22 = r3
            X.C24581Cz.A05(r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0915 }
            X.8Hz r3 = r11.A0R()     // Catch:{ all -> 0x0915 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ all -> 0x0915 }
            r5.A0X(r3)     // Catch:{ all -> 0x0915 }
            goto L_0x0603
        L_0x063e:
            java.lang.String r8 = r7.A0H     // Catch:{ all -> 0x0915 }
            if (r8 == 0) goto L_0x064c
            java.lang.String r4 = r7.A0G     // Catch:{ all -> 0x0915 }
            if (r4 == 0) goto L_0x064c
            X.3I3 r3 = new X.3I3     // Catch:{ all -> 0x0915 }
            r3.<init>(r8, r4)     // Catch:{ all -> 0x0915 }
            goto L_0x064d
        L_0x064c:
            r3 = 0
        L_0x064d:
            com.whatsapp.jid.DeviceJid r4 = r7.A00     // Catch:{ Exception -> 0x068f }
            r18 = r4
            X.C18740tg.A06(r18)     // Catch:{ Exception -> 0x068f }
            int r4 = r7.A00     // Catch:{ Exception -> 0x068f }
            r17 = r4
            int r15 = r7.A03     // Catch:{ Exception -> 0x068f }
            int r14 = r7.A01     // Catch:{ Exception -> 0x068f }
            int r4 = r7.A02     // Catch:{ Exception -> 0x068f }
            int r36 = r4 + 1
            long r12 = r7.A08     // Catch:{ Exception -> 0x068f }
            long r10 = r7.A06     // Catch:{ Exception -> 0x068f }
            long r8 = r7.A09     // Catch:{ Exception -> 0x068f }
            X.3Qa r4 = r7.A1J     // Catch:{ Exception -> 0x068f }
            java.lang.String r4 = r4.A01     // Catch:{ Exception -> 0x068f }
            long r6 = (long) r6     // Catch:{ Exception -> 0x068f }
            r49 = -1
            r51 = 0
            r47 = 0
            r32 = r4
            r33 = r17
            r34 = r15
            r35 = r14
            r39 = r12
            r41 = r10
            r43 = r8
            r45 = r6
            r27 = r3
            r28 = r18
            r29 = r2
            r30 = r5
            r31 = r26
            X.C24581Cz.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51)     // Catch:{ Exception -> 0x068f }
            goto L_0x0695
        L_0x068f:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/resend-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x0915 }
        L_0x0695:
            r16.close()
            goto L_0x0560
        L_0x069a:
            int r4 = r1.A01
            r3 = 3
            r6 = 0
            boolean r24 = X.AnonymousClass000.A1S(r4, r3)
            int r3 = r1.A00
            r23 = r3
            r3 = r24 ^ 1
            int r23 = r23 + r3
            long r7 = r1.A04
            r41 = r7
            java.util.Map r15 = java.util.Collections.emptyMap()
            java.util.ArrayList r22 = X.AnonymousClass001.A0I()
            long r3 = r1.A09     // Catch:{ Exception -> 0x0857 }
            r20 = r3
            int r3 = (r3 > r37 ? 1 : (r3 == r37 ? 0 : -1))
            if (r3 <= 0) goto L_0x06c8
            long r3 = r1.A07     // Catch:{ Exception -> 0x0857 }
            int r9 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x06c8
            r5 = 0
            r47 = 0
            goto L_0x072d
        L_0x06c8:
            if (r10 == 0) goto L_0x06d3
            X.0xM r9 = r2.A0C     // Catch:{ OutOfMemoryError -> 0x083a }
            long r3 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x083a }
            android.database.Cursor r9 = r9.A0M(r3, r7)     // Catch:{ OutOfMemoryError -> 0x083a }
            goto L_0x06e4
        L_0x06d3:
            X.0xM r10 = r2.A0C     // Catch:{ OutOfMemoryError -> 0x083a }
            long r3 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x083a }
            X.0wo r9 = r2.A09     // Catch:{ OutOfMemoryError -> 0x083a }
            long r14 = X.C19970wo.A00(r9)     // Catch:{ OutOfMemoryError -> 0x083a }
            r9 = r10
            r10 = r3
            r12 = r7
            android.database.Cursor r9 = r9.A0N(r10, r12, r14)     // Catch:{ OutOfMemoryError -> 0x083a }
        L_0x06e4:
            if (r9 == 0) goto L_0x0560
            X.6CO r34 = X.C24581Cz.A01(r5, r2)     // Catch:{ all -> 0x0830 }
            X.1HI r3 = r2.A0V     // Catch:{ all -> 0x0830 }
            r32 = r3
            r33 = r9
            r35 = r26
            r36 = r22
            java.util.LinkedHashMap r15 = r32.A02(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0830 }
            int r5 = r9.getCount()     // Catch:{ all -> 0x0830 }
            boolean r3 = r9.moveToLast()     // Catch:{ all -> 0x0830 }
            if (r3 == 0) goto L_0x0728
            java.lang.String r3 = "_id"
            long r7 = X.C36351kA.A07(r9, r3)     // Catch:{ all -> 0x0830 }
            java.lang.String r3 = "message_type"
            int r10 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0830 }
        L_0x070e:
            boolean r3 = r9.isNull(r10)     // Catch:{ all -> 0x0830 }
            if (r3 != 0) goto L_0x0722
            int r4 = r9.getInt(r10)     // Catch:{ all -> 0x0830 }
            r3 = 7
            if (r4 == r3) goto L_0x0722
            java.lang.String r3 = "timestamp"
            long r47 = X.C36351kA.A07(r9, r3)     // Catch:{ all -> 0x0830 }
            goto L_0x072a
        L_0x0722:
            boolean r3 = r9.moveToPrevious()     // Catch:{ all -> 0x0830 }
            if (r3 != 0) goto L_0x070e
        L_0x0728:
            r47 = 0
        L_0x072a:
            r9.close()     // Catch:{ OutOfMemoryError -> 0x083a }
        L_0x072d:
            long r3 = r1.A08     // Catch:{ Exception -> 0x0857 }
            r18 = r3
            long r13 = (long) r5     // Catch:{ Exception -> 0x0857 }
            long r11 = r3 + r13
            if (r5 == 0) goto L_0x07a5
            long r3 = r1.A0A     // Catch:{ Exception -> 0x0857 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r17 = 0
            if (r5 == 0) goto L_0x07a5
            X.17T r5 = r2.A0E     // Catch:{ Exception -> 0x0857 }
            int r3 = r5.A00(r3, r7)     // Catch:{ Exception -> 0x0857 }
            double r5 = (double) r11     // Catch:{ Exception -> 0x0857 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x0857 }
            long r3 = r3 + r11
            double r9 = (double) r3     // Catch:{ Exception -> 0x0857 }
            double r5 = r5 / r9
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r3
            int r9 = (int) r5     // Catch:{ Exception -> 0x0857 }
        L_0x074d:
            X.4uP r3 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0857 }
            X.8NN r5 = r3.A0p()     // Catch:{ Exception -> 0x0857 }
            X.4tx r5 = (X.C99784tx) r5     // Catch:{ Exception -> 0x0857 }
            int r3 = r1.A02     // Catch:{ Exception -> 0x0857 }
            r34 = r3
            X.5UH r3 = X.C24581Cz.A02(r34)     // Catch:{ Exception -> 0x0857 }
            r5.A0Y(r3)     // Catch:{ Exception -> 0x0857 }
            r3 = r23
            r5.A0U(r3)     // Catch:{ Exception -> 0x0857 }
            r5.A0V(r9)     // Catch:{ Exception -> 0x0857 }
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r15)     // Catch:{ Exception -> 0x0857 }
        L_0x076c:
            boolean r3 = r10.hasNext()     // Catch:{ Exception -> 0x0857 }
            if (r3 == 0) goto L_0x07aa
            java.util.Map$Entry r6 = X.AnonymousClass000.A11(r10)     // Catch:{ Exception -> 0x0857 }
            java.lang.Object r3 = r6.getKey()     // Catch:{ Exception -> 0x0857 }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ Exception -> 0x0857 }
            boolean r3 = r3 instanceof X.C28981Uw     // Catch:{ Exception -> 0x0857 }
            if (r3 != 0) goto L_0x076c
            java.lang.Object r4 = r6.getValue()     // Catch:{ Exception -> 0x0857 }
            X.4tv r4 = (X.C99764tv) r4     // Catch:{ Exception -> 0x0857 }
            java.lang.Object r3 = r6.getKey()     // Catch:{ Exception -> 0x0857 }
            X.11F r3 = (X.AnonymousClass11F) r3     // Catch:{ Exception -> 0x0857 }
            long r15 = r1.A0B     // Catch:{ Exception -> 0x0857 }
            r27 = r3
            r28 = r2
            r29 = r4
            r30 = r7
            r32 = r15
            X.C24581Cz.A05(r27, r28, r29, r30, r32)     // Catch:{ Exception -> 0x0857 }
            X.8Hz r3 = r4.A0R()     // Catch:{ Exception -> 0x0857 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ Exception -> 0x0857 }
            r5.A0X(r3)     // Catch:{ Exception -> 0x0857 }
            goto L_0x076c
        L_0x07a5:
            r17 = 1
            r9 = 100
            goto L_0x074d
        L_0x07aa:
            boolean r3 = r22.isEmpty()     // Catch:{ Exception -> 0x0857 }
            if (r3 != 0) goto L_0x07b5
            r3 = r22
            r5.A0Z(r3)     // Catch:{ Exception -> 0x0857 }
        L_0x07b5:
            X.3I3 r10 = r1.A0C     // Catch:{ Exception -> 0x0857 }
            boolean r36 = X.AnonymousClass000.A1P(r24)
            long r3 = r1.A0B     // Catch:{ Exception -> 0x0857 }
            r52 = r3
            r51 = 0
            r32 = r26
            r27 = r10
            r28 = r54
            r29 = r2
            r30 = r5
            r31 = r26
            r33 = r23
            r35 = r9
            r39 = r7
            r43 = r3
            r45 = r13
            r49 = r18
            long r15 = X.C24581Cz.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51)     // Catch:{ Exception -> 0x0857 }
            if (r17 != 0) goto L_0x07e2
            if (r24 != 0) goto L_0x07e2
            goto L_0x07e5
        L_0x07e2:
            r4 = r26
            goto L_0x0811
        L_0x07e5:
            long r13 = r1.A06     // Catch:{ Exception -> 0x0857 }
            long r5 = r1.A0A     // Catch:{ Exception -> 0x0857 }
            long r2 = r1.A07     // Catch:{ Exception -> 0x0857 }
            long r2 = r2 + r15
            long r45 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0857 }
            r32 = 1
            r47 = -1
            X.6E9 r4 = new X.6E9     // Catch:{ Exception -> 0x0857 }
            r27 = r4
            r28 = r10
            r29 = r54
            r30 = r34
            r31 = r23
            r33 = r13
            r35 = r7
            r37 = r5
            r39 = r52
            r41 = r11
            r43 = r2
            r49 = r20
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r45, r47, r49)     // Catch:{ Exception -> 0x0857 }
        L_0x0811:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0857 }
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk/progress = "
            r3.append(r2)     // Catch:{ Exception -> 0x0857 }
            r3.append(r9)     // Catch:{ Exception -> 0x0857 }
            java.lang.String r2 = ", last id = "
            X.C36321k7.A1V(r2, r3, r7)     // Catch:{ Exception -> 0x0857 }
            if (r4 == 0) goto L_0x0560
            X.C18740tg.A00()
            r1 = r25
            X.18P r1 = r1.A02
            X.1M0 r8 = r1.A04()
            goto L_0x0878
        L_0x0830:
            r4 = move-exception
            r9.close()     // Catch:{ all -> 0x0835 }
            goto L_0x0839
        L_0x0835:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ OutOfMemoryError -> 0x083a }
        L_0x0839:
            throw r4     // Catch:{ OutOfMemoryError -> 0x083a }
        L_0x083a:
            java.lang.String r3 = "history-sync-send-methods/send-msg-history-chunk failed OOM"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ Exception -> 0x0857 }
            X.0wN r5 = r2.A01     // Catch:{ Exception -> 0x0857 }
            java.lang.String r4 = "historySyncSendMethod/outOfMemory"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0857 }
            java.lang.String r2 = "type="
            r3.append(r2)     // Catch:{ Exception -> 0x0857 }
            int r2 = r1.A02     // Catch:{ Exception -> 0x0857 }
            java.lang.String r2 = X.C36381kD.A10(r3, r2)     // Catch:{ Exception -> 0x0857 }
            r5.A0E(r4, r2, r6)     // Catch:{ Exception -> 0x0857 }
            goto L_0x0560
        L_0x0857:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x0560
        L_0x085f:
            X.14e r4 = r7.A02     // Catch:{ all -> 0x0910 }
            java.lang.String r3 = "DELETE FROM msg_history_sync WHERE _id=?"
            java.lang.String[] r2 = X.C36341k9.A1b(r5)     // Catch:{ all -> 0x0910 }
            java.lang.String r1 = "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_ID"
            r4.A0E(r3, r1, r2)     // Catch:{ all -> 0x0910 }
            r7.close()
            r2 = r25
            r1 = r54
            X.C25701Hi.A01(r2, r1)
            goto L_0x0504
        L_0x0878:
            X.14e r7 = r8.A02     // Catch:{ all -> 0x091a }
            java.lang.String r6 = "UPDATE msg_history_sync SET device_id=?, sync_type=?, last_processed_msg_row_id=?, oldest_msg_row_id=?, sent_msgs_count=?, chunk_order=?, sent_bytes=?, last_chunk_timestamp=?, status=?, peer_msg_row_id=?, oldest_message_to_sync_row_id=?, session_id=?, md_reg_attempt_id=?, size_limit_bytes=? WHERE _id=?"
            r1 = 15
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x091a }
            com.whatsapp.jid.DeviceJid r3 = r4.A0D     // Catch:{ all -> 0x091a }
            java.lang.String r1 = r3.getRawString()     // Catch:{ all -> 0x091a }
            r5[r51] = r1     // Catch:{ all -> 0x091a }
            r2 = 1
            int r1 = r4.A02     // Catch:{ all -> 0x091a }
            X.C36431kI.A1O(r5, r1, r2)     // Catch:{ all -> 0x091a }
            r9 = 2
            long r1 = r4.A04     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r9 = 3
            long r1 = r4.A0A     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r9 = 4
            long r1 = r4.A08     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r2 = 5
            int r1 = r4.A00     // Catch:{ all -> 0x091a }
            X.C36431kI.A1O(r5, r1, r2)     // Catch:{ all -> 0x091a }
            r9 = 6
            long r1 = r4.A07     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r9 = 7
            long r1 = r4.A03     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r2 = 8
            int r1 = r4.A01     // Catch:{ all -> 0x091a }
            X.C36431kI.A1O(r5, r1, r2)     // Catch:{ all -> 0x091a }
            r9 = 9
            long r1 = r4.A05     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r9 = 10
            long r1 = r4.A0B     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r10 = 11
            X.3I3 r9 = r4.A0C     // Catch:{ all -> 0x091a }
            r2 = 0
            if (r9 == 0) goto L_0x08d2
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x091a }
            r26 = r1
        L_0x08d2:
            r5[r10] = r26     // Catch:{ all -> 0x091a }
            r1 = 12
            if (r9 == 0) goto L_0x08da
            java.lang.String r2 = r9.A00     // Catch:{ all -> 0x091a }
        L_0x08da:
            r5[r1] = r2     // Catch:{ all -> 0x091a }
            r9 = 13
            long r1 = r4.A09     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            r9 = 14
            long r1 = r4.A06     // Catch:{ all -> 0x091a }
            X.C36351kA.A1V(r5, r9, r1)     // Catch:{ all -> 0x091a }
            java.lang.String r1 = "MessageHistorySyncTable.UPDATE_SYNC_STATE"
            r7.A0E(r6, r1, r5)     // Catch:{ all -> 0x091a }
            r8.close()
            r1 = r25
            X.C25701Hi.A01(r1, r3)
            goto L_0x0504
        L_0x08f9:
            r1.A03 = r0     // Catch:{ all -> 0x090d }
            monitor-exit(r1)     // Catch:{ all -> 0x090d }
            X.4tL r1 = r1.A04
            if (r2 == 0) goto L_0x0908
            X.4ov r0 = X.C97324ov.A00()
        L_0x0904:
            r1.A04(r0)
            return
        L_0x0908:
            X.4ox r0 = X.C97344ox.A00()
            goto L_0x0904
        L_0x090d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x090d }
            throw r0
        L_0x0910:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x091f }
            throw r1
        L_0x0915:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x091f }
            throw r1
        L_0x091a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x091f }
            throw r1
        L_0x091f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0924:
            java.lang.Object r11 = r0.A02
            r4 = r11
            X.2Gx r4 = (X.C43322Gx) r4
            X.141 r13 = r4.A0I
            android.view.View r6 = r4.A02
            android.widget.TextView r1 = r4.A0A
            r16 = r1
            X.C18740tg.A04(r6)
            X.C18740tg.A04(r16)
            X.3SF r12 = r4.A0E
            com.whatsapp.TextEmojiLabel r7 = r4.A0D
            android.view.View r14 = r4.A03
            java.lang.Object r1 = r0.A01
            X.1dv r1 = (X.C32621dv) r1
            java.lang.String r1 = r1.A02(r13)
            android.util.Pair r2 = r4.A0J()
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            X.28d r11 = (X.AnonymousClass28d) r11
            boolean r5 = r11.A0F()
            r9 = 800(0x320, double:3.953E-321)
            r15 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0a70
            android.text.TextPaint r5 = r16.getPaint()
            java.lang.String r4 = "•"
            float r4 = r5.measureText(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r8 = (int) r4
            int r4 = r16.getPaddingLeft()
            int r8 = r8 + r4
            int r4 = r16.getPaddingRight()
            int r8 = r8 + r4
            if (r12 != 0) goto L_0x0a60
            r5 = 0
        L_0x0976:
            java.lang.Object r4 = r0.A00
            X.0yC r4 = (X.C20810yC) r4
            int r12 = X.C55832vG.A00(r4)
            double r4 = (double) r5
            double r4 = java.lang.Math.ceil(r4)
            int r13 = (int) r4
            X.01L r5 = r11.A0U
            android.content.res.Resources r4 = r5.getResources()
            X.AnonymousClass00C.A08(r4)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r12)
            int r4 = r4.getIntrinsicWidth()
            int r13 = r13 + r4
            android.content.res.Resources r5 = r5.getResources()
            X.AnonymousClass00C.A08(r5)
            r4 = 2131168705(0x7f070dc1, float:1.795172E38)
            int r4 = X.C36441kJ.A06(r5, r4, r13)
            int r4 = r4 + r8
            float r8 = (float) r4
            float r3 = r3 + r8
            if (r1 == 0) goto L_0x0a5d
            android.text.TextPaint r5 = r7.getPaint()
            float r11 = r5.measureText(r2)
            if (r14 != 0) goto L_0x0a57
            r5 = 0
        L_0x09b4:
            float r5 = (float) r5
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x0a5d
            android.text.TextPaint r5 = r7.getPaint()
            float r5 = r5.measureText(r1)
            float r11 = r11 - r5
            float r3 = r3 + r11
        L_0x09c3:
            r17 = 0
            r18 = 0
            java.lang.Object r5 = r0.A05
            X.0ts r5 = (X.C18820ts) r5
            boolean r5 = X.C36351kA.A1Y(r5)
            if (r5 == 0) goto L_0x09d2
            float r8 = -r3
        L_0x09d2:
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r16 = r5
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r5.setDuration(r9)
            r11 = 4
            X.4Vr r8 = new X.4Vr
            r8.<init>(r0, r6, r11)
            r5.setAnimationListener(r8)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            r8.width = r4
            r6.setLayoutParams(r8)
            r6.startAnimation(r5)
        L_0x09fd:
            r8 = 0
        L_0x09fe:
            r17 = 0
            r18 = 0
            java.lang.Object r5 = r0.A05
            X.0ts r5 = (X.C18820ts) r5
            boolean r6 = X.C36351kA.A1Y(r5)
            float r4 = (float) r4
            if (r6 == 0) goto L_0x0a0e
            float r4 = -r3
        L_0x0a0e:
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r16 = r3
            r20 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.setFillAfter(r15)
            if (r8 == 0) goto L_0x0a28
            r9 = 4000(0xfa0, double:1.9763E-320)
        L_0x0a28:
            r3.setDuration(r9)
            X.4Vs r4 = new X.4Vs
            r4.<init>(r7, r0, r1, r15)
            r3.setAnimationListener(r4)
            boolean r0 = X.C36401kF.A1X(r5)
            if (r0 == 0) goto L_0x0a3c
            r7.setText(r1)
        L_0x0a3c:
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = r0.measureText(r2)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r4.width = r0
            r7.setLayoutParams(r4)
            r7.startAnimation(r3)
            return
        L_0x0a57:
            int r5 = r14.getWidth()
            goto L_0x09b4
        L_0x0a5d:
            r1 = r2
            goto L_0x09c3
        L_0x0a60:
            com.whatsapp.TextEmojiLabel r4 = r12.A01
            android.text.TextPaint r5 = r4.getPaint()
            java.lang.String r4 = r13.A0K()
            float r5 = r5.measureText(r4)
            goto L_0x0976
        L_0x0a70:
            if (r1 != 0) goto L_0x0a75
            r1 = r2
        L_0x0a73:
            r4 = 0
            goto L_0x09fd
        L_0x0a75:
            android.text.TextPaint r3 = r7.getPaint()
            float r3 = r3.measureText(r2)
            android.text.TextPaint r5 = r7.getPaint()
            float r5 = r5.measureText(r1)
            float r3 = r3 - r5
            java.lang.Object r6 = r0.A00
            X.0yB r6 = (X.C20800yB) r6
            r5 = 6172(0x181c, float:8.649E-42)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x0a73
            java.lang.Object r5 = r0.A03
            X.0wo r5 = (X.C19970wo) r5
            X.01L r4 = r4.A0U
            java.lang.String r4 = X.AnonymousClass3SX.A01(r4, r5, r13)
            if (r4 == 0) goto L_0x0a73
            r1 = r2
            r4 = 0
            r8 = 1
            goto L_0x09fe
        L_0x0aa3:
            java.lang.Object r3 = r0.A00
            X.3fk r3 = (X.C70803fk) r3
            java.lang.Object r8 = r0.A01
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r11 = r0.A02
            com.whatsapp.KeyboardPopupLayout r11 = (com.whatsapp.KeyboardPopupLayout) r11
            java.lang.Object r10 = r0.A03
            android.widget.ListView r10 = (android.widget.ListView) r10
            java.lang.Object r9 = r0.A04
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r4 = r0.A05
            android.view.View r4 = (android.view.View) r4
            X.1uh r1 = r3.A2x
            r0 = 0
            r1.A0a(r0)
            android.view.View r7 = r3.A0P
            r2 = 0
            com.whatsapp.conversation.ConversationListView r0 = r3.A2U
            if (r0 == 0) goto L_0x0acc
            boolean r2 = r0.A0B(r2)
        L_0x0acc:
            r0 = 0
            r11.setClipChildren(r0)
            int r12 = r10.getTranscriptMode()
            int r6 = r8.getHeight()
            float r1 = (float) r6
            r0 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r0, r0, r0, r1)
            r0 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r0)
            r7.startAnimation(r5)
            if (r2 == 0) goto L_0x0af0
            r2 = 2
            r10.setTranscriptMode(r2)
            r10.startAnimation(r5)
        L_0x0af0:
            android.graphics.drawable.Drawable r5 = r9.getBackground()
            boolean r2 = r5 instanceof X.C36991ld
            if (r2 != 0) goto L_0x0b00
            X.1ld r2 = new X.1ld
            r2.<init>(r5)
            X.C36991ld.A00(r2, r9)
        L_0x0b00:
            X.1n0 r2 = new X.1n0
            r2.<init>(r9, r6)
            r2.setDuration(r0)
            r9.startAnimation(r2)
            X.21d r7 = new X.21d
            r7.<init>(r8, r9, r10, r11, r12)
            r2.setAnimationListener(r7)
            r0 = 1
            int r0 = r3.A1i(r0)
            r3.A23(r0)
            r0 = 8
            r4.setVisibility(r0)
            r3.A21()
            return
        L_0x0b24:
            java.lang.Object r1 = r0.A05
            X.6u3 r1 = (X.C145536u3) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.7kO r2 = (X.C160057kO) r2
            java.lang.Object r3 = r0.A02
            X.6Ee r3 = (X.C128936Ee) r3
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0b40:
            java.lang.Object r12 = r0.A00
            X.9Ul r12 = (X.C195479Ul) r12
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r8 = r0.A02
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r4 = r0.A03
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r10 = r0.A04
            X.9YX r10 = (X.AnonymousClass9YX) r10
            java.lang.Object r11 = r0.A05
            X.B2a r11 = (X.C23054B2a) r11
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: sendGetContactInfoForJid: "
            X.C36321k7.A1K(r8, r0, r1)
            X.AF7 r0 = r12.A0C
            r0.Buu()
            X.5GM r0 = r12.A0D
            java.lang.String r1 = "upi-get-vpa"
            X.6AT r0 = r0.A02
            java.lang.Integer r14 = r0.A00(r1)
            if (r10 == 0) goto L_0x0b75
            r10.A02(r1)
        L_0x0b75:
            X.0yC r1 = r12.A03
            X.12O r0 = r12.A01
            com.whatsapp.jid.UserJid r3 = X.C111255bz.A00(r0, r1, r8)
            if (r3 != 0) goto L_0x0b8d
            java.lang.String r0 = "PAY: IndiaUpiContactActions : lidCompatibleJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9ky r0 = new X.9ky
            r0.<init>()
            r11.BWg(r0)
            return
        L_0x0b8d:
            r2 = 0
            if (r4 == 0) goto L_0x0ba8
            X.1EZ r0 = r12.A08
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0ba8
            r0 = 1450(0x5aa, float:2.032E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0ba8
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0bcd
            java.lang.String r2 = "true"
        L_0x0ba8:
            X.19A r15 = r12.A04
            java.lang.String r1 = r15.A09()
            X.5Pk r13 = new X.5Pk
            r13.<init>(r3, r1, r2)
            r19 = 204(0xcc, float:2.86E-43)
            X.9nx r0 = r13.A00
            X.17Y r7 = r12.A00
            X.1Vu r9 = r12.A09
            X.8gc r4 = new X.8gc
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r20 = 0
            r16 = r4
            r17 = r0
            r18 = r1
            r15.A0E(r16, r17, r18, r19, r20)
            return
        L_0x0bcd:
            java.lang.String r2 = "false"
            goto L_0x0ba8
        L_0x0bd0:
            java.lang.Object r1 = r0.A05
            X.6u6 r1 = (X.AnonymousClass6u6) r1
            java.lang.Object r6 = r0.A01
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A04
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A03
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A00
            X.7kO r2 = (X.C160057kO) r2
            java.lang.Object r3 = r0.A02
            X.6Ee r3 = (X.C128936Ee) r3
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x0bec:
            r2 = move-exception
            r5.compareAndSet(r7, r4)
            r14.countDown()
            X.1ei r0 = r6.A0F
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0c06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r21)
            java.lang.String r0 = "<file>"
            X.C36321k7.A1a(r1, r0)
        L_0x0c06:
            throw r2
        L_0x0c07:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c2e }
            java.lang.String r0 = "gdrive/encrypted-re-upload/backup-file/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0c2e }
            java.lang.String r0 = "<file>"
            X.C36351kA.A1Q(r0, r1, r2)     // Catch:{ all -> 0x0c2e }
            goto L_0x0c1e
        L_0x0c17:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)     // Catch:{ all -> 0x0c2e }
            r8.set(r0)     // Catch:{ all -> 0x0c2e }
        L_0x0c1e:
            r5.compareAndSet(r3, r4)
            r6.countDown()
        L_0x0c24:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r14)
        L_0x0c28:
            java.lang.String r0 = "<file>"
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0c2e:
            r2 = move-exception
            r5.compareAndSet(r3, r4)
            r6.countDown()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r14)
            java.lang.String r0 = "<file>"
            X.C36321k7.A1a(r1, r0)
            throw r2
        L_0x0c3f:
            r3.countDown()
            return
        L_0x0c43:
            r0 = move-exception
            r3.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75A.run():void");
    }

    public AnonymousClass75A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public AnonymousClass75A(Context context, C157087bo r3, C128916Ec r4, AnonymousClass6QA r5, AnonymousClass7eB r6) {
        this.A06 = 0;
        this.A02 = new C97484pl();
        this.A00 = context;
        this.A04 = r5;
        this.A05 = r4;
        this.A01 = r3;
        this.A03 = r6;
    }

    public AnonymousClass75A(AnonymousClass6u4 r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 1;
        AnonymousClass00C.A0D(x509Certificate, 2);
        C36341k9.A1F(r3, r4);
        this.A05 = r2;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }

    public AnonymousClass75A(C160057kO r2, C128936Ee r3, C145536u3 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 9;
        AnonymousClass00C.A0D(x509Certificate, 2);
        C36341k9.A1F(r2, r3);
        this.A05 = r4;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r2;
        this.A02 = r3;
    }

    public AnonymousClass75A(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 11;
        AnonymousClass00C.A0D(x509Certificate, 2);
        C36341k9.A1F(r2, r3);
        this.A05 = r4;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r2;
        this.A02 = r3;
    }
}
