package X;

import android.view.View;
import com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment;

/* renamed from: X.3pH  reason: invalid class name and case insensitive filesystem */
public final class C76683pH implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ SMSPreviewInviteBottomSheetFragment A02;
    public final /* synthetic */ AnonymousClass147 A03;

    public C76683pH(View view, SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, AnonymousClass147 r3, int i) {
        this.A02 = sMSPreviewInviteBottomSheetFragment;
        this.A01 = view;
        this.A03 = r3;
        this.A00 = i;
    }

    public void BVN(String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        AnonymousClass01I A0h = sMSPreviewInviteBottomSheetFragment.A0h();
        if (A0h != null) {
            A0h.runOnUiThread(new C80293vA(sMSPreviewInviteBottomSheetFragment, this.A01, 23));
        }
    }

    public void BWw(C203399nx r6, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        AnonymousClass01I A0h = sMSPreviewInviteBottomSheetFragment.A0h();
        if (A0h != null) {
            A0h.runOnUiThread(new C80293vA(sMSPreviewInviteBottomSheetFragment, this.A01, 24));
        }
    }

    public void BiM(C203399nx r8, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        sMSPreviewInviteBottomSheetFragment.A0C = true;
        AnonymousClass01I A0h = sMSPreviewInviteBottomSheetFragment.A0h();
        if (A0h != null) {
            A0h.runOnUiThread(new C80513vW(sMSPreviewInviteBottomSheetFragment, this.A01, this.A03, this.A00, 15));
        }
    }
}
