package X;

import android.app.Activity;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1;

/* renamed from: X.7Jp  reason: invalid class name and case insensitive filesystem */
public final class C152207Jp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C100334uq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152207Jp(C100334uq r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C132676Uu r1 = this.this$0.A00;
        if (r1 == null) {
            throw C36331k8.A0d("selfieViewProvider");
        }
        C23114B5t b5t = r1.A02;
        if (b5t != null) {
            b5t.Bok();
        }
        Activity A00 = C132676Uu.A00(r1.A05, r1);
        if (r1.A06.A01) {
            C005502l r0 = C006702x.A00;
            C36331k8.A1T(new AESelfieViewProvider$increaseBrightness$1(A00, (C023509x) null), C009403z.A02(AnonymousClass03K.A00));
        }
        return AnonymousClass0AJ.A00;
    }
}
