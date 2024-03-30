package X;

import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3oy  reason: invalid class name and case insensitive filesystem */
public final class C76503oy implements C236119d {
    public final AnonymousClass4U5 A00;

    public void BWw(C203399nx r3, String str) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00.onError(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r11, String str) {
        C203399nx A0c;
        C203399nx A0c2;
        List A0j;
        AnonymousClass00C.A0D(r11, 1);
        if (r11.A0X(AnonymousClass147.class, "from") == null || (A0c = r11.A0c("links")) == null || (A0c2 = A0c.A0c("link")) == null || (A0j = A0c2.A0j("group")) == null || A0j.isEmpty()) {
            this.A00.onError(-1);
            return;
        }
        HashSet A16 = C36441kJ.A16();
        HashSet A162 = C36441kJ.A16();
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            Jid A0X = A0s.A0X(GroupJid.class, "jid");
            if (A0X != null) {
                A16.add(C36341k9.A0I(A0X, A0s.A0S("error", -1)));
                List A0j2 = A0s.A0j("participant");
                AnonymousClass00C.A08(A0j2);
                Iterator it2 = A0j2.iterator();
                while (it2.hasNext()) {
                    C203399nx A0s2 = C36431kI.A0s(it2);
                    Jid A0X2 = A0s2.A0X(UserJid.class, "jid");
                    if (A0X2 != null) {
                        A162.add(C36341k9.A0I(A0X2, A0s2.A0S("error", -1)));
                    }
                }
            }
        }
        AnonymousClass4U5 r4 = this.A00;
        C46242Vq r1 = new C46242Vq(A16, A162);
        C54232sc r42 = (C54232sc) r4;
        if (r42.A01 != 0) {
            Set set = r1.A00;
            ArrayList<Pair> A0I = AnonymousClass001.A0I();
            for (Object next : set) {
                Number number = (Number) ((Pair) next).second;
                if (number != null && -1 == number.intValue()) {
                    A0I.add(next);
                }
            }
            ArrayList<Object> A0I2 = AnonymousClass001.A0I();
            for (Pair pair : A0I) {
                Object obj = pair.first;
                if (obj != null) {
                    A0I2.add(obj);
                }
            }
            AnonymousClass3OG r3 = (AnonymousClass3OG) r42.A00;
            for (Object remove : A0I2) {
                r3.A0E.remove(remove);
            }
            AnonymousClass3OG.A00(r3, r3.A0F.decrementAndGet());
            return;
        }
        Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/response");
        ((C023509x) r42.A00).resumeWith(r1);
    }

    public void BVN(String str) {
        C54232sc r1 = (C54232sc) this.A00;
        if (r1.A01 != 0) {
            AnonymousClass3OG r12 = (AnonymousClass3OG) r1.A00;
            AnonymousClass3OG.A00(r12, r12.A0F.decrementAndGet());
            return;
        }
        Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/timeout");
        ((C023509x) r1.A00).resumeWith(new C46212Vn(-2));
    }

    public C76503oy(AnonymousClass4U5 r1) {
        this.A00 = r1;
    }
}
