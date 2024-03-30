package X;

import com.whatsapp.R;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;

/* renamed from: X.6wM  reason: invalid class name and case insensitive filesystem */
public class C146906wM implements C160757lX {
    public final /* synthetic */ MessagesExporterService A00;

    public C146906wM(MessagesExporterService messagesExporterService) {
        this.A00 = messagesExporterService;
    }

    public void BT4() {
        MessagesExporterService messagesExporterService = this.A00;
        C132156Sl r4 = messagesExporterService.A01;
        Log.i("MessagesExporterNotificationManager/onCancellationComplete()");
        C132156Sl.A01(r4, C36421kH.A0B(r4.A00).getString(R.string.f12nameremoved), (String) null, -1, true);
        Log.i("xpm-export-service-onCancellationCompleted/sent export cancellation complete logging");
        messagesExporterService.stopSelf();
    }

    public void BT5() {
        C132156Sl r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onCancelling()");
        C132156Sl.A01(r4, C36421kH.A0B(r4.A00).getString(R.string.f12nameremoved), (String) null, -1, false);
    }

    public void BXA() {
        Log.i("xpm-export-service-onComplete/success");
        C132156Sl r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onComplete()");
        C132156Sl.A01(r4, C36421kH.A0B(r4.A00).getString(R.string.f12nameremoved), (String) null, -1, true);
        Log.i("xpm-export-service-onComplete/sent export complete logging");
    }

    public void BXC() {
        this.A00.A01.A02(0);
    }

    public void BXB(int i) {
        C36321k7.A1T("xpm-export-service-onProgress; progress=", AnonymousClass000.A0u(), i);
        this.A00.A01.A02(i);
    }

    public void onError(int i) {
        C36321k7.A1T("xpm-export-service-onError/errorCode = ", AnonymousClass000.A0u(), i);
        C132156Sl r4 = this.A00.A01;
        C19630wG r2 = r4.A00;
        C132156Sl.A01(r4, C36421kH.A0B(r2).getString(R.string.f12nameremoved), C36421kH.A0B(r2).getString(R.string.f12nameremoved), -1, true);
    }
}
