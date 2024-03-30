package X;

import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.49F  reason: invalid class name */
public final class AnonymousClass49F extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ChatLockRequestAuthInterstitialActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49F(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity) {
        super(0);
        this.this$0 = chatLockRequestAuthInterstitialActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return AnonymousClass11F.A00.A02(this.this$0.getIntent().getStringExtra("extra_chat_jid"));
    }
}
