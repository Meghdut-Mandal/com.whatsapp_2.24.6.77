package X;

import com.whatsapp.util.Log;

/* renamed from: X.6s2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144346s2 implements C19680wL {
    public final /* synthetic */ C139186jN A00;

    public /* synthetic */ C144346s2(C139186jN r1) {
        this.A00 = r1;
    }

    public final void BUP(AnonymousClass3K7 r6) {
        AnonymousClass6Fc r2;
        C139186jN r4 = this.A00;
        if (!r4.A01.isFinishing() && r6.A02 && (r2 = r4.A04) != null && r2.A00() == 4 && r2.A08()) {
            Log.i("MediaViewStreamingVideoPlayer/auto-retry");
            AnonymousClass61H r0 = r4.A05;
            if (r0 != null) {
                r0.A00("", true, 2);
            }
        }
    }
}
