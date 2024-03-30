package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.9fI  reason: invalid class name and case insensitive filesystem */
public class C199429fI {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199429fI r5 = (C199429fI) obj;
            if (this.A02 != r5.A02 || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = this.A00;
            String str2 = r5.A00;
            return str != null ? str.equals(str2) : str2 == null;
        }
    }

    public C199429fI(String str, List list, boolean z) {
        this.A01 = C36441kJ.A15(list);
        this.A00 = str;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CaptionsState{availableTextLanguages=");
        A0u.append(this.A01);
        A0u.append(", selectedTextLanguage='");
        A0u.append(this.A00);
        A0u.append('\'');
        A0u.append(", isEnabled=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }

    public C199429fI() {
        this((String) null, Collections.emptyList(), false);
    }
}
