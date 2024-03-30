package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;

public abstract class zzgk {
    public static int zzh(int i, byte[] bArr, int i2, int i3, zzlm zzlm, zzgj zzgj) {
        zzgw zzm;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            byte[] bArr2 = bArr;
            zzgj zzgj2 = zzgj;
            if (i5 == 0) {
                int zzl = zzl(bArr, i2, zzgj);
                zzlm.zzj(i, Long.valueOf(zzgj.zzb));
                return zzl;
            } else if (i5 == 1) {
                zzlm.zzj(i, Long.valueOf(zzp(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int zzi = zzi(bArr, i2, zzgj);
                int i6 = zzgj.zza;
                if (i6 < 0) {
                    throw C165607th.A0N();
                } else if (i6 <= bArr.length - zzi) {
                    if (i6 == 0) {
                        zzm = zzgw.zzb;
                    } else {
                        zzm = zzgw.zzm(bArr, zzi, i6);
                    }
                    zzlm.zzj(i, zzm);
                    return zzi + i6;
                } else {
                    throw C165597tg.A0K();
                }
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                zzlm zzf = zzlm.zzf();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = zzi(bArr, i4, zzgj);
                    i8 = zzgj.zza;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = zzh(i8, bArr2, i4, i9, zzf, zzgj2);
                }
                if (i4 > i3 || i8 != i7) {
                    throw C165617ti.A0H("Failed to parse the message.");
                }
                zzlm.zzj(i, zzf);
                return i4;
            } else if (i5 == 5) {
                zzlm.zzj(i, Integer.valueOf(C165577te.A0A(bArr, i2)));
                return i2 + 4;
            }
        }
        throw C165617ti.A0H("Protocol message contained an invalid tag (zero).");
    }

    public static int zzm(Object obj, zzkr zzkr, byte[] bArr, int i, int i2, int i3, zzgj zzgj) {
        int zzc = ((zzkh) zzkr).zzc(obj, bArr, i, i2, i3, zzgj);
        zzgj.zzc = obj;
        return zzc;
    }

    public static int zzf(byte[] bArr, int i, zzjb zzjb, zzgj zzgj) {
        zziu zziu = (zziu) zzjb;
        int zzi = zzi(bArr, i, zzgj);
        int i2 = zzgj.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zzgj);
            zziu.zzg(zzgj.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw C165597tg.A0K();
    }

    public static int zzi(byte[] bArr, int i, zzgj zzgj) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzgj);
        }
        zzgj.zza = b;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zzgj zzgj) {
        int i3;
        int i4;
        int i5;
        byte b = bArr[i2];
        int i6 = i2 + 1;
        int i7 = i & 127;
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i7 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i7 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i6 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i6;
                        }
                        zzgj.zza = i3;
                        return i6;
                    }
                }
            }
            zzgj.zza = i8 | i4;
            return i9;
        }
        i3 = i7 | i5;
        zzgj.zza = i3;
        return i6;
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zzjb zzjb, zzgj zzgj) {
        zziu zziu = (zziu) zzjb;
        int zzi = zzi(bArr, i2, zzgj);
        while (true) {
            zziu.zzg(zzgj.zza);
            if (zzi >= i3) {
                break;
            }
            int zzi2 = zzi(bArr, zzi, zzgj);
            if (i != zzgj.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzgj);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i, zzgj zzgj) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgj.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        zzgj.zzb = j2;
        return i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzn(java.lang.Object r6, com.google.android.recaptcha.internal.zzkr r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzgj r11) {
        /*
            int r3 = r9 + 1
            r2 = r8
            byte r4 = r8[r9]
            r5 = r11
            if (r4 >= 0) goto L_0x0010
            int r3 = zzj(r4, r8, r3, r11)
            int r4 = r11.zza
            if (r4 < 0) goto L_0x001c
        L_0x0010:
            int r10 = r10 - r3
            if (r4 > r10) goto L_0x001c
            int r4 = r4 + r3
            r1 = r6
            r0 = r7
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r4
        L_0x001c:
            com.google.android.recaptcha.internal.zzje r0 = X.C165597tg.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgk.zzn(java.lang.Object, com.google.android.recaptcha.internal.zzkr, byte[], int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzgj zzgj) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzl(bArr, i2, zzgj);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zzi(bArr, i2, zzgj) + zzgj.zza;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zzi(bArr, i2, zzgj);
                    i6 = zzgj.zza;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zzo(i6, bArr, i2, i3, zzgj);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C165617ti.A0H("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw C165617ti.A0H("Protocol message contained an invalid tag (zero).");
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int zza(byte[] bArr, int i, zzgj zzgj) {
        int zzi = zzi(bArr, i, zzgj);
        int i2 = zzgj.zza;
        if (i2 < 0) {
            throw C165607th.A0N();
        } else if (i2 > bArr.length - zzi) {
            throw C165597tg.A0K();
        } else if (i2 == 0) {
            zzgj.zzc = zzgw.zzb;
            return zzi;
        } else {
            zzgj.zzc = zzgw.zzm(bArr, zzi, i2);
            return zzi + i2;
        }
    }

    public static int zzb(byte[] bArr, int i) {
        return C165577te.A0A(bArr, i);
    }

    public static int zzc(zzkr zzkr, byte[] bArr, int i, int i2, int i3, zzgj zzgj) {
        Object zze = zzkr.zze();
        int zzm = zzm(zze, zzkr, bArr, i, i2, i3, zzgj);
        zzkr.zzf(zze);
        zzgj.zzc = zze;
        return zzm;
    }

    public static int zzd(zzkr zzkr, byte[] bArr, int i, int i2, zzgj zzgj) {
        Object zze = zzkr.zze();
        int zzn = zzn(zze, zzkr, bArr, i, i2, zzgj);
        zzkr.zzf(zze);
        zzgj.zzc = zze;
        return zzn;
    }

    public static int zze(zzkr zzkr, int i, byte[] bArr, int i2, int i3, zzjb zzjb, zzgj zzgj) {
        int zzd = zzd(zzkr, bArr, i2, i3, zzgj);
        while (true) {
            zzjb.add(zzgj.zzc);
            if (zzd >= i3) {
                break;
            }
            int zzi = zzi(bArr, zzd, zzgj);
            if (i != zzgj.zza) {
                break;
            }
            zzd = zzd(zzkr, bArr, zzi, i3, zzgj);
        }
        return zzd;
    }

    public static int zzg(byte[] bArr, int i, zzgj zzgj) {
        int zzi = zzi(bArr, i, zzgj);
        int i2 = zzgj.zza;
        if (i2 < 0) {
            throw C165607th.A0N();
        } else if (i2 == 0) {
            zzgj.zzc = "";
            return zzi;
        } else {
            zzgj.zzc = new String(bArr, zzi, i2, zzjc.zzb);
            return zzi + i2;
        }
    }
}
