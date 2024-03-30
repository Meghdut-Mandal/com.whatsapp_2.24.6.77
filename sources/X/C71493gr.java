package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3gr  reason: invalid class name and case insensitive filesystem */
public final class C71493gr implements C159417jK {
    public final C220412q A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public void BV1() {
        if (C36411kG.A0a(this.A03).A0O()) {
            if (((long) this.A00.A01.size()) <= 0) {
                AnonymousClass005 r5 = this.A01;
                if (C36411kG.A0E(((C25731Hl) r5.get()).A01).getLong("folder_open_count", 0) <= 0 && C36411kG.A0E(((C25731Hl) r5.get()).A01).getLong("new_add_chat_count", 0) <= 0 && C36411kG.A0E(((C25731Hl) r5.get()).A01).getLong("new_remove_chat_count", 0) <= 0) {
                    return;
                }
            }
            AnonymousClass3L5 r7 = (AnonymousClass3L5) this.A02.get();
            AnonymousClass2RG r6 = new AnonymousClass2RG();
            r6.A02 = C36441kJ.A0y(r7.A01.A01.size());
            C25731Hl r8 = r7.A00;
            AnonymousClass00T r3 = r8.A01;
            r6.A03 = Long.valueOf(C36341k9.A0B(C36411kG.A0E(r3), "folder_open_count"));
            r6.A04 = Long.valueOf(C36341k9.A0B(C36411kG.A0E(r3), "new_add_chat_count"));
            r6.A05 = Long.valueOf(C36341k9.A0B(C36411kG.A0E(r3), "new_remove_chat_count"));
            r6.A00 = Boolean.valueOf(r8.A03());
            r6.A01 = Boolean.valueOf(r8.A04());
            r7.A02.Blv(r6);
            List asList = Arrays.asList(new String[]{"folder_chats_count", "folder_open_count", "new_add_chat_count", "new_remove_chat_count"});
            AnonymousClass00C.A08(asList);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                C36341k9.A0u(C36351kA.A0A(r3), AnonymousClass001.A0C(it));
            }
        }
    }

    public C71493gr(C220412q r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
