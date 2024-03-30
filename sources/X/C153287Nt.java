package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView;

/* renamed from: X.7Nt  reason: invalid class name and case insensitive filesystem */
public final class C153287Nt extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AudioChatBottomSheetFooterView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153287Nt(Context context, AudioChatBottomSheetFooterView audioChatBottomSheetFooterView) {
        super(0);
        this.this$0 = audioChatBottomSheetFooterView;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = this.this$0;
        AnonymousClass00C.A0D(audioChatBottomSheetFooterView, 0);
        AnonymousClass1RJ r3 = new AnonymousClass1RJ(C36361kB.A0G(audioChatBottomSheetFooterView, R.id.leave_btn_stub));
        r3.A07(new C164667sB(this.$context, this.this$0, 0));
        return r3;
    }
}
