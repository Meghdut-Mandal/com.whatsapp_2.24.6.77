package X;

import java.time.OffsetDateTime;

/* renamed from: X.8T9  reason: invalid class name */
public class AnonymousClass8T9 extends C200269h0 {
    public final OffsetDateTime A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass8T9) && !(obj instanceof AnonymousClass8T8)) {
            return false;
        }
        return this.A00.compareTo(((C200269h0) obj).A04().A00) == 0;
    }

    public AnonymousClass8T8 A05() {
        return new AnonymousClass8T8(this.A00.toString(), false);
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass8T9(CharSequence charSequence) {
        this.A00 = OffsetDateTime.parse(charSequence);
    }

    public OffsetDateTime A07() {
        return this.A00;
    }
}
