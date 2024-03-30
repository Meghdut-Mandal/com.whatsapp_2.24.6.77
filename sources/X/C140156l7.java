package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.6l7  reason: invalid class name and case insensitive filesystem */
public class C140156l7 implements DataTaskListener {
    public final /* synthetic */ C140176l9 A00;

    public C140156l7(C140176l9 r1) {
        this.A00 = r1;
    }

    public void onCancelDataTask(String str, NetworkSession networkSession) {
        AnonymousClass6SQ r3 = (AnonymousClass6SQ) this.A00.A05.get(str);
        if (r3 != null) {
            AnonymousClass6SQ.A00(NetworkUtils.newErrorURLResponse(r3.A04), r3, C90524aI.A0X("Task cancelled."), (byte[]) null);
        }
    }

    public void onNewTask(DataTask dataTask, NetworkSession networkSession) {
        try {
            this.A00.A03.Boy(new AnonymousClass737(this, dataTask, networkSession, 33));
        } catch (RejectedExecutionException e) {
            Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e);
            throw e;
        }
    }

    public void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
        C36421kH.A1G(this.A00.A03, this, bArr, str, 25);
    }
}
