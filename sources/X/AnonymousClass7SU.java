package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;

/* renamed from: X.7SU  reason: invalid class name */
public final class AnonymousClass7SU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AudioChatBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SU(AudioChatBottomSheetDialog audioChatBottomSheetDialog) {
        super(1);
        this.this$0 = audioChatBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallGrid callGrid = this.this$0.A05;
        if (callGrid != null) {
            callGrid.A0C();
        }
        return AnonymousClass0AJ.A00;
    }
}
