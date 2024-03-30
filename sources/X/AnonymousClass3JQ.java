package X;

import com.whatsapp.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.3JQ  reason: invalid class name */
public final class AnonymousClass3JQ {
    public final AnonymousClass3T1 A00;
    public final /* synthetic */ StatusPlaybackBaseFragment A01;
    public final /* synthetic */ StatusPlaybackContactFragment A02;

    public void A00(AnonymousClass3T1 r9) {
        long j;
        String A0b;
        AnonymousClass00C.A0D(r9, 0);
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
        C20810yC r3 = statusPlaybackContactFragment.A03;
        if (r3 != null) {
            C21100yf r1 = statusPlaybackContactFragment.A05;
            if (r1 != null) {
                AnonymousClass1AW r0 = statusPlaybackContactFragment.A0V;
                if (r0 != null) {
                    if (!C66013Ui.A0W(r1, r3, r9, r0)) {
                        AnonymousClass17Y r12 = statusPlaybackContactFragment.A00;
                        if (r12 != null) {
                            r12.A04(R.string.f12nameremoved, 1);
                        } else {
                            throw C36321k7.A06();
                        }
                    }
                    statusPlaybackContactFragment.A0U = r9;
                    int i = r9.A1I;
                    if (i == 3) {
                        j = C36371kC.A07(((AnonymousClass2bU) r9).A0B);
                    } else {
                        j = 0;
                    }
                    int i2 = 0;
                    if (i == 0 && (A0b = r9.A0b()) != null) {
                        i2 = A0b.length();
                    }
                    if (statusPlaybackContactFragment.A0Q != null) {
                        AnonymousClass3OM r13 = new AnonymousClass3OM(statusPlaybackContactFragment.A0a());
                        r13.A09 = true;
                        r13.A01 = r9.A1J.A00;
                        r13.A0a = C36441kJ.A15(C36411kG.A15(Integer.valueOf(i)));
                        r13.A0T = Long.valueOf(j);
                        r13.A0R = Integer.valueOf(i2);
                        statusPlaybackContactFragment.startActivityForResult(AnonymousClass3OM.A00(r13), 2);
                        return;
                    }
                    throw C36331k8.A0X();
                }
                throw C36331k8.A0d("interactiveMessageCustomizerFactory");
            }
            throw C36331k8.A0d("serverProps");
        }
        throw C36321k7.A07();
    }

    public void A01(AnonymousClass3T1 r6, boolean z) {
        AnonymousClass00C.A0D(r6, 0);
        if (z) {
            StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
            statusPlaybackContactFragment.A1g();
            C28781Ua r0 = statusPlaybackContactFragment.A0j;
            if (r0 == null) {
                throw C36331k8.A0d("xFamilyGating");
            } else if (r0.A00()) {
                C35011i0 r4 = statusPlaybackContactFragment.A0h;
                if (r4 != null) {
                    r4.A02(statusPlaybackContactFragment.A0a(), C36391kE.A0r(), "status_playback_fragment", C36371kC.A11(r6));
                } else {
                    throw C36331k8.A0d("xFamilyCrosspostManager");
                }
            }
        }
        this.A02.A1g();
    }

    public AnonymousClass3JQ(AnonymousClass3T1 r1, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        this.A02 = statusPlaybackContactFragment;
        this.A01 = statusPlaybackContactFragment;
        this.A00 = r1;
    }
}
