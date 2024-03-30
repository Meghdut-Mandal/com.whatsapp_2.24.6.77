package X;

import com.whatsapp.backup.google.workers.BackupGpbSignalWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.workers.BackupGpbSignalWorker", f = "BackupGpbSignalWorker.kt", i = {0}, l = {161}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.7A3  reason: invalid class name */
public final class AnonymousClass7A3 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BackupGpbSignalWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7A3(BackupGpbSignalWorker backupGpbSignalWorker, C023509x r2) {
        super(r2);
        this.this$0 = backupGpbSignalWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A08(this);
    }
}
