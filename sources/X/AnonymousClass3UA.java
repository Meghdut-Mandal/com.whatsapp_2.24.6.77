package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3UA  reason: invalid class name */
public final class AnonymousClass3UA {
    public static final AnonymousClass3UA A00 = new AnonymousClass3UA();

    public static final int A00(C203399nx r4) {
        try {
            C203399nx A0c = r4.A0c("ephemeral");
            if (A0c != null) {
                return A0c.A0S("expiration", 0);
            }
        } catch (Exception e) {
            Log.e(C36331k8.A0i("GroupProtocolTreeNodeHelper/getEphemeralDuration ", AnonymousClass000.A0u(), e), e);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r5 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3QL A05(X.C203399nx r7, X.C203399nx r8) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r0 = "description"
            X.9nx r4 = r7.A0c(r0)
            if (r4 == 0) goto L_0x003e
            java.lang.String r0 = "body"
            X.9nx r3 = r4.A0c(r0)
            java.lang.String r0 = "delete"
            X.9nx r2 = r4.A0c(r0)
            if (r3 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Node: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " contains both a body and delete child: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x003c:
            if (r3 != 0) goto L_0x0044
        L_0x003e:
            X.3QL r0 = X.AnonymousClass3QL.A05
            X.AnonymousClass00C.A09(r0)
            return r0
        L_0x0044:
            java.lang.String r0 = r3.A0e()
            if (r0 == 0) goto L_0x0097
            java.lang.String r5 = r3.A0e()
            if (r5 == 0) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            r4 = 0
            goto L_0x006c
        L_0x0053:
            X.1AL[] r0 = r4.A0k()
            if (r0 == 0) goto L_0x003c
            int r0 = r0.length
            if (r0 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0044
            java.lang.String r5 = ""
        L_0x0060:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "id"
            java.lang.String r4 = X.C36391kE.A0x(r4, r0)
        L_0x006c:
            X.C18740tg.A06(r8)
            r1 = 0
            java.lang.String r0 = "t"
            long r6 = r8.A0V(r0, r1)
            X.C18740tg.A06(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r3 = r8.A0X(r1, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.C18740tg.A06(r8)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r2 = r8.A0X(r1, r0)
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
            X.3QL r1 = new X.3QL
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0097:
            java.lang.String r1 = "Non-empty description tag with no body"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UA.A05(X.9nx, X.9nx):X.3QL");
    }

    public static LinkedHashMap A06(C203399nx r2, Object obj) {
        return A07(r2, new C42241yV(obj, 2));
    }

    public static final boolean A08(C203399nx r4) {
        C203399nx A0c;
        C203399nx A0c2 = r4.A0c("membership_approval_mode");
        if (A0c2 == null || (A0c = A0c2.A0c("group_join")) == null) {
            return false;
        }
        return "on".equals(A0c.A0i("state", ""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.A0c("parent");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.C203399nx r5) {
        /*
            r4 = this;
            r3 = 0
            int r0 = A02(r5)
            r2 = 1
            if (r0 != r2) goto L_0x001f
            java.lang.String r0 = "parent"
            X.9nx r1 = r5.A0c(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "default_membership_approval_mode"
            java.lang.String r1 = X.C36391kE.A0x(r1, r0)
            java.lang.String r0 = "request_required"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UA.A09(X.9nx):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0093, code lost:
        if (r5.equals("false") == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3QD A0A(X.C203399nx r43, X.C006302t r44, X.C006302t r45, int r46) {
        /*
            r42 = this;
            r1 = 1
            r0 = r43
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.String r2 = "id"
            r1 = 0
            java.lang.String r2 = r0.A0i(r2, r1)
            X.C18740tg.A06(r2)
            X.147 r6 = X.AnonymousClass143.A02(r2)
            X.AnonymousClass00C.A08(r6)
            java.lang.String r2 = "truncated"
            java.lang.String r2 = r0.A0i(r2, r1)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = "size"
            java.lang.String r1 = r0.A0i(r2, r1)
            r0 = 0
            int r0 = X.AnonymousClass6R8.A00(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3QD r0 = new X.3QD
            r0.<init>(r6, r1)
        L_0x0037:
            r1 = r44
            r1.invoke(r0)
            return r0
        L_0x003d:
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r12 = r0.A0X(r7, r2)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r5 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r2 = "creator_pn"
            com.whatsapp.jid.Jid r10 = r0.A0X(r5, r2)
            com.whatsapp.jid.PhoneUserJid r10 = (com.whatsapp.jid.PhoneUserJid) r10
            java.lang.String r2 = "creation"
            java.lang.String r4 = r0.A0i(r2, r1)
            r2 = 0
            long r24 = X.AnonymousClass6R8.A01(r4, r2)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 * r8
            java.lang.String r4 = "subject"
            java.lang.String r16 = r0.A0i(r4, r1)
            java.lang.String r4 = "s_o"
            com.whatsapp.jid.Jid r13 = r0.A0X(r7, r4)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.String r4 = "s_o_pn"
            com.whatsapp.jid.Jid r11 = r0.A0X(r5, r4)
            com.whatsapp.jid.PhoneUserJid r11 = (com.whatsapp.jid.PhoneUserJid) r11
            java.lang.String r4 = "s_t"
            java.lang.String r4 = r0.A0i(r4, r1)
            long r26 = X.AnonymousClass6R8.A01(r4, r2)
            long r26 = r26 * r8
            java.lang.String r4 = "ack"
            java.lang.String r5 = r0.A0i(r4, r1)
            if (r5 == 0) goto L_0x0095
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)
            r37 = 0
            if (r4 != 0) goto L_0x0097
        L_0x0095:
            r37 = 1
        L_0x0097:
            java.lang.String r4 = "type"
            java.lang.String r17 = r0.A0i(r4, r1)
            java.lang.String r4 = "locked"
            boolean r31 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "announcement"
            boolean r32 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "incognito"
            boolean r35 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r33 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "suspended"
            boolean r34 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "support"
            boolean r30 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "a_v_id"
            long r28 = r0.A0V(r4, r2)
            java.lang.String r2 = "addressing_mode"
            java.lang.String r7 = r0.A0i(r2, r1)
            java.lang.String r2 = "allow_admin_reports"
            boolean r38 = X.C36331k8.A1Z(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r39 = X.C36331k8.A1Z(r0, r2)
            r2 = r46 & 1
            if (r2 == 0) goto L_0x013a
            r2 = r45
            java.util.LinkedHashMap r3 = A07(r0, r2)
            int r2 = X.C36371kC.A05(r0, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00eb:
            X.3QL r14 = X.AnonymousClass3QL.A05
            r4 = r46 & 2
            if (r4 == 0) goto L_0x00f5
            X.3QL r14 = A04(r0)
        L_0x00f5:
            int r20 = A00(r0)
            r5 = r42
            X.3G4 r15 = r5.A0B(r0)
            java.lang.String r4 = "group_history"
            boolean r40 = X.C36331k8.A1Z(r0, r4)
            java.lang.String r4 = "auto_add_disabled"
            boolean r41 = X.C36331k8.A1Z(r0, r4)
            X.AnonymousClass00C.A0B(r14)
            r4 = 3
            X.3S5 r8 = new X.3S5
            r8.<init>(r1, r4)
            int r21 = A02(r0)
            X.147 r9 = A03(r0)
            boolean r36 = A08(r0)
            int r22 = r5.A09(r0)
            java.lang.String r18 = X.C54102sP.A00(r7)
            int r23 = A01(r0)
            X.9gO r7 = new X.9gO
            r19 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.3QD r0 = new X.3QD
            r0.<init>(r7, r6, r2)
            goto L_0x0037
        L_0x013a:
            r2 = 0
            r3 = 0
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UA.A0A(X.9nx, X.02t, X.02t, int):X.3QD");
    }

    public final AnonymousClass3G4 A0B(C203399nx r8) {
        if (A02(r8) == 1) {
            return null;
        }
        C203399nx A0c = r8.A0c("growth_locked");
        if (A0c == null) {
            return new AnonymousClass3G4(0, 0);
        }
        String A0i = A0c.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
        if ("invite".equals(A0i)) {
            return new AnonymousClass3G4(1, A0c.A0U("expiration"));
        }
        C36321k7.A1Q("GroupProtocolTreeNodeHelper/getGrowthLock unexpected type: ", A0i, AnonymousClass000.A0u());
        return null;
    }

    public static final int A01(C203399nx r1) {
        C203399nx A0c = r1.A0c("member_add_mode");
        if (A0c != null) {
            return "all_member_add".equals(A0c.A0e()) ? 1 : 0;
        }
        return 0;
    }

    public static final int A02(C203399nx r5) {
        boolean A1V = AnonymousClass000.A1V(r5.A0c("default_sub_group"));
        boolean A1Z = C36331k8.A1Z(r5, "linked_parent");
        boolean A1Z2 = C36331k8.A1Z(r5, "parent");
        boolean A1V2 = AnonymousClass000.A1V(r5.A0c("general_chat"));
        if (A1Z2) {
            return 1;
        }
        if (A1V) {
            return 3;
        }
        if (A1V2) {
            return 6;
        }
        if (A1Z) {
            return 2;
        }
        return 0;
    }

    public static final AnonymousClass147 A03(C203399nx r2) {
        C203399nx A0c = r2.A0c("linked_parent");
        if (A0c == null) {
            return null;
        }
        return (AnonymousClass147) A0c.A0X(AnonymousClass147.class, "jid");
    }

    public static AnonymousClass3QL A04(C203399nx r1) {
        return A05(r1, r1.A0c("description"));
    }

    public static final LinkedHashMap A07(C203399nx r7, C006302t r8) {
        LinkedHashMap A1G = C36431kI.A1G();
        List A0j = r7.A0j("participant");
        AnonymousClass00C.A08(A0j);
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            Class<UserJid> cls = UserJid.class;
            UserJid userJid = (UserJid) A0s.A0X(cls, "jid");
            if (userJid != null) {
                AnonymousClass3ER r5 = new AnonymousClass3ER();
                String A0i = A0s.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                C18740tg.A06(A0i);
                r5.A00 = userJid;
                r5.A04 = A0i;
                UserJid userJid2 = (UserJid) A0s.A0X(cls, "lid");
                if (userJid2 != null) {
                    r5.A01 = userJid2;
                }
                String A0x = C36391kE.A0x(A0s, "display_name");
                if (A0x != null && !AnonymousClass14B.A0F(A0x)) {
                    r5.A03 = A0x;
                }
                UserJid userJid3 = (UserJid) A0s.A0X(cls, "phone_number");
                if (userJid3 != null) {
                    if (userJid instanceof PhoneUserJid) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("phone number attribute with pn jid. Mismatch: ");
                        r8.invoke(new AnonymousClass3HV(C36421kH.A0d(A0u, !userJid.equals(userJid3))));
                    }
                    r5.A02 = userJid3;
                }
                A1G.put(userJid, r5.A00());
            }
        }
        return A1G;
    }
}
