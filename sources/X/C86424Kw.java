package X;

import com.whatsapp.passkey.PasskeyCreateEducationScreen;

/* renamed from: X.4Kw  reason: invalid class name and case insensitive filesystem */
public final class C86424Kw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ PasskeyCreateEducationScreen this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86424Kw(PasskeyCreateEducationScreen passkeyCreateEducationScreen) {
        super(1);
        this.this$0 = passkeyCreateEducationScreen;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PasskeyCreateEducationScreen passkeyCreateEducationScreen;
        Runnable aVb;
        AnonymousClass00C.A0D(obj, 0);
        if (obj instanceof C182148oc) {
            passkeyCreateEducationScreen = this.this$0;
            aVb = new C81123wV((Object) passkeyCreateEducationScreen, 44);
        } else {
            if (obj instanceof C182138ob) {
                passkeyCreateEducationScreen = this.this$0;
                aVb = new AVb(passkeyCreateEducationScreen, obj, 4);
            }
            return AnonymousClass0AJ.A00;
        }
        passkeyCreateEducationScreen.runOnUiThread(aVb);
        return AnonymousClass0AJ.A00;
    }
}
