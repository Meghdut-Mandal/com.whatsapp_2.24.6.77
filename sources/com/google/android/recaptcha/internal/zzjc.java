package com.google.android.recaptcha.internal;

import X.C36341k9;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public abstract class zzjc {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final Charset zzb = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzhc zzf;

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzhc.zzH(bArr, 0, 0, false);
    }

    public static Object zzc(Object obj, String str) {
        Objects.requireNonNull(obj, "messageType");
        return obj;
    }

    public static int zza(boolean z) {
        return C36341k9.A01(z ? 1 : 0);
    }
}
