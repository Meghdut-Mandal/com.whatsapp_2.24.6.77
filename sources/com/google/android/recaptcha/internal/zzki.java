package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165617ti;
import X.C36401kF;
import java.util.Iterator;
import java.util.Map;

public final class zzki implements zzkr {
    public final zzke zza;
    public final zzll zzb;
    public final boolean zzc;
    public final zzif zzd;

    public static zzki zzc(zzll zzll, zzif zzif, zzke zzke) {
        return new zzki(zzll, zzif, zzke);
    }

    public final int zza(Object obj) {
        int zzb2 = ((zzit) obj).zzc.zzb();
        if (this.zzc) {
            return zzb2 + ((zzip) obj).zzb.zzb();
        }
        return zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zzit) obj).zzc.hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        return C36401kF.A02(((zzip) obj).zzb.zza, hashCode * 53);
    }

    public final void zzj(Object obj, zzmd zzmd) {
        Iterator zzf = ((zzip) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(zzf);
            zzii zzii = (zzii) A11.getKey();
            if (zzii.zze() == zzmc.MESSAGE) {
                zzii.zzg();
                zzii.zzf();
                boolean z = A11 instanceof zzjh;
                int zza2 = zzii.zza();
                if (z) {
                    ((zzjh) A11).zza();
                    throw AnonymousClass001.A0A("zzb");
                }
                zzmd.zzw(zza2, A11.getValue());
            } else {
                throw AnonymousClass001.A09("Found invalid MessageSet item.");
            }
        }
        ((zzit) obj).zzc.zzk(zzmd);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzit) obj).zzc.equals(((zzit) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzip) obj).zzb.equals(((zzip) obj2).zzb);
        }
        return true;
    }

    public final Object zze() {
        zzke zzke = this.zza;
        if (zzke instanceof zzit) {
            return ((zzit) zzke).zzs();
        }
        return zzke.zzW().zzk();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzkt.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzkt.zzq(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzkq zzkq, zzie zzie) {
        zzje zzje;
        boolean z;
        zzll zzll = this.zzb;
        Object zzc2 = zzll.zzc(obj);
        ((zzip) obj).zzi();
        loop0:
        while (zzkq.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd2 = zzkq.zzd();
                if (zzd2 != 11) {
                    if ((zzd2 & 7) != 2) {
                        z = zzkq.zzO();
                    } else if (zzie.zza(this.zza, zzd2 >>> 3) == null) {
                        z = zzll.zzr(zzc2, zzkq);
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    int i = 0;
                    zzir zzir = null;
                    zzgw zzgw = null;
                    while (true) {
                        if (zzkq.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzkq.zzd();
                        if (zzd3 == 16) {
                            i = zzkq.zzj();
                            zzir = zzie.zza(this.zza, i);
                        } else if (zzd3 == 26) {
                            if (zzir != null) {
                                break loop0;
                            }
                            zzgw = zzkq.zzp();
                        } else if (!zzkq.zzO()) {
                            break;
                        }
                    }
                    if (zzkq.zzd() != 12) {
                        zzje = C165617ti.A0H("Protocol message end-group tag did not match expected tag.");
                        throw zzje;
                    } else if (zzgw == null) {
                        continue;
                    } else if (zzir == null) {
                        zzll.zzk(zzc2, i, zzgw);
                    }
                }
                zzje = null;
                throw zzje;
            } finally {
                zzll.zzn(obj, zzc2);
            }
        }
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgj zzgj) {
        int i3 = i;
        Object obj2 = obj;
        zzit zzit = (zzit) obj2;
        zzlm zzlm = zzit.zzc;
        if (zzlm == zzlm.zza) {
            zzlm = zzlm.zzf();
            zzit.zzc = zzlm;
        }
        ((zzip) obj2).zzi();
        zzir zzir = null;
        while (true) {
            int i4 = i2;
            if (i3 < i4) {
                byte[] bArr2 = bArr;
                zzgj zzgj2 = zzgj;
                i3 = zzgk.zzi(bArr2, i3, zzgj2);
                int i5 = zzgj2.zza;
                if (i5 == 11) {
                    int i6 = 0;
                    Object obj3 = null;
                    while (i3 < i4) {
                        i3 = zzgk.zzi(bArr2, i3, zzgj2);
                        int i7 = zzgj2.zza;
                        int i8 = i7 >>> 3;
                        int i9 = i7 & 7;
                        if (i8 != 2) {
                            if (i8 == 3) {
                                if (zzir != null) {
                                    int i10 = zzkn.zza;
                                    throw null;
                                } else if (i9 == 2) {
                                    i3 = zzgk.zza(bArr2, i3, zzgj2);
                                    obj3 = zzgj2.zzc;
                                }
                            }
                        } else if (i9 == 0) {
                            i3 = zzgk.zzi(bArr2, i3, zzgj2);
                            i6 = zzgj2.zza;
                            zzir = zzgj2.zzd.zza(this.zza, i6);
                        }
                        if (i7 == 12) {
                            break;
                        }
                        i3 = zzgk.zzo(i7, bArr2, i3, i4, zzgj2);
                    }
                    if (obj3 != null) {
                        zzlm.zzj((i6 << 3) | 2, obj3);
                    }
                } else if ((i5 & 7) == 2) {
                    zzir = zzgj2.zzd.zza(this.zza, i5 >>> 3);
                    if (zzir == null) {
                        i3 = zzgk.zzh(i5, bArr2, i3, i4, zzlm, zzgj2);
                    } else {
                        int i11 = zzkn.zza;
                        throw null;
                    }
                } else {
                    i3 = zzgk.zzo(i5, bArr2, i3, i4, zzgj2);
                }
            } else if (i3 != i4) {
                throw C165617ti.A0H("Failed to parse the message.");
            } else {
                return;
            }
        }
    }

    public final boolean zzl(Object obj) {
        return ((zzip) obj).zzb.zzk();
    }

    public zzki(zzll zzll, zzif zzif, zzke zzke) {
        this.zzb = zzll;
        this.zzc = zzke instanceof zzip;
        this.zzd = zzif;
        this.zza = zzke;
    }
}
