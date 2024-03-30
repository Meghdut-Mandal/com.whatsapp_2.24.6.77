package X;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: X.0gx  reason: invalid class name and case insensitive filesystem */
public class C11760gx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String[] A02;

    public C11760gx(Activity activity, String[] strArr, int i) {
        this.A02 = strArr;
        this.A01 = activity;
        this.A00 = i;
    }

    public void run() {
        String[] strArr = this.A02;
        int length = strArr.length;
        int[] iArr = new int[length];
        Activity activity = this.A01;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((AnonymousClass01H) activity).onRequestPermissionsResult(this.A00, strArr, iArr);
    }
}
