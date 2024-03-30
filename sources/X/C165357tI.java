package X;

import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7tI  reason: invalid class name and case insensitive filesystem */
public class C165357tI implements C009604b {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165357tI(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BQj(Object obj) {
        int i = this.A02;
        Object obj2 = this.A00;
        if (i != 0) {
            C143576qm r3 = (C143576qm) obj2;
            AnonymousClass1QW r2 = (AnonymousClass1QW) this.A01;
            if (((C009804d) obj).A00 == -1 || r2.A04()) {
                r3.A07.Bwx();
                return;
            }
            return;
        }
        Activity activity = (Activity) obj2;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator A0y = AnonymousClass000.A0y((Map) obj);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Boolean bool = (Boolean) A11.getValue();
            if (bool == null || !bool.booleanValue()) {
                A0I2.add(A11.getKey());
            } else {
                A0I.add(A11.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult(C36371kC.A1b(A0I, 0), C36371kC.A1b(A0I2, 0));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        activity.finish();
    }
}
