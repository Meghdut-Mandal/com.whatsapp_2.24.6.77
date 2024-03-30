package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1IB  reason: invalid class name */
public abstract class AnonymousClass1IB {
    public SharedPreferences A00;
    public final C19700wN A01;
    public final AnonymousClass1I9 A02;
    public final C19890wg A03;
    public final String A04;

    private synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A00(this.A04);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A02(UserJid userJid) {
        if (!(this instanceof AnonymousClass1IC)) {
            AnonymousClass00C.A0D(userJid, 0);
        }
        return userJid.getRawString();
    }

    public String A03(Object obj) {
        UserJid userJid;
        C175468aX r2;
        if (this instanceof AnonymousClass1IC) {
            r2 = (C175468aX) obj;
        } else if (this instanceof AnonymousClass1IL) {
            r2 = (C175468aX) obj;
            AnonymousClass00C.A0D(r2, 0);
        } else {
            C175448aV r22 = (C175448aV) obj;
            AnonymousClass00C.A0D(r22, 0);
            userJid = r22.A01.A00;
            return userJid.getRawString();
        }
        userJid = r2.A00;
        return userJid.getRawString();
    }

    public ArrayList A04() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = A00().getAll();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object obj = all.get(str);
            if (obj != null) {
                try {
                    arrayList.add(this.A02.B7h(obj.toString()));
                } catch (AnonymousClass1ID e) {
                    A06(e, "getAllObjects");
                    A00().edit().remove(str).apply();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("JidKeyedSharedPreferencesStore/getAllEntryPoints/ null pref value for key=");
                sb.append(next);
                Log.e(sb.toString());
            }
        }
        return arrayList;
    }

    public void A06(AnonymousClass1ID r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(r5.getMessage());
        String obj = sb.toString();
        this.A01.A0E("JidKeyedSharedPreferencesStoreTransformationException", obj, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JidKeyedSharedPreferencesStore/");
        sb2.append(obj);
        Log.e(sb2.toString(), r5);
    }

    public AnonymousClass1IB(C19700wN r1, AnonymousClass1I9 r2, C19890wg r3, String str) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = str;
        this.A02 = r2;
    }

    public Object A01(UserJid userJid) {
        String string = A00().getString(A02(userJid), (String) null);
        if (string != null) {
            try {
                return this.A02.B7h(string);
            } catch (AnonymousClass1ID e) {
                A06(e, "getObject");
                A05(userJid);
            }
        }
        return null;
    }

    public void A05(UserJid userJid) {
        A00().edit().remove(A02(userJid)).apply();
    }

    public void A07(Object obj) {
        try {
            A00().edit().putString(A03(obj), this.A02.Bvg(obj)).apply();
        } catch (AnonymousClass1ID e) {
            A06(e, "saveObject");
        }
    }
}
