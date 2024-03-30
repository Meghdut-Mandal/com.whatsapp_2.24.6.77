package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.6wB  reason: invalid class name and case insensitive filesystem */
public class C146796wB implements C161307mX {
    public final C135066c4 A00;
    public final AnonymousClass1HA A01;

    public boolean B2L() {
        return true;
    }

    public boolean BoQ() {
        return true;
    }

    public AnonymousClass1XQ[] BBU() {
        AnonymousClass1XQ[] r0;
        AnonymousClass3S2 r02 = this.A00.A04;
        if (r02 == null || (r0 = r02.A0D) == null) {
            return C161307mX.A00;
        }
        return r0;
    }

    public int BHQ() {
        return C36371kC.A00(this.A00.A0L ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C146796wB)) {
            return false;
        }
        String str = ((C146796wB) obj).A00.A0E;
        C18740tg.A06(str);
        return str.equals(this.A00.A0E);
    }

    public int hashCode() {
        String str = this.A00.A0E;
        C18740tg.A06(str);
        return str.hashCode();
    }

    public C146796wB(C135066c4 r1, AnonymousClass1HA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C129196Ft B4v(Context context, C18820ts r6, boolean z) {
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        C18740tg.A00();
        return new AnonymousClass5CZ(context, this.A00, this.A01, C36361kB.A02(context, i));
    }

    public String BIB() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerShapeCreator:");
        String str = this.A00.A0E;
        C18740tg.A06(str);
        return AnonymousClass000.A0q(str, A0u);
    }
}
