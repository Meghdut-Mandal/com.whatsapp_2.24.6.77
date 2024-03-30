package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1DC  reason: invalid class name */
public class AnonymousClass1DC {
    public static final AnonymousClass1DB A01 = new AnonymousClass1DB(0, 0, true);
    public static final AnonymousClass1DB A02 = new AnonymousClass1DB(0, 7, true);
    public static final AnonymousClass1DA A03 = new AnonymousClass1DA(0, 0, 0, true);
    public static final AnonymousClass1DA A04 = new AnonymousClass1DA(0, 5, 7, true);
    public static final byte[] A05 = {35, 33, 65, 77, 82, 10};
    public static final byte[] A06 = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A07 = {79, 103, 103, 83};
    public static final byte[] A08 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A09 = {82, 73, 70, 70};
    public static final byte[] A0A = {100, 97, 116, 97};
    public static final byte[] A0B = {102, 109, 116, 32};
    public static final byte[] A0C = {73, 68, 51};
    public static final byte[] A0D = {102, 116, 121, 112};
    public static final byte[] A0E = {51, 103};
    public static final byte[] A0F = {113, 116, 32, 32};
    public static final byte[] A0G = {87, 65, 86, 69};
    public static final int[] A0H = {1633973356, 1668637984, 1684108385, 1717658484, 1718449184, 1768846196, 1818321516, 1819572340, 1852798053, 1886155636, 1936552044};
    public final C19700wN A00;

