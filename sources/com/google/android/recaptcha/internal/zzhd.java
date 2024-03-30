package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C90504aG;
import java.nio.charset.Charset;
import java.util.List;

public final class zzhd implements zzkq {
    public final zzhc zza;
    public int zzb;
    public int zzc;
    public int zzd = 0;

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return C165617ti.A04(this);
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzgw zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzkr zzkr, zzie zzie) {
        zzS(3);
        zzP(obj, zzkr, zzie);
    }

    public final void zzu(Object obj, zzkr zzkr, zzie zzie) {
        zzS(2);
        zzQ(obj, zzkr, zzie);
    }

    private final void zzP(Object obj, zzkr zzkr, zzie zzie) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzkr.zzh(obj, this, zzie);
            if (this.zzb != this.zzc) {
                throw C165617ti.A0H("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzkr zzkr, zzie zzie) {
        zzhc zzhc = this.zza;
        int zzn = zzhc.zzn();
        if (zzhc.zza < zzhc.zzb) {
            zzhc zzhc2 = this.zza;
            int zze = zzhc2.zze(zzn);
            zzhc2.zza++;
            zzkr.zzh(obj, this, zzie);
            zzhc zzhc3 = this.zza;
            zzhc3.zzz(0);
            zzhc3.zza--;
            zzhc3.zzA(zze);
            return;
        }
        throw C165617ti.A0H("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzS(int i) {
        if ((this.zzb & 7) != i) {
            throw C165587tf.A0H();
        }
    }

    public static final void zzT(int i) {
        if ((i & 3) != 0) {
            throw C165617ti.A0H("Failed to parse the message.");
        }
    }

    public static final void zzU(int i) {
        if ((i & 7) != 0) {
            throw C165617ti.A0H("Failed to parse the message.");
        }
    }

    public static zzhd zzq(zzhc zzhc) {
        zzhd zzhd = zzhc.zzc;
        if (zzhd == null) {
            return new zzhd(zzhc);
        }
        return zzhd;
    }

    public final void zzA(List list) {
        int i;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A04 = C165617ti.A04(this);
                    zzU(A04);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A04;
                    do {
                        zzjt.zzg(zzhc.zzo());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                zzjt.zzg(this.zza.zzo());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A042 = C165617ti.A04(this);
                    zzU(A042);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A042;
                    do {
                        C165577te.A1Q(list, zzhc2.zzo());
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                C165577te.A1Q(list, this.zza.zzo());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzB(List list) {
        int A05;
        if (list instanceof zzil) {
            zzil zzil = (zzil) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzil.zze(this.zza.zzc());
                        if (!C165607th.A1V(this)) {
                            A05 = C165607th.A05(this);
                        } else {
                            return;
                        }
                    } while (A05 == this.zzb);
                }
                throw C165587tf.A0H();
            }
            int A04 = C165617ti.A04(this);
            zzT(A04);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A04;
            do {
                zzil.zze(zzhc.zzc());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!C165607th.A1V(this)) {
                        A05 = C165607th.A05(this);
                    } else {
                        return;
                    }
                } while (A05 == this.zzb);
            }
            throw C165587tf.A0H();
        }
        int A042 = C165617ti.A04(this);
        zzT(A042);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A042;
        do {
            list.add(Float.valueOf(zzhc2.zzc()));
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A05;
    }

    @Deprecated
    public final void zzC(List list, zzkr zzkr, zzie zzie) {
        int A05;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw C165587tf.A0H();
        }
        do {
            Object zze = zzkr.zze();
            zzP(zze, zzkr, zzie);
            zzkr.zzf(zze);
            list.add(zze);
            if (!C165607th.A1V(this) && this.zzd == 0) {
                A05 = C165607th.A05(this);
            } else {
                return;
            }
        } while (A05 == i);
        this.zzd = A05;
    }

    public final void zzD(List list) {
        int i;
        int A02;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zziu.zzg(this.zza.zzh());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zziu.zzg(this.zza.zzh());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C90504aG.A10(this.zza.zzh(), list);
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C90504aG.A10(this.zza.zzh(), list);
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzE(List list) {
        int i;
        int A02;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zzjt.zzg(this.zza.zzp());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zzjt.zzg(this.zza.zzp());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C165577te.A1Q(list, this.zza.zzp());
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C165577te.A1Q(list, this.zza.zzp());
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzF(List list, zzkr zzkr, zzie zzie) {
        int A05;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw C165587tf.A0H();
        }
        do {
            Object zze = zzkr.zze();
            zzQ(zze, zzkr, zzie);
            zzkr.zzf(zze);
            list.add(zze);
            if (!C165607th.A1V(this) && this.zzd == 0) {
                A05 = C165607th.A05(this);
            } else {
                return;
            }
        } while (A05 == i);
        this.zzd = A05;
    }

    public final void zzG(List list) {
        int A05;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zziu.zzg(this.zza.zzk());
                        if (!C165607th.A1V(this)) {
                            A05 = C165607th.A05(this);
                        } else {
                            return;
                        }
                    } while (A05 == this.zzb);
                }
                throw C165587tf.A0H();
            }
            int A04 = C165617ti.A04(this);
            zzT(A04);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A04;
            do {
                zziu.zzg(zzhc.zzk());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C90504aG.A10(this.zza.zzk(), list);
                    if (!C165607th.A1V(this)) {
                        A05 = C165607th.A05(this);
                    } else {
                        return;
                    }
                } while (A05 == this.zzb);
            }
            throw C165587tf.A0H();
        }
        int A042 = C165617ti.A04(this);
        zzT(A042);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A042;
        do {
            C90504aG.A10(zzhc2.zzk(), list);
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A05;
    }

    public final void zzH(List list) {
        int i;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A04 = C165617ti.A04(this);
                    zzU(A04);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A04;
                    do {
                        zzjt.zzg(zzhc.zzt());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                zzjt.zzg(this.zza.zzt());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A042 = C165617ti.A04(this);
                    zzU(A042);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A042;
                    do {
                        C165577te.A1Q(list, zzhc2.zzt());
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                C165577te.A1Q(list, this.zza.zzt());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzI(List list) {
        int i;
        int A02;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zziu.zzg(this.zza.zzl());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zziu.zzg(this.zza.zzl());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C90504aG.A10(this.zza.zzl(), list);
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C90504aG.A10(this.zza.zzl(), list);
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzJ(List list) {
        int i;
        int A02;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zzjt.zzg(this.zza.zzu());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zzjt.zzg(this.zza.zzu());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C165577te.A1Q(list, this.zza.zzu());
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C165577te.A1Q(list, this.zza.zzu());
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzK(java.util.List r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.zzb
            r1 = r0 & 7
            r0 = 2
            if (r1 != r0) goto L_0x0044
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzjm
            if (r0 == 0) goto L_0x0027
            if (r4 != 0) goto L_0x003f
            com.google.android.recaptcha.internal.zzjm r3 = (com.google.android.recaptcha.internal.zzjm) r3
        L_0x000f:
            com.google.android.recaptcha.internal.zzgw r0 = r2.zzp()
            r3.zzi(r0)
            boolean r0 = X.C165607th.A1V(r2)
            if (r0 != 0) goto L_0x0026
            int r1 = X.C165607th.A05(r2)
            int r0 = r2.zzb
            if (r1 == r0) goto L_0x000f
        L_0x0024:
            r2.zzd = r1
        L_0x0026:
            return
        L_0x0027:
            if (r4 != 0) goto L_0x003f
            java.lang.String r0 = r2.zzr()
        L_0x002d:
            r3.add(r0)
            boolean r0 = X.C165607th.A1V(r2)
            if (r0 != 0) goto L_0x0026
            int r1 = X.C165607th.A05(r2)
            int r0 = r2.zzb
            if (r1 == r0) goto L_0x0027
            goto L_0x0024
        L_0x003f:
            java.lang.String r0 = r2.zzs()
            goto L_0x002d
        L_0x0044:
            com.google.android.recaptcha.internal.zzjd r0 = X.C165587tf.A0H()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhd.zzK(java.util.List, boolean):void");
    }

    public final void zzL(List list) {
        int i;
        int A02;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zziu.zzg(C165617ti.A04(this));
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zziu.zzg(C165617ti.A04(this));
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C90504aG.A10(C165617ti.A04(this), list);
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C90504aG.A10(C165617ti.A04(this), list);
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzM(List list) {
        int i;
        int A02;
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zzjt.zzg(this.zza.zzv());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zzjt.zzg(this.zza.zzv());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C165577te.A1Q(list, this.zza.zzv());
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C165577te.A1Q(list, this.zza.zzv());
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc() {
        /*
            r3 = this;
            int r2 = r3.zzd
            if (r2 == 0) goto L_0x0013
            r3.zzb = r2
            r0 = 0
            r3.zzd = r0
        L_0x0009:
            int r1 = r3.zzc
            int r0 = r2 >>> 3
            if (r2 != r1) goto L_0x0012
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0012:
            return r0
        L_0x0013:
            int r2 = X.C165607th.A05(r3)
            r3.zzb = r2
            if (r2 == 0) goto L_0x000f
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhd.zzc():int");
    }

    public final void zzv(List list) {
        int i;
        int A02;
        if (list instanceof zzgl) {
            zzgl zzgl = (zzgl) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zzgl.zze(this.zza.zzD());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zzgl.zze(this.zza.zzD());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzw(List list) {
        int A05;
        if ((this.zzb & 7) != 2) {
            throw C165587tf.A0H();
        }
        do {
            list.add(zzp());
            if (!C165607th.A1V(this)) {
                A05 = C165607th.A05(this);
            } else {
                return;
            }
        } while (A05 == this.zzb);
        this.zzd = A05;
    }

    public final void zzx(List list) {
        int i;
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int A04 = C165617ti.A04(this);
                    zzU(A04);
                    zzhc zzhc = this.zza;
                    int zzd2 = zzhc.zzd() + A04;
                    do {
                        zzhy.zze(zzhc.zzb());
                        zzhc = this.zza;
                    } while (zzhc.zzd() < zzd2);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                zzhy.zze(this.zza.zzb());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A042 = C165617ti.A04(this);
                    zzU(A042);
                    zzhc zzhc2 = this.zza;
                    int zzd3 = zzhc2.zzd() + A042;
                    do {
                        list.add(Double.valueOf(zzhc2.zzb()));
                        zzhc2 = this.zza;
                    } while (zzhc2.zzd() < zzd3);
                    return;
                }
                throw C165587tf.A0H();
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
        }
        this.zzd = i;
    }

    public final void zzy(List list) {
        int i;
        int A02;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    A02 = C165567td.A02(this);
                    do {
                        zziu.zzg(this.zza.zzf());
                    } while (C165617ti.A03(this) < A02);
                }
                throw C165587tf.A0H();
            }
            do {
                zziu.zzg(this.zza.zzf());
                if (!C165607th.A1V(this)) {
                    i = C165607th.A05(this);
                } else {
                    return;
                }
            } while (i == this.zzb);
            this.zzd = i;
            return;
        }
        int i3 = this.zzb & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                A02 = C165567td.A02(this);
                do {
                    C90504aG.A10(this.zza.zzf(), list);
                } while (C165617ti.A03(this) < A02);
            }
            throw C165587tf.A0H();
        }
        do {
            C90504aG.A10(this.zza.zzf(), list);
            if (!C165607th.A1V(this)) {
                i = C165607th.A05(this);
            } else {
                return;
            }
        } while (i == this.zzb);
        this.zzd = i;
        return;
        zzR(A02);
    }

    public final void zzz(List list) {
        int A05;
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zziu.zzg(this.zza.zzg());
                        if (!C165607th.A1V(this)) {
                            A05 = C165607th.A05(this);
                        } else {
                            return;
                        }
                    } while (A05 == this.zzb);
                }
                throw C165587tf.A0H();
            }
            int A04 = C165617ti.A04(this);
            zzT(A04);
            zzhc zzhc = this.zza;
            int zzd2 = zzhc.zzd() + A04;
            do {
                zziu.zzg(zzhc.zzg());
                zzhc = this.zza;
            } while (zzhc.zzd() < zzd2);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C90504aG.A10(this.zza.zzg(), list);
                    if (!C165607th.A1V(this)) {
                        A05 = C165607th.A05(this);
                    } else {
                        return;
                    }
                } while (A05 == this.zzb);
            }
            throw C165587tf.A0H();
        }
        int A042 = C165617ti.A04(this);
        zzT(A042);
        zzhc zzhc2 = this.zza;
        int zzd3 = zzhc2.zzd() + A042;
        do {
            C90504aG.A10(zzhc2.zzg(), list);
            zzhc2 = this.zza;
        } while (zzhc2.zzd() < zzd3);
        return;
        this.zzd = A05;
    }

    public zzhd(zzhc zzhc) {
        Charset charset = zzjc.zza;
        this.zza = zzhc;
        zzhc.zzc = this;
    }

    private final void zzR(int i) {
        if (C165617ti.A03(this) != i) {
            throw C165597tg.A0K();
        }
    }

    public final boolean zzO() {
        int i;
        if (C165607th.A1V(this) || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }
}
