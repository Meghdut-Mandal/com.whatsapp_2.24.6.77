package X;

import android.app.Activity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.support.faq.SearchFAQ;
import java.util.Map;

/* renamed from: X.3sr  reason: invalid class name and case insensitive filesystem */
public class C78903sr implements AnonymousClass4UH {
    public /* synthetic */ void BOc(String str) {
    }

    public /* synthetic */ void BOw(String str) {
    }

    public void BOg(AnonymousClass37W r6) {
        int i;
        int i2;
        Object valueOf;
        Activity A00 = C18860tw.A00(r6.A00);
        if (A00 != null) {
            if (A00 instanceof SearchFAQ) {
                SearchFAQ searchFAQ = (SearchFAQ) A00;
                i = searchFAQ.A00;
                i2 = searchFAQ.A0B.size();
                if (i == -1) {
                    return;
                }
            } else if (A00 instanceof DescribeProblemActivity) {
                i = 0;
                i2 = -1;
            } else {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            Map map = r6.A01;
            map.put("FAQ Results Returned", valueOf2);
            if (i == 0) {
                valueOf = "n/a";
            } else {
                valueOf = Integer.valueOf(i2);
            }
            map.put("FAQ Results Read", valueOf);
        }
    }
}
