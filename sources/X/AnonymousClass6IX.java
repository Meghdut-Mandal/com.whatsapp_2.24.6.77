package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6IX  reason: invalid class name */
public abstract class AnonymousClass6IX {
    public static final Set A00 = C36421kH.A0g(new String[]{"audio", "image", "video", "ptv", "kyc-id", "sticker", "document", "ptt", "gif", "md-app-state", "md-msg-hist", "ppic", "newsletter-image", "newsletter-document", "newsletter-video", "newsletter-sticker", "newsletter-audio", "newsletter-ptt", "newsletter-gif", "newsletter-thumbnail-link", "thumbnail-video", "thumbnail-image", "thumbnail-document", "thumbnail-gif", "thumbnail-link"});

    static {
        C25471Gl r0 = C25471Gl.A0p;
    }

    public static HashSet A00(C203399nx r6, Set set) {
        if (r6 == null) {
            return null;
        }
        HashSet A16 = C36441kJ.A16();
        C203399nx[] r4 = r6.A02;
        if (r4 != null) {
            for (C203399nx r1 : r4) {
                if (set == null || set.contains(r1.A00)) {
                    A16.add(r1.A00);
                }
            }
        }
        return A16;
    }
}
