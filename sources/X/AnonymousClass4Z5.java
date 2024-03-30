package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.List;

/* renamed from: X.4Z5  reason: invalid class name */
public class AnonymousClass4Z5 implements AnonymousClass4SX {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z5(Object obj, int i) {
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
