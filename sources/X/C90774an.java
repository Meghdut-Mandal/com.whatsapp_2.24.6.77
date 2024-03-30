package X;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4an  reason: invalid class name and case insensitive filesystem */
public class C90774an extends AbstractThreadedSyncAdapter {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C27381Nz A02;

    public C90774an(C19700wN r3, C19730wQ r4, C27381Nz r5, C19630wG r6) {
        super(r6.A00, true);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (!this.A01.A0L()) {
            C131666Pz r1 = new C131666Pz(C108515Tu.A02);
            r1.A03 = true;
            r1.A04 = true;
            r1.A00 = AnonymousClass6NS.A0C;
            C131586Pq A012 = r1.A01();
            C106765Lg r4 = new C106765Lg(true);
            A012.A02(r4);
            C27381Nz r3 = this.A02;
            r3.A0R.execute(new C35681j5(r3, A012, 7));
            try {
                r4.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                C18740tg.A0A(e);
                Log.e("ContactsSyncAdapterService/onCreate", e);
                this.A00.A0E("ContactsSyncAdapterService/onCreate", e.getMessage(), true);
            }
        }
    }
}
