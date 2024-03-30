package X;

import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;
import com.whatsapp.info.views.ChatInfoMediaCardV2;
import com.whatsapp.info.views.EncryptionInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public final class C40951wN extends AnonymousClass0CZ {
    public final List A00 = new CopyOnWriteArrayList();
    public final C009904e A01;
    public final C45632Sc A02;
    public final AnonymousClass147 A03;
    public final AnonymousClass147 A04;

    public void BSE(AnonymousClass0D3 r8, int i) {
        C225314u r4;
        C001600r r2;
        Object obj;
        int i2;
        C225314u r5;
        C001600r r22;
        Object obj2;
        int i3;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof C41541xN) {
            AnonymousClass147 r23 = this.A03;
            ((C41541xN) r8).A00.A08(this.A02, r23, false);
        } else if (r8 instanceof C41601xT) {
            AnonymousClass147 r3 = this.A03;
            AnonymousClass147 r1 = this.A04;
            C46292Wh r24 = ((C41601xT) r8).A00;
            r24.A08(r3, r1);
            r24.A00 = new C75143mk(r24, r3, r1);
            C27541Op groupDataChangeListeners$app_product_community_community_non_modified = r24.getGroupDataChangeListeners$app_product_community_community_non_modified();
            C87854Qk r0 = r24.A00;
            if (r0 == null) {
                throw C36331k8.A0d("onRefreshListener");
            }
            groupDataChangeListeners$app_product_community_community_non_modified.A00(r0);
        } else if (r8 instanceof C41531xM) {
            AnonymousClass147 r12 = this.A03;
            C46272Wc r02 = ((C41531xM) r8).A00;
            r02.A00 = r12;
            r02.A08(r12);
        } else if (r8 instanceof C41521xL) {
            AnonymousClass147 r25 = this.A03;
            ((C41521xL) r8).A00.A08(this.A01, r25);
        } else {
            if (r8 instanceof C41621xV) {
                AnonymousClass147 r32 = this.A03;
                C45632Sc r26 = this.A02;
                C46302Wj r52 = ((C41621xV) r8).A00;
                r52.setupOnClickListener(new C48932iI(r26, r32, r52, 11));
                r4 = r52.A00;
                AnonymousClass2EH r03 = (AnonymousClass2EH) AnonymousClass4ZG.A00(r4, r32, r52.getGroupChatInfoViewModelFactory$app_product_community_community_non_modified(), 13).A00(AnonymousClass2EH.class);
                r52.A01 = r03;
                if (r03 == null) {
                    throw C36331k8.A0d("groupChatInfoViewModel");
                }
                C53822rw.A01(r4, r03.A00, new AnonymousClass4JI(r52), 47);
                AnonymousClass2EH r04 = r52.A01;
                if (r04 == null) {
                    throw C36331k8.A0d("groupChatInfoViewModel");
                }
                r2 = r04.A07;
                obj = new AnonymousClass4JJ(r52);
                i2 = 48;
            } else {
                if (r8 instanceof C41551xO) {
                    AnonymousClass147 r6 = this.A03;
                    C45632Sc r42 = this.A02;
                    AnonymousClass2Dq r33 = ((C41551xO) r8).A00;
                    C225314u r53 = r33.A06;
                    C39811tr r05 = (C39811tr) AnonymousClass4ZD.A00(r53, r53.A00, r33.getParticipantsViewModelFactory$app_product_community_community_non_modified(), r6, 4).A00(C39811tr.class);
                    r33.A03 = r05;
                    if (r05 == null) {
                        throw C36331k8.A0d("participantsViewModel");
                    }
                    r22 = r05.A0F;
                    obj2 = new AnonymousClass4MW(r33, r42, r6);
                    i3 = 42;
                    r5 = r53;
                } else if (r8 instanceof C41561xP) {
                    AnonymousClass147 r34 = this.A03;
                    C38291oB r54 = ((C41561xP) r8).A00;
                    AnonymousClass4PV mediaCardUpdateHelperFactory$app_product_community_community_non_modified = r54.getMediaCardUpdateHelperFactory$app_product_community_community_non_modified();
                    ChatInfoMediaCardV2 chatInfoMediaCardV2 = r54.A07;
                    r4 = r54.A06;
                    AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                    r54.A01 = mediaCardUpdateHelperFactory$app_product_community_community_non_modified.B4D((AnonymousClass155) r4, r34, chatInfoMediaCardV2);
                    AnonymousClass2EH r06 = (AnonymousClass2EH) AnonymousClass4ZG.A00(r4, r34, r54.getGroupChatInfoViewModelFactory$app_product_community_community_non_modified(), 13).A00(AnonymousClass2EH.class);
                    r54.A03 = r06;
                    if (r06 == null) {
                        throw C36331k8.A0d("groupChatInfoViewModel");
                    }
                    C53822rw.A01(r4, r06.A00, new AnonymousClass4JG(r54), 44);
                    AnonymousClass2EH r07 = r54.A03;
                    if (r07 == null) {
                        throw C36331k8.A0d("groupChatInfoViewModel");
                    }
                    C53822rw.A01(r4, r07.A05, C53102qm.A02(r54, 15), 43);
                    AnonymousClass2EH r08 = r54.A03;
                    if (r08 == null) {
                        throw C36331k8.A0d("groupChatInfoViewModel");
                    }
                    r2 = r08.A04;
                    obj = new AnonymousClass4JH(r54);
                    i2 = 45;
                } else if (r8 instanceof C41571xQ) {
                    AnonymousClass147 r43 = this.A03;
                    AnonymousClass232 r35 = ((C41571xQ) r8).A00;
                    AnonymousClass4PW mediaVisibilityInfoUpdateHelperFactory$app_product_community_community_non_modified = r35.getMediaVisibilityInfoUpdateHelperFactory$app_product_community_community_non_modified();
                    AnonymousClass155 r55 = r35.A04;
                    r35.A01 = mediaVisibilityInfoUpdateHelperFactory$app_product_community_community_non_modified.B4F(r35, r55, r43);
                    r35.setOnClickListener(new C66933Xw(r35, 46));
                    r22 = ((CAGInfoChatLockViewModel) C36441kJ.A0b(r55).A00(CAGInfoChatLockViewModel.class)).A02;
                    obj2 = new C86684Lw(r35, r43);
                    i3 = 46;
                    r5 = r55;
                } else if (r8 instanceof C41581xR) {
                    AnonymousClass147 r56 = this.A03;
                    C45632Sc r09 = this.A02;
                    AnonymousClass237 r44 = ((C41581xR) r8).A00;
                    r44.A06 = r56;
                    r44.A05 = r09;
                    AnonymousClass3FH B4G = r44.getMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community_non_modified().B4G(C36371kC.A0B(r44), r44.A0A, r44, r56, new C53082qk(r44, 6));
                    r44.A02 = B4G;
                    B4G.A00();
                    r44.A03 = new C71733hF(r44, r56);
                    C24381Cf conversationObservers$app_product_community_community_non_modified = r44.getConversationObservers$app_product_community_community_non_modified();
                    C24521Ct r010 = r44.A03;
                    if (r010 == null) {
                        throw C36331k8.A0d("conversationObserver");
                    }
                    conversationObservers$app_product_community_community_non_modified.registerObserver(r010);
                    return;
                } else if (r8 instanceof C41611xU) {
                    AnonymousClass147 r13 = this.A03;
                    C45632Sc r011 = this.A02;
                    C38301oC r27 = ((C41611xU) r8).A00;
                    r27.A03 = r13;
                    r27.A02 = r011;
                    C48912iG.A00(r27.A06, r27, 10);
                    return;
                } else if (r8 instanceof C41591xS) {
                    AnonymousClass147 r28 = this.A03;
                    C46282Wg r14 = ((C41591xS) r8).A00;
                    r14.setOnClickListener(new C48942iJ((NotificationsAndSoundsInfoView) r14, r28));
                    return;
                } else {
                    return;
                }
                C53822rw.A01(r5, r22, obj2, i3);
                return;
            }
            C53822rw.A01(r4, r2, obj, i2);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 r1;
        AnonymousClass00C.A0D(viewGroup, 0);
        switch (i) {
            case 1:
                r1 = new C41541xN(new EncryptionInfoView(C36351kA.A09(viewGroup), (AttributeSet) null));
                break;
            case 2:
                r1 = new C41601xT(new C46292Wh(C36351kA.A09(viewGroup)));
                break;
            case 3:
                r1 = new C41531xM(new C46272Wc(C36351kA.A09(viewGroup)));
                break;
            case 4:
                r1 = new C41521xL(new AnonymousClass236(C36351kA.A09(viewGroup)));
                break;
            case 5:
                r1 = new C41621xV(new C46302Wj(C36351kA.A09(viewGroup)));
                break;
            case 6:
                r1 = new C41551xO(new AnonymousClass2Dq(C36351kA.A09(viewGroup)));
                break;
            case 7:
                r1 = new C41561xP(new C38291oB(C36351kA.A09(viewGroup)));
                break;
            case 8:
                r1 = new C41571xQ(new AnonymousClass232(C36351kA.A09(viewGroup)));
                break;
            case 9:
                r1 = new C41581xR(new AnonymousClass237(C36351kA.A09(viewGroup)));
                break;
            case 10:
            case 11:
            case 12:
                return new C41371x6(new C38191o1(C36351kA.A09(viewGroup)));
            case 13:
                r1 = new C41611xU(new C38301oC(C36351kA.A09(viewGroup)));
                break;
            case 14:
                r1 = new C41591xS(new C46282Wg(C36351kA.A09(viewGroup)));
                break;
            default:
                r1 = new C41371x6(new C38341oO(C36351kA.A09(viewGroup)));
                break;
        }
        int dimensionPixelOffset = C36341k9.A0F(viewGroup).getDimensionPixelOffset(R.dimen.f7nameremoved);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        r1.A0H.setLayoutParams(marginLayoutParams);
        return r1;
    }

    public long A0E(int i) {
        return (long) ((AnonymousClass3HQ) this.A00.get(i)).A00;
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass3HQ) this.A00.get(i)).A00;
    }

    public C40951wN(C009904e r2, C45632Sc r3, AnonymousClass147 r4, AnonymousClass147 r5) {
        C36321k7.A0y(r4, r3);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }
}
