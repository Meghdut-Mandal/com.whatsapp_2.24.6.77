package X;

import android.content.Context;
import android.text.format.Formatter;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.12T  reason: invalid class name */
public class AnonymousClass12T extends C19580wB {
    public void A00(int i) {
        for (C600736j r7 : getObservers()) {
            if (i == 0) {
                Context context = r7.A00;
                String formatFileSize = Formatter.formatFileSize(context, r7.A01.A02());
                r7.A02.A00(context.getString(R.string.f12nameremoved, new Object[]{formatFileSize}));
            } else if (i == 1) {
                long A02 = r7.A01.A02();
                if (A02 < 10485760) {
                    Context context2 = r7.A00;
                    String formatFileSize2 = Formatter.formatFileSize(context2, A02);
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorreporter/diskio/diskspace ");
                    sb.append(formatFileSize2);
                    Log.i(sb.toString());
                    if (formatFileSize2 != null) {
                        AnonymousClass1QA r3 = r7.A02;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(context2.getString(R.string.f12nameremoved));
                        sb2.append(" ");
                        sb2.append(context2.getString(R.string.f12nameremoved, new Object[]{formatFileSize2}));
                        r3.A00(sb2.toString());
                    }
                }
                r7.A02.A00(r7.A00.getString(R.string.f12nameremoved));
            } else if (i == 2) {
                r7.A02.A00(r7.A00.getString(R.string.f12nameremoved));
            } else if (i != 3) {
                r7.A02.A00(r7.A00.getString(R.string.f12nameremoved));
            } else {
                r7.A02.A00(r7.A00.getString(R.string.f12nameremoved));
            }
        }
    }

    public AnonymousClass12T(AnonymousClass005 r1) {
        super(r1);
    }
}
