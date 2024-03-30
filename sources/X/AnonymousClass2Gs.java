package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Gs  reason: invalid class name */
public final class AnonymousClass2Gs extends C48992iO {
    public final C220412q A00;
    public final C20350xQ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Gs(AnonymousClass171 r2, AnonymousClass27v r3, C18820ts r4, C220412q r5, C20350xQ r6, List list) {
        super(r2, r3, r4, list);
        C36331k8.A1G(r5, 1, r6);
        this.A01 = r6;
        this.A00 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A0J;
        AnonymousClass35K r0;
        ArrayList A0Q = this.A01.A0Q();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A0Q.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (!(A0f.A0H == null || (A0J = A0f.A0J()) == null || A0J.length() == 0 || (r0 = A0f.A0J) == null || r0.A00 != 0)) {
                AnonymousClass171 r2 = this.A00;
                AnonymousClass11F r1 = A0f.A0H;
                AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                AnonymousClass171.A04(r2, (AnonymousClass144) r1, 1, true);
                C36391kE.A1O(A0f, this.A03);
                A0I.add(A0f);
            }
        }
        Collections.sort(A0I, new AnonymousClass4W4(this.A00, this.A01, this, 1));
        return A0I;
    }
}
