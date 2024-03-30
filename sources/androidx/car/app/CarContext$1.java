package androidx.car.app;

import X.AnonymousClass001;
import X.AnonymousClass01M;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass75C;
import X.C156827b1;
import X.C90974bF;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    public final /* synthetic */ C90974bF this$0;
    public final /* synthetic */ Executor val$executor;
    public final /* synthetic */ AnonymousClass01M val$lifecycle;
    public final /* synthetic */ C156827b1 val$listener;

    public CarContext$1(C90974bF r1, AnonymousClass01M r2, Executor executor, C156827b1 r4) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
        this.val$executor = executor;
        this.val$listener = r4;
    }

    public static /* synthetic */ void lambda$onRequestPermissionsResult$0(C156827b1 r0, List list, List list2) {
        throw AnonymousClass001.A0A("onRequestPermissionsResult");
    }

    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((AnonymousClass01N) this.val$lifecycle).A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
            this.val$executor.execute(new AnonymousClass75C(Arrays.asList(strArr), Arrays.asList(strArr2)));
        }
    }
}
