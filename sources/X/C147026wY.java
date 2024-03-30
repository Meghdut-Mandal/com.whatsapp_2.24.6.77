package X;

import android.os.CancellationSignal;
import android.util.Base64;
import android.util.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6wY  reason: invalid class name and case insensitive filesystem */
public class C147026wY implements C159597jc {
    public int A00;
    public int A01 = 0;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public File A06;
    public boolean A07;
    public final CancellationSignal A08;
    public final AnonymousClass179 A09;
    public final C128596Cw A0A;
    public final C1275868w A0B;
    public final AnonymousClass6FO A0C;
    public final C125055zF A0D;
    public final C105535Fa A0E;
    public final AnonymousClass6TQ A0F;
    public final InputStream A0G;
    public final OutputStream A0H;
    public final C19970wo A0I;
    public final AnonymousClass17Z A0J;
    public final C20810yC A0K;
    public final C111145bo A0L;

    private void A00(long j) {
        JsonReader A0K2;
        AnonymousClass5R7 r1;
        File A002 = this.A0B.A00("manifest.json");
        Long l = null;
        AnonymousClass6XZ.A03(this.A08, (C25711Hj) null, A002, this.A0G, A01(), j);
        FileInputStream A0U = C90524aI.A0U(A002);
        try {
            A0K2 = C90474aD.A0K(A0U);
            A0K2.beginObject();
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (A0K2.hasNext()) {
                String nextName = A0K2.nextName();
                if ("attemptID".equals(nextName)) {
                    str = A0K2.nextString();
                } else if ("donorInfo".equals(nextName)) {
                    A0K2.beginObject();
                    while (A0K2.hasNext()) {
                        String nextName2 = A0K2.nextName();
                        if ("deviceName".equals(nextName2)) {
                            str2 = A0K2.nextString();
                        } else if ("appVersion".equals(nextName2)) {
                            str3 = A0K2.nextString();
                        } else if ("osVersion".equals(nextName2)) {
                            str4 = A0K2.nextString();
                        } else if ("buildType".equals(nextName2)) {
                            num = Integer.valueOf(A0K2.nextInt());
                        } else if ("yearClass2016".equals(nextName2)) {
                            l = Long.valueOf(A0K2.nextLong());
                        } else {
                            A0K2.skipValue();
                        }
                    }
                    A0K2.endObject();
                } else if ("loggingEvents".equals(nextName)) {
                    arrayList = AnonymousClass001.A0I();
                    A0K2.beginArray();
                    while (A0K2.hasNext()) {
                        C1042258t r2 = new C1042258t();
                        A0K2.beginObject();
                        while (A0K2.hasNext()) {
                            String nextName3 = A0K2.nextName();
                            if ("eventTypeCode".equals(nextName3)) {
                                r2.A09 = Integer.valueOf(A0K2.nextInt());
                            } else if ("duration".equals(nextName3)) {
                                r2.A0B = Long.valueOf(A0K2.nextLong());
                            } else if ("progress".equals(nextName3)) {
                                r2.A0I = Long.valueOf(A0K2.nextLong());
                            } else if ("exportedDbSize".equals(nextName3)) {
                                r2.A00 = Double.valueOf(A0K2.nextDouble());
                            } else if ("waDbSize".equals(nextName3)) {
                                r2.A02 = Double.valueOf(A0K2.nextDouble());
                            } else {
                                A0K2.skipValue();
                            }
                        }
                        A0K2.endObject();
                        arrayList.add(r2);
                    }
                    A0K2.endArray();
                } else {
                    A0K2.skipValue();
                }
            }
            A0K2.endObject();
            if (str == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: attemptId is missing.");
            } else if (str2 == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: donorDeviceName is missing.");
            } else if (str3 == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: donorAppVersion is missing.");
            } else if (str4 == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: donorOsVersion is missing.");
            } else if (num == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: donorAppBuild is missing.");
            } else if (l == null) {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: donorYearClass is missing.");
            } else if (arrayList != null) {
                int intValue = num.intValue();
                long longValue = l.longValue();
                A0K2.close();
                A0U.close();
                C36341k9.A0x(C90464aC.A0C(this.A0C.A01), "/export/logging/attemptId", str);
                AnonymousClass6TQ r4 = this.A0F;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1042258t r3 = (C1042258t) it.next();
                    AnonymousClass6FO r12 = r4.A02;
                    r3.A0P = r12.A02();
                    AnonymousClass005 r22 = r12.A01;
                    String A0t = C36371kC.A0t(C36391kE.A0H(r22), "/export/logging/attemptId");
                    if (A0t == null) {
                        A0t = C36361kB.A0l();
                        C36341k9.A0x(C90464aC.A0C(r22), "/export/logging/attemptId", A0t);
                    }
                    r3.A0L = A0t;
                    r3.A04 = C36381kD.A0m();
                    r3.A0N = str2;
                    r3.A0M = str3;
                    r3.A0O = str4;
                    r3.A05 = Integer.valueOf(intValue);
                    r3.A0A = Long.valueOf(longValue);
                    r4.A01.Bly(r3);
                }
                return;
            } else {
                r1 = new AnonymousClass5R7(201, "Invalid metadata file: loggingEvents are missing.");
            }
            throw r1;
        } catch (Throwable th) {
            try {
                A0U.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A01() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        String A002 = this.A0A.A00(C132986Wc.A0L);
        if (A002 != null) {
            return Base64.decode(A002, 2);
        }
        throw new AnonymousClass5R7(105, "Failed to initiate decryption, key is missing.");
    }

    public void cancel() {
        this.A08.cancel();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:82|(5:84|85|(1:95)(1:89)|90|(3:94|221|220))|96|97|222|220|80) */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x036b, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r1 = new X.AnonymousClass5R7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0468, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0469, code lost:
        X.AnonymousClass6XZ.A04(r8.A0E, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x046e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0201, code lost:
        r3 = new X.AnonymousClass6TD(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x040e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x02a9 */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0468 A[ExcHandler: 5VR | IOException (r1v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:193:0x0457] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r8 = r21
            X.6TQ r0 = r8.A0F
            r20 = r0
            r1 = 9
            r0.A02(r1)
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.0yC r1 = r8.A0K     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r0 = X.AnonymousClass6XZ.A00     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 6448(0x1930, float:9.036E-42)
            int r1 = r1.A07(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.putInt(r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r2 = r0.array()     // Catch:{ OperationCanceledException -> 0x0452 }
            r1 = 100
            r0 = 0
            X.5D8 r3 = new X.5D8     // Catch:{ OperationCanceledException -> 0x0452 }
            r3.<init>(r2, r0, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.OutputStream r10 = r8.A0H     // Catch:{ OperationCanceledException -> 0x0452 }
            android.os.CancellationSignal r7 = r8.A08     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x002f:
            X.AnonymousClass6XZ.A02(r7, r3, r10)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x0032:
            java.io.InputStream r3 = r8.A0G     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6TD r1 = X.AnonymousClass6XZ.A01(r7, r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            int r2 = r1.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            r4 = 250(0xfa, float:3.5E-43)
            if (r2 == r4) goto L_0x0208
            r0 = 251(0xfb, float:3.52E-43)
            if (r2 == r0) goto L_0x0420
            r9 = 1
            switch(r2) {
                case 200: goto L_0x01ce;
                case 201: goto L_0x00d4;
                case 202: goto L_0x0048;
                case 203: goto L_0x0130;
                case 204: goto L_0x0057;
                case 205: goto L_0x0369;
                default: goto L_0x0046;
            }     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x0046:
            goto L_0x035e
        L_0x0048:
            boolean r0 = r8.A07     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x004e
            goto L_0x036f
        L_0x004e:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            r8.A00(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0201
        L_0x0057:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r4 = r8.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            r7.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r4 == 0) goto L_0x0076
            X.5RB r2 = new X.5RB     // Catch:{ SocketException -> 0x040e }
            r2.<init>(r3, r0)     // Catch:{ SocketException -> 0x040e }
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()     // Catch:{ SocketException -> 0x040e }
            r0 = 0
            X.AnonymousClass6XZ.A05(r0, r2, r1, r4)     // Catch:{ SocketException -> 0x040e }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ SocketException -> 0x040e }
            java.lang.String r1 = r1.toString(r0)     // Catch:{ SocketException -> 0x040e }
            goto L_0x0087
        L_0x0076:
            int r2 = (int) r0     // Catch:{ SocketException -> 0x040e }
            byte[] r2 = new byte[r2]     // Catch:{ SocketException -> 0x040e }
            int r1 = r3.read(r2)     // Catch:{ SocketException -> 0x040e }
            r0 = -1
            if (r1 == r0) goto L_0x0407
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ SocketException -> 0x040e }
            java.lang.String r1 = new java.lang.String     // Catch:{ SocketException -> 0x040e }
            r1.<init>(r2, r0)     // Catch:{ SocketException -> 0x040e }
        L_0x0087:
            X.6FO r0 = r8.A0C     // Catch:{ OperationCanceledException -> 0x0452 }
            boolean r0 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "Media/"
            boolean r0 = r1.contains(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x00cd
            X.179 r0 = r8.A09     // Catch:{ OperationCanceledException -> 0x0452 }
            X.005 r0 = r0.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.Object r0 = r0.get()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r13 = X.C36441kJ.A0w(r0, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r0 = r13.getParentFile()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x00b2
            java.io.File r0 = r13.getParentFile()     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.mkdirs()     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x00b2:
            X.6TD r0 = X.AnonymousClass6XZ.A01(r7, r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            long r0 = r0.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r15 = r8.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            r4 = 14
            X.7sg r2 = new X.7sg     // Catch:{ OperationCanceledException -> 0x0452 }
            r2.<init>(r8, r4)     // Catch:{ OperationCanceledException -> 0x0452 }
            r11 = r7
            r12 = r2
            r14 = r3
            r16 = r0
            X.AnonymousClass6XZ.A03(r11, r12, r13, r14, r15, r16)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x0032
        L_0x00cd:
            X.68w r0 = r8.A0B     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r13 = r0.A00(r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x00b2
        L_0x00d4:
            long r1 = r1.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = (int) r1     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r2 = new byte[r0]     // Catch:{ OperationCanceledException -> 0x0452 }
            int r1 = r3.read(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = -1
            if (r1 == r0) goto L_0x0414
            X.5zF r5 = r8.A0D     // Catch:{ OperationCanceledException -> 0x0452 }
            X.614 r1 = r5.A08     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6My r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.62z r4 = r0.A00     // Catch:{ OperationCanceledException -> 0x0452 }
            X.19J r0 = r5.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r0.A04     // Catch:{ OperationCanceledException -> 0x0452 }
            r3 = 2
            if (r0 == r3) goto L_0x0110
            X.5Fa r1 = r5.A0D     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 102(0x66, float:1.43E-43)
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.19A r2 = r5.A05     // Catch:{ 1ej -> 0x0106 }
            r0 = 60000(0xea60, float:8.4078E-41)
            long r0 = (long) r0     // Catch:{ 1ej -> 0x0106 }
            r2.A0B(r0)     // Catch:{ 1ej -> 0x0106 }
            goto L_0x0110
        L_0x0106:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "fpm/ImportHelper/Thread interrupted while waiting for user to connect to the internet, "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x0110:
            X.6NF r5 = r5.A07     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r2 = r4.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r1 = r4.A00     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = r4.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            X.5xG r0 = r5.A01(r7, r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6Cw r2 = r8.A0A     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r1 = r0.A03     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "import/metadata/key"
            r2.A01(r0, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r0 = r8.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            android.util.Base64.encodeToString(r0, r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0201
        L_0x0130:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            X.68w r4 = r8.A0B     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r2 = "manifest.json"
            java.io.File r2 = r4.A00(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            r8.A06 = r2     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r15 = r8.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            r12 = 0
            r11 = r7
            r13 = r2
            r14 = r3
            r16 = r0
            X.AnonymousClass6XZ.A03(r11, r12, r13, r14, r15, r16)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r0 = r8.A06     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.FileInputStream r9 = X.C90524aI.A0U(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x0448 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0448 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0448 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x0448 }
            r6.<init>(r0)     // Catch:{ all -> 0x0448 }
            r6.beginObject()     // Catch:{ all -> 0x041b }
            r4 = 0
            r0 = 0
        L_0x0162:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x041b }
            if (r2 == 0) goto L_0x017d
            java.lang.String r3 = r6.nextName()     // Catch:{ all -> 0x041b }
            java.lang.String r2 = "totalSize"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x041b }
            if (r2 == 0) goto L_0x0179
            long r0 = r6.nextLong()     // Catch:{ all -> 0x041b }
            goto L_0x0162
        L_0x0179:
            r6.skipValue()     // Catch:{ all -> 0x041b }
            goto L_0x0162
        L_0x017d:
            r6.endObject()     // Catch:{ all -> 0x041b }
            r6.close()     // Catch:{ all -> 0x0448 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x0452 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0190
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/parseFpmManifestInfo/failed to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x01a2
        L_0x0190:
            X.5mO r2 = new X.5mO     // Catch:{ OperationCanceledException -> 0x0452 }
            r2.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            long r1 = r2.A00     // Catch:{ OperationCanceledException -> 0x0452 }
            r8.A04 = r1     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Parsed manifest file, totalSizeExpected="
            X.C36321k7.A1V(r0, r3, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x01a2:
            long r0 = r8.A04     // Catch:{ OperationCanceledException -> 0x0452 }
            double r4 = (double) r0     // Catch:{ OperationCanceledException -> 0x0452 }
            long r2 = r8.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            long r0 = r8.A03     // Catch:{ OperationCanceledException -> 0x0452 }
            r15 = 12
            r6 = r20
            X.0wU r9 = r6.A05     // Catch:{ OperationCanceledException -> 0x0452 }
            X.73W r6 = new X.73W     // Catch:{ OperationCanceledException -> 0x0452 }
            r11 = r6
            r12 = r20
            r13 = r4
            r16 = r2
            r18 = r0
            r11.<init>(r12, r13, r15, r16, r18)     // Catch:{ OperationCanceledException -> 0x0452 }
            r9.Boy(r6)     // Catch:{ OperationCanceledException -> 0x0452 }
            r1 = 104(0x68, float:1.46E-43)
            X.6TD r0 = new X.6TD     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.AnonymousClass6XZ.A02(r7, r0, r10)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x0032
        L_0x01ce:
            long r1 = r1.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = (int) r1     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r2 = new byte[r0]     // Catch:{ OperationCanceledException -> 0x0452 }
            int r1 = r3.read(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = -1
            if (r1 == r0) goto L_0x0428
            r1 = 0
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            int r2 = r0.getInt()     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6FO r0 = r8.A0C     // Catch:{ OperationCanceledException -> 0x0452 }
            X.005 r3 = r0.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "/export/protocolVersion"
            X.C36341k9.A0v(r1, r0, r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 3
            boolean r2 = X.C36371kC.A1T(r2, r0)
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "/export/usingDbForTransfer"
            X.C36331k8.A0w(r1, r0, r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 101(0x65, float:1.42E-43)
        L_0x0201:
            X.6TD r3 = new X.6TD     // Catch:{ OperationCanceledException -> 0x0452 }
            r3.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x002f
        L_0x0208:
            int r0 = r8.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r2 = r8.A06     // Catch:{ OperationCanceledException -> 0x0452 }
            X.68w r6 = r8.A0B     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r3 = "missing_paths.json"
            java.io.File r19 = r6.A01(r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            boolean r0 = r19.exists()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x022a
            long r13 = r19.length()     // Catch:{ OperationCanceledException -> 0x0452 }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x022a
            r2 = r19
        L_0x022a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/getMissingFiles/verification attempt #"
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r8.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r11 = " of "
            r1.append(r11)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 5
            X.C36321k7.A1Y(r1, r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 0
            r8.A02 = r0     // Catch:{ OperationCanceledException -> 0x0452 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.FileInputStream r9 = X.C90524aI.A0U(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r2 = X.C19430v1.A0B     // Catch:{ all -> 0x0448 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0448 }
            r0.<init>(r9, r2)     // Catch:{ all -> 0x0448 }
            android.util.JsonReader r12 = new android.util.JsonReader     // Catch:{ all -> 0x0448 }
            r12.<init>(r0)     // Catch:{ all -> 0x0448 }
            X.5D0 r13 = new X.5D0     // Catch:{ all -> 0x043e }
            r13.<init>(r12)     // Catch:{ all -> 0x043e }
        L_0x025e:
            boolean r0 = r13.A01()     // Catch:{ all -> 0x043e }
            if (r0 == 0) goto L_0x02b6
            long r0 = r8.A02     // Catch:{ all -> 0x043e }
            r14 = 1
            long r0 = r0 + r14
            r8.A02 = r0     // Catch:{ all -> 0x043e }
            java.lang.Object r15 = r13.A00()     // Catch:{ all -> 0x043e }
            X.6Mn r15 = (X.C130816Mn) r15     // Catch:{ all -> 0x043e }
            java.lang.String r14 = r15.A02     // Catch:{ all -> 0x043e }
            if (r14 == 0) goto L_0x02a9
            X.6FO r0 = r8.A0C     // Catch:{ IOException -> 0x02a9 }
            boolean r0 = r0.A05()     // Catch:{ IOException -> 0x02a9 }
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = "Media/"
            boolean r0 = r14.contains(r0)     // Catch:{ IOException -> 0x02a9 }
            if (r0 == 0) goto L_0x02a4
            X.179 r0 = r8.A09     // Catch:{ IOException -> 0x02a9 }
            X.005 r0 = r0.A01     // Catch:{ IOException -> 0x02a9 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x02a9 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x02a9 }
            java.io.File r1 = X.C36441kJ.A0w(r0, r14)     // Catch:{ IOException -> 0x02a9 }
        L_0x0293:
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x02a9 }
            if (r0 == 0) goto L_0x02a9
            long r17 = r1.length()     // Catch:{ IOException -> 0x02a9 }
            long r0 = r15.A01     // Catch:{ IOException -> 0x02a9 }
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x02a9
            goto L_0x025e
        L_0x02a4:
            java.io.File r1 = r6.A01(r14)     // Catch:{ IOException -> 0x02a9 }
            goto L_0x0293
        L_0x02a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x043e }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/unable to verify file, path: "
            X.C36321k7.A1R(r0, r14, r1)     // Catch:{ all -> 0x043e }
            r5.add(r15)     // Catch:{ all -> 0x043e }
            goto L_0x025e
        L_0x02b6:
            r12.close()     // Catch:{ all -> 0x0448 }
            r9.close()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/getMissingFiles/missing "
            X.C36341k9.A1N(r0, r9, r5)     // Catch:{ OperationCanceledException -> 0x0452 }
            r9.append(r11)     // Catch:{ OperationCanceledException -> 0x0452 }
            long r0 = r8.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            r9.append(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = " total files"
            X.C36321k7.A1a(r9, r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x032f
            int r1 = r8.A01     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 5
            if (r1 >= r0) goto L_0x032f
            X.C90464aC.A18(r19)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.File r4 = r6.A00(r3)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.FileOutputStream r3 = X.C90524aI.A0W(r4)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0439 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0439 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x0439 }
            r2.<init>(r0)     // Catch:{ all -> 0x0439 }
            r2.beginObject()     // Catch:{ all -> 0x042f }
            java.lang.String r0 = "relativePaths"
            r2.name(r0)     // Catch:{ all -> 0x042f }
            r2.beginArray()     // Catch:{ all -> 0x042f }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x042f }
        L_0x0301:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x042f }
            if (r0 == 0) goto L_0x0311
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x042f }
            X.6Mn r0 = (X.C130816Mn) r0     // Catch:{ all -> 0x042f }
            r0.A00(r2)     // Catch:{ all -> 0x042f }
            goto L_0x0301
        L_0x0311:
            r2.endArray()     // Catch:{ all -> 0x042f }
            android.util.JsonWriter r0 = r2.endObject()     // Catch:{ all -> 0x042f }
            r0.flush()     // Catch:{ all -> 0x042f }
            r2.close()     // Catch:{ all -> 0x0439 }
            r3.close()     // Catch:{ OperationCanceledException -> 0x0452 }
            byte[] r2 = r8.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            r1 = 104(0x68, float:1.46E-43)
            r0 = 0
            X.5D9 r3 = new X.5D9     // Catch:{ OperationCanceledException -> 0x0452 }
            r3.<init>(r0, r4, r2, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x002f
        L_0x032f:
            long r2 = r8.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x0452 }
            long r0 = (long) r0     // Catch:{ OperationCanceledException -> 0x0452 }
            long r2 = r2 - r0
            r8.A03 = r2     // Catch:{ OperationCanceledException -> 0x0452 }
            int r0 = r5.size()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 != 0) goto L_0x035b
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/transfer complete because all files received"
        L_0x0341:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6TD r0 = new X.6TD     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.<init>(r4)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.AnonymousClass6XZ.A02(r7, r0, r10)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 1
            r8.A07 = r0     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 102(0x66, float:1.43E-43)
            X.6TD r3 = new X.6TD     // Catch:{ OperationCanceledException -> 0x0452 }
            r3.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x002f
        L_0x035b:
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/transfer complete because maximum retry attempts reached"
            goto L_0x0341
        L_0x035e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OperationCanceledException -> 0x0452 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Received invalid message with type: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x036b
        L_0x0369:
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Received file data response message without an associated metadata message"
        L_0x036b:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            return
        L_0x036f:
            long r0 = r1.A02     // Catch:{ IOException -> 0x0375 }
            r8.A00(r0)     // Catch:{ IOException -> 0x0375 }
            goto L_0x037b
        L_0x0375:
            r1 = move-exception
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/Unable to process logging metadata due to stream closing"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x037b:
            long r0 = r8.A05     // Catch:{ OperationCanceledException -> 0x0452 }
            double r5 = (double) r0     // Catch:{ OperationCanceledException -> 0x0452 }
            long r3 = r8.A02     // Catch:{ OperationCanceledException -> 0x0452 }
            long r1 = r8.A03     // Catch:{ OperationCanceledException -> 0x0452 }
            r15 = 13
            r0 = r20
            X.0wU r10 = r0.A05     // Catch:{ OperationCanceledException -> 0x0452 }
            X.73W r0 = new X.73W     // Catch:{ OperationCanceledException -> 0x0452 }
            r11 = r0
            r12 = r20
            r13 = r5
            r16 = r3
            r18 = r1
            r11.<init>(r12, r13, r15, r16, r18)     // Catch:{ OperationCanceledException -> 0x0452 }
            r10.Boy(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.5zF r5 = r8.A0D     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6FO r0 = r8.A0C     // Catch:{ OperationCanceledException -> 0x0452 }
            boolean r3 = r0.A05()     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6JO r2 = r5.A06     // Catch:{ OperationCanceledException -> 0x0452 }
            monitor-enter(r2)     // Catch:{ OperationCanceledException -> 0x0452 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0404 }
            r0.clear()     // Catch:{ all -> 0x0404 }
            monitor-exit(r2)     // Catch:{ all -> 0x0404 }
            X.12s r0 = r5.A03     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6Ni r0 = r0.A00()     // Catch:{ OperationCanceledException -> 0x0452 }
            boolean r0 = r0.A00()     // Catch:{ OperationCanceledException -> 0x0452 }
            if (r0 == 0) goto L_0x03c2
            java.lang.String r0 = "fpm/ImportHelper/prepareForImport/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x03ba:
            X.6TQ r1 = r5.A0E     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 14
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x03ca
        L_0x03c2:
            X.5Fa r1 = r5.A0D     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 302(0x12e, float:4.23E-43)
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x03ba
        L_0x03ca:
            if (r3 == 0) goto L_0x03d2
            X.5JW r0 = r5.A0C     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x03f1
        L_0x03d2:
            X.5FW r1 = r5.A09     // Catch:{ OperationCanceledException -> 0x0452 }
            r0 = 0
            r1.A00(r0, r9)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6Xk r2 = r5.A0A     // Catch:{ OperationCanceledException -> 0x0452 }
            X.68w r1 = r5.A0B     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6wL r0 = new X.6wL     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.<init>(r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            r2.A0H(r7, r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            X.5Fa r0 = r5.A0D     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
            X.3HJ r0 = r5.A0G     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.A01()     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x03f1:
            X.0wU r4 = r5.A0I     // Catch:{ OperationCanceledException -> 0x0452 }
            X.5qa r3 = r5.A0F     // Catch:{ OperationCanceledException -> 0x0452 }
            X.6wU r2 = new X.6wU     // Catch:{ OperationCanceledException -> 0x0452 }
            r2.<init>(r5)     // Catch:{ OperationCanceledException -> 0x0452 }
            r1 = 0
            X.6wW r0 = new X.6wW     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.<init>(r2, r3, r4, r1)     // Catch:{ OperationCanceledException -> 0x0452 }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x0452 }
            return
        L_0x0404:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0404 }
            goto L_0x042e
        L_0x0407:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ SocketException -> 0x040e }
            throw r0     // Catch:{ SocketException -> 0x040e }
        L_0x040e:
            X.5R7 r1 = new X.5R7     // Catch:{ OperationCanceledException -> 0x0452 }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x042e
        L_0x0414:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x042e
        L_0x041b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0443 }
            goto L_0x0447
        L_0x0420:
            int r0 = r1.A00     // Catch:{ OperationCanceledException -> 0x0452 }
            X.5VR r1 = new X.5VR     // Catch:{ OperationCanceledException -> 0x0452 }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
            goto L_0x042e
        L_0x0428:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x042e:
            throw r1     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x042f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0434 }
            goto L_0x0438
        L_0x0434:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0439 }
        L_0x0438:
            throw r1     // Catch:{ all -> 0x0439 }
        L_0x0439:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x044d }
            goto L_0x0451
        L_0x043e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0443 }
            goto L_0x0447
        L_0x0443:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0448 }
        L_0x0447:
            throw r1     // Catch:{ all -> 0x0448 }
        L_0x0448:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x044d }
            goto L_0x0451
        L_0x044d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x0451:
            throw r1     // Catch:{ OperationCanceledException -> 0x0452 }
        L_0x0452:
            r4 = 2
            r3 = 251(0xfb, float:3.52E-43)
            r0 = 0
            X.6TD r2 = new X.6TD     // Catch:{ 5VR | IOException -> 0x0468, 5VR | IOException -> 0x0468 }
            r2.<init>((int) r3, (long) r0, (int) r4)     // Catch:{ 5VR | IOException -> 0x0468, 5VR | IOException -> 0x0468 }
            java.io.OutputStream r1 = r8.A0H     // Catch:{ 5VR | IOException -> 0x0468, 5VR | IOException -> 0x0468 }
            r0 = 0
            X.AnonymousClass6XZ.A02(r0, r2, r1)     // Catch:{ 5VR | IOException -> 0x0468, 5VR | IOException -> 0x0468 }
            java.lang.String r0 = "fpm/ReceiverChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 5VR | IOException -> 0x0468, 5VR | IOException -> 0x0468 }
            return
        L_0x0468:
            r1 = move-exception
            X.5Fa r0 = r8.A0E
            X.AnonymousClass6XZ.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147026wY.run():void");
    }

    public C147026wY(AnonymousClass179 r2, C19970wo r3, AnonymousClass17Z r4, C20810yC r5, C128596Cw r6, C1275868w r7, AnonymousClass6FO r8, C125055zF r9, C105535Fa r10, AnonymousClass6TQ r11, C111145bo r12, InputStream inputStream, OutputStream outputStream) {
        this.A0I = r3;
        this.A0K = r5;
        this.A09 = r2;
        this.A0G = inputStream;
        this.A0H = outputStream;
        this.A0D = r9;
        this.A0F = r11;
        this.A0B = r7;
        this.A0E = r10;
        this.A0L = r12;
        this.A0A = r6;
        this.A0C = r8;
        this.A0J = r4;
        this.A08 = new CancellationSignal();
    }
}
