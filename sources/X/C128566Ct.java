package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6Ct  reason: invalid class name and case insensitive filesystem */
public final class C128566Ct {
    public final long A00;
    public final AnonymousClass3PG A01;
    public final C1275368r A02;
    public final Integer A03;
    public final WeakReference A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128566Ct) {
                C128566Ct r8 = (C128566Ct) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A04, C36351kA.A05(this.A01, C90464aC.A08(this.A00)))) + AnonymousClass000.A0H(this.A03);
    }

    public C128566Ct(AnonymousClass3PG r1, C1275368r r2, Integer num, WeakReference weakReference, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A04 = weakReference;
        this.A02 = r2;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiLoadingTask(emojiDescriptor=");
        A0u.append(this.A00);
        A0u.append(", emojiSequence=");
        A0u.append(this.A01);
        A0u.append(", emojiImageViewRef=");
        A0u.append(this.A04);
        A0u.append(", tag=");
        A0u.append(this.A02);
        A0u.append(", qplInstanceKey=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
