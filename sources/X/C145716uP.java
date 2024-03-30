package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.6uP  reason: invalid class name and case insensitive filesystem */
public class C145716uP implements AnonymousClass4U2 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ ImageComposerFragment A01;
    public final /* synthetic */ C160827le A02;

    public /* synthetic */ void B1h() {
    }

    public C145716uP(Bundle bundle, ImageComposerFragment imageComposerFragment, C160827le r3) {
        this.A01 = imageComposerFragment;
        this.A00 = bundle;
        this.A02 = r3;
    }

    public void BXH() {
        AnonymousClass01I A0h = this.A01.A0h();
        if (A0h != null) {
            A0h.A1q();
        }
    }

    public void Bi2(Bitmap bitmap, boolean z) {
        Uri uri;
        String str;
        C146806wC r1;
        ImageComposerFragment imageComposerFragment = this.A01;
        Context A1D = imageComposerFragment.A1D();
        if (A1D != null && imageComposerFragment.A00 != null && imageComposerFragment.A06.getTag() == (uri = imageComposerFragment.A00)) {
            if (this.A00 == null) {
                if (uri != null) {
                    str = C132366Tg.A01(uri, this.A02).A0B();
                } else {
                    str = null;
                }
                String BBN = this.A02.BBN(imageComposerFragment.A00);
                if (str == null) {
                    C146806wC r0 = imageComposerFragment.A0E;
                    if (r0 != null && !C36401kF.A1a(r0.A0T.A04)) {
                        RectF A0L = C90514aH.A0L((float) bitmap.getWidth(), bitmap.getHeight());
                        C146806wC r2 = imageComposerFragment.A0E;
                        r2.A0O.A07 = A0L;
                        r2.A0N.A00 = 0.0f;
                        r2.A0B(A0L);
                    }
                } else {
                    AnonymousClass1H2 r8 = imageComposerFragment.A08;
                    AnonymousClass6VQ A022 = AnonymousClass6VQ.A05.A02(A1D, imageComposerFragment.A07, r8, imageComposerFragment.A0K, str);
                    if (!(A022 == null || (r1 = imageComposerFragment.A0E) == null)) {
                        r1.A0N.setDoodle(A022);
                        r1.A0T.A05(BBN);
                    }
                }
            }
            if (!z) {
                imageComposerFragment.A06.A08(imageComposerFragment.A05.A03);
                AnonymousClass01I A0h = imageComposerFragment.A0h();
                if (A0h != null) {
                    A0h.A1q();
                }
            } else {
                AnonymousClass6WR r4 = imageComposerFragment.A05;
                if (bitmap != null) {
                    r4.A04 = bitmap;
                    r4.A09 = false;
                }
                r4.A06((Runnable) null, new C1503074t((Object) r4, 46), r4.A01);
            }
            AnonymousClass6WR r02 = imageComposerFragment.A05;
            AnonymousClass6WR.A01(r02);
            C96014me r03 = r02.A08;
            if (r03 != null) {
                r03.A06();
            }
            if (imageComposerFragment.A0V) {
                imageComposerFragment.A1f();
            }
        }
    }
}
