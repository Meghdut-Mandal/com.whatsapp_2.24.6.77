package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8mb  reason: invalid class name and case insensitive filesystem */
public class C180898mb extends C195469Uk {
    public int A00;

    public static Jid A00(C19700wN r3, Jid jid, Class cls, String str) {
        if (jid == null || cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C165567td.A1N(jid, "web-query/failed to cast ", A0u);
        A0u.append(" to ");
        C165597tg.A1F(cls, A0u);
        A0u.append("(");
        A0u.append(jid);
        String A0p = AnonymousClass000.A0p(")@", str, A0u);
        Log.e(A0p);
        r3.A0E(AnonymousClass000.A0p("web-query/downcast-failure/", str, AnonymousClass000.A0u()), A0p, false);
        return null;
    }

    public static UserJid A02(C19700wN r2, C195469Uk r3, String str) {
        return (UserJid) A00(r2, r3.A06, UserJid.class, str);
    }

    public static void A03(AnonymousClass144 r0, UserJid userJid, AnonymousClass8NG r2, AnonymousClass8NK r3) {
        if (r0 != null) {
            AnonymousClass8NG.A00(r0, r2);
        } else {
            r2.A0U();
        }
        if (userJid != null) {
            r3.A0Z(userJid.getRawString());
        } else {
            r3.A0U();
        }
    }

    public static void A07(C195469Uk r1, C181758nz r2) {
        r1.A0B = AnonymousClass143.A07(r2.A01);
    }

    public static AnonymousClass144 A01(C19700wN r0, Jid jid, Class cls, String str) {
        return (AnonymousClass144) A00(r0, jid, cls, str);
    }

    public static void A04(AnonymousClass144 r0, UserJid userJid, AnonymousClass8NG r2, AnonymousClass8NK r3, C195469Uk r4) {
        A03(r0, userJid, r2, r3);
        A06(r3, r4.A0B);
    }

    public static void A05(AnonymousClass8NK r0, AnonymousClass91I r1, AnonymousClass3T1 r2, C195469Uk r3) {
        r0.A0X(r1);
        r3.A06 = r2.A0J();
    }

    public static void A06(AnonymousClass8NK r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (A0C != null) {
                r2.A0Y(A0C);
            }
        }
    }

