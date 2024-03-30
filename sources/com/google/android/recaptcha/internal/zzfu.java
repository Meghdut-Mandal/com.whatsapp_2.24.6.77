package com.google.android.recaptcha.internal;

import X.AnonymousClass000;

public final class zzfu extends zzfx {
    public final char[] zza = new char[512];

    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        zzff.zzd(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            appendable.append(this.zza[b]);
            appendable.append(this.zza[b | 256]);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzfu(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r1 = r0.toCharArray()
            java.lang.String r0 = "base16()"
            com.google.android.recaptcha.internal.zzft r5 = new com.google.android.recaptcha.internal.zzft
            r5.<init>(r0, r1)
            r0 = 0
            r6.<init>(r5, r0)
            r0 = 512(0x200, float:7.175E-43)
            char[] r0 = new char[r0]
            r6.zza = r0
            char[] r0 = r5.zzf
            int r1 = r0.length
            r4 = 0
            r0 = 16
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            com.google.android.recaptcha.internal.zzff.zza(r0)
        L_0x0024:
            char[] r3 = r6.zza
            int r0 = r4 >>> 4
            char[] r2 = r5.zzf
            char r0 = r2[r0]
            r3[r4] = r0
            r1 = r4 | 256(0x100, float:3.59E-43)
            r0 = r4 & 15
            char r0 = r2[r0]
            r3[r1] = r0
            int r4 = r4 + 1
            r0 = 256(0x100, float:3.59E-43)
            if (r4 < r0) goto L_0x0024
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfu.<init>(java.lang.String, java.lang.String):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new zzfw(AnonymousClass000.A0r("Invalid input length ", AnonymousClass000.A0u(), charSequence.length()));
    }
}
