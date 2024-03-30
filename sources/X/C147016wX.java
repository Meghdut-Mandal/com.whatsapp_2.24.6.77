package X;

import android.os.CancellationSignal;
import android.util.Base64;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.6wX  reason: invalid class name and case insensitive filesystem */
public class C147016wX implements C159597jc {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public boolean A03;
    public final CancellationSignal A04;
    public final C20810yC A05;
    public final AnonymousClass6FO A06;
    public final C1268465w A07;
    public final AnonymousClass6F6 A08;
    public final AnonymousClass6NX A09;
    public final C105535Fa A0A;
    public final AnonymousClass6TQ A0B;
    public final InputStream A0C;
    public final OutputStream A0D;
    public final C19970wo A0E;
    public final AnonymousClass17Z A0F;

    private void A00(C123905xH r8) {
        File file = r8.A02;
        if (file.exists()) {
            String str = r8.A04;
            byte[] A012 = A01();
            byte[] bArr = AnonymousClass6XZ.A00;
            AnonymousClass5D8 r0 = new AnonymousClass5D8(str.getBytes(C19430v1.A0B), A012, 204);
            OutputStream outputStream = this.A0D;
            CancellationSignal cancellationSignal = this.A04;
            AnonymousClass6XZ.A02(cancellationSignal, r0, outputStream);
            AnonymousClass6XZ.A02(cancellationSignal, new AnonymousClass5D9(new C164977sg(this, 13), file, A01(), 205), outputStream);
        }
    }

