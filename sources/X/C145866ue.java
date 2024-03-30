package X;

import com.whatsapp.jid.Jid;
import java.util.ListIterator;

/* renamed from: X.6ue  reason: invalid class name and case insensitive filesystem */
public class C145866ue implements C159487jR {
    public final AnonymousClass6QG A00;
    public final Jid A01;
    public final /* synthetic */ C145896uh A02;

    public C145866ue(AnonymousClass6QG r1, C145896uh r2, Jid jid) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = jid;
    }

    public void BWx(C1261662u r2, int i) {
        C159307j9 r0 = this.A02.A08;
        if (r0 != null) {
            r0.BSS(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C128836Du r5 = (C128836Du) obj;
        C145896uh r3 = this.A02;
        if (r3.A08 != null) {
            Jid jid = this.A01;
            if (jid != null) {
                String rawString = jid.getRawString();
                ListIterator listIterator = r5.A09.listIterator();
                while (listIterator.hasNext()) {
                    if (((C144416s9) listIterator.next()).A0F.equals(rawString)) {
                        listIterator.remove();
                    }
                }
            }
            C131836Qv.A01(this.A00, r5.A09);
            r3.A08.BST(r5);
        }
    }
}
