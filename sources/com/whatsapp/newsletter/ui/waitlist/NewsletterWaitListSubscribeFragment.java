package com.whatsapp.newsletter.ui.waitlist;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass2PK;
import X.AnonymousClass3UJ;
import X.AnonymousClass3US;
import X.AnonymousClass3Y4;
import X.AnonymousClass3ZU;
import X.AnonymousClass4OS;
import X.C03570Gk;
import X.C19420v0;
import X.C19550w8;
import X.C21060yb;
import X.C224514j;
import X.C25271Fq;
import X.C32241dD;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C81123wV;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;

public final class NewsletterWaitListSubscribeFragment extends Hilt_NewsletterWaitListSubscribeFragment {
    public C19420v0 A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        View findViewById = view.findViewById(R.id.notify_me_button);
        View findViewById2 = view.findViewById(R.id.dismiss_button);
        C19420v0 r0 = this.A00;
        if (r0 != null) {
            if (C36371kC.A1U(C36341k9.A0E(r0), "newsletter_wait_list_subscription")) {
                C36391kE.A0P(view, R.id.wait_list_subscription_subtitle).setText(R.string.f12nameremoved);
                AnonymousClass00C.A0B(findViewById);
                findViewById.setVisibility(8);
            }
            AnonymousClass3Y4.A00(findViewById, this, 43);
            AnonymousClass3Y4.A00(findViewById2, this, 44);
            return;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public static final void A03(NewsletterWaitListSubscribeFragment newsletterWaitListSubscribeFragment) {
        AnonymousClass4OS r5;
        String className;
        AnonymousClass01I A0h = newsletterWaitListSubscribeFragment.A0h();
        if ((A0h instanceof AnonymousClass4OS) && (r5 = (AnonymousClass4OS) A0h) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r5;
            C25271Fq r0 = newsletterWaitListActivity.A00;
            if (r0 == null) {
                throw C36331k8.A0d("waNotificationManager");
            } else if (r0.A00.A01()) {
                C32241dD r1 = newsletterWaitListActivity.A01;
                if (r1 != null) {
                    r1.A05(2);
                    C36331k8.A0w(C19420v0.A00(newsletterWaitListActivity.A09), "newsletter_wait_list_subscription", true);
                    ComponentName callingActivity = newsletterWaitListActivity.getCallingActivity();
                    if (callingActivity != null && (className = callingActivity.getClassName()) != null && className.equals("com.whatsapp.Conversation")) {
                        C36331k8.A0m(newsletterWaitListActivity);
                    } else if (newsletterWaitListActivity.A06.A02 != AnonymousClass01P.DESTROYED) {
                        View view = newsletterWaitListActivity.A00;
                        AnonymousClass00C.A08(view);
                        String A0m = C36361kB.A0m(newsletterWaitListActivity, R.string.f12nameremoved);
                        List emptyList = Collections.emptyList();
                        AnonymousClass00C.A08(emptyList);
                        C21060yb r6 = newsletterWaitListActivity.A08;
                        AnonymousClass00C.A07(r6);
                        AnonymousClass3ZU r3 = new AnonymousClass3ZU(view, (AnonymousClass012) newsletterWaitListActivity, r6, A0m, emptyList, 2000, false);
                        r3.A04(new AnonymousClass3Y4(newsletterWaitListActivity, 42), R.string.f12nameremoved);
                        r3.A03(C224514j.A00(newsletterWaitListActivity.A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                        r3.A05(new C81123wV((Object) newsletterWaitListActivity, 33));
                        r3.A02();
                        newsletterWaitListActivity.A02 = r3;
                    }
                } else {
                    throw C36331k8.A0d("newsletterLogging");
                }
            } else if (C19550w8.A09() && !newsletterWaitListActivity.A09.A2U("android.permission.POST_NOTIFICATIONS")) {
                C19420v0 r2 = newsletterWaitListActivity.A09;
                AnonymousClass00C.A07(r2);
                String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
                AnonymousClass3US.A08(r2, strArr);
                C03570Gk.A0C(newsletterWaitListActivity, strArr, 0);
            } else if (C19550w8.A03()) {
                AnonymousClass3UJ.A07(newsletterWaitListActivity);
            } else {
                AnonymousClass3UJ.A06(newsletterWaitListActivity);
            }
        }
        super.A1b();
    }

    public void A1b() {
        AnonymousClass4OS r4;
        super.A1b();
        AnonymousClass01I A0h = A0h();
        if ((A0h instanceof AnonymousClass4OS) && (r4 = (AnonymousClass4OS) A0h) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r4;
            C32241dD r3 = newsletterWaitListActivity.A01;
            if (r3 != null) {
                boolean A1U = C36371kC.A1U(C36331k8.A06(newsletterWaitListActivity), "newsletter_wait_list_subscription");
                if (C32241dD.A04(r3)) {
                    AnonymousClass2PK r1 = new AnonymousClass2PK();
                    r1.A01 = C36371kC.A0n();
                    r1.A00 = Boolean.valueOf(A1U);
                    r3.A03.Bly(r1);
                }
                newsletterWaitListActivity.finish();
                return;
            }
            throw C36331k8.A0d("newsletterLogging");
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1b();
    }
}
