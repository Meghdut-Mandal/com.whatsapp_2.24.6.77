package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.5Zw  reason: invalid class name and case insensitive filesystem */
public abstract class C109985Zw {
    public static void A00(View view, C1271967i r19, C140456lc r20, C132376Ti r21) {
        C138266ha r5;
        C140456lc r4 = r20;
        String A0O = C140456lc.A0O(r4);
        C160377ku A0X = r4.A0X(44);
        C1271967i r3 = r19;
        if (A0X != null) {
            r5 = new C138266ha(r3, r4, A0X);
        } else {
            r5 = null;
        }
        String str = (String) C140456lc.A0I(r4, 43);
        String str2 = (String) C140456lc.A0I(r4, 45);
        String A0N = C140456lc.A0N(r4);
        String str3 = (String) C140456lc.A0I(r4, 48);
        String A0J = C140456lc.A0J(r4);
        String A0K = C140456lc.A0K(r4);
        String A0M = C140456lc.A0M(r4);
        boolean A0f = r4.A0f(46, false);
        boolean A0f2 = r4.A0f(38, false);
        int A0T = r4.A0T(50, -1);
        Context context = r3.A00;
        View view2 = view;
        RecyclerView A0J2 = C90504aG.A0J(view2, R.id.recycler_view);
        view2.getContext();
        C36351kA.A1F(A0J2, 1);
        A0J2.A0U = true;
        try {
            A0J2.setAdapter(new C40721w0(LayoutInflater.from(context), r5, r21.A02.A00(), str, str2, A0N, str3, A0J, A0K, A0M, new JSONArray(A0O), A0T, A0f, A0f2));
        } catch (JSONException unused) {
            C36321k7.A1P("WaBkComponentConfiguratorImpl/bindView data source is not a valid JSON: ", A0O, AnonymousClass000.A0u());
        }
    }
}
