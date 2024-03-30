package com.whatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass098;
import X.AnonymousClass2PI;
import X.AnonymousClass6XP;
import X.AnonymousClass7KW;
import X.AnonymousClass7SQ;
import X.C116995lX;
import X.C12560iI;
import X.C1503474x;
import X.C165167sz;
import X.C18740tg;
import X.C224914p;
import X.C27631Pa;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C830848a;
import X.C830948b;
import X.C84854Ev;
import X.C90474aD;
import X.C90504aG;
import X.C90524aI;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.HashSet;
import java.util.Iterator;

public class CallRatingActivity extends C224914p {
    public final AnonymousClass00T A00 = C36431kI.A1I(new AnonymousClass7KW(this));
    public final AnonymousClass00T A01 = new C12560iI(new C830948b(this), new C830848a(this), new C84854Ev(this), C36441kJ.A1A(CallRatingViewModel.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0H = C36371kC.A0H(this);
        if (A0H == null || !C90524aI.A0L(this.A01).A0S(A0H)) {
            finish();
        }
        ((DialogFragment) this.A00.getValue()).A1f(getSupportFragmentManager(), "CallRatingBottomSheet");
        C165167sz.A00(this, C90524aI.A0L(this.A01).A08, new AnonymousClass7SQ(this), 44);
    }

    public void onStop() {
        String str;
        String str2;
        super.onStop();
        if (!isChangingConfigurations()) {
            CallRatingViewModel A0L = C90524aI.A0L(this.A01);
            WamCall wamCall = A0L.A04;
            if (wamCall != null) {
                HashSet hashSet = A0L.A0E;
                boolean z = true;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int A0A = C36341k9.A0A(it);
                        C116995lX r2 = A0L.A0B;
                        C18740tg.A0E(C90504aG.A1U(A0A, 51), "MAX_PERMISSIBLE_INDEX to set is 51");
                        r2.A00 |= 1 << A0A;
                    }
                    WamCall wamCall2 = A0L.A04;
                    if (wamCall2 != null) {
                        wamCall2.userProblems = Long.valueOf(A0L.A0B.A00);
                    }
                }
                String str3 = A0L.A06;
                if (str3 == null || !(!AnonymousClass098.A06(str3))) {
                    z = false;
                }
                String str4 = null;
                if (z) {
                    str = A0L.A06;
                } else {
                    str = null;
                }
                wamCall.userDescription = str;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CallRatingViewModel/userRating: ");
                A0u.append(wamCall.userRating);
                A0u.append(", userDescription: ");
                A0u.append(wamCall.userDescription);
                A0u.append(", userProblem binary: ");
                Long l = wamCall.userProblems;
                if (l != null) {
                    str4 = Long.toBinaryString(l.longValue());
                }
                A0u.append(str4);
                A0u.append(", timeSeriesDir: ");
                C36321k7.A1a(A0u, A0L.A05);
                A0L.A01.A01(wamCall, A0L.A07);
                C27631Pa r1 = A0L.A00;
                WamCall wamCall3 = A0L.A04;
                if (wamCall3 != null) {
                    str2 = wamCall3.callRandomId;
                } else {
                    str2 = null;
                }
                C36341k9.A0x(C90474aD.A0F(r1), "call_rating_last_call", str2);
                String str5 = A0L.A05;
                if (str5 != null) {
                    AnonymousClass6XP r10 = A0L.A02;
                    r10.A04.Boy(new C1503474x((Object) wamCall, (Object) r10, (Object) C90524aI.A0S(str5), (Object) new AnonymousClass2PI(), 22));
                }
            }
            finish();
        }
    }
}
