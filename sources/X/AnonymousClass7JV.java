package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: X.7JV  reason: invalid class name */
public final class AnonymousClass7JV extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C133346Xy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JV(C133346Xy r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ApplicationInfo applicationInfo;
        String str;
        Context context = this.this$0.A00.A00;
        PackageInfo A02 = AnonymousClass1L0.A02(context, context.getPackageName());
        if (A02 != null && (applicationInfo = A02.applicationInfo) != null && (str = applicationInfo.dataDir) != null) {
            return str;
        }
        throw AnonymousClass001.A09("AccountSwitchingFileManager/getApplicationDataDir/unable to get application path");
    }
}
