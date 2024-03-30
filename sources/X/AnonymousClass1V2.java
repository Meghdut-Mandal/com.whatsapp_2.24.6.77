package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1V2  reason: invalid class name */
public abstract class AnonymousClass1V2 {
    public static AnonymousClass37U A03(AnonymousClass1A1 r6, AnonymousClass1SV r7, Integer num, Long l, List list) {
        if (!(num == null || l == null)) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A01 = r6.A01.A01(((Number) it.next()).longValue());
                    if (A01 instanceof AnonymousClass2bU) {
                        AnonymousClass2bU r1 = (AnonymousClass2bU) A01;
                        if (r1.A1g()) {
                            arrayList.add(C63923Ly.A00(r1, r7));
                        }
                    }
                }
            }
            return new AnonymousClass37U(arrayList, num.intValue(), l.longValue());
        }
        return null;
    }

    public static void A05(Activity activity, C225014r r7, C21010yW r8, int i) {
        r7.BO8(new C68673cH(activity, C55582ur.A00(r8, i), i), (Object[]) null, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    }

    public static long A01(C20060wx r2, C20810yC r3) {
        if (r3 == null) {
            return 10000000;
        }
        int A00 = C20800yB.A00(C21000yV.A02, r3, 224);
        if (A00 == -1) {
            return Math.min((r2.A04() * 1) / 100, 50000000);
        }
        return ((long) A00) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static Cursor A02(AnonymousClass1DF r7, AnonymousClass11F r8, int i, int i2) {
        AnonymousClass1M0 r4;
        Cursor cursor;
        String str;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDDescCursor:");
                    String str2 = C56862x0.A04;
                    String[] strArr = {String.valueOf(5)};
                    r4 = r7.A08.get();
                    cursor = r4.A02.A09(str2, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_DESC", strArr);
                } else if (i2 == 1) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDAscCursor:");
                    String str3 = C56862x0.A03;
                    String[] strArr2 = {String.valueOf(5)};
                    r4 = r7.A08.get();
                    cursor = r4.A02.A09(str3, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_ASC", strArr2);
                } else if (i2 == 2) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedBySizeCursor:");
                    r4 = r7.A08.get();
                    if (C20800yB.A01(C21000yV.A02, r7.A0A, 6261)) {
                        str = C56862x0.A02;
                    } else {
                        str = C56862x0.A01;
                    }
                    cursor = r4.A02.A09(str, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SIZE", new String[]{String.valueOf(5)});
                } else if (i2 == 3) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByForwardingScoreCursor_INTERNAL_ONLY:");
                    String str4 = C56862x0.A00;
                    String[] strArr3 = {String.valueOf(3)};
                    r4 = r7.A08.get();
                    try {
                        cursor = r4.A02.A09(str4, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_FORWARDING_SCORE", strArr3);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown sort type: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                r4.close();
                return cursor;
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown gallery type: ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 == 0) {
                return r7.A08((AnonymousClass11F) null, 5000000);
            } else {
                if (i2 == 1) {
                    return r7.A07((AnonymousClass11F) null, 5000000);
                }
                if (i2 == 2) {
                    return r7.A06((AnonymousClass11F) null, 5000000);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown sort type: ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else if (i2 == 0) {
            return r7.A08(r8, -1);
        } else {
            if (i2 == 1) {
                return r7.A07(r8, -1);
            }
            if (i2 == 2) {
                return r7.A06(r8, -1);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown sort type: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static long A00(C20690y0 r4, C65343Rr r5) {
        long A00 = AnonymousClass6YY.A00((C02680Bk) null, r4.A0H());
        AnonymousClass199.A04(r5.A00, "STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A00));
        C65343Rr.A00(r5, "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME");
        return A00;
    }

    public static String A04(Context context, C18820ts r10) {
        return context.getString(R.string.f12nameremoved, new Object[]{r10.A0K(new Object[]{String.format(context.getResources().getConfiguration().locale, "%d", new Object[]{5L})}, 283, 5)});
    }
}
