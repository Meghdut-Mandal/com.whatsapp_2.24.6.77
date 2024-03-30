package X;

import com.whatsapp.R;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinBottomSheet;

/* renamed from: X.3do  reason: invalid class name and case insensitive filesystem */
public final class C69613do implements C88394Sn {
    public final /* synthetic */ BonsaiWaitlistJoinBottomSheet A00;

    public C69613do(BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet) {
        this.A00 = bonsaiWaitlistJoinBottomSheet;
    }

    public void BXH() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = this.A00;
        AnonymousClass17Y r0 = bonsaiWaitlistJoinBottomSheet.A00;
        if (r0 != null) {
            r0.A02();
            AnonymousClass17Y r2 = bonsaiWaitlistJoinBottomSheet.A00;
            if (r2 != null) {
                r2.A06(R.string.f12nameremoved, 0);
                return;
            }
            throw C36321k7.A06();
        }
        throw C36321k7.A06();
    }

    public void onSuccess() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = this.A00;
        AnonymousClass17Y r0 = bonsaiWaitlistJoinBottomSheet.A00;
        if (r0 != null) {
            r0.A02();
            bonsaiWaitlistJoinBottomSheet.A1c();
            AnonymousClass00S r02 = bonsaiWaitlistJoinBottomSheet.A04;
            if (r02 != null) {
                r02.invoke();
                return;
            }
            return;
        }
        throw C36321k7.A06();
    }
}
