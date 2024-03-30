package X;

import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel", f = "EnforcedMessagesViewModel.kt", i = {0, 0}, l = {68}, m = "fetchAppealState", n = {"this", "messageToAppealMap"}, s = {"L$0", "L$1"})
/* renamed from: X.3zA  reason: invalid class name and case insensitive filesystem */
public final class C82723zA extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EnforcedMessagesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82723zA(EnforcedMessagesViewModel enforcedMessagesViewModel, C023509x r2) {
        super(r2);
        this.this$0 = enforcedMessagesViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EnforcedMessagesViewModel.A01((C28981Uw) null, this.this$0, this);
    }
}
