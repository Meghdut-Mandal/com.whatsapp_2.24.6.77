package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.3mP  reason: invalid class name and case insensitive filesystem */
public class C74933mP implements AnonymousClass4U2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4TB A01;
    public final /* synthetic */ C47252eB A02;
    public final /* synthetic */ String A03;

    public void B1h() {
    }

    public /* synthetic */ void BXH() {
    }

    public C74933mP(Context context, AnonymousClass4TB r2, C47252eB r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    public void Bi2(Bitmap bitmap, boolean z) {
        C47252eB r2 = this.A02;
        List list = AnonymousClass0D3.A0I;
        C38621pP r3 = r2.A05;
        if (r3.getTag() == this.A01 && bitmap != C56382wC.A00) {
            r2.A01 = true;
            r3.A00(C36421kH.A0C(this.A00, bitmap), (Drawable) null, this.A03);
        }
    }
}
