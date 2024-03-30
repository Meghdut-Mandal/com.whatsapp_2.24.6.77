package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.1rC  reason: invalid class name and case insensitive filesystem */
public final class C39101rC extends C002000v {
    public final /* synthetic */ StatusPlaybackContactFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39101rC(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(3);
        this.A00 = statusPlaybackContactFragment;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        int i;
        AnonymousClass3LC r6 = (AnonymousClass3LC) obj2;
        AnonymousClass00C.A0D(r6, 2);
        C88164Rq r0 = (C88164Rq) this.A00.A0h();
        if (r0 != null) {
            i = ((StatusPlaybackActivity) r0).A07;
        } else {
            i = 0;
        }
        if (r6.A05) {
            C47592fB r1 = (C47592fB) r6;
            r1.A05 = false;
            r1.A0L(i);
        }
        if (r6.A04) {
            r6.A0A();
        }
        if (r6.A01) {
            if (r6.A03) {
                r6.A07();
            }
            r6.A06();
        }
    }
}
