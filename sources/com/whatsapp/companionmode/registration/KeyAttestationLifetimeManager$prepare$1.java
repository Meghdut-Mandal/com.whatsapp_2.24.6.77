package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C188648zz;
import X.C195079Sk;
import X.C22151Aha;
import X.C22381Ali;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$prepare$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C195079Sk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$prepare$1(C195079Sk r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new KeyAttestationLifetimeManager$prepare$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new KeyAttestationLifetimeManager$prepare$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            int A07 = this.this$0.A08.A07(6433);
            C195079Sk r2 = this.this$0;
            C22381Ali ali = new C22381Ali(r2);
            C22151Aha aha = new C22151Aha(r2);
            this.label = 1;
            if (KeyAttestationLifetimeManagerKt.A00(this, aha, ali, A07) == r5) {
                return r5;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Exception unused) {
                C195079Sk r0 = this.this$0;
                r0.A06.A00(C188648zz.A0A, String.valueOf(r0.A08.A07(6433)));
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
