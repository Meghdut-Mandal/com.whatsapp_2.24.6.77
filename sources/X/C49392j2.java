package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1;
import java.util.List;

/* renamed from: X.2j2  reason: invalid class name and case insensitive filesystem */
public class C49392j2 extends C03030Cw implements C009003v {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C49392j2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel> r3 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.class
            r1 = 2
            java.lang.String r4 = "onSingleAction"
            java.lang.String r5 = "onSingleAction(Lcom/whatsapp/community/membersuggestedgroups/SubgroupSuggestion;Lcom/whatsapp/community/membersuggestedgroups/SubgroupAction;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.30t> r3 = X.C587130t.class
            r1 = 2
            java.lang.String r4 = "handleResponseParsing"
            java.lang.String r5 = "handleResponseParsing(Lcom/whatsapp/community/iq/RemoveCommunityParticipantsRequest;Lcom/whatsapp/protocol/ProtocolTreeNode;)Lcom/whatsapp/community/iq/RemoveCommunityParticipantsResponse;"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49392j2.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        switch (this.A00) {
            case 0:
            case 1:
                C80053ui r9 = (C80053ui) obj;
                C203399nx r4 = (C203399nx) obj3;
                C36321k7.A0w(r9, r4);
                return AnonymousClass96I.A00(r9, r4);
            default:
                C51452nq r42 = (C51452nq) obj3;
                C36331k8.A1I(obj, r42);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.receiver;
                List A11 = C36371kC.A11(obj);
                C36381kD.A1R(memberSuggestedGroupsManagementViewModel.A09, new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(memberSuggestedGroupsManagementViewModel, r42, A11, (C023509x) null, false), C109325Xd.A00(memberSuggestedGroupsManagementViewModel));
                return AnonymousClass0AJ.A00;
        }
    }
}
