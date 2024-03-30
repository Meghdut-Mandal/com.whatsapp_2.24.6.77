package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.4eM  reason: invalid class name and case insensitive filesystem */
public class C92674eM extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final AnonymousClass6CW A03;
    public final boolean A04 = true;

    public C92674eM(Context context, AnonymousClass6CW r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        }
        TextView A0P = C36391kE.A0P(view, R.id.location_name);
        TextView A0P2 = C36391kE.A0P(view, R.id.location_description);
        ImageView A0N = C36391kE.A0N(view, R.id.location_icon);
        if (this.A04) {
            Context context = this.A02;
            AnonymousClass06T.A00(AnonymousClass00F.A04(context, C36411kG.A01(context)), A0N);
        }
        List list = this.A01;
        if (list != null && i < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i);
            A0P.setText(placeInfo.A06);
            int i2 = 0;
            if (!TextUtils.isEmpty(placeInfo.A09)) {
                A0P2.setVisibility(0);
                A0P2.setText(placeInfo.A09);
                A0P2.setSingleLine(true);
            } else {
                A0P2.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                A0P.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pin_location_red, 0);
            } else {
                A0P.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (placeInfo.A03 == 3) {
                i2 = this.A02.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            A0N.setPadding(i2, i2, i2, i2);
            String str = placeInfo.A05;
            if (str != null) {
                this.A03.A01(A0N, str);
            } else {
                A0N.setImageDrawable((Drawable) null);
                return view;
            }
        }
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return C36371kC.A06(this.A01);
    }

    public Object getItem(int i) {
        List list = this.A01;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.A01.get(i);
    }
}
