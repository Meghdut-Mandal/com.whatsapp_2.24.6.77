package X;

import android.content.Context;

/* renamed from: X.6wA  reason: invalid class name and case insensitive filesystem */
public class C146786wA implements C161307mX {
    public final AnonymousClass1XQ A00;
    public final AnonymousClass1H2 A01;

    public boolean B2L() {
        return true;
    }

    public AnonymousClass1XQ[] BBU() {
        return new AnonymousClass1XQ[]{this.A00};
    }

    public int BHQ() {
        return 0;
    }

    public boolean BoQ() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C146786wA) {
            return this.A00.equals(((C146786wA) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C146786wA(AnonymousClass1XQ r1, AnonymousClass1H2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C129196Ft B4v(Context context, C18820ts r5, boolean z) {
        C18740tg.A00();
        return new AnonymousClass5CX(context, this.A00, this.A01, z);
    }

    public String BIB() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiShapeCreator:");
        C36351kA.A1K(this.A00, A0u);
        return A0u.toString();
    }
}