    public static int A00(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int A01(C121905tu r11, InputStream inputStream) {
        try {
            int i = (int) (r11.A01 - r11.A02);
            byte[] bArr = new byte[i];
            if (A02(inputStream, bArr, 0, i) != i) {
                return 7;
            }
            byte b = bArr[4];
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Did not find esds description tag - found: ");
                sb.append(b);
                Log.i(sb.toString());
                return 7;
            }
            int[] A0E2 = A0E(bArr, 4, i);
            if (A0E2 == null) {
                Log.i("Did not find esds description details");
                return 7;
            }
            int i2 = A0E2[0] + 3;
            byte b2 = bArr[i2];
            int i3 = 1;
            int i4 = i2 + 1;
            if ((b2 & 128) == 128) {
                i4 += 2;
            }
            if ((b2 & 64) == 64) {
                i4 += bArr[i4] + 1;
            }
            if ((b2 & 32) == 32) {
                i4 += 2;
            }
            byte b3 = bArr[i4];
            if (b3 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Did not find esds config description tag - found: ");
                sb2.append(b3);
                Log.i(sb2.toString());
                return 7;
            }
            int[] A0E3 = A0E(bArr, i4, i);
            if (A0E3 == null) {
                Log.i("Did not find esds config details");
                return 7;
            }
            int i5 = A0E3[0];
            byte b4 = bArr[i5 + 1];
            if (b4 != 64) {
                if (b4 != 107) {
                    switch (b4) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        case 105:
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Did not find esds supported type - found: ");
                            sb3.append(b4);
                            Log.i(sb3.toString());
                            return 7;
                    }
                }
                i3 = 2;
            }
            byte b5 = bArr[i5 + 2];
            if (((b5 & 252) >> 2) == 5) {
                return i3;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Did not find stream type - found: ");
            sb4.append(b5);
            Log.i(sb4.toString());
            return 7;
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return 7;
        }
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length - i);
        int i3 = 0;
        while (i3 < min) {
            int read = inputStream.read(bArr, i + i3, min - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static boolean A0B(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i2 = 0;
            while (i2 < length2) {
                if (bArr[i + i2] == bArr2[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public static byte[] A0C(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int[] A0D(InputStream inputStream) {
        byte[] bArr = new byte[2];
        if (A02(inputStream, bArr, 0, 2) == 2) {
            byte b = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4a box version: ");
            sb.append(b);
            Log.i(sb.toString());
            if (b == 0) {
                return new int[]{0, 18};
            }
            if (b == 1) {
                return new int[]{1, 34};
            }
            if (b == 2) {
                return new int[]{2, 54};
            }
            throw new IOException("Unexpected result getting mp4a version");
        }
        throw new IOException("Unexpected eof getting mp4a version");
    }

    public static C121905tu A05(InputStream inputStream, int[] iArr, long j, long j2) {
        long j3;
        long j4;
        long j5;
        String str;
        long j6 = j2;
        int[] iArr2 = iArr;
        new String(A0C(iArr[0]));
        long j7 = 0;
        long j8 = j;
        InputStream inputStream2 = inputStream;
        if (j > 0) {
            if (j2 <= 0 || j <= j2) {
                A09(inputStream2, j8);
                if (j2 == -1) {
                    j6 = -1;
                } else {
                    j6 = j2 - j;
                }
            } else {
                throw new IOException("Not enough bytes to skip");
            }
        }
        int i = 8;
        byte[] bArr = new byte[8];
        while (true) {
            if (j3 != -1 && j3 <= j7) {
                return null;
            }
            int A022 = A02(inputStream2, bArr, 0, i);
            if (A022 >= i) {
                long j9 = (long) A022;
                if (j3 == -1) {
                    j4 = -1;
                } else {
                    j4 = j3 - j9;
                }
                for (int i2 = 4; i2 < i; i2++) {
                    byte b = bArr[i2];
                    if (b < 32) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found non character data in box type ");
                        sb.append(b);
                        Log.i(sb.toString());
                        return null;
                    }
                }
                int A002 = A00(bArr[0], bArr[1], bArr[2], bArr[3]);
                new String(bArr, 4, 4);
                if (A002 == 0) {
                    A002 = -1;
                } else if (A002 == 1) {
                    byte[] bArr2 = new byte[i];
                    A022 += A02(inputStream2, bArr2, 0, i);
                    if (A022 == 16) {
                        long j10 = (long) A022;
                        if (j5 == -1) {
                            j5 = -1;
                        } else {
                            j5 -= j10;
                        }
                        long A003 = ((long) A00(bArr2[4], bArr2[5], bArr2[6], bArr2[7])) | (((long) A00(bArr2[0], bArr2[1], bArr2[2], bArr2[3])) << 32);
                        if (A003 <= 2147483647L) {
                            A002 = (int) A003;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Length of box too long to be processed: ");
                            sb2.append(A003);
                            throw new IOException(sb2.toString());
                        }
                    } else {
                        throw new IOException("End of file looking for wide box length");
                    }
                }
                if (j5 <= 0 || j5 >= ((long) (A002 - A022))) {
                    int A004 = A00(bArr[4], bArr[5], bArr[6], bArr[7]);
                    boolean A032 = AnonymousClass6XG.A03(iArr2, A004);
                    byte[] A0C2 = A0C(A004);
                    if (A032) {
                        return new C121905tu(A002, A004, A022);
                    }
                    new String(A0C2);
                    long j11 = (long) (A002 - A022);
                    A09(inputStream2, j11);
                    if (j5 == -1) {
                        j3 = -1;
                    } else {
                        j3 = j5 - j11;
                    }
                    j7 = 0;
                    i = 8;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Length of box too long to be in current input: ");
                    sb3.append(A002);
                    sb3.append('>');
                    sb3.append(j5);
                    throw new IOException(sb3.toString());
                }
            } else {
                throw new IOException("End of file looking for box header");
            }
        }
    }

    public static String A06(AnonymousClass1DB r3) {
        switch (r3.A00) {
            case 1:
                if (r3.A01 != 2) {
                    return "audio/aac";
                }
                return "audio/mp4";
            case 2:
                if (r3.A01 != 2) {
                    return "audio/mpeg";
                }
                return "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("invalid audio type returned; ");
                sb.append(r3);
                throw new AssertionError(sb.toString());
            default:
                Log.w("unsupported audio type; returning null mime type");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Audio type not supported: ");
                sb2.append(r3.A00);
                throw new C108715Up(sb2.toString());
        }
    }

    public static void A09(InputStream inputStream, long j) {
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (j > 0) {
            long j2 = (long) EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (A02(inputStream, bArr, 0, (int) Math.min(j2, j)) != -1) {
                j -= j2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected EOF skipping ");
                sb.append(j);
                throw new IOException(sb.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[Catch:{ Exception -> 0x0028 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[Catch:{ Exception -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A0E(byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 4
            r7 = 0
            int r6 = java.lang.Math.min(r10, r0)     // Catch:{ Exception -> 0x0028 }
            r5 = 0
            r4 = r9
            r2 = 0
        L_0x000a:
            r3 = 1
            int r4 = r4 + 1
            int r2 = r2 << 7
            byte r0 = r8[r4]     // Catch:{ Exception -> 0x0028 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + r0
            if (r9 >= r6) goto L_0x001d
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0028 }
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x000a
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            return r7
        L_0x0020:
            r0 = 2
            int[] r0 = new int[r0]     // Catch:{ Exception -> 0x0028 }
            r0[r5] = r4     // Catch:{ Exception -> 0x0028 }
            r0[r3] = r2     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "Exception processing esds box: "
            com.whatsapp.util.Log.i(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DC.A0E(byte[], int, int):int[]");
    }

    public AnonymousClass1DC(C19700wN r1) {
        this.A00 = r1;
    }

    public static AnonymousClass1DB A03(File file) {
        AnonymousClass1DB r5;
        int i;
        String str;
        StringBuilder sb;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(AnonymousClass1GW.A0J(file));
        try {
            byte[] bArr = new byte[36];
            boolean z = false;
            int A022 = A02(bufferedInputStream, bArr, 0, 8);
            if (A022 >= 8) {
                if (!A0B(bArr, A0D, 4)) {
                    if (A0B(bArr, A07, 0)) {
                        int A023 = A022 + A02(bufferedInputStream, bArr, A022, 36 - A022);
                        if (A023 < 27) {
                            str3 = "not opus - too few bytes for first packet";
                        } else {
                            int i4 = (bArr[26] & 255) + 27;
                            byte[] bArr2 = A08;
                            int i5 = 8 + i4;
                            if (A023 < i5) {
                                byte[] bArr3 = new byte[i5];
                                System.arraycopy(bArr, 0, bArr3, 0, A023);
                                if (A023 + A02(bufferedInputStream, bArr3, A023, i5 - A023) < i5) {
                                    str3 = "not opus - too few bytes";
                                } else {
                                    bArr = bArr3;
                                }
                            }
                            if (A0B(bArr, bArr2, i4)) {
                                r5 = new AnonymousClass1DB(4, 5, false);
                            } else {
                                str3 = "not opus - header bytes don't match";
                            }
                        }
                        Log.i(str3);
                        r5 = new AnonymousClass1DB(4, 7, true);
                    } else {
                        byte[] bArr4 = A09;
                        if (!A0B(bArr, bArr4, 0)) {
                            A022 += A02(bufferedInputStream, bArr, A022, 10 - A022);
                            if (A022 >= 10) {
                                if (A022 == 10 && A0B(bArr, A0C, 0)) {
                                    A09(bufferedInputStream, (long) (((bArr[8] & Byte.MAX_VALUE) << 7) | ((bArr[6] & Byte.MAX_VALUE) << 21) | ((bArr[7] & Byte.MAX_VALUE) << 14) | (bArr[9] & Byte.MAX_VALUE)));
                                    A022 = A02(bufferedInputStream, bArr, 0, 10);
                                    int i6 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                                    boolean z2 = false;
                                    while (true) {
                                        if (A022 <= 0) {
                                            break;
                                        } else if (i6 > 0 && !A0B(bArr, bArr4, 0) && (bArr[0] != -1 || ((byte) (bArr[1] & 224)) != -32)) {
                                            A022--;
                                            System.arraycopy(bArr, 1, bArr, 0, A022);
                                            if (!z2) {
                                                if (bufferedInputStream.read(bArr, A022, 1) == -1) {
                                                    bArr[A022] = 0;
                                                    i6 = 0;
                                                    z2 = true;
                                                } else {
                                                    A022++;
                                                    i6--;
                                                }
                                            }
                                        }
                                    }
                                    if (A022 >= 4) {
                                        if (!A0B(bArr, bArr4, 0)) {
                                            if (A022 < 10) {
                                            }
                                        }
                                    }
                                }
                                if (A022 + A02(bufferedInputStream, bArr, A022, 36 - A022) >= 36) {
                                    if (bArr[0] == -1) {
                                        byte b = bArr[1];
                                        if (((byte) (b & 224)) == -32) {
                                            if ((b & 6) == 0) {
                                                r5 = new AnonymousClass1DB(1, 1, false);
                                            } else {
                                                i2 = 2;
                                                r5 = new AnonymousClass1DB(1, i2, false);
                                            }
                                        }
                                    }
                                    if (A0B(bArr, A05, 0)) {
                                        i2 = 3;
                                    } else if (A0B(bArr, A06, 0)) {
                                        i2 = 4;
                                    } else {
                                        r5 = A02;
                                    }
                                    r5 = new AnonymousClass1DB(1, i2, false);
                                }
                            }
                        }
                        int i7 = 36;
                        byte[] bArr5 = new byte[36];
                        byte[] bArr6 = new byte[8];
                        System.arraycopy(bArr, 0, bArr5, 0, A022);
                        if (A022 + A02(bufferedInputStream, bArr5, A022, 36 - A022) != 36) {
                            Log.i("Insufficient data for WAV file header");
                            i = 0;
                        } else {
                            if (!A0B(bArr5, A0G, 8)) {
                                sb = new StringBuilder();
                                sb.append("Not WAVE File type ");
                                str2 = new String(bArr5, 8, 4);
                            } else if (!A0B(bArr5, A0B, 12)) {
                                sb = new StringBuilder();
                                sb.append("Not WAVE chunk format ");
                                str2 = new String(bArr5, 12, 4);
                            } else {
                                byte b2 = ((bArr5[21] & 255) << 8) | (bArr5[20] & 255);
                                if (80 == b2 || 85 == b2 || 5632 == b2 || 5648 == b2) {
                                    int A002 = A00(bArr5[19], bArr5[18], bArr5[17], bArr5[16]) + 16 + 4;
                                    while (true) {
                                        A09(bufferedInputStream, (long) (A002 - i7));
                                        int A024 = A02(bufferedInputStream, bArr6, 0, 8);
                                        int i8 = A002 + A024;
                                        if (A024 == 8) {
                                            if (!AnonymousClass6XG.A03(A0H, A00(bArr6[0], bArr6[1], bArr6[2], bArr6[3]))) {
                                                sb = new StringBuilder();
                                                sb.append("Unsupported WAVE chunk: ");
                                                str2 = new String(bArr6, 0, 4);
                                                break;
                                            } else if (A0B(bArr6, A0A, 0)) {
                                                byte[] bArr7 = new byte[2];
                                                if (A02(bufferedInputStream, bArr7, 0, 2) != 2) {
                                                    str = "EOF reading WAVE data";
                                                } else {
                                                    if (bArr7[0] == -1) {
                                                        byte b3 = bArr7[1];
                                                        if (((byte) (b3 & 224)) == -32) {
                                                            i = 2;
                                                            if ((b3 & 6) == 0) {
                                                                i = 1;
                                                            }
                                                        }
                                                    }
                                                    str = "Not ACC/MP3 WAVE data";
                                                }
                                            } else {
                                                i7 = i8;
                                                A002 = A00(bArr6[7], bArr6[6], bArr6[5], bArr6[4]) + i8;
                                            }
                                        } else {
                                            str = "EOF reading WAVE chunk";
                                            break;
                                        }
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    sb.append("RIFF/WAV container carries stream which is not one of supported MPEG audio streams ");
                                    sb.append(b2);
                                    str = sb.toString();
                                    Log.i(str);
                                    i = 7;
                                    z = true;
                                }
                            }
                            sb.append(str2);
                            str = sb.toString();
                            Log.i(str);
                            i = 7;
                            z = true;
                        }
                        r5 = new AnonymousClass1DB(5, i, z);
                    }
                    bufferedInputStream.close();
                    return r5;
                } else if (A022 + A02(bufferedInputStream, bArr, 8, 4) >= 12) {
                    C121905tu A052 = A05(bufferedInputStream, new int[]{1836019574}, (long) (A00(bArr[0], bArr[1], bArr[2], bArr[3]) - 12), -1);
                    if (A052 == null) {
                        str4 = "moov box not found";
                    } else {
                        long j = A052.A01;
                        long j2 = A052.A02;
                        AnonymousClass5RD r1 = new AnonymousClass5RD(bufferedInputStream, j2);
                        long j3 = (j - j2) + r1.A01;
                        i3 = 0;
                        loop0:
                        while (true) {
                            long j4 = r1.A01;
                            if (j4 < j3) {
                                C121905tu A053 = A05(r1, new int[]{1953653099}, 0, j3 - j4);
                                if (A053 != null) {
                                    long j5 = (r1.A01 + A053.A01) - A053.A02;
                                    while (true) {
                                        long j6 = r1.A01;
                                        if (j6 >= j5) {
                                            continue;
                                            break;
                                        }
                                        AnonymousClass5RD r17 = r1;
                                        C121905tu A054 = A05(r17, new int[]{1835297121}, 0, j5 - j6);
                                        if (A054 == null) {
                                            str4 = "mdia box not found";
                                            break loop0;
                                        }
                                        long j7 = r1.A01;
                                        long j8 = (j7 + A054.A01) - A054.A02;
                                        C121905tu A055 = A05(r17, new int[]{1751411826}, 0, j8 - j7);
                                        if (A055 == null) {
                                            str4 = "hdlr box not found";
                                            break loop0;
                                        }
                                        long j9 = A055.A02;
                                        long j10 = (r1.A01 + A055.A01) - j9;
                                        A09(r1, 16 - j9);
                                        byte[] bArr8 = new byte[4];
                                        if (A02(r1, bArr8, 0, 4) != 4) {
                                            str4 = "hdlr box too short";
                                            break loop0;
                                        }
                                        int A003 = A00(bArr8[0], bArr8[1], bArr8[2], bArr8[3]);
                                        if (A003 == 1986618469) {
                                            str4 = "video hdlr type not valid";
                                            break loop0;
                                        }
                                        if (A003 != 1936684398) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("non sound hdlr type found ");
                                            sb2.append(new String(A0C(A003)));
                                            Log.i(sb2.toString());
                                        } else if (i3 != 0) {
                                            Log.i("multiple hldr sound tracks found");
                                            i3 = 6;
                                            break loop0;
                                        } else {
                                            long j11 = r1.A01;
                                            C121905tu A056 = A05(r1, new int[]{1835626086}, j10 - j11, j8 - j11);
                                            if (A056 == null) {
                                                str4 = "minf box not found";
                                                break loop0;
                                            }
                                            long j12 = r1.A01;
                                            C121905tu A057 = A05(r17, new int[]{1937007212}, 0, ((j12 + A056.A01) - A056.A02) - j12);
                                            if (A057 == null) {
                                                str4 = "stbl box not found";
                                                break loop0;
                                            }
                                            long j13 = r1.A01;
                                            C121905tu A058 = A05(r17, new int[]{1937011556}, 0, ((j13 + A057.A01) - A057.A02) - j13);
                                            if (A058 == null) {
                                                str4 = "stsd box not found";
                                                break loop0;
                                            }
                                            A09(r1, 8);
                                            long j14 = r1.A01;
                                            C121905tu A059 = A05(r17, new int[]{1836069985, 1935764850, 1935767394}, 0, ((j14 + A058.A01) - A058.A02) - j14);
                                            if (A059 == null) {
                                                str4 = "content box not found";
                                                break loop0;
                                            }
                                            int i9 = A059.A00;
                                            if (i9 != 1836069985) {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("Found media contents that wasn't m4a: ");
                                                sb3.append(new String(A0C(i9)));
                                                str4 = sb3.toString();
                                                break loop0;
                                            }
                                            long j15 = (r1.A01 + A059.A01) - A059.A02;
                                            A09(r1, 8);
                                            C121905tu A0510 = A05(r17, new int[]{1702061171}, (long) A0D(r1)[1], j15 - r1.A01);
                                            if (A0510 == null) {
                                                str4 = "esds box not found";
                                                break loop0;
                                            }
                                            i3 = A01(A0510, r1);
                                        }
                                        A09(r1, j5 - r1.A01);
                                    }
                                }
                            } else if (7 == i3) {
                            }
                        }
                    }
                    Log.i(str4);
                    i3 = 7;
                    z = true;
                    r5 = new AnonymousClass1DB(2, i3, z);
                    bufferedInputStream.close();
                    return r5;
                }
            }
            r5 = A01;
        } catch (IOException e) {
            Log.i("Excepton reading next chunk ", e);
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        bufferedInputStream.close();
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0379, code lost:
        r0 = "esds box not found";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c7, code lost:
        r0 = "multiple hldr audio tracks found - not dolby";
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0388 A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038e A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0225 A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1DA A04(java.io.File r31) {
        /*
            java.io.FileInputStream r1 = X.AnonymousClass1GW.A0J(r31)
            java.io.BufferedInputStream r19 = new java.io.BufferedInputStream
            r0 = r19
            r0.<init>(r1)
            r10 = 0
            r4 = 12
            byte[] r5 = new byte[r4]     // Catch:{ all -> 0x03f2 }
            int r0 = A02(r0, r5, r10, r4)     // Catch:{ all -> 0x03f2 }
            if (r0 >= r4) goto L_0x001a
            X.1DA r12 = A03     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x001a:
            r1 = 4
            byte[] r0 = A0D     // Catch:{ all -> 0x03f2 }
            boolean r0 = A0B(r5, r0, r1)     // Catch:{ all -> 0x03f2 }
            if (r0 == 0) goto L_0x0040
            byte[] r0 = A0F     // Catch:{ all -> 0x03f2 }
            r2 = 8
            boolean r0 = A0B(r5, r0, r2)     // Catch:{ all -> 0x03f2 }
            r20 = 3
            r1 = 2
            if (r0 == 0) goto L_0x0033
            r21 = 7
            goto L_0x0043
        L_0x0033:
            byte[] r0 = A0E     // Catch:{ all -> 0x03f2 }
            boolean r0 = A0B(r5, r0, r2)     // Catch:{ all -> 0x03f2 }
            r21 = 2
            if (r0 == 0) goto L_0x0043
            r21 = 3
            goto L_0x0043
        L_0x0040:
            java.lang.String r0 = "video not MP4/3GP type file"
            goto L_0x0068
        L_0x0043:
            byte r3 = r5[r10]     // Catch:{ all -> 0x03f2 }
            r0 = 1
            byte r2 = r5[r0]     // Catch:{ all -> 0x03f2 }
            byte r1 = r5[r1]     // Catch:{ all -> 0x03f2 }
            byte r0 = r5[r20]     // Catch:{ all -> 0x03f2 }
            int r0 = A00(r3, r2, r1, r0)     // Catch:{ all -> 0x03f2 }
            int r0 = r0 - r4
            long r2 = (long) r0     // Catch:{ all -> 0x03f2 }
            r1 = 1
            int[] r4 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4[r10] = r0     // Catch:{ all -> 0x03f2 }
            r15 = -1
            r11 = r19
            r12 = r4
            r13 = r2
            X.5tu r4 = A05(r11, r12, r13, r15)     // Catch:{ all -> 0x03f2 }
            if (r4 != 0) goto L_0x006f
            java.lang.String r0 = "moov box not found"
        L_0x0068:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f2 }
            X.1DA r12 = A04     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x006f:
            X.1DA r12 = new X.1DA     // Catch:{ all -> 0x03f2 }
            r12.<init>()     // Catch:{ all -> 0x03f2 }
            r0 = r21
            r12.A01 = r0     // Catch:{ all -> 0x03f2 }
            long r2 = r4.A01     // Catch:{ all -> 0x03f2 }
            r16 = r2
            long r2 = r4.A02     // Catch:{ all -> 0x03f2 }
            long r16 = r16 - r2
            X.5RD r0 = new X.5RD     // Catch:{ all -> 0x03f2 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x03f2 }
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r16 = r16 + r2
        L_0x0089:
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x03da
            r4 = 0
            long r6 = r16 - r2
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r2 = r0
            X.5tu r4 = A05(r2, r3, r4, r6)     // Catch:{ all -> 0x03f2 }
            if (r4 == 0) goto L_0x0089
            long r13 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r4.A01     // Catch:{ all -> 0x03f2 }
            long r13 = r13 + r2
            long r2 = r4.A02     // Catch:{ all -> 0x03f2 }
            long r13 = r13 - r2
        L_0x00a9:
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            r4 = 2
            int[] r5 = new int[r4]     // Catch:{ all -> 0x03f2 }
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            r5[r10] = r4     // Catch:{ all -> 0x03f2 }
            r24 = 1835297121(0x6d646961, float:4.4181236E27)
            r5[r1] = r24     // Catch:{ all -> 0x03f2 }
            r27 = 0
            long r29 = r13 - r2
            r25 = r0
            r26 = r5
            X.5tu r11 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x03f2 }
            if (r11 != 0) goto L_0x00cd
            java.lang.String r0 = "tkmd/mdia box not found"
            goto L_0x0068
        L_0x00cd:
            int r2 = r11.A00     // Catch:{ all -> 0x03f2 }
            if (r2 != r4) goto L_0x019c
            long r6 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r8 = r11.A01     // Catch:{ all -> 0x03f2 }
            long r6 = r6 + r8
            long r4 = r11.A02     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r4
            r11 = 0
            r22 = 92
            int r2 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r2 < 0) goto L_0x0183
            long r2 = r8 - r4
            int r4 = (int) r2     // Catch:{ all -> 0x03f2 }
            byte[] r15 = new byte[r4]     // Catch:{ all -> 0x03f2 }
            int r2 = A02(r0, r15, r10, r4)     // Catch:{ all -> 0x03f2 }
            if (r2 != r4) goto L_0x03cb
            byte r2 = r15[r10]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x00f4
            r18 = 76
            r22 = 40
            goto L_0x0100
        L_0x00f4:
            if (r2 != r1) goto L_0x0183
            r18 = 88
            r3 = 104(0x68, double:5.14E-322)
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0183
            r22 = 52
        L_0x0100:
            byte r5 = r15[r18]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 1
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 2
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 3
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r8 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 4
            byte r5 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 5
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 6
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 7
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r3 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            if (r8 <= 0) goto L_0x013a
            if (r3 <= 0) goto L_0x013a
            int r2 = r12.A03     // Catch:{ all -> 0x03f2 }
            if (r2 > 0) goto L_0x013a
            int r2 = r12.A04     // Catch:{ all -> 0x03f2 }
            if (r2 > 0) goto L_0x013a
            int r2 = r3 >>> 16
            r12.A03 = r2     // Catch:{ all -> 0x03f2 }
            int r2 = r8 >>> 16
            r12.A04 = r2     // Catch:{ all -> 0x03f2 }
        L_0x013a:
            r9 = 9
            int[] r8 = new int[r9]     // Catch:{ all -> 0x03f2 }
        L_0x013e:
            int r18 = r11 * 4
            int r18 = r18 + r22
            byte r5 = r15[r18]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 1
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 2
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 3
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            r8[r11] = r2     // Catch:{ all -> 0x03f2 }
            int r11 = r11 + 1
            if (r11 < r9) goto L_0x013e
            r3 = r8[r10]     // Catch:{ all -> 0x03f2 }
            r4 = 4
            if (r3 != 0) goto L_0x0183
            r2 = r8[r1]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = 2
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = r8[r20]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = r8[r4]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = 5
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = 6
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = 7
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0183
            r2 = 8
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
        L_0x0183:
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r2
            long r26 = r13 - r2
            int[] r2 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2[r10] = r24     // Catch:{ all -> 0x03f2 }
            r22 = r0
            r23 = r2
            r24 = r6
            X.5tu r11 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r11 != 0) goto L_0x019c
            java.lang.String r0 = "mdia box not found"
            goto L_0x0068
        L_0x019c:
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r11.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r2 + r4
            long r4 = r11.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r4
            r4 = 0
            long r6 = r26 - r2
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r2 = r0
            X.5tu r4 = A05(r2, r3, r4, r6)     // Catch:{ all -> 0x03f2 }
            if (r4 != 0) goto L_0x01bc
            java.lang.String r0 = "hdlr box not found"
            goto L_0x0068
        L_0x01bc:
            long r6 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r4.A01     // Catch:{ all -> 0x03f2 }
            long r6 = r6 + r2
            long r4 = r4.A02     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r4
            r2 = 16
            long r2 = r2 - r4
            A09(r0, r2)     // Catch:{ all -> 0x03f2 }
            r8 = 4
            byte[] r2 = new byte[r8]     // Catch:{ all -> 0x03f2 }
            int r3 = A02(r0, r2, r10, r8)     // Catch:{ all -> 0x03f2 }
            if (r3 == r8) goto L_0x01d7
            java.lang.String r0 = "hdlr box too short"
            goto L_0x0068
        L_0x01d7:
            byte r5 = r2[r10]     // Catch:{ all -> 0x03f2 }
            byte r4 = r2[r1]     // Catch:{ all -> 0x03f2 }
            r3 = 2
            byte r3 = r2[r3]     // Catch:{ all -> 0x03f2 }
            byte r2 = r2[r20]     // Catch:{ all -> 0x03f2 }
            int r9 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            r2 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r9 == r2) goto L_0x01f8
            r2 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 == r2) goto L_0x01f0
            goto L_0x03b0
        L_0x01f0:
            int r2 = r12.A02     // Catch:{ all -> 0x03f2 }
            if (r2 == 0) goto L_0x0207
            java.lang.String r0 = "multiple hldr video tracks found"
            goto L_0x0068
        L_0x01f8:
            r3 = 8
            int r2 = r12.A00     // Catch:{ all -> 0x03f2 }
            if (r2 == 0) goto L_0x0207
            if (r2 == r1) goto L_0x0204
            if (r2 == r3) goto L_0x0204
            goto L_0x03d3
        L_0x0204:
            r18 = 1
            goto L_0x0209
        L_0x0207:
            r18 = 0
        L_0x0209:
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r2
            long r26 = r26 - r2
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r22 = r0
            r23 = r3
            r24 = r6
            X.5tu r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0225
            java.lang.String r0 = "minf box not found"
            goto L_0x0068
        L_0x0225:
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            long r26 = r26 - r4
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r24 = 0
            r23 = r3
            X.5tu r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0246
            java.lang.String r0 = "stbl box not found"
            goto L_0x0068
        L_0x0246:
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            long r26 = r26 - r4
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r23 = r3
            X.5tu r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0265
            java.lang.String r0 = "stsd box not found"
            goto L_0x0068
        L_0x0265:
            r2 = 8
            A09(r0, r2)     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            r2 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 != r2) goto L_0x02b4
            int[] r9 = new int[r8]     // Catch:{ all -> 0x03f2 }
            r7 = 1635148593(0x61766331, float:2.840654E20)
            r9[r10] = r7     // Catch:{ all -> 0x03f2 }
            r6 = 1836070006(0x6d703476, float:4.646239E27)
            r9[r1] = r6     // Catch:{ all -> 0x03f2 }
            r3 = 1932670515(0x73323633, float:1.4119387E31)
            r2 = 2
            r9[r2] = r3     // Catch:{ all -> 0x03f2 }
            r2 = 1752589105(0x68766331, float:4.6541277E24)
            r9[r20] = r2     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r4
            r23 = r9
            X.5tu r4 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r4 != 0) goto L_0x029e
            java.lang.String r0 = "video content box not found"
            goto L_0x0068
        L_0x029e:
            int r4 = r4.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r7) goto L_0x02a4
            r1 = 2
            goto L_0x02b0
        L_0x02a4:
            if (r4 != r6) goto L_0x02a8
            r1 = 3
            goto L_0x02b0
        L_0x02a8:
            if (r4 == r3) goto L_0x02b0
            if (r4 != r2) goto L_0x03b9
            r12.A02 = r8     // Catch:{ all -> 0x03f2 }
            goto L_0x03b9
        L_0x02b0:
            r12.A02 = r1     // Catch:{ all -> 0x03f2 }
            goto L_0x03b9
        L_0x02b4:
            r2 = 5
            int[] r6 = new int[r2]     // Catch:{ all -> 0x03f2 }
            r9 = 1836069985(0x6d703461, float:4.6462328E27)
            r6[r10] = r9     // Catch:{ all -> 0x03f2 }
            r11 = 1935764850(0x73616d72, float:1.7860208E31)
            r6[r1] = r11     // Catch:{ all -> 0x03f2 }
            r8 = 1935767394(0x73617762, float:1.7863284E31)
            r2 = 2
            r6[r2] = r8     // Catch:{ all -> 0x03f2 }
            r7 = 778924083(0x2e6d7033, float:5.3987214E-11)
            r6[r20] = r7     // Catch:{ all -> 0x03f2 }
            r3 = 1700998451(0x65632d33, float:6.7050686E22)
            r2 = 4
            r6[r2] = r3     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r4
            r23 = r6
            X.5tu r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x02e0
            java.lang.String r0 = "sound content box not found"
            goto L_0x0068
        L_0x02e0:
            if (r18 == 0) goto L_0x02ec
            int r5 = r12.A00     // Catch:{ all -> 0x03f2 }
            r4 = 8
            if (r5 != r4) goto L_0x0308
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r9) goto L_0x03c7
        L_0x02ec:
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r9) goto L_0x0392
            long r2 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r2 + r4
            long r4 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            r4 = 8
            A09(r0, r4)     // Catch:{ all -> 0x03f2 }
            int[] r5 = A0D(r0)     // Catch:{ all -> 0x03f2 }
            r4 = r5[r10]     // Catch:{ all -> 0x03f2 }
            r6 = r5[r1]     // Catch:{ all -> 0x03f2 }
            if (r4 == 0) goto L_0x0315
            goto L_0x030f
        L_0x0308:
            if (r5 != r1) goto L_0x03c7
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r3) goto L_0x03c7
            goto L_0x02ec
        L_0x030f:
            r5 = 7
            r4 = r21
            if (r4 != r5) goto L_0x0315
            goto L_0x0323
        L_0x0315:
            r15 = 8
            long r8 = (long) r6     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            int[] r4 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r1 = 1702061171(0x65736473, float:7.183675E22)
            r4[r10] = r1     // Catch:{ all -> 0x03f2 }
            goto L_0x036d
        L_0x0323:
            long r6 = (long) r6     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r30 = r2 - r4
            r4 = 2
            int[] r5 = new int[r4]     // Catch:{ all -> 0x03f2 }
            r4 = 2002876005(0x77617665, float:4.5729223E33)
            r5[r10] = r4     // Catch:{ all -> 0x03f2 }
            r11 = 1702061171(0x65736473, float:7.183675E22)
            r5[r1] = r11     // Catch:{ all -> 0x03f2 }
            r15 = 8
            r26 = r0
            r27 = r5
            r28 = r6
            X.5tu r1 = A05(r26, r27, r28, r30)     // Catch:{ all -> 0x03f2 }
            int r5 = r1.A00     // Catch:{ all -> 0x03f2 }
            if (r5 != r4) goto L_0x037d
            long r6 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r8 = r1.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r6 + r8
            long r8 = r1.A02     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r8
            r8 = 0
            long r26 = r4 - r6
            r1 = 1
            int[] r1 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r1[r10] = r11     // Catch:{ all -> 0x03f2 }
            r23 = r1
            X.5tu r1 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r1 != 0) goto L_0x037f
            long r6 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r6
            A09(r0, r4)     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            r1 = 1
            int[] r4 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r4[r10] = r11     // Catch:{ all -> 0x03f2 }
        L_0x036d:
            r23 = r4
            r24 = r8
            r26 = r2
            X.5tu r1 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r1 != 0) goto L_0x037f
        L_0x0379:
            java.lang.String r0 = "esds box not found"
            goto L_0x0068
        L_0x037d:
            if (r5 != r11) goto L_0x0379
        L_0x037f:
            int r3 = A01(r1, r0)     // Catch:{ all -> 0x03f2 }
            r12.A00 = r3     // Catch:{ all -> 0x03f2 }
            r2 = 1
            if (r18 == 0) goto L_0x038e
            if (r3 == r2) goto L_0x038b
            goto L_0x03c3
        L_0x038b:
            r12.A00 = r15     // Catch:{ all -> 0x03f2 }
            goto L_0x03b9
        L_0x038e:
            r1 = 7
            if (r3 != r1) goto L_0x03b9
            goto L_0x03d7
        L_0x0392:
            r1 = 8
            if (r4 != r11) goto L_0x0398
            r2 = 3
            goto L_0x03ad
        L_0x0398:
            if (r4 == r8) goto L_0x03ad
            if (r4 != r7) goto L_0x03a8
            r2 = 7
            r1 = r21
            if (r1 == r2) goto L_0x03a6
            java.lang.String r1 = ".mp3 box found in non-QuickTime file (?!)"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x03f2 }
        L_0x03a6:
            r2 = 2
            goto L_0x03ad
        L_0x03a8:
            if (r4 != r3) goto L_0x03b9
            r12.A00 = r1     // Catch:{ all -> 0x03f2 }
            goto L_0x03b9
        L_0x03ad:
            r12.A00 = r2     // Catch:{ all -> 0x03f2 }
            goto L_0x03b9
        L_0x03b0:
            byte[] r2 = A0C(r9)     // Catch:{ all -> 0x03f2 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x03f2 }
            r1.<init>(r2)     // Catch:{ all -> 0x03f2 }
        L_0x03b9:
            long r3 = r0.A01     // Catch:{ all -> 0x03f2 }
            long r1 = r13 - r3
            A09(r0, r1)     // Catch:{ all -> 0x03f2 }
            r1 = 1
            goto L_0x00a9
        L_0x03c3:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby mp4"
            goto L_0x0068
        L_0x03c7:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby"
            goto L_0x0068
        L_0x03cb:
            java.lang.String r1 = "Unexpected eof reading tkhd"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x03f2 }
            r0.<init>(r1)     // Catch:{ all -> 0x03f2 }
            throw r0     // Catch:{ all -> 0x03f2 }
        L_0x03d3:
            r0 = 6
            r12.A00 = r0     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x03d7:
            r12.A05 = r2     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x03da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f2 }
            r1.<init>()     // Catch:{ all -> 0x03f2 }
            java.lang.String r0 = "Details found: "
            r1.append(r0)     // Catch:{ all -> 0x03f2 }
            r1.append(r12)     // Catch:{ all -> 0x03f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03f2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f2 }
        L_0x03ee:
            r19.close()
            return r12
        L_0x03f2:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x03f7 }
            throw r1
        L_0x03f7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DC.A04(java.io.File):X.1DA");
    }

    public static String A07(String str, boolean z) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            if (z) {
                obj = "empty audio mime type";
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("unrecognized audio mime type; mimeType=");
                sb.append(str);
                obj = sb.toString();
            }
            return null;
        }
        Log.w(obj);
        return null;
    }

    public static String A08(String str, boolean z) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            if (z) {
                obj = "empty video mime type";
            }
            return null;
        } else if ("video/mp4".equals(str)) {
            return "mp4";
        } else {
            if ("video/3gpp".equals(str)) {
                return "3gp";
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("unrecognized video mime type; mimeType=");
                sb.append(str);
                obj = sb.toString();
            }
            return null;
        }
        Log.w(obj);
        return null;
    }

    public static boolean A0A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("audio/aac".equals(str) || "audio/mp4".equals(str) || "audio/amr".equals(str) || "audio/mpeg".equals(str) || "audio/ogg; codecs=opus".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A0F(File file) {
        AnonymousClass1DB A032 = A03(file);
        switch (A032.A00) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("invalid audio file type returned; ");
                sb.append(A032);
                throw new AssertionError(sb.toString());
            default:
                return false;
        }
    }

    public boolean A0G(File file) {
        AnonymousClass1DA A042 = A04(file);
        int i = A042.A01;
        if (i != 2 && i != 3) {
            return false;
        }
        int i2 = A042.A00;
        if (i2 != 4 && i2 != 2 && i2 != 1 && i2 != 0 && i2 != 8) {
            return false;
        }
        int i3 = A042.A02;
        if (i3 == 2 || i3 == 1 || i3 == 3) {
            return true;
        }
        return false;
    }
}
