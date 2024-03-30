package X;

import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.6no  reason: invalid class name and case insensitive filesystem */
public class C141776no implements C159137is {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3OE A01;
    public final /* synthetic */ AnonymousClass6YM A02;
    public final /* synthetic */ CallInfo A03;

    public C141776no(AnonymousClass3OE r1, AnonymousClass6YM r2, CallInfo callInfo, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
        this.A03 = callInfo;
    }

    public void BXQ(Throwable th) {
        this.A02.A26.A0E("VoiceService/startForegroundService", C36331k8.A0i("Notification/Future/onFailure: ", AnonymousClass000.A0u(), th), true);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (!AnonymousClass000.A1X(obj)) {
            AnonymousClass6YM r4 = this.A02;
            r4.A2i.A02(23, r4.A2J.A06(r4.A22, this.A01, r4.A2R, this.A00, true));
            CallInfo callInfo = this.A03;
            AnonymousClass11F r1 = callInfo.groupJid;
            if (!(r1 == null && (r1 = callInfo.getCreatorJid()) == null)) {
                r4.A2e.A0B(r1, 0);
            }
            r4.A1J = true;
        }
    }
}
