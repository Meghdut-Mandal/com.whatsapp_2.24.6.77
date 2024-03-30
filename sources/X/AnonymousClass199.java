package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.199  reason: invalid class name */
public class AnonymousClass199 extends C229416o {
    public synchronized HashSet A09(String str) {
        HashSet hashSet;
        String A07 = A07(str);
        hashSet = new HashSet();
        if (A07 != null) {
            try {
                JSONArray jSONArray = new JSONArray(A07);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                throw new IllegalStateException("key-value-store/getStringSetProp:", e);
            }
        }
        return hashSet;
    }

    public synchronized void A0A(String str, Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        A04(this, str, jSONArray.toString());
    }

    public static void A04(AnonymousClass199 r4, String str, String str2) {
        AnonymousClass1M0 A04;
        try {
            A04 = r4.A00.A04();
            if (TextUtils.isEmpty(str2)) {
                C229416o.A02(A04, "wa_props", "prop_name=?", new String[]{str});
            } else {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("prop_name", str);
                contentValues.put("prop_value", str2);
                C229416o.A05(contentValues, A04, "wa_props");
            }
            A04.close();
            return;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/unable to set prop:");
            sb.append(str);
            C18740tg.A08(sb.toString(), e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public String A07(String str) {
        Cursor A03;
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A03 = C229416o.A03(A032, "SELECT prop_value FROM wa_props WHERE prop_name = ?", "CONTACT_PROPS", new String[]{str});
            if (A03.moveToFirst()) {
                String string = A03.getString(A03.getColumnIndexOrThrow("prop_value"));
                A03.close();
                A032.close();
                return string;
            }
            A03.close();
            A032.close();
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Integer A05(String str) {
        String A07 = A07(str);
        if (A07 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A07));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/getIntProp/Invalid int value: ");
            sb.append(A07);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public Long A06(String str) {
        String A07 = A07(str);
        if (A07 == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A07));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/getLongProp/Invalid long value: ");
            sb.append(A07);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public ArrayList A08(String str) {
        String A07 = A07(str);
        if (A07 == null) {
            return null;
        }
        String[] split = A07.split(",");
        ArrayList arrayList = new ArrayList();
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str2 = split[i];
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                i++;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("key-value-store/getLongListProp/Invalid long value: ");
                sb.append(str2);
                Log.e(sb.toString(), e);
                return null;
            }
        }
        return arrayList;
    }

    public AnonymousClass199(C229716r r1) {
        super(r1);
    }
}
