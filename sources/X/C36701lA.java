package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.1lA  reason: invalid class name and case insensitive filesystem */
public class C36701lA extends ContentObserver {
    public final /* synthetic */ C19730wQ A00;
    public final /* synthetic */ AnonymousClass3E0 A01;
    public final /* synthetic */ C20430xY A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36701lA(C19730wQ r2, AnonymousClass3E0 r3, C20430xY r4) {
        super((Handler) null);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void onChange(boolean z) {
        Log.i("AndroidContactsContentObserver/onChange");
        C19730wQ r1 = this.A00;
        r1.A0G();
        if (r1.A00 != null && !r1.A0L()) {
            this.A02.A07();
        }
    }
}
