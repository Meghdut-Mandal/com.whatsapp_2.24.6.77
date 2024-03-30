package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.C006302t;
import X.C007103b;
import X.C12370hw;
import X.C14380lX;
import X.C15010mY;
import X.C36321k7;
import X.C36441kJ;
import X.C90504aG;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzy implements zzh {
    public final Context zza;
    public final String zzb = "rce_";
    public final zzad zzc;

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File name : listFiles) {
                if (AnonymousClass00C.A0J(name.getName(), C36321k7.A0D(this.zzb, str))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String zza(String str) {
        File A0w = C36441kJ.A0w(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (A0w.exists()) {
            return new String(C14380lX.A01(A0w), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList A0I = AnonymousClass001.A0I();
                for (File file : listFiles) {
                    if (AnonymousClass098.A07(file.getName(), this.zzb, false)) {
                        A0I.add(file);
                    }
                }
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    C90504aG.A0a(it).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        C15010mY r0 = new C15010mY();
        ArrayList A0J = C36321k7.A0J(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C12370hw r2 = (C12370hw) it;
            int i = r2.A00;
            if (i != r2.A02) {
                r2.A00 = r2.A03 + i;
            } else if (r2.A01) {
                r2.A01 = false;
            } else {
                throw new NoSuchElementException();
            }
            A0J.add(Character.valueOf((char) i));
        }
        List A0Z = C007103b.A0Z(A0J);
        Collections.shuffle(A0Z);
        String A0Q = C007103b.A0Q("", "", "", A0Z.subList(0, 8), (C006302t) null);
        File A0w = C36441kJ.A0w(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(A0Q)));
        zzad.zzb(A0w, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        A0w.renameTo(C36441kJ.A0w(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }
}
