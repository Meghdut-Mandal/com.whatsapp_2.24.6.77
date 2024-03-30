package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;

/* renamed from: X.1pV  reason: invalid class name and case insensitive filesystem */
public abstract class C38681pV extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static void A00(C19460v5 r0, C18800tq r1, C18830tt r2, C27861Qc r3, ContactDetailsCard contactDetailsCard) {
        contactDetailsCard.A0B = r0;
        contactDetailsCard.A0L = (C229516p) r1.A29.get();
        contactDetailsCard.A0S = (C24631De) r1.A6J.get();
        contactDetailsCard.A0U = (AnonymousClass3EV) r2.A3A.get();
        contactDetailsCard.A0E = (AnonymousClass3C6) r3.A0L.A2U.get();
    }

    public void A02() {
        if (this instanceof NewsletterDetailsCard) {
            NewsletterDetailsCard newsletterDetailsCard = (NewsletterDetailsCard) this;
            if (!newsletterDetailsCard.A03) {
                newsletterDetailsCard.A03 = true;
                C27861Qc r4 = (C27861Qc) ((C27851Qb) newsletterDetailsCard.generatedComponent());
                C18800tq r3 = r4.A0M;
                newsletterDetailsCard.A0P = C36341k9.A0V(r3);
                newsletterDetailsCard.A0D = C36391kE.A0V(r3);
                C18830tt r2 = r3.A00;
                newsletterDetailsCard.A0Z = C36351kA.A0p(r2);
                newsletterDetailsCard.A0F = C36351kA.A0N(r3);
                newsletterDetailsCard.A0b = C36341k9.A0Z(r3);
                newsletterDetailsCard.A0Q = C36351kA.A0g(r3);
                newsletterDetailsCard.A0J = C36391kE.A0Y(r3);
                newsletterDetailsCard.A0C = C36351kA.A0J(r3);
                newsletterDetailsCard.A0V = C36431kI.A0p(r3);
                newsletterDetailsCard.A0M = C36341k9.A0S(r3);
                newsletterDetailsCard.A0a = C36351kA.A0q(r3);
                newsletterDetailsCard.A0N = C36341k9.A0T(r3);
                newsletterDetailsCard.A0K = C36391kE.A0Z(r3);
                A00(C36381kD.A0Q(r3.A0y), r3, r2, r4, newsletterDetailsCard);
                newsletterDetailsCard.A0H = C36361kB.A0S(r3);
                newsletterDetailsCard.A0Y = (C64873Pt) r2.A9Y.get();
                newsletterDetailsCard.A01 = C36351kA.A0a(r3);
                newsletterDetailsCard.A02 = (AnonymousClass3G3) r2.A2w.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ContactDetailsCard contactDetailsCard = (ContactDetailsCard) this;
            C27861Qc r42 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r32 = r42.A0M;
            contactDetailsCard.A0P = C36341k9.A0V(r32);
            contactDetailsCard.A0D = C36391kE.A0V(r32);
            C18830tt r22 = r32.A00;
            contactDetailsCard.A0Z = C36351kA.A0p(r22);
            contactDetailsCard.A0F = C36351kA.A0N(r32);
            contactDetailsCard.A0b = C36341k9.A0Z(r32);
            contactDetailsCard.A0Q = C36351kA.A0g(r32);
            contactDetailsCard.A0J = C36391kE.A0Y(r32);
            contactDetailsCard.A0C = C36351kA.A0J(r32);
            contactDetailsCard.A0V = C36431kI.A0p(r32);
            contactDetailsCard.A0M = C36341k9.A0S(r32);
            contactDetailsCard.A0a = C36351kA.A0q(r32);
            contactDetailsCard.A0N = C36341k9.A0T(r32);
            contactDetailsCard.A0K = C36391kE.A0Z(r32);
            A00(C36381kD.A0Q(r32.A0y), r32, r22, r42, contactDetailsCard);
            contactDetailsCard.A0H = C36361kB.A0S(r32);
            contactDetailsCard.A0Y = (C64873Pt) r22.A9Y.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38681pV(Context context) {
        super(context);
        A02();
    }

    public C38681pV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public C38681pV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }
}
