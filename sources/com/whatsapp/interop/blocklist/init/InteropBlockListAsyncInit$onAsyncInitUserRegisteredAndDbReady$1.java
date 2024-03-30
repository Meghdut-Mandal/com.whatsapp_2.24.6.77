package com.whatsapp.interop.blocklist.init;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C27251Nm;
import X.C69073cw;
import com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.init.InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1", f = "InteropBlockListAsyncInit.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C69073cw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(C69073cw r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C27251Nm r3 = this.this$0.A00;
            this.label = 1;
            Set set = r3.A02;
            boolean z = !set.isEmpty();
            Object obj3 = set;
            if (!z) {
                obj3 = AnonymousClass0A2.A00(this, r3.A03, new InteropBlockListManager$loadBlockListFromStorage$2(r3, (C023509x) null));
            }
            if (obj3 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
