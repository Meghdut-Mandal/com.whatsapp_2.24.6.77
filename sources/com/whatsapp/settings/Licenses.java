package com.whatsapp.settings;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C89364Wg;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Licenses extends AnonymousClass155 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public Licenses(int i) {
        this.A00 = false;
        C89364Wg.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setContentView((int) R.layout.f9nameremoved);
        TextView A0Q = C36391kE.A0Q(this, R.id.licenses_view);
        try {
            InputStream openRawResource = getResources().openRawResource(R.raw.notices);
            try {
                int available = openRawResource.available();
                if (available <= 0) {
                    available = 32;
                }
                byteArrayOutputStream = new ByteArrayOutputStream(available);
                byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                openRawResource.close();
                if (str == null) {
                    str = getString(R.string.f12nameremoved);
                }
            } catch (Throwable th) {
                if (openRawResource != null) {
                    openRawResource.close();
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("licenses/cannot-load ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        A0Q.setText(str);
        return;
        throw th;
    }

    public Licenses() {
        this(0);
    }
}
