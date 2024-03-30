package X;

import android.util.Pair;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;

/* renamed from: X.3pQ  reason: invalid class name and case insensitive filesystem */
public class C76773pQ implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0UQ A03;
    public final /* synthetic */ UserNoticeStageUpdateWorker A04;

    public C76773pQ(AnonymousClass0UQ r1, UserNoticeStageUpdateWorker userNoticeStageUpdateWorker, int i, int i2, int i3) {
        this.A04 = userNoticeStageUpdateWorker;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = r1;
    }

    public void BVN(String str) {
        Object r0;
        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
        int i = this.A04.A01.A00;
        AnonymousClass0UQ r1 = this.A03;
        if (i > 4) {
            r0 = new C97334ow();
        } else {
            r0 = new C97324ov();
        }
        r1.A00(r0);
    }

    public void BiM(C203399nx r11, String str) {
        Log.i("UserNoticeStageUpdateWorker/success");
        C203399nx A0c = r11.A0c("notice");
        if (A0c != null) {
            C29341Wg r2 = this.A04.A02;
            int i = this.A00;
            int i2 = this.A02;
            C36321k7.A1T("UserNoticeManager/handleStaleClientStage/notice id: ", AnonymousClass000.A0u(), i);
            r2.A03.A04(new C65613Su(i, A0c.A0R("stage"), i2, 1000 * A0c.A0U("t"), 0));
        }
        if (this.A01 == 5) {
            C29341Wg r3 = this.A04.A02;
            int i3 = this.A00;
            C36321k7.A1T("UserNoticeManager/handleCleanup/notice id: ", AnonymousClass000.A0u(), i3);
            C36321k7.A1T("UserNoticeManager/deleteUserNotice/notice id: ", AnonymousClass000.A0u(), i3);
            r3.A02.A07(i3);
            r3.A03.A03(i3);
            C29341Wg.A03(r3);
        }
        this.A03.A00(new C97344ox());
    }

    public void BWw(C203399nx r4, String str) {
        Object r0;
        Pair A012 = AnonymousClass3ME.A01(r4);
        C36321k7.A1J(A012, "UserNoticeStageUpdateWorker/onError ", AnonymousClass000.A0u());
        if (A012 != null && C36381kD.A04(A012) == 400) {
            C29371Wj.A02(this.A04.A01, C36361kB.A0i());
        }
        int i = this.A04.A01.A00;
        AnonymousClass0UQ r1 = this.A03;
        if (i > 4) {
            r0 = new C97334ow();
        } else {
            r0 = new C97324ov();
        }
        r1.A00(r0);
    }
}
