package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7p5  reason: invalid class name and case insensitive filesystem */
public class C162747p5 extends C226815j {
    public Object A00;
    public final int A01;

    public C162747p5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A04(AnonymousClass11F r6) {
        C95894mS r0;
        switch (this.A01) {
            case 0:
                CallGrid callGrid = (CallGrid) this.A00;
                if (callGrid.A07 != null) {
                    callGrid.A0J.Bp1(new C1501874h(this, r6, 38));
                    return;
                }
                return;
            case 1:
                ((C96104mn) this.A00).A0Q(C36401kF.A0b(r6));
                return;
            case 3:
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) this.A00;
                C95504lc.A02(voiceChatBottomSheetViewModel.A0C, voiceChatBottomSheetViewModel);
                return;
            case 5:
                AnonymousClass00C.A0D(r6, 0);
                ((ConversationsSuggestedContactsViewModel) this.A00).A0U(r6);
                return;
            case 6:
                ((C142466ov) this.A00).A0K.A06();
                return;
            case 7:
                SearchFragment.A05(r6, (SearchFragment) this.A00);
                return;
            case 8:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                CallInfo A012 = VoipActivityV2.A01(voipActivityV2);
                if (A012 != null) {
                    AnonymousClass6SZ r02 = GroupJid.Companion;
                    GroupJid A002 = AnonymousClass6SZ.A00(r6);
                    if (A002 == null || !A002.equals(A012.groupJid) || !VoipActivityV2.A1R(A012.callState, voipActivityV2, A012.isGroupCall)) {
                        UserJid A0b = C36401kF.A0b(r6);
                        if (A0b != null && A012.participants.containsKey(A0b)) {
                            boolean z = A012.isGroupCall;
                            if (!z && VoipActivityV2.A1R(A012.callState, voipActivityV2, z)) {
                                voipActivityV2.A0W.A03(A012);
                            }
                            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1a;
                            if (voipCallControlBottomSheetV2 != null && (r0 = voipCallControlBottomSheetV2.A0M) != null) {
                                r0.A0P(A0b);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    voipActivityV2.A0W.A03(A012);
                    return;
                }
                return;
            default:
                super.A04(r6);
                return;
        }
    }

    public void A06(UserJid userJid) {
        switch (this.A01) {
            case 5:
                ((ConversationsSuggestedContactsViewModel) this.A00).A0U(userJid);
                return;
            case 7:
                SearchFragment.A05(userJid, (SearchFragment) this.A00);
                return;
            default:
                super.A06(userJid);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 2: goto L_0x0019;
                case 3: goto L_0x0020;
                case 4: goto L_0x0009;
                case 5: goto L_0x0005;
                case 6: goto L_0x002a;
                case 7: goto L_0x0034;
                case 8: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A07(r3)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r1 = r2.A00
            X.4fp r1 = (X.C93124fp) r1
            X.11F r0 = r1.A0D
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A02()
            return
        L_0x0019:
            java.lang.Object r1 = r2.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r1 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r1
            X.5Fb r0 = r1.A04
            goto L_0x0026
        L_0x0020:
            java.lang.Object r1 = r2.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r1
            X.5Fb r0 = r1.A0C
        L_0x0026:
            X.C95504lc.A02(r0, r1)
            return
        L_0x002a:
            java.lang.Object r0 = r2.A00
            X.6ov r0 = (X.C142466ov) r0
            X.4mZ r0 = r0.A0K
            r0.A06()
            return
        L_0x0034:
            java.lang.Object r0 = r2.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A05(r3, r0)
            return
        L_0x003c:
            java.lang.Object r0 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r0.A0e
            X.C95504lc.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162747p5.A07(com.whatsapp.jid.UserJid):void");
    }

    public void A08(UserJid userJid) {
        if (5 - this.A01 != 0) {
            super.A08(userJid);
            return;
        }
        AnonymousClass00C.A0D(userJid, 0);
        ((ConversationsSuggestedContactsViewModel) this.A00).A0U(userJid);
    }

    public void A09(Collection collection) {
        if (5 - this.A01 != 0) {
            super.A09(collection);
            return;
        }
        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = (ConversationsSuggestedContactsViewModel) this.A00;
        if (conversationsSuggestedContactsViewModel.A00 == C108105Se.LOADED && collection != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : collection) {
                if (conversationsSuggestedContactsViewModel.A05.A0O((UserJid) next)) {
                    A0I.add(next);
                }
            }
            ArrayList A0J = C36321k7.A0J(A0I);
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                C90464aC.A1U(A0J, it);
            }
            ConversationsSuggestedContactsViewModel.A01(conversationsSuggestedContactsViewModel, C007103b.A0f(A0J));
        }
    }

    public void A0A(Collection collection) {
        C95894mS r0;
        switch (this.A01) {
            case 4:
                C93124fp.A00((C93124fp) this.A00, collection);
                return;
            case 8:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                CallInfo A012 = VoipActivityV2.A01(voipActivityV2);
                if (A012 != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass141 A0f = C36391kE.A0f(it);
                        AnonymousClass11F r1 = A0f.A0H;
                        if (r1 == null || !r1.equals(A012.groupJid)) {
                            AnonymousClass11F r12 = A0f.A0H;
                            if (r12 != null && !A012.isGroupCall && r12.equals(A012.getPeerJid()) && VoipActivityV2.A1T(voipActivityV2) && voipActivityV2.A0D.A07(4067) >= 2 && voipActivityV2.A0D.A0E(4455)) {
                                VoipActivityV2.A0r(A012, voipActivityV2);
                            }
                        } else {
                            VoipActivityV2.A0r(A012, voipActivityV2);
                            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1a;
                            if (!(voipCallControlBottomSheetV2 == null || (r0 = voipCallControlBottomSheetV2.A0M) == null)) {
                                r0.A0N();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                super.A0A(collection);
                return;
        }
    }

    public void A0B(Collection collection) {
        AnonymousClass0CZ r0;
        switch (this.A01) {
            case 6:
                r0 = ((C142466ov) this.A00).A0K;
                break;
            case 7:
                r0 = ((SearchFragment) this.A00).A1c;
                if (r0 == null) {
                    return;
                }
                break;
            default:
                super.A0B(collection);
                return;
        }
        r0.A06();
    }

    public void A0C(Collection collection) {
        if (4 - this.A01 != 0) {
            super.A0C(collection);
        } else {
            C93124fp.A00((C93124fp) this.A00, collection);
        }
    }
}
