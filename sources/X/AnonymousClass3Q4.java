package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3Q4  reason: invalid class name */
public final class AnonymousClass3Q4 {
    public final Bitmap A00;
    public final UserJid A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q4) {
                AnonymousClass3Q4 r5 = (AnonymousClass3Q4) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A02) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass3Q4(Bitmap bitmap, UserJid userJid, List list) {
        this.A02 = list;
        this.A00 = bitmap;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State(matchingBotCommands=");
        A0u.append(this.A02);
        A0u.append(", profilePhoto=");
        A0u.append(this.A00);
        A0u.append(", userJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public AnonymousClass3Q4() {
        this((Bitmap) null, (UserJid) null, (List) null);
    }
}
