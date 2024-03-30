package X;

import java.util.List;

/* renamed from: X.3IT  reason: invalid class name */
public final class AnonymousClass3IT {
    public final String A00;
    public final List A01;

    public AnonymousClass3IT(String str, List list) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IT) {
                AnonymousClass3IT r5 = (AnonymousClass3IT) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36421kH.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SupportMessageFeedback(messageId=");
        A0u.append(this.A00);
        A0u.append(", feedbackKindList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
