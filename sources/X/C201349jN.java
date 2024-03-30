package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.9jN  reason: invalid class name and case insensitive filesystem */
public class C201349jN {
    public static final int[] A04 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] A05 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final AnonymousClass9JQ[][] A06;
    public static final Charset A07;
    public static final boolean A08 = C112775eR.A00;
    public static final byte[] A09 = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0A;
    public static final byte[] A0B = {-1, -40, -1};
    public static final HashMap A0C = AnonymousClass001.A0J();
    public static final HashSet A0D = C36421kH.A0g(new String[]{"DigitalZoomRatio", "ExposureTime"});
    public static final AnonymousClass9JQ[] A0E = {new AnonymousClass9JQ("SubIFDPointer", 330, 4), new AnonymousClass9JQ("ExifIFDPointer", 34665, 4)};
    public static final AnonymousClass9JQ[] A0F;
    public static final AnonymousClass9JQ[] A0G;
    public static final HashMap[] A0H = new HashMap[3];
    public int A00;
    public ByteOrder A01;
    public final HashMap[] A02 = new HashMap[3];
    public final Set A03 = new HashSet(3);

    public int A02(String str) {
        NumberFormatException numberFormatException;
        Objects.requireNonNull(str, "tag shouldn't be null");
        Objects.requireNonNull(str, "tag shouldn't be null");
        int i = 0;
        do {
            C199419fH r1 = (C199419fH) this.A02[i].get(str);
            if (r1 != null) {
                try {
                    Object A002 = C199419fH.A00(r1, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a integer value");
                    } else if (A002 instanceof String) {
                        return Integer.parseInt((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a integer value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            } else {
                i++;
            }
        } while (i < 3);
        return -1;
    }

    static {
        AnonymousClass9JQ[] r13 = {new AnonymousClass9JQ("Orientation", 274, 3), new AnonymousClass9JQ("SubIFDPointer", 330, 4), new AnonymousClass9JQ("ExifIFDPointer", 34665, 4)};
        A0G = r13;
        AnonymousClass9JQ[] r7 = {new AnonymousClass9JQ("ExposureTime", 33434, 5), new AnonymousClass9JQ("PhotographicSensitivity", 34855, 3), new AnonymousClass9JQ("ShutterSpeedValue", 37377, 10), new AnonymousClass9JQ("ApertureValue", 37378, 5), new AnonymousClass9JQ("FocalLength", 37386, 5), new AnonymousClass9JQ("WhiteBalance", 41987, 3), new AnonymousClass9JQ("DigitalZoomRatio", 41988, 5), new AnonymousClass9JQ("FocalLengthIn35mmFilm", 41989, 3)};
        A0F = r7;
        A06 = new AnonymousClass9JQ[][]{r13, r7, r13};
        Charset forName = Charset.forName("US-ASCII");
        A07 = forName;
        A0A = "Exif\u0000\u0000".getBytes(forName);
        int i = 0;
        while (true) {
            AnonymousClass9JQ[][] r2 = A06;
            if (i < 3) {
                A0H[i] = AnonymousClass001.A0J();
                for (AnonymousClass9JQ r22 : r2[i]) {
                    C36331k8.A1Q(r22, A0H[i], r22.A00);
                }
                i++;
            } else {
                C36341k9.A1K(Integer.valueOf(A0E[1].A00), A0C, 1);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        if (r18 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0205, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0206, code lost:
        r9 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0208, code lost:
        if (r11 >= 3) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020a, code lost:
        r1 = X.C90464aC.A0h(r11, "The size of tag group[");
        r1.append("]: ");
        android.util.Log.d("ExifReader", X.C36381kD.A10(r1, r9[r11].size()));
        r12 = X.C36371kC.A10(r9[r11]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        if (r12.hasNext() == false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022c, code lost:
        r0 = X.AnonymousClass000.A11(r12);
        r9 = (X.C199419fH) r0.getValue();
        r1 = new java.lang.Object[3];
        r1[0] = r0.getKey();
        X.C90514aH.A1Q(r9, r1, 1);
        r1[2] = r9.A02(r8.A01);
        X.C165587tf.A1M("tagName: %s, tagType: %s, tagValue: '%s'", "ExifReader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024f, code lost:
        r11 = r11 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C201349jN(java.io.InputStream r21) {
        /*
            r20 = this;
            r8 = r20
            r8.<init>()
            r0 = 3
            r7 = 3
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r8.A02 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r7)
            r8.A03 = r0
            java.nio.ByteOrder r11 = java.nio.ByteOrder.BIG_ENDIAN
            r8.A01 = r11
            java.lang.String r19 = "tagName: %s, tagType: %s, tagValue: '%s'"
            java.lang.String r6 = "]: "
            java.lang.String r5 = "The size of tag group["
            java.lang.String r0 = "inputstream shouldn't be null"
            r10 = r21
            java.util.Objects.requireNonNull(r10, r0)
            r4 = 0
            r9 = 0
        L_0x0025:
            r3 = 2
            r2 = 1
            if (r9 >= r7) goto L_0x0034
            java.util.HashMap[] r1 = r8.A02     // Catch:{ IOException -> 0x0252 }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0252 }
            r1[r9] = r0     // Catch:{ IOException -> 0x0252 }
            int r9 = r9 + 1
            goto L_0x0025
        L_0x0034:
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0252 }
            r12.<init>(r10, r0)     // Catch:{ IOException -> 0x0252 }
            r12.mark(r0)     // Catch:{ IOException -> 0x0252 }
            byte[] r10 = new byte[r0]     // Catch:{ IOException -> 0x0252 }
            r12.read(r10)     // Catch:{ IOException -> 0x0252 }
            r12.reset()     // Catch:{ IOException -> 0x0252 }
            r9 = 0
        L_0x0047:
            byte[] r0 = A0B     // Catch:{ IOException -> 0x0252 }
            if (r9 >= r7) goto L_0x005b
            byte r1 = r10[r9]     // Catch:{ IOException -> 0x0252 }
            byte r0 = r0[r9]     // Catch:{ IOException -> 0x0252 }
            if (r1 == r0) goto L_0x0058
            java.lang.String r0 = "This EXIF util only supports JPEG"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x0252 }
        L_0x0057:
            throw r0     // Catch:{ IOException -> 0x0252 }
        L_0x0058:
            int r9 = r9 + 1
            goto L_0x0047
        L_0x005b:
            X.ATv r10 = new X.ATv     // Catch:{ IOException -> 0x0252 }
            r10.<init>(r12)     // Catch:{ IOException -> 0x0252 }
            boolean r18 = A08     // Catch:{ IOException -> 0x0252 }
            if (r18 == 0) goto L_0x0073
            java.lang.String r9 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "getJpegAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r10, r0, r1)     // Catch:{ IOException -> 0x0252 }
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x0252 }
        L_0x0073:
            r10.A02 = r11     // Catch:{ IOException -> 0x0252 }
            byte r11 = r10.A00()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r9 = "Invalid marker: "
            r0 = -1
            if (r11 != r0) goto L_0x01ef
            byte r1 = r10.A00()     // Catch:{ IOException -> 0x0252 }
            r0 = -40
            if (r1 != r0) goto L_0x01df
            r13 = 2
        L_0x0087:
            byte r9 = r10.A00()     // Catch:{ IOException -> 0x0252 }
            r0 = -1
            if (r9 != r0) goto L_0x01ca
            r17 = 1
            int r12 = r13 + 1
            byte r1 = r10.A00()     // Catch:{ IOException -> 0x0252 }
            if (r18 == 0) goto L_0x00af
            java.lang.String r11 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Found JPEG segment indicator: "
            r9.append(r0)     // Catch:{ IOException -> 0x0252 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            X.C90504aG.A0z(r0, r9)     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = r9.toString()     // Catch:{ IOException -> 0x0252 }
            android.util.Log.d(r11, r0)     // Catch:{ IOException -> 0x0252 }
        L_0x00af:
            int r9 = r12 + 1
            r0 = -39
            if (r1 == r0) goto L_0x01ff
            r0 = -38
            if (r1 == r0) goto L_0x01ff
            int r14 = r10.A02()     // Catch:{ IOException -> 0x0252 }
            int r14 = r14 - r3
            int r13 = r9 + 2
            if (r18 == 0) goto L_0x00d8
            java.lang.String r11 = "ExifReader"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0252 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0252 }
            r9[r4] = r0     // Catch:{ IOException -> 0x0252 }
            int r0 = r14 + 2
            X.AnonymousClass000.A1L(r9, r0, r2)     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "JPEG segment: %s, (length: %d)"
            X.C165587tf.A1M(r0, r11, r9)     // Catch:{ IOException -> 0x0252 }
        L_0x00d8:
            java.lang.String r0 = "Invalid length"
            if (r14 < 0) goto L_0x01c4
            r0 = -31
            if (r1 != r0) goto L_0x017d
            byte[] r15 = new byte[r14]     // Catch:{ IOException -> 0x0252 }
            r10.A06(r15)     // Catch:{ IOException -> 0x0252 }
            int r16 = r13 + r14
            byte[] r11 = A0A     // Catch:{ IOException -> 0x0252 }
            if (r11 != 0) goto L_0x00ed
            r17 = 0
        L_0x00ed:
            int r12 = r11.length     // Catch:{ IOException -> 0x0252 }
            if (r14 >= r12) goto L_0x00f2
            r17 = 0
        L_0x00f2:
            r9 = 0
        L_0x00f3:
            if (r9 >= r12) goto L_0x0100
            byte r1 = r15[r9]     // Catch:{ IOException -> 0x0252 }
            byte r0 = r11[r9]     // Catch:{ IOException -> 0x0252 }
            if (r1 == r0) goto L_0x00fd
            r17 = 0
        L_0x00fd:
            int r9 = r9 + 1
            goto L_0x00f3
        L_0x0100:
            if (r17 == 0) goto L_0x017a
            byte[] r11 = java.util.Arrays.copyOfRange(r15, r12, r14)     // Catch:{ IOException -> 0x0252 }
            int r13 = r13 + r12
            r8.A00 = r13     // Catch:{ IOException -> 0x0252 }
            if (r18 == 0) goto L_0x011a
            java.lang.String r9 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "readExifSegment for type: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ IOException -> 0x0252 }
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x0252 }
        L_0x011a:
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r11)     // Catch:{ IOException -> 0x0252 }
            X.ATv r1 = new X.ATv     // Catch:{ IOException -> 0x0252 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0252 }
            int r11 = r11.length     // Catch:{ IOException -> 0x0252 }
            short r9 = r1.A04()     // Catch:{ IOException -> 0x0252 }
            r0 = 18761(0x4949, float:2.629E-41)
            if (r9 == r0) goto L_0x013c
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r9 != r0) goto L_0x0186
            if (r18 == 0) goto L_0x0139
            java.lang.String r9 = "ExifReader"
            java.lang.String r0 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x0252 }
        L_0x0139:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0252 }
            goto L_0x0147
        L_0x013c:
            if (r18 == 0) goto L_0x0145
            java.lang.String r9 = "ExifReader"
            java.lang.String r0 = "readExifSegment: Byte Align II"
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x0252 }
        L_0x0145:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x0252 }
        L_0x0147:
            r8.A01 = r0     // Catch:{ IOException -> 0x0252 }
            r1.A02 = r0     // Catch:{ IOException -> 0x0252 }
            int r9 = r1.A02()     // Catch:{ IOException -> 0x0252 }
            r0 = 42
            if (r9 != r0) goto L_0x01a9
            int r9 = r1.A01()     // Catch:{ IOException -> 0x0252 }
            r0 = 8
            if (r9 < r0) goto L_0x0199
            if (r9 >= r11) goto L_0x0199
            int r9 = r9 + -8
            if (r9 <= 0) goto L_0x0177
            int r0 = r1.A03(r9)     // Catch:{ IOException -> 0x0252 }
            if (r0 == r9) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Couldn't jump to first Ifd: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r9)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x0177:
            r8.A00(r1, r4)     // Catch:{ IOException -> 0x0252 }
        L_0x017a:
            r13 = r16
            r14 = 0
        L_0x017d:
            int r0 = r10.A03(r14)     // Catch:{ IOException -> 0x0252 }
            if (r0 != r14) goto L_0x01bc
            int r13 = r13 + r14
            goto L_0x0087
        L_0x0186:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Invalid byte order: "
            r1.append(r0)     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = java.lang.Integer.toHexString(r9)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x0199:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Invalid first Ifd offset: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r9)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Invalid start code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = java.lang.Integer.toHexString(r9)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01bc:
            java.lang.String r0 = "Invalid JPEG segment"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01c4:
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01ca:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0252 }
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)     // Catch:{ IOException -> 0x0252 }
            r0 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ IOException -> 0x0252 }
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01ef:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ IOException -> 0x0252 }
            r0 = r11 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0252 }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)     // Catch:{ IOException -> 0x0252 }
            goto L_0x0057
        L_0x01ff:
            java.nio.ByteOrder r0 = r8.A01     // Catch:{ IOException -> 0x0252 }
            r10.A02 = r0     // Catch:{ IOException -> 0x0252 }
            if (r18 == 0) goto L_0x02a9
            r11 = 0
        L_0x0206:
            java.util.HashMap[] r9 = r8.A02
            if (r11 >= r7) goto L_0x02a9
            java.lang.String r10 = "ExifReader"
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r11, r5)
            r1.append(r6)
            r0 = r9[r11]
            int r0 = r0.size()
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            android.util.Log.d(r10, r0)
            r0 = r9[r11]
            java.util.Iterator r12 = X.C36371kC.A10(r0)
        L_0x0226:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x024f
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r12)
            java.lang.Object r9 = r0.getValue()
            X.9fH r9 = (X.C199419fH) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.C90514aH.A1Q(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.C165587tf.A1M(r0, r10, r1)
            goto L_0x0226
        L_0x024f:
            int r11 = r11 + 1
            goto L_0x0206
        L_0x0252:
            r1 = move-exception
            boolean r0 = A08     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x02a9
            java.lang.String r11 = "ExifReader"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r11, r0, r1)     // Catch:{ all -> 0x02aa }
            r10 = 0
        L_0x025f:
            java.util.HashMap[] r9 = r8.A02
            if (r10 >= r7) goto L_0x02a9
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r10, r5)
            r1.append(r6)
            r0 = r9[r10]
            int r0 = r0.size()
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            android.util.Log.d(r11, r0)
            r0 = r9[r10]
            java.util.Iterator r12 = X.C36371kC.A10(r0)
        L_0x027d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r12)
            java.lang.Object r9 = r0.getValue()
            X.9fH r9 = (X.C199419fH) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.C90514aH.A1Q(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.C165587tf.A1M(r0, r11, r1)
            goto L_0x027d
        L_0x02a6:
            int r10 = r10 + 1
            goto L_0x025f
        L_0x02a9:
            return
        L_0x02aa:
            r13 = move-exception
            boolean r0 = A08
            if (r0 == 0) goto L_0x02fc
            r11 = 0
        L_0x02b0:
            java.util.HashMap[] r9 = r8.A02
            if (r11 >= r7) goto L_0x02fc
            java.lang.String r10 = "ExifReader"
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r11, r5)
            r1.append(r6)
            r0 = r9[r11]
            int r0 = r0.size()
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            android.util.Log.d(r10, r0)
            r0 = r9[r11]
            java.util.Iterator r12 = X.C36371kC.A10(r0)
        L_0x02d0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f9
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r12)
            java.lang.Object r9 = r0.getValue()
            X.9fH r9 = (X.C199419fH) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.C90514aH.A1Q(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.C165587tf.A1M(r0, r10, r1)
            goto L_0x02d0
        L_0x02f9:
            int r11 = r11 + 1
            goto L_0x02b0
        L_0x02fc:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201349jN.<init>(java.io.InputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r10 == r0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r10 == 7) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C21654ATv r24, int r25) {
        /*
            r23 = this;
            r22 = r23
            r0 = r22
            java.util.Set r0 = r0.A03
            r21 = r0
            r8 = r24
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r21
            r0.add(r1)
            int r0 = r8.A00
            r14 = 2
            int r0 = r0 + 2
            int r7 = r8.A03
            if (r0 > r7) goto L_0x0274
            short r6 = r8.A04()
            boolean r20 = A08
            if (r20 == 0) goto L_0x0035
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r6)
            android.util.Log.d(r2, r0)
        L_0x0035:
            int r1 = r8.A00
            int r0 = r6 * 12
            int r1 = r1 + r0
            if (r1 > r7) goto L_0x0274
            if (r6 <= 0) goto L_0x0274
            r13 = 0
            r19 = 0
        L_0x0041:
            r3 = 1
            r0 = r19
            if (r0 >= r6) goto L_0x022b
            int r16 = r8.A02()
            int r10 = r8.A02()
            int r12 = r8.A01()
            int r0 = r8.A00
            long r4 = (long) r0
            r0 = 4
            long r4 = r4 + r0
            java.util.HashMap[] r0 = A0H
            r0 = r0[r25]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            java.lang.Object r9 = r0.get(r11)
            X.9JQ r9 = (X.AnonymousClass9JQ) r9
            r2 = 0
            if (r20 == 0) goto L_0x0086
            java.lang.String r15 = "ExifReader"
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = r25
            X.AnonymousClass000.A1L(r1, r0, r13)
            r1[r3] = r11
            if (r9 == 0) goto L_0x0079
            java.lang.String r2 = r9.A02
        L_0x0079:
            r1[r14] = r2
            X.C36341k9.A1T(r1, r10)
            X.C36341k9.A1U(r1, r12)
            java.lang.String r0 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            X.C165587tf.A1M(r0, r15, r1)
        L_0x0086:
            if (r9 != 0) goto L_0x00a6
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Skip the tag entry since tag number is not defined: "
            r0 = r16
            java.lang.String r0 = X.AnonymousClass000.A0r(r2, r3, r0)
        L_0x0098:
            android.util.Log.d(r1, r0)
        L_0x009b:
            r8.A05(r4)
        L_0x009e:
            int r0 = r19 + 1
            short r0 = (short) r0
            r19 = r0
            r14 = 2
            r13 = 0
            goto L_0x0041
        L_0x00a6:
            if (r10 <= 0) goto L_0x0201
            int[] r15 = A04
            r0 = 14
            if (r10 >= r0) goto L_0x0201
            int r2 = r9.A01
            r0 = 7
            if (r2 == r0) goto L_0x00c3
            if (r10 == r0) goto L_0x00c6
            if (r2 == r10) goto L_0x00c3
            r1 = 4
            r0 = 3
            if (r2 == r1) goto L_0x00c1
            r0 = 9
            if (r2 != r0) goto L_0x01e8
            r0 = 8
        L_0x00c1:
            if (r10 != r0) goto L_0x01e8
        L_0x00c3:
            r0 = 7
            if (r10 != r0) goto L_0x00c7
        L_0x00c6:
            r10 = r2
        L_0x00c7:
            long r2 = (long) r12
            r0 = r15[r10]
            long r0 = (long) r0
            long r2 = r2 * r0
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0212
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0212
            r13 = 4
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            int r13 = r8.A01()
            if (r20 == 0) goto L_0x00f4
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "seek to data offset: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r14, r13)
            android.util.Log.d(r1, r0)
        L_0x00f4:
            long r0 = (long) r13
            long r17 = r0 + r2
            long r14 = (long) r7
            int r16 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x01c1
            r8.A05(r0)
        L_0x00ff:
            java.util.HashMap r0 = A0C
            java.lang.Number r11 = X.C36441kJ.A10(r11, r0)
            if (r20 == 0) goto L_0x011e
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "nextIfdType: "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r0 = " byteCount: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r13, r2)
            android.util.Log.d(r1, r0)
        L_0x011e:
            if (r11 == 0) goto L_0x01a2
            r2 = -1
            r0 = 3
            if (r10 == r0) goto L_0x0179
            r0 = 4
            if (r10 == r0) goto L_0x0170
            r0 = 8
            if (r10 == r0) goto L_0x016b
            r0 = 9
            if (r10 == r0) goto L_0x017e
            r0 = 13
            if (r10 == r0) goto L_0x017e
        L_0x0134:
            if (r20 == 0) goto L_0x0149
            java.lang.String r12 = "ExifReader"
            java.lang.Object[] r10 = X.AnonymousClass001.A0M()
            X.C90474aD.A1S(r10, r2)
            java.lang.String r1 = r9.A02
            r0 = 1
            r10[r0] = r1
            java.lang.String r0 = "Offset: %d, tagName: %s"
            X.C165587tf.A1M(r0, r12, r10)
        L_0x0149:
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d2
            long r0 = (long) r7
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x01d2
            int r1 = (int) r2
            r0 = r21
            boolean r0 = X.AnonymousClass000.A1Z(r0, r1)
            if (r0 != 0) goto L_0x0184
            r8.A05(r2)
            int r1 = r11.intValue()
            r0 = r22
            r0.A00(r8, r1)
            goto L_0x009b
        L_0x016b:
            short r0 = r8.A04()
            goto L_0x0182
        L_0x0170:
            int r0 = r8.A01()
            long r2 = X.C165597tg.A0C(r0)
            goto L_0x0134
        L_0x0179:
            int r0 = r8.A02()
            goto L_0x0182
        L_0x017e:
            int r0 = r8.A01()
        L_0x0182:
            long r2 = (long) r0
            goto L_0x0134
        L_0x0184:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip jump into the IFD since it has already been read: IfdType "
            r9.append(r0)
            r9.append(r11)
            java.lang.String r0 = " (at "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = ")"
            r9.append(r0)
            goto L_0x01e2
        L_0x01a2:
            int r0 = (int) r2
            byte[] r0 = new byte[r0]
            r8.A06(r0)
            X.9fH r2 = new X.9fH
            r2.<init>(r0, r10, r12)
            r0 = r22
            java.util.HashMap[] r0 = r0.A02
            r1 = r0[r25]
            java.lang.String r0 = r9.A02
            r1.put(r0, r2)
            int r0 = r8.A00
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x009e
            goto L_0x009b
        L_0x01c1:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since data offset is invalid: "
            r9.append(r0)
            r9.append(r13)
            goto L_0x01e2
        L_0x01d2:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip jump into the IFD since its offset is invalid: "
            r9.append(r0)
            r9.append(r2)
        L_0x01e2:
            java.lang.String r0 = r9.toString()
            goto L_0x0098
        L_0x01e8:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String[] r0 = A05
            r0 = r0[r10]
            r3[r13] = r0
            java.lang.String r2 = r9.A02
            r0 = 1
            r3[r0] = r2
            java.lang.String r0 = "Skip the tag entry since data format (%s) is unexpected for tag: %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            goto L_0x0098
        L_0x0201:
            if (r20 == 0) goto L_0x009b
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            r1.append(r0)
            r1.append(r10)
            goto L_0x0222
        L_0x0212:
            if (r20 == 0) goto L_0x009b
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            r1.append(r0)
            r1.append(r12)
        L_0x0222:
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto L_0x009b
        L_0x022b:
            int r0 = r8.A00
            int r0 = r0 + 4
            if (r0 > r7) goto L_0x0274
            int r5 = r8.A01()
            if (r20 == 0) goto L_0x0243
            java.lang.String r2 = "ExifReader"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.AnonymousClass000.A1L(r1, r5, r13)
            java.lang.String r0 = "nextIfdOffset: %d"
            X.C165587tf.A1M(r0, r2, r1)
        L_0x0243:
            long r1 = (long) r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            if (r5 >= r7) goto L_0x0263
            r0 = r21
            boolean r0 = X.AnonymousClass000.A1Z(r0, r5)
            if (r0 != 0) goto L_0x0258
            r8.A05(r1)
            return
        L_0x0258:
            if (r20 == 0) goto L_0x0274
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x026d
        L_0x0263:
            if (r20 == 0) goto L_0x0274
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x026d:
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            android.util.Log.d(r2, r0)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201349jN.A00(X.ATv, int):void");
    }

    public double A01(String str) {
        NumberFormatException numberFormatException;
        Objects.requireNonNull(str, "tag shouldn't be null");
        Objects.requireNonNull(str, "tag shouldn't be null");
        int i = 0;
        do {
            C199419fH r1 = (C199419fH) this.A02[i].get(str);
            if (r1 != null) {
                try {
                    Object A002 = C199419fH.A00(r1, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                    } else if (A002 instanceof String) {
                        return Double.parseDouble((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (double) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return (double) iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof double[]) {
                            double[] dArr = (double[]) A002;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof AnonymousClass9QQ[]) {
                            AnonymousClass9QQ[] r4 = (AnonymousClass9QQ[]) A002;
                            if (r4.length == 1) {
                                AnonymousClass9QQ r2 = r4[0];
                                return ((double) r2.A01) / ((double) r2.A00);
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a double value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            } else {
                i++;
            }
        } while (i < 3);
        return -1.0d;
    }
}
