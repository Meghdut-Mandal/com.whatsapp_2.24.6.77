package X;

import android.view.View;

/* renamed from: X.1rZ  reason: invalid class name and case insensitive filesystem */
public class C39241rZ extends C011705b {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C39241rZ(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public void A0k(View view, C07650Ys r5) {
        super.A0k(view, r5);
        r5.A0G("Button");
        r5.A02.setSelected(false);
        r5.A0D(this.A01);
        String str = this.A00;
        if (str != null) {
            r5.A0A(new AnonymousClass0Yd(16, (CharSequence) str));
        }
    }
}
