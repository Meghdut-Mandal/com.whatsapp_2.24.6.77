package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment;

/* renamed from: X.3VC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VC implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceUpdateDialogFragment A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3VC(DeviceUpdateDialogFragment deviceUpdateDialogFragment, AnonymousClass11F r2, AnonymousClass11F r3, String str) {
        this.A00 = deviceUpdateDialogFragment;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = this.A00;
        String str = this.A03;
        AnonymousClass11F r2 = this.A01;
        AnonymousClass11F r1 = this.A02;
        if (deviceUpdateDialogFragment.A01.A0M(r2)) {
            str = r1.getRawString();
        }
        deviceUpdateDialogFragment.A1C(AnonymousClass190.A15(deviceUpdateDialogFragment.A1D(), str));
    }
}
