package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.6iM  reason: invalid class name and case insensitive filesystem */
public class C138586iM implements C17220qv {
    public final /* synthetic */ StickyHeadersRecyclerView A00;

    public void Ber(boolean z) {
    }

    public C138586iM(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A00 = stickyHeadersRecyclerView;
    }

    public boolean BZG(MotionEvent motionEvent, RecyclerView recyclerView) {
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A00;
        AnonymousClass0D3 r0 = stickyHeadersRecyclerView.A04;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        float y = motionEvent.getY();
        int height = stickyHeadersRecyclerView.A04.A0H.getHeight();
        int i = stickyHeadersRecyclerView.A02;
        if (i >= 0) {
            i = 0;
        }
        if (y > ((float) (height + i))) {
            return false;
        }
        stickyHeadersRecyclerView.A03.A00(motionEvent);
        return true;
    }

    public void BjE(MotionEvent motionEvent, RecyclerView recyclerView) {
        this.A00.A03.A00(motionEvent);
    }
}
