package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.3E0  reason: invalid class name */
public class AnonymousClass3E0 {
    public final ContentObserver A00;
    public final C19730wQ A01;
    public final C229216m A02;
    public volatile boolean A03;

    public void A00(C21060yb r6) {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03 && this.A02.A00() && !this.A01.A0L()) {
                    Log.i("androidcontactscontentobserver/registered");
                    this.A03 = true;
                    C21050ya A0O = r6.A0O();
                    Uri uri = ContactsContract.Contacts.CONTENT_URI;
                    ContentObserver contentObserver = this.A00;
                    C36321k7.A0v(uri, 0, contentObserver);
                    C21050ya.A00(A0O).registerContentObserver(uri, true, contentObserver);
                }
            }
        }
    }

    public AnonymousClass3E0(C19730wQ r2, C229216m r3, C20430xY r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = new C36701lA(r2, this, r4);
    }
}
