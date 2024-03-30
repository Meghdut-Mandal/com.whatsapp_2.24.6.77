package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3LD  reason: invalid class name */
public abstract class AnonymousClass3LD {
    public void A00() {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            if (2 - r1.A01 == 0) {
                Log.i("companion/registration/link code expired");
                Activity activity = (Activity) r1.A00;
                activity.runOnUiThread(C80213v2.A00(activity, 20));
            }
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            if (1 - r1.A01 == 0) {
                ((CompanionRegistrationViewModel) r1.A00).A03.A0C(new AnonymousClass2FU(true));
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            switch (r1.A01) {
                case 1:
                    ((CompanionRegistrationViewModel) r1.A00).A05.A0C(AnonymousClass0AJ.A00);
                    return;
                case 2:
                    Activity activity = (Activity) r1.A00;
                    activity.runOnUiThread(C80213v2.A00(activity, 21));
                    return;
                default:
                    return;
            }
        }
    }

    public void A03() {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            switch (r1.A01) {
                case 1:
                    ((CompanionRegistrationViewModel) r1.A00).A06.A0C(AnonymousClass0AJ.A00);
                    return;
                case 2:
                    Context context = (Context) r1.A00;
                    Intent A0D = C36431kI.A0D();
                    A0D.setClassName(context.getPackageName(), "com.whatsapp.companionmode.registration.CompanionBootstrapActivity");
                    A0D.addFlags(268468224);
                    context.startActivity(A0D);
                    return;
                default:
                    return;
            }
        }
    }

    public void A04(String str) {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            if (2 - r1.A01 == 0) {
                AnonymousClass00C.A0D(str, 0);
                Activity activity = (Activity) r1.A00;
                activity.runOnUiThread(new AnonymousClass751(38, str, activity));
            }
        }
    }

    public void A05(String str) {
        if (this instanceof AnonymousClass4W1) {
            AnonymousClass4W1 r1 = (AnonymousClass4W1) this;
            if (1 - r1.A01 == 0) {
                AnonymousClass00C.A0D(str, 0);
                ((CompanionRegistrationViewModel) r1.A00).A03.A0C(new AnonymousClass2FV(str));
            }
        }
    }
}
