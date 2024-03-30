package X;

import java.util.Arrays;

/* renamed from: X.55V  reason: invalid class name */
public final class AnonymousClass55V extends C110655b1 {
    public final int A00;
    public final int[] A01;

    public AnonymousClass55V(int[] iArr, int i) {
        AnonymousClass00C.A0D(iArr, 2);
        this.A00 = i;
        this.A01 = iArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.EmojiExpressionsSideEffect.UpdateEmojiSkinTone");
                AnonymousClass55V r5 = (AnonymousClass55V) obj;
                if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UpdateEmojiSkinTone(position=");
        A0u.append(this.A00);
        A0u.append(", emoji=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