    public C180898mb(C19700wN r1) {
        super(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04f9, code lost:
        if (r4 != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x053c, code lost:
        if (r4 != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0578, code lost:
        if (r4 != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05b7, code lost:
        if (r4 != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0e31, code lost:
        if (r0 != null) goto L_0x0e33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x11b5, code lost:
        r1 = "off";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1288, code lost:
        if ((r2 instanceof X.C174538Xm) != false) goto L_0x128a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0dc2  */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x0ddb  */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x1295  */
    /* JADX WARNING: Removed duplicated region for block: B:833:0x12aa  */
    /* JADX WARNING: Removed duplicated region for block: B:835:0x12b0  */
    /* JADX WARNING: Removed duplicated region for block: B:844:0x12d9  */
    /* JADX WARNING: Removed duplicated region for block: B:863:0x132f  */
    /* JADX WARNING: Removed duplicated region for block: B:957:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:973:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass8NG r12, X.AnonymousClass8NK r13) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C186708wZ
            if (r0 == 0) goto L_0x0027
            r3 = r11
            X.8wZ r3 = (X.C186708wZ) r3
            X.C36321k7.A0w(r13, r12)
            X.5JD r2 = r3.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1374
            X.91I r0 = X.AnonymousClass91I.CHANGE_USERNAME
            r13.A0X(r0)
            X.11F r0 = r3.A05
            if (r0 == 0) goto L_0x136f
            X.AnonymousClass8NG.A00(r0, r12)
            java.lang.String r0 = r2.A01
            r13.A0Y(r0)
            java.lang.String r1 = r2.A00
        L_0x0023:
            r13.A0Y(r1)
        L_0x0026:
            return
        L_0x0027:
            boolean r0 = r11 instanceof X.C186948wx
            if (r0 == 0) goto L_0x003c
            r4 = r11
            X.8wx r4 = (X.C186948wx) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r1 = r4.A00
            if (r1 != 0) goto L_0x1379
            java.lang.String r1 = "attempt to create builder without message"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x003c:
            boolean r0 = r11 instanceof X.C186698wY
            if (r0 == 0) goto L_0x007c
            r5 = r11
            X.8wY r5 = (X.C186698wY) r5
            X.2cN r4 = r5.A00
            X.C18740tg.A06(r4)
            X.C186908wt.A08(r4, r5)
            X.91I r0 = X.AnonymousClass91I.A2q
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "SCHEDULED_CALL_START_MESSAGE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            long r0 = r4.A01
            java.lang.String r0 = java.lang.Long.toString(r0)
            r13.A0Y(r0)
            long r0 = r4.A00
            java.lang.String r0 = java.lang.Long.toString(r0)
            r13.A0Y(r0)
            java.lang.String r1 = r4.A02
        L_0x0077:
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = ""
            goto L_0x0023
        L_0x007c:
            boolean r0 = r11 instanceof X.C186688wX
            if (r0 == 0) goto L_0x00da
            r6 = r11
            X.8wX r6 = (X.C186688wX) r6
            X.C36321k7.A0w(r13, r12)
            X.5JE r2 = r6.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1399
            X.91I r0 = X.AnonymousClass91I.REMINDER_SETUP_MESSAGE
            r13.A0X(r0)
            X.11F r0 = r6.A05
            if (r0 == 0) goto L_0x1394
            X.AnonymousClass8NG.A00(r0, r12)
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            X.11F r0 = r2.A0J()
            X.0wN r4 = r6.A0F
            java.lang.String r3 = "REMINDER_SETUP"
            com.whatsapp.jid.Jid r0 = A00(r4, r0, r5, r3)
            X.11F r0 = (X.AnonymousClass11F) r0
            r6.A06 = r0
            java.lang.Class<com.whatsapp.jid.GroupJid> r1 = com.whatsapp.jid.GroupJid.class
            X.11F r0 = r6.A05
            X.144 r1 = A01(r4, r0, r1, r3)
            X.11F r0 = r6.A06
            com.whatsapp.jid.Jid r0 = A00(r4, r0, r5, r3)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            A03(r1, r0, r12, r13)
            long r0 = r2.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            long r0 = r2.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            java.lang.String r1 = r2.A02
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "reminderContent"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x00da:
            boolean r0 = r11 instanceof X.C186678wW
            if (r0 == 0) goto L_0x010a
            r4 = r11
            X.8wW r4 = (X.C186678wW) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r1 = r4.A00
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = "PinnedMessageInChatWebQuery/Message is null"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x00ef:
            X.91I r0 = X.AnonymousClass91I.A2i
            r13.A0X(r0)
            X.C186828wl.A08(r12, r4)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.11F r2 = r1.A0J()
            X.0wN r1 = r4.A0F
            java.lang.String r0 = "PINNED_MESSAGE_IN_CHAT"
            com.whatsapp.jid.Jid r0 = A00(r1, r2, r3, r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r4.A06 = r0
            goto L_0x0149
        L_0x010a:
            boolean r0 = r11 instanceof X.C186668wV
            if (r0 == 0) goto L_0x014d
            r0 = r11
            X.8wV r0 = (X.C186668wV) r0
            X.2bI r2 = r0.A00
            X.C18740tg.A06(r2)
            X.C186828wl.A08(r12, r0)
            int r0 = r2.A00
            switch(r0) {
                case 64: goto L_0x0125;
                case 65: goto L_0x0128;
                case 66: goto L_0x012b;
                default: goto L_0x011e;
            }
        L_0x011e:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x0125:
            X.91I r0 = X.AnonymousClass91I.A2c
            goto L_0x012d
        L_0x0128:
            X.91I r0 = X.AnonymousClass91I.A2a
            goto L_0x012d
        L_0x012b:
            X.91I r0 = X.AnonymousClass91I.A2b
        L_0x012d:
            r13.A0X(r0)
            r1 = r2
            X.8n6 r1 = (X.C181208n6) r1
            int r0 = r1.A00
            boolean r1 = r1.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r13.A0Y(r0)
            X.11F r0 = r2.A0J()
        L_0x0149:
            if (r0 == 0) goto L_0x0026
            goto L_0x0e33
        L_0x014d:
            boolean r0 = r11 instanceof X.C186658wU
            if (r0 == 0) goto L_0x0178
            r3 = r11
            X.8wU r3 = (X.C186658wU) r3
            r2 = 0
            X.C36331k8.A1I(r13, r12)
            X.2bI r1 = r3.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2r
            r13.A0X(r0)
            if (r1 == 0) goto L_0x016b
            java.lang.String r0 = r1.A0m
            if (r0 == 0) goto L_0x016b
            r13.A0Y(r0)
        L_0x016b:
            r12.A0Y(r2)
            X.11F r0 = r3.A05
            java.lang.String r0 = X.C36381kD.A0w(r0)
            r12.A0X(r0)
            return
        L_0x0178:
            boolean r0 = r11 instanceof X.C186648wT
            if (r0 == 0) goto L_0x019a
            r2 = r11
            X.8wT r2 = (X.C186648wT) r2
            r1 = 0
            X.C36331k8.A1I(r13, r12)
            X.2bI r0 = r2.A00
            X.C18740tg.A06(r0)
            X.91I r0 = X.AnonymousClass91I.A2j
            r13.A0X(r0)
            r12.A0Y(r1)
            X.11F r0 = r2.A05
            java.lang.String r0 = X.C36381kD.A0w(r0)
            r12.A0X(r0)
            return
        L_0x019a:
            boolean r0 = r11 instanceof X.C186638wS
            if (r0 == 0) goto L_0x01da
            r4 = r11
            X.8wS r4 = (X.C186638wS) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r0 = r4.A00
            X.C18740tg.A06(r0)
            if (r0 == 0) goto L_0x01b3
            X.8nz r0 = (X.C181758nz) r0
            X.C186908wt.A08(r0, r4)
            A07(r4, r0)
        L_0x01b3:
            X.91I r0 = X.AnonymousClass91I.A27
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "NON_ADMIN_ADD_GJR"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            java.util.List r1 = r4.A0B
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.List r0 = X.C07710Yz.A01(r1)
            A06(r13, r0)
            return
        L_0x01da:
            boolean r0 = r11 instanceof X.C186628wR
            if (r0 == 0) goto L_0x020e
            r0 = r11
            X.8wR r0 = (X.C186628wR) r0
            X.2bI r3 = r0.A00
            X.C18740tg.A06(r3)
            X.C186828wl.A08(r12, r0)
            int r1 = r3.A00
            r0 = 70
            if (r1 != r0) goto L_0x139e
            X.91I r0 = X.AnonymousClass91I.A2N
            r13.A0X(r0)
            X.2cO r3 = (X.C46992cO) r3
            boolean r0 = r3.A02
            int r2 = r3.A00
            java.lang.String r1 = r3.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L_0x0207:
            r13.A0Y(r0)
        L_0x020a:
            if (r1 == 0) goto L_0x0026
            goto L_0x0023
        L_0x020e:
            boolean r0 = r11 instanceof X.C186848wn
            if (r0 == 0) goto L_0x0261
            r5 = r11
            X.8wn r5 = (X.C186848wn) r5
            X.8nz r4 = r5.A01
            X.C18740tg.A06(r4)
            X.91I r0 = X.AnonymousClass91I.A2M
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r2 = r5.A05
            X.0wN r1 = r5.A0F
            java.lang.String r0 = "INTEGRITY_UNLINKED_PARENT_GROUP_WEB_QUERY"
            X.144 r0 = A01(r1, r2, r3, r0)
            r2 = 0
            A03(r0, r2, r12, r13)
            boolean r0 = r4 instanceof X.C181658np
            if (r0 == 0) goto L_0x0250
            X.8ny r4 = (X.C181748ny) r4
            r0 = 1
            com.whatsapp.jid.GroupJid r2 = r4.A1b(r0)
            X.12q r0 = r5.A00
            java.lang.String r1 = r0.A0D(r2)
            if (r1 != 0) goto L_0x0247
            r0 = 1
            java.lang.String r1 = r4.A1d(r0)
        L_0x0247:
            java.lang.String r0 = X.AnonymousClass143.A03(r2)
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = ""
            goto L_0x0207
        L_0x0250:
            boolean r0 = r4 instanceof X.C181408nQ
            if (r0 == 0) goto L_0x025f
            X.8nQ r4 = (X.C181408nQ) r4
            com.whatsapp.jid.GroupJid r2 = r4.A01
            X.12q r0 = r5.A00
            java.lang.String r1 = r0.A0D(r2)
            goto L_0x0247
        L_0x025f:
            r1 = r2
            goto L_0x0247
        L_0x0261:
            boolean r0 = r11 instanceof X.C186818wk
            if (r0 == 0) goto L_0x0297
            r3 = r11
            X.8wk r3 = (X.C186818wk) r3
            X.2cH r2 = r3.A01
            X.C18740tg.A06(r2)
            X.0xf r1 = r3.A00
            X.C18740tg.A06(r1)
            X.11F r0 = r3.A05
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 == 0) goto L_0x0283
            X.91I r0 = X.AnonymousClass91I.A1G
        L_0x027c:
            r13.A0X(r0)
            X.C186828wl.A08(r12, r3)
            return
        L_0x0283:
            int r0 = r2.A00
            switch(r0) {
                case 5: goto L_0x028b;
                case 6: goto L_0x028b;
                case 7: goto L_0x028e;
                case 8: goto L_0x028e;
                case 9: goto L_0x028b;
                case 10: goto L_0x028b;
                case 11: goto L_0x0288;
                case 12: goto L_0x0288;
                case 13: goto L_0x0288;
                case 14: goto L_0x0288;
                case 15: goto L_0x028b;
                case 16: goto L_0x0291;
                case 17: goto L_0x0294;
                default: goto L_0x0288;
            }
        L_0x0288:
            X.91I r0 = X.AnonymousClass91I.A1d
            goto L_0x027c
        L_0x028b:
            X.91I r0 = X.AnonymousClass91I.A0F
            goto L_0x027c
        L_0x028e:
            X.91I r0 = X.AnonymousClass91I.A0E
            goto L_0x027c
        L_0x0291:
            X.91I r0 = X.AnonymousClass91I.BIZ_COEX_PRIVACY_INIT
            goto L_0x027c
        L_0x0294:
            X.91I r0 = X.AnonymousClass91I.BIZ_COEX_PRIVACY_INIT_SELF
            goto L_0x027c
        L_0x0297:
            boolean r0 = r11 instanceof X.C186338vu
            if (r0 == 0) goto L_0x02b1
            X.91I r0 = X.AnonymousClass91I.A18
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r2 = r11.A05
            X.0wN r1 = r11.A0F
            java.lang.String r0 = "ACTION_INITIAL_PN_NOT_SHARED_IN_CAG"
            X.144 r1 = A01(r1, r2, r3, r0)
            r0 = 0
            A03(r1, r0, r12, r13)
            return
        L_0x02b1:
            boolean r0 = r11 instanceof X.C186328vt
            if (r0 == 0) goto L_0x02be
            X.91I r0 = X.AnonymousClass91I.A2O
            r13.A0X(r0)
            X.C186828wl.A08(r12, r11)
            return
        L_0x02be:
            boolean r0 = r11 instanceof X.C186618wQ
            if (r0 == 0) goto L_0x02f2
            r4 = r11
            X.8wQ r4 = (X.C186618wQ) r4
            X.2bI r2 = r4.A00
            X.C18740tg.A06(r2)
            r1 = r2
            X.8nW r1 = (X.C181468nW) r1
            X.91I r0 = X.AnonymousClass91I.A26
            r13.A0X(r0)
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x02d8
            java.lang.String r0 = ""
        L_0x02d8:
            r13.A0Y(r0)
            X.C186908wt.A08(r2, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_MEMBERSHIP_JOIN_APPROVAL_REQUEST_WEB_QUERY"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x02f2:
            boolean r0 = r11 instanceof X.C186608wP
            if (r0 == 0) goto L_0x034e
            r4 = r11
            X.8wP r4 = (X.C186608wP) r4
            X.2bI r3 = r4.A00
            X.C18740tg.A06(r3)
            r1 = r3
            X.8nO r1 = (X.C181388nO) r1
            X.91I r0 = X.AnonymousClass91I.A25
            r13.A0X(r0)
            int r2 = r1.A00
            r0 = 84
            if (r2 != r0) goto L_0x0347
            java.lang.String r0 = "on"
        L_0x030e:
            r13.A0Y(r0)
            java.lang.String r2 = r1.A00
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0343
            java.lang.String r0 = "regular"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0343
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupMembershipJoinApprovalModeWebQuery/onCreateWebInfoBuilder Cannot parse msg past group role "
            X.C36321k7.A1P(r0, r2, r1)
        L_0x032c:
            X.C186908wt.A08(r3, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_MEMBERSHIP_JOIN_APPROVAL_MODE_WEB_QUERY"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0343:
            r13.A0Y(r2)
            goto L_0x032c
        L_0x0347:
            r0 = 85
            if (r2 != r0) goto L_0x13a5
            java.lang.String r0 = "off"
            goto L_0x030e
        L_0x034e:
            boolean r0 = r11 instanceof X.C186598wO
            if (r0 == 0) goto L_0x038d
            r4 = r11
            X.8wO r4 = (X.C186598wO) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r0 = r4.A00
            X.C18740tg.A06(r0)
            if (r0 == 0) goto L_0x0371
            X.C186908wt.A08(r0, r4)
            int r2 = r0.A00
            r0 = 91
            if (r2 == r0) goto L_0x038a
            r0 = 92
            if (r2 != r0) goto L_0x13b0
            java.lang.String r0 = "off"
        L_0x036e:
            r13.A0Y(r0)
        L_0x0371:
            X.91I r0 = X.AnonymousClass91I.A28
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_MEMBER_ADD_MODE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x038a:
            java.lang.String r0 = "on"
            goto L_0x036e
        L_0x038d:
            boolean r0 = r11 instanceof X.C186808wj
            if (r0 == 0) goto L_0x03f2
            r7 = r11
            X.8wj r7 = (X.C186808wj) r7
            boolean r1 = X.C36331k8.A1a(r13, r12)
            X.8nr r0 = r7.A01
            if (r0 != 0) goto L_0x03a3
            java.lang.String r1 = "GroupLinkedWithJoinApprovalModeWebQuery/onCreateWebInfoBuilder msg is null"
        L_0x039e:
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x03a3:
            X.C186908wt.A08(r0, r7)
            int r4 = r0.A00
            com.whatsapp.jid.GroupJid r6 = r0.A1b(r1)
            X.AnonymousClass00C.A08(r6)
            java.lang.String r5 = r0.A1d(r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r7.A05
            X.0wN r2 = r7.A00
            java.lang.String r0 = "ACTION_SYSTEM_SUBGROUP_LINKED_WITH_JOIN_APPROVAL_MODE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r7, r0)
            A03(r1, r0, r12, r13)
            X.91I r0 = X.AnonymousClass91I.A1O
            r13.A0X(r0)
            java.lang.String r1 = r6.getRawString()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x03d4
            r1 = r0
        L_0x03d4:
            r13.A0Y(r1)
            if (r5 != 0) goto L_0x03da
            r5 = r0
        L_0x03da:
            r13.A0Y(r5)
            r13.A0Y(r0)
            java.lang.String r0 = "true"
            java.lang.String r1 = "false"
            switch(r4) {
                case 102: goto L_0x11ac;
                case 103: goto L_0x13bb;
                case 104: goto L_0x11a7;
                default: goto L_0x03e7;
            }
        L_0x03e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupLinkedWithJoinApprovalModeWebQuery/onCreateWebInfoBuilder Unrecognized action "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r4)
            goto L_0x039e
        L_0x03f2:
            boolean r0 = r11 instanceof X.C186878wq
            if (r0 == 0) goto L_0x0431
            r5 = r11
            X.8wq r5 = (X.C186878wq) r5
            X.8nQ r4 = r5.A02
            X.C18740tg.A06(r4)
            X.91I r0 = X.AnonymousClass91I.A1O
            A05(r13, r0, r4, r5)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "ACTION_GROUP_MEMBERSHIP_APPROVAL_MODE_DISABLED_ON_SUBGROUP_LINK"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            com.whatsapp.jid.GroupJid r1 = r4.A01
            if (r1 == 0) goto L_0x0421
            java.lang.String r0 = r1.getRawString()
            r13.A0Y(r0)
        L_0x0421:
            X.16D r0 = r5.A00
            X.141 r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0026
            X.171 r0 = r5.A01
            java.lang.String r1 = r0.A0H(r1)
            goto L_0x020a
        L_0x0431:
            boolean r0 = r11 instanceof X.C186588wN
            if (r0 == 0) goto L_0x047d
            r6 = r11
            X.8wN r6 = (X.C186588wN) r6
            X.2bI r2 = r6.A00
            X.C18740tg.A06(r2)
            X.91I r0 = X.AnonymousClass91I.A1x
            A05(r13, r0, r2, r6)
            int r1 = r2.A00
            r5 = 1
            r4 = 0
            r0 = 30
            if (r1 != r0) goto L_0x046e
            r5 = 0
        L_0x044b:
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r6.A05
            X.0wN r2 = r6.A0F
            java.lang.String r0 = "GROUP_CHANGE_RESTRICT"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r6, r0)
            A03(r1, r0, r12, r13)
            if (r5 == 0) goto L_0x046b
            java.lang.String r0 = "on"
        L_0x0462:
            r13.A0Y(r0)
            java.lang.String r1 = java.lang.Integer.toString(r4)
            goto L_0x0023
        L_0x046b:
            java.lang.String r0 = "off"
            goto L_0x0462
        L_0x046e:
            r0 = 29
            if (r1 == r0) goto L_0x044b
            r0 = 142(0x8e, float:1.99E-43)
            if (r1 != r0) goto L_0x13c2
            X.8nR r2 = (X.C181418nR) r2
            if (r2 == 0) goto L_0x044b
            int r4 = r2.A00
            goto L_0x044b
        L_0x047d:
            boolean r0 = r11 instanceof X.C186968wz
            if (r0 == 0) goto L_0x04ce
            r5 = r11
            X.8wz r5 = (X.C186968wz) r5
            X.C36321k7.A0w(r13, r12)
            X.91I r0 = X.C186968wz.A02
            r13.A0X(r0)
            X.2bI r3 = r5.A01
            if (r3 == 0) goto L_0x13c9
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 140(0x8c, float:1.96E-43)
            if (r1 == 0) goto L_0x13c9
            if (r2 != r0) goto L_0x04c7
            java.lang.String r4 = "on"
        L_0x049e:
            X.C186908wt.A08(r3, r5)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "REPORT_TO_ADMIN_ENABLED_STATUS"
            com.whatsapp.jid.Jid r1 = A00(r2, r1, r3, r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            r13.A0Y(r4)
            if (r1 == 0) goto L_0x11b1
            X.17X r0 = r5.A00
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x11b1
            java.lang.String r1 = "admin"
            goto L_0x0023
        L_0x04c7:
            r0 = 141(0x8d, float:1.98E-43)
            if (r2 != r0) goto L_0x13c9
            java.lang.String r4 = "off"
            goto L_0x049e
        L_0x04ce:
            boolean r0 = r11 instanceof X.C186578wM
            if (r0 == 0) goto L_0x0505
            r5 = r11
            X.8wM r5 = (X.C186578wM) r5
            X.2bI r1 = r5.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1v
            A05(r13, r0, r1, r5)
            int r1 = r1.A00
            r0 = 54
            if (r1 != r0) goto L_0x04ff
            r4 = 0
        L_0x04e6:
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "GROUP_CHANGE_NO_FREQUENTLY_FORWARDED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            if (r4 == 0) goto L_0x11b5
        L_0x04fb:
            java.lang.String r1 = "on"
            goto L_0x0023
        L_0x04ff:
            r0 = 53
            if (r1 != r0) goto L_0x13d0
            r4 = 1
            goto L_0x04e6
        L_0x0505:
            boolean r0 = r11 instanceof X.C187008x5
            if (r0 == 0) goto L_0x0545
            r6 = r11
            X.8vr r6 = (X.C186308vr) r6
            X.C36321k7.A0w(r13, r12)
            X.91I r0 = X.C187008x5.A00
            r13.A0X(r0)
            X.2bI r5 = r6.A00
            r3 = 0
            if (r5 == 0) goto L_0x13d7
            int r2 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 150(0x96, float:2.1E-43)
            if (r1 == 0) goto L_0x13d7
            if (r2 != r0) goto L_0x053f
            r4 = 1
        L_0x0526:
            X.C186908wt.A08(r5, r6)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r6.A05
            X.0wN r2 = r6.A0F
            java.lang.String r0 = "GROUP_CHANGE_RECENT_HISTORY_SHARING"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r6, r0)
            A03(r1, r0, r12, r13)
            if (r4 == 0) goto L_0x11b5
            goto L_0x04fb
        L_0x053f:
            r0 = 151(0x97, float:2.12E-43)
            if (r2 != r0) goto L_0x13d7
            r4 = 0
            goto L_0x0526
        L_0x0545:
            boolean r0 = r11 instanceof X.AnonymousClass8x3
            if (r0 == 0) goto L_0x0581
            r5 = r11
            X.8x3 r5 = (X.AnonymousClass8x3) r5
            X.2bI r1 = r5.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1r
            r13.A0X(r0)
            X.11F r2 = r1.A0J()
            r5.A06 = r2
            int r1 = r1.A00
            r0 = 32
            if (r1 != r0) goto L_0x057b
            r4 = 0
        L_0x0563:
            r5.A06 = r2
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "GROUP_CHANGE_ANNOUNCE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            if (r4 == 0) goto L_0x11b5
            goto L_0x04fb
        L_0x057b:
            r0 = 31
            if (r1 != r0) goto L_0x13f1
            r4 = 1
            goto L_0x0563
        L_0x0581:
            boolean r0 = r11 instanceof X.AnonymousClass8x4
            if (r0 == 0) goto L_0x05c1
            r5 = r11
            X.8vr r5 = (X.C186308vr) r5
            X.C36321k7.A0w(r13, r12)
            X.91I r0 = X.AnonymousClass8x4.A00
            r13.A0X(r0)
            X.2bI r3 = r5.A00
            if (r3 == 0) goto L_0x13f8
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 137(0x89, float:1.92E-43)
            if (r1 == 0) goto L_0x13f8
            if (r2 != r0) goto L_0x05bb
            r4 = 1
        L_0x05a1:
            X.C186908wt.A08(r3, r5)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "COMMUNITY_ALLOW_MEMBER_ADDED_GROUPS"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            if (r4 == 0) goto L_0x11b5
            goto L_0x04fb
        L_0x05bb:
            r0 = 138(0x8a, float:1.93E-43)
            if (r2 != r0) goto L_0x13f8
            r4 = 0
            goto L_0x05a1
        L_0x05c1:
            boolean r0 = r11 instanceof X.C186318vs
            if (r0 == 0) goto L_0x05de
            X.91I r0 = X.AnonymousClass91I.A1p
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r11.A05
            X.0wN r2 = r11.A0F
            java.lang.String r0 = "GROUP_CHANGE_ANNOUNCE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r11, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x05de:
            boolean r0 = r11 instanceof X.C186568wL
            if (r0 == 0) goto L_0x0602
            r1 = r11
            X.8wL r1 = (X.C186568wL) r1
            X.2bI r2 = r1.A00
            X.C18740tg.A06(r2)
            X.91I r0 = X.AnonymousClass91I.A1j
            r13.A0X(r0)
            X.C186828wl.A08(r12, r1)
            int r1 = r2.A00
            r0 = 60
            if (r1 != r0) goto L_0x13ff
            X.8n7 r2 = (X.C181218n7) r2
            int r0 = r2.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0023
        L_0x0602:
            boolean r0 = r11 instanceof X.C186558wK
            if (r0 == 0) goto L_0x0624
            r2 = r11
            X.8wK r2 = (X.C186558wK) r2
            X.2bI r1 = r2.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1i
            r13.A0X(r0)
            X.C186828wl.A08(r12, r2)
            X.11F r0 = r1.A0J()
            r2.A06 = r0
        L_0x061c:
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r0.getRawString()
            goto L_0x020a
        L_0x0624:
            boolean r0 = r11 instanceof X.AnonymousClass8wJ
            if (r0 == 0) goto L_0x064f
            r2 = r11
            X.8wJ r2 = (X.AnonymousClass8wJ) r2
            X.8mu r1 = r2.A00
            X.C18740tg.A06(r1)
            X.11F r0 = r1.A0J()
            if (r0 != 0) goto L_0x063a
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
        L_0x063a:
            r2.A06 = r0
            X.C186828wl.A08(r12, r2)
            X.91I r0 = X.AnonymousClass91I.A1c
            r13.A0X(r0)
            X.11F r0 = r2.A06
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.getRawString()
            goto L_0x0023
        L_0x064f:
            boolean r0 = r11 instanceof X.AnonymousClass8wI
            if (r0 == 0) goto L_0x068c
            r3 = r11
            X.8wI r3 = (X.AnonymousClass8wI) r3
            X.2cJ r1 = r3.A00
            X.C18740tg.A06(r1)
            X.11F r0 = r1.A0J()
            if (r0 != 0) goto L_0x0665
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
        L_0x0665:
            r3.A06 = r0
            int r2 = r1.A00
            int r1 = r1.A01
            X.C186828wl.A08(r12, r3)
            X.91I r0 = X.AnonymousClass91I.A1b
            r13.A0X(r0)
            X.11F r0 = r3.A06
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r13.A0Y(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r13.A0Y(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0023
        L_0x068c:
            boolean r0 = r11 instanceof X.C186548wH
            if (r0 == 0) goto L_0x06b4
            r4 = r11
            X.8wH r4 = (X.C186548wH) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1W
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "COMMUNITY_PARTICIPANT_PROMOTE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x06b4:
            boolean r0 = r11 instanceof X.C186538wG
            if (r0 == 0) goto L_0x06dc
            r4 = r11
            X.8wG r4 = (X.C186538wG) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1V
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "COMMUNITY_PARTICIPANT_DEMOTE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x06dc:
            boolean r0 = r11 instanceof X.C186528wF
            if (r0 == 0) goto L_0x06f7
            r1 = r11
            X.8wF r1 = (X.C186528wF) r1
            X.8n8 r0 = r1.A00
            X.C18740tg.A06(r0)
            X.C186828wl.A08(r12, r1)
            java.lang.String r1 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x119a
            X.91I r0 = X.AnonymousClass91I.A05
            r13.A0X(r0)
            return
        L_0x06f7:
            boolean r0 = r11 instanceof X.C186518wE
            if (r0 == 0) goto L_0x073b
            r4 = r11
            X.8wE r4 = (X.C186518wE) r4
            X.2bI r2 = r4.A00
            X.C18740tg.A06(r2)
            X.91I r0 = X.AnonymousClass91I.A1D
            r13.A0X(r0)
            X.C186828wl.A08(r12, r4)
            int r1 = r2.A00
            r0 = 59
            if (r1 != r0) goto L_0x0731
            r0 = r2
            X.2cF r0 = (X.AnonymousClass2cF) r0
            int r0 = r0.A00
        L_0x0716:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.11F r2 = r2.A0J()
            X.0wN r1 = r4.A0F
            java.lang.String r0 = "CHANGE_EPHEMERAL"
            com.whatsapp.jid.Jid r0 = A00(r1, r2, r3, r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r4.A06 = r0
            goto L_0x061c
        L_0x0731:
            r0 = 56
            if (r1 != r0) goto L_0x1406
            r0 = r2
            X.8nV r0 = (X.C181458nV) r0
            int r0 = r0.A00
            goto L_0x0716
        L_0x073b:
            boolean r0 = r11 instanceof X.C186798wi
            if (r0 == 0) goto L_0x0781
            r5 = r11
            X.8wi r5 = (X.C186798wi) r5
            X.2bI r1 = r5.A01
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1a
            r13.A0X(r0)
            X.11F r0 = r5.A05
            X.C18740tg.A06(r0)
            java.lang.String r4 = r0.getRawString()
            r12.A0X(r4)
            int r3 = r1.A00
            r2 = 68
            if (r3 != r2) goto L_0x140d
            r0 = r1
            X.8n1 r0 = (X.C181158n1) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            int r1 = r1.A00
            r0 = 1
            if (r1 != r0) goto L_0x0779
            X.0wQ r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C36371kC.A0e(r0)
            java.lang.String r4 = r0.getRawString()
        L_0x0779:
            if (r4 != 0) goto L_0x077d
            java.lang.String r4 = ""
        L_0x077d:
            r13.A0Y(r4)
            return
        L_0x0781:
            boolean r0 = r11 instanceof X.C186908wt
            if (r0 == 0) goto L_0x07ae
            r4 = r11
            X.8wt r4 = (X.C186908wt) r4
            X.C36321k7.A0w(r13, r12)
            X.91I r0 = r4.A01
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            java.lang.String r2 = r4.A02
            X.0wN r0 = r4.A0F
            X.144 r1 = A01(r0, r1, r3, r2)
            com.whatsapp.jid.UserJid r0 = A02(r0, r4, r2)
            A03(r1, r0, r12, r13)
            java.lang.String r1 = r4.A00
            if (r1 == 0) goto L_0x0026
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0023
            return
        L_0x07ae:
            boolean r0 = r11 instanceof X.C186508wD
            if (r0 == 0) goto L_0x07e6
            r1 = r11
            X.8wD r1 = (X.C186508wD) r1
            X.2cI r0 = r1.A00
            X.C18740tg.A06(r0)
            X.C186828wl.A08(r12, r1)
            int r2 = r0.A00
            java.lang.String r1 = r0.A01
            r0 = 2
            if (r2 == r0) goto L_0x07e3
            r0 = 3
            if (r2 == r0) goto L_0x07e0
            r0 = 4
            if (r2 == r0) goto L_0x07dd
            r0 = 5
            if (r2 == r0) goto L_0x07da
            X.91I r0 = X.AnonymousClass91I.A1e
        L_0x07cf:
            r13.A0X(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0026
            goto L_0x0023
        L_0x07da:
            X.91I r0 = X.AnonymousClass91I.BIZ_COEX_PRIVACY_TRANSITION
            goto L_0x07cf
        L_0x07dd:
            X.91I r0 = X.AnonymousClass91I.BIZ_COEX_PRIVACY_TRANSITION_SELF
            goto L_0x07cf
        L_0x07e0:
            X.91I r0 = X.AnonymousClass91I.A0G
            goto L_0x07cf
        L_0x07e3:
            X.91I r0 = X.AnonymousClass91I.A0H
            goto L_0x07cf
        L_0x07e6:
            boolean r0 = r11 instanceof X.C186498wC
            if (r0 == 0) goto L_0x0868
            r0 = r11
            X.8wC r0 = (X.C186498wC) r0
            X.2cI r1 = r0.A00
            X.C18740tg.A06(r1)
            X.C186828wl.A08(r12, r0)
            int r0 = r1.A00
            java.lang.String r1 = r1.A01
            switch(r0) {
                case 1: goto L_0x07ff;
                case 2: goto L_0x0802;
                case 3: goto L_0x0805;
                case 4: goto L_0x0808;
                case 5: goto L_0x080b;
                case 6: goto L_0x080e;
                case 7: goto L_0x0811;
                case 8: goto L_0x0814;
                case 9: goto L_0x0817;
                case 10: goto L_0x081a;
                case 11: goto L_0x081d;
                case 12: goto L_0x0820;
                case 13: goto L_0x0823;
                case 14: goto L_0x0826;
                case 15: goto L_0x0829;
                case 16: goto L_0x082c;
                case 17: goto L_0x082f;
                case 18: goto L_0x0832;
                case 19: goto L_0x0835;
                case 20: goto L_0x0838;
                case 21: goto L_0x083b;
                case 22: goto L_0x083e;
                case 23: goto L_0x0841;
                case 24: goto L_0x0844;
                case 25: goto L_0x0847;
                case 26: goto L_0x084a;
                case 27: goto L_0x084d;
                case 28: goto L_0x0850;
                case 29: goto L_0x0854;
                case 30: goto L_0x0858;
                case 31: goto L_0x085c;
                case 32: goto L_0x0860;
                case 33: goto L_0x0864;
                default: goto L_0x07fc;
            }
        L_0x07fc:
            X.91I r0 = X.AnonymousClass91I.A0t
            goto L_0x07cf
        L_0x07ff:
            X.91I r0 = X.AnonymousClass91I.A0T
            goto L_0x07cf
        L_0x0802:
            X.91I r0 = X.AnonymousClass91I.A0X
            goto L_0x07cf
        L_0x0805:
            X.91I r0 = X.AnonymousClass91I.A0a
            goto L_0x07cf
        L_0x0808:
            X.91I r0 = X.AnonymousClass91I.A0c
            goto L_0x07cf
        L_0x080b:
            X.91I r0 = X.AnonymousClass91I.A0l
            goto L_0x07cf
        L_0x080e:
            X.91I r0 = X.AnonymousClass91I.A0o
            goto L_0x07cf
        L_0x0811:
            X.91I r0 = X.AnonymousClass91I.A12
            goto L_0x07cf
        L_0x0814:
            X.91I r0 = X.AnonymousClass91I.A11
            goto L_0x07cf
        L_0x0817:
            X.91I r0 = X.AnonymousClass91I.A0W
            goto L_0x07cf
        L_0x081a:
            X.91I r0 = X.AnonymousClass91I.A10
            goto L_0x07cf
        L_0x081d:
            X.91I r0 = X.AnonymousClass91I.A0n
            goto L_0x07cf
        L_0x0820:
            X.91I r0 = X.AnonymousClass91I.A0V
            goto L_0x07cf
        L_0x0823:
            X.91I r0 = X.AnonymousClass91I.A0z
            goto L_0x07cf
        L_0x0826:
            X.91I r0 = X.AnonymousClass91I.A0v
            goto L_0x07cf
        L_0x0829:
            X.91I r0 = X.AnonymousClass91I.A0y
            goto L_0x07cf
        L_0x082c:
            X.91I r0 = X.AnonymousClass91I.A0x
            goto L_0x07cf
        L_0x082f:
            X.91I r0 = X.AnonymousClass91I.A0S
            goto L_0x07cf
        L_0x0832:
            X.91I r0 = X.AnonymousClass91I.A0w
            goto L_0x07cf
        L_0x0835:
            X.91I r0 = X.AnonymousClass91I.A0k
            goto L_0x07cf
        L_0x0838:
            X.91I r0 = X.AnonymousClass91I.A0R
            goto L_0x07cf
        L_0x083b:
            X.91I r0 = X.AnonymousClass91I.A0P
            goto L_0x07cf
        L_0x083e:
            X.91I r0 = X.AnonymousClass91I.A0N
            goto L_0x07cf
        L_0x0841:
            X.91I r0 = X.AnonymousClass91I.A0O
            goto L_0x07cf
        L_0x0844:
            X.91I r0 = X.AnonymousClass91I.A0i
            goto L_0x07cf
        L_0x0847:
            X.91I r0 = X.AnonymousClass91I.A0h
            goto L_0x07cf
        L_0x084a:
            X.91I r0 = X.AnonymousClass91I.A0p
            goto L_0x07cf
        L_0x084d:
            X.91I r0 = X.AnonymousClass91I.A0Y
            goto L_0x07cf
        L_0x0850:
            X.91I r0 = X.AnonymousClass91I.A0s
            goto L_0x07cf
        L_0x0854:
            X.91I r0 = X.AnonymousClass91I.A0u
            goto L_0x07cf
        L_0x0858:
            X.91I r0 = X.AnonymousClass91I.A0g
            goto L_0x07cf
        L_0x085c:
            X.91I r0 = X.AnonymousClass91I.A0f
            goto L_0x07cf
        L_0x0860:
            X.91I r0 = X.AnonymousClass91I.A0e
            goto L_0x07cf
        L_0x0864:
            X.91I r0 = X.AnonymousClass91I.A0d
            goto L_0x07cf
        L_0x0868:
            boolean r0 = r11 instanceof X.C186488wB
            if (r0 == 0) goto L_0x0893
            r0 = r11
            X.8wB r0 = (X.C186488wB) r0
            X.2cG r1 = r0.A00
            X.C18740tg.A06(r1)
            X.11F r0 = r0.A05
            if (r0 == 0) goto L_0x087b
            X.AnonymousClass8NG.A00(r0, r12)
        L_0x087b:
            java.lang.String r2 = r1.A00
            int r1 = r1.A00
            r0 = 55
            if (r1 == r0) goto L_0x11dd
            switch(r1) {
                case 22: goto L_0x11ce;
                case 23: goto L_0x11d1;
                case 24: goto L_0x11d4;
                case 25: goto L_0x11d7;
                case 26: goto L_0x11da;
                default: goto L_0x0886;
            }
        L_0x0886:
            switch(r1) {
                case 34: goto L_0x11c5;
                case 35: goto L_0x11c8;
                case 36: goto L_0x11cb;
                default: goto L_0x0889;
            }
        L_0x0889:
            switch(r1) {
                case 46: goto L_0x11b9;
                case 47: goto L_0x11bc;
                case 48: goto L_0x11bf;
                case 49: goto L_0x11c2;
                case 50: goto L_0x11e0;
                default: goto L_0x088c;
            }
        L_0x088c:
            java.lang.String r0 = "Invalid system action specified."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x0893:
            boolean r0 = r11 instanceof X.C186478wA
            if (r0 == 0) goto L_0x08b5
            r1 = r11
            X.8wA r1 = (X.C186478wA) r1
            X.2bI r0 = r1.A00
            X.C18740tg.A06(r0)
            X.C186828wl.A08(r12, r1)
            int r1 = r0.A00
            r0 = 62
            if (r1 != r0) goto L_0x08ae
            X.91I r0 = X.AnonymousClass91I.A1e
        L_0x08aa:
            r13.A0X(r0)
            return
        L_0x08ae:
            r0 = 63
            if (r1 != r0) goto L_0x1420
            X.91I r0 = X.AnonymousClass91I.A1g
            goto L_0x08aa
        L_0x08b5:
            boolean r0 = r11 instanceof X.C186468w9
            if (r0 == 0) goto L_0x08db
            r3 = r11
            X.8w9 r3 = (X.C186468w9) r3
            X.C36321k7.A0w(r13, r12)
            X.2bI r0 = r3.A00
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x142c
            int r1 = r0.A00
            r0 = 147(0x93, float:2.06E-43)
            if (r1 != r0) goto L_0x08d8
            X.91I r0 = X.AnonymousClass91I.BIZ_BOT_1P_MESSAGING_ENABLED
        L_0x08cd:
            r13.A0X(r0)
            X.11F r0 = r3.A05
            if (r0 == 0) goto L_0x1427
            X.AnonymousClass8NG.A00(r0, r12)
            return
        L_0x08d8:
            X.91I r0 = X.AnonymousClass91I.BIZ_BOT_3P_MESSAGING_ENABLED
            goto L_0x08cd
        L_0x08db:
            boolean r0 = r11 instanceof X.C186458w8
            if (r0 == 0) goto L_0x0902
            r2 = r11
            X.8w8 r2 = (X.C186458w8) r2
            X.2cL r1 = r2.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A0M
            r13.A0X(r0)
            X.11F r0 = r2.A05
            if (r0 == 0) goto L_0x08ff
            java.lang.String r0 = r0.getRawString()
        L_0x08f4:
            r12.A0X(r0)
            boolean r0 = r1.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0023
        L_0x08ff:
            java.lang.String r0 = ""
            goto L_0x08f4
        L_0x0902:
            boolean r0 = r11 instanceof X.C186448w7
            if (r0 == 0) goto L_0x092d
            r2 = r11
            X.8w7 r2 = (X.C186448w7) r2
            X.2bI r1 = r2.A00
            X.C18740tg.A06(r1)
            X.11F r0 = r1.A0J()
            if (r0 != 0) goto L_0x0918
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
        L_0x0918:
            r2.A06 = r0
            X.C186828wl.A08(r12, r2)
            X.91I r0 = X.AnonymousClass91I.A1f
            r13.A0X(r0)
            X.11F r0 = r2.A06
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.getRawString()
            goto L_0x0023
        L_0x092d:
            boolean r0 = r11 instanceof X.AnonymousClass8w6
            if (r0 == 0) goto L_0x0955
            r4 = r11
            X.8w6 r4 = (X.AnonymousClass8w6) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2I
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_PROMOTE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0955:
            boolean r0 = r11 instanceof X.AnonymousClass8w5
            if (r0 == 0) goto L_0x097d
            r4 = r11
            X.8w5 r4 = (X.AnonymousClass8w5) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2D
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_DEMOTE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x097d:
            boolean r0 = r11 instanceof X.C186438w4
            if (r0 == 0) goto L_0x09b6
            r6 = r11
            X.8w4 r6 = (X.C186438w4) r6
            X.8nX r1 = r6.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1y
            A05(r13, r0, r1, r6)
            java.lang.Object r0 = r1.A1M
            monitor-enter(r0)
            java.lang.String r5 = r1.A00     // Catch:{ all -> 0x1431 }
            monitor-exit(r0)     // Catch:{ all -> 0x1431 }
            java.lang.String r4 = r1.A01
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r2 = r6.A05
            X.0wN r1 = r6.A0F
            java.lang.String r0 = "GROUP_CHANGE_SUBJECT"
            X.144 r1 = A01(r1, r2, r3, r0)
            X.11F r0 = r6.A06
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            A03(r1, r0, r12, r13)
            if (r5 != 0) goto L_0x09af
            java.lang.String r5 = ""
        L_0x09af:
            r13.A0Y(r5)
            if (r4 == 0) goto L_0x0026
            goto L_0x077d
        L_0x09b6:
            boolean r0 = r11 instanceof X.C186428w3
            if (r0 == 0) goto L_0x0a12
            r4 = r11
            X.8w3 r4 = (X.C186428w3) r4
            X.2bI r2 = r4.A00
            X.C18740tg.A06(r2)
            int r1 = r2.A00
            r0 = 7
            if (r1 != r0) goto L_0x0a05
            java.util.ArrayList r1 = X.C165607th.A10()
            r4.A0B = r1
            X.11F r0 = r2.A0J()
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r1.add(r0)
        L_0x09d8:
            X.11F r0 = r4.A05
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x09f7
            X.91I r0 = X.AnonymousClass91I.A15
            r13.A0X(r0)
            java.lang.Class<X.8dx> r3 = X.C177538dx.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "BROADCAST_REMOVE"
        L_0x09eb:
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x09f7:
            X.91I r0 = X.AnonymousClass91I.A2J
            r13.A0X(r0)
            java.lang.Class<X.144> r3 = X.AnonymousClass144.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_REMOVE"
            goto L_0x09eb
        L_0x0a05:
            r0 = 14
            if (r1 != r0) goto L_0x09d8
            X.C186908wt.A08(r2, r4)
            X.8nz r2 = (X.C181758nz) r2
            A07(r4, r2)
            goto L_0x09d8
        L_0x0a12:
            boolean r0 = r11 instanceof X.C186788wh
            if (r0 == 0) goto L_0x0a4a
            r4 = r11
            X.8wh r4 = (X.C186788wh) r4
            X.8nA r2 = r4.A01
            X.C18740tg.A06(r2)
            com.whatsapp.jid.UserJid r0 = r2.A01
            r4.A06 = r0
            java.util.ArrayList r1 = X.C165607th.A10()
            r4.A0B = r1
            com.whatsapp.jid.UserJid r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r1.add(r0)
            X.91I r0 = X.AnonymousClass91I.A2C
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_CHANGE_NUMBER"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0a4a:
            boolean r0 = r11 instanceof X.C186778wg
            if (r0 == 0) goto L_0x0ab6
            r2 = r11
            X.8wg r2 = (X.C186778wg) r2
            X.8nz r1 = r2.A01
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A14
            r13.A0X(r0)
            java.util.List r0 = r1.A01
            int r0 = r0.size()
            r2.A00 = r0
            X.C186908wt.A08(r1, r2)
            java.lang.String r0 = r1.A0b()
            r2.A0A = r0
            X.C186828wl.A08(r12, r2)
            X.11F r0 = r2.A06
            if (r0 == 0) goto L_0x0ab2
            java.lang.String r0 = r0.getRawString()
            r13.A0Z(r0)
        L_0x0a7a:
            int r0 = r2.A00
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r13.A0Y(r0)
            java.lang.String r0 = r2.A0A
            if (r0 != 0) goto L_0x0a89
            java.lang.String r0 = ""
        L_0x0a89:
            r13.A0Y(r0)
            java.util.List r0 = r1.A01
            java.util.ArrayList r0 = X.C36361kB.A0r(r0)
            r2.A0B = r0
            java.util.List r0 = r1.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0a9a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            if (r0 != 0) goto L_0x0aae
            java.lang.String r0 = ""
        L_0x0aae:
            r13.A0Y(r0)
            goto L_0x0a9a
        L_0x0ab2:
            r13.A0U()
            goto L_0x0a7a
        L_0x0ab6:
            boolean r0 = r11 instanceof X.C186418w2
            if (r0 == 0) goto L_0x0b0d
            r4 = r11
            X.8w2 r4 = (X.C186418w2) r4
            X.2bI r2 = r4.A00
            X.C18740tg.A06(r2)
            java.util.List r0 = r2.A0e()
            if (r0 == 0) goto L_0x0af8
            java.util.List r0 = r2.A0e()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0af8
            X.C186908wt.A08(r2, r4)
            java.util.List r0 = r2.A0e()
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r0)
            r4.A0B = r0
        L_0x0adf:
            X.91I r0 = X.AnonymousClass91I.A2G
            r13.A0X(r0)
            java.lang.Class<X.144> r3 = X.AnonymousClass144.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_LEAVE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0af8:
            java.util.ArrayList r1 = X.C165607th.A10()
            r4.A0B = r1
            X.11F r0 = r2.A0J()
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            goto L_0x0adf
        L_0x0b0d:
            boolean r0 = r11 instanceof X.C186408w1
            if (r0 == 0) goto L_0x0b35
            r4 = r11
            X.8w1 r4 = (X.C186408w1) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2B
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_ADD_REQUEST_JOIN"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0b35:
            boolean r0 = r11 instanceof X.C186938ww
            if (r0 == 0) goto L_0x0c36
            r3 = r11
            X.8ww r3 = (X.C186938ww) r3
            X.8nz r2 = r3.A01
            X.C18740tg.A06(r2)
            boolean r4 = r3 instanceof X.C177088dB
            if (r4 == 0) goto L_0x0c1a
            X.91I r0 = X.AnonymousClass91I.A2E
        L_0x0b47:
            A05(r13, r0, r2, r3)
            java.lang.Class<com.whatsapp.jid.GroupJid> r5 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r3.A05
            if (r4 == 0) goto L_0x0bfe
            java.lang.String r4 = "GROUP_PARTICIPANT_INVITE"
        L_0x0b52:
            X.0wN r0 = r3.A0F
            X.144 r1 = A01(r0, r1, r5, r4)
            com.whatsapp.jid.UserJid r0 = A02(r0, r3, r4)
            A03(r1, r0, r12, r13)
            boolean r0 = r3 instanceof X.C177118dE
            if (r0 == 0) goto L_0x0ba4
            r6 = r3
            X.8dE r6 = (X.C177118dE) r6
            X.8nz r5 = r6.A01
            if (r5 == 0) goto L_0x0b96
            X.8ny r5 = (X.C181748ny) r5
            r0 = 2
            com.whatsapp.jid.GroupJid r4 = r5.A1b(r0)
            java.lang.String r1 = ""
            if (r4 == 0) goto L_0x0b7b
            java.lang.String r0 = r4.getRawString()
            if (r0 != 0) goto L_0x0b7c
        L_0x0b7b:
            r0 = r1
        L_0x0b7c:
            r13.A0Y(r0)
            X.12q r0 = r6.A00
            java.lang.String r0 = r0.A0D(r4)
            if (r0 != 0) goto L_0x0ba2
            r0 = 2
            java.lang.String r0 = r5.A1d(r0)
            if (r0 != 0) goto L_0x0ba2
        L_0x0b8e:
            r13.A0Y(r1)
            java.lang.String r0 = "false"
            r13.A0Y(r0)
        L_0x0b96:
            java.util.List r0 = r2.A01
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r0)
            r3.A0B = r0
            A06(r13, r0)
            return
        L_0x0ba2:
            r1 = r0
            goto L_0x0b8e
        L_0x0ba4:
            boolean r0 = r3 instanceof X.C177108dD
            if (r0 == 0) goto L_0x0b96
            r6 = r3
            X.8dD r6 = (X.C177108dD) r6
            X.8nz r5 = r6.A01
            if (r5 == 0) goto L_0x0b96
            boolean r0 = r5 instanceof X.C181668nq
            r4 = 0
            if (r0 == 0) goto L_0x0bdd
            X.8ny r5 = (X.C181748ny) r5
            r0 = 1
            com.whatsapp.jid.GroupJid r1 = r5.A1b(r0)
            if (r1 == 0) goto L_0x0bc1
            java.lang.String r4 = r1.getRawString()
        L_0x0bc1:
            X.12q r0 = r6.A00
            java.lang.String r1 = r0.A0D(r1)
            if (r1 != 0) goto L_0x0bce
            r0 = 1
            java.lang.String r1 = r5.A1d(r0)
        L_0x0bce:
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0bd3
            r4 = r0
        L_0x0bd3:
            r13.A0Y(r4)
            if (r1 != 0) goto L_0x0bd9
            r1 = r0
        L_0x0bd9:
            r13.A0Y(r1)
            goto L_0x0b96
        L_0x0bdd:
            boolean r0 = r5 instanceof X.C181398nP
            if (r0 == 0) goto L_0x0bfc
            X.8nP r5 = (X.C181398nP) r5
            X.3Qa r0 = r5.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x0bf9
            X.17c r0 = r6.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.147 r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0bf9
            java.lang.String r4 = r0.getRawString()
        L_0x0bf9:
            java.lang.String r1 = r5.A00
            goto L_0x0bce
        L_0x0bfc:
            r1 = r4
            goto L_0x0bce
        L_0x0bfe:
            boolean r0 = r3 instanceof X.C177098dC
            if (r0 == 0) goto L_0x0c06
            java.lang.String r4 = "CAG_INVITE_AUTO_JOINED"
            goto L_0x0b52
        L_0x0c06:
            boolean r0 = r3 instanceof X.C177118dE
            if (r0 == 0) goto L_0x0c0e
            java.lang.String r4 = "CAG_INVITE_AUTO_ADD"
            goto L_0x0b52
        L_0x0c0e:
            boolean r0 = r3 instanceof X.C177078dA
            if (r0 == 0) goto L_0x0c16
            java.lang.String r4 = "GROUP_PARTICIPANT_LINKED_GROUP_JOIN"
            goto L_0x0b52
        L_0x0c16:
            java.lang.String r4 = "GROUP_PARTICIPANT_JOINED_GROUP_AND_PARENT_GROUP"
            goto L_0x0b52
        L_0x0c1a:
            boolean r0 = r3 instanceof X.C177098dC
            if (r0 == 0) goto L_0x0c22
            X.91I r0 = X.AnonymousClass91I.A17
            goto L_0x0b47
        L_0x0c22:
            boolean r0 = r3 instanceof X.C177118dE
            if (r0 == 0) goto L_0x0c2a
            X.91I r0 = X.AnonymousClass91I.A16
            goto L_0x0b47
        L_0x0c2a:
            boolean r0 = r3 instanceof X.C177078dA
            if (r0 == 0) goto L_0x0c32
            X.91I r0 = X.AnonymousClass91I.A2H
            goto L_0x0b47
        L_0x0c32:
            X.91I r0 = X.AnonymousClass91I.A2F
            goto L_0x0b47
        L_0x0c36:
            boolean r0 = r11 instanceof X.C186398w0
            if (r0 == 0) goto L_0x0c5e
            r4 = r11
            X.8w0 r4 = (X.C186398w0) r4
            X.8nz r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2K
            A05(r13, r0, r1, r4)
            A07(r4, r1)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_V4_ADD_INVITE_SENT"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0c5e:
            boolean r0 = r11 instanceof X.C186388vz
            if (r0 == 0) goto L_0x0c83
            r4 = r11
            X.8vz r4 = (X.C186388vz) r4
            X.2bI r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1u
            A05(r13, r0, r1, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_CHANGE_INVITE_LINK"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0c83:
            boolean r0 = r11 instanceof X.C186768wf
            if (r0 == 0) goto L_0x0cad
            r3 = r11
            X.8wf r3 = (X.C186768wf) r3
            X.2bI r1 = r3.A01
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A24
            r13.A0X(r0)
            int r1 = r1.A00
            r0 = 73
            if (r1 != r0) goto L_0x0ca7
            r2 = 1
        L_0x0c9b:
            com.whatsapp.jid.GroupJid r1 = r3.A00
            r0 = 0
            A03(r1, r0, r12, r13)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto L_0x0023
        L_0x0ca7:
            r0 = 74
            if (r1 != r0) goto L_0x1434
            r2 = 0
            goto L_0x0c9b
        L_0x0cad:
            boolean r0 = r11 instanceof X.C186378vy
            if (r0 == 0) goto L_0x0d3c
            r5 = r11
            X.8vy r5 = (X.C186378vy) r5
            X.8n9 r1 = r5.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A1t
            r13.A0X(r0)
            java.lang.String r0 = r1.A1Z()
            r5.A0A = r0
            X.C186908wt.A08(r1, r5)
            com.whatsapp.data.ProfilePhotoChange r4 = r1.A00
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "GROUP_CHANGE_ICON"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            java.lang.String r0 = r5.A0A
            if (r0 != 0) goto L_0x0ce2
            java.lang.String r0 = "remove"
        L_0x0ce2:
            r13.A0Y(r0)
            if (r4 == 0) goto L_0x0026
            X.8QP r0 = X.AnonymousClass8QP.DEFAULT_INSTANCE
            X.8NN r3 = r0.A0p()
            byte[] r0 = r4.oldPhoto
            if (r0 == 0) goto L_0x0d01
            X.8I5 r2 = X.C90474aD.A0O(r3, r0)
            X.8Hz r1 = r3.A00
            X.8QP r1 = (X.AnonymousClass8QP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.oldPhoto_ = r2
        L_0x0d01:
            byte[] r0 = r4.newPhoto
            if (r0 == 0) goto L_0x0d15
            X.8I5 r2 = X.C90474aD.A0O(r3, r0)
            X.8Hz r1 = r3.A00
            X.8QP r1 = (X.AnonymousClass8QP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.newPhoto_ = r2
        L_0x0d15:
            int r2 = r4.newPhotoId
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8QP r1 = (X.AnonymousClass8QP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newPhotoId_ = r2
            X.8Hz r0 = r3.A0R()
            X.8QP r0 = (X.AnonymousClass8QP) r0
            X.8SU r2 = X.AnonymousClass8NN.A0J(r13)
            r0.getClass()
            r2.photoChange_ = r0
            int r1 = r2.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r0
            r2.bitField0_ = r1
            return
        L_0x0d3c:
            boolean r0 = r11 instanceof X.C186368vx
            if (r0 == 0) goto L_0x0d61
            r4 = r11
            X.8vx r4 = (X.C186368vx) r4
            X.2bI r1 = r4.A00
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A23
            A05(r13, r0, r1, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_DELETE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0d61:
            boolean r0 = r11 instanceof X.C186358vw
            if (r0 == 0) goto L_0x0d99
            r4 = r11
            X.8vw r4 = (X.C186358vw) r4
            X.2bI r1 = r4.A00
            X.C18740tg.A06(r1)
            java.lang.String r0 = r1.A0b()
            r4.A0A = r0
            X.11F r0 = r1.A0J()
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            r4.A06 = r0
            X.91I r0 = X.AnonymousClass91I.A1z
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_CREATE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            java.lang.String r1 = r4.A0A
            goto L_0x0077
        L_0x0d99:
            boolean r0 = r11 instanceof X.C186758we
            if (r0 == 0) goto L_0x0e02
            r4 = r11
            X.8we r4 = (X.C186758we) r4
            X.2bI r3 = r4.A01
            X.C18740tg.A06(r3)
            X.11F r2 = r3.A0J()
            r4.A06 = r2
            int r1 = r3.A00
            r0 = 4
            if (r1 != r0) goto L_0x0df3
            java.util.Set r0 = java.util.Collections.singleton(r2)
        L_0x0db4:
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r0)
            r4.A0B = r0
        L_0x0dba:
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0ddb
            X.91I r0 = X.AnonymousClass91I.A13
            r13.A0X(r0)
            java.lang.Class<X.8dx> r3 = X.C177538dx.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "BROADCAST_ADD"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
        L_0x0dd7:
            A04(r1, r0, r12, r13, r4)
            return
        L_0x0ddb:
            X.91I r0 = X.AnonymousClass91I.A2A
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r2 = r4.A05
            X.0wN r1 = r4.A0F
            java.lang.String r0 = "GROUP_PARTICIPANT_ADD"
            X.144 r1 = A01(r1, r2, r3, r0)
            X.11F r0 = r4.A06
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            goto L_0x0dd7
        L_0x0df3:
            r0 = 12
            if (r1 != r0) goto L_0x0dba
            java.util.List r0 = r3.A0e()
            if (r0 == 0) goto L_0x0dba
            java.util.List r0 = r3.A0e()
            goto L_0x0db4
        L_0x0e02:
            boolean r0 = r11 instanceof X.C186748wd
            if (r0 == 0) goto L_0x0e3b
            r2 = r11
            X.8wd r2 = (X.C186748wd) r2
            X.8nA r1 = r2.A01
            X.C18740tg.A06(r1)
            X.91I r0 = X.AnonymousClass91I.A2L
            r13.A0X(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            r2.A08 = r0
            com.whatsapp.jid.UserJid r0 = r1.A00
            r2.A07 = r0
            X.11F r0 = r2.A05
            if (r0 == 0) goto L_0x0e22
            X.AnonymousClass8NG.A00(r0, r12)
        L_0x0e22:
            com.whatsapp.jid.UserJid r0 = r2.A08
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0e39
            java.lang.String r0 = r0.getRawString()
        L_0x0e2c:
            r13.A0Y(r0)
            com.whatsapp.jid.UserJid r0 = r2.A07
            if (r0 == 0) goto L_0x0023
        L_0x0e33:
            java.lang.String r1 = r0.getRawString()
            goto L_0x0023
        L_0x0e39:
            r0 = r1
            goto L_0x0e2c
        L_0x0e3b:
            boolean r0 = r11 instanceof X.C186958wy
            if (r0 == 0) goto L_0x0e6e
            r4 = r11
            X.8wy r4 = (X.C186958wy) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r1 = r4.A00
            X.C18740tg.A06(r1)
            if (r1 == 0) goto L_0x0026
            X.91I r0 = X.C186958wy.A02
            A05(r13, r0, r1, r4)
            java.lang.String r0 = r1.A0m
            if (r0 != 0) goto L_0x0e57
            java.lang.String r0 = ""
        L_0x0e57:
            r13.A0Y(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "SUBGROUP_SUGGESTION_CREATED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0e6e:
            boolean r0 = r11 instanceof X.C186348vv
            if (r0 == 0) goto L_0x0ebb
            r6 = r11
            X.8vv r6 = (X.C186348vv) r6
            boolean r2 = X.C36331k8.A1a(r13, r12)
            X.8nz r1 = r6.A00
            X.C18740tg.A06(r1)
            X.8ny r1 = (X.C181748ny) r1
            X.91I r0 = X.AnonymousClass91I.A1T
            r13.A0X(r0)
            r5 = 0
            if (r1 == 0) goto L_0x0eb9
            X.C186908wt.A08(r1, r6)
            com.whatsapp.jid.GroupJid r5 = r1.A1b(r2)
            java.lang.String r4 = r1.A1d(r2)
        L_0x0e93:
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r6.A05
            X.0wN r2 = r6.A0F
            java.lang.String r0 = "ACTION_PARENT_GROUP_SUBJECT_CHANGED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r6, r0)
            A03(r1, r0, r12, r13)
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0eb0
            java.lang.String r0 = r5.getRawString()
            if (r0 != 0) goto L_0x0eb1
        L_0x0eb0:
            r0 = r1
        L_0x0eb1:
            r13.A0Y(r0)
        L_0x0eb4:
            if (r4 != 0) goto L_0x077d
            r4 = r1
            goto L_0x077d
        L_0x0eb9:
            r4 = r5
            goto L_0x0e93
        L_0x0ebb:
            boolean r0 = r11 instanceof X.C186998x2
            if (r0 == 0) goto L_0x0ee5
            r4 = r11
            X.8x2 r4 = (X.C186998x2) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r1 = r4.A01
            X.C18740tg.A06(r1)
            if (r1 == 0) goto L_0x0026
            X.91I r0 = X.C186998x2.A03
            A05(r13, r0, r1, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GROUP_DEACTIVATED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0ee5:
            boolean r0 = r11 instanceof X.C186988x1
            if (r0 == 0) goto L_0x0f1a
            r4 = r11
            X.8x1 r4 = (X.C186988x1) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r1 = r4.A01
            X.C18740tg.A06(r1)
            if (r1 == 0) goto L_0x0026
            X.91I r0 = X.C186988x1.A03
            A05(r13, r0, r1, r4)
            X.8na r1 = (X.C181508na) r1
            X.8zi r0 = r1.A1j()
            java.lang.String r0 = r0.reason
            r13.A0Y(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GENERAL_CHAT_AUTO_ADD_DISABLED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0f1a:
            boolean r0 = r11 instanceof X.C186978x0
            if (r0 == 0) goto L_0x0f7a
            r4 = r11
            X.8x0 r4 = (X.C186978x0) r4
            X.C36321k7.A0w(r13, r12)
            X.2bI r3 = r4.A00
            X.C18740tg.A06(r3)
            if (r3 == 0) goto L_0x0026
            X.91I r0 = X.C186978x0.A03
            A05(r13, r0, r3, r4)
            int r2 = r3.A00
            r0 = 149(0x95, float:2.09E-43)
            java.lang.String r1 = ""
            if (r2 != r0) goto L_0x0f72
            X.8ny r3 = (X.C181748ny) r3
            java.lang.String r0 = r3.A0m
            if (r0 != 0) goto L_0x0f3f
            r0 = r1
        L_0x0f3f:
            r13.A0Y(r0)
        L_0x0f42:
            r0 = 2
            java.lang.String r0 = r3.A1d(r0)
            if (r0 == 0) goto L_0x0f4a
            r1 = r0
        L_0x0f4a:
            r13.A0Y(r1)
            int r0 = r3.A1a()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r0 = r0 ^ 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0Y(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "GENERAL_CHAT_ADD"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            return
        L_0x0f72:
            java.lang.String r0 = "created"
            r13.A0Y(r0)
            X.8ny r3 = (X.C181748ny) r3
            goto L_0x0f42
        L_0x0f7a:
            boolean r0 = r11 instanceof X.C186868wp
            if (r0 == 0) goto L_0x0ffd
            r8 = r11
            X.8wp r8 = (X.C186868wp) r8
            r1 = 0
            boolean r0 = X.C36341k9.A1a(r13, r12)
            X.8nL r3 = r8.A02
            if (r3 == 0) goto L_0x143b
            X.C186908wt.A08(r3, r8)
            com.whatsapp.jid.GroupJid r7 = r3.A1b(r0)
            java.lang.String r6 = r3.A1d(r0)
            r0 = 2
            java.lang.String r4 = r3.A1d(r0)
            X.91I r0 = X.AnonymousClass91I.A1h
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r5 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r8.A05
            X.0wN r2 = r8.A0F
            java.lang.String r0 = "EMPTY_SUBGROUP_CREATE"
            X.144 r1 = A01(r2, r1, r5, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r8, r0)
            A03(r1, r0, r12, r13)
            java.lang.String r2 = ""
            if (r7 == 0) goto L_0x0fbc
            java.lang.String r0 = r7.getRawString()
            if (r0 != 0) goto L_0x0fbd
        L_0x0fbc:
            r0 = r2
        L_0x0fbd:
            r13.A0Y(r0)
            X.12q r1 = r8.A00
            java.lang.String r0 = r1.A0D(r7)
            if (r0 != 0) goto L_0x0ffb
            if (r6 != 0) goto L_0x0fcb
            r6 = r2
        L_0x0fcb:
            r13.A0Y(r6)
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            java.lang.String r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x0ff9
            if (r4 != 0) goto L_0x0fdb
            r4 = r2
        L_0x0fdb:
            r13.A0Y(r4)
            int r0 = r3.A1a()
            if (r0 != 0) goto L_0x0feb
            r0 = 0
        L_0x0fe5:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0023
        L_0x0feb:
            r1 = 2
            int r0 = r3.A1a()
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0fe5
        L_0x0ff9:
            r4 = r0
            goto L_0x0fdb
        L_0x0ffb:
            r6 = r0
            goto L_0x0fcb
        L_0x0ffd:
            boolean r0 = r11 instanceof X.C186738wc
            if (r0 == 0) goto L_0x1038
            r5 = r11
            X.8wc r5 = (X.C186738wc) r5
            X.8nz r1 = r5.A00
            X.C18740tg.A06(r1)
            r4 = r1
            X.2cS r4 = (X.AnonymousClass2cS) r4
            X.91I r0 = X.AnonymousClass91I.A1T
            A05(r13, r0, r1, r5)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "ACTION_PARENT_GROUP_SUBJECT_CHANGED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            X.147 r0 = r4.A01
            if (r0 != 0) goto L_0x1033
            java.lang.String r0 = ""
        L_0x102a:
            r13.A0Y(r0)
            java.lang.String r1 = r4.A1a()
            goto L_0x0023
        L_0x1033:
            java.lang.String r0 = r0.getRawString()
            goto L_0x102a
        L_0x1038:
            boolean r0 = r11 instanceof X.C186918wu
            if (r0 == 0) goto L_0x109c
            r6 = r11
            X.8wu r6 = (X.C186918wu) r6
            r2 = 0
            boolean r1 = X.C36341k9.A1a(r13, r12)
            X.8nw r0 = r6.A01
            if (r0 != 0) goto L_0x104e
            java.lang.String r0 = "attempt to create builder without message"
            X.C18740tg.A0D(r2, r0)
            return
        L_0x104e:
            X.C186908wt.A08(r0, r6)
            com.whatsapp.jid.GroupJid r5 = r0.A1b(r1)
            java.lang.String r4 = r0.A1d(r1)
            boolean r2 = r6 instanceof X.C174578Xq
            if (r2 == 0) goto L_0x1096
            r0 = r6
            X.8Xq r0 = (X.C174578Xq) r0
            X.91I r0 = r0.A00
        L_0x1062:
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r6.A05
            if (r2 == 0) goto L_0x1093
            java.lang.String r2 = "SUBGROUP_UNLINKED_FROM_PARENT"
        L_0x106d:
            X.0wN r0 = r6.A0F
            X.144 r1 = A01(r0, r1, r3, r2)
            com.whatsapp.jid.UserJid r0 = A02(r0, r6, r2)
            A03(r1, r0, r12, r13)
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x1084
            java.lang.String r0 = r5.getRawString()
            if (r0 != 0) goto L_0x1085
        L_0x1084:
            r0 = r1
        L_0x1085:
            r13.A0Y(r0)
            X.12q r0 = r6.A00
            java.lang.String r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x0eb4
            r4 = r0
            goto L_0x077d
        L_0x1093:
            java.lang.String r2 = "SUBGROUP_LINKED_TO_PARENT"
            goto L_0x106d
        L_0x1096:
            r0 = r6
            X.8Xp r0 = (X.C174568Xp) r0
            X.91I r0 = r0.A00
            goto L_0x1062
        L_0x109c:
            boolean r0 = r11 instanceof X.C186858wo
            if (r0 == 0) goto L_0x10e9
            r4 = r11
            X.8wo r4 = (X.C186858wo) r4
            X.8nz r1 = r4.A02
            X.C18740tg.A06(r1)
            r5 = r1
            X.8nQ r5 = (X.C181408nQ) r5
            int r0 = r5.A00
            boolean r0 = X.C63833Lp.A00(r0)
            if (r0 == 0) goto L_0x10e6
            X.91I r0 = X.AnonymousClass91I.A1N
        L_0x10b5:
            A05(r13, r0, r1, r4)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "ACTION_SYSTEM_COMMUNITY_LINK_CHANGED"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            com.whatsapp.jid.GroupJid r1 = r5.A01
            if (r1 == 0) goto L_0x10d6
            java.lang.String r0 = r1.getRawString()
            r13.A0Y(r0)
        L_0x10d6:
            X.16D r0 = r4.A00
            X.141 r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0026
            X.171 r0 = r4.A01
            java.lang.String r1 = r0.A0H(r1)
            goto L_0x0077
        L_0x10e6:
            X.91I r0 = X.AnonymousClass91I.A1X
            goto L_0x10b5
        L_0x10e9:
            boolean r0 = r11 instanceof X.C186838wm
            if (r0 == 0) goto L_0x1120
            r8 = r11
            X.8wm r8 = (X.C186838wm) r8
            r1 = 0
            boolean r0 = X.C36341k9.A1a(r13, r12)
            X.8nx r4 = r8.A01
            if (r4 == 0) goto L_0x143b
            X.C186908wt.A08(r4, r8)
            com.whatsapp.jid.GroupJid r7 = r4.A1b(r0)
            java.lang.String r6 = r4.A1d(r0)
            int r5 = r4.A00
            r3 = 144(0x90, float:2.02E-43)
            if (r5 == r3) goto L_0x11fd
            switch(r5) {
                case 122: goto L_0x1200;
                case 123: goto L_0x11fa;
                case 124: goto L_0x11f7;
                case 125: goto L_0x11f4;
                case 126: goto L_0x11f1;
                case 127: goto L_0x11ee;
                case 128: goto L_0x11eb;
                default: goto L_0x110d;
            }
        L_0x110d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SystemAction '"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "' not supported."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r0, r1)
            throw r1
        L_0x1120:
            boolean r0 = r11 instanceof X.C186728wb
            if (r0 == 0) goto L_0x114b
            r5 = r11
            X.8wb r5 = (X.C186728wb) r5
            X.8nz r1 = r5.A00
            X.C18740tg.A06(r1)
            r4 = r1
            X.8nP r4 = (X.C181398nP) r4
            X.91I r0 = X.AnonymousClass91I.A1S
            A05(r13, r0, r1, r5)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r5.A05
            X.0wN r2 = r5.A0F
            java.lang.String r0 = "ACTION_PARENT_GROUP_DELETE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r5, r0)
            A03(r1, r0, r12, r13)
            java.lang.String r1 = r4.A00
            goto L_0x020a
        L_0x114b:
            boolean r0 = r11 instanceof X.C186718wa
            if (r0 == 0) goto L_0x1262
            r4 = r11
            X.8wa r4 = (X.C186718wa) r4
            X.8nz r1 = r4.A01
            X.C18740tg.A06(r1)
            java.lang.String r0 = r1.A0b()
            r4.A0A = r0
            X.11F r0 = r1.A0J()
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)
            r4.A06 = r0
            X.91I r0 = X.AnonymousClass91I.A1K
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r3 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r4.A05
            X.0wN r2 = r4.A0F
            java.lang.String r0 = "ACTION_COMMUNITY_CREATE"
            X.144 r1 = A01(r2, r1, r3, r0)
            com.whatsapp.jid.UserJid r0 = A02(r2, r4, r0)
            A03(r1, r0, r12, r13)
            X.17c r1 = r4.A00
            X.11F r0 = r4.A05
            X.147 r0 = X.C65533Sl.A01(r0)
            X.147 r0 = r1.A02(r0)
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            if (r0 != 0) goto L_0x1193
            java.lang.String r0 = ""
        L_0x1193:
            r13.A0Y(r0)
            java.lang.String r1 = r4.A0A
            goto L_0x020a
        L_0x119a:
            X.91I r0 = X.AnonymousClass91I.A04
            r13.A0X(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0026
            goto L_0x0077
        L_0x11a7:
            r13.A0Y(r0)
            goto L_0x0023
        L_0x11ac:
            r13.A0Y(r1)
            goto L_0x0023
        L_0x11b1:
            java.lang.String r1 = "regular"
            goto L_0x0023
        L_0x11b5:
            java.lang.String r1 = "off"
            goto L_0x0023
        L_0x11b9:
            X.91I r0 = X.AnonymousClass91I.A0q
            goto L_0x11e2
        L_0x11bc:
            X.91I r0 = X.AnonymousClass91I.A0r
            goto L_0x11e2
        L_0x11bf:
            X.91I r0 = X.AnonymousClass91I.A0K
            goto L_0x11e2
        L_0x11c2:
            X.91I r0 = X.AnonymousClass91I.A0L
            goto L_0x11e2
        L_0x11c5:
            X.91I r0 = X.AnonymousClass91I.A3E
            goto L_0x11e2
        L_0x11c8:
            X.91I r0 = X.AnonymousClass91I.A3G
            goto L_0x11e2
        L_0x11cb:
            X.91I r0 = X.AnonymousClass91I.A3D
            goto L_0x11e2
        L_0x11ce:
            X.91I r0 = X.AnonymousClass91I.A37
            goto L_0x11e2
        L_0x11d1:
            X.91I r0 = X.AnonymousClass91I.A33
            goto L_0x11e2
        L_0x11d4:
            X.91I r0 = X.AnonymousClass91I.A38
            goto L_0x11e2
        L_0x11d7:
            X.91I r0 = X.AnonymousClass91I.A32
            goto L_0x11e2
        L_0x11da:
            X.91I r0 = X.AnonymousClass91I.A2Q
            goto L_0x11e2
        L_0x11dd:
            X.91I r0 = X.AnonymousClass91I.A0D
            goto L_0x11e2
        L_0x11e0:
            X.91I r0 = X.AnonymousClass91I.A0C
        L_0x11e2:
            r13.A0X(r0)
            if (r2 == 0) goto L_0x0026
            r13.A0Y(r2)
            return
        L_0x11eb:
            X.91I r0 = X.AnonymousClass91I.A1P
            goto L_0x1202
        L_0x11ee:
            X.91I r0 = X.AnonymousClass91I.A2w
            goto L_0x1202
        L_0x11f1:
            X.91I r0 = X.AnonymousClass91I.A2v
            goto L_0x1202
        L_0x11f4:
            X.91I r0 = X.AnonymousClass91I.A1L
            goto L_0x1202
        L_0x11f7:
            X.91I r0 = X.AnonymousClass91I.A1U
            goto L_0x1202
        L_0x11fa:
            X.91I r0 = X.AnonymousClass91I.A1M
            goto L_0x1202
        L_0x11fd:
            X.91I r0 = X.AnonymousClass91I.A2u
            goto L_0x1202
        L_0x1200:
            X.91I r0 = X.AnonymousClass91I.A1K
        L_0x1202:
            r13.A0X(r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r2 = com.whatsapp.jid.GroupJid.class
            X.11F r1 = r8.A05
            X.8Hz r0 = r13.A00
            X.8SU r0 = (X.AnonymousClass8SU) r0
            X.91I r0 = r0.A0u()
            java.lang.String r0 = r0.name()
            X.0wN r10 = r8.A0F
            X.144 r9 = A01(r10, r1, r2, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            X.11F r1 = r8.A06
            X.8Hz r0 = r13.A00
            X.8SU r0 = (X.AnonymousClass8SU) r0
            X.91I r0 = r0.A0u()
            java.lang.String r0 = r0.name()
            com.whatsapp.jid.Jid r0 = A00(r10, r1, r2, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            A03(r9, r0, r12, r13)
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x123e
            java.lang.String r0 = r7.getRawString()
            if (r0 != 0) goto L_0x123f
        L_0x123e:
            r0 = r1
        L_0x123f:
            r13.A0Y(r0)
            X.12q r0 = r8.A00
            java.lang.String r0 = r0.A0D(r7)
            if (r0 != 0) goto L_0x1260
            if (r6 != 0) goto L_0x124d
            r6 = r1
        L_0x124d:
            r13.A0Y(r6)
            if (r5 == r3) goto L_0x1256
            r0 = 125(0x7d, float:1.75E-43)
            if (r5 != r0) goto L_0x0026
        L_0x1256:
            r0 = 2
            java.lang.String r0 = r4.A1d(r0)
            if (r0 == 0) goto L_0x0023
            r1 = r0
            goto L_0x0023
        L_0x1260:
            r6 = r0
            goto L_0x124d
        L_0x1262:
            boolean r0 = r11 instanceof X.C186928wv
            if (r0 == 0) goto L_0x0026
            r2 = r11
            X.8wv r2 = (X.C186928wv) r2
            X.8nz r1 = r2.A03
            X.C18740tg.A06(r1)
            boolean r4 = r2 instanceof X.C174618Xu
            if (r4 != 0) goto L_0x136b
            boolean r0 = r2 instanceof X.C174608Xt
            if (r0 != 0) goto L_0x1367
            boolean r0 = r2 instanceof X.C174598Xs
            if (r0 != 0) goto L_0x128a
            boolean r0 = r2 instanceof X.C174588Xr
            if (r0 != 0) goto L_0x1363
            boolean r0 = r2 instanceof X.C174558Xo
            if (r0 != 0) goto L_0x136b
            boolean r0 = r2 instanceof X.C174548Xn
            if (r0 != 0) goto L_0x1367
            boolean r0 = r2 instanceof X.C174538Xm
            if (r0 == 0) goto L_0x1363
        L_0x128a:
            X.91I r0 = X.AnonymousClass91I.A1Y
        L_0x128c:
            A05(r13, r0, r1, r2)
            java.lang.Class<com.whatsapp.jid.GroupJid> r5 = com.whatsapp.jid.GroupJid.class
            X.11F r3 = r2.A05
            if (r4 == 0) goto L_0x132f
            java.lang.String r4 = "FMessageSystemSubgroupUnlinkInParent"
        L_0x1297:
            X.0wN r0 = r2.A0F
            X.144 r3 = A01(r0, r3, r5, r4)
            com.whatsapp.jid.UserJid r0 = A02(r0, r2, r4)
            A03(r3, r0, r12, r13)
            X.12q r4 = r2.A01
            boolean r0 = r1 instanceof X.AnonymousClass2cS
            if (r0 == 0) goto L_0x12d9
            X.2cS r1 = (X.AnonymousClass2cS) r1
            java.util.Set r0 = r1.A03
        L_0x12ae:
            if (r0 == 0) goto L_0x0026
            java.util.Iterator r3 = r0.iterator()
        L_0x12b4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r3.next()
            X.3QK r2 = (X.AnonymousClass3QK) r2
            com.whatsapp.jid.GroupJid r1 = r2.A02
            java.lang.String r0 = r1.getRawString()
            r13.A0Y(r0)
            java.lang.String r0 = r4.A0D(r1)
            if (r0 != 0) goto L_0x12d5
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x12d5
            java.lang.String r0 = ""
        L_0x12d5:
            r13.A0Y(r0)
            goto L_0x12b4
        L_0x12d9:
            boolean r0 = r1 instanceof X.C181698nt
            if (r0 == 0) goto L_0x1324
            X.8ny r1 = (X.C181748ny) r1
            java.util.List r0 = r1.A00
            java.util.ArrayList r5 = X.C36411kG.A13(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x12e9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x12ff
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9Wj r0 = (X.C195869Wj) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x12e9
            r5.add(r2)
            goto L_0x12e9
        L_0x12ff:
            java.util.ArrayList r3 = X.C36321k7.A0J(r5)
            java.util.Iterator r2 = r5.iterator()
        L_0x1307:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x131f
            java.lang.Object r0 = r2.next()
            X.9Wj r0 = (X.C195869Wj) r0
            com.whatsapp.jid.GroupJid r1 = r0.A02
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x131b
            java.lang.String r0 = ""
        L_0x131b:
            X.C165587tf.A1A(r1, r0, r3)
            goto L_0x1307
        L_0x131f:
            java.util.HashSet r0 = X.C007103b.A0U(r3)
            goto L_0x12ae
        L_0x1324:
            boolean r0 = r1 instanceof X.C181708nu
            if (r0 == 0) goto L_0x0026
            X.8nu r1 = (X.C181708nu) r1
            java.util.HashSet r0 = r1.A1g()
            goto L_0x12ae
        L_0x132f:
            boolean r0 = r2 instanceof X.C174608Xt
            if (r0 == 0) goto L_0x1337
            java.lang.String r4 = "FMessageSystemSubgroupLinkInParent"
            goto L_0x1297
        L_0x1337:
            boolean r0 = r2 instanceof X.C174598Xs
            if (r0 == 0) goto L_0x133f
            java.lang.String r4 = "ACTION_SYSTEM_SIBLING_UNLINK_IN_CAG"
            goto L_0x1297
        L_0x133f:
            boolean r0 = r2 instanceof X.C174588Xr
            if (r0 == 0) goto L_0x1347
            java.lang.String r4 = "ACTION_SYSTEM_SIBLING_LINK_IN_CAG"
            goto L_0x1297
        L_0x1347:
            boolean r0 = r2 instanceof X.C174558Xo
            if (r0 == 0) goto L_0x134f
            java.lang.String r4 = "ACTION_SYSTEM_SUBGROUP_UNLINK"
            goto L_0x1297
        L_0x134f:
            boolean r0 = r2 instanceof X.C174548Xn
            if (r0 == 0) goto L_0x1357
            java.lang.String r4 = "ACTION_SYSTEM_SUBGROUP_LINK"
            goto L_0x1297
        L_0x1357:
            boolean r0 = r2 instanceof X.C174538Xm
            if (r0 == 0) goto L_0x135f
            java.lang.String r4 = "ACTION_SYSTEM_SIBLING_UNLINK"
            goto L_0x1297
        L_0x135f:
            java.lang.String r4 = "ACTION_SYSTEM_SIBLING_LINK"
            goto L_0x1297
        L_0x1363:
            X.91I r0 = X.AnonymousClass91I.A1Q
            goto L_0x128c
        L_0x1367:
            X.91I r0 = X.AnonymousClass91I.A1R
            goto L_0x128c
        L_0x136b:
            X.91I r0 = X.AnonymousClass91I.A1Z
            goto L_0x128c
        L_0x136f:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)
            throw r1
        L_0x1374:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)
            throw r1
        L_0x1379:
            X.91I r0 = X.C186948wx.A01
            r13.A0X(r0)
            X.C186828wl.A08(r12, r4)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.11F r2 = r1.A0J()
            X.0wN r1 = r4.A0F
            java.lang.String r0 = "SUPPORT_AI_EDUCATION"
            com.whatsapp.jid.Jid r0 = A00(r1, r2, r3, r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r4.A06 = r0
            return
        L_0x1394:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)
            throw r1
        L_0x1399:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)
            throw r1
        L_0x139e:
            java.lang.String r0 = "Invalid System Action"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13a5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupMembershipJoinApprovalModeWebQuery/onCreateWebInfoBuilder Cannot parse msg action "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x13b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupMemberAddModeWebQuery/onCreateWebInfoBuilder Cannot parse msg action "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x13bb:
            r13.A0Y(r1)
            r13.A0Y(r0)
            return
        L_0x13c2:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13c9:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13d0:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid system action: "
            r1.append(r0)
            if (r5 == 0) goto L_0x13e8
            int r0 = r5.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x13e8:
            java.lang.String r0 = X.AnonymousClass000.A0o(r3, r1)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13f1:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13f8:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x13ff:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x1406:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x140d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid system action. Found: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " Wanted: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x1420:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x1427:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r2)
            throw r1
        L_0x142c:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r2)
            throw r1
        L_0x1431:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x1431 }
            throw r1
        L_0x1434:
            java.lang.String r0 = "Invalid system action."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x143b:
            java.lang.String r0 = "attempt to create builder without message"
            X.C18740tg.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180898mb.A0D(X.8NG, X.8NK):void");
    }
}
