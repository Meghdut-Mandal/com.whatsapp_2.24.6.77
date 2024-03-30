package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2b6  reason: invalid class name */
public abstract class AnonymousClass2b6 extends C39331s2 {
    public C20690y0 A00;
    public AnonymousClass17Y A01;

    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
        String stringExtra = getIntent().getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        AnonymousClass00C.A0B(stringExtra);
        String replaceAll = stringExtra.replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
        AnonymousClass00C.A08(replaceAll);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
        C20690y0 r0 = this.A00;
        if (r0 != null) {
            File file = r0.A08().A0F;
            C20690y0.A07(file, false);
            StringBuilder A0v = AnonymousClass000.A0v(replaceAll);
            A0v.append(' ');
            A0v.append(simpleDateFormat.format(new Date()));
            File A0w = C36441kJ.A0w(file, AnonymousClass000.A0q(".jpg", A0v));
            if (uri != null) {
                try {
                    String path = uri.getPath();
                    if (path != null) {
                        C20690y0 r1 = this.A00;
                        if (r1 != null) {
                            r1.A0e(new File(path), A0w);
                            AnonymousClass1GW.A0O(this, Uri.fromFile(A0w));
                            AnonymousClass17Y r12 = this.A01;
                            if (r12 != null) {
                                r12.A06(R.string.f12nameremoved, 0);
                                finish();
                                return;
                            }
                            th = C36321k7.A06();
                        } else {
                            th = C36331k8.A0d("fMessageIO");
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("viewprofilephoto/save/failed", e);
                    AnonymousClass17Y r2 = this.A01;
                    if (r2 != null) {
                        r2.A06(R.string.f12nameremoved, 1);
                    } else {
                        throw C36321k7.A06();
                    }
                }
            }
            th = new IOException("Invalid Uri");
            throw th;
        }
        throw C36331k8.A0d("fMessageIO");
    }
}
