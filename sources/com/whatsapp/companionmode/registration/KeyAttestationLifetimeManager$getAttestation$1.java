package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C195079Sk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
public final class KeyAttestationLifetimeManager$getAttestation$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C195079Sk this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1", f = "KeyAttestationLifetimeManager.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C007403e r0 = C195079Sk.this.A01;
                if (r0 == null) {
                    return null;
                }
                this.label = 1;
                if (r0.BNp(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationLifetimeManager$getAttestation$1(C195079Sk r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new KeyAttestationLifetimeManager$getAttestation$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A07 = (long) this.this$0.A08.A07(6434);
            final C195079Sk r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (C07340Xg.A01(this, r0, A07) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return this.this$0.A02;
    }
}
