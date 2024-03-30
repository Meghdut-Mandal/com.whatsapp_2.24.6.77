package X;

import android.os.Bundle;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinFromDiscoveryBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistJoinFromInvokeBottomSheet;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistRequestedBottomSheet;

/* renamed from: X.4Ht  reason: invalid class name and case insensitive filesystem */
public final class C85614Ht extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass4PL $tosAcceptedCallback;
    public final /* synthetic */ C51412nm $tosType;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85614Ht(C225314u r2, AnonymousClass4PL r3, AnonymousClass1K6 r4, C51412nm r5, Integer num) {
        super(0);
        this.this$0 = r4;
        this.$dialogActivity = r2;
        this.$entryPoint = num;
        this.$tosType = r5;
        this.$tosAcceptedCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet;
        int ordinal = this.this$0.A03.A02().ordinal();
        if (ordinal == 0) {
            AnonymousClass1K6 r8 = this.this$0;
            C225314u r6 = this.$dialogActivity;
            Integer num = this.$entryPoint;
            C51412nm r9 = this.$tosType;
            C84814Er r4 = new C84814Er(r8, new C85604Hs(r6, this.$tosAcceptedCallback, r8, r9, num));
            int A06 = C36431kI.A06(r9, 1);
            if (A06 == 0) {
                bonsaiWaitlistJoinBottomSheet = new BonsaiWaitlistJoinFromInvokeBottomSheet();
            } else if (A06 == 1 || A06 == 2) {
                bonsaiWaitlistJoinBottomSheet = new BonsaiWaitlistJoinFromDiscoveryBottomSheet();
            } else {
                throw C36441kJ.A18();
            }
            if (num != null) {
                Bundle A07 = AnonymousClass001.A07();
                A07.putInt("bonsaiWaitlistDialogEntryPoint", num.intValue());
                bonsaiWaitlistJoinBottomSheet.A17(A07);
            }
            bonsaiWaitlistJoinBottomSheet.A04 = r4;
            r6.Btm(bonsaiWaitlistJoinBottomSheet);
        } else if (ordinal == 1) {
            this.$dialogActivity.Btm(new BonsaiWaitlistRequestedBottomSheet());
        } else if (ordinal == 2) {
            AnonymousClass1K6 r42 = this.this$0;
            C225314u r3 = this.$dialogActivity;
            Integer num2 = this.$entryPoint;
            AnonymousClass1K6.A01(r3, this.$tosAcceptedCallback, r42, this.$tosType, num2);
        }
        return AnonymousClass0AJ.A00;
    }
}
