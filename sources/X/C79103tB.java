package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.3tB  reason: invalid class name and case insensitive filesystem */
public final class C79103tB implements C160197kc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InteropComposeEnterInfoActivity A01;
    public final /* synthetic */ WDSTextLayout A02;

    public void BZt() {
    }

    public void Bj4() {
    }

    public void Bj5(Bitmap bitmap) {
        Drawable r0;
        AnonymousClass00C.A0D(bitmap, 0);
        WDSTextLayout wDSTextLayout = this.A02;
        InteropComposeEnterInfoActivity interopComposeEnterInfoActivity = this.A01;
        C27751Pr r5 = interopComposeEnterInfoActivity.A0A;
        if (r5 != null) {
            Resources resources = interopComposeEnterInfoActivity.getResources();
            Drawable A07 = AnonymousClass3UF.A07(interopComposeEnterInfoActivity.getResources(), C36421kH.A0C(interopComposeEnterInfoActivity, bitmap), this.A00);
            C68533c3 r2 = C68533c3.A00;
            if (r5.A00.A0E(1257)) {
                r0 = new C91274bk(resources, A07, (AnonymousClass7fA) r2);
            } else {
                r0 = new C91284bl(resources, A07, (AnonymousClass7fA) r2);
            }
            wDSTextLayout.setHeaderImage(r0);
            return;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public C79103tB(InteropComposeEnterInfoActivity interopComposeEnterInfoActivity, WDSTextLayout wDSTextLayout, int i) {
        this.A02 = wDSTextLayout;
        this.A01 = interopComposeEnterInfoActivity;
        this.A00 = i;
    }
}
