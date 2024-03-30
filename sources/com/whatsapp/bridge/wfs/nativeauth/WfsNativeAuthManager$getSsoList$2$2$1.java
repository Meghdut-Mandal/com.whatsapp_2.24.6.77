package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1", f = "WfsNativeAuthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10810fG $results;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$2$1(C023509x r2, C10810fG r3) {
        super(2, r2);
        this.$results = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        WfsNativeAuthManager$getSsoList$2$2$1 wfsNativeAuthManager$getSsoList$2$2$1 = new WfsNativeAuthManager$getSsoList$2$2$1(r4, this.$results);
        wfsNativeAuthManager$getSsoList$2$2$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.$results.element = this.L$0;
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
