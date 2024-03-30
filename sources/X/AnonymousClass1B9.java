package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1B9  reason: invalid class name */
public class AnonymousClass1B9 {
    public final AnonymousClass005 A00;

    public synchronized int A00(String str) {
        AnonymousClass1M0 A04 = ((C1031554e) this.A00.get()).A04();
        try {
            C1495671s B1k = A04.B1k();
            C224114e r5 = A04.A02;
            Cursor A09 = r5.A09("SELECT pack_order FROM sticker_pack_order WHERE sticker_pack_id = ?", "getOrAddStickerPackOrder/QUERY_STICKER_PACK_ORDER", new String[]{str});
            try {
                if (A09.getCount() <= 0 || !A09.moveToFirst()) {
                    A09.close();
                    int i = 1000;
                    A09 = r5.A09("SELECT MAX(pack_order) as max_order FROM sticker_pack_order", "GET_MAX_ORDER_STICKER_PACK", (String[]) null);
                    if (A09.getCount() <= 0 || !A09.moveToFirst()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("StickerPackOderDBTableHelper/getOrAddStickerPackOrder/max order is not available for sticker pack: ");
                        sb.append(str);
                        Log.e(sb.toString());
                    } else {
                        i = A09.getInt(A09.getColumnIndexOrThrow("max_order"));
                    }
                    A09.close();
                    int i2 = i + 1;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sticker_pack_id", str);
                    contentValues.put("pack_order", Integer.valueOf(i2));
                    r5.A05("sticker_pack_order", "getOrAddStickerPackOrder/INSERT_STICKER_PACK_ORDER", contentValues);
                    B1k.A00();
                    B1k.close();
                    A04.close();
                    return i2;
                }
                int i3 = A09.getInt(A09.getColumnIndexOrThrow("pack_order"));
                A09.close();
                B1k.close();
                A04.close();
                return i3;
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        throw th;
    }

    public AnonymousClass1B9(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}
