package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Xp  reason: invalid class name and case insensitive filesystem */
public class C133276Xp {
    public static final byte[] A04 = "%FDF-".getBytes();
    public static final byte[] A05 = "%PDF-".getBytes();
    public static final byte[] A06 = "endobj".getBytes();
    public static final byte[] A07 = " obj".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};
    public int A00;
    public boolean A01;
    public final AnonymousClass62B A02 = new AnonymousClass62B();
    public final File A03;

    public static boolean A04(int i) {
        return i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1;
    }

    public static boolean A05(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        throw new X.C25581Gw();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r7 = this;
            r5 = 0
            r7.A00 = r5
            r7.A01 = r5
            java.io.File r0 = r7.A03
            java.io.BufferedInputStream r3 = X.C90474aD.A0U(r0)
            X.62B r6 = r7.A02     // Catch:{ all -> 0x004c }
            byte[] r4 = r6.A01     // Catch:{ all -> 0x004c }
            java.util.Arrays.fill(r4, r5)     // Catch:{ all -> 0x004c }
            r2 = 0
        L_0x0013:
            int r0 = r3.read()     // Catch:{ all -> 0x004c }
            if (r0 < 0) goto L_0x0046
            byte r1 = (byte) r0     // Catch:{ all -> 0x004c }
            int r0 = r6.A00     // Catch:{ all -> 0x004c }
            r4[r0] = r1     // Catch:{ all -> 0x004c }
            int r1 = r0 + 1
            r6.A00 = r1     // Catch:{ all -> 0x004c }
            r0 = 200(0xc8, float:2.8E-43)
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x004c }
            byte[] r0 = A05     // Catch:{ all -> 0x004c }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x003e
            byte[] r0 = A04     // Catch:{ all -> 0x004c }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x003e
            int r2 = r2 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 >= r0) goto L_0x0046
            goto L_0x0013
        L_0x003e:
            r0 = 1
            r7.A01(r3, r5, r0)     // Catch:{ all -> 0x004c }
            r3.close()
            return
        L_0x0046:
            X.1Gw r0 = new X.1Gw     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
            throw r1
        L_0x0051:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133276Xp.A08():void");
    }

    public static void A00(InputStream inputStream, int i) {
        int read;
        if (i > 500) {
            throw new C25581Gw();
        }
        do {
            read = inputStream.read();
        } while (A05(read));
        if (read != -1) {
            while (true) {
                if (read == 40) {
                    while (true) {
                        int read2 = inputStream.read();
                        if (read2 != 92) {
                            if (read2 == 41 || read2 == -1) {
                                break;
                            }
                        } else {
                            inputStream.read();
                        }
                    }
                } else if (read == 60) {
                    do {
                    } while (inputStream.read() != 62);
                } else if (read == 91) {
                    A00(inputStream, i + 1);
                } else if (read == 93 || read == -1) {
                    return;
                }
                read = inputStream.read();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.io.InputStream r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 <= r0) goto L_0x000a
            X.1Gw r0 = new X.1Gw
            r0.<init>()
            throw r0
        L_0x000a:
            int r0 = r10.read()
            r3 = -1
            if (r0 == r3) goto L_0x001b
            if (r12 == 0) goto L_0x001c
            byte[] r0 = A07
            boolean r0 = r9.A06(r10, r0)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            int r2 = r10.read()
            boolean r0 = A05(r2)
            if (r0 != 0) goto L_0x001c
            if (r2 == r3) goto L_0x001b
            r5 = 0
        L_0x0029:
            if (r2 == r3) goto L_0x003b
            r1 = 60
            if (r2 != r1) goto L_0x00aa
            int r0 = r10.read()
            if (r0 != r1) goto L_0x00aa
            int r0 = r11 + 1
            java.util.HashMap r5 = r9.A07(r10, r0)
        L_0x003b:
            r9.A03(r5)
            if (r2 == r3) goto L_0x001b
            java.lang.String r0 = "/Type"
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r0 = "/Pages"
            boolean r0 = r0.equals(r2)
            java.lang.String r6 = "pdfparser/numberformat/"
            r7 = 82
            r3 = 1
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "/Parent"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "/Count"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0081
            java.lang.String r4 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x009a
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            if (r0 != r7) goto L_0x009a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "pdfparser/indirectpagecount/"
            X.C36321k7.A1Q(r0, r4, r1)
        L_0x0081:
            java.lang.String r0 = "/Length"
            java.lang.String r8 = X.C90504aG.A0l(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            if (r0 != 0) goto L_0x00bd
            int r0 = r8.length()
            int r0 = r0 - r3
            char r0 = r8.charAt(r0)
            if (r0 == r7) goto L_0x00bd
            goto L_0x00b0
        L_0x009a:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a1 }
            r9.A00 = r0     // Catch:{ NumberFormatException -> 0x00a1 }
            goto L_0x0081
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = X.C36321k7.A0D(r6, r4)
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0081
        L_0x00aa:
            int r2 = r10.read()
            goto L_0x0029
        L_0x00b0:
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00b5 }
            goto L_0x00be
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = X.C36321k7.A0D(r6, r8)
            com.whatsapp.util.Log.i(r0, r1)
        L_0x00bd:
            r6 = 0
        L_0x00be:
            java.lang.String r0 = "/ObjStm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0106
            byte[] r0 = A08
            r9.A06(r10, r0)
            int r1 = r10.read()
            r0 = 13
            if (r1 != r0) goto L_0x00d6
            r10.read()
        L_0x00d6:
            X.5R8 r2 = new X.5R8
            r2.<init>(r10, r6)
            java.lang.String r0 = "/Filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "/FlateDecode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
            r0.<init>(r2)     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
            r2.<init>(r0)     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
            int r0 = r11 + 1
            r9.A01(r2, r0, r4)     // Catch:{ all -> 0x00fc }
            r2.close()     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
            goto L_0x0113
        L_0x00fc:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
        L_0x0105:
            throw r1     // Catch:{ ZipException -> 0x010b, IOException -> 0x011c }
        L_0x0106:
            long r0 = (long) r6
            r10.skip(r0)
            goto L_0x0113
        L_0x010b:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput marking file as suspicious"
            com.whatsapp.util.Log.e(r0, r1)
            r9.A01 = r3
        L_0x0113:
            if (r12 == 0) goto L_0x000a
            byte[] r0 = A06
            r9.A06(r10, r0)
            goto L_0x000a
        L_0x011c:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput "
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133276Xp.A01(java.io.InputStream, int, boolean):void");
    }

    private void A03(Map map) {
        if (map != null) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A02(C90494aF.A0f(A11));
                Object value = A11.getValue();
                if (value instanceof String) {
                    A02((String) value);
                } else if (value instanceof Map) {
                    A03((Map) value);
                }
            }
        }
    }

    private boolean A06(InputStream inputStream, byte[] bArr) {
        AnonymousClass62B r3 = this.A02;
        byte[] bArr2 = r3.A01;
        Arrays.fill(bArr2, (byte) 0);
        do {
            int read = inputStream.read();
            if (read < 0) {
                return false;
            }
            byte b = (byte) read;
            int i = r3.A00;
            bArr2[i] = b;
            int i2 = i + 1;
            r3.A00 = i2;
            r3.A00 = i2 % 200;
        } while (!r3.A00(bArr));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r4 == 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r1.append((char) r4);
        r4 = r8.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (A04(r4) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (A05(r4) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r5 = r1.toString().trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A07(java.io.InputStream r8, int r9) {
        /*
            r7 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r9 > r0) goto L_0x00c5
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
        L_0x0008:
            int r4 = r8.read()
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0024
        L_0x0019:
            int r4 = r8.read()
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            r6 = -1
            if (r4 == r6) goto L_0x0031
            r1 = 62
            if (r4 != r1) goto L_0x0032
            int r0 = r8.read()
            if (r0 != r1) goto L_0x0032
        L_0x0031:
            return r2
        L_0x0032:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
        L_0x0036:
            char r0 = (char) r4
            r3.append(r0)
            int r4 = r8.read()
            boolean r0 = A04(r4)
            if (r0 != 0) goto L_0x004a
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0036
        L_0x004a:
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x005b
        L_0x0050:
            int r4 = r8.read()
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x005b
            goto L_0x0050
        L_0x005b:
            if (r4 == r6) goto L_0x0031
            r5 = 0
            r0 = 40
            if (r4 == r0) goto L_0x00a1
            r0 = 60
            if (r4 == r0) goto L_0x00b4
            r0 = 91
            if (r4 == r0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 47
            if (r4 != r0) goto L_0x007a
        L_0x0072:
            char r0 = (char) r4
            r1.append(r0)
            int r4 = r8.read()
        L_0x007a:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x0072
            boolean r0 = A05(r4)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = r1.toString()
            java.lang.String r5 = r0.trim()
        L_0x008e:
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r0.trim()
            r2.put(r0, r5)
            goto L_0x0013
        L_0x009b:
            int r0 = r9 + 1
            A00(r8, r0)
            goto L_0x00c0
        L_0x00a1:
            int r1 = r8.read()
            r0 = 92
            if (r1 != r0) goto L_0x00ad
            r8.read()
            goto L_0x00a1
        L_0x00ad:
            r0 = 41
            if (r1 == r0) goto L_0x00c0
            if (r1 != r6) goto L_0x00a1
            goto L_0x00c0
        L_0x00b4:
            int r4 = r8.read()
            if (r4 != r0) goto L_0x008e
            int r0 = r9 + 1
            java.util.HashMap r5 = r7.A07(r8, r0)
        L_0x00c0:
            int r4 = r8.read()
            goto L_0x008e
        L_0x00c5:
            X.1Gw r0 = new X.1Gw
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133276Xp.A07(java.io.InputStream, int):java.util.HashMap");
    }

    public C133276Xp(File file) {
        this.A03 = file;
    }

    private void A02(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            if (str.charAt(0) == '/' && str.indexOf(35) >= 0) {
                StringBuilder A0u = AnonymousClass000.A0u();
                int length = str.length();
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt != '#' || i > length - 3) {
                        A0u.append(charAt);
                    } else {
                        try {
                            A0u.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                            i += 2;
                        } catch (NumberFormatException unused) {
                            A0u.append(charAt);
                        }
                    }
                    i++;
                }
                str = A0u.toString();
            }
        }
        String[] strArr = A09;
        int i2 = 0;
        do {
            if (strArr[i2].equals(str)) {
                this.A01 = true;
                C36321k7.A1Q("pdfparser/checkname pdf contains suspicious name ", str, AnonymousClass000.A0u());
            }
            i2++;
        } while (i2 < 6);
    }
}
