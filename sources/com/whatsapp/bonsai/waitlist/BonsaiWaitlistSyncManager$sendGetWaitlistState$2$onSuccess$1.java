package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C88394Sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1", f = "BonsaiWaitlistSyncManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C88394Sn $callback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(C88394Sn r2, C023509x r3) {
        super(2, r3);
        this.$callback = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(this.$callback, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(this.$callback, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.$callback.onSuccess();
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
