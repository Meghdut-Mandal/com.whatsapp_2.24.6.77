package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5Z3;
import X.AnonymousClass66Y;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C120565ri;
import X.C132956Vy;
import X.C1510477v;
import X.C18010sR;
import X.C36401kF;
import X.C36411kG;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$fbJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C18010sR $resultChannel;
    public int label;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$fbJob$1(Context context, WfsNativeAuthManager wfsNativeAuthManager, C023509x r4, C18010sR r5) {
        super(2, r4);
        this.this$0 = wfsNativeAuthManager;
        this.$context = context;
        this.$resultChannel = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new WfsNativeAuthManager$getSsoList$2$fbJob$1(this.$context, this.this$0, r6, this.$resultChannel);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            List A01 = this.this$0.A00.A00("wa_android_wfs_native_auth", new C1510477v(), true).A01(this.$context.getApplicationContext(), new AnonymousClass5Z3(1), !C132956Vy.A02());
            ArrayList A13 = C36411kG.A13(A01);
            for (Object next : A01) {
                C120565ri r2 = ((AnonymousClass66Y) next).A01.A03;
                AnonymousClass00C.A08(r2);
                Integer num = r2.A01;
                Integer num2 = C023109s.A0C;
                if (num != num2 || r2.A00 != num2) {
                    A13.add(next);
                }
            }
            if (C36401kF.A1a(A13)) {
                C18010sR r0 = this.$resultChannel;
                this.label = 1;
                if (r0.Bpf(A01, this) == r7) {
                    return r7;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$fbJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
