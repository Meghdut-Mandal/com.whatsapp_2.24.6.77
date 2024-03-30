package X;

import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel", f = "ScreenShareViewModel.kt", i = {0}, l = {286}, m = "startScreenSharing", n = {"this"}, s = {"L$0"})
/* renamed from: X.7A6  reason: invalid class name */
public final class AnonymousClass7A6 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7A6(ScreenShareViewModel screenShareViewModel, C023509x r2) {
        super(r2);
        this.this$0 = screenShareViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScreenShareViewModel.A07(this.this$0, this);
    }
}
