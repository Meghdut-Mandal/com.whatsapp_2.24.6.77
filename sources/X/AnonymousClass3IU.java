package X;

import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3IU  reason: invalid class name */
public class AnonymousClass3IU implements C25711Hj {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3IU(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void accept(Object obj) {
        C54572tA r0;
        int i;
        switch (this.A02) {
            case 0:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
                int i2 = this.A00;
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.Bnv();
                if (((Boolean) obj).booleanValue()) {
                    deepLinkActivity.finish();
                    return;
                } else {
                    deepLinkActivity.BO5(i2);
                    return;
                }
            case 1:
                InAppBugReportingViewModel inAppBugReportingViewModel = (InAppBugReportingViewModel) this.A01;
                int i3 = this.A00;
                C63353Js r7 = (C63353Js) obj;
                AnonymousClass00C.A0D(r7, 2);
                int i4 = r7.A00;
                if (i4 == 0) {
                    InAppBugReportingViewModel.A01(AnonymousClass2W7.A00, inAppBugReportingViewModel, i3);
                    inAppBugReportingViewModel.A05[i3] = r7;
                    return;
                }
                if (i4 == 1) {
                    r0 = AnonymousClass2W6.A00;
                } else {
                    r0 = AnonymousClass2W5.A00;
                }
                InAppBugReportingViewModel.A01(r0, inAppBugReportingViewModel, i3);
                inAppBugReportingViewModel.A05[i3] = null;
                return;
            case 2:
                C29841Ye r5 = (C29841Ye) this.A01;
                int i5 = this.A00;
                AnonymousClass2bU r72 = (AnonymousClass2bU) obj;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("mediaautodownload/updatequeue/foreach message.key=");
                C36321k7.A1N(r72.A1J, A0u);
                AnonymousClass1ST r3 = r5.A06;
                C101334xN A0A = r3.A0A(r72);
                if (A0A == null) {
                    Log.i("mediaautodownload/updatequeue/foreach message skipped");
                    return;
                } else if (A0A.A14 != 0) {
                    AnonymousClass1GO r1 = r5.A05;
                    if (r1.A03(r72)) {
                        i = 1;
                    } else if (r1.A04(r72, i5)) {
                        i = 2;
                    } else {
                        r3.A0E(r72);
                        return;
                    }
                    A0A.A14 = i;
                    AnonymousClass6Fk r12 = A0A.A0j;
                    synchronized (r12) {
                        r12.A00 = i;
                    }
                    return;
                } else {
                    return;
                }
            default:
                ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) this.A01;
                int i6 = this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    reactionsTrayViewModel.A00 = i6;
                    C29721Xs r02 = reactionsTrayViewModel.A0A;
                    AnonymousClass3T1 r13 = reactionsTrayViewModel.A0G;
                    r02.A01.Bly(C29721Xs.A00(r02.A00.A0C(r13), AnonymousClass3UK.A05(r13), 1));
                    C36341k9.A17(reactionsTrayViewModel.A0B, 1);
                    return;
                }
                return;
        }
    }
}
