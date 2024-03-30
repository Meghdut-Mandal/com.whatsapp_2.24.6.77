package X;

import android.os.FileObserver;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5Qp  reason: invalid class name and case insensitive filesystem */
public class C107725Qp extends File {
    public final CountDownLatch mFileCreatedCondition = C90484aE.A0u();
    public volatile FileObserver mFileObserver;
    public volatile boolean mIsClosed = false;
    public volatile boolean mIsTailing = false;
    public volatile AnonymousClass7c7 mListener = null;
    public volatile FileObserver mParentFolderObserver;

    public void A00() {
        this.mIsClosed = true;
        synchronized (this) {
            if (this.mFileObserver != null) {
                this.mFileObserver.stopWatching();
                this.mFileObserver = null;
            }
        }
        synchronized (this) {
            if (this.mParentFolderObserver != null) {
                this.mParentFolderObserver.stopWatching();
                this.mParentFolderObserver = null;
            }
        }
    }

    public C107725Qp(String str, boolean z) {
        super(str);
        this.mIsTailing = z;
    }
}
