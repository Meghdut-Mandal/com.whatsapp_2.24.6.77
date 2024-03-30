package com.google.android.recaptcha.internal;

import X.AnonymousClass011;
import X.C000400e;
import X.C165587tf;
import X.C36341k9;
import X.C36371kC;
import X.C90464aC;
import android.content.Context;
import java.util.Map;

public final class zzeo implements zzen {
    public final Context zzb;
    public final Map zzc;

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        if (obj != null) {
            Object obj2 = this.zzc.get(obj);
            if (obj2 != null) {
                return this.zzb.getSystemService((String) obj2);
            }
            throw new zzae(4, 4, (Throwable) null);
        }
        throw C165587tf.A0G();
    }

    public zzeo(Context context) {
        this.zzb = context;
        AnonymousClass011[] r4 = new AnonymousClass011[4];
        C90464aC.A1E(2, "activity", r4);
        C90464aC.A1F(3, "phone", r4);
        C36341k9.A1J(4, "input_method", r4, 2);
        C36341k9.A1J(C36371kC.A0p(), "audio", r4, 3);
        this.zzc = C000400e.A07(r4);
    }
}
