package X;

import android.widget.BaseAdapter;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1;
import com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1;
import com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.group.HistorySettingViewModel$updateEnabled$1;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4WB  reason: invalid class name */
public class AnonymousClass4WB extends C24511Cs {
    public Object A00;
    public final int A01;

    public AnonymousClass4WB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(AnonymousClass6X6 r3, AnonymousClass144 r4) {
        if (24 - this.A01 != 0) {
            super.A01(r3, r4);
            return;
        }
        AnonymousClass00C.A0D(r4, 0);
        if (r4 instanceof AnonymousClass147) {
            AnonymousClass3OF.A00((AnonymousClass3OF) this.A00, C36411kG.A15(r4));
        }
    }

    public void A02(AnonymousClass147 r5) {
        switch (this.A01) {
            case 5:
            case 25:
                ((AnonymousClass27v) this.A00).A3q();
                return;
            case 6:
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
                if (AnonymousClass00C.A0J(r5, memberSuggestedGroupsManagementViewModel.A08)) {
                    C36331k8.A1T(new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(memberSuggestedGroupsManagementViewModel, (C023509x) null), C109325Xd.A00(memberSuggestedGroupsManagementViewModel));
                    return;
                }
                return;
            case 19:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A00;
                C36331k8.A1T(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C023509x) null), C109325Xd.A00(historySettingViewModel));
                return;
            default:
                super.A02(r5);
                return;
        }
    }

    public void A03(AnonymousClass147 r5) {
        switch (this.A01) {
            case 5:
            case 25:
                ((AnonymousClass27v) this.A00).A3q();
                return;
            case 6:
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
                if (AnonymousClass00C.A0J(r5, memberSuggestedGroupsManagementViewModel.A08)) {
                    C36331k8.A1T(new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(memberSuggestedGroupsManagementViewModel, (C023509x) null), C109325Xd.A00(memberSuggestedGroupsManagementViewModel));
                    return;
                }
                return;
            case 19:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A00;
                C36331k8.A1T(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C023509x) null), C109325Xd.A00(historySettingViewModel));
                return;
            default:
                super.A03(r5);
                return;
        }
    }

    public void A04(AnonymousClass147 r5) {
        switch (this.A01) {
            case 4:
                ((C40021ub) this.A00).A0M.execute(new C80263v7(this, r5, 10));
                return;
            case 7:
                AnonymousClass00C.A0D(r5, 0);
                AnonymousClass3BL r3 = (AnonymousClass3BL) this.A00;
                C36331k8.A1T(new CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(r3, r5, (C023509x) null), r3.A0F);
                return;
            case 24:
                AnonymousClass00C.A0D(r5, 0);
                AnonymousClass3OF.A00((AnonymousClass3OF) this.A00, C36411kG.A15(r5));
                return;
            default:
                super.A04(r5);
                return;
        }
    }

    public void A05(AnonymousClass147 r6) {
        switch (this.A01) {
            case 4:
                C40021ub r4 = (C40021ub) this.A00;
                if (r4.A0S.get(r6) != null) {
                    AnonymousClass1LV r1 = r4.A03;
                    AnonymousClass00C.A0D(r6, 0);
                    C26831Lr r3 = r1.A09;
                    if (r3.A01.A01(new C65893Tw(r3, 4), r6).size() <= 0 && C40021ub.A04(r4, r6)) {
                        r4.A0M.execute(new C81093wS((Object) this, 5));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                AnonymousClass00C.A0D(r6, 0);
                AnonymousClass3BL r32 = (AnonymousClass3BL) this.A00;
                C36331k8.A1T(new CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(r32, r6, (C023509x) null), r32.A0F);
                return;
            case 24:
                AnonymousClass00C.A0D(r6, 0);
                AnonymousClass3OF.A00((AnonymousClass3OF) this.A00, C36411kG.A15(r6));
                return;
            default:
                super.A05(r6);
                return;
        }
    }

    public void A06(Set set) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                CallLogActivity.A07((CallLogActivity) this.A00);
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A0h.A0U();
                contactInfoActivity.A1o();
                return;
            case 2:
                ListChatInfoActivity.A0w((ListChatInfoActivity) this.A00);
                return;
            case 3:
                AnonymousClass00C.A0D(set, 0);
                HashSet hashSet = new HashSet(set);
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                hashSet.retainAll(communityMembersViewModel.A07.B9u(communityMembersViewModel.A0I));
                if (C36411kG.A1a(hashSet)) {
                    C36381kD.A1R(communityMembersViewModel.A0J, new CommunityMembersViewModel$refreshCommunityMembers$1(communityMembersViewModel, (C023509x) null), C109325Xd.A00(communityMembersViewModel));
                    return;
                }
                return;
            case 5:
            case 9:
            case 25:
                ((AnonymousClass27v) this.A00).A3q();
                return;
            case 8:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A3r) {
                    ContactPickerFragment.A0G(contactPickerFragment);
                    return;
                }
                return;
            case 10:
                ((AnonymousClass28d) this.A00).A0H();
                return;
            case 11:
                AnonymousClass28f.A02((AnonymousClass28f) this.A00);
                return;
            case 12:
                baseAdapter = ((MediaAlbumActivity) this.A00).A0B;
                break;
            case 13:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 14:
                ((AnonymousClass2JG) this.A00).A05.notifyDataSetChanged();
                return;
            case 15:
                C40001uV r5 = (C40001uV) this.A00;
                AnonymousClass141 r4 = ((AnonymousClass3QM) r5.A0R.getValue()).A02;
                if (r4 != null) {
                    C36381kD.A1R(r5.A0G, new CommentsBottomSheetViewModel$refreshSendPermission$1$1(r5, r4, (C023509x) null), C109325Xd.A00(r5));
                    return;
                }
                return;
            case 16:
                C39951uL r0 = (C39951uL) this.A00;
                r0.A0T();
                C36341k9.A18(r0.A0H, true);
                return;
            case 17:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                GroupAdminPickerActivity.A0G(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                return;
            case 18:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (set.contains(groupChatInfoActivity.A1Y)) {
                    GroupChatInfoActivity.A14(groupChatInfoActivity);
                    return;
                }
                return;
            case 20:
                PopupNotification.A0F((PopupNotification) this.A00);
                return;
            case 21:
                AnonymousClass00C.A0D(set, 0);
                NotificationsAndSoundsViewModel notificationsAndSoundsViewModel = (NotificationsAndSoundsViewModel) this.A00;
                if (C007103b.A0j(set, notificationsAndSoundsViewModel.A00)) {
                    C81173wa.A01(notificationsAndSoundsViewModel.A06, notificationsAndSoundsViewModel, 3);
                    return;
                }
                return;
            case 22:
                StatusPlaybackContactFragment.A0B((StatusPlaybackContactFragment) this.A00);
                return;
            case 23:
                C40771w5 r02 = ((AnonymousClass3PF) this.A00).A01;
                if (r02 == null) {
                    throw C36331k8.A0Y();
                }
                r02.A06();
                return;
            case 24:
                AnonymousClass00C.A0D(set, 0);
                AnonymousClass3OF.A00((AnonymousClass3OF) this.A00, set);
                return;
            default:
                super.A06(set);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }
}
