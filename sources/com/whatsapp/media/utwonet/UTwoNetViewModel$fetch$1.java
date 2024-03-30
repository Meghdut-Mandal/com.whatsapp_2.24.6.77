package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5X0;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C119795qT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1", f = "UTwoNetViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$fetch$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1$1", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                C119795qT r0 = UTwoNetViewModel.this.A03;
                r0.A00.A02(r0.A01);
                UTwoNetViewModel uTwoNetViewModel = UTwoNetViewModel.this;
                C119795qT r1 = uTwoNetViewModel.A03;
                r1.A00.A01("UTwoNet", AnonymousClass5X0.A02(uTwoNetViewModel, 32), AnonymousClass5X0.A02(uTwoNetViewModel, 33), 1020);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$fetch$1(UTwoNetViewModel uTwoNetViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = uTwoNetViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new UTwoNetViewModel$fetch$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UTwoNetViewModel$fetch$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final UTwoNetViewModel uTwoNetViewModel = this.this$0;
            C005502l r2 = uTwoNetViewModel.A05;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r2, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
