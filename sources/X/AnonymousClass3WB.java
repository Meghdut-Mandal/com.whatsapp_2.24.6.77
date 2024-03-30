package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3WB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WB implements DialogInterface.OnKeyListener {
    public final /* synthetic */ AnonymousClass3PV A00;
    public final /* synthetic */ LinkedDevicesEnterCodeActivity A01;

    public /* synthetic */ AnonymousClass3WB(AnonymousClass3PV r1, LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        this.A01 = linkedDevicesEnterCodeActivity;
        this.A00 = r1;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = this.A01;
        AnonymousClass3PV r1 = this.A00;
        if (i != 4) {
            return false;
        }
        Log.i("LinkedDevicesEnterCodeActivity cancel the progress dialog on press back button");
        AnonymousClass3D4 r0 = linkedDevicesEnterCodeActivity.A08;
        C18740tg.A01();
        C64233Ne r02 = r0.A01;
        if (r02 != null) {
            C64233Ne.A00(r02).A03();
        }
        if (r1 != null) {
            new C76843pX(linkedDevicesEnterCodeActivity.A0E).A00(r1.A02, (String) null);
        }
        if (linkedDevicesEnterCodeActivity.BLh()) {
            return true;
        }
        LinkedDevicesEnterCodeActivity.A01(linkedDevicesEnterCodeActivity);
        linkedDevicesEnterCodeActivity.finish();
        return true;
    }
}
