package X;

import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.6q8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143186q8 implements AnonymousClass4PI {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ C143186q8(UserJid userJid, VoipActivityV2 voipActivityV2) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }

    public final void BfK(boolean z) {
        AnonymousClass655 r4;
        int i;
        int i2;
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid userJid = this.A00;
        CallInfo A03 = C34681hT.A03(voipActivityV2.A0Y);
        if (A03 != null) {
            InCallBannerViewModel inCallBannerViewModel = voipActivityV2.A0f;
            boolean z2 = A03.videoEnabled;
            AnonymousClass141 A0D = inCallBannerViewModel.A04.A0D(userJid);
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass171 r0 = inCallBannerViewModel.A05;
            if (z) {
                A0L[0] = r0.A0H(A0D);
                C47862ft A0O = C90524aI.A0O(A0L, R.string.f12nameremoved);
                int i3 = R.color.f6nameremoved;
                if (z2) {
                    i3 = R.color.f6nameremoved;
                }
                r4 = new AnonymousClass655(A0O, (C61243Bc) null, 5, i3);
                i = R.drawable.vec_ic_calling_user_blocked;
                i2 = R.color.f6nameremoved;
            } else {
                A0L[0] = r0.A0H(A0D);
                C47862ft A0O2 = C90524aI.A0O(A0L, R.string.f12nameremoved);
                C47862ft A0O3 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                int i4 = R.color.f6nameremoved;
                if (z2) {
                    i4 = R.color.f6nameremoved;
                }
                r4 = new AnonymousClass655(A0O2, A0O3, 6, i4);
                i = R.drawable.vec_ic_remove_user_warning;
                i2 = R.color.f6nameremoved;
            }
            C95504lc.A05(inCallBannerViewModel, r4, i, i2);
        }
    }
}
