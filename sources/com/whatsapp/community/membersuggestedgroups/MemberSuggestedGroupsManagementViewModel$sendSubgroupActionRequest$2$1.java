package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {471, 474, 476, 483}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $groupsToUpdate;
    public final /* synthetic */ C006302t $networkCall;
    public final /* synthetic */ AnonymousClass05L $this_apply;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(List list, C023509x r3, C006302t r4, AnonymousClass05L r5) {
        super(2, r3);
        this.$networkCall = r4;
        this.$this_apply = r5;
        this.$groupsToUpdate = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(this.$groupsToUpdate, r6, this.$networkCall, this.$this_apply);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r4 = 4
            r9 = 3
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r7) goto L_0x0025
            if (r0 == r3) goto L_0x00bf
            if (r0 == r9) goto L_0x00bf
            if (r0 == r4) goto L_0x00bf
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0017:
            X.AnonymousClass0AN.A00(r14)
            X.02t r0 = r13.$networkCall
            r13.label = r7
            java.lang.Object r14 = r0.invoke(r13)
            if (r14 != r5) goto L_0x0028
            return r5
        L_0x0025:
            X.AnonymousClass0AN.A00(r14)
        L_0x0028:
            X.30u r14 = (X.C587230u) r14
            boolean r0 = r14 instanceof X.AnonymousClass2F8
            if (r0 == 0) goto L_0x00a7
            X.2F8 r14 = (X.AnonymousClass2F8) r14
            java.util.List r11 = r14.A00
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x004e
            X.05L r2 = r13.$this_apply
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
            java.util.List r0 = r13.$groupsToUpdate
            java.util.Map r0 = X.C36391kE.A11(r1, r0)
            r13.label = r3
        L_0x0047:
            java.lang.Object r0 = r2.B6N(r0, r13)
        L_0x004b:
            if (r0 != r5) goto L_0x00c2
            return r5
        L_0x004e:
            X.05L r10 = r13.$this_apply
            X.011[] r8 = new X.AnonymousClass011[r3]
            r12 = 0
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            java.util.List r1 = r13.$groupsToUpdate
            java.util.Set r4 = X.C007103b.A0f(r11)
            X.AnonymousClass00C.A0D(r1, r12)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0069
            java.util.List r4 = X.C007103b.A0Y(r4)
        L_0x0069:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x008b
            java.util.List r3 = X.C007103b.A0Y(r1)
        L_0x0075:
            X.C36341k9.A1J(r6, r3, r8, r12)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            X.C36341k9.A1J(r0, r11, r8, r7)
            java.util.LinkedHashMap r0 = X.C000400e.A07(r8)
            r13.label = r9
            java.lang.Object r0 = r10.B6N(r0, r13)
            goto L_0x004b
        L_0x008b:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x0093
            r3.add(r1)
            goto L_0x0093
        L_0x00a7:
            X.2F9 r0 = X.AnonymousClass2F9.A00
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)
            if (r0 == 0) goto L_0x00c2
            X.05L r2 = r13.$this_apply
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.util.List r0 = r13.$groupsToUpdate
            java.util.Map r0 = X.C36391kE.A11(r1, r0)
            r13.label = r4
            goto L_0x0047
        L_0x00bf:
            X.AnonymousClass0AN.A00(r14)
        L_0x00c2:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
