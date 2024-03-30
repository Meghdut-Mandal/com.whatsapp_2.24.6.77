package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4bD  reason: invalid class name and case insensitive filesystem */
public class C90954bD extends BroadcastReceiver {
    public final Context A00;
    public final C227815t A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final AnonymousClass1BN A04;
    public final C21060yb A05;

    public static void A02(C90954bD r2) {
        boolean isPowerSaveMode;
        C21060yb r1 = r2.A05;
        C21060yb.A0P = true;
        PowerManager A0G = r1.A0G();
        C21060yb.A0P = false;
        if (A0G == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0G.isPowerSaveMode();
        }
        r2.A04.A01 = Boolean.valueOf(isPowerSaveMode);
    }

    public C90954bD(Context context, C227815t r2, AnonymousClass1BN r3, C21060yb r4, C20810yC r5, C21010yW r6) {
        this.A00 = context;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r4;
        this.A01 = r2;
        this.A04 = r3;
    }

    public static Object A00(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof CharSequence) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character)) {
            return obj;
        }
        if (cls.isArray()) {
            JSONArray A0u = C90524aI.A0u();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                A0u.put(A00(Array.get(obj, i)));
            }
            return A0u;
        } else if (obj instanceof List) {
            JSONArray A0u2 = C90524aI.A0u();
            for (Object A002 : (List) obj) {
                A0u2.put(A00(A002));
            }
            return A0u2;
        } else if (obj instanceof Bundle) {
            return A01((Bundle) obj);
        } else {
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                JSONObject A1B = C36441kJ.A1B();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    A1B.put(Integer.toString(sparseArray.keyAt(i2)), A00(sparseArray.valueAt(i2)));
                }
                return A1B;
            }
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("class", cls.getCanonicalName());
            A1B2.put("string", obj.toString());
            return A1B2;
        }
    }

    public static JSONObject A01(Bundle bundle) {
        JSONObject A1B = C36441kJ.A1B();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            Object obj = bundle.get(A0C);
            if (A0C == null) {
                A0C = "null";
            }
            A1B.put(A0C, A00(obj));
        }
        return A1B;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    AnonymousClass15u r2 = new AnonymousClass15u(intent);
                    C227815t r1 = this.A01;
                    if (!r1.A00.equals(r2)) {
                        r1.A00 = r2;
                        Iterator A0s = C36361kB.A0s(r1);
                        while (A0s.hasNext()) {
                            ((C33091eh) A0s.next()).BS5(r2);
                        }
                        C36321k7.A1K(r2, "battery changed; newEvent=", AnonymousClass000.A0u());
                        return;
                    }
                    return;
                }
                break;
            case -1209048666:
                if (action.equals("com.samsung.android.action.WARNING_NOTIFICATION")) {
                    String str = intent.getPackage();
                    if (str == null || str.equals(context.getPackageName())) {
                        C1039257p r22 = new C1039257p();
                        if (intent.getDataString() != null) {
                            r22.A00 = intent.getDataString();
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            extras.keySet();
                            try {
                                r22.A01 = extras.toString();
                                r22.A02 = A01(extras).toString();
                            } catch (BadParcelableException | JSONException e) {
                                Log.e("battery-receiver/samsung-warning/unable-to-serialize-extras", e);
                            }
                        }
                        this.A03.Bly(r22);
                        return;
                    }
                    return;
                }
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    A02(this);
                    return;
                }
                break;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unexpected action: ");
        throw AnonymousClass000.A0c(intent.getAction(), A0u);
    }
}
