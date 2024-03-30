package X;

import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public abstract class C54802ta {
    public static final void A00(C52382pL r1, XWA2NewsletterInput xWA2NewsletterInput) {
        String str;
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            str = "GUEST";
        } else if (ordinal == 2) {
            str = "ADMIN";
        } else if (ordinal == 3) {
            str = "OWNER";
        } else if (ordinal == 1) {
            str = "SUBSCRIBER";
        } else {
            return;
        }
        xWA2NewsletterInput.A07("view_role", str);
    }
}
