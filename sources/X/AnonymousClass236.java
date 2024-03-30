package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;

/* renamed from: X.236  reason: invalid class name */
public final class AnonymousClass236 extends ListItemWithLeftIcon {
    public AnonymousClass4PU A00;
    public AnonymousClass3PA A01;
    public AnonymousClass4O9 A02;
    public boolean A03;
    public final C225314u A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass49Z(this));

    public AnonymousClass236(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A04 = C36381kD.A0S(context);
        setIcon((int) R.drawable.ic_chat_lock);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
        setDescription((int) R.string.f12nameremoved);
        C36321k7.A0N(this);
    }

    public final void setChatLockInfoViewUpdateHelperFactory$app_product_community_community_non_modified(AnonymousClass4PU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$app_product_community_community_non_modified(AnonymousClass4O9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    private final CAGInfoChatLockViewModel getCagInfoChatLockViewModel() {
        return (CAGInfoChatLockViewModel) this.A05.getValue();
    }

    public final AnonymousClass4PU getChatLockInfoViewUpdateHelperFactory$app_product_community_community_non_modified() {
        AnonymousClass4PU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatLockInfoViewUpdateHelperFactory");
    }

    public final AnonymousClass4O9 getParticipantsViewModelFactory$app_product_community_community_non_modified() {
        AnonymousClass4O9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("participantsViewModelFactory");
    }

    public final void A08(C009904e r7, AnonymousClass147 r8) {
        AnonymousClass4PU chatLockInfoViewUpdateHelperFactory$app_product_community_community_non_modified = getChatLockInfoViewUpdateHelperFactory$app_product_community_community_non_modified();
        C225314u r4 = this.A04;
        AnonymousClass3PA B4E = chatLockInfoViewUpdateHelperFactory$app_product_community_community_non_modified.B4E(r4, r7, this, r8);
        this.A01 = B4E;
        B4E.A01();
        AnonymousClass00U A1I = C36431kI.A1I(new AnonymousClass4FQ(this, r8));
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        C39811tr r2 = (C39811tr) A1I.getValue();
        AnonymousClass00C.A0D(r2, 1);
        cagInfoChatLockViewModel.A01 = r8;
        cagInfoChatLockViewModel.A00 = r2;
        cagInfoChatLockViewModel.A03.registerObserver(cagInfoChatLockViewModel.A04.getValue());
        C53822rw.A02(r2.A0F, cagInfoChatLockViewModel.A02, new AnonymousClass4JD(cagInfoChatLockViewModel), 39);
        C53822rw.A01(r4, getCagInfoChatLockViewModel().A02, new AnonymousClass4JE(this), 40);
    }

    public final C225314u getActivity() {
        return this.A04;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CAGInfoChatLockViewModel cagInfoChatLockViewModel = getCagInfoChatLockViewModel();
        C39811tr r0 = cagInfoChatLockViewModel.A00;
        if (r0 != null) {
            cagInfoChatLockViewModel.A02.A0E(r0.A0F);
        }
        C36411kG.A1I(cagInfoChatLockViewModel.A03, cagInfoChatLockViewModel.A04);
    }
}
