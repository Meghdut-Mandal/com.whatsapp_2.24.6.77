package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.49w  reason: invalid class name and case insensitive filesystem */
public final class C835649w extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C835649w(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Map map = this.this$0.A0G;
        if (map != null) {
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Object key = A11.getKey();
                if (AnonymousClass00C.A0J(key, "com.whatsapp.contact.picker.DeviceContactsLoader") || AnonymousClass00C.A0J(key, "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader") || AnonymousClass00C.A0J(key, "com.whatsapp.contact.picker.NonWaContactsLoader") || AnonymousClass00C.A0J(key, "com.whatsapp.community.DirectoryContactsLoader")) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            ArrayList A14 = C36441kJ.A14(A1G.size());
            Iterator A0y2 = AnonymousClass000.A0y(A1G);
            while (A0y2.hasNext()) {
                A14.add(C36351kA.A0u(A0y2));
            }
            return C007103b.A0f(A14);
        }
        throw C36331k8.A0d("contactsLoaderMap");
    }
}
