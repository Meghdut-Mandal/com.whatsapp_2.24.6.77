package X;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.List;

/* renamed from: X.6QX  reason: invalid class name */
public abstract class AnonymousClass6QX {
    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != C133336Xx.A05) {
            spannable.setSpan(new ForegroundColorSpan(C90514aH.A0D(C133336Xx.A06(C114185go.A0G, j))), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, AnonymousClass75Q r3, int i, int i2) {
        int i3;
        List list;
        LocaleSpan localeSpan;
        if (r3 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = AnonymousClass6GF.A00(r3);
            } else {
                if (r3.isEmpty()) {
                    i3 = 0;
                    list = C129656Hy.A00.BAX().A01;
                } else {
                    i3 = 0;
                    list = r3.A01;
                }
                localeSpan = new LocaleSpan(AnonymousClass68T.A00(list.get(i3)));
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final void A02(Spannable spannable, C161937ni r6, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A01 = AnonymousClass6WI.A01(j);
        if (A01 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(C14960mT.A01(r6.Bvp(j)), false);
        } else if (A01 == 8589934592L) {
            relativeSizeSpan = new RelativeSizeSpan(C90464aC.A00(j));
        } else {
            return;
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
