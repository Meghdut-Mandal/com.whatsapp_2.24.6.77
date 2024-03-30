package X;

import android.view.View;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatlock.ChatLockPrivacySettingsActivity;
import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.3MH  reason: invalid class name */
public class AnonymousClass3MH implements C32061ct {
    public Object A00;
    public final int A01;

    public AnonymousClass3MH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bf7(C63093Is r10) {
        ChatLockPrivacySettingsActivity chatLockPrivacySettingsActivity;
        int i;
        switch (this.A01) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                C51832oS r1 = r10.A02;
                if (r1 == C51832oS.SUCCESS) {
                    callLogActivity.A0B.A03 = true;
                    callLogActivity.A0a = true;
                    callLogActivity.A0C.A01(4, 0);
                    CallLogActivity.A01(callLogActivity);
                    return;
                } else if (r1 == C51832oS.ERROR_AUTH_NOT_SETUP) {
                    callLogActivity.A0B.A07((C53502rQ) null).B2U();
                    callLogActivity.A0B.A0D(callLogActivity, r10, new C69903eH(callLogActivity), callLogActivity.A0Q.A0H);
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass00C.A0D(r10, 0);
                C51832oS r12 = r10.A02;
                int ordinal = r12.ordinal();
                AnonymousClass3PA r5 = (AnonymousClass3PA) this.A00;
                if (ordinal != 0) {
                    AnonymousClass3PA.A00(r5, r12);
                } else {
                    C235718z A0a = C36411kG.A0a(r5.A0B);
                    AnonymousClass11F r4 = r5.A0A;
                    A0a.A0G(C36371kC.A11(r4), false);
                    AnonymousClass3L5 r3 = r5.A08;
                    r3.A04(r4, 0, (Integer) null, 6);
                    C25731Hl.A00(r3.A00, "new_remove_chat_count");
                }
                r5.A01();
                return;
            case 2:
                AnonymousClass00C.A0D(r10, 0);
                C51832oS r13 = r10.A02;
                C51832oS r0 = C51832oS.SUCCESS;
                AnonymousClass3PA r6 = (AnonymousClass3PA) this.A00;
                if (r13 == r0) {
                    boolean z = !C36411kG.A1a(r6.A09.A01);
                    AnonymousClass005 r42 = r6.A0B;
                    C36411kG.A0a(r42).A03 = true;
                    C235718z A0a2 = C36411kG.A0a(r42);
                    AnonymousClass11F r32 = r6.A0A;
                    A0a2.A0G(C36371kC.A11(r32), true);
                    AnonymousClass3L5 r52 = r6.A08;
                    r52.A04(r32, 0, (Integer) null, 5);
                    if (z) {
                        C235718z A0a3 = C36411kG.A0a(r42);
                        C36371kC.A1Q(A0a3.A09, A0a3, r6.A03, r6.A04, 13);
                    }
                    C25731Hl.A00(r52.A00, "new_add_chat_count");
                } else {
                    AnonymousClass3PA.A00(r6, r13);
                }
                r6.A01();
                return;
            case 3:
                AnonymousClass00C.A0D(r10, 0);
                int ordinal2 = r10.A02.ordinal();
                if (ordinal2 == 0 || ordinal2 == 2) {
                    chatLockPrivacySettingsActivity = (ChatLockPrivacySettingsActivity) this.A00;
                    C235718z r02 = chatLockPrivacySettingsActivity.A01;
                    if (r02 != null) {
                        r02.A08();
                        if (chatLockPrivacySettingsActivity.A01 != null) {
                            View view = chatLockPrivacySettingsActivity.A00;
                            C235718z.A02(C36391kE.A0I(chatLockPrivacySettingsActivity, view), view, true);
                            i = 8;
                        } else {
                            throw C36331k8.A0d("chatLockManager");
                        }
                    } else {
                        throw C36331k8.A0d("chatLockManager");
                    }
                } else {
                    chatLockPrivacySettingsActivity = (ChatLockPrivacySettingsActivity) this.A00;
                    if (chatLockPrivacySettingsActivity.A01 != null) {
                        View view2 = chatLockPrivacySettingsActivity.A00;
                        C235718z.A02(C36391kE.A0I(chatLockPrivacySettingsActivity, view2), view2, false);
                        i = 9;
                    } else {
                        throw C36331k8.A0d("chatLockManager");
                    }
                }
                AnonymousClass3L5 r33 = chatLockPrivacySettingsActivity.A02;
                if (r33 != null) {
                    r33.A04((AnonymousClass11F) null, C36371kC.A0p(), 1, i);
                    return;
                }
                throw C36331k8.A0d("chatLockLogger");
            case 4:
                AnonymousClass00C.A0D(r10, 0);
                int ordinal3 = r10.A02.ordinal();
                if (ordinal3 == 0) {
                    ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = (ChatLockRequestAuthInterstitialActivity) this.A00;
                    AnonymousClass005 r03 = chatLockRequestAuthInterstitialActivity.A00;
                    if (r03 != null) {
                        C36411kG.A0a(r03).A02 = false;
                        C36331k8.A0m(chatLockRequestAuthInterstitialActivity);
                        return;
                    }
                    throw C36331k8.A0d("chatLockManagerLazy");
                } else if (ordinal3 != 2) {
                    ChatLockRequestAuthInterstitialActivity.A07((ChatLockRequestAuthInterstitialActivity) this.A00);
                    return;
                } else {
                    ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity2 = (ChatLockRequestAuthInterstitialActivity) this.A00;
                    AnonymousClass11F A0O = C36421kH.A0O(chatLockRequestAuthInterstitialActivity2.A02);
                    AnonymousClass005 r04 = chatLockRequestAuthInterstitialActivity2.A00;
                    if (r04 != null) {
                        C36411kG.A0a(r04).A0D(chatLockRequestAuthInterstitialActivity2, r10, new C69913eI(chatLockRequestAuthInterstitialActivity2, A0O), A0O);
                        return;
                    }
                    throw C36331k8.A0d("chatLockManagerLazy");
                }
            default:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r10.A02 == C51832oS.SUCCESS) {
                    groupChatInfoActivity.A25 = true;
                    groupChatInfoActivity.A0D.A03 = true;
                    groupChatInfoActivity.A0E.A01(4, 0);
                    groupChatInfoActivity.A0M.A02(groupChatInfoActivity.A0z.A0H, groupChatInfoActivity.A1Y).A08(groupChatInfoActivity, new C66033Uk(groupChatInfoActivity, 48));
                    return;
                }
                return;
        }
    }
}
