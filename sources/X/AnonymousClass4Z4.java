package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.List;

/* renamed from: X.4Z4  reason: invalid class name */
public class AnonymousClass4Z4 implements C35041i3 {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BhO(List list) {
        if (this.A01 != 0) {
            StatusPlaybackContactFragment.A0C((StatusPlaybackContactFragment) this.A00);
        } else {
            ((MyStatusesActivity) this.A00).A0X.notifyDataSetChanged();
        }
    }
}
