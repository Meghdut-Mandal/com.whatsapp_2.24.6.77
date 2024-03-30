package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Iterator;

/* renamed from: X.6da  reason: invalid class name and case insensitive filesystem */
public final class C135986da implements ViewTranslationCallback {
    public boolean onClearTranslation(View view) {
        AnonymousClass69I A00;
        AnonymousClass00S r0;
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = ((AndroidComposeView) view).A0c;
        androidComposeViewAccessibilityDelegateCompat.A0B = C023109s.A00;
        Iterator A0z = AnonymousClass000.A0z(AndroidComposeViewAccessibilityDelegateCompat.A0H(androidComposeViewAccessibilityDelegateCompat));
        while (A0z.hasNext()) {
            C1496172a r1 = ((C118355nk) A0z.next()).A01.A05;
            if (!(AnonymousClass5XP.A02(r1, C114205gq.A0B) == null || (A00 = AnonymousClass5XP.A00(r1, C114195gp.A00)) == null || (r0 = (AnonymousClass00S) A00.A01) == null)) {
                r0.invoke();
            }
        }
        return true;
    }

    public boolean onHideTranslation(View view) {
        AnonymousClass69I A00;
        C006302t r1;
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = ((AndroidComposeView) view).A0c;
        androidComposeViewAccessibilityDelegateCompat.A0B = C023109s.A00;
        Iterator A0z = AnonymousClass000.A0z(AndroidComposeViewAccessibilityDelegateCompat.A0H(androidComposeViewAccessibilityDelegateCompat));
        while (A0z.hasNext()) {
            C1496172a r12 = ((C118355nk) A0z.next()).A01.A05;
            if (!(!C36341k9.A1Z(AnonymousClass5XP.A02(r12, C114205gq.A0B)) || (A00 = AnonymousClass5XP.A00(r12, C114195gp.A0N)) == null || (r1 = (C006302t) A00.A01) == null)) {
                r1.invoke(C36381kD.A0j());
            }
        }
        return true;
    }

    public boolean onShowTranslation(View view) {
        AnonymousClass69I A00;
        C006302t r1;
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = ((AndroidComposeView) view).A0c;
        androidComposeViewAccessibilityDelegateCompat.A0B = C023109s.A01;
        Iterator A0z = AnonymousClass000.A0z(AndroidComposeViewAccessibilityDelegateCompat.A0H(androidComposeViewAccessibilityDelegateCompat));
        while (A0z.hasNext()) {
            C1496172a r2 = ((C118355nk) A0z.next()).A01.A05;
            if (!(!C36371kC.A1X(AnonymousClass5XP.A02(r2, C114205gq.A0B), false) || (A00 = AnonymousClass5XP.A00(r2, C114195gp.A0N)) == null || (r1 = (C006302t) A00.A01) == null)) {
                r1.invoke(C36371kC.A0m());
            }
        }
        return true;
    }
}
