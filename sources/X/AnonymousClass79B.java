package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import java.util.TimerTask;

/* renamed from: X.79B  reason: invalid class name */
public class AnonymousClass79B extends TimerTask {
    public final /* synthetic */ BusinessDirectoryActivity A00;

    public AnonymousClass79B(BusinessDirectoryActivity businessDirectoryActivity) {
        this.A00 = businessDirectoryActivity;
    }

    public void run() {
        this.A00.runOnUiThread(new C1497172m(this, 23));
    }
}
