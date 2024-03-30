package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6of  reason: invalid class name and case insensitive filesystem */
public class C142306of implements AnonymousClass7fJ {
    public static String A00(Object obj, boolean z, boolean z2) {
        if ((obj instanceof List) || (obj instanceof Map)) {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                A03(jsonWriter, obj, z, z2);
                jsonWriter.close();
                return stringWriter.toString();
            } catch (IOException e) {
                return AnonymousClass000.A0l(e, "Exception in serialization ", AnonymousClass000.A0u());
            }
        } else if (obj == null) {
            return "";
        } else {
            return String.valueOf(obj);
        }
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            boolean A1X = AnonymousClass000.A1X(obj);
            if (z2) {
                jsonWriter.value(C90474aD.A09(A1X ? 1 : 0));
            } else {
                jsonWriter.value(A1X);
            }
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A0y = AnonymousClass000.A0y((Map) obj);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        treeMap.put(String.valueOf(A11.getKey()), A11.getValue());
                    }
                    Iterator A10 = C36371kC.A10(treeMap);
                    while (A10.hasNext()) {
                        Map.Entry A112 = AnonymousClass000.A11(A10);
                        jsonWriter.name(C90494aF.A0f(A112));
                        A03(jsonWriter, A112.getValue(), z, z2);
                    }
                } else {
                    Iterator A0y2 = AnonymousClass000.A0y((Map) obj);
                    while (A0y2.hasNext()) {
                        Map.Entry A113 = AnonymousClass000.A11(A0y2);
                        jsonWriter.name(String.valueOf(A113.getKey()));
                        A03(jsonWriter, A113.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator A13 = C90514aH.A13(obj);
                while (A13.hasNext()) {
                    A03(jsonWriter, A13.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    public Object B6u(AnonymousClass6MO r7, C115215iW r8, C124125xd r9) {
        String str = r8.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -863899808:
                s = C90504aG.A0y("bk.action.string.JsonDecode", str);
                break;
            case -826958968:
                s = C90514aH.A1B("bk.action.string.JsonEncode", str);
                break;
            case -138615772:
                s = C90514aH.A1C("bk.action.string.JsonEncodeV2", str);
                break;
            case -138615771:
                if (str.equals("bk.action.string.JsonEncodeV3")) {
                    s = 3;
                    break;
                }
                break;
            case 1509306073:
                if (str.equals("bk.action.string.JsonDecodeArray")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
                try {
                    Object A00 = AnonymousClass6MO.A00(r7, 0);
                    Objects.requireNonNull(A00);
                    return A02(C36441kJ.A1C((String) A00));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e);
                }
            case 1:
                return A00(AnonymousClass6MO.A00(r7, 0), false, true);
            case 2:
                List list = r7.A00;
                return A00(list.get(0), C129316Gk.A01(list.get(1)), true);
            case 3:
                List list2 = r7.A00;
                return A00(list2.get(0), C129316Gk.A01(list2.get(1)), false);
            case 4:
                try {
                    Object A002 = AnonymousClass6MO.A00(r7, 0);
                    Objects.requireNonNull(A002);
                    return A01(new JSONArray((String) A002));
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e2);
                }
            default:
                throw new AnonymousClass78V(AnonymousClass000.A0p("Unknown lispy action type: ", str, AnonymousClass000.A0u()));
        }
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A14 = C36441kJ.A14(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C129316Gk.A00(C90504aG.A01(obj));
                    } else if (obj instanceof Float) {
                        obj = C129316Gk.A00((double) C36441kJ.A03(obj));
                    } else {
                        if (obj instanceof Boolean) {
                            A14.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                    }
                }
            }
            A14.add(obj);
        }
        return A14;
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0C = AnonymousClass001.A0C(keys);
            Object obj = jSONObject.get(A0C);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C129316Gk.A00(C90504aG.A01(obj));
                    } else if (obj instanceof Float) {
                        obj = C129316Gk.A00((double) C36441kJ.A03(obj));
                    } else if (obj instanceof Boolean) {
                        A0J.put(A0C, obj);
                    } else if (!(obj instanceof Long)) {
                    }
                }
            }
            A0J.put(A0C, obj);
        }
        return A0J;
    }
}
