package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.io.File;
import java.util.List;

/* renamed from: X.1nY  reason: invalid class name and case insensitive filesystem */
public class C38001nY extends BaseAdapter implements Filterable {
    public final C38091nh A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass39A r7;
        String A07;
        int i2 = 0;
        if (view != null) {
            r7 = (AnonymousClass39A) view.getTag();
        } else {
            view = C36431kI.A0J(this.A01.getLayoutInflater(), R.layout.f9nameremoved);
            r7 = new AnonymousClass39A(view);
            view.setTag(r7);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0Q;
        if (list != null) {
            AnonymousClass3GY r5 = (AnonymousClass3GY) list.get(i);
            ImageView imageView = r7.A01;
            Context context = view.getContext();
            File file = r5.A00;
            if (file == null) {
                A07 = "";
            } else {
                A07 = AnonymousClass6YY.A07(file.getAbsolutePath());
                AnonymousClass00C.A08(A07);
            }
            String A0N = AnonymousClass1GW.A0N(A07);
            AnonymousClass00C.A0B(context);
            Drawable A012 = AnonymousClass3MS.A01(context, A0N, A07, false);
            AnonymousClass00C.A08(A012);
            imageView.setImageDrawable(A012);
            r7.A04.setText(C65783Tl.A03(view.getContext(), documentPickerActivity.A0E, file.getName(), documentPickerActivity.A0O));
            r7.A03.setText(AnonymousClass3TF.A02(documentPickerActivity.A0E, r5.A02));
            TextView textView = r7.A02;
            C18820ts r0 = documentPickerActivity.A0E;
            long j = r5.A01;
            textView.setText(AnonymousClass3UY.A0F(r0, j, false));
            textView.setContentDescription(AnonymousClass3UY.A0F(documentPickerActivity.A0E, j, true));
            View view2 = r7.A00;
            C36331k8.A0q(documentPickerActivity, view2, R.string.f12nameremoved);
            if (documentPickerActivity.A0Y.contains(r5)) {
                view.setBackgroundResource(R.drawable.contact_row_selection);
            } else {
                view.setBackgroundResource(0);
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return view;
    }

    public boolean isEmpty() {
        return false;
    }

    public C38001nY(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
        this.A00 = new C38091nh(documentPickerActivity);
    }

    public int getCount() {
        return C36371kC.A06(this.A01.A0Q);
    }

    public Object getItem(int i) {
        List list = this.A01.A0Q;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public Filter getFilter() {
        return this.A00;
    }
}
