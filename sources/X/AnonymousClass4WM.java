package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.4WM  reason: invalid class name */
public class AnonymousClass4WM extends C67333Zk {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WM(C19970wo r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (2 - this.A01 == 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
            if (!myStatusesActivity.A0x.isEmpty()) {
                myStatusesActivity.A3j(view, C36411kG.A0n(myStatusesActivity.A0X.A00, i));
                return;
            }
        }
        super.onItemClick(adapterView, view, i, j);
    }
}
