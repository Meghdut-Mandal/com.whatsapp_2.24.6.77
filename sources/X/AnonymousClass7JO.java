package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.7JO  reason: invalid class name */
public final class AnonymousClass7JO extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C138666iU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JO(C138666iU r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C138666iU r0;
        Context context;
        String str;
        C114455hH r4;
        if (Build.VERSION.SDK_INT >= 23) {
            C138666iU r1 = this.this$0;
            if (r1.A03 != null && r1.A06) {
                File noBackupFilesDir = r1.A01.getNoBackupFilesDir();
                AnonymousClass00C.A08(noBackupFilesDir);
                File A0w = C36441kJ.A0w(noBackupFilesDir, this.this$0.A03);
                context = this.this$0.A01;
                str = A0w.getAbsolutePath();
                r4 = new C114455hH();
                r0 = this.this$0;
                C91044bM r12 = new C91044bM(context, r0.A02, r4, str, r0.A05);
                r12.setWriteAheadLoggingEnabled(this.this$0.A00);
                return r12;
            }
        }
        r0 = this.this$0;
        context = r0.A01;
        str = r0.A03;
        r4 = new C114455hH();
        C91044bM r122 = new C91044bM(context, r0.A02, r4, str, r0.A05);
        r122.setWriteAheadLoggingEnabled(this.this$0.A00);
        return r122;
    }
}
