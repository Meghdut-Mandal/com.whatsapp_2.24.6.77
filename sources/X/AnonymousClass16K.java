package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.16K  reason: invalid class name */
public class AnonymousClass16K {
    public final C20690y0 A00;
    public final C19730wQ A01;
    public final AnonymousClass16L A02;
    public final C19630wG A03;
    public final C19970wo A04;

    public File A00(AnonymousClass141 r6) {
        StringBuilder sb;
        if ((r6 instanceof C44112Le) || C28981Uw.A00(r6.A0H)) {
            return A02(r6);
        }
        AnonymousClass11F r4 = (AnonymousClass11F) r6.A06(AnonymousClass11F.class);
        if (r4 == null) {
            return null;
        }
        boolean A0M = this.A01.A0M(r4);
        Context context = this.A03.A00;
        if (A0M) {
            return new File(context.getFilesDir(), "me.jpg");
        }
        File file = new File(context.getCacheDir(), "Profile Pictures");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = r4.user;
        if (str == null) {
            sb = new StringBuilder();
            str = r4.getRawString();
        }
        sb.append(str);
        sb.append(".jpg");
        return new File(file, sb.toString());
    }

    public File A01(AnonymousClass141 r5) {
        String rawString;
        if ((r5 instanceof C44112Le) || C28981Uw.A00(r5.A0H)) {
            return A02(r5);
        }
        AnonymousClass11F r3 = (AnonymousClass11F) r5.A06(AnonymousClass11F.class);
        if (r3 == null) {
            return null;
        }
        File file = new File(this.A03.A00.getFilesDir(), "Avatars");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.A01.A0M(r3)) {
            rawString = "me";
        } else {
            rawString = r3.getRawString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append(".j");
        return new File(file, sb.toString());
    }

    public File A02(AnonymousClass141 r5) {
        String rawString;
        C20690y0 r2;
        StringBuilder sb;
        if (r5 instanceof C44112Le) {
            r2 = this.A00;
            sb = new StringBuilder();
            sb.append("tmpp");
            rawString = ((C44112Le) r5).A00;
        } else {
            if (r5 != null) {
                AnonymousClass11F r1 = r5.A0H;
                if (C28981Uw.A00(r1)) {
                    C18740tg.A06(r1);
                    rawString = r1.getRawString();
                    r2 = this.A00;
                    sb = new StringBuilder();
                    sb.append("tmpp");
                }
            }
            return this.A00.A0Y("tmpp");
        }
        sb.append(rawString);
        return r2.A0Y(sb.toString());
    }

    public void A05(AnonymousClass141 r2, byte[] bArr, boolean z) {
        File A012;
        if (z) {
            A012 = A00(r2);
        } else {
            A012 = A01(r2);
        }
        if (bArr == null) {
            return;
        }
        if (A012 != null) {
            AnonymousClass6YY.A0I(A012, bArr);
        } else {
            Log.e("ContactPhotoUpdater/updatePhotoFiles/no thumb photo file when expected");
        }
    }

    public boolean A06(AnonymousClass141 r4) {
        Resources resources = this.A03.A00.getResources();
        if (this.A02.A01().A09(r4.A08(resources.getDimension(R.dimen.f7nameremoved), resources.getDimensionPixelSize(R.dimen.f7nameremoved))) != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass16K(C20690y0 r1, C19730wQ r2, AnonymousClass16L r3, C19970wo r4, C19630wG r5) {
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(AnonymousClass141 r3) {
        File A002 = A00(r3);
        if (A002 != null && A002.exists()) {
            A002.delete();
        }
        File A012 = A01(r3);
        if (A012 != null && A012.exists()) {
            A012.delete();
        }
    }

    public void A04(AnonymousClass141 r6) {
        String A07 = r6.A07();
        if (A07 != null) {
            AnonymousClass1SZ A012 = this.A02.A01();
            for (String str : A012.A02.A06().keySet()) {
                if (str.startsWith(A07)) {
                    A012.A0C(str);
                }
            }
        }
        r6.A0f = true;
        if (r6.A0H instanceof C28981Uw) {
            r6.A0C = System.currentTimeMillis();
        }
    }

    public boolean A07(AnonymousClass141 r3) {
        File A012 = A01(r3);
        if (((A012 == null || !A012.exists()) && (A012 = A00(r3)) == null) || !A012.exists()) {
            return false;
        }
        return true;
    }
}
