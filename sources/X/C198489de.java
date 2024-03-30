package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9de  reason: invalid class name and case insensitive filesystem */
public final class C198489de {
    public C121835tn A00;

    public C198489de() {
        this((C121835tn) null, (C05250Oz) null, 1);
    }

    public /* synthetic */ C198489de(C121835tn r12, C05250Oz r13, int i) {
        this.A00 = new C121835tn(new C199949gJ((C202319lY) null, (UserJid) null, (C207059uU) null, C188008yt.NONE, (AnonymousClass2bZ) null, (Boolean) null, (List) null, 0), (Throwable) null, 2);
    }

    public final C121835tn A00(C202319lY r13, UserJid userJid, C207059uU r15, C188008yt r16, AnonymousClass2bZ r17, Boolean bool, List list, int i) {
        int i2;
        C121835tn r2;
        C188008yt r7 = r16;
        C202319lY r4 = r13;
        AnonymousClass2bZ r8 = r17;
        C207059uU r6 = r15;
        UserJid userJid2 = userJid;
        Boolean bool2 = bool;
        List list2 = null;
        if (bool == null) {
            C199949gJ r0 = (C199949gJ) this.A00.A01;
            if (r0 != null) {
                bool2 = r0.A06;
            } else {
                bool2 = null;
            }
        }
        if (userJid == null) {
            C199949gJ r02 = (C199949gJ) this.A00.A01;
            if (r02 != null) {
                userJid2 = r02.A02;
            } else {
                userJid2 = null;
            }
        }
        if (r15 == null) {
            C199949gJ r03 = (C199949gJ) this.A00.A01;
            if (r03 != null) {
                r6 = r03.A03;
            } else {
                r6 = null;
            }
        }
        if (r17 == null) {
            C199949gJ r04 = (C199949gJ) this.A00.A01;
            if (r04 != null) {
                r8 = r04.A05;
            } else {
                r8 = null;
            }
        }
        if (r13 == null) {
            C199949gJ r05 = (C199949gJ) this.A00.A01;
            if (r05 != null) {
                r4 = r05.A01;
            } else {
                r4 = null;
            }
        }
        if (r16 == null) {
            C199949gJ r06 = (C199949gJ) this.A00.A01;
            if (r06 != null) {
                r7 = r06.A04;
            } else {
                r7 = null;
            }
        }
        if (list == null) {
            C199949gJ r07 = (C199949gJ) this.A00.A01;
            if (r07 != null) {
                list2 = r07.A07;
            }
        } else {
            list2 = list;
        }
        C199949gJ r3 = new C199949gJ(r4, userJid2, r6, r7, r8, bool2, list2, i);
        if (r3.A03 != null) {
            r2 = new C121835tn(r3, new Throwable("An error occurred"), 1);
        } else {
            if (r3.A05 == null || (r3.A02 != null && r3.A04 == C188008yt.NONE)) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            r2 = new C121835tn(r3, (Throwable) null, i2);
        }
        this.A00 = r2;
        return r2;
    }
}
