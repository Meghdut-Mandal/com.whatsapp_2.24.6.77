package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: X.3w2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80833w2 implements Runnable {
    public final /* synthetic */ AnonymousClass28U A00;
    public final /* synthetic */ C609039u A01;
    public final /* synthetic */ AnonymousClass3AD A02;
    public final /* synthetic */ C20810yC A03;
    public final /* synthetic */ AnonymousClass3T1 A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C80833w2(AnonymousClass28U r1, C609039u r2, AnonymousClass3AD r3, C20810yC r4, AnonymousClass3T1 r5, WebPagePreviewView webPagePreviewView, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A05 = webPagePreviewView;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = z;
        this.A06 = list;
        this.A08 = z2;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass1M0 A052;
        C609039u r1 = this.A01;
        WebPagePreviewView webPagePreviewView = this.A05;
        C20810yC r6 = this.A03;
        AnonymousClass28U r7 = this.A00;
        AnonymousClass3T1 r5 = this.A04;
        boolean z = this.A07;
        List list = this.A06;
        boolean z2 = this.A08;
        AnonymousClass3AD r8 = this.A02;
        C62323Fs r0 = (C62323Fs) webPagePreviewView.getTag();
        try {
            AnonymousClass28U r4 = r0.A00;
            if (!r4.A0K.isEmpty()) {
                r4.A0F((AnonymousClass00I) r4.A0K.toArray()[0], r6);
            }
            AnonymousClass3T1 r3 = r0.A01;
            AnonymousClass3BG r42 = r3.A0V;
            if (r42 != null) {
                byte[] bArr = r7.A0R;
                if (bArr == null) {
                    bArr = r7.A0Q;
                }
                r42.A00 = bArr;
            }
            if (r3.A1J.A01.equals(r5.A1J.A01)) {
                r1.A00.A0H(new C80663vl(r7, r8, webPagePreviewView, list, z, z2));
            }
            byte[] bArr2 = r7.A0R;
            if (!(bArr2 == null && (bArr2 = r7.A0Q) == null)) {
                AnonymousClass1TW r43 = r1.A02;
                long j = r3.A1N;
                A052 = r43.A00.A05();
                ContentValues A0E = C36441kJ.A0E();
                A0E.put("full_thumbnail", bArr2);
                if (A052.A02.A01(A0E, "message_external_ad_content", "message_row_id=?", "ExternalAdContentInfoStore/updateFullThumbnail", C36341k9.A1b(j)) == 0) {
                    Log.e("ExternalAdContentInfoStore/updateFullThumbnail/full thumbnail wasn't updated");
                }
                A052.close();
            }
        } catch (IOException | URISyntaxException e) {
            Log.w("ConversationPageInfoLoader/load/failed to load thumb", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r1.A05.remove(r0.A01.A1J.A01);
        return;
        throw th;
    }
}
