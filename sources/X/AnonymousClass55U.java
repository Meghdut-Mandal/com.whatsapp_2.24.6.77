package X;

import java.util.Arrays;

/* renamed from: X.55U  reason: invalid class name */
public final class AnonymousClass55U extends C110655b1 {
    public final int A00;
    public final int[] A01;

    public AnonymousClass55U(int[] iArr, int i) {
        AnonymousClass00C.A0D(iArr, 1);
        this.A01 = iArr;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.EmojiExpressionsSideEffect.ShowSkinTonePopup");
                AnonymousClass55T r5 = (AnonymousClass55T) obj;
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
        A0u.append("ShowSkinToneTip(emoji=");
        A0u.append(Arrays.toString(this.A01));
        A0u.append(", position=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
