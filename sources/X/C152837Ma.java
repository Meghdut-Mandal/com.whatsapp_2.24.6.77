package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker;

/* renamed from: X.7Ma  reason: invalid class name and case insensitive filesystem */
public final class C152837Ma extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ PttMLModelDownloadWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152837Ma(PttMLModelDownloadWorker pttMLModelDownloadWorker) {
        super(0);
        this.this$0 = pttMLModelDownloadWorker;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.this$0.A00;
        C07700Yy A02 = C20600xp.A02(context);
        String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
        A02.A0M = "sending_media@1";
        A02.A09(System.currentTimeMillis());
        A02.A0G(A0m);
        A02.A0F(A0m);
        A02.A0E("Downloading");
        A02.A0B.icon = 17301633;
        A02.A07(100, 0, false);
        A02.A0J(true);
        A02.A0L = "progress";
        return A02;
    }
}
