package com.google.android.recaptcha.internal;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;

public final class zzs extends AnonymousClass0A1 implements C009003v {
    public zzs(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r3) {
        return new zzs(r3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AN.A00(obj);
        Thread.currentThread().setPriority(8);
        return AnonymousClass0AJ.A00;
    }
}
