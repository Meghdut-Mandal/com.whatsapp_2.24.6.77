package X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: X.3YO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YO implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3TW A00;
    public final /* synthetic */ C207109uZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3YO(AnonymousClass3TW r1, C207109uZ r2, String str, String str2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        AnonymousClass3TW r1 = this.A00;
        C207109uZ r0 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        AnonymousClass3TW.A02(r1);
        AnonymousClass2XH r2 = r1.A0F;
        C225314u r3 = r1.A04;
        AnonymousClass3XE r12 = r0.A07.A00;
        double doubleValue = r12.A02.doubleValue();
        double doubleValue2 = r12.A03.doubleValue();
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        r2.A08(r3, str2, str, doubleValue, doubleValue2);
    }
}
