package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.3pa  reason: invalid class name and case insensitive filesystem */
public final class C76873pa implements C236119d {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass4U3 A03;
    public final AnonymousClass3B9 A04;
    public final AnonymousClass19A A05;
    public final String A06;
    public final C19700wN A07;
    public final C20350xQ A08;

    public static void A00(String str, AbstractCollection abstractCollection, AnonymousClass1AL[] r3) {
        abstractCollection.add(new C203399nx(str, r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r13.A0E(982) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r13.A0E(5385) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r7.A09 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018c, code lost:
        if (r6.isEmpty() != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r13.A0E(982) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r23 = this;
            r4 = r23
            X.19A r0 = r4.A05
            r22 = r0
            java.lang.String r21 = r22.A09()
            X.3B9 r7 = r4.A04
            java.lang.String r11 = r7.A04
            java.util.List r6 = r7.A05
            int r12 = r7.A00
            boolean r14 = r7.A0B
            com.whatsapp.jid.GroupJid r9 = r7.A01
            java.lang.String r5 = r7.A03
            X.0yC r13 = r4.A02
            X.0yV r1 = X.C21000yV.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C20800yB.A01(r1, r13, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002b
            boolean r0 = r7.A09
            r20 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r20 = 0
        L_0x002d:
            boolean r19 = X.AnonymousClass000.A1R(r12)
            r2 = 982(0x3d6, float:1.376E-42)
            if (r9 == 0) goto L_0x003d
            boolean r0 = r13.A0E(r2)
            r18 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            r18 = 0
        L_0x003f:
            if (r14 == 0) goto L_0x0049
            boolean r0 = r13.A0E(r2)
            r17 = 1
            if (r0 != 0) goto L_0x004b
        L_0x0049:
            r17 = 0
        L_0x004b:
            if (r20 != 0) goto L_0x004f
            if (r14 == 0) goto L_0x005c
        L_0x004f:
            boolean r0 = r13.A0E(r2)
            if (r0 == 0) goto L_0x005c
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r15 = 1
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            if (r14 == 0) goto L_0x0069
            r0 = 5385(0x1509, float:7.546E-42)
            boolean r0 = r13.A0E(r0)
            r16 = 1
            if (r0 != 0) goto L_0x006b
        L_0x0069:
            r16 = 0
        L_0x006b:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.lang.String r8 = "jid"
            if (r6 == 0) goto L_0x0099
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0099
            r10 = 0
        L_0x007a:
            int r0 = r6.size()
            if (r10 >= r0) goto L_0x0099
            java.lang.Object r0 = r6.get(r10)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.1AL[] r2 = new X.AnonymousClass1AL[r1]
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r8)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = "participant"
            A00(r0, r3, r2)
            int r10 = r10 + 1
            r1 = 1
            goto L_0x007a
        L_0x0099:
            if (r19 == 0) goto L_0x021f
            X.1AL[] r10 = new X.AnonymousClass1AL[r1]
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "expiration"
            boolean r2 = X.C36371kC.A1Y(r0, r1, r10)
            java.lang.String r0 = "ephemeral"
            A00(r0, r3, r10)
        L_0x00ac:
            if (r18 == 0) goto L_0x00bd
            r0 = 1
            X.1AL[] r1 = new X.AnonymousClass1AL[r0]
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r8)
            r1[r2] = r0
            java.lang.String r0 = "linked_parent"
            A00(r0, r3, r1)
        L_0x00bd:
            r1 = 0
            if (r17 == 0) goto L_0x00f5
            r0 = 2447(0x98f, float:3.429E-42)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x021c
            r0 = 1
            X.1AL[] r8 = new X.AnonymousClass1AL[r0]
            java.lang.String r2 = "default_membership_approval_mode"
            java.lang.String r0 = "request_required"
            X.C36381kD.A1N(r2, r0, r8)
        L_0x00d2:
            java.lang.String r0 = "parent"
            A00(r0, r3, r8)
            r0 = 3829(0xef5, float:5.366E-42)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x00ec
            r0 = 4530(0x11b2, float:6.348E-42)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            A00(r0, r3, r1)
        L_0x00ec:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "create_general_chat"
            A00(r0, r3, r1)
        L_0x00f5:
            java.lang.String r9 = "membership_approval_mode"
            java.lang.String r10 = "off"
            java.lang.String r2 = "state"
            java.lang.String r8 = "group_join"
            if (r20 == 0) goto L_0x0117
            java.lang.String r0 = "breakout"
            A00(r0, r3, r1)
            r0 = 1
            X.1AL[] r0 = new X.AnonymousClass1AL[r0]
            X.C36381kD.A1N(r2, r10, r0)
            X.9nx r12 = new X.9nx
            r12.<init>(r8, r0)
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r12, (java.lang.String) r9, (X.AnonymousClass1AL[]) r1)
            r3.add(r0)
        L_0x0117:
            if (r15 == 0) goto L_0x013a
            X.0wo r12 = r4.A01
            X.0wQ r0 = r4.A00
            java.lang.String r12 = X.C237919w.A00(r0, r12)
            r0 = 1
            X.1AL[] r15 = new X.AnonymousClass1AL[r0]
            java.lang.String r0 = "id"
            X.C36381kD.A1N(r0, r12, r15)
            java.lang.String r0 = "body"
            X.9nx r12 = new X.9nx
            r12.<init>((java.lang.String) r0, (java.lang.String) r5, (X.AnonymousClass1AL[]) r1)
            java.lang.String r5 = "description"
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r12, (java.lang.String) r5, (X.AnonymousClass1AL[]) r15)
            r3.add(r0)
        L_0x013a:
            java.lang.String r12 = "all_member_add"
            java.lang.String r5 = "member_add_mode"
            if (r14 != 0) goto L_0x0210
            if (r20 != 0) goto L_0x0210
            if (r18 == 0) goto L_0x014c
            r0 = 7180(0x1c0c, float:1.0061E-41)
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x0210
        L_0x014c:
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0152
            java.lang.String r12 = "admin_add"
        L_0x0152:
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r5, (java.lang.String) r12, (X.AnonymousClass1AL[]) r1)
            r3.add(r0)
            r0 = 1
            X.1AL[] r5 = new X.AnonymousClass1AL[r0]
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0163
            java.lang.String r10 = "on"
        L_0x0163:
            X.C36381kD.A1N(r2, r10, r5)
            X.9nx r2 = new X.9nx
            r2.<init>(r8, r5)
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r2, (java.lang.String) r9, (X.AnonymousClass1AL[]) r1)
            r3.add(r0)
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x017c
            java.lang.String r0 = "announcement"
            A00(r0, r3, r1)
        L_0x017c:
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "locked"
            A00(r0, r3, r1)
        L_0x0185:
            if (r17 == 0) goto L_0x018e
            boolean r0 = r6.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x018f
        L_0x018e:
            r2 = 1
        L_0x018f:
            java.lang.String r0 = "CreateGroupApiHandler/getNodeChildren request cannot have both <parent/> and <participant/> tags."
            X.C18740tg.A0D(r2, r0)
            int r0 = r3.size()
            if (r0 == 0) goto L_0x01a3
            r0 = 0
            X.9nx[] r0 = new X.C203399nx[r0]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.9nx[] r1 = (X.C203399nx[]) r1
        L_0x01a3:
            java.lang.String r10 = r4.A06
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            r6 = r8 ^ 1
            r0 = r9 ^ 1
            int r6 = r6 + r0
            X.1AL[] r5 = new X.AnonymousClass1AL[r6]
            java.lang.String r2 = "key"
            r7 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0205
            if (r9 != 0) goto L_0x01bf
            X.C36341k9.A1L(r2, r10, r5, r7)
        L_0x01bf:
            r2 = 0
            java.lang.String r0 = "create"
            if (r1 != 0) goto L_0x01fc
            if (r6 > 0) goto L_0x01c7
            r5 = r2
        L_0x01c7:
            X.9nx r6 = new X.9nx
            r6.<init>(r0, r5)
        L_0x01cc:
            r0 = 4
            X.1AL[] r5 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1S(r5, r7)
            r0 = r21
            X.C36331k8.A1R(r0, r5, r3)
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36341k9.A1L(r1, r0, r5, r2)
            r3 = 3
            X.8e1 r2 = X.C177578e1.A00
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r5[r3] = r0
            X.9nx r3 = X.C36391kE.A0m(r6, r5)
            r5 = 14
            r6 = 20000(0x4e20, double:9.8813E-320)
            r1 = r22
            r2 = r4
            r4 = r21
            r1.A0K(r2, r3, r4, r5, r6)
            return
        L_0x01fc:
            if (r6 > 0) goto L_0x01ff
            r5 = r2
        L_0x01ff:
            X.9nx r6 = new X.9nx
            r6.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r5, (X.C203399nx[]) r1)
            goto L_0x01cc
        L_0x0205:
            java.lang.String r0 = "subject"
            X.C36341k9.A1L(r0, r11, r5, r7)
            if (r9 != 0) goto L_0x01bf
            X.C36341k9.A1L(r2, r10, r5, r3)
            goto L_0x01bf
        L_0x0210:
            if (r16 == 0) goto L_0x0185
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r5, (java.lang.String) r12, (X.AnonymousClass1AL[]) r1)
            r3.add(r0)
            goto L_0x0185
        L_0x021c:
            r8 = r1
            goto L_0x00d2
        L_0x021f:
            r2 = 0
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76873pa.A01():void");
    }

    public void BVN(String str) {
        this.A03.Bj9();
    }

    public C76873pa(C19700wN r2, C19730wQ r3, C19970wo r4, C20810yC r5, C20350xQ r6, AnonymousClass4U3 r7, AnonymousClass3B9 r8, AnonymousClass19A r9) {
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = r2;
        this.A00 = r3;
        this.A05 = r9;
        this.A08 = r6;
        this.A03 = r7;
        this.A06 = r8.A02.getRawString();
        this.A04 = r8;
    }

    public void BWw(C203399nx r4, String str) {
        Pair A012 = AnonymousClass3ME.A01(r4);
        if (A012 != null) {
            int A042 = C36381kD.A04(A012);
            String str2 = (String) A012.second;
            if (A042 == 500 && str2 != null && str2.equals("internal-server-error")) {
                A042 = -500;
            }
            this.A03.onError(A042);
        }
    }

    public void BiM(C203399nx r9, String str) {
        C203399nx A0a = r9.A0a();
        C203399nx.A0A(A0a, "group");
        try {
            String A0i = A0a.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            C18740tg.A06(A0i);
            AnonymousClass147 A022 = AnonymousClass143.A02(A0i);
            Class<UserJid> cls = UserJid.class;
            A0a.A0X(cls, "creator");
            AnonymousClass6R8.A01(A0a.A0i("creation", (String) null), 0);
            A0a.A0i("subject", (String) null);
            AnonymousClass6R8.A01(A0a.A0i("s_t", (String) null), 0);
            A0a.A0X(cls, "s_o");
            A0a.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            AnonymousClass39E r3 = new AnonymousClass39E(A022);
            AnonymousClass3R9.A00(this.A02, r3, r9, "group");
            C20350xQ r2 = this.A08;
            Log.i("groupmgr/onGroupCreated/");
            r3.A04.keySet();
            Map map = r3.A02;
            if (!map.isEmpty()) {
                r2.A0T(3001, map);
            }
            this.A03.BiP(r3, A022);
        } catch (C19740wR unused) {
            this.A03.onError(800);
        }
    }
}
