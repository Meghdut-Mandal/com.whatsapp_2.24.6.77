package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.B8K;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C12600iM;
import X.C188648zz;
import X.C195009Sc;
import X.C19970wo;
import X.C22380Alh;
import X.C36411kG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1", f = "GpiaLifetimeManager.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaLifetimeManager$prepare$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C195009Sc this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1$2", f = "GpiaLifetimeManager.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.GpiaLifetimeManager$prepare$1$2  reason: invalid class name */
    public final class AnonymousClass2 extends AnonymousClass0A1 implements C006302t {
        public Object L$0;
        public int label;

        public final C023509x create(C023509x r3) {
            return new AnonymousClass2(r3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return new AnonymousClass2((C023509x) obj).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C195009Sc r0 = C195009Sc.this;
                this.L$0 = r0;
                this.label = 1;
                C12600iM A16 = C36411kG.A16(this);
                r0.A06.A02(new B8K(A16, 0), "md-pairing");
                if (A16.A00() == r4) {
                    return r4;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            C195009Sc r2 = C195009Sc.this;
            r2.A00 = C19970wo.A00(r2.A03);
            return AnonymousClass0AJ.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaLifetimeManager$prepare$1(C195009Sc r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GpiaLifetimeManager$prepare$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GpiaLifetimeManager$prepare$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            int A07 = this.this$0.A05.A07(7009);
            final C195009Sc r3 = this.this$0;
            C22380Alh alh = new C22380Alh(r3);
            AnonymousClass2 r0 = new AnonymousClass2((C023509x) null);
            this.label = 1;
            if (GpiaLifetimeManagerKt.A00(this, alh, r0, A07) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Exception e) {
                C195009Sc r02 = this.this$0;
                r02.A04.A01(C188648zz.A05, String.valueOf(r02.A05.A07(7009)), e);
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
