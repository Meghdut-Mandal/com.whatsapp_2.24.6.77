package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.2ro  reason: invalid class name and case insensitive filesystem */
public abstract class C53742ro {
    public static void A00(Activity activity, AnonymousClass17Y r4, C20810yC r5, C32661dz r6, int i, int i2) {
        if (r5.A0E(913)) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(activity.getPackageName(), "com.whatsapp.contact.contactform.ContactFormActivity");
            activity.startActivityForResult(A0D, i);
            r6.A03(true, i2);
            return;
        }
        Intent A0I = C36441kJ.A0I("android.intent.action.INSERT");
        A0I.setType("vnd.android.cursor.dir/contact");
        try {
            activity.startActivityForResult(A0I, i);
            r6.A03(true, i2);
        } catch (ActivityNotFoundException unused) {
            r4.A06(R.string.f12nameremoved, 0);
        }
    }
}
