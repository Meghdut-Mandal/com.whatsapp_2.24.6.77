package X;

import java.util.Arrays;

/* renamed from: X.68q  reason: invalid class name and case insensitive filesystem */
public final class C1275268q {
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1275268q)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C1275268q) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C1275268q(int[] iArr) {
        this.A00 = iArr;
        C18740tg.A0B(C90504aG.A1U(iArr.length, 5));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiIdList(ids=");
        return C36321k7.A0E(Arrays.toString(this.A00), A0u);
    }
}
