package com.google.android.gms.vision.clearcut;

import X.AnonymousClass001;
import X.AnonymousClass8EH;
import X.AnonymousClass8EK;
import X.AnonymousClass8EO;
import X.AnonymousClass8EQ;
import X.AnonymousClass8ER;
import X.AnonymousClass8EW;
import X.AnonymousClass8EX;
import X.C02640Bg;
import X.C02650Bh;
import X.C109725Yr;
import X.C165597tg;
import X.C170168Cf;
import X.C21032A3v;
import X.C21884AcA;
import X.C23121B6b;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static String zzb(Context context) {
        try {
            C02650Bh A00 = C02640Bg.A00(context);
            return A00.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = context.getPackageName();
            C109725Yr.A00("Unable to find calling package info for %s", e, A0L);
            return null;
        }
    }

    public static AnonymousClass8EK zza(Context context) {
        AnonymousClass8EH A01 = AnonymousClass8EX.A01(AnonymousClass8EK.zzf);
        String packageName = context.getPackageName();
        AnonymousClass8EH.A00(A01);
        AnonymousClass8EK r1 = (AnonymousClass8EK) A01.A00;
        packageName.getClass();
        r1.zzc |= 1;
        r1.zzd = packageName;
        String zzb = zzb(context);
        if (zzb != null) {
            AnonymousClass8EH.A00(A01);
            AnonymousClass8EK r12 = (AnonymousClass8EK) A01.A00;
            r12.zzc |= 2;
            r12.zze = zzb;
        }
        return (AnonymousClass8EK) A01.A01();
    }

    public static AnonymousClass8ER zza(long j, int i, String str, String str2, List list, C170168Cf r12) {
        AnonymousClass8EH r3 = (AnonymousClass8EH) AnonymousClass8EO.zzg.A09(5);
        AnonymousClass8EH r5 = (AnonymousClass8EH) AnonymousClass8EW.zzl.A09(5);
        AnonymousClass8EH.A00(r5);
        AnonymousClass8EW r1 = (AnonymousClass8EW) r5.A00;
        str2.getClass();
        r1.zzc |= 1;
        r1.zzd = str2;
        AnonymousClass8EH.A00(r5);
        AnonymousClass8EW r4 = (AnonymousClass8EW) r5.A00;
        int i2 = r4.zzc | 16;
        r4.zzc = i2;
        r4.zzi = j;
        r4.zzc = i2 | 32;
        r4.zzj = (long) i;
        C23121B6b b6b = r4.zzk;
        if (!((C21884AcA) b6b).A00) {
            b6b = b6b.ByB(C165597tg.A07(b6b));
            r4.zzk = b6b;
        }
        C21032A3v.A09(list, b6b);
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(r5.A01());
        AnonymousClass8EH.A00(r3);
        AnonymousClass8EO r2 = (AnonymousClass8EO) r3.A00;
        C23121B6b b6b2 = r2.zzf;
        if (!((C21884AcA) b6b2).A00) {
            b6b2 = b6b2.ByB(C165597tg.A07(b6b2));
            r2.zzf = b6b2;
        }
        C21032A3v.A09(A0I, b6b2);
        AnonymousClass8EH A01 = AnonymousClass8EX.A01(AnonymousClass8EQ.zzi);
        AnonymousClass8EH.A00(A01);
        AnonymousClass8EQ r52 = (AnonymousClass8EQ) A01.A00;
        int i3 = r52.zzc | 4;
        r52.zzc = i3;
        r52.zzf = (long) r12.A01;
        int i4 = i3 | 2;
        r52.zzc = i4;
        r52.zze = (long) r12.A00;
        long j2 = (long) r12.A02;
        int i5 = i4 | 8;
        r52.zzc = i5;
        r52.zzg = j2;
        long j3 = r12.A04;
        r52.zzc = i5 | 16;
        r52.zzh = j3;
        AnonymousClass8EQ r0 = (AnonymousClass8EQ) A01.A01();
        AnonymousClass8EH.A00(r3);
        AnonymousClass8EO r13 = (AnonymousClass8EO) r3.A00;
        r0.getClass();
        r13.zzd = r0;
        r13.zzc |= 1;
        AnonymousClass8EO r32 = (AnonymousClass8EO) r3.A01();
        AnonymousClass8EH A012 = AnonymousClass8EX.A01(AnonymousClass8ER.zzi);
        AnonymousClass8EH.A00(A012);
        AnonymousClass8ER r14 = (AnonymousClass8ER) A012.A00;
        r32.getClass();
        r14.zzf = r32;
        r14.zzc |= 4;
        return (AnonymousClass8ER) A012.A01();
    }
}
