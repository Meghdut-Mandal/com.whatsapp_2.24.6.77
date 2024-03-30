package com.whatsapp.group;

import X.AnonymousClass00T;
import X.AnonymousClass3TE;
import X.AnonymousClass4GM;
import X.AnonymousClass4GN;
import X.AnonymousClass4GO;
import X.C000800j;
import X.C001400p;
import X.C220412q;
import X.C58252zZ;

public final class AddMembersRouter extends Hilt_AddMembersRouter {
    public C58252zZ A00;
    public C220412q A01;
    public final AnonymousClass00T A02 = AnonymousClass3TE.A02(this, "entry_point", 6);
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04 = AnonymousClass3TE.A03(this, "is_cag_and_community_add", false);
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06 = AnonymousClass3TE.A02(this, "request_invite_members", 1);
    public final AnonymousClass00T A07;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Q(android.os.Bundle r29) {
        /*
            r28 = this;
            r6 = r28
            r0 = r29
            super.A1Q(r0)
            if (r29 != 0) goto L_0x015b
            android.view.View r0 = r6.A0F
            X.C36331k8.A0y(r0)
            X.2zZ r4 = r6.A00
            if (r4 == 0) goto L_0x0154
            android.content.Context r5 = r6.A0a()
            X.01I r0 = r6.A0i()
            X.14u r7 = X.C36401kF.A0L(r0)
            X.00T r0 = r6.A03
            X.147 r18 = X.C36431kI.A0k(r0)
            X.00T r0 = r6.A05
            X.147 r19 = X.C36431kI.A0k(r0)
            X.00T r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            X.00T r0 = r6.A06
            int r25 = X.C36331k8.A02(r0)
            X.00T r0 = r6.A04
            boolean r27 = X.C36331k8.A1b(r0)
            X.00T r0 = r6.A02
            int r26 = X.C36331k8.A02(r0)
            X.4Bz r3 = new X.4Bz
            r3.<init>(r6)
            X.4K9 r2 = new X.4K9
            r2.<init>(r6)
            X.1ds r0 = r4.A00
            X.0tq r0 = r0.A02
            X.17X r13 = X.C36351kA.A0b(r0)
            X.0wD r9 = X.C36391kE.A0c(r0)
            X.004 r4 = r0.A6s
            java.lang.Object r15 = r4.get()
            X.0xQ r15 = (X.C20350xQ) r15
            X.0yC r14 = X.C36341k9.A0V(r0)
            X.1Cf r12 = X.C36371kC.A0Y(r0)
            X.17Y r8 = X.C36351kA.A0M(r0)
            X.190 r17 = X.C36351kA.A0h(r0)
            X.12q r11 = X.C36351kA.A0a(r0)
            X.16D r10 = X.C36341k9.A0R(r0)
            X.0xg r16 = X.C18800tq.ADm(r0)
            X.0tt r0 = r0.A00
            X.004 r4 = r0.A1s
            X.005 r20 = X.C18840tu.A00(r4)
            X.004 r0 = r0.A1t
            X.005 r21 = X.C18840tu.A00(r0)
            X.3OK r4 = new X.3OK
            r22 = r1
            r23 = r3
            r24 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.018 r3 = r4.A04
            X.04a r2 = new X.04a
            r2.<init>()
            r1 = 4
            X.3Ta r0 = new X.3Ta
            r0.<init>(r4, r1)
            X.04e r0 = r3.BnD(r0, r2)
            r4.A00 = r0
            java.util.List r1 = r4.A0E
            r1.isEmpty()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0150
            X.04e r3 = r4.A00
            if (r3 != 0) goto L_0x00c0
            java.lang.String r0 = "addMembersCaller"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c0:
            X.12q r0 = r4.A07
            X.147 r8 = r4.A0B
            java.lang.String r7 = r0.A0D(r8)
            if (r8 == 0) goto L_0x0146
            X.005 r0 = r4.A0C
            java.lang.Object r2 = r0.get()
            X.0xG r2 = (X.C20250xG) r2
            X.00T r0 = r4.A0H
            boolean r1 = X.C36331k8.A1b(r0)
            X.3C9 r0 = r2.A00
            X.3H3 r2 = r0.A00(r8)
            if (r1 == 0) goto L_0x0146
            X.0yC r1 = r2.A05
            r0 = 7608(0x1db8, float:1.0661E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0146
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0146
            android.content.Context r1 = r4.A03
            X.147 r9 = r4.A0A
            boolean r6 = r4.A0J
            X.005 r0 = r4.A0D
            r0.get()
            java.lang.String r0 = "com.whatsapp.community.DirectoryContactsLoader"
            java.util.Set r5 = X.C36411kG.A15(r0)
            int r4 = r4.A01
        L_0x0103:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.picker.AddGroupParticipantsSelector"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r7)
            java.lang.String r1 = X.C36381kD.A0w(r8)
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_cag_and_community_add"
            r2.putExtra(r0, r6)
            if (r5 == 0) goto L_0x013d
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "contacts_loader_keys"
            r2.putExtra(r0, r1)
        L_0x013d:
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r4)
            r3.A02(r2)
            return
        L_0x0146:
            android.content.Context r1 = r4.A03
            X.147 r9 = r4.A0A
            boolean r6 = r4.A0J
            int r4 = r4.A01
            r5 = 0
            goto L_0x0103
        L_0x0150:
            X.AnonymousClass3OK.A00(r4, r1)
            return
        L_0x0154:
            java.lang.String r0 = "addMembersResultHandlerFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.AddMembersRouter.A1Q(android.os.Bundle):void");
    }

    public AddMembersRouter() {
        C000800j r1 = C000800j.NONE;
        this.A03 = C001400p.A00(r1, new AnonymousClass4GM(this));
        this.A05 = C001400p.A00(r1, new AnonymousClass4GN(this));
        this.A07 = C001400p.A00(r1, new AnonymousClass4GO(this));
    }
}
