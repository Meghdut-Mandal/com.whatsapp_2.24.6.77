package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;

/* renamed from: X.3AZ  reason: invalid class name */
public final class AnonymousClass3AZ {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final PopupWindow A03;
    public final WaTextView A04;
    public final C18820ts A05;
    public final DefaultRecipientsView A06;
    public final int[] A07 = new int[2];

    public AnonymousClass3AZ(Context context, C18820ts r7, DefaultRecipientsView defaultRecipientsView) {
        this.A02 = context;
        this.A05 = r7;
        this.A06 = defaultRecipientsView;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f7nameremoved);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.f7nameremoved);
        WaTextView waTextView = new WaTextView(context);
        this.A04 = waTextView;
        C36331k8.A0r(context, waTextView, R.color.f6nameremoved);
        C33511fU.A03(waTextView);
        waTextView.setPadding(dimensionPixelOffset2, dimensionPixelOffset * 2, dimensionPixelOffset2, dimensionPixelOffset);
        this.A01 = dimensionPixelOffset;
        PopupWindow popupWindow = new PopupWindow(waTextView, -2, -2, false);
        this.A03 = popupWindow;
        popupWindow.setFocusable(true);
    }
}
