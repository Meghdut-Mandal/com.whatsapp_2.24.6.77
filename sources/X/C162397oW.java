package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.qrcode.QrScannerViewV2;

/* renamed from: X.7oW  reason: invalid class name and case insensitive filesystem */
public class C162397oW extends GestureDetector.SimpleOnGestureListener {
    public Object A00;
    public final int A01;

    public C162397oW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A01 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (4 - this.A01 != 0) {
            super.onLongPress(motionEvent);
            return;
        }
        View view = (View) this.A00;
        if (view.isLongClickable()) {
            view.performLongClick();
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (3 - this.A01 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        ((QrScannerViewV2) this.A00).A00.B7U(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A01) {
            case 1:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
                return ((C160717lT) ((C96094mm) stickyHeadersRecyclerView.A0G).A00).Bhn(motionEvent, stickyHeadersRecyclerView.A04, stickyHeadersRecyclerView.A01);
            case 2:
                return AnonymousClass6WR.A03((AnonymousClass6WR) this.A00);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
