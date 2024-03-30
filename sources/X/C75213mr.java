package X;

import android.graphics.BitmapFactory;

/* renamed from: X.3mr  reason: invalid class name and case insensitive filesystem */
public class C75213mr implements AnonymousClass4TC {
    public final /* synthetic */ AnonymousClass026 A00;
    public final /* synthetic */ C40041ue A01;

    public C75213mr(AnonymousClass026 r1, C40041ue r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BYj(AnonymousClass147 r3, String str, String str2, String str3, byte[] bArr) {
        if (bArr != null) {
            this.A00.accept(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        }
    }

    public void onError(int i) {
        C36321k7.A1U("JoinGroupViewModel/failed-to-get-group-photo/", AnonymousClass000.A0u(), i);
    }
}
