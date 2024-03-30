package com.google.android.recaptcha.internal;

import X.C165577te;
import X.C90524aI;

public abstract class zzlg {
    public static String zza(zzgw zzgw) {
        String str;
        StringBuilder A0h = C90524aI.A0h(zzgw.zzd());
        for (int i = 0; i < zzgw.zzd(); i++) {
            int zza = zzgw.zza(i);
            if (zza != 34) {
                if (zza == 39) {
                    str = "\\'";
                } else if (zza != 92) {
                    switch (zza) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (zza < 32 || zza > 126) {
                                zza = C165577te.A07(A0h, zza);
                            }
                            A0h.append((char) zza);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0h.append(str);
            } else {
                str = "\\\"";
                A0h.append(str);
            }
        }
        return A0h.toString();
    }
}
