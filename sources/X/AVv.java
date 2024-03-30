package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public final /* synthetic */ class AVv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C180348lc A03;
    public final /* synthetic */ C203399nx A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AVv(AnonymousClass155 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C180348lc r3, C203399nx r4, String str, String str2, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = str;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = r4;
        this.A06 = str2;
    }

    public final void run() {
        C180348lc r7 = this.A03;
        int i = this.A00;
        AnonymousClass155 r5 = this.A01;
        String str = this.A05;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        C203399nx r3 = this.A04;
        String str2 = this.A06;
        r7.A02.A0D(new C21240ADw(r5, pinBottomSheetDialogFragment, r7, str, i), r3, r7.A00.A0A, str2);
    }
}
