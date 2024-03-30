package X;

import com.whatsapp.stickers.WebpInfo;

/* renamed from: X.7Mt  reason: invalid class name and case insensitive filesystem */
public final class C153027Mt extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C106555Ki this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153027Mt(C106555Ki r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C106555Ki r2 = this.this$0;
        WebpInfo webpInfo = r2.A01;
        if (webpInfo == null || webpInfo.numFrames <= 1) {
            i = -1;
        } else {
            i = r2.A02.A00(r2.A03.getAbsolutePath());
        }
        return Integer.valueOf(i);
    }
}
