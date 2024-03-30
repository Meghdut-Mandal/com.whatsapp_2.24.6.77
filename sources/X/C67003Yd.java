package X;

import android.view.View;
import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;

/* renamed from: X.3Yd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67003Yd implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LinkedUsersActivity A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass011 A07;

    public /* synthetic */ C67003Yd(LinkedUsersActivity linkedUsersActivity, Integer num, String str, String str2, String str3, String str4, AnonymousClass011 r7, int i) {
        this.A01 = linkedUsersActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = r7;
        this.A02 = num;
        this.A00 = i;
        this.A06 = str4;
    }

    public final void onClick(View view) {
        int i;
        LinkedUsersActivity linkedUsersActivity = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        AnonymousClass011 r8 = this.A07;
        Integer num = this.A02;
        int i2 = this.A00;
        String str4 = this.A06;
        AnonymousClass3OD r3 = linkedUsersActivity.A02;
        if (r3 != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (str4 == null) {
                str4 = "";
            }
            r3.A0B.Bp1(new C80823w1(linkedUsersActivity, r3, str4, str3, str2, str, r8, i, i2));
            return;
        }
        throw C36331k8.A0d("wfsManager");
    }
}
