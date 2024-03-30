package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C36441kJ;

public final class zzhe extends zzhh {
    public final byte[] zzc;
    public final int zzd;
    public int zze;

    public zzhe(byte[] bArr, int i, int i2) {
        super((zzhg) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.zzc = bArr;
            this.zze = 0;
            this.zzd = i2;
            return;
        }
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1L(A1Q, length, 0);
        C165567td.A1X(A1Q, 0, i2);
        throw C165607th.A0i("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1Q);
    }

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.zze, 0);
            C165567td.A1X(A1Q, this.zzd, i2);
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", A1Q), e);
        }
    }

    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    public final void zzb(byte b) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.zze, 0);
            throw new zzhf(C165567td.A0V(this.zzd, A1Q), e);
        }
    }

    public final void zzd(int i, boolean z) {
        zzq(i << 3);
        zzb(z ? (byte) 1 : 0);
    }

    public final void zze(int i, zzgw zzgw) {
        zzq((i << 3) | 2);
        zzq(zzgw.zzd());
        zzgw.zzi(this);
    }

    public final void zzf(int i, int i2) {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            C165597tg.A1N(bArr, i, i2);
            int i4 = i3 + 1;
            this.zze = i4;
            C165597tg.A1N(bArr, i >> 8, i3);
            int i5 = i4 + 1;
            this.zze = i5;
            C165597tg.A1N(bArr, i >> 16, i4);
            this.zze = i5 + 1;
            C165597tg.A1N(bArr, i >> 24, i5);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.zze, 0);
            throw new zzhf(C165567td.A0V(this.zzd, A1Q), e);
        }
    }

    public final void zzh(int i, long j) {
        zzq((i << 3) | 1);
        zzi(j);
    }

    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            C165597tg.A1N(bArr, (int) j, i);
            int i3 = i2 + 1;
            this.zze = i3;
            C165577te.A0t(j, bArr, 8, i2);
            int i4 = i3 + 1;
            this.zze = i4;
            C165577te.A0t(j, bArr, 16, i3);
            int i5 = i4 + 1;
            this.zze = i5;
            C165577te.A0t(j, bArr, 24, i4);
            int i6 = i5 + 1;
            this.zze = i6;
            C165577te.A0t(j, bArr, 32, i5);
            int i7 = i6 + 1;
            this.zze = i7;
            C165577te.A0t(j, bArr, 40, i6);
            int i8 = i7 + 1;
            this.zze = i8;
            C165577te.A0t(j, bArr, 48, i7);
            this.zze = i8 + 1;
            C165577te.A0t(j, bArr, 56, i8);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.zze, 0);
            throw new zzhf(C165567td.A0V(this.zzd, A1Q), e);
        }
    }

    public final void zzj(int i, int i2) {
        zzq(i << 3);
        zzk(i2);
    }

    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs((long) i);
        }
    }

    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int zzb;
        int i = this.zze;
        try {
            int length = str.length();
            int A00 = C165567td.A00(length * 3);
            int A002 = C165567td.A00(length);
            if (A002 == A00) {
                int i2 = i + A002;
                this.zze = i2;
                zzb = zzma.zzb(str, this.zzc, i2, this.zzd - i2);
                this.zze = i;
                zzq((zzb - i) - A002);
            } else {
                zzq(zzma.zzc(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                zzb = zzma.zzb(str, bArr, i3, this.zzd - i3);
            }
            this.zze = zzb;
        } catch (zzlz e) {
            this.zze = i;
            zzC(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhf(e2);
        }
    }

    public final void zzo(int i, int i2) {
        zzq((i << 3) | i2);
    }

    public final void zzp(int i, int i2) {
        zzq(i << 3);
        zzq(i2);
    }

    public final void zzq(int i) {
        while ((i & -128) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                C165597tg.A1O(bArr, i, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q, this.zze, 0);
                throw new zzhf(C165567td.A0V(this.zzd, A1Q), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i3 = this.zze;
        this.zze = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void zzr(int i, long j) {
        zzq(i << 3);
        zzs(j);
    }

    public final void zzs(long j) {
        if (!zzhh.zzd || this.zzd - this.zze < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.zzc;
                    int i = this.zze;
                    this.zze = i + 1;
                    C165597tg.A1O(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1L(A1Q, this.zze, 0);
                    throw new zzhf(C165567td.A0V(this.zzd, A1Q), e);
                }
            }
            byte[] bArr2 = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            int i4 = (int) j;
            byte[] bArr3 = this.zzc;
            int i5 = this.zze;
            this.zze = i5 + 1;
            long j2 = (long) i5;
            if (i3 == 0) {
                zzlv.zzn(bArr3, j2, (byte) i4);
                return;
            } else {
                zzlv.zzn(bArr3, j2, (byte) ((i4 & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
