package X;

import android.net.Uri;
import android.os.PowerManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.5Bk  reason: invalid class name and case insensitive filesystem */
public class C104795Bk extends AnonymousClass75H {
    public final PowerManager.WakeLock A00;
    public final C19700wN A01;
    public final C21060yb A02;
    public final C20060wx A03;
    public final AnonymousClass1DF A04;
    public final C20810yC A05;
    public final AnonymousClass5BV A06;
    public final AnonymousClass1GX A07;
    public final C25521Gq A08;
    public final AnonymousClass1EJ A09;
    public final C25501Go A0A;

    public static boolean A00(int i) {
        return i == 192 || i == 193 || i == 195 || i == 197 || i == 199 || i == 200 || i == 201 || i == 203 || i == 205 || i == 207;
    }

    public AnonymousClass5Bf A07(AnonymousClass5Ba r10, AnonymousClass2bU r11, File file) {
        C65013Qj r0;
        File file2;
        InputStream A0V;
        if (!(r11 == null || r11.A04 == null || (r0 = r11.A01) == null || (file2 = r0.A0I) == null || !file2.exists())) {
            try {
                A0V = AnonymousClass1GX.A0V(Uri.fromFile(r11.A01.A0I), this.A07, true);
                AnonymousClass6YY.A0S(file, A0V);
                if (!r11.A04.equals(AnonymousClass6UG.A00(file))) {
                    AnonymousClass6YY.A0P(file);
                    A0V.close();
                    return null;
                }
                AnonymousClass1EJ r02 = this.A09;
                C18740tg.A06(r11);
                r02.A00(r11);
                C25521Gq r1 = this.A08;
                AnonymousClass6Q6 A1Y = r11.A1Y();
                C18740tg.A06(A1Y);
                r1.A00(A1Y);
                int[] A062 = r11.A1Y().A06();
                if (A062 != null && A062.length == 4) {
                    boolean z = false;
                    if (((long) (A062[0] + A062[1] + A062[2] + A062[3])) == file.length()) {
                        int[] A063 = r11.A1Y().A06();
                        AnonymousClass00C.A0D(A063, 0);
                        r10.A06 = A063;
                        if (r11.A1Y().A06() != null) {
                            z = true;
                        }
                        r10.A05 = z;
                    }
                }
                r10.A04 = true;
                C65013Qj r12 = r11.A01;
                r10.A02 = r12.A06;
                r10.A03 = r12.A0A;
                r10.A00 = r12.A02;
                r10.A01 = r12.A03;
                r10.A03 = r11.A0V().A02();
                r10.A00 = file;
                r10.A02 = true;
                AnonymousClass5Bf A002 = r10.A00();
                A0V.close();
                return A002;
            } catch (IOException unused) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ProcessImageTask/processImage/failed to get bitmap stream from file ");
                C36331k8.A1P(r11.A01.A0I, A0u);
                AnonymousClass6YY.A0P(file);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:192|(1:241)|242|243|244|245|(1:247)|248|249|(1:253)|254|255|256|257|258|(11:337|(4:338|339|340|(2:344|(1:532)(3:346|(3:(3:(2:350|(2:352|(1:354)(2:400|534))(1:(1:(2:357|(3:359|(1:361)|396)(1:(2:366|(2:390|536)(4:374|(3:376|(1:378)|379)(1:(2:381|(2:383|(2:385|(1:387)))))|389|535))(2:533|365))))))(1:(1:537))|392|538)(2:393|(1:395)(1:528))|397|539)(1:(2:399|540)(1:531))|401))(1:530))|402|(3:405|406|(1:408))|411|(1:413)(1:414)|415|416|469|471|(0)(0))(8:261|(4:262|263|264|(2:267|(1:519)(3:269|(3:(4:272|(2:274|(1:(1:277)(2:323|521))(1:(1:(2:280|(3:282|(1:284)|319)(1:(2:289|(2:313|523)(4:297|(3:299|(1:301)|302)(1:(2:304|(2:306|(2:308|(1:310)))))|312|522))(2:520|288))))))(1:(1:524))|315|525)(2:316|(1:318)(1:515))|320|526)(1:(2:322|527)(1:518))|324))(1:517))|336|415|416|469|471|(0)(0))|410|415|416|469|471|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        if (((long) r9) >= r19) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0228, code lost:
        if (r28[0] == -1) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022a, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("imageprocessor/stripmetadata not a marker");
        X.C36321k7.A1a(r1, X.AnonymousClass14B.A0E(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0240, code lost:
        if (r28[1] != -39) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0242, code lost:
        r10.write(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0249, code lost:
        r11.readFully(r13);
        r9 = r9 + 2;
        r1 = (((r13[0] & 255) << 8) | (r13[1] & 255)) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025b, code lost:
        if (r1 >= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025d, code lost:
        com.whatsapp.util.Log.i("imageprocessor/invalid size bytes on marker");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0264, code lost:
        r14 = r28[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0268, code lost:
        if (r14 != -38) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026a, code lost:
        if (r26 != false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026e, code lost:
        r10.write(r28);
        r10.write(r13);
        r0 = new byte[r1];
        r11.readFully(r0);
        r9 = r9 + r1;
        r10.write(r0);
        r14 = new byte[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0281, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0285, code lost:
        if (((long) r9) >= r19) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0287, code lost:
        r0 = r11.readByte();
        r14[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028d, code lost:
        if (r0 != -1) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028f, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        if (r15 == false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0293, code lost:
        r28[0] = -1;
        r28[1] = r14[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a1, code lost:
        if (X.AnonymousClass6XG.A03(X.C131976Rp.A05, r14[0]) == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a3, code lost:
        r10.write(r28);
        r9 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ab, code lost:
        r10.write(r14);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b5, code lost:
        if ((r14 & -16) != -32) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b7, code lost:
        if (r14 == -32) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bb, code lost:
        if (r14 == -31) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bf, code lost:
        if (r14 == -19) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c3, code lost:
        if (r24 != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c5, code lost:
        r11.readFully(r27);
        r9 = r9 + 5;
        r1 = r1 - 5;
        r18 = X.C131976Rp.A02;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d5, code lost:
        if (r27[r14] == r18[r14]) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d7, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("imageprocessor/stripmetadata invalid APP1 signature: ");
        X.C36321k7.A1a(r1, X.AnonymousClass14B.A0E(r27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e9, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ec, code lost:
        if (r14 < 5) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ee, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f1, code lost:
        r11.readFully(r27);
        r9 = r9 + 5;
        r1 = r1 - 5;
        r18 = X.C131976Rp.A03;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0301, code lost:
        if (r27[r14] == r18[r14]) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0303, code lost:
        r18 = X.C131976Rp.A04;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x030a, code lost:
        if (r27[r14] == r18[r14]) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030c, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("imageprocessor/stripmetadata invalid APP0 signature: ");
        X.C36321k7.A1a(r1, X.AnonymousClass14B.A0E(r27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031e, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0321, code lost:
        if (r14 >= 5) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0324, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0327, code lost:
        if (r14 < 5) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0329, code lost:
        if (r26 != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x032c, code lost:
        X.C131976Rp.A00(r11, r1);
        r9 = r9 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0331, code lost:
        r10.write(-1);
        r10.write(-32);
        r10.write(r13);
        r10.write(r18);
        r0 = new byte[r1];
        r11.readFully(r0);
        r10.write(r0);
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034c, code lost:
        X.C131976Rp.A00(r11, r1);
        r9 = r9 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0350, code lost:
        r11.readFully(r28);
        r9 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0359, code lost:
        r1 = new byte[r1];
        r11.readFully(r1);
        r10.write(r28);
        r10.write(r13);
        r10.write(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0369, code lost:
        r11.readFully(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0370, code lost:
        if (r9 == -1) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0374, code lost:
        if (r25 != false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0376, code lost:
        if (r9 == 0) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0380, code lost:
        if (((long) r9) <= (((long) r2.A02) * 1024)) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0382, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0384, code lost:
        r12 = false;
        r13 = X.AnonymousClass000.A0u();
        r13.append("ImageSize<=MaxSize | ");
        r13.append(((long) r9) / 1024);
        r13.append(" <= ");
        r5.A04.add(X.C36381kD.A10(r13, r2.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a4, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("imageprocessor/prepareimageforsend/copy size:");
        r1.append(r9);
        r1.append(" max:");
        r1.append(r2.A02);
        X.C36321k7.A1X(" recompress:", r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        com.whatsapp.util.Log.i("imageprocessor/stripmetadata missing valid application signature before image");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c6, code lost:
        com.whatsapp.util.Log.i("imageprocessor/stripmetadata invalid APP marker");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03cc, code lost:
        com.whatsapp.util.Log.i("imageprocessor/stripmetadata file too large");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05b3, code lost:
        if (r11 != 216) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0686, code lost:
        if (r14 != 216) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x07d1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x07d2, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x07ed, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x07ee, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0810, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0811, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0822, code lost:
        r0 = X.C90504aG.A1Y(r2);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0829, code lost:
        if (r0 == false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0840, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0841, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0214, code lost:
        r0 = r28;
        r10.write(r0);
        r11.readFully(r0);
        r9 = 4;
        r26 = false;
        r24 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:254:0x0506 */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03ef A[Catch:{ all -> 0x0407, SecurityException -> 0x07c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043c A[Catch:{ all -> 0x044e, all -> 0x0453, OutOfMemoryError -> 0x0458 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0448 A[SYNTHETIC, Splitter:B:221:0x0448] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04aa A[Catch:{ all -> 0x0407, SecurityException -> 0x07c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d1 A[Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0620 A[Catch:{ IOException -> 0x06a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06a9 A[SYNTHETIC, Splitter:B:405:0x06a9] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0712 A[Catch:{ all -> 0x0796 }] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0761 A[Catch:{ all -> 0x0796 }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07d1 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:1:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x07ed A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:1:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0822 A[Catch:{ all -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0840 A[ExcHandler: 1X5 (e X.1X5), Splitter:B:1:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0208 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x06a5 A[EDGE_INSN: B:532:0x06a5->B:402:0x06a5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016d A[Catch:{ all -> 0x0407, SecurityException -> 0x07c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020f A[Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd, all -> 0x03f8 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:455:0x0812=Splitter:B:455:0x0812, B:446:0x07d3=Splitter:B:446:0x07d3, B:450:0x07ef=Splitter:B:450:0x07ef} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C122615v9 A06() {
        /*
            r46 = this;
            X.5Ba r6 = new X.5Ba
            r6.<init>()
            r45 = r46
            r0 = r45
            X.5BV r0 = r0.A06
            r44 = r0
            X.6Tv r5 = r0.A01
            r0 = 1
            r5.A04(r0)
            r5.A01()
            r0 = r44
            boolean r0 = r0.A02
            r23 = r0
            X.58v r0 = r5.A01
            r43 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            r0.A01 = r1
            X.58x r4 = r5.A02
            r4.A01 = r1
            r0 = r45
            android.os.PowerManager$WakeLock r0 = r0.A00     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r16 = r0
            if (r0 == 0) goto L_0x0035
            r16.acquire()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x0035:
            r0 = r44
            java.lang.String r0 = r0.A01     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            android.net.Uri r7 = android.net.Uri.parse(r0)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.io.File r12 = X.C90484aE.A0c(r7)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            long r0 = r12.length()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r5.A08(r0)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            boolean r2 = X.AnonymousClass6IQ.A00(r12)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r3 = 1
            if (r2 == 0) goto L_0x0092
            r2 = 5
            r5.A05(r2)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x0053:
            java.lang.String r2 = r7.toString()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r9 = "rotation"
            boolean r2 = r2.contains(r9)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r2 == 0) goto L_0x0066
            java.lang.String r8 = "rotate"
            java.util.HashSet r2 = r5.A03     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r2.add(r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x0066:
            X.3Qj r17 = new X.3Qj     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r17.<init>()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r2 = r44
            java.io.File r2 = r2.A06     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r42 = r2
            r2 = r44
            X.63a r2 = r2.A00     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r8 = r45
            X.0yC r13 = r8.A05     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r8 = 5179(0x143b, float:7.257E-42)
            boolean r11 = r13.A0E(r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r10 = r7.getQueryParameter(r9)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r8 = "flip-v"
            java.lang.String r9 = r7.getQueryParameter(r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r8 = "flip-h"
            java.lang.String r8 = r7.getQueryParameter(r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r10 != 0) goto L_0x00fa
            goto L_0x0096
        L_0x0092:
            r5.A05(r3)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            goto L_0x0053
        L_0x0096:
            if (r9 != 0) goto L_0x00fa
            if (r8 != 0) goto L_0x00fa
            r9 = 2
            if (r11 != 0) goto L_0x00fa
            r10 = 0
            java.lang.String r10 = X.AnonymousClass6UG.A00(r12)     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            boolean r8 = r2 instanceof X.C104845Bq     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r8 == 0) goto L_0x00bf
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0v(r10)     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r8 = "-hd"
            java.lang.String r8 = X.AnonymousClass000.A0q(r8, r11)     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            byte[] r8 = r8.getBytes()     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r10 = android.util.Base64.encodeToString(r8, r9)     // Catch:{ IOException -> 0x00b9, 1X5 -> 0x0840, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            goto L_0x00bf
        L_0x00b9:
            r9 = move-exception
            java.lang.String r8 = "ProcessImageTask/errorComputingHash"
            com.whatsapp.util.Log.e(r8, r9)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x00bf:
            r8 = r45
            X.1DF r11 = r8.A04     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            X.2bU r12 = r11.A0B(r10)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r12 == 0) goto L_0x00d4
            r9 = r8
            r8 = r42
            X.5Bf r8 = r9.A07(r6, r12, r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r8 == 0) goto L_0x00d4
            goto L_0x0866
        L_0x00d4:
            if (r10 == 0) goto L_0x00f8
            java.util.ArrayList r8 = r11.A0F(r10, r3)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x00de:
            boolean r8 = r12.hasNext()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r8 == 0) goto L_0x00f8
            X.2bU r11 = X.C36441kJ.A0r(r12)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            boolean r8 = r11 instanceof X.C46882bp     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r8 == 0) goto L_0x00de
            r9 = r45
            r8 = r42
            X.5Bf r8 = r9.A07(r6, r11, r8)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r8 == 0) goto L_0x00de
            goto L_0x0866
        L_0x00f8:
            r6.A01 = r10     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x00fa:
            r8 = r45
            X.0wx r8 = r8.A03     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r41 = r8
            r8 = r45
            X.1GX r8 = r8.A07     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r40 = r8
            r8 = r45
            X.0yb r10 = r8.A02     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r8 = r44
            boolean r8 = r8.A03     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r25 = r8
            r8 = 0
            int r9 = r2.A00     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r35 = r9
            java.lang.Long r11 = X.C36441kJ.A0y(r35)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r9 = r43
            r9.A0D = r11     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r4.A0X = r11     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r23 == 0) goto L_0x0124
            X.5qP r31 = X.C131976Rp.A01     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            goto L_0x0126
        L_0x0124:
            X.5qP r31 = X.C131976Rp.A00     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x0126:
            java.io.File r14 = r42.getParentFile()     // Catch:{ SecurityException -> 0x07c6 }
            r9 = r40
            java.io.InputStream r11 = X.AnonymousClass1GX.A0V(r7, r9, r3)     // Catch:{ IOException -> 0x0163 }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0163 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x0163 }
            java.io.DataInputStream r12 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0163 }
            r12.<init>(r9)     // Catch:{ IOException -> 0x0163 }
            X.9oz r11 = new X.9oz     // Catch:{ all -> 0x0159 }
            r11.<init>((java.io.InputStream) r12)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = "Xmp"
            java.lang.String r11 = r11.A0Z(r9)     // Catch:{ all -> 0x0159 }
            r32 = 0
            if (r11 == 0) goto L_0x0153
            java.lang.String r9 = "trainedAlgorithmicMedia"
            boolean r9 = X.AnonymousClass099.A0O(r11, r9, r8)     // Catch:{ all -> 0x0159 }
            if (r9 == 0) goto L_0x0153
            r32 = 1
        L_0x0153:
            r12.close()     // Catch:{ IOException -> 0x0157 }
            goto L_0x016b
        L_0x0157:
            r11 = move-exception
            goto L_0x0166
        L_0x0159:
            r9 = move-exception
            r12.close()     // Catch:{ all -> 0x015e }
            goto L_0x0162
        L_0x015e:
            r11 = move-exception
            r9.addSuppressed(r11)     // Catch:{ IOException -> 0x0163 }
        L_0x0162:
            throw r9     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            r11 = move-exception
            r32 = 0
        L_0x0166:
            java.lang.String r9 = "imageprocessor/prepareimageforsend/hasXMPDataWithTrainedAlgorithmicMedia Failed to get XMP Data"
            com.whatsapp.util.Log.e(r9, r11)     // Catch:{ SecurityException -> 0x07c6 }
        L_0x016b:
            if (r14 == 0) goto L_0x0170
            r14.mkdirs()     // Catch:{ SecurityException -> 0x07c6 }
        L_0x0170:
            X.0ya r9 = r10.A0O()     // Catch:{ SecurityException -> 0x07c6 }
            android.graphics.Matrix r30 = X.AnonymousClass1GW.A0A(r7, r9)     // Catch:{ SecurityException -> 0x07c6 }
            r10 = r40
            r9 = r35
            android.graphics.BitmapFactory$Options r29 = r10.A0g(r7, r9, r3, r3)     // Catch:{ SecurityException -> 0x07c6 }
            r9 = r29
            int r9 = r9.outWidth     // Catch:{ SecurityException -> 0x07c6 }
            r34 = r9
            r9 = r29
            int r9 = r9.outHeight     // Catch:{ SecurityException -> 0x07c6 }
            r33 = r9
            r9 = r34
            long r11 = (long) r9     // Catch:{ SecurityException -> 0x07c6 }
            r9 = r33
            long r9 = (long) r9     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r11)     // Catch:{ SecurityException -> 0x07c6 }
            r11 = r43
            r11.A0L = r12     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.Long r10 = java.lang.Long.valueOf(r9)     // Catch:{ SecurityException -> 0x07c6 }
            r11.A0J = r10     // Catch:{ SecurityException -> 0x07c6 }
            r4.A0V = r12     // Catch:{ SecurityException -> 0x07c6 }
            r4.A0T = r10     // Catch:{ SecurityException -> 0x07c6 }
            if (r30 != 0) goto L_0x040c
            int r10 = r2.A01     // Catch:{ SecurityException -> 0x07c6 }
            r9 = r34
            if (r9 > r10) goto L_0x01b0
            r9 = r33
            if (r9 <= r10) goto L_0x01bd
        L_0x01b0:
            r10 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x040c
            r10 = 200000(0x30d40, double:9.8813E-319)
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x040c
        L_0x01bd:
            r0 = r40
            java.io.InputStream r1 = X.AnonymousClass1GX.A0V(r7, r0, r3)     // Catch:{ SecurityException -> 0x07c6 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ SecurityException -> 0x07c6 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x07c6 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ SecurityException -> 0x07c6 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x07c6 }
            java.io.FileOutputStream r1 = X.C90524aI.A0W(r42)     // Catch:{ all -> 0x0402 }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0402 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x0402 }
            r0 = 1577(0x629, float:2.21E-42)
            long r19 = X.C36441kJ.A0B(r13, r0)     // Catch:{ all -> 0x03f8 }
            r0 = 1024(0x400, double:5.06E-321)
            long r19 = r19 * r0
            r1 = 2
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x03f8 }
            r28 = r0
            byte[] r13 = new byte[r1]     // Catch:{ all -> 0x03f8 }
            r0 = 5
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x03f8 }
            r27 = r0
            java.lang.String r0 = "imageprocessor/stripmetadata begin stripping metadata"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f8 }
            r12 = -1
            r0 = r28
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte[] r14 = new byte[r1]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r14[r8] = r12     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = -40
            r14[r3] = r0     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r9 = 0
        L_0x0202:
            byte r0 = r28[r9]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r1 = r14[r9]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r0 == r1) goto L_0x020f
            java.lang.String r0 = "imageprocessor/stripmetadata not a jpeg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x020f:
            int r9 = r9 + 1
            r0 = 2
            if (r9 < r0) goto L_0x0202
            r0 = r28
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r9 = 4
            r26 = 0
            r24 = 0
        L_0x0221:
            long r0 = (long) r9     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r14 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r14 >= 0) goto L_0x03cc
            byte r0 = r28[r8]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r0 == r12) goto L_0x023c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = "imageprocessor/stripmetadata not a marker"
            r1.append(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = X.AnonymousClass14B.A0E(r28)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            X.C36321k7.A1a(r1, r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x023c:
            byte r1 = r28[r3]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = -39
            if (r1 != r0) goto L_0x0249
            r0 = r28
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x0370
        L_0x0249:
            r11.readFully(r13)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 2
            byte r0 = r13[r8]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            byte r0 = r13[r3]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 + -2
            if (r1 >= 0) goto L_0x0264
            java.lang.String r0 = "imageprocessor/invalid size bytes on marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x0264:
            byte r14 = r28[r3]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = -38
            if (r14 != r0) goto L_0x02b1
            if (r26 != 0) goto L_0x026e
            goto L_0x03c0
        L_0x026e:
            r0 = r28
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r10.write(r13)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte[] r0 = new byte[r1]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + r1
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte[] r14 = new byte[r3]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
        L_0x0281:
            r15 = 0
        L_0x0282:
            long r0 = (long) r9     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0221
            byte r0 = r11.readByte()     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r14[r8] = r0     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r0 != r12) goto L_0x0291
            r15 = 1
            goto L_0x0282
        L_0x0291:
            if (r15 == 0) goto L_0x02ab
            r28[r8] = r12     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r0 = r14[r8]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r28[r3] = r0     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int[] r0 = X.C131976Rp.A05     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r1 = r14[r8]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            boolean r0 = X.AnonymousClass6XG.A03(r0, r1)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r0 == 0) goto L_0x0221
            r0 = r28
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 2
            goto L_0x0281
        L_0x02ab:
            r10.write(r14)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 1
            goto L_0x0281
        L_0x02b1:
            r15 = r14 & -16
            r0 = -32
            if (r15 != r0) goto L_0x0359
            if (r14 == r0) goto L_0x02f1
            r0 = -31
            if (r14 == r0) goto L_0x02c3
            r0 = -19
            if (r14 == r0) goto L_0x032c
            goto L_0x03c6
        L_0x02c3:
            if (r24 != 0) goto L_0x032c
            r0 = r27
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 5
            int r1 = r1 + -5
            byte[] r18 = X.C131976Rp.A02     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r14 = 0
        L_0x02d1:
            byte r15 = r27[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r0 = r18[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r15 == r0) goto L_0x02e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP1 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = X.AnonymousClass14B.A0E(r27)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            X.C36321k7.A1a(r1, r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x02e9:
            int r14 = r14 + 1
            r0 = 5
            if (r14 < r0) goto L_0x02d1
            r24 = 1
            goto L_0x032c
        L_0x02f1:
            r0 = r27
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 5
            int r1 = r1 + -5
            byte[] r18 = X.C131976Rp.A03     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r14 = 0
        L_0x02fd:
            byte r15 = r27[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r0 = r18[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r15 == r0) goto L_0x0324
            byte[] r18 = X.C131976Rp.A04     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r14 = 0
        L_0x0306:
            byte r15 = r27[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte r0 = r18[r14]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            if (r15 == r0) goto L_0x031e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP0 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            java.lang.String r0 = X.AnonymousClass14B.A0E(r27)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            X.C36321k7.A1a(r1, r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x031e:
            int r14 = r14 + 1
            r0 = 5
            if (r14 >= r0) goto L_0x032c
            goto L_0x0306
        L_0x0324:
            int r14 = r14 + 1
            r0 = 5
            if (r14 < r0) goto L_0x02fd
            if (r26 != 0) goto L_0x034c
            goto L_0x0331
        L_0x032c:
            X.C131976Rp.A00(r11, r1)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + r1
            goto L_0x0369
        L_0x0331:
            r10.write(r12)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = -32
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r10.write(r13)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = r18
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            byte[] r0 = new byte[r1]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r26 = 1
            goto L_0x0350
        L_0x034c:
            X.C131976Rp.A00(r11, r1)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + r1
        L_0x0350:
            r0 = r28
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            int r9 = r9 + 2
            goto L_0x0221
        L_0x0359:
            byte[] r1 = new byte[r1]     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r11.readFully(r1)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r0 = r28
            r10.write(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r10.write(r13)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            r10.write(r1)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
        L_0x0369:
            r0 = r28
            r11.readFully(r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x0221
        L_0x0370:
            if (r9 == r12) goto L_0x03e1
            r18 = 1024(0x400, double:5.06E-321)
            if (r25 != 0) goto L_0x0384
            if (r9 == 0) goto L_0x0382
            long r12 = (long) r9     // Catch:{ all -> 0x03f8 }
            int r0 = r2.A02     // Catch:{ all -> 0x03f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03f8 }
            long r0 = r0 * r18
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0384
        L_0x0382:
            r12 = 1
            goto L_0x03a4
        L_0x0384:
            r12 = 0
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = "ImageSize<=MaxSize | "
            r13.append(r0)     // Catch:{ all -> 0x03f8 }
            long r0 = (long) r9     // Catch:{ all -> 0x03f8 }
            long r0 = r0 / r18
            r13.append(r0)     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = " <= "
            r13.append(r0)     // Catch:{ all -> 0x03f8 }
            int r0 = r2.A02     // Catch:{ all -> 0x03f8 }
            java.lang.String r1 = X.C36381kD.A10(r13, r0)     // Catch:{ all -> 0x03f8 }
            java.util.HashSet r0 = r5.A04     // Catch:{ all -> 0x03f8 }
            r0.add(r1)     // Catch:{ all -> 0x03f8 }
        L_0x03a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/copy size:"
            r1.append(r0)     // Catch:{ all -> 0x03f8 }
            r1.append(r9)     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = " max:"
            r1.append(r0)     // Catch:{ all -> 0x03f8 }
            int r0 = r2.A02     // Catch:{ all -> 0x03f8 }
            r1.append(r0)     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = " recompress:"
            X.C36321k7.A1X(r0, r1, r12)     // Catch:{ all -> 0x03f8 }
            goto L_0x03e7
        L_0x03c0:
            java.lang.String r0 = "imageprocessor/stripmetadata missing valid application signature before image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x03c6:
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x03cc:
            java.lang.String r0 = "imageprocessor/stripmetadata file too large"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x03d6, IOException -> 0x03d2, NullPointerException -> 0x03dd }
            goto L_0x03e1
        L_0x03d2:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata IOException"
            goto L_0x03d9
        L_0x03d6:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata stream ended unexpectedly"
        L_0x03d9:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03f8 }
            goto L_0x03e1
        L_0x03dd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03f8 }
        L_0x03e1:
            java.lang.String r0 = "imageprocessor/prepareimageforsend/stripmetadata unable to strip metadata, file needs reencoding"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f8 }
            r12 = 1
        L_0x03e7:
            r10.close()     // Catch:{ all -> 0x0402 }
            r11.close()     // Catch:{ SecurityException -> 0x07c6 }
            if (r12 != 0) goto L_0x040c
            r1 = r34
            r0 = r33
            r5.A06(r1, r0)     // Catch:{ SecurityException -> 0x07c6 }
            goto L_0x04a8
        L_0x03f8:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x03fd }
            goto L_0x0401
        L_0x03fd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0402 }
        L_0x0401:
            throw r1     // Catch:{ all -> 0x0402 }
        L_0x0402:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0407 }
            goto L_0x040b
        L_0x0407:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SecurityException -> 0x07c6 }
        L_0x040b:
            throw r1     // Catch:{ SecurityException -> 0x07c6 }
        L_0x040c:
            int r9 = r2.A03     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.Long r1 = X.C36441kJ.A0y(r9)     // Catch:{ SecurityException -> 0x07c6 }
            r0 = r43
            r0.A0G = r1     // Catch:{ SecurityException -> 0x07c6 }
            r4.A0Y = r1     // Catch:{ SecurityException -> 0x07c6 }
            r0 = r40
            java.io.InputStream r0 = X.AnonymousClass1GX.A0V(r7, r0, r3)     // Catch:{ OutOfMemoryError -> 0x0458 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x0458 }
            r10.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0458 }
            byte[] r11 = X.AnonymousClass14X.A04(r10)     // Catch:{ all -> 0x044e }
            int r1 = r11.length     // Catch:{ all -> 0x044e }
            r0 = r29
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeByteArray(r11, r8, r1, r0)     // Catch:{ all -> 0x044e }
            if (r11 == 0) goto L_0x0448
            int r0 = r11.getWidth()     // Catch:{ all -> 0x044e }
            if (r0 == 0) goto L_0x0448
            int r0 = r11.getHeight()     // Catch:{ all -> 0x044e }
            if (r0 == 0) goto L_0x0448
            r8 = r35
            r1 = r30
            android.graphics.Bitmap r34 = X.AnonymousClass1GW.A08(r11, r1, r8, r8)     // Catch:{ all -> 0x044e }
            r10.close()     // Catch:{ OutOfMemoryError -> 0x0458 }
            goto L_0x0480
        L_0x0448:
            X.1X5 r0 = new X.1X5     // Catch:{ all -> 0x044e }
            r0.<init>()     // Catch:{ all -> 0x044e }
            throw r0     // Catch:{ all -> 0x044e }
        L_0x044e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0453 }
            goto L_0x0457
        L_0x0453:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0458 }
        L_0x0457:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0458 }
        L_0x0458:
            r10 = move-exception
            r0 = r29
            int r0 = r0.inSampleSize     // Catch:{ SecurityException -> 0x07c6 }
            int r8 = r0 * 2
            r0 = r29
            r0.inSampleSize = r8     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.String r0 = "imageprocessor/compressToFile/oom "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r8)     // Catch:{ SecurityException -> 0x07c6 }
            com.whatsapp.util.Log.i(r0, r10)     // Catch:{ SecurityException -> 0x07c6 }
            r1 = r29
            r0 = r40
            android.graphics.Bitmap r10 = X.AnonymousClass1GX.A0T(r1, r7, r0, r3)     // Catch:{ SecurityException -> 0x07c6 }
            r8 = r35
            r1 = r30
            android.graphics.Bitmap r34 = X.AnonymousClass1GW.A08(r10, r1, r8, r8)     // Catch:{ SecurityException -> 0x07c6 }
        L_0x0480:
            int r1 = r34.getWidth()     // Catch:{ SecurityException -> 0x07c6 }
            int r0 = r34.getHeight()     // Catch:{ SecurityException -> 0x07c6 }
            r5.A06(r1, r0)     // Catch:{ SecurityException -> 0x07c6 }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ SecurityException -> 0x07c6 }
            r4.A0B = r0     // Catch:{ SecurityException -> 0x07c6 }
            boolean r0 = r2 instanceof X.C104845Bq     // Catch:{ IOException -> 0x07ac }
            com.whatsapp.media.transcode.Mozjpeg r33 = X.AnonymousClass6IR.A00     // Catch:{ IOException -> 0x07ac }
            java.lang.String r35 = r42.getAbsolutePath()     // Catch:{ IOException -> 0x07ac }
            r37 = 1
            r38 = 0
            r36 = r9
            r39 = r0
            r33.A00(r34, r35, r36, r37, r38, r39)     // Catch:{ IOException -> 0x07ac }
            r8 = 1
            r34.recycle()     // Catch:{ SecurityException -> 0x07c6 }
        L_0x04a8:
            if (r32 == 0) goto L_0x04ad
            X.AnonymousClass1GW.A0R(r42)     // Catch:{ SecurityException -> 0x07c6 }
        L_0x04ad:
            r0 = r31
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x07c6 }
            r0 = r40
            android.graphics.Bitmap r7 = r0.A0e(r7, r1, r1)     // Catch:{ SecurityException -> 0x07c6 }
            r1 = r42
            r0 = r17
            r0.A0I = r1     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r7.getWidth()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r7.getHeight()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r0 = r31
            int r9 = r0.A00     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r0 = r23 ^ 1
            boolean r13 = r2 instanceof X.C104845Bq     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            byte[] r2 = X.AnonymousClass6IR.A00(r7, r9, r0, r13)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            if (r2 != 0) goto L_0x04de
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r7.compress(r0, r9, r1)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            byte[] r2 = r1.toByteArray()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x04de:
            int r1 = r7.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            int r0 = r7.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            if (r1 <= r0) goto L_0x0506
            r0 = r17
            java.io.File r0 = r0.A0I     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            android.util.Pair r9 = X.C111725ck.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            if (r9 == 0) goto L_0x0506
            java.lang.Object r0 = r9.first     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            int r1 = X.C90514aH.A0H(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            r0 = r17
            r0.A02 = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            java.lang.Object r0 = r9.second     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            int r1 = X.C90514aH.A0H(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
            r0 = r17
            r0.A03 = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0506 }
        L_0x0506:
            r7.recycle()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r6.A03 = r2     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r0 = r17
            java.io.File r1 = r0.A0I     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            X.AnonymousClass1GW.A0Q(r0, r1)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            int r1 = r0.A0A     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            int r0 = r0.A06     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r5.A06(r1, r0)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r9 = 2
            java.io.FileInputStream r1 = X.AnonymousClass1GW.A0J(r42)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.io.BufferedInputStream r24 = new java.io.BufferedInputStream     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r0 = r24
            r0.<init>(r1)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            r23 = 0
            r22 = 0
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0798 }
            r21 = 0
            r20 = 0
            r19 = 0
            r12 = 0
            r0 = 0
            java.lang.String r2 = "ProcessImageTask/number of scans after compression = "
            if (r8 != 0) goto L_0x060c
            if (r25 != 0) goto L_0x060c
            r13 = 10
            r10 = 0
        L_0x053e:
            r15 = 1
            int r11 = r24.read()     // Catch:{ IOException -> 0x05d2 }
            r1 = -1
            if (r11 == r1) goto L_0x05d2
            if (r12 >= r13) goto L_0x05d2
            int r21 = r21 + 1
            if (r23 != 0) goto L_0x05d2
            r14 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x05c9
            if (r0 == r3) goto L_0x05be
            r8 = 3
            if (r0 == r9) goto L_0x05ba
            r1 = 4
            if (r0 == r8) goto L_0x0567
            if (r0 == r1) goto L_0x05cd
            int r14 = r20 << 8
            int r14 = r14 + r11
            int r14 = r14 - r9
            long r0 = (long) r14     // Catch:{ IOException -> 0x05d2 }
            r8 = r24
            X.AnonymousClass14X.A03(r8, r0)     // Catch:{ IOException -> 0x05d2 }
            int r21 = r21 + r14
            goto L_0x05c7
        L_0x0567:
            if (r11 == r14) goto L_0x05bc
            if (r11 == 0) goto L_0x05c7
            r1 = 217(0xd9, float:3.04E-43)
            if (r11 != r1) goto L_0x0579
            r23 = 1
            int r0 = r21 + -2
            if (r19 <= 0) goto L_0x05c3
            X.AnonymousClass000.A1F(r7, r0)     // Catch:{ IOException -> 0x05d2 }
            goto L_0x05c3
        L_0x0579:
            if (r22 != 0) goto L_0x0583
            boolean r1 = A00(r11)     // Catch:{ IOException -> 0x05d2 }
            if (r1 == 0) goto L_0x0583
            goto L_0x0609
        L_0x0583:
            r1 = 194(0xc2, float:2.72E-43)
            if (r11 == r1) goto L_0x05b7
            r1 = 198(0xc6, float:2.77E-43)
            if (r11 == r1) goto L_0x05b7
            r1 = 202(0xca, float:2.83E-43)
            if (r11 == r1) goto L_0x05b7
            r1 = 206(0xce, float:2.89E-43)
            if (r11 == r1) goto L_0x05b7
            r0 = 218(0xda, float:3.05E-43)
            if (r11 != r0) goto L_0x05a3
            int r0 = r21 - r9
            if (r19 <= 0) goto L_0x059e
            X.AnonymousClass000.A1F(r7, r0)     // Catch:{ IOException -> 0x05d2 }
        L_0x059e:
            r12 = r19
            int r19 = r19 + 1
            goto L_0x05b5
        L_0x05a3:
            if (r11 == r3) goto L_0x05c7
            r0 = 208(0xd0, float:2.91E-43)
            if (r11 < r0) goto L_0x05b5
            r0 = 215(0xd7, float:3.01E-43)
            if (r11 <= r0) goto L_0x05c7
            r0 = 217(0xd9, float:3.04E-43)
            if (r11 == r0) goto L_0x05c7
            r0 = 216(0xd8, float:3.03E-43)
            if (r11 == r0) goto L_0x05c7
        L_0x05b5:
            r0 = 4
            goto L_0x05ce
        L_0x05b7:
            r22 = 1
            goto L_0x05ce
        L_0x05ba:
            if (r11 != r14) goto L_0x05ce
        L_0x05bc:
            r0 = 3
            goto L_0x05ce
        L_0x05be:
            r0 = 216(0xd8, float:3.03E-43)
            if (r11 != r0) goto L_0x05d2
            goto L_0x05c7
        L_0x05c3:
            r12 = r19
            int r19 = r19 + 1
        L_0x05c7:
            r0 = 2
            goto L_0x05ce
        L_0x05c9:
            if (r11 != r14) goto L_0x05d2
            r0 = 1
            goto L_0x05ce
        L_0x05cd:
            r0 = 5
        L_0x05ce:
            r20 = r11
            goto L_0x053e
        L_0x05d2:
            if (r22 == 0) goto L_0x0609
            int r1 = r7.size()     // Catch:{ all -> 0x0798 }
            r0 = 8
            if (r1 == r0) goto L_0x05f0
            int r1 = r7.size()     // Catch:{ all -> 0x0798 }
            r0 = 7
            if (r1 == r0) goto L_0x05f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0798 }
            X.C36341k9.A1N(r2, r1, r7)     // Catch:{ all -> 0x0798 }
            java.lang.String r0 = " does not match target=1"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0798 }
            goto L_0x0609
        L_0x05f0:
            r5.A0C(r3)     // Catch:{ all -> 0x0798 }
            r6.A05 = r3     // Catch:{ all -> 0x0798 }
            int r11 = X.C90474aD.A07(r7, r10)     // Catch:{ all -> 0x0798 }
            long r2 = r42.length()     // Catch:{ all -> 0x0798 }
            long r0 = (long) r11     // Catch:{ all -> 0x0798 }
            long r2 = r2 - r0
            int r7 = (int) r2     // Catch:{ all -> 0x0798 }
            r2 = 100
            if (r7 <= r2) goto L_0x0609
            int[] r7 = new int[r9]     // Catch:{ all -> 0x0798 }
            r8 = 0
            goto L_0x06fd
        L_0x0609:
            r8 = 0
            goto L_0x076d
        L_0x060c:
            r11 = 1
            r8 = 0
        L_0x060e:
            r10 = 6
            r18 = 1
            int r14 = r24.read()     // Catch:{ IOException -> 0x06a5 }
            r1 = -1
            if (r14 == r1) goto L_0x06a5
            r1 = 20
            if (r12 >= r1) goto L_0x06a5
            int r21 = r21 + 1
            if (r23 != 0) goto L_0x06a5
            r3 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x069c
            if (r0 == r11) goto L_0x0691
            if (r0 == r9) goto L_0x068d
            r1 = 3
            if (r0 == r1) goto L_0x063b
            r1 = 4
            if (r0 == r1) goto L_0x06a0
            int r15 = r20 << 8
            int r15 = r15 + r14
            int r15 = r15 - r9
            long r0 = (long) r15     // Catch:{ IOException -> 0x06a5 }
            r3 = r24
            X.AnonymousClass14X.A03(r3, r0)     // Catch:{ IOException -> 0x06a5 }
            int r21 = r21 + r15
            goto L_0x069a
        L_0x063b:
            if (r14 == r3) goto L_0x068f
            if (r14 == 0) goto L_0x069a
            r1 = 217(0xd9, float:3.04E-43)
            if (r14 != r1) goto L_0x064d
            r23 = 1
            int r0 = r21 + -2
            if (r19 <= 0) goto L_0x0696
            X.AnonymousClass000.A1F(r7, r0)     // Catch:{ IOException -> 0x06a5 }
            goto L_0x0696
        L_0x064d:
            if (r22 != 0) goto L_0x0656
            boolean r1 = A00(r14)     // Catch:{ IOException -> 0x06a5 }
            if (r1 == 0) goto L_0x0656
            goto L_0x06a5
        L_0x0656:
            r1 = 194(0xc2, float:2.72E-43)
            if (r14 == r1) goto L_0x068a
            r1 = 198(0xc6, float:2.77E-43)
            if (r14 == r1) goto L_0x068a
            r1 = 202(0xca, float:2.83E-43)
            if (r14 == r1) goto L_0x068a
            r1 = 206(0xce, float:2.89E-43)
            if (r14 == r1) goto L_0x068a
            r0 = 218(0xda, float:3.05E-43)
            if (r14 != r0) goto L_0x0676
            int r0 = r21 - r9
            if (r19 <= 0) goto L_0x0671
            X.AnonymousClass000.A1F(r7, r0)     // Catch:{ IOException -> 0x06a5 }
        L_0x0671:
            r12 = r19
            int r19 = r19 + 1
            goto L_0x0688
        L_0x0676:
            if (r14 == r11) goto L_0x069a
            r0 = 208(0xd0, float:2.91E-43)
            if (r14 < r0) goto L_0x0688
            r0 = 215(0xd7, float:3.01E-43)
            if (r14 <= r0) goto L_0x069a
            r0 = 217(0xd9, float:3.04E-43)
            if (r14 == r0) goto L_0x069a
            r0 = 216(0xd8, float:3.03E-43)
            if (r14 == r0) goto L_0x069a
        L_0x0688:
            r0 = 4
            goto L_0x06a1
        L_0x068a:
            r22 = 1
            goto L_0x06a1
        L_0x068d:
            if (r14 != r3) goto L_0x06a1
        L_0x068f:
            r0 = 3
            goto L_0x06a1
        L_0x0691:
            r0 = 216(0xd8, float:3.03E-43)
            if (r14 != r0) goto L_0x06a5
            goto L_0x069a
        L_0x0696:
            r12 = r19
            int r19 = r19 + 1
        L_0x069a:
            r0 = 2
            goto L_0x06a1
        L_0x069c:
            if (r14 != r3) goto L_0x06a5
            r0 = 1
            goto L_0x06a1
        L_0x06a0:
            r0 = 5
        L_0x06a1:
            r20 = r14
            goto L_0x060e
        L_0x06a5:
            r12 = 4
            r15 = 3
            if (r13 == 0) goto L_0x070a
            int r1 = r7.size()     // Catch:{ all -> 0x0796 }
            r0 = 9
            if (r1 != r0) goto L_0x070a
            r5.A0C(r11)     // Catch:{ all -> 0x0796 }
            r6.A05 = r11     // Catch:{ all -> 0x0796 }
            int r14 = X.C90474aD.A07(r7, r8)     // Catch:{ all -> 0x0796 }
            int r13 = X.C90474aD.A07(r7, r9)     // Catch:{ all -> 0x0796 }
            int r13 = r13 - r14
            r0 = 7
            int r11 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            int r0 = X.C90474aD.A07(r7, r9)     // Catch:{ all -> 0x0796 }
            int r11 = r11 - r0
            long r2 = r42.length()     // Catch:{ all -> 0x0796 }
            r0 = 7
            int r0 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            long r0 = (long) r0     // Catch:{ all -> 0x0796 }
            long r2 = r2 - r0
            int r10 = (int) r2     // Catch:{ all -> 0x0796 }
            int r0 = X.C90474aD.A07(r7, r9)     // Catch:{ all -> 0x0796 }
            java.lang.Long r1 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x0796 }
            r0 = r43
            r0.A0C = r1     // Catch:{ all -> 0x0796 }
            r4.A0M = r1     // Catch:{ all -> 0x0796 }
            r0 = 7
            int r0 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            java.lang.Long r1 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x0796 }
            r0 = r43
            r0.A0F = r1     // Catch:{ all -> 0x0796 }
            r4.A0O = r1     // Catch:{ all -> 0x0796 }
            int[] r7 = new int[r12]     // Catch:{ all -> 0x0796 }
            r7[r8] = r14     // Catch:{ all -> 0x0796 }
            r7[r18] = r13     // Catch:{ all -> 0x0796 }
            r7[r9] = r11     // Catch:{ all -> 0x0796 }
            r7[r15] = r10     // Catch:{ all -> 0x0796 }
            goto L_0x0707
        L_0x06fd:
            r7[r10] = r11     // Catch:{ all -> 0x0796 }
            long r2 = r42.length()     // Catch:{ all -> 0x0796 }
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch:{ all -> 0x0796 }
            r7[r15] = r0     // Catch:{ all -> 0x0796 }
        L_0x0707:
            r6.A06 = r7     // Catch:{ all -> 0x0796 }
            goto L_0x076d
        L_0x070a:
            int r1 = r7.size()     // Catch:{ all -> 0x0796 }
            r0 = 8
            if (r1 != r0) goto L_0x0761
            r5.A0C(r11)     // Catch:{ all -> 0x0796 }
            r6.A05 = r11     // Catch:{ all -> 0x0796 }
            int r14 = X.C90474aD.A07(r7, r8)     // Catch:{ all -> 0x0796 }
            r0 = 5
            int r13 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            int r13 = r13 - r14
            int r12 = X.C90474aD.A07(r7, r10)     // Catch:{ all -> 0x0796 }
            int r0 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            int r12 = r12 - r0
            long r2 = r42.length()     // Catch:{ all -> 0x0796 }
            int r0 = X.C90474aD.A07(r7, r10)     // Catch:{ all -> 0x0796 }
            long r0 = (long) r0     // Catch:{ all -> 0x0796 }
            long r2 = r2 - r0
            int r9 = (int) r2     // Catch:{ all -> 0x0796 }
            r0 = 5
            int r0 = X.C90474aD.A07(r7, r0)     // Catch:{ all -> 0x0796 }
            java.lang.Long r1 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x0796 }
            r0 = r43
            r0.A0C = r1     // Catch:{ all -> 0x0796 }
            r4.A0M = r1     // Catch:{ all -> 0x0796 }
            int r0 = X.C90474aD.A07(r7, r10)     // Catch:{ all -> 0x0796 }
            java.lang.Long r1 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x0796 }
            r0 = r43
            r0.A0F = r1     // Catch:{ all -> 0x0796 }
            r4.A0O = r1     // Catch:{ all -> 0x0796 }
            r0 = 4
            int[] r1 = new int[r0]     // Catch:{ all -> 0x0796 }
            r1[r8] = r14     // Catch:{ all -> 0x0796 }
            r1[r11] = r13     // Catch:{ all -> 0x0796 }
            r0 = 2
            r1[r0] = r12     // Catch:{ all -> 0x0796 }
            r1[r15] = r9     // Catch:{ all -> 0x0796 }
            r6.A06 = r1     // Catch:{ all -> 0x0796 }
            goto L_0x076d
        L_0x0761:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0796 }
            X.C36341k9.A1N(r2, r1, r7)     // Catch:{ all -> 0x0796 }
            java.lang.String r0 = " does not match target=8"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0796 }
        L_0x076d:
            r24.close()     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = r17
            int r0 = r0.A06     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r6.A02 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = r17
            int r0 = r0.A0A     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r6.A03 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = r17
            int r0 = r0.A02     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r6.A00 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = r17
            int r0 = r0.A03     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r6.A01 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = r17
            java.io.File r0 = r0.A0I     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r6.A00 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r0 = 1
            r6.A02 = r0     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            r5.A0D(r0)     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
            goto L_0x085e
        L_0x0796:
            r1 = move-exception
            goto L_0x079a
        L_0x0798:
            r1 = move-exception
            r8 = 0
        L_0x079a:
            r24.close()     // Catch:{ all -> 0x079e }
            goto L_0x07a2
        L_0x079e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
        L_0x07a2:
            throw r1     // Catch:{ 1X5 -> 0x07a9, IOException -> 0x07a7, OutOfMemoryError -> 0x07a5, SecurityException -> 0x07a3 }
        L_0x07a3:
            r1 = move-exception
            goto L_0x07d3
        L_0x07a5:
            r1 = move-exception
            goto L_0x07ef
        L_0x07a7:
            r2 = move-exception
            goto L_0x0812
        L_0x07a9:
            r2 = move-exception
            goto L_0x0842
        L_0x07ac:
            r3 = move-exception
            long r9 = r41.A01()     // Catch:{ all -> 0x07c1 }
            int r0 = r2.A02     // Catch:{ all -> 0x07c1 }
            long r1 = (long) r0     // Catch:{ all -> 0x07c1 }
            r7 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r7
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x07c0
            java.lang.String r0 = "imageprocessor/compressToFile/No space left on device"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07c1 }
        L_0x07c0:
            throw r3     // Catch:{ all -> 0x07c1 }
        L_0x07c1:
            r0 = move-exception
            r34.recycle()     // Catch:{ SecurityException -> 0x07c6 }
            throw r0     // Catch:{ SecurityException -> 0x07c6 }
        L_0x07c6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/securityexception"
            X.C36321k7.A1W(r0, r1, r2)     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
            throw r2     // Catch:{ 1X5 -> 0x0840, IOException -> 0x0810, OutOfMemoryError -> 0x07ed, SecurityException -> 0x07d1 }
        L_0x07d1:
            r1 = move-exception
            r8 = 0
        L_0x07d3:
            r6.A02 = r8     // Catch:{ all -> 0x08b9 }
            r5.A0D(r8)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "mediatranscodequeue/image/security "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "permissions-error"
            r5.A0A(r0)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x08b9 }
            X.AnonymousClass75H.A05(r5, r4, r0, r1)     // Catch:{ all -> 0x08b9 }
            r1 = 2131891585(0x7f121581, float:1.9417894E38)
            goto L_0x0808
        L_0x07ed:
            r1 = move-exception
            r8 = 0
        L_0x07ef:
            r6.A02 = r8     // Catch:{ all -> 0x08b9 }
            r5.A0D(r8)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "mediatranscodequeue/image/oom/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "oom"
            r5.A0A(r0)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x08b9 }
            X.AnonymousClass75H.A05(r5, r4, r0, r1)     // Catch:{ all -> 0x08b9 }
            r1 = 2131889315(0x7f120ca3, float:1.941329E38)
        L_0x0808:
            r0 = r44
            X.7gs r0 = r0.A05     // Catch:{ all -> 0x08b9 }
            r0.B5i(r1)     // Catch:{ all -> 0x08b9 }
            goto L_0x0858
        L_0x0810:
            r2 = move-exception
            r8 = 0
        L_0x0812:
            r6.A02 = r8     // Catch:{ all -> 0x08b9 }
            r5.A0D(r8)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "mediatranscodequeue/image/io/ "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x08b9 }
            if (r0 == 0) goto L_0x082b
            boolean r0 = X.C90504aG.A1Y(r2)     // Catch:{ all -> 0x08b9 }
            r1 = 2131889309(0x7f120c9d, float:1.9413278E38)
            if (r0 != 0) goto L_0x082e
        L_0x082b:
            r1 = 2131889286(0x7f120c86, float:1.9413231E38)
        L_0x082e:
            r0 = r44
            X.7gs r0 = r0.A05     // Catch:{ all -> 0x08b9 }
            r0.B5i(r1)     // Catch:{ all -> 0x08b9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "IOError: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x08b9 }
            goto L_0x084e
        L_0x0840:
            r2 = move-exception
            r8 = 0
        L_0x0842:
            java.lang.String r0 = "mediatranscodequeue/image/not-a-image/ "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x08b9 }
            r6.A02 = r8     // Catch:{ all -> 0x08b9 }
            r5.A0D(r8)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = "NotAImageException"
        L_0x084e:
            r5.A0A(r0)     // Catch:{ all -> 0x08b9 }
            java.lang.String r0 = X.AnonymousClass000.A0k(r2)     // Catch:{ all -> 0x08b9 }
            X.AnonymousClass75H.A05(r5, r4, r0, r2)     // Catch:{ all -> 0x08b9 }
        L_0x0858:
            r0 = r45
            android.os.PowerManager$WakeLock r0 = r0.A00
            r16 = r0
        L_0x085e:
            X.C90464aC.A0t(r16)
            X.5Bf r8 = r6.A00()
            goto L_0x0869
        L_0x0866:
            X.C90464aC.A0t(r16)
        L_0x0869:
            boolean r2 = r8.A02
            if (r2 == 0) goto L_0x08b5
            int[] r1 = r8.A06
            int r0 = r1.length
            if (r0 <= 0) goto L_0x087f
            r0 = 0
            r0 = r1[r0]
            java.lang.Long r1 = X.C36441kJ.A0y(r0)
            r0 = r43
            r0.A0B = r1
            r4.A0L = r1
        L_0x087f:
            java.io.File r0 = r8.A00
            X.C18740tg.A06(r0)
            long r0 = r0.length()
            r5.A07(r0)
            boolean r0 = r8.A04
            r5.A0C(r0)
            byte[] r0 = r8.A03
            if (r0 == 0) goto L_0x08b2
            int r0 = r0.length
            long r0 = (long) r0
        L_0x0896:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r43
            r0.A0N = r1
            r4.A0Z = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A06 = r0
            boolean r0 = r8.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A06 = r0
            r5.A03()
            return r8
        L_0x08b2:
            r0 = 0
            goto L_0x0896
        L_0x08b5:
            r5.A02()
            return r8
        L_0x08b9:
            r1 = move-exception
            r0 = r45
            android.os.PowerManager$WakeLock r0 = r0.A00
            X.C90464aC.A0t(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104795Bk.A06():X.5v9");
    }

    public C104795Bk(PowerManager.WakeLock wakeLock, C19700wN r2, C21060yb r3, C20060wx r4, AnonymousClass1DF r5, C20810yC r6, C25521Gq r7, AnonymousClass1EJ r8, C25501Go r9, AnonymousClass5BV r10, AnonymousClass1GX r11) {
        super(r10);
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r11;
        this.A02 = r3;
        this.A09 = r8;
        this.A0A = r9;
        this.A08 = r7;
        this.A06 = r10;
        this.A00 = wakeLock;
        this.A04 = r5;
    }
}
