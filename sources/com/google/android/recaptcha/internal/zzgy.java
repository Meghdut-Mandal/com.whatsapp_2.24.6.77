package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import java.util.Arrays;

public final class zzgy extends zzhc {
    public final byte[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj = Integer.MAX_VALUE;

    public /* synthetic */ zzgy(byte[] bArr, int i, int i2, boolean z, zzgx zzgx) {
        super((zzhb) null);
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = this.zzj;
        if (i > i2) {
            int i3 = i - i2;
            this.zzg = i3;
            this.zzf = i - i3;
            return;
        }
        this.zzg = 0;
    }

    public final int zzd() {
        return this.zzh;
    }

    public final long zzs() {
        int i = 0;
        long j = 0;
        do {
            byte zza = zza();
            j |= ((long) (zza & Byte.MAX_VALUE)) << i;
            if ((zza & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw C165617ti.A0H("CodedInputStream encountered a malformed varint.");
    }

    public final void zzA(int i) {
        this.zzj = i;
        zzI();
    }

    public final void zzB(int i) {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i > i2 - i3) {
                throw C165597tg.A0K();
            }
            this.zzh = i3 + i;
            return;
        }
        throw C165607th.A0N();
    }

    public final boolean zzC() {
        return AnonymousClass000.A1S(this.zzh, this.zzf);
    }

    public final boolean zzE(int i) {
        int zzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            int i4 = 8;
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = zzj();
                } else if (i2 == 3) {
                    do {
                        zzm = zzm();
                        if (zzm == 0 || !zzE(zzm)) {
                            zzz(((i >>> 3) << 3) | 4);
                        }
                        zzm = zzm();
                        break;
                    } while (!zzE(zzm));
                    zzz(((i >>> 3) << 3) | 4);
                    return true;
                } else if (i2 == 4) {
                    return false;
                } else {
                    if (i2 == 5) {
                        zzB(4);
                    } else {
                        throw C165587tf.A0H();
                    }
                }
            }
            zzB(i4);
            return true;
        }
        int i5 = this.zzf;
        int i6 = this.zzh;
        if (i5 - i6 >= 10) {
            do {
                byte[] bArr = this.zze;
                int i7 = i6;
                i6++;
                this.zzh = i6;
                if (bArr[i7] < 0) {
                    i3++;
                }
            } while (i3 < 10);
        } else {
            while (zza() < 0) {
                i3++;
                if (i3 >= 10) {
                }
            }
        }
        throw C165617ti.A0H("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final byte zza() {
        int i = this.zzh;
        if (i != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i + 1;
            return bArr[i];
        }
        throw C165597tg.A0K();
    }

    public final int zze(int i) {
        if (i >= 0) {
            int i2 = i + this.zzh;
            if (i2 >= 0) {
                int i3 = this.zzj;
                if (i2 <= i3) {
                    this.zzj = i2;
                    zzI();
                    return i3;
                }
                throw C165597tg.A0K();
            }
            throw C165617ti.A0H("Failed to parse the message.");
        }
        throw C165607th.A0N();
    }

    public final int zzi() {
        int i = this.zzh;
        if (this.zzf - i >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i + 4;
            return C165577te.A0A(bArr, i);
        }
        throw C165597tg.A0K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.zze
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.zzh = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r1 = r5.zzs()
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.zzh = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgy.zzj():int");
    }

    public final long zzq() {
        int i = this.zzh;
        if (this.zzf - i >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i + 8;
            return C165577te.A0F(bArr, i);
        }
        throw C165597tg.A0K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (((long) r5[r9]) >= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzr() {
        /*
            r10 = this;
            int r0 = r10.zzh
            int r2 = r10.zzf
            if (r2 == r0) goto L_0x00a8
            byte[] r5 = r10.zze
            int r1 = r0 + 1
            byte r3 = r5[r0]
            if (r3 < 0) goto L_0x0012
            r10.zzh = r1
            long r0 = (long) r3
            return r0
        L_0x0012:
            int r2 = r2 - r1
            r0 = 9
            if (r2 < r0) goto L_0x00a8
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0026
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r3 = (long) r3
        L_0x0023:
            r10.zzh = r6
            return r3
        L_0x0026:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x0034
            r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L_0x0032:
            r6 = r9
            goto L_0x0023
        L_0x0034:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x0022
        L_0x0042:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            long r3 = (long) r3
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0055:
            long r3 = r3 ^ r0
            goto L_0x0032
        L_0x0057:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0069:
            long r3 = r3 ^ r0
            goto L_0x0023
        L_0x006b:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0055
        L_0x007e:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0069
        L_0x0091:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r3 = X.C165587tf.A0A(r0, r3)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            goto L_0x0023
        L_0x00a8:
            long r0 = r10.zzs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgy.zzr():long");
    }

    public final void zzz(int i) {
        if (this.zzi != i) {
            throw C165617ti.A0H("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzD() {
        return AnonymousClass000.A1P((zzr() > 0 ? 1 : (zzr() == 0 ? 0 : -1)));
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzf() {
        return zzj();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        return zzj();
    }

    public final int zzk() {
        return zzi();
    }

    public final int zzl() {
        int zzj2 = zzj();
        return (zzj2 >>> 1) ^ (-(zzj2 & 1));
    }

    public final int zzm() {
        if (zzC()) {
            this.zzi = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzi = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw C165617ti.A0H("Protocol message contained an invalid tag (zero).");
    }

    public final int zzn() {
        return zzj();
    }

    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        return zzr();
    }

    public final long zzt() {
        return zzq();
    }

    public final long zzu() {
        return C165577te.A0C(zzr());
    }

    public final long zzv() {
        return zzr();
    }

    public final zzgw zzw() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            int i3 = i - i2;
            if (zzj2 <= i3) {
                zzgw zzm = zzgw.zzm(this.zze, i2, zzj2);
                this.zzh += zzj2;
                return zzm;
            } else if (zzj2 > i3) {
                throw C165597tg.A0K();
            } else {
                int i4 = zzj2 + i2;
                this.zzh = i4;
                return new zzgt(Arrays.copyOfRange(this.zze, i2, i4));
            }
        } else if (zzj2 == 0) {
            return zzgw.zzb;
        } else {
            throw C165607th.A0N();
        }
    }

    public final String zzx() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzj2 > i - i2) {
                throw C165597tg.A0K();
            }
            String str = new String(this.zze, i2, zzj2, zzjc.zzb);
            this.zzh += zzj2;
            return str;
        } else if (zzj2 == 0) {
            return "";
        } else {
            throw C165607th.A0N();
        }
    }

    public final String zzy() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzj2 > i - i2) {
                throw C165597tg.A0K();
            }
            String zzd = zzma.zzd(this.zze, i2, zzj2);
            this.zzh += zzj2;
            return zzd;
        } else if (zzj2 == 0) {
            return "";
        } else {
            throw C165607th.A0N();
        }
    }
}
