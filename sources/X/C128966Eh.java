package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.6Eh  reason: invalid class name and case insensitive filesystem */
public final class C128966Eh {
    public Drawable A00 = null;
    public final long A01;
    public final AnonymousClass3PG A02;
    public final C1275368r A03;
    public final WeakReference A04;
    public final Integer A05;

    public C128966Eh(AnonymousClass3PG r3, C1275368r r4, Integer num, WeakReference weakReference, long j) {
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = j;
        this.A02 = r3;
        this.A04 = weakReference;
        this.A03 = r4;
        this.A05 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128966Eh) {
                C128966Eh r8 = (C128966Eh) obj;
                if (this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A03, C36351kA.A05(this.A04, C36351kA.A05(this.A02, C90464aC.A08(this.A01)))) + AnonymousClass000.A0H(this.A05)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InternalEmojiTarget(emojiDescriptor=");
        A0u.append(this.A01);
        A0u.append(", emojiSequence=");
        A0u.append(this.A02);
        A0u.append(", emojiImageViewRef=");
        A0u.append(this.A04);
        A0u.append(", tag=");
        A0u.append(this.A03);
        A0u.append(", qplInstanceKey=");
        A0u.append(this.A05);
        A0u.append(", icon=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
