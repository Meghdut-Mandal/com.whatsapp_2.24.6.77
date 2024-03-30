package X;

import android.content.Context;
import android.os.AsyncTask;
import com.caverock.androidsvg.SVGImageView;

/* renamed from: X.4c4  reason: invalid class name and case insensitive filesystem */
public class C91474c4 extends AsyncTask {
    public int A00;
    public Context A01;
    public final /* synthetic */ SVGImageView A02;

    public C91474c4(Context context, SVGImageView sVGImageView, int i) {
        this.A02 = sVGImageView;
        this.A01 = context;
        this.A00 = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.A01     // Catch:{ Auz -> 0x001e }
            int r2 = r4.A00     // Catch:{ Auz -> 0x001e }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Auz -> 0x001e }
            X.9ou r0 = new X.9ou     // Catch:{ Auz -> 0x001e }
            r0.<init>()     // Catch:{ Auz -> 0x001e }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ Auz -> 0x001e }
            X.9gS r0 = r0.A0T(r1)     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0039 }
            return r0
        L_0x0019:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            throw r0     // Catch:{ Auz -> 0x001e }
        L_0x001e:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            r1 = 0
            int r0 = r4.A00
            X.AnonymousClass000.A1L(r2, r0, r1)
            r0 = 1
            X.C90514aH.A1U(r3, r2, r0)
            java.lang.String r0 = "Error loading resource 0x%x: %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.String r0 = "SVGImageView"
            android.util.Log.e(r0, r1)
            r0 = 0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91474c4.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.A02;
        sVGImageView.A00 = (C200029gS) obj;
        SVGImageView.A01(sVGImageView);
    }
}
