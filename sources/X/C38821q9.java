package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.1q9  reason: invalid class name and case insensitive filesystem */
public final class C38821q9 extends LinearLayout implements C18700tb {
    public C24801Dv A00;
    public C65363Rt A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public WaTextView A04;
    public AnonymousClass1T4 A05;
    public C87494Pa A06;
    public AnonymousClass1LV A07;
    public C87504Pb A08;
    public C41061wY A09;
    public C87114Nn A0A;
    public AnonymousClass1Pp A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass171 A0D;
    public C27731Pn A0E;
    public C18820ts A0F;
    public AnonymousClass17X A0G;
    public C232317r A0H;
    public AnonymousClass1H2 A0I;
    public C20810yC A0J;
    public C32661dz A0K;
    public C32811eE A0L;
    public AnonymousClass1QZ A0M;
    public Runnable A0N;
    public boolean A0O;
    public View A0P;
    public RecyclerView A0Q;
    public CommunityMembersViewModel A0R;
    public AnonymousClass1RY A0S;
    public AnonymousClass147 A0T;
    public final AnonymousClass1RJ A0U;

    public static final void setupMembersListChangeHandlers$lambda$1(C006302t r1, Object obj) {
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj);
    }

    public static final void setupMembersListChangeHandlers$lambda$2(C006302t r1, Object obj) {
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj);
    }

    public static final void setupMembersListChangeHandlers$lambda$3(C006302t r1, Object obj) {
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj);
    }

    public static final void setupMembersListChangeHandlers$lambda$4(C38821q9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        r2.getGlobalUI$app_product_community_community_non_modified().A0G(r2.A0N);
    }

    public final void setAbprops$app_product_community_community_non_modified(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0J = r2;
    }

    public final void setActivityUtils$app_product_community_community_non_modified(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setAddContactLogUtil$app_product_community_community_non_modified(C32661dz r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0K = r2;
    }

    public final void setAddToContactsUtil$app_product_community_community_non_modified(C32811eE r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0L = r2;
    }

    public final void setBaseMemberContextMenuHelper$app_product_community_community_non_modified(C65363Rt r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCommunityABPropsManager$app_product_community_community_non_modified(AnonymousClass1T4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setCommunityAdminPromoteDemoteHelperFactory$app_product_community_community_non_modified(C87494Pa r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setCommunityChatManager$app_product_community_community_non_modified(AnonymousClass1LV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setCommunityMembersAdapterFactory(C87504Pb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setCommunityMembersViewModelFactory$app_product_community_community_non_modified(C87114Nn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setContactAvatars$app_product_community_community_non_modified(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setContactManager$app_product_community_community_non_modified(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setContactPhotos$app_product_community_community_non_modified(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0E = r2;
    }

    public final void setEmojiLoader$app_product_community_community_non_modified(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0I = r2;
    }

    public final void setGlobalUI$app_product_community_community_non_modified(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setGroupParticipantsManager$app_product_community_community_non_modified(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0G = r2;
    }

    public final void setMeManager$app_product_community_community_non_modified(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setParticipantUserStore$app_product_community_community_non_modified(C232317r r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0H = r2;
    }

    public final void setWaContactNames$app_product_community_community_non_modified(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0D = r2;
    }

    public final void setWhatsAppLocale$app_product_community_community_non_modified(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0F = r2;
    }

    private final void setupMembersListChangeHandlers(AnonymousClass155 r5) {
        CommunityMembersViewModel communityMembersViewModel = this.A0R;
        if (communityMembersViewModel == null) {
            throw C36331k8.A0d("communityMembersViewModel");
        }
        C53592rZ.A01(r5, communityMembersViewModel.A01, new AnonymousClass4JM(this), 7);
        CommunityMembersViewModel communityMembersViewModel2 = this.A0R;
        if (communityMembersViewModel2 == null) {
            throw C36331k8.A0d("communityMembersViewModel");
        }
        C53592rZ.A01(r5, communityMembersViewModel2.A00, new AnonymousClass4JN(this), 9);
        CommunityMembersViewModel communityMembersViewModel3 = this.A0R;
        if (communityMembersViewModel3 == null) {
            throw C36331k8.A0d("communityMembersViewModel");
        }
        C53592rZ.A01(r5, communityMembersViewModel3.A02, new AnonymousClass4JO(this), 8);
        CommunityMembersViewModel communityMembersViewModel4 = this.A0R;
        if (communityMembersViewModel4 == null) {
            throw C36331k8.A0d("communityMembersViewModel");
        }
        C80083ul r0 = new C80083ul(this);
        Set set = communityMembersViewModel4.A01;
        synchronized (set) {
            set.add(r0);
        }
    }

    public final void A00(AnonymousClass147 r2) {
        this.A0T = r2;
        AnonymousClass155 r0 = (AnonymousClass155) C36391kE.A0E(this);
        setupMembersList(r0);
        setupMembersListChangeHandlers(r0);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0M;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0M = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbprops$app_product_community_community_non_modified() {
        C20810yC r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("abprops");
    }

    public final C24801Dv getActivityUtils$app_product_community_community_non_modified() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final C32661dz getAddContactLogUtil$app_product_community_community_non_modified() {
        C32661dz r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("addContactLogUtil");
    }

    public final C32811eE getAddToContactsUtil$app_product_community_community_non_modified() {
        C32811eE r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("addToContactsUtil");
    }

    public final C65363Rt getBaseMemberContextMenuHelper$app_product_community_community_non_modified() {
        C65363Rt r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("baseMemberContextMenuHelper");
    }

    public final AnonymousClass1T4 getCommunityABPropsManager$app_product_community_community_non_modified() {
        AnonymousClass1T4 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityABPropsManager");
    }

    public final C87494Pa getCommunityAdminPromoteDemoteHelperFactory$app_product_community_community_non_modified() {
        C87494Pa r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityAdminPromoteDemoteHelperFactory");
    }

    public final AnonymousClass1LV getCommunityChatManager$app_product_community_community_non_modified() {
        AnonymousClass1LV r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityChatManager");
    }

    public final C87504Pb getCommunityMembersAdapterFactory() {
        C87504Pb r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityMembersAdapterFactory");
    }

    public final C87114Nn getCommunityMembersViewModelFactory$app_product_community_community_non_modified() {
        C87114Nn r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("communityMembersViewModelFactory");
    }

    public final AnonymousClass1Pp getContactAvatars$app_product_community_community_non_modified() {
        AnonymousClass1Pp r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final AnonymousClass16D getContactManager$app_product_community_community_non_modified() {
        AnonymousClass16D r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final C27731Pn getContactPhotos$app_product_community_community_non_modified() {
        C27731Pn r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final AnonymousClass1H2 getEmojiLoader$app_product_community_community_non_modified() {
        AnonymousClass1H2 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final AnonymousClass17Y getGlobalUI$app_product_community_community_non_modified() {
        AnonymousClass17Y r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass17X getGroupParticipantsManager$app_product_community_community_non_modified() {
        AnonymousClass17X r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final C19730wQ getMeManager$app_product_community_community_non_modified() {
        C19730wQ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C232317r getParticipantUserStore$app_product_community_community_non_modified() {
        C232317r r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("participantUserStore");
    }

    public final AnonymousClass171 getWaContactNames$app_product_community_community_non_modified() {
        AnonymousClass171 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public final C18820ts getWhatsAppLocale$app_product_community_community_non_modified() {
        C18820ts r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public C38821q9(Context context) {
        super(context);
        if (!this.A0O) {
            this.A0O = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r2 = r1.A0M;
            this.A0J = C36341k9.A0V(r2);
            this.A02 = C36351kA.A0M(r2);
            this.A03 = C36351kA.A0N(r2);
            this.A0I = C36351kA.A0e(r2);
            this.A00 = C36351kA.A0J(r2);
            this.A0E = C36351kA.A0T(r2);
            this.A0B = C36361kB.A0V(r2);
            this.A0C = C36341k9.A0R(r2);
            this.A0D = C36341k9.A0S(r2);
            this.A0F = C36341k9.A0T(r2);
            this.A0K = C36371kC.A0k(r2);
            this.A0L = C36401kF.A0e(r2);
            this.A07 = C36361kB.A0U(r2);
            this.A0H = (C232317r) r2.A61.get();
            this.A05 = (AnonymousClass1T4) r2.A1p.get();
            this.A0G = C36351kA.A0b(r2);
            this.A01 = (C65363Rt) r2.ABN.get();
            C27111My r12 = r1.A0L;
            this.A08 = (C87504Pb) r12.A0d.get();
            this.A0A = (C87114Nn) r12.A2j.get();
            this.A06 = (C87494Pa) r12.A0c.get();
        }
        this.A0N = C81013wK.A00;
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A0P = inflate;
        this.A04 = C36341k9.A0Q(inflate, R.id.members_title);
        this.A0Q = (RecyclerView) C36361kB.A0G(this.A0P, R.id.inline_members_recycler_view);
        this.A0U = C36341k9.A0Y(this, R.id.inline_members_progress_bar);
    }

    private final void setupMembersList(AnonymousClass155 r3) {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1f(1);
        this.A0Q.setLayoutManager(linearLayoutManager);
        C87114Nn communityMembersViewModelFactory$app_product_community_community_non_modified = getCommunityMembersViewModelFactory$app_product_community_community_non_modified();
        AnonymousClass147 r0 = this.A0T;
        if (r0 == null) {
            throw C36331k8.A0d("parentJid");
        }
        this.A0R = C53582rY.A00(r3, communityMembersViewModelFactory$app_product_community_community_non_modified, r0);
        setupMembersListAdapter(r3);
    }

    private final void setupMembersListAdapter(AnonymousClass155 r14) {
        C87494Pa communityAdminPromoteDemoteHelperFactory$app_product_community_community_non_modified = getCommunityAdminPromoteDemoteHelperFactory$app_product_community_community_non_modified();
        AnonymousClass147 r1 = this.A0T;
        GroupJid groupJid = null;
        if (r1 == null) {
            throw C36331k8.A0d("parentJid");
        }
        AnonymousClass155 r7 = r14;
        C61993Eh B3v = communityAdminPromoteDemoteHelperFactory$app_product_community_community_non_modified.B3v(r14, r1, 2);
        this.A0S = getContactPhotos$app_product_community_community_non_modified().A05(getContext(), "community-view-members");
        AnonymousClass1LV communityChatManager$app_product_community_community_non_modified = getCommunityChatManager$app_product_community_community_non_modified();
        AnonymousClass147 r12 = this.A0T;
        if (r12 == null) {
            throw C36331k8.A0d("parentJid");
        }
        AnonymousClass3QK A002 = communityChatManager$app_product_community_community_non_modified.A08.A00(r12);
        C87504Pb communityMembersAdapterFactory = getCommunityMembersAdapterFactory();
        if (A002 != null) {
            groupJid = A002.A02;
        }
        AnonymousClass147 r13 = this.A0T;
        if (r13 == null) {
            throw C36331k8.A0d("parentJid");
        }
        AnonymousClass1RY r0 = this.A0S;
        if (r0 == null) {
            throw C36331k8.A0d("contactPhotoLoader");
        }
        C19730wQ meManager$app_product_community_community_non_modified = getMeManager$app_product_community_community_non_modified();
        AnonymousClass1H2 emojiLoader$app_product_community_community_non_modified = getEmojiLoader$app_product_community_community_non_modified();
        AnonymousClass16D contactManager$app_product_community_community_non_modified = getContactManager$app_product_community_community_non_modified();
        AnonymousClass171 waContactNames$app_product_community_community_non_modified = getWaContactNames$app_product_community_community_non_modified();
        CommunityMembersViewModel communityMembersViewModel = this.A0R;
        if (communityMembersViewModel == null) {
            throw C36331k8.A0d("communityMembersViewModel");
        }
        C41061wY B4J = communityMembersAdapterFactory.B4J(new C61013Af(getBaseMemberContextMenuHelper$app_product_community_community_non_modified(), meManager$app_product_community_community_non_modified, r7, B3v, communityMembersViewModel, contactManager$app_product_community_community_non_modified, waContactNames$app_product_community_community_non_modified, emojiLoader$app_product_community_community_non_modified), r0, groupJid, r13);
        this.A09 = B4J;
        B4J.A0B(true);
        RecyclerView recyclerView = this.A0Q;
        C41061wY r02 = this.A09;
        if (r02 == null) {
            throw C36331k8.A0d("communityMembersAdapter");
        }
        recyclerView.setAdapter(r02);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1RY r0 = this.A0S;
        if (r0 == null) {
            throw C36331k8.A0d("contactPhotoLoader");
        }
        r0.A02();
    }
}
