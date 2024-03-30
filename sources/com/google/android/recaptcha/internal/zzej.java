package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165587tf;
import X.C36341k9;
import X.C36441kJ;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzej implements zzen {
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        ArrayList A14 = C36441kJ.A14(r5);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer) || obj == null) {
                throw C165587tf.A0G();
            }
            A14.add(obj);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A14.iterator();
        while (it.hasNext()) {
            int A0A = C36341k9.A0A(it);
            if (zzb(A0A)) {
                AnonymousClass000.A1F(A0I, A0A);
            }
        }
        return A0I;
    }

    public static final boolean zzb(int i) {
        try {
            new Socket("localhost", i).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }
}
