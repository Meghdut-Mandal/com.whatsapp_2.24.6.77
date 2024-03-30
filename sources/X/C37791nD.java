package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.profile.SetAboutInfo;
import java.util.ArrayList;

/* renamed from: X.1nD  reason: invalid class name and case insensitive filesystem */
public class C37791nD extends ArrayAdapter {
    public final ArrayList A00;
    public final /* synthetic */ SetAboutInfo A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextEmojiLabel A0P;
        if (view == null) {
            view = C36381kD.A0K((LayoutInflater) C21060yb.A02(viewGroup.getContext(), "layout_inflater"), R.layout.f9nameremoved);
        }
        String A0e = C36421kH.A0e(this.A00, i);
        if (!(A0e == null || (A0P = C36401kF.A0P(view, R.id.status_row)) == null)) {
            View findViewById = view.findViewById(R.id.status_selected_check);
            SetAboutInfo setAboutInfo = this.A01;
            int i2 = 4;
            if (A0e.equals(setAboutInfo.A01.A00())) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            C36331k8.A0q(setAboutInfo, findViewById, R.string.f12nameremoved);
            A0P.A0I(A0e);
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37791nD(Context context, SetAboutInfo setAboutInfo, ArrayList arrayList) {
        super(context, R.id.status_row, arrayList);
        this.A01 = setAboutInfo;
        this.A00 = arrayList;
    }
}
