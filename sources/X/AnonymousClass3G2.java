package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;
import com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView;

/* renamed from: X.3G2  reason: invalid class name */
public final class AnonymousClass3G2 {
    public C57392yA A00;
    public C57492yK A01;

    public final C75613nW A00(DefaultRecipientsView defaultRecipientsView) {
        AnonymousClass00C.A0D(defaultRecipientsView, 0);
        C57492yK r1 = this.A01;
        if (r1 != null) {
            C28781Ua A0p = C36391kE.A0p(r1.A00.A01);
            C18800tq r0 = r1.A00.A01;
            return new C75613nW(C36431kI.A0Y(r0), C36341k9.A0S(r0), defaultRecipientsView, A0p);
        }
        throw C36331k8.A0d("defaultRecipientsControllerFactory");
    }

    public final C160657lN A01(ViewStub viewStub, C51292na r5) {
        boolean A1a = C36341k9.A1a(r5, viewStub);
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            View A0E = C36401kF.A0E(viewStub, R.layout.f9nameremoved);
            AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView");
            return A00((DefaultRecipientsView) A0E);
        } else if (ordinal == A1a) {
            viewStub.setLayoutResource(R.layout.f9nameremoved);
            if (this.A00 != null) {
                View inflate = viewStub.inflate();
                AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView");
                return new C75603nV((QuickShareRecipientsView) inflate);
            }
            throw C36331k8.A0d("quickShareRecipientsControllerFactory");
        } else {
            throw C36441kJ.A18();
        }
    }
}
