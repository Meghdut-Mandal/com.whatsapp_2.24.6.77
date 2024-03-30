package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3Lc  reason: invalid class name and case insensitive filesystem */
public abstract class C63713Lc {
    public static View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        A01(inflate, i, 0, R.drawable.gray_circle, i2);
        ImageView A0N = C36391kE.A0N(inflate, R.id.contactpicker_row_photo);
        if (A0N != null) {
            AnonymousClass3UF.A0E(A0N, inflate.getResources().getColor(R.color.f6nameremoved));
        }
        return inflate;
    }

    public static void A01(View view, int i, int i2, int i3, int i4) {
        C34081gQ.A02(view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C012005e.A02(view, R.id.contactpicker_row_photo);
        AnonymousClass3UF.A0B(view.getContext(), thumbnailButton, i, i2);
        C36441kJ.A1D(thumbnailButton);
        thumbnailButton.setBackgroundResource(i3);
        thumbnailButton.A06 = true;
        TextView A0P = C36391kE.A0P(view, R.id.contactpicker_row_name);
        C33511fU.A03(A0P);
        A0P.setText(i4);
        C36381kD.A18(view, R.id.contactpicker_row_status);
    }
}
