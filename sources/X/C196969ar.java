package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.9ar  reason: invalid class name and case insensitive filesystem */
public abstract class C196969ar {
    public static final C20070wy A00;
    public static final C20070wy A01;

    static {
        C20090x0 r2 = new C20090x0();
        r2.put("deleteChat", Arrays.asList(new String[]{"pin_v1", "mute", "clearChat", "deleteChat", "archive", "star", "markChatAsRead", "deleteMessageForMe"}));
        r2.put("clearChat", C165607th.A11("clearChat", "deleteChat", "star", "deleteMessageForMe"));
        r2.put("archive", Collections.singletonList("pin_v1"));
        r2.put("deleteMessageForMe", Collections.singletonList("star"));
        r2.put("lock", Collections.singletonList("archive"));
        A00 = r2.build();
        C20090x0 r1 = new C20090x0();
        r1.put("archive", Collections.singletonList("setting_unarchiveChats"));
        A01 = r1.build();
    }

    public static Pair A00(C201669k5 r2) {
        AnonymousClass11F chatJid;
        C64933Qa r0;
        if (r2 instanceof B67) {
            B67 b67 = (B67) r2;
            chatJid = b67.getChatJid();
            r0 = b67.BE4();
        } else if (r2 instanceof C22936Aym) {
            chatJid = ((C22936Aym) r2).getChatJid();
            r0 = null;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SyncdCrossIndexDependencyUtil/getValues: ");
            A0u.append(r2.A07());
            throw AnonymousClass000.A0c(" mutation needs to implement either MessageKeyProvider or ChatJidProvider", A0u);
        }
        return C36441kJ.A0Q(chatJid, r0);
    }
}
