package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2i2  reason: invalid class name */
public class AnonymousClass2i2 extends C33541fX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69273dG A01;
    public final /* synthetic */ String A02;

    public AnonymousClass2i2(C69273dG r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public void A02(View view) {
        C69273dG r1 = this.A01;
        if ((!C69273dG.A08(r1) || !r1.A0T.A05()) && !C69273dG.A09(r1)) {
            ContactInfoActivity contactInfoActivity = r1.A0k;
            int i = this.A00;
            String str = this.A02;
            UserJid A0A = r1.A0A();
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(contactInfoActivity.getPackageName(), "com.whatsapp.businessupsell.BusinessProfileEducation");
            A0D.putExtra("key_extra_verified_level", i);
            A0D.putExtra("key_extra_business_name", str);
            A0D.putExtra("key_extra_business_jid", A0A.getRawString());
            contactInfoActivity.startActivity(A0D);
            return;
        }
        C36441kJ.A0f(r1.A0T).Bu9(r1.A0k, true);
    }
}
