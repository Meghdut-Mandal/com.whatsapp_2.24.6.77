package X;

/* renamed from: X.8T6  reason: invalid class name */
public class AnonymousClass8T6 extends C200269h0 {
    public final Boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8T6)) {
                return false;
            }
            Boolean bool = this.A00;
            Boolean bool2 = ((AnonymousClass8T6) obj).A00;
            if (bool == null) {
                return bool2 == null;
            }
            if (!bool.equals(bool2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass8T6(CharSequence charSequence) {
        this.A00 = Boolean.valueOf(Boolean.parseBoolean(charSequence.toString()));
    }
}
