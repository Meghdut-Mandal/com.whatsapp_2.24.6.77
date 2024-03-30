package X;

import android.net.Uri;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesViewModel;
import java.util.Objects;

/* renamed from: X.4ZG  reason: invalid class name */
public class AnonymousClass4ZG implements AnonymousClass04G {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4ZG(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static AnonymousClass04H A00(AnonymousClass016 r2, Object obj, Object obj2, int i) {
        return new AnonymousClass04H(new AnonymousClass4ZG(obj, obj2, i), r2);
    }

    public /* synthetic */ AnonymousClass04R B3o(Class cls) {
        Object value;
        AnonymousClass17X r1;
        AnonymousClass147 r5;
        Class cls2 = cls;
        switch (this.A02) {
            case 0:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 1:
                return new C39521sa((AnonymousClass147) this.A01, (AnonymousClass1LY) ((C58152zP) this.A00).A00.A02.A5r.get());
            case 2:
                C18800tq r12 = ((C56982xT) this.A00).A00.A00.A5g;
                AnonymousClass16D r3 = (AnonymousClass16D) r12.A2A.get();
                AnonymousClass1LV r2 = (AnonymousClass1LV) r12.A1q.get();
                return new C39971uO(new C603937r((C26861Lu) r12.A2c.get(), r2, r3, (AnonymousClass19A) r12.A4x.get()), (AnonymousClass147) this.A01);
            case 3:
                C18800tq r32 = ((C69993eQ) ((C87114Nn) this.A00)).A00.A01;
                C19730wQ A0N = C36351kA.A0N(r32);
                AnonymousClass171 A0S = C36341k9.A0S(r32);
                AnonymousClass16D A0R = C36341k9.A0R(r32);
                AnonymousClass16I A0S2 = C36351kA.A0S(r32);
                C28401Sn A4s = C18800tq.A4s(r32);
                C27541Op A0c = C36381kD.A0c(r32);
                AnonymousClass17X A0b = C36351kA.A0b(r32);
                C005602m A002 = C25141Fd.A00();
                C19600wD A0c2 = C36391kE.A0c(r32);
                C233117z A0c3 = C36371kC.A0c(r32);
                CommunityMembersViewModel communityMembersViewModel = new CommunityMembersViewModel((AnonymousClass1WR) r32.A03.get(), A0N, A4s, C18830tt.A36(r32.A00), A0c2, A0R, A0S2, A0S, A0b, A0c, A0c3, (AnonymousClass147) this.A01, A002);
                AnonymousClass05L r6 = communityMembersViewModel.A0L;
                do {
                    value = r6.getValue();
                    r1 = communityMembersViewModel.A0C;
                    r5 = communityMembersViewModel.A0I;
                } while (!r6.B3B(value, new C62833Hs(r1.A0D(r5) ^ true ? 1 : 0, (Integer) null)));
                AnonymousClass1WR r13 = communityMembersViewModel.A05;
                ((C19580wB) r13.A06.get()).registerObserver(communityMembersViewModel.A04);
                communityMembersViewModel.A0A.registerObserver(communityMembersViewModel.A0B);
                communityMembersViewModel.A0G.registerObserver(communityMembersViewModel.A0H);
                communityMembersViewModel.A0E.A00(communityMembersViewModel.A0D);
                C36381kD.A1R(communityMembersViewModel.A0J, new CommunityMembersViewModel$refreshCommunityMembers$1(communityMembersViewModel, (C023509x) null), C109325Xd.A00(communityMembersViewModel));
                C28401Sn r4 = (C28401Sn) communityMembersViewModel.A07;
                if (!r4.A07.A0D(r5)) {
                    return communityMembersViewModel;
                }
                C28411So r14 = new C28411So(r4.A0B);
                AnonymousClass342 r33 = new AnonymousClass342(r4, r5);
                AnonymousClass19A r42 = r14.A00;
                String A09 = r42.A09();
                C35911jS r22 = new C35911jS(r5, A09);
                C203399nx r62 = r22.A00;
                AnonymousClass00C.A08(r62);
                r42.A0E(new C23220BAc(r33, r22, 0), r62, A09, 349, C28411So.A01);
                return communityMembersViewModel;
            case 4:
                C18800tq r0 = ((C70573fN) ((C87204Nw) this.A00)).A00.A01;
                C19770wU A0Z = C36341k9.A0Z(r0);
                return new C39731tR(C36351kA.A0S(r0), (AnonymousClass147) this.A01, A0Z);
            case 5:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 6:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 7:
                C18800tq r02 = ((C56972xS) this.A01).A00.A01;
                AnonymousClass16I A0S3 = C36351kA.A0S(r02);
                AnonymousClass1EL A0d = C36381kD.A0d(r02);
                C39881u5 r03 = new C39881u5(A0S3, C36371kC.A0X(r02), (AnonymousClass141) this.A00, A0d);
                AnonymousClass1A5 r34 = r03.A01;
                AnonymousClass11F r23 = r03.A00.A0H;
                C222713q r15 = AnonymousClass11F.A00;
                AnonymousClass141 A012 = r34.A01(C222713q.A00(r23));
                r03.A00 = A012;
                C28201Rs r24 = r03.A03;
                AnonymousClass1EL r35 = r03.A02;
                C36341k9.A19(r24, r35.A00(A012));
                C36341k9.A19(r03.A04, r35.A00(r03.A00));
                return r03;
            case 8:
                return new C39741tS((AnonymousClass11F) this.A01, C36411kG.A0l(((C57412yC) this.A00).A00.A01));
            case 9:
                C18800tq r04 = ((C57542yP) this.A00).A00.A01;
                C19970wo A0V = C36351kA.A0V(r04);
                C19420v0 A0Y = C36351kA.A0Y(r04);
                return new C39941uJ(C36351kA.A0M(r04), (AnonymousClass3KZ) this.A01, A0V, A0Y);
            case 10:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 11:
                AnonymousClass00C.A0D(cls2, 0);
                if (cls2.isAssignableFrom(C40111uw.class)) {
                    AnonymousClass147 r8 = (AnonymousClass147) this.A00;
                    GroupPermissionsActivity groupPermissionsActivity = (GroupPermissionsActivity) this.A01;
                    C19970wo r222 = groupPermissionsActivity.A07;
                    C20810yC r21 = groupPermissionsActivity.A0D;
                    AnonymousClass17Y r20 = groupPermissionsActivity.A05;
                    C19730wQ r18 = groupPermissionsActivity.A02;
                    C19770wU r17 = groupPermissionsActivity.A04;
                    C220412q r05 = groupPermissionsActivity.A03;
                    C220412q r16 = r05;
                    if (r05 != null) {
                        C21010yW r142 = groupPermissionsActivity.A07;
                        if (r142 != null) {
                            AnonymousClass19A r132 = groupPermissionsActivity.A0F;
                            if (r132 != null) {
                                RtaXmppClient rtaXmppClient = groupPermissionsActivity.A0H;
                                if (rtaXmppClient != null) {
                                    AnonymousClass16D r11 = groupPermissionsActivity.A01;
                                    if (r11 != null) {
                                        AnonymousClass171 r10 = groupPermissionsActivity.A02;
                                        if (r10 != null) {
                                            AnonymousClass1EM r7 = groupPermissionsActivity.A0I;
                                            if (r7 != null) {
                                                C20350xQ r63 = groupPermissionsActivity.A08;
                                                if (r63 != null) {
                                                    C20510xg r52 = groupPermissionsActivity.A0C;
                                                    if (r52 != null) {
                                                        C27561Or r43 = groupPermissionsActivity.A0G;
                                                        if (r43 != null) {
                                                            C24381Cf r36 = groupPermissionsActivity.A04;
                                                            if (r36 != null) {
                                                                C27541Op r25 = groupPermissionsActivity.A09;
                                                                if (r25 != null) {
                                                                    AnonymousClass17X r19 = groupPermissionsActivity.A06;
                                                                    if (r19 != null) {
                                                                        C19600wD r192 = groupPermissionsActivity.A07;
                                                                        AnonymousClass1PF r152 = groupPermissionsActivity.A05;
                                                                        if (r152 != null) {
                                                                            AnonymousClass2xY r9 = groupPermissionsActivity.A00;
                                                                            if (r9 != null) {
                                                                                C19770wU r37 = r17;
                                                                                C220412q r232 = r16;
                                                                                return new C40111uw(r9, r20, r18, r192, r11, r10, r222, r232, r36, r152, r19, r21, r142, r63, r25, r52, r8, r132, r43, rtaXmppClient, r7, r37);
                                                                            }
                                                                            throw C36331k8.A0d("groupMembershipApprovalModeApiHandlerFactory");
                                                                        }
                                                                        throw C36331k8.A0d("groupMembershipApprovalRequestStore");
                                                                    }
                                                                    throw C36331k8.A0d("groupParticipantsManager");
                                                                }
                                                                throw C36331k8.A0d("groupDataChangeListeners");
                                                            }
                                                            throw C36331k8.A0d("conversationObservers");
                                                        }
                                                        throw C36331k8.A0d("rtaExperimentUtils");
                                                    }
                                                    throw C36331k8.A0d("groupXmppMethods");
                                                }
                                                throw C36331k8.A0d("groupChatManager");
                                            }
                                            throw C36331k8.A0d("groupChatUtils");
                                        }
                                        throw C36331k8.A0d("wAContactNames");
                                    }
                                    throw C36331k8.A0Z();
                                }
                                throw C36331k8.A0d("rtaXmppClient");
                            }
                            throw C36331k8.A0d("messageClient");
                        }
                        throw C36331k8.A0d("wamRuntime");
                    }
                    throw C36331k8.A0d("chatsCache");
                }
                throw AnonymousClass001.A08("Invalid viewModel");
            case 12:
                AnonymousClass04R r06 = (AnonymousClass04R) cls2.cast(new C39541sc(((int[]) this.A01)[0]));
                Objects.requireNonNull(r06);
                return r06;
            case 13:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 14:
                C18800tq r26 = ((C57572yS) this.A00).A00.A01;
                C18830tt r110 = r26.A00;
                C30131Zi A0m = C36431kI.A0m(r26);
                AnonymousClass1ZX r44 = (AnonymousClass1ZX) r26.A5X.get();
                return new NewsletterViewModel((AnonymousClass3CC) r110.A2L.get(), C36341k9.A0R(r26), (C28981Uw) this.A01, r44, (C71723hE) r110.A2y.get(), A0m);
            default:
                C27121Mz r111 = ((C57952z5) this.A00).A00;
                C19770wU A0Z2 = C36341k9.A0Z(r111.A01);
                return new MutedStatusesViewModel((C57962z6) r111.A00.A2m.get(), (StatusesViewModel) this.A01, A0Z2);
        }
    }

    public AnonymousClass04R B46(AnonymousClass04K r13, Class cls) {
        switch (this.A02) {
            case 0:
                C27121Mz r2 = ((C58112zL) this.A00).A00;
                return new AnonymousClass2EG((C58062zG) r2.A00.A2Z.get(), (AnonymousClass11F) this.A01, C36341k9.A0Z(r2.A01));
            case 5:
                C18800tq r0 = ((AnonymousClass2yY) this.A01).A00.A01;
                AnonymousClass1A1 A0n = C36351kA.A0n(r0);
                return new C39701tL(C36361kB.A0Z(r0), (C64933Qa) this.A00, A0n);
            case 6:
                C18800tq r1 = ((C58212zV) this.A00).A00.A02;
                AnonymousClass1YP ALA = C18800tq.ALA(r1);
                AnonymousClass1X4 A0T = C36361kB.A0T(r1);
                C19630wG A0W = C36351kA.A0W(r1);
                return new C39901uB((Uri) this.A01, C36351kA.A0M(r1), A0T, A0W, (AnonymousClass1Ax) r1.A4p.get(), ALA, C25141Fd.A00());
            case 10:
                C18800tq r02 = ((C57632yZ) this.A00).A00.A01;
                C19630wG A0W2 = C36351kA.A0W(r02);
                C220412q A0a = C36351kA.A0a(r02);
                AnonymousClass16J A0Z = C36361kB.A0Z(r02);
                C29541Xa A0M = C36421kH.A0M(r02);
                return new C39911uC(C36361kB.A0U(r02), A0W2, A0a, A0Z, A0M, (AnonymousClass11F) this.A01, C25141Fd.A00());
            case 13:
                C27121Mz r22 = ((C75193mp) ((AnonymousClass4OA) this.A00)).A00;
                return new AnonymousClass2EH((C58062zG) r22.A00.A2Z.get(), (AnonymousClass11F) this.A01, C36341k9.A0Z(r22.A01));
            default:
                return AnonymousClass0QC.A00(this, cls);
        }
    }
}