    public byte[] A01() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        C123895xG A002 = this.A06.A00();
        if (A002 != null) {
            return Base64.decode(A002.A03, 2);
        }
        throw C90524aI.A0X("Failed to initiate encryption, key is missing.");
    }

    public void cancel() {
        this.A04.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04cd, code lost:
        X.AnonymousClass6XZ.A02(r2, r7, r4.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04e6, code lost:
        r4.A0A.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0567, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x057e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x057f, code lost:
        X.AnonymousClass6XZ.A04(r4.A0A, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0584, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x057e A[ExcHandler: 5VR | IOException | InterruptedException (r1v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:245:0x056d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r4 = r31
            X.6TQ r3 = r4.A0B
            r0 = 9
            r3.A02(r0)
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
        L_0x000b:
            java.io.InputStream r8 = r4.A0C     // Catch:{ OperationCanceledException -> 0x0568 }
            android.os.CancellationSignal r2 = r4.A04     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6TD r1 = X.AnonymousClass6XZ.A01(r2, r8)     // Catch:{ OperationCanceledException -> 0x0568 }
            int r5 = r1.A01     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = 250(0xfa, float:3.5E-43)
            r6 = 0
            r13 = 1
            if (r5 == r0) goto L_0x04d4
            r0 = 251(0xfb, float:3.52E-43)
            if (r5 == r0) goto L_0x0555
            switch(r5) {
                case 100: goto L_0x021e;
                case 101: goto L_0x04a2;
                case 102: goto L_0x0024;
                case 103: goto L_0x026f;
                case 104: goto L_0x015d;
                default: goto L_0x0022;
            }     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0022:
            goto L_0x04dd
        L_0x0024:
            X.6NX r6 = r4.A09     // Catch:{ OperationCanceledException -> 0x0568 }
            X.65w r1 = r6.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "logging"
            java.io.File r7 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.FileOutputStream r5 = X.C90524aI.A0W(r7)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.5vI r8 = r6.A0I     // Catch:{ all -> 0x053f }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x053f }
            r0.<init>(r5)     // Catch:{ all -> 0x053f }
            android.util.JsonWriter r6 = new android.util.JsonWriter     // Catch:{ all -> 0x053f }
            r6.<init>(r0)     // Catch:{ all -> 0x053f }
            r6.beginObject()     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "attemptID"
            android.util.JsonWriter r9 = r6.name(r0)     // Catch:{ all -> 0x04ec }
            X.6FO r0 = r8.A01     // Catch:{ all -> 0x04ec }
            X.005 r0 = r0.A01     // Catch:{ all -> 0x04ec }
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "/export/logging/attemptId"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)     // Catch:{ all -> 0x04ec }
            r9.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "donorInfo"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            r6.beginObject()     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "deviceName"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x04ec }
            r1.append(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "appVersion"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "osVersion"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "buildType"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Integer r0 = X.C36371kC.A0o()     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "yearClass2016"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            X.0wg r1 = r8.A03     // Catch:{ all -> 0x04ec }
            X.0yb r0 = r8.A00     // Catch:{ all -> 0x04ec }
            int r0 = X.AnonymousClass1K2.A02(r0, r1)     // Catch:{ all -> 0x04ec }
            long r0 = (long) r0     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            r6.endObject()     // Catch:{ all -> 0x04ec }
            X.6TQ r0 = r8.A02     // Catch:{ all -> 0x04ec }
            java.util.List r1 = r0.A06     // Catch:{ all -> 0x04ec }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x04ec }
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r6.name(r0)     // Catch:{ all -> 0x04ec }
            r0.beginArray()     // Catch:{ all -> 0x04ec }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x04ec }
        L_0x00ca:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x04ec }
            X.58t r8 = (X.C1042258t) r8     // Catch:{ all -> 0x04ec }
            java.lang.Integer r0 = r8.A09     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.intValue()     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x00ca
            r6.beginObject()     // Catch:{ all -> 0x04ec }
            java.lang.String r0 = "eventTypeCode"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Integer r0 = r8.A09     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Long r0 = r8.A0B     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "duration"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Long r0 = r8.A0B     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
        L_0x00fb:
            java.lang.Long r0 = r8.A0I     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "progress"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Long r0 = r8.A0I     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
        L_0x0109:
            java.lang.Double r0 = r8.A00     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "exportedDbSize"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Double r0 = r8.A00     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
        L_0x0117:
            java.lang.Long r0 = r8.A0K     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "storageAvailableSize"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Long r0 = r8.A0K     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
        L_0x0125:
            java.lang.Double r0 = r8.A02     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = "waDbSize"
            r6.name(r0)     // Catch:{ all -> 0x04ec }
            java.lang.Double r0 = r8.A02     // Catch:{ all -> 0x04ec }
            r6.value(r0)     // Catch:{ all -> 0x04ec }
        L_0x0133:
            r6.endObject()     // Catch:{ all -> 0x04ec }
            goto L_0x00ca
        L_0x0137:
            r6.endArray()     // Catch:{ all -> 0x04ec }
        L_0x013a:
            r6.endObject()     // Catch:{ all -> 0x04ec }
            r1.clear()     // Catch:{ all -> 0x04ec }
            r6.close()     // Catch:{ all -> 0x053f }
            r5.close()     // Catch:{ OperationCanceledException -> 0x0568 }
            byte[] r6 = r4.A01()     // Catch:{ OperationCanceledException -> 0x0568 }
            r5 = 202(0xca, float:2.83E-43)
            r0 = 0
            X.5D9 r1 = new X.5D9     // Catch:{ OperationCanceledException -> 0x0568 }
            r1.<init>(r0, r7, r6, r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.OutputStream r0 = r4.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            X.AnonymousClass6XZ.A02(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            boolean r0 = r4.A03     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r0 == 0) goto L_0x000b
            goto L_0x04e6
        L_0x015d:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x0568 }
            r9 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0189
            X.6F6 r5 = r4.A08     // Catch:{ OperationCanceledException -> 0x0568 }
            long r0 = r5.A01()     // Catch:{ OperationCanceledException -> 0x0568 }
            r4.A01 = r0     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x0568 }
            X.3xe r5 = r5.A03()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0174:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04f1 }
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x04f1 }
            X.5xH r0 = (X.C123905xH) r0     // Catch:{ all -> 0x04f1 }
            r4.A00(r0)     // Catch:{ all -> 0x04f1 }
            goto L_0x0174
        L_0x0184:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04f1 }
            goto L_0x020d
        L_0x0189:
            X.65w r7 = r4.A07     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r5 = "missing"
            java.io.File r12 = r7.A00(r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            byte[] r14 = r4.A01()     // Catch:{ OperationCanceledException -> 0x0568 }
            r11 = 0
            r10 = r2
            r13 = r8
            r15 = r0
            X.AnonymousClass6XZ.A03(r10, r11, r12, r13, r14, r15)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6F6 r11 = r4.A08     // Catch:{ OperationCanceledException -> 0x0568 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.FileInputStream r7 = X.C90524aI.A0U(r12)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x0516 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0516 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0516 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0516 }
            r8.<init>(r0)     // Catch:{ all -> 0x0516 }
            X.5D0 r12 = new X.5D0     // Catch:{ all -> 0x050c }
            r12.<init>(r8)     // Catch:{ all -> 0x050c }
        L_0x01b7:
            boolean r0 = r12.A01()     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r0 = r12.A00()     // Catch:{ all -> 0x050c }
            X.6Mn r0 = (X.C130816Mn) r0     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x01b7
            X.1M0 r9 = X.C1270466s.A00(r11)     // Catch:{ all -> 0x050c }
            X.14e r13 = r9.A02     // Catch:{ all -> 0x0502 }
            java.lang.String r5 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.exported_path = ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0502 }
            r1[r6] = r0     // Catch:{ all -> 0x0502 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_EXPORTED_PATH_SINGLE"
            android.database.Cursor r5 = r13.A09(r5, r0, r1)     // Catch:{ all -> 0x0502 }
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x04f6 }
            if (r0 != 0) goto L_0x01e3
            r0 = 0
            goto L_0x01e7
        L_0x01e3:
            X.5xH r0 = X.AnonymousClass6MK.A00(r5)     // Catch:{ all -> 0x04f6 }
        L_0x01e7:
            r5.close()     // Catch:{ all -> 0x0502 }
            r9.close()     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x01b7
            r10.add(r0)     // Catch:{ all -> 0x050c }
            goto L_0x01b7
        L_0x01f3:
            r8.close()     // Catch:{ all -> 0x0516 }
            r7.close()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x01fd:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r0 == 0) goto L_0x0210
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0568 }
            X.5xH r0 = (X.C123905xH) r0     // Catch:{ OperationCanceledException -> 0x0568 }
            r4.A00(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x01fd
        L_0x020d:
            r5.close()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0210:
            r0 = 250(0xfa, float:3.5E-43)
            X.6TD r1 = new X.6TD     // Catch:{ OperationCanceledException -> 0x0568 }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.OutputStream r0 = r4.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            X.AnonymousClass6XZ.A02(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x000b
        L_0x021e:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x0568 }
            X.0yC r7 = r4.A05     // Catch:{ OperationCanceledException -> 0x0568 }
            r5 = 6448(0x1930, float:9.036E-42)
            int r7 = r7.A07(r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            int r5 = (int) r0     // Catch:{ OperationCanceledException -> 0x0568 }
            byte[] r5 = new byte[r5]     // Catch:{ OperationCanceledException -> 0x0568 }
            int r1 = r8.read(r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = -1
            if (r1 == r0) goto L_0x051b
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r5, r6, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            int r0 = r0.getInt()     // Catch:{ OperationCanceledException -> 0x0568 }
            int r6 = java.lang.Math.min(r7, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6FO r0 = r4.A06     // Catch:{ OperationCanceledException -> 0x0568 }
            X.005 r5 = r0.A01     // Catch:{ OperationCanceledException -> 0x0568 }
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "/export/protocolVersion"
            X.C36341k9.A0v(r1, r0, r6)     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = 3
            if (r6 >= r0) goto L_0x0250
            r13 = 0
        L_0x0250:
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r5)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "/export/usingDbForTransfer"
            X.C36331k8.A0w(r1, r0, r13)     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.putInt(r6)     // Catch:{ OperationCanceledException -> 0x0568 }
            byte[] r5 = r0.array()     // Catch:{ OperationCanceledException -> 0x0568 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 0
            X.5D8 r7 = new X.5D8     // Catch:{ OperationCanceledException -> 0x0568 }
            r7.<init>(r5, r0, r1)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x04cd
        L_0x026f:
            X.6NX r9 = r4.A09     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6FO r0 = r4.A06     // Catch:{ OperationCanceledException -> 0x0568 }
            boolean r11 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.File r0 = r9.A02     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r0 != 0) goto L_0x041e
            X.6TQ r8 = r9.A0H     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = 10
            r8.A02(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            r18 = 0
            X.0wQ r0 = r9.A03     // Catch:{ OperationCanceledException -> 0x0568 }
            r30 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r30)     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r0 != 0) goto L_0x02ca
            java.lang.String r0 = "fpm/ExportHelper/Temporarily setting me object for export"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.0v0 r0 = r9.A05     // Catch:{ OperationCanceledException -> 0x0568 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "saved_user_before_logout"
            java.lang.String r10 = X.C36371kC.A0t(r1, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r7 = X.AnonymousClass3SI.A02(r10)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r5 = X.AnonymousClass3U2.A03(r10)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x02ac
            r7 = r0
        L_0x02ac:
            if (r5 != 0) goto L_0x02af
            r5 = r0
        L_0x02af:
            com.whatsapp.Me r1 = new com.whatsapp.Me     // Catch:{ OperationCanceledException -> 0x0568 }
            r1.<init>(r7, r5, r10)     // Catch:{ OperationCanceledException -> 0x0568 }
            r30.A0G()     // Catch:{ OperationCanceledException -> 0x0568 }
            r0 = r30
            X.C19730wQ.A01(r1, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.12P r0 = r9.A08     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.A06()     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.A08 = r13     // Catch:{ OperationCanceledException -> 0x0568 }
            X.12t r0 = r9.A06     // Catch:{ OperationCanceledException -> 0x0568 }
            X.C220712t.A02(r0, r6)     // Catch:{ OperationCanceledException -> 0x0568 }
            r18 = 1
        L_0x02ca:
            java.lang.String r17 = "fpm/ExportHelper/Clearing me object"
            if (r11 == 0) goto L_0x03c5
            r12 = 505(0x1f9, float:7.08E-43)
            X.65w r0 = r9.A0D     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            android.content.Context r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.String r0 = "migration/export/sandbox"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.String r11 = X.AnonymousClass6XZ.A01     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.io.File r14 = X.C36441kJ.A0w(r0, r11)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r9.A02 = r14     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.1Q9 r10 = r9.A07     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.5Zc r7 = new X.5Zc     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r7.<init>(r9, r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/to "
            r1.append(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.String r0 = r14.getName()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.C36321k7.A1a(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.5U6 r5 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.1CS r0 = r10.A0X     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r27 = r0
            X.0wQ r0 = r10.A05     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r19 = r0
            X.1CY r0 = r10.A0G     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r23 = r0
            X.1Ck r0 = r10.A06     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r21 = r0
            X.1Cb r0 = r10.A0A     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r16 = r0
            X.1Cg r15 = r10.A0W     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.0yF r1 = r10.A0U     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.005 r0 = r10.A0b     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.6Uy r0 = (X.C132716Uy) r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r29 = 0
            r20 = r0
            r22 = r16
            r24 = r1
            r25 = r15
            r26 = r5
            r28 = r14
            X.6QE r14 = X.C109765Za.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.12P r0 = r10.A0K     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.io.File r15 = r0.A03     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            long r0 = r15.length()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.io.File r0 = X.AnonymousClass1Q9.A03(r10, r15, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r14.A07(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            X.6F6 r14 = r9.A0F     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            java.io.File r0 = r9.A02     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            long r15 = r14.A02(r0, r11, r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r10 = 0
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x03bd
            X.005 r0 = r9.A0M     // Catch:{ OperationCanceledException -> 0x0406 }
            java.util.Iterator r12 = X.C90474aD.A0q(r0)     // Catch:{ OperationCanceledException -> 0x0406 }
        L_0x035a:
            boolean r0 = r12.hasNext()     // Catch:{ OperationCanceledException -> 0x0406 }
            if (r0 == 0) goto L_0x03b3
            java.lang.Object r10 = r12.next()     // Catch:{ OperationCanceledException -> 0x0406 }
            X.1CP r10 = (X.AnonymousClass1CP) r10     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r7 = r10.A0J()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "fpm/ExportHelper/backup/local/"
            X.C36321k7.A1Q(r0, r7, r1)     // Catch:{ OperationCanceledException -> 0x0406 }
            X.6PN r1 = r10.A0O(r5)     // Catch:{ OperationCanceledException -> 0x0406 }
            if (r1 == 0) goto L_0x035a
            boolean r0 = r1.A04     // Catch:{ OperationCanceledException -> 0x0406 }
            if (r0 == 0) goto L_0x03a6
            java.io.File r1 = r1.A01     // Catch:{ OperationCanceledException -> 0x0406 }
            if (r1 == 0) goto L_0x039f
            java.lang.String r0 = r1.getName()     // Catch:{ OperationCanceledException -> 0x0406 }
            long r0 = r14.A02(r1, r0, r6)     // Catch:{ OperationCanceledException -> 0x0406 }
            r10 = 0
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x035a
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r7 = "fpm/ExportHelper/exportOtherSettings()/Failed to register optional file: "
            r10.append(r7)     // Catch:{ OperationCanceledException -> 0x0406 }
            r10.append(r0)     // Catch:{ OperationCanceledException -> 0x0406 }
        L_0x039b:
            X.C90504aG.A1G(r10)     // Catch:{ OperationCanceledException -> 0x0406 }
            goto L_0x035a
        L_0x039f:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "fpm/ExportHelper/exportOtherSettings()/file not included in successful result with name: "
            goto L_0x03ac
        L_0x03a6:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "fpm/ExportHelper/exportOtherSettings()/failed-to-generate-backup "
        L_0x03ac:
            r10.append(r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            r10.append(r7)     // Catch:{ OperationCanceledException -> 0x0406 }
            goto L_0x039b
        L_0x03b3:
            X.179 r0 = r9.A04     // Catch:{ OperationCanceledException -> 0x0406 }
            java.io.File r0 = r0.A04()     // Catch:{ OperationCanceledException -> 0x0406 }
            X.AnonymousClass6NX.A00(r9, r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            goto L_0x040c
        L_0x03bd:
            java.lang.String r1 = "exportMessageStore()/Failed to register message store db file"
            X.5R7 r0 = new X.5R7     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            r0.<init>(r12, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
            throw r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03fe }
        L_0x03c5:
            X.65w r1 = r9.A0D     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "messages"
            java.io.File r1 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            r9.A02 = r1     // Catch:{ OperationCanceledException -> 0x0406 }
            X.6Xj r0 = r9.A0B     // Catch:{ OperationCanceledException -> 0x0406 }
            r0.A0H(r2, r1)     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "fpm/ExportHelper/exportMessagesWithProtobuf()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            X.6F6 r5 = r9.A0F     // Catch:{ OperationCanceledException -> 0x0406 }
            java.io.File r1 = r9.A02     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r0 = "migration/messages_export.zip"
            long r0 = r5.A02(r1, r0, r13)     // Catch:{ OperationCanceledException -> 0x0406 }
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x040c
            r9.A01()     // Catch:{ OperationCanceledException -> 0x0406 }
            r7 = 504(0x1f8, float:7.06E-43)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0406 }
            java.lang.String r5 = "exportMessagesWithProtobuf()/Failed to register master file: "
            java.lang.String r0 = X.C36381kD.A0z(r5, r6, r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            X.5R7 r1 = new X.5R7     // Catch:{ OperationCanceledException -> 0x0406 }
            r1.<init>(r7, r0)     // Catch:{ OperationCanceledException -> 0x0406 }
            goto L_0x0405
        L_0x03fe:
            java.lang.String r0 = "exportMessageStore()/Failed to create backup"
            X.5R7 r1 = new X.5R7     // Catch:{ OperationCanceledException -> 0x0406 }
            r1.<init>(r12, r0)     // Catch:{ OperationCanceledException -> 0x0406 }
        L_0x0405:
            throw r1     // Catch:{ OperationCanceledException -> 0x0406 }
        L_0x0406:
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0522 }
            r2.throwIfCanceled()     // Catch:{ all -> 0x0522 }
        L_0x040c:
            if (r18 == 0) goto L_0x0419
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ OperationCanceledException -> 0x0568 }
            r30.A0D()     // Catch:{ OperationCanceledException -> 0x0568 }
            X.1QN r0 = r9.A09     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0419:
            r0 = 11
            r8.A02(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x041e:
            r0 = 12
            r3.A02(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.File r0 = r9.A02     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r0 == 0) goto L_0x055d
            java.io.File r6 = r9.A01     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r6 != 0) goto L_0x0495
            X.65w r1 = r9.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "manifest"
            java.io.File r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            r9.A01 = r0     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6F6 r8 = r9.A0F     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.FileOutputStream r5 = X.C90524aI.A0W(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x053f }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x053f }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x053f }
            android.util.JsonWriter r6 = new android.util.JsonWriter     // Catch:{ all -> 0x053f }
            r6.<init>(r0)     // Catch:{ all -> 0x053f }
            long r0 = r8.A01()     // Catch:{ all -> 0x0530 }
            r6.beginObject()     // Catch:{ all -> 0x0530 }
            java.lang.String r7 = "totalSize"
            android.util.JsonWriter r7 = r6.name(r7)     // Catch:{ all -> 0x0530 }
            r7.value(r0)     // Catch:{ all -> 0x0530 }
            java.lang.String r0 = "relativePaths"
            r6.name(r0)     // Catch:{ all -> 0x0530 }
            r6.beginArray()     // Catch:{ all -> 0x0530 }
            X.3xe r7 = r8.A03()     // Catch:{ all -> 0x0530 }
        L_0x0463:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0526 }
            if (r0 == 0) goto L_0x0480
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0526 }
            X.5xH r1 = (X.C123905xH) r1     // Catch:{ all -> 0x0526 }
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x0526 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0526 }
            if (r0 != 0) goto L_0x0463
            X.6Mn r0 = new X.6Mn     // Catch:{ all -> 0x0526 }
            r0.<init>(r1)     // Catch:{ all -> 0x0526 }
            r0.A00(r6)     // Catch:{ all -> 0x0526 }
            goto L_0x0463
        L_0x0480:
            r7.close()     // Catch:{ all -> 0x0530 }
            r6.endArray()     // Catch:{ all -> 0x0530 }
            android.util.JsonWriter r0 = r6.endObject()     // Catch:{ all -> 0x0530 }
            r0.flush()     // Catch:{ all -> 0x0530 }
            r6.close()     // Catch:{ all -> 0x053f }
            r5.close()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.File r6 = r9.A01     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0495:
            byte[] r5 = r4.A01()     // Catch:{ OperationCanceledException -> 0x0568 }
            r1 = 203(0xcb, float:2.84E-43)
            r0 = 0
            X.5D9 r7 = new X.5D9     // Catch:{ OperationCanceledException -> 0x0568 }
            r7.<init>(r0, r6, r5, r1)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x04cd
        L_0x04a2:
            X.6NX r7 = r4.A09     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.File r5 = r7.A00     // Catch:{ OperationCanceledException -> 0x0568 }
            if (r5 != 0) goto L_0x04c5
            X.65w r1 = r7.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "enc-metadata"
            java.io.File r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            r7.A00 = r0     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x0568 }
            r5.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            X.6F7 r0 = r7.A0C     // Catch:{ all -> 0x053f }
            r0.A03(r2, r5, r6)     // Catch:{ all -> 0x053f }
            r5.close()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.File r5 = r7.A00     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x04c5:
            r1 = 0
            r0 = 201(0xc9, float:2.82E-43)
            X.5D9 r7 = new X.5D9     // Catch:{ OperationCanceledException -> 0x0568 }
            r7.<init>(r1, r5, r1, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x04cd:
            java.io.OutputStream r0 = r4.A0D     // Catch:{ OperationCanceledException -> 0x0568 }
            X.AnonymousClass6XZ.A02(r2, r7, r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x000b
        L_0x04d4:
            r0 = 13
            r3.A02(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            r4.A03 = r13     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x000b
        L_0x04dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0568 }
            java.lang.String r0 = "fpm/DonorChatTransferTask/Received unexpected message with type: "
            X.C36321k7.A1S(r0, r1, r5)     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x04e6:
            X.5Fa r0 = r4.A0A     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.A01()     // Catch:{ OperationCanceledException -> 0x0568 }
            return
        L_0x04ec:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x053a }
            goto L_0x053e
        L_0x04f1:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0544 }
            goto L_0x0554
        L_0x04f6:
            r1 = move-exception
            if (r5 == 0) goto L_0x0501
            r5.close()     // Catch:{ all -> 0x04fd }
            goto L_0x0501
        L_0x04fd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0502 }
        L_0x0501:
            throw r1     // Catch:{ all -> 0x0502 }
        L_0x0502:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0507 }
            goto L_0x050b
        L_0x0507:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x050c }
        L_0x050b:
            throw r1     // Catch:{ all -> 0x050c }
        L_0x050c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0511 }
            goto L_0x0515
        L_0x0511:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0516 }
        L_0x0515:
            throw r1     // Catch:{ all -> 0x0516 }
        L_0x0516:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0544 }
            goto L_0x0554
        L_0x051b:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x0567
        L_0x0522:
            r1 = move-exception
            if (r18 == 0) goto L_0x0554
            goto L_0x0549
        L_0x0526:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x052b }
            goto L_0x052f
        L_0x052b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0530 }
        L_0x052f:
            throw r1     // Catch:{ all -> 0x0530 }
        L_0x0530:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0535 }
            goto L_0x053e
        L_0x0535:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x053f }
            goto L_0x053e
        L_0x053a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x053f }
        L_0x053e:
            throw r1     // Catch:{ all -> 0x053f }
        L_0x053f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0544 }
            goto L_0x0554
        L_0x0544:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x0554
        L_0x0549:
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ OperationCanceledException -> 0x0568 }
            r30.A0D()     // Catch:{ OperationCanceledException -> 0x0568 }
            X.1QN r0 = r9.A09     // Catch:{ OperationCanceledException -> 0x0568 }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0554:
            throw r1     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0555:
            int r0 = r1.A00     // Catch:{ OperationCanceledException -> 0x0568 }
            X.5VR r1 = new X.5VR     // Catch:{ OperationCanceledException -> 0x0568 }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            goto L_0x0567
        L_0x055d:
            java.lang.String r0 = "fpm/ExportHelper/getManifestFile()/manifest file requested before messages exported"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0568 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ OperationCanceledException -> 0x0568 }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0567:
            throw r1     // Catch:{ OperationCanceledException -> 0x0568 }
        L_0x0568:
            r5 = 2
            r3 = 251(0xfb, float:3.52E-43)
            r0 = 0
            X.6TD r2 = new X.6TD     // Catch:{ 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e }
            r2.<init>((int) r3, (long) r0, (int) r5)     // Catch:{ 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e }
            java.io.OutputStream r1 = r4.A0D     // Catch:{ 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e }
            r0 = 0
            X.AnonymousClass6XZ.A02(r0, r2, r1)     // Catch:{ 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e }
            java.lang.String r0 = "fpm/DonorChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e, 5VR | IOException | InterruptedException -> 0x057e }
            return
        L_0x057e:
            r1 = move-exception
            X.5Fa r0 = r4.A0A
            X.AnonymousClass6XZ.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147016wX.run():void");
    }

    public C147016wX(C19970wo r3, AnonymousClass17Z r4, C20810yC r5, AnonymousClass6FO r6, C1268465w r7, AnonymousClass6F6 r8, AnonymousClass6NX r9, C105535Fa r10, AnonymousClass6TQ r11, InputStream inputStream, OutputStream outputStream) {
        this.A0E = r3;
        this.A05 = r5;
        this.A0C = inputStream;
        this.A0D = outputStream;
        this.A09 = r9;
        this.A0B = r11;
        this.A07 = r7;
        this.A0A = r10;
        this.A08 = r8;
        this.A06 = r6;
        this.A0F = r4;
        this.A04 = new CancellationSignal();
    }
}
