package X;

import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6W5  reason: invalid class name */
public final class AnonymousClass6W5 {
    public final C19630wG A00;

    public AnonymousClass6W5(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final String A01(C125415zs r3, C111385cC r4) {
        String str;
        if (r4 instanceof AnonymousClass5IL) {
            str = ((AnonymousClass5IL) r4).A00;
        } else if (r4 instanceof AnonymousClass5IM) {
            str = ((AnonymousClass5IM) r4).A00.A06;
            if (str == null) {
                str = "sticker-without-stable-id";
            }
        } else if (r4 instanceof AnonymousClass5IN) {
            str = ((AnonymousClass5IN) r4).A01;
        } else {
            throw C36441kJ.A18();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("avatar-sticker-");
        A0u.append(r3);
        return C90464aC.A0f(str, A0u, '-');
    }

    public static final String A02(C125415zs r3, C135066c4 r4) {
        String str = r4.A06;
        if (str == null) {
            str = "sticker-without-stable-id";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("avatar-sticker-");
        A0u.append(r3);
        return C90464aC.A0f(str, A0u, '-');
    }

    public static final C13540k2 A03(C125415zs r6, String str, List list) {
        C13540k2 r5 = new C13540k2();
        if (C36401kF.A1a(list)) {
            AnonymousClass565 r4 = new AnonymousClass565(r6, r6.toString());
            r5.add(new C1035555x((C125385zp) r4, (Integer) null, str, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C135066c4 A0U = C90504aG.A0U(it);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("sticker-");
                A0u.append(r6);
                A0u.append('-');
                r5.add(new C1035355v(r4, A0U, AnonymousClass000.A0q(A0U.A06, A0u)));
            }
        }
        return AnonymousClass03S.A00(r5);
    }

    public final String A04(C125415zs r3) {
        C19630wG r1;
        int i;
        if (r3.equals(AnonymousClass5IF.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5IC.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5IE.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5I9.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5IA.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5ID.A00) || r3.equals(AnonymousClass5I6.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5I8.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5IB.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3.equals(AnonymousClass5I7.A00)) {
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else {
            throw C36441kJ.A18();
        }
        return C36371kC.A0v(r1, i);
    }

    public static final String A00(C125415zs r2, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("loading-avatar-sticker-");
        A0u.append(r2);
        A0u.append('-');
        return C36381kD.A10(A0u, i);
    }
}
