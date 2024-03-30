package X;

import android.os.AsyncTask;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.4c3  reason: invalid class name and case insensitive filesystem */
public class C91464c3 extends AsyncTask {
    public final /* synthetic */ SVGImageView A00;

    public C91464c3(SVGImageView sVGImageView) {
        this.A00 = sVGImageView;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        InputStream[] inputStreamArr = (InputStream[]) objArr;
        try {
            C200029gS A0T = new C203809ou().A0T(inputStreamArr[0]);
            try {
                inputStreamArr[0].close();
                return A0T;
            } catch (IOException unused) {
                return A0T;
            }
        } catch (C22735Auz e) {
            Log.e("SVGImageView", C36331k8.A0i("Parse error loading URI: ", AnonymousClass000.A0u(), e));
            try {
                inputStreamArr[0].close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStreamArr[0].close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.A00;
        sVGImageView.A00 = (C200029gS) obj;
        SVGImageView.A01(sVGImageView);
    }
}
