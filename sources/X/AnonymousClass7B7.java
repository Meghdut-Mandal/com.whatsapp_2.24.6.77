package X;

import android.content.Context;
import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager", f = "WfsNativeAuthManager.kt", i = {0, 0, 0, 0, 0, 0}, l = {70}, m = "getSsoCredentials", n = {"this", "wfsNonceFetcher", "wfsCallback", "ntaCallback", "errorCallback", "fetchSource"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* renamed from: X.7B7  reason: invalid class name */
public final class AnonymousClass7B7 extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7B7(WfsNativeAuthManager wfsNativeAuthManager, C023509x r2) {
        super(r2);
        this.this$0 = wfsNativeAuthManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Context) null, (C119195pO) null, (C119205pP) null, (AnonymousClass5pQ) null, (C1260362h) null, (AnonymousClass6OK) null, this, (AnonymousClass040) null);
    }
}
