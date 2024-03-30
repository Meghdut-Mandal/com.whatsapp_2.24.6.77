package X;

import java.util.Arrays;

/* renamed from: X.55S  reason: invalid class name */
public final class AnonymousClass55S extends C110655b1 {
    public final int A00;
    public final int[] A01;

    public AnonymousClass55S(int[] iArr, int i) {
        AnonymousClass00C.A0D(iArr, 1);
        this.A01 = iArr;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.EmojiExpressionsSideEffect.ShowMultiSkinTonePopup");
                AnonymousClass55S r5 = (AnonymousClass55S) obj;
                if (!Arrays.equals(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowMultiSkinTonePopup(emoji=");
        A0u.append(Arrays.toString(this.A01));
        A0u.append(", position=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
