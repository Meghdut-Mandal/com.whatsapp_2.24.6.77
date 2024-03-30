package X;

import java.util.Arrays;

/* renamed from: X.550  reason: invalid class name */
public final class AnonymousClass550 extends C110605aw {
    public final int[] A00;

    public AnonymousClass550(int[] iArr) {
        AnonymousClass00C.A0D(iArr, 1);
        this.A00 = iArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.ExpressionsSideEffects.EmojiSelected");
                if (!Arrays.equals(this.A00, ((AnonymousClass550) obj).A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiSelected(emoji=");
        return C36321k7.A0E(Arrays.toString(this.A00), A0u);
    }
}
