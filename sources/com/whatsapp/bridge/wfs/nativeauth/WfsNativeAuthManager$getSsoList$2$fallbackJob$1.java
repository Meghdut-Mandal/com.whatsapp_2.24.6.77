package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C009403z;
import X.C023409w;
import X.C023509x;
import X.C18010sR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$fallbackJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C007403e $fbJob;
    public final /* synthetic */ C007403e $igJob;
    public final /* synthetic */ C18010sR $resultChannel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$fallbackJob$1(C023509x r2, C007403e r3, C007403e r4, C18010sR r5) {
        super(2, r2);
        this.$fbJob = r3;
        this.$igJob = r4;
        this.$resultChannel = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        WfsNativeAuthManager$getSsoList$2$fallbackJob$1 wfsNativeAuthManager$getSsoList$2$fallbackJob$1 = new WfsNativeAuthManager$getSsoList$2$fallbackJob$1(r6, this.$fbJob, this.$igJob, this.$resultChannel);
        wfsNativeAuthManager$getSsoList$2$fallbackJob$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2$fallbackJob$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass040 r1 = (AnonymousClass040) this.L$0;
            while (C009403z.A04(r1) && (this.$fbJob.BL7() || this.$igJob.BL7())) {
            }
            C18010sR r12 = this.$resultChannel;
            C023409w r0 = C023409w.A00;
            this.label = 1;
            if (r12.Bpf(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$fallbackJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
