package X;

import java.util.Arrays;

/* renamed from: X.55j  reason: invalid class name and case insensitive filesystem */
public final class C1034455j extends C1256760v {
    public final AnonymousClass1H2 A00;
    public final AnonymousClass6CK A01;
    public final Integer A02;
    public final int[][] A03;
    public final int[][] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.grid.EmojiExpressionsViewItem.EmojiRow");
                C1034455j r5 = (C1034455j) obj;
                if (!AnonymousClass02P.A02(this.A03, r5.A03) || !AnonymousClass02P.A02(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass1H2 r0 = this.A00;
        return C36401kF.A02(this.A01, (C36351kA.A05(r0, ((Arrays.deepHashCode(this.A03) * 31) + Arrays.deepHashCode(this.A04)) * 31) + C90484aE.A0B(this.A02)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1034455j(AnonymousClass1H2 r2, AnonymousClass6CK r3, Integer num, int[][] iArr, int[][] iArr2) {
        super(r3);
        C36321k7.A0x(iArr, iArr2);
        AnonymousClass00C.A0D(r3, 5);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A00 = r2;
        this.A02 = num;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiRow(emojiRowItems=");
        C90514aH.A1T(A0u, this.A03);
        A0u.append(", emojiRowItemsWithSkinTone=");
        C90514aH.A1T(A0u, this.A04);
        A0u.append(", emojiLoader=");
        A0u.append(this.A00);
        A0u.append(", qplInstanceKey=");
        A0u.append(this.A02);
        A0u.append(", section=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
