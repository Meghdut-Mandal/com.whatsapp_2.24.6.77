package X;

import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.6uU  reason: invalid class name and case insensitive filesystem */
public final class C145766uU implements C25371Ga {
    public final /* synthetic */ C1043159d A00;
    public final /* synthetic */ String A01;

    public void BXx(File file, String str, byte[] bArr) {
        AnonymousClass00C.A0D(str, 0);
        C1043159d r2 = this.A00;
        List list = AnonymousClass0D3.A0I;
        r2.A03 = null;
        if (file == null) {
            C36321k7.A1R("OnlineGifPreviewHolder/file is null for ", str, AnonymousClass000.A0u());
        } else if (str.equals(this.A01)) {
            if (bArr != null) {
                r2.A05.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, AnonymousClass1SV.A08));
            }
            C122535v0 r3 = r2.A02;
            if (r3 != null) {
                try {
                    File A0S = C90524aI.A0S(C90514aH.A0w(file));
                    AnonymousClass9WW r0 = C21656ATx.A04;
                    C21656ATx A012 = C21656ATx.A01(ParcelFileDescriptor.open(A0S, 268435456), false);
                    r3.A01 = A012;
                    C91334bq A06 = A012.A06(r3.A02.getContext());
                    r3.A00 = A06;
                    Boolean bool = C18750th.A01;
                    if (A06 != null) {
                        A06.start();
                    }
                } catch (IOException e) {
                    Log.e("gif/loading/io-exception", e);
                }
                r3.A03.setImageDrawable(r3.A00);
            }
            r2.A05.setVisibility(8);
        }
    }

    public void onFailure(Exception exc) {
        throw null;
    }

    public C145766uU(C1043159d r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
