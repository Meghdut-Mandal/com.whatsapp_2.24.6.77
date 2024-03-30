package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C36381kD;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

public final class zzft {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final char[] zzf;
    public final byte[] zzg;
    public final boolean[] zzh;
    public final boolean zzi;

    public final String toString() {
        return this.zze;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzft(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r8 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r8]
            r6 = -1
            java.util.Arrays.fill(r7, r6)
            r5 = 0
            r4 = 0
        L_0x000a:
            int r0 = r11.length
            if (r4 >= r0) goto L_0x0029
            char r3 = r11[r4]
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r3, r8)
            java.lang.String r0 = "Non-ASCII character: %s"
            com.google.android.recaptcha.internal.zzff.zzc(r1, r0, r3)
            byte r0 = r7[r3]
            if (r0 == r6) goto L_0x001e
            r2 = 0
        L_0x001e:
            java.lang.String r0 = "Duplicate character: %s"
            com.google.android.recaptcha.internal.zzff.zzc(r2, r0, r3)
            byte r0 = (byte) r4
            r7[r3] = r0
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0029:
            r9.<init>(r10, r11, r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzft.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzft) || !Arrays.equals(this.zzf, ((zzft) obj).zzf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c) {
        if (c <= 127) {
            byte b = this.zzg[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unrecognized character: ");
            throw new zzfw(AnonymousClass000.A0t(A0u, c));
        }
        throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    public final boolean zzc(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zzd(char c) {
        return C36381kD.A1U(this.zzg[61], -1);
    }

    public zzft(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        Objects.requireNonNull(cArr);
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb2 = zzga.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb2);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zzb2 >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[zzga.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(AnonymousClass000.A0r("Illegal alphabet length ", AnonymousClass000.A0u(), cArr.length), e);
        }
    }
}
