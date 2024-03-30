package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.whatsapp.R;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.regex.Pattern;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.4c5  reason: invalid class name and case insensitive filesystem */
public class C91484c5 extends AsyncTask {
    public Context A00;
    public Bitmap A01 = null;
    public String A02;

    public C91484c5(Context context, String str) {
        this.A00 = context;
        this.A02 = str;
    }

    public /* synthetic */ Object doInBackground(Object[] objArr) {
        InputStream inputStream = null;
        try {
            Pattern compile = Pattern.compile("(https)?:\\/\\/.*\\.(?:png|jpg)");
            String str = this.A02;
            if (C36361kB.A1Z(str, compile)) {
                inputStream = C90504aG.A0r(str).getInputStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                this.A01 = decodeStream;
                if (decodeStream != null) {
                    this.A01 = Bitmap.createScaledBitmap(decodeStream, 50, 50, false);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return this.A01;
            }
            throw C90524aI.A0X("Pattern didn't match");
        } catch (IOException | MalformedURLException unused2) {
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        GetCredential getCredential;
        int i;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            try {
                getCredential = (GetCredential) this.A00;
                i = R.id.bank_image;
                C36411kG.A0Q(getCredential, R.id.bank_image).setImageBitmap(bitmap);
            } catch (Exception unused) {
                return;
            }
        } else {
            getCredential = (GetCredential) this.A00;
            Resources resources = getCredential.getResources();
            Drawable drawable = resources.getDrawable(resources.getIdentifier(this.A02, "drawable", getCredential.getPackageName()));
            i = R.id.bank_image;
            C36411kG.A0Q(getCredential, R.id.bank_image).setImageDrawable(drawable);
        }
        C36411kG.A0Q(getCredential, i).setVisibility(0);
    }
}
