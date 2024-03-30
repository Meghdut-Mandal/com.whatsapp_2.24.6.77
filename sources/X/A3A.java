package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class A3A implements AnonymousClass7cM {
    public static Boolean A01;
    public static Long A02;
    public static final C202919mw A03;
    public static final C192919Jd A04;
    public static final C192919Jd A05 = new C192919Jd(new C192919Jd(new C192919Jd(Uri.parse(C90464aC.A0c("content://com.google.android.gms.phenotype/", Uri.encode("com.google.android.gms.clearcut.public"))), "", "").A00, "gms:playlog:service:sampling_", "").A00, "gms:playlog:service:sampling_", "LogSampling__");
    public static final HashMap A06 = AnonymousClass001.A0J();
    public static final ConcurrentHashMap A07 = C90524aI.A0s();
    public static final Charset A08 = Charset.forName(DefaultCrypto.UTF_8);
    public final Context A00;

    public A3A(Context context) {
        this.A00 = context;
        if (context != null) {
            C202919mw.A02(context);
        }
    }

    public static long A00(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long A03(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static void A04(byte[] bArr, long[] jArr, int i, long j, long j2) {
        long A032 = A03(bArr, i);
        long A033 = A03(bArr, i + 8);
        long A034 = A03(bArr, i + 16);
        long A035 = A03(bArr, i + 24);
        long j3 = j + A032;
        long j4 = A033 + j3 + A034;
        jArr[0] = j4 + A035;
        jArr[1] = Long.rotateRight(j2 + j3 + A035, 21) + Long.rotateRight(j4, 44) + j3;
    }

    static {
        String str;
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        if (valueOf.length() != 0) {
            str = "content://com.google.android.gms.phenotype/".concat(valueOf);
        } else {
            str = new String("content://com.google.android.gms.phenotype/");
        }
        C192919Jd r4 = new C192919Jd(new C192919Jd(new C192919Jd(Uri.parse(str), "", "").A00, "gms:playlog:service:samplingrules_", "").A00, "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        A04 = r4;
        A03 = new C170278Cu(r4, false);
    }

    public static long A01(Context context) {
        Object obj;
        Long l = A02;
        if (l == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            Boolean bool = A01;
            if (bool == null) {
                bool = Boolean.valueOf(AnonymousClass000.A1Q(C02640Bg.A00(context).A00.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES")));
                A01 = bool;
            }
            if (bool.booleanValue()) {
                ContentResolver contentResolver = context.getContentResolver();
                Class<C201949kl> cls = C201949kl.class;
                synchronized (cls) {
                    C201949kl.A01(contentResolver);
                    obj = C201949kl.A00;
                }
                HashMap hashMap = C201949kl.A03;
                long j2 = 0;
                long j3 = 0L;
                synchronized (cls) {
                    if (hashMap.containsKey("android_id")) {
                        Object obj2 = hashMap.get("android_id");
                        if (obj2 != null) {
                            j3 = obj2;
                        }
                    } else {
                        j3 = null;
                    }
                }
                Number number = (Number) j3;
                if (number != null) {
                    j = number.longValue();
                } else {
                    String A002 = C201949kl.A00(contentResolver, "android_id");
                    if (A002 != null) {
                        try {
                            long parseLong = Long.parseLong(A002);
                            number = Long.valueOf(parseLong);
                            j2 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    synchronized (cls) {
                        if (obj == C201949kl.A00) {
                            hashMap.put("android_id", number);
                            C201949kl.A01.remove("android_id");
                        }
                    }
                    j = j2;
                }
            }
            l = Long.valueOf(j);
            A02 = l;
        }
        return l.longValue();
    }

    public static long A02(String str, long j) {
        ByteBuffer allocate;
        String str2 = str;
        if (str == null || str2.isEmpty()) {
            allocate = ByteBuffer.allocate(8);
        } else {
            byte[] bytes = str2.getBytes(A08);
            allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
        }
        allocate.putLong(j);
        byte[] array = allocate.array();
        int length = array.length;
        if (length <= length) {
            char c = 0;
            if (length <= 32) {
                if (length > 16) {
                    long j2 = ((long) (length << 1)) - 7286425919675154353L;
                    long A032 = A03(array, 0) * -5435081209227447693L;
                    long A033 = A03(array, 8);
                    long A034 = A03(array, length - 8) * j2;
                    return A00(Long.rotateRight(A032 + A033, 43) + Long.rotateRight(A034, 30) + (A03(array, length - 16) * -7286425919675154353L), A032 + Long.rotateRight(A033 - 7286425919675154353L, 18) + A034, j2);
                } else if (length >= 8) {
                    long j3 = ((long) (length << 1)) - 7286425919675154353L;
                    long A035 = A03(array, 0) - 7286425919675154353L;
                    long A036 = A03(array, length - 8);
                    return A00((Long.rotateRight(A036, 37) * j3) + A035, (Long.rotateRight(A035, 25) + A036) * j3, j3);
                } else if (length >= 4) {
                    return A00(((long) length) + (C165597tg.A0C(((array[3] & 255) << 24) | C165607th.A0B(array, 2, C165597tg.A08(array, 1, array[0] & 255))) << 3), C165597tg.A0C(C165567td.A04(array, length - 4)), ((long) (length << 1)) - 7286425919675154353L);
                } else if (length <= 0) {
                    return -7286425919675154353L;
                } else {
                    long j4 = (((long) ((array[0] & 255) + ((array[length >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((array[length - 1] & 255) << 2))) * -4348849565147123417L);
                    return (j4 ^ (j4 >>> 47)) * -7286425919675154353L;
                }
            } else if (length <= 64) {
                long j5 = ((long) (length << 1)) - 7286425919675154353L;
                long A037 = A03(array, 0) * -7286425919675154353L;
                long A038 = A03(array, 8);
                long A039 = A03(array, length - 8) * j5;
                long rotateRight = Long.rotateRight(A037 + A038, 43) + Long.rotateRight(A039, 30) + (A03(array, length - 16) * -7286425919675154353L);
                long A002 = A00(rotateRight, Long.rotateRight(-7286425919675154353L + A038, 18) + A037 + A039, j5);
                long A0310 = A03(array, 16) * j5;
                long A0311 = A03(array, 24);
                long A0312 = (rotateRight + A03(array, length - 32)) * j5;
                return A00(Long.rotateRight(A0310 + A0311, 43) + Long.rotateRight(A0312, 30) + ((A002 + A03(array, length - 24)) * j5), A0310 + Long.rotateRight(A0311 + A037, 18) + A0312, j5);
            } else {
                long j6 = 2480279821605975764L;
                long j7 = 1390051526045402406L;
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long A0313 = A03(array, 0) + 95310865018149119L;
                int i = length - 1;
                int i2 = (i / 64) << 6;
                int i3 = i & 63;
                int i4 = (i2 + i3) - 63;
                int i5 = 0;
                while (true) {
                    long rotateRight2 = (Long.rotateRight(((A0313 + j6) + jArr[c]) + A03(array, i5 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                    j6 = (Long.rotateRight(j6 + jArr[1] + A03(array, i5 + 48), 42) * -5435081209227447693L) + jArr[0] + A03(array, i5 + 40);
                    A0313 = Long.rotateRight(j7 + jArr2[0], 33) * -5435081209227447693L;
                    byte[] bArr = array;
                    A04(bArr, jArr, i5, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[0]);
                    A04(bArr, jArr2, i5 + 32, A0313 + jArr2[1], j6 + A03(array, i5 + 16));
                    i5 += 64;
                    if (i5 == i2) {
                        long j8 = ((255 & rotateRight2) << 1) - 5435081209227447693L;
                        long j9 = jArr2[0] + ((long) i3);
                        jArr2[0] = j9;
                        long j10 = jArr[0] + j9;
                        jArr[0] = j10;
                        jArr2[0] = jArr2[0] + j10;
                        long rotateRight3 = (Long.rotateRight(((A0313 + j6) + jArr[0]) + A03(array, i4 + 8), 37) * j8) ^ (jArr2[1] * 9);
                        long rotateRight4 = (Long.rotateRight(j6 + jArr[1] + A03(array, i4 + 48), 42) * j8) + (jArr[0] * 9) + A03(array, i4 + 40);
                        long rotateRight5 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j8;
                        A04(array, jArr, i4, jArr[1] * j8, rotateRight3 + jArr2[0]);
                        A04(array, jArr2, i4 + 32, jArr2[1] + rotateRight5, A03(array, i4 + 16) + rotateRight4);
                        return A00(A00(jArr[0], jArr2[0], j8) + (((rotateRight4 >>> 47) ^ rotateRight4) * -4348849565147123417L) + rotateRight3, A00(jArr[1], jArr2[1], j8) + rotateRight5, j8);
                    }
                    j7 = rotateRight2;
                    c = 0;
                }
            }
        } else {
            throw C165617ti.A0W(AnonymousClass000.A0r("Out of bound index with offput: 0 and length: ", C90524aI.A0h(67), length));
        }
    }
}
