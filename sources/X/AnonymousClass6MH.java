package X;

import android.content.ContentValues;
import com.whatsapp.jid.Jid;
import java.util.Date;

/* renamed from: X.6MH  reason: invalid class name */
public final class AnonymousClass6MH {
    public final C29311Wd A00;

    public AnonymousClass6MH(C29311Wd r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            X.1Wd r0 = r6.A00
            X.54c r0 = r0.A00()
            X.1M0 r5 = r0.A04()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x001d }
            java.lang.String r3 = "cart_applied_promotion"
            java.lang.String r2 = "business_id=?"
            java.lang.String[] r1 = X.C90504aG.A1b(r7)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "cart_applied_promotion.DELETE_APPLIED_PROMOTION"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x001d }
            r5.close()
            return
        L_0x001d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MH.A01(com.whatsapp.jid.Jid):void");
    }

    public static final ContentValues A00(C128826Dt r4, Jid jid) {
        Long l;
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("business_id", jid.getRawString());
        A0E.put("promotion_id", r4.A06);
        A0E.put("promotion_name", r4.A05);
        A0E.put("promotion_discount", r4.A03);
        int i = r4.A00;
        int i2 = 2;
        if (i == 1 || i != 2) {
            i2 = 1;
        }
        A0E.put("promotion_discount_type", Integer.valueOf(i2));
        A0E.put("promotion_minimum_cart_price", Long.valueOf(r4.A01));
        Date date = r4.A08;
        Long l2 = null;
        if (date != null) {
            l = Long.valueOf(date.getTime());
        } else {
            l = null;
        }
        A0E.put("promotion_start_date", l);
        Date date2 = r4.A07;
        if (date2 != null) {
            l2 = Long.valueOf(date2.getTime());
        }
        A0E.put("promotion_end_date", l2);
        A0E.put("promotion_description", r4.A02);
        A0E.put("promotion_more_info", r4.A04);
        return A0E;
    }
}
