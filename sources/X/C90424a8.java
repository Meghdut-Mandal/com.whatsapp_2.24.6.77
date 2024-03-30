package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;

/* renamed from: X.4a8  reason: invalid class name and case insensitive filesystem */
public class C90424a8 implements AnonymousClass4TM {
    public Object A00;
    public Object A01;
    public final int A02;

    public C90424a8(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void Bbg(C28981Uw r13) {
        Bitmap bitmap;
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(r13, 0);
            AnonymousClass3E8 r5 = (AnonymousClass3E8) this.A01;
            View view = (View) this.A00;
            AnonymousClass141 A08 = r5.A01.A08(r13);
            if (A08 != null) {
                bitmap = r5.A02.A07(view.getContext(), A08, 0.0f, C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved), false);
            } else {
                bitmap = null;
            }
            r5.A00.A0H(new AnonymousClass736(r5, bitmap, view, 19));
            return;
        }
        C62403Ga r3 = (C62403Ga) this.A01;
        C36411kG.A1F(r3.A01, r3, this.A00, 35);
    }

    public void onError(Throwable th) {
        C21854Abe abe;
        if (this.A02 == 0) {
            AnonymousClass00C.A0D(th, 0);
            C62403Ga r2 = (C62403Ga) this.A01;
            C81123wV.A00(r2.A01, r2, 11);
            if (!(th instanceof C21854Abe) || (abe = (C21854Abe) th) == null || abe.code != 404) {
                ((AnonymousClass4TP) this.A00).BWt(C023409w.A00);
                return;
            }
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) ((AnonymousClass4WX) ((AnonymousClass4TP) this.A00)).A01;
            C81123wV.A00(newsletterAcceptAdminInviteSheet.A1m(), newsletterAcceptAdminInviteSheet, 25);
        }
    }
}
