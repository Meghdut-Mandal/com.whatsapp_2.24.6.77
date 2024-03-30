package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.2ZP  reason: invalid class name */
public class AnonymousClass2ZP extends C19590wC {
    public void A00() {
        Log.i("voicenote/voicenotestopped");
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            AnonymousClass3L3 r1 = (AnonymousClass3L3) A0s.next();
            if (r1 instanceof C50382kf) {
                C70803fk r12 = ((C50382kf) r1).A00;
                r12.A2l.invalidateOptionsMenu();
                AnonymousClass2HP r0 = (AnonymousClass2HP) r12.A2Z.A00.A00(AnonymousClass2HP.class);
                if (r0 != null) {
                    r0.A0B = false;
                }
            }
        }
    }
}
