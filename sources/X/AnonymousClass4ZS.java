package X;

import android.os.Handler;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.4ZS  reason: invalid class name */
public class AnonymousClass4ZS implements AnonymousClass4RS {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bou(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((C49632jR) obj).A00 = i;
                return;
            case 1:
                C40041ue.A01((C40041ue) obj, i);
                return;
            case 2:
                ((C49702jY) obj).A00 = i;
                return;
            default:
                Handler handler = ((SetAboutInfo) obj).A08;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
                return;
        }
    }
}
