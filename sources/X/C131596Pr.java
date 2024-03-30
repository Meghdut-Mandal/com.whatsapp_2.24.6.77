package X;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6Pr  reason: invalid class name and case insensitive filesystem */
public class C131596Pr {
    public final View A00;
    public final Object A01;

    public static C131596Pr A00(View view, ContentCaptureSession contentCaptureSession) {
        return new C131596Pr(view, contentCaptureSession);
    }

    public AutofillId A01(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AnonymousClass6ME A002 = AnonymousClass5XK.A00(this.A00);
        Objects.requireNonNull(A002);
        return C132996Wd.A02(A002.A01(), (ContentCaptureSession) this.A01, j);
    }

    public AnonymousClass6Q1 A02(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass6Q1.A00(C132996Wd.A01(autofillId, (ContentCaptureSession) this.A01, j));
        }
        return null;
    }

    public void A03(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C132996Wd.A04(autofillId, (ContentCaptureSession) this.A01, charSequence);
        }
    }

    public void A04(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AnonymousClass5XG.A00((ContentCaptureSession) this.A01, list);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A002 = C132996Wd.A00(view, contentCaptureSession);
            AnonymousClass5XF.A00(A002).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C132996Wd.A03(A002, contentCaptureSession);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C132996Wd.A03((ViewStructure) list.get(i2), contentCaptureSession);
            }
            ViewStructure A003 = C132996Wd.A00(view, contentCaptureSession);
            AnonymousClass5XF.A00(A003).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C132996Wd.A03(A003, contentCaptureSession);
        }
    }

    public void A05(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AnonymousClass6ME A002 = AnonymousClass5XK.A00(this.A00);
            Objects.requireNonNull(A002);
            C132996Wd.A05(A002.A01(), (ContentCaptureSession) this.A01, jArr);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A003 = C132996Wd.A00(view, contentCaptureSession);
            AnonymousClass5XF.A00(A003).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C132996Wd.A03(A003, contentCaptureSession);
            AnonymousClass6ME A004 = AnonymousClass5XK.A00(view);
            Objects.requireNonNull(A004);
            C132996Wd.A05(A004.A01(), contentCaptureSession, jArr);
            ViewStructure A005 = C132996Wd.A00(view, contentCaptureSession);
            AnonymousClass5XF.A00(A005).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C132996Wd.A03(A005, contentCaptureSession);
        }
    }

    public C131596Pr(View view, ContentCaptureSession contentCaptureSession) {
        this.A01 = contentCaptureSession;
        this.A00 = view;
    }
}
