package X;

import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.util.Log;
import com.whatsapp.R;

/* renamed from: X.1lg  reason: invalid class name and case insensitive filesystem */
public class C37021lg extends AsyncTask {
    public final /* synthetic */ AnonymousClass9UJ A00;
    public final /* synthetic */ C86984Na A01;

    public C37021lg(AnonymousClass9UJ r1, C86984Na r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        AnonymousClass2Dr r4 = ((C68203bV) this.A01).A00;
        ((AnonymousClass2E6) r4.findViewById(R.id.content)).setColor(C36391kE.A05(r4));
        AnonymousClass00F.A00(r4, C224314h.A00(r4));
        C011504z.A04(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}), r4.findViewById(R.id.bottom_shade));
        C011504z.A04(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, 0}), r4.findViewById(R.id.top_shade));
    }
}
