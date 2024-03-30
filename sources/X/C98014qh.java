package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.4qh  reason: invalid class name and case insensitive filesystem */
public class C98014qh extends AnonymousClass72f {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;
    public final /* synthetic */ AnonymousClass6SQ A02;
    public final /* synthetic */ C140176l9 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98014qh(DataTask dataTask, NetworkSession networkSession, AnonymousClass6SQ r4, C140176l9 r5) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = networkSession;
        this.A00 = dataTask;
    }

    public void run() {
        this.A01.canHandleStreamingUploadUpdate(this.A00.mTaskIdentifier);
    }
}
