package X;

import android.os.Bundle;
import com.whatsapp.community.CommunitySettingsActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import com.whatsapp.newsletter.viewmodel.NewsletterListViewModel;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.4ZE  reason: invalid class name */
public class AnonymousClass4ZE implements AnonymousClass04G {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass04R B3o(Class cls) {
        C40111uw r2;
        Class cls2 = cls;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(cls2, 0);
                if (cls2.isAssignableFrom(C40111uw.class)) {
                    CommunitySettingsActivity communitySettingsActivity = (CommunitySettingsActivity) this.A00;
                    AnonymousClass147 r0 = communitySettingsActivity.A0C;
                    AnonymousClass147 r16 = r0;
                    if (r0 != null) {
                        C19970wo r18 = communitySettingsActivity.A07;
                        C20810yC r23 = communitySettingsActivity.A0D;
                        AnonymousClass17Y r36 = communitySettingsActivity.A05;
                        C19730wQ r35 = communitySettingsActivity.A02;
                        C19770wU r17 = communitySettingsActivity.A04;
                        C220412q r14 = communitySettingsActivity.A04;
                        if (r14 != null) {
                            C21010yW r13 = communitySettingsActivity.A08;
                            if (r13 != null) {
                                AnonymousClass19A r12 = communitySettingsActivity.A0D;
                                if (r12 != null) {
                                    RtaXmppClient rtaXmppClient = communitySettingsActivity.A0F;
                                    if (rtaXmppClient != null) {
                                        AnonymousClass16D r10 = communitySettingsActivity.A02;
                                        if (r10 != null) {
                                            AnonymousClass171 r9 = communitySettingsActivity.A03;
                                            if (r9 != null) {
                                                AnonymousClass1EM r8 = communitySettingsActivity.A0H;
                                                if (r8 != null) {
                                                    C20350xQ r7 = communitySettingsActivity.A09;
                                                    if (r7 != null) {
                                                        C20510xg r6 = communitySettingsActivity.A0B;
                                                        if (r6 != null) {
                                                            C27561Or r5 = communitySettingsActivity.A0E;
                                                            if (r5 != null) {
                                                                C24381Cf r4 = communitySettingsActivity.A05;
                                                                if (r4 != null) {
                                                                    C27541Op r3 = communitySettingsActivity.A0A;
                                                                    if (r3 != null) {
                                                                        AnonymousClass17X r1 = communitySettingsActivity.A07;
                                                                        if (r1 != null) {
                                                                            C19600wD r34 = communitySettingsActivity.A07;
                                                                            AnonymousClass1PF r02 = communitySettingsActivity.A06;
                                                                            if (r02 != null) {
                                                                                AnonymousClass2xY r15 = communitySettingsActivity.A00;
                                                                                if (r15 != null) {
                                                                                    C19770wU r33 = r17;
                                                                                    AnonymousClass2xY r122 = r15;
                                                                                    AnonymousClass17Y r132 = r36;
                                                                                    C19730wQ r142 = r35;
                                                                                    C19600wD r152 = r34;
                                                                                    r2 = new C40111uw(r122, r132, r142, r152, r10, r9, r18, r14, r4, r02, r1, r23, r13, r7, r3, r6, r16, r12, r5, rtaXmppClient, r8, r33);
                                                                                } else {
                                                                                    throw C36331k8.A0d("groupMembershipApprovalModeApiHandlerFactory");
                                                                                }
                                                                            } else {
                                                                                throw C36331k8.A0d("groupMembershipApprovalRequestStore");
                                                                            }
                                                                        } else {
                                                                            throw C36331k8.A0d("groupParticipantsManager");
                                                                        }
                                                                    } else {
                                                                        throw C36331k8.A0d("groupDataChangeListeners");
                                                                    }
                                                                } else {
                                                                    throw C36331k8.A0d("conversationObservers");
                                                                }
                                                            } else {
                                                                throw C36331k8.A0d("rtaExperimentUtils");
                                                            }
                                                        } else {
                                                            throw C36331k8.A0d("groupXmppMethods");
                                                        }
                                                    } else {
                                                        throw C36331k8.A0d("groupChatManager");
                                                    }
                                                } else {
                                                    throw C36331k8.A0d("groupChatUtils");
                                                }
                                            } else {
                                                throw C36331k8.A0d("wAContactNames");
                                            }
                                        } else {
                                            throw C36331k8.A0Z();
                                        }
                                    } else {
                                        throw C36331k8.A0d("rtaXmppClient");
                                    }
                                } else {
                                    throw C36331k8.A0d("messageClient");
                                }
                            } else {
                                throw C36331k8.A0d("wamRuntime");
                            }
                        } else {
                            throw C36331k8.A0d("chatsCache");
                        }
                    } else {
                        r2 = null;
                    }
                    AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type T of com.whatsapp.community.CommunitySettingsActivity.<no name provided>.invoke.<no name provided>.create");
                    return r2;
                }
                throw AnonymousClass001.A08("Invalid viewModel");
            case 1:
                MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = (MemberSuggestedGroupsManagementActivity) this.A00;
                C57052xb r19 = memberSuggestedGroupsManagementActivity.A02;
                if (r19 != null) {
                    AnonymousClass147 A0k = C36431kI.A0k(memberSuggestedGroupsManagementActivity.A0E);
                    C005602m A002 = C25141Fd.A00();
                    C18800tq r22 = r19.A00.A01;
                    C20810yC A0V = C36341k9.A0V(r22);
                    AnonymousClass1LV A0U = C36361kB.A0U(r22);
                    AnonymousClass16D A0R = C36341k9.A0R(r22);
                    C233117z A0c = C36371kC.A0c(r22);
                    C26801Lo A0f = C36431kI.A0f(r22);
                    C19600wD A0c2 = C36391kE.A0c(r22);
                    C220412q A0a = C36351kA.A0a(r22);
                    return new MemberSuggestedGroupsManagementViewModel(C36351kA.A0N(r22), A0U, (MemberSuggestedGroupsManager) r22.A4q.get(), A0c2, A0R, A0a, (C24541Cv) r22.A4O.get(), A0V, A0c, A0f, A0k, A002);
                }
                throw C36331k8.A0d("memberSuggestedGroupsManagementViewModelFactory");
            case 2:
                AlertCardListFragment alertCardListFragment = (AlertCardListFragment) this.A00;
                if (alertCardListFragment.A00 != null) {
                    AnonymousClass1EW r03 = alertCardListFragment.A01;
                    if (r03 != null) {
                        return new C39531sb(r03);
                    }
                    throw C36331k8.A0d("alertStorage");
                }
                throw C36331k8.A0d("alertListViewModelFactory");
            case 3:
                AnonymousClass00C.A0D(cls2, 0);
                if (cls2.isAssignableFrom(C40101uv.class)) {
                    Bundle bundle = (Bundle) this.A00;
                    AnonymousClass00C.A07(bundle);
                    return new C40101uv(bundle);
                }
                throw AnonymousClass001.A08("Invalid viewModel");
            default:
                C18800tq r24 = ((C57682ye) this.A00).A00.A01;
                C30131Zi A0m = C36431kI.A0m(r24);
                return new NewsletterListViewModel((AnonymousClass1ZX) r24.A5X.get(), (C71723hE) r24.A00.A2y.get(), A0m);
        }
    }

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }
}
