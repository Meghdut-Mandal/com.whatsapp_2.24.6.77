package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;

/* renamed from: X.2Dq  reason: invalid class name */
public final class AnonymousClass2Dq extends EphemeralMessagesInfoView {
    public AnonymousClass17Y A00;
    public AnonymousClass16D A01;
    public AnonymousClass4O9 A02;
    public C39811tr A03;
    public C19770wU A04;
    public boolean A05;
    public final C225314u A06;

    public AnonymousClass2Dq(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A06 = C36381kD.A0S(context);
        C36321k7.A0N(this);
    }

    public final void setContactManager$app_product_community_community_non_modified(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setGlobalUI$app_product_community_community_non_modified(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setParticipantsViewModelFactory$app_product_community_community_non_modified(AnonymousClass4O9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers$app_product_community_community_non_modified(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final AnonymousClass16D getContactManager$app_product_community_community_non_modified() {
        AnonymousClass16D r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final AnonymousClass17Y getGlobalUI$app_product_community_community_non_modified() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass4O9 getParticipantsViewModelFactory$app_product_community_community_non_modified() {
        AnonymousClass4O9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("participantsViewModelFactory");
    }

    public final C19770wU getWaWorkers$app_product_community_community_non_modified() {
        C19770wU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final C225314u getActivity() {
        return this.A06;
    }
}
