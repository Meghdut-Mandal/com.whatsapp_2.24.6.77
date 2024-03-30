package X;

import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.util.Log;

/* renamed from: X.6iz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138966iz implements AnonymousClass7eC {
    public final /* synthetic */ ChatTransferActivity A00;

    public /* synthetic */ C138966iz(ChatTransferActivity chatTransferActivity) {
        this.A00 = chatTransferActivity;
    }

    public final void onResult(Object obj) {
        ChatTransferActivity chatTransferActivity = this.A00;
        Throwable th = (Throwable) obj;
        Log.e("fpm/ChatTransferActivity/lottie-failure", th);
        chatTransferActivity.A03.A0D("NetworkResourceLoader/ChatTransferActivity/Lottie", th.toString(), th);
    }
}
