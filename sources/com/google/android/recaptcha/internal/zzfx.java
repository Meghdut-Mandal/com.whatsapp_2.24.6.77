package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C90504aG;
import X.C90524aI;
import java.math.RoundingMode;
import java.util.Objects;

public class zzfx extends zzfy {
    public final zzft zzb;
    public final Character zzc;

    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        zzff.zzd(0, i2, bArr.length);
        while (i3 < i2) {
            zzf(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    public final int zzc(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfx) {
            zzfx zzfx = (zzfx) obj;
            if (this.zzb.equals(zzfx.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzfx.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return AnonymousClass000.A0H(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder A0i = C90524aI.A0i("BaseEncoding.");
        A0i.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0i.append(".withPadChar('");
                A0i.append(ch);
                str = "')";
            }
            A0i.append(str);
        }
        return A0i.toString();
    }

    public int zza(byte[] bArr, CharSequence charSequence) {
        zzft zzft;
        int i;
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzft zzft2 = this.zzb;
        if (zzft2.zzh[length % zzft2.zzc]) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < zze.length()) {
                long j = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    zzft = this.zzb;
                    i = zzft.zzc;
                    if (i4 >= i) {
                        break;
                    }
                    j <<= zzft.zzb;
                    if (i2 + i4 < zze.length()) {
                        j |= (long) this.zzb.zzb(zze.charAt(i5 + i2));
                        i5++;
                    }
                    i4++;
                }
                int i6 = zzft.zzd;
                int i7 = i5 * zzft.zzb;
                int i8 = (i6 - 1) * 8;
                while (i8 >= (i6 * 8) - i7) {
                    bArr[i3] = (byte) ((int) ((j >>> i8) & 255));
                    i8 -= 8;
                    i3++;
                }
                i2 += i;
            }
            return i3;
        }
        throw new zzfw(AnonymousClass000.A0r("Invalid input length ", AnonymousClass000.A0u(), zze.length()));
    }

    public final int zzd(int i) {
        zzft zzft = this.zzb;
        return zzft.zzc * zzga.zza(i, zzft.zzd, RoundingMode.CEILING);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i, int i2) {
        zzff.zzd(i, i + i2, bArr.length);
        int i3 = 0;
        zzff.zza(C90504aG.A1U(i2, this.zzb.zzd));
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzft zzft = this.zzb;
        zzft zzft2 = zzft;
        while (i3 < i2 * 8) {
            appendable.append(zzft2.zzf[zzft2.zza & ((int) (j >>> ((i5 - zzft.zzb) - i3)))]);
            zzft2 = this.zzb;
            i3 += zzft2.zzb;
        }
        if (this.zzc != null) {
            while (i3 < zzft2.zzd * 8) {
                appendable.append('=');
                zzft2 = this.zzb;
                i3 += zzft2.zzb;
            }
        }
    }

    public zzfx(zzft zzft, Character ch) {
        this.zzb = zzft;
        if (ch == null || !zzft.zzd('=')) {
            this.zzc = ch;
            return;
        }
        throw AnonymousClass001.A08(zzfi.zza("Padding character %s was already in alphabet", AnonymousClass000.A1b(ch)));
    }

    public final CharSequence zze(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    public zzfx(String str, String str2, Character ch) {
        this(new zzft(str, str2.toCharArray()), ch);
    }
}
