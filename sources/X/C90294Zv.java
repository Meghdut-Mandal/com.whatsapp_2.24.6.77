package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.ArrayList;

/* renamed from: X.4Zv  reason: invalid class name and case insensitive filesystem */
public class C90294Zv implements AnonymousClass4TG {
    public Object A00;
    public final int A01;

    public C90294Zv(AnonymousClass3SE r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BWQ() {
        if (this.A01 != 0) {
            ((AnonymousClass3SE) this.A00).A01();
            return;
        }
        AnonymousClass3SE r1 = (AnonymousClass3SE) this.A00;
        if (r1.A00 != null) {
            r1.A03((String) null);
        }
    }

    public void Bfz(C61063Ak r17) {
        int i;
        int i2 = this.A01;
        AnonymousClass3SE r3 = (AnonymousClass3SE) this.A00;
        ContactUsActivity contactUsActivity = r3.A00;
        if (i2 != 0) {
            if (contactUsActivity != null) {
                i = 2;
            } else {
                return;
            }
        } else if (contactUsActivity != null) {
            i = 1;
        } else {
            return;
        }
        C18740tg.A06(contactUsActivity);
        C61063Ak r2 = r17;
        int i3 = r2.A00;
        ArrayList A14 = C36441kJ.A14(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            A14.add(new C66733Xc((C206889uA) null, C36421kH.A0e(r2.A04, i4), C36421kH.A0e(r2.A06, i4), C36421kH.A0e(r2.A03, i4), C36421kH.A0e(r2.A07, i4), (ArrayList) null, false));
        }
        int i5 = 2;
        if (i == 2) {
            i5 = 1;
        }
        if ("biz-directory-browsing".equals(contactUsActivity.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from"))) {
            r3.A01();
            return;
        }
        ContactUsActivity contactUsActivity2 = r3.A00;
        String str = r2.A01;
        Intent A0T = AnonymousClass190.A0T(contactUsActivity2, (Bundle) null, ContactUsActivity.A01(contactUsActivity2, A14), 2, i5);
        A0T.putExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", i);
        A0T.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info", str);
        contactUsActivity2.startActivityForResult(A0T, 11);
    }
}
