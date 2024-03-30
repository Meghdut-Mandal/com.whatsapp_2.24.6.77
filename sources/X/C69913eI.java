package X;

import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;

/* renamed from: X.3eI  reason: invalid class name and case insensitive filesystem */
public final class C69913eI implements C88484Sw {
    public final /* synthetic */ ChatLockRequestAuthInterstitialActivity A00;
    public final /* synthetic */ AnonymousClass11F A01;

    public C69913eI(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity, AnonymousClass11F r2) {
        this.A01 = r2;
        this.A00 = chatLockRequestAuthInterstitialActivity;
    }

    public void BT0() {
        ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = this.A00;
        ChatLockRequestAuthInterstitialActivity.A07(chatLockRequestAuthInterstitialActivity);
        chatLockRequestAuthInterstitialActivity.finish();
    }

    public void BTZ() {
        AnonymousClass11F r0 = this.A01;
        ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = this.A00;
        if (r0 != null) {
            chatLockRequestAuthInterstitialActivity.setResult(2);
        } else {
            ChatLockRequestAuthInterstitialActivity.A07(chatLockRequestAuthInterstitialActivity);
        }
        chatLockRequestAuthInterstitialActivity.finish();
    }
}
