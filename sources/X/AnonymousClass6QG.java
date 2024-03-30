package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6QG  reason: invalid class name */
public class AnonymousClass6QG {
    public int A00 = -1;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Double A09;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass6QG r5 = (AnonymousClass6QG) obj;
        Double d = this.A03;
        Double d2 = r5.A03;
        if (d != null ? d.equals(d2) : d2 == null) {
            Double d3 = this.A04;
            Double d4 = r5.A04;
            if (d3 != null ? d3.equals(d4) : d4 == null) {
                Double d5 = this.A01;
                Double d6 = r5.A01;
                if (d5 != null ? d5.equals(d6) : d6 == null) {
                    Double d7 = this.A02;
                    Double d8 = r5.A02;
                    if (d7 != null ? d7.equals(d8) : d8 == null) {
                        if (this.A08.equals(r5.A08)) {
                            Double d9 = this.A09;
                            Double d10 = r5.A09;
                            if (d9 != null ? d9.equals(d10) : d10 == null) {
                                String str = this.A06;
                                String str2 = r5.A06;
                                if (str == null) {
                                    return str2 == null;
                                }
                                if (str.equals(str2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static LatLng A00(AnonymousClass6QG r5) {
        Double d = r5.A03;
        C18740tg.A06(d);
        double doubleValue = d.doubleValue();
        Double d2 = r5.A04;
        C18740tg.A06(d2);
        return new LatLng(doubleValue, d2.doubleValue());
    }

    public int A02() {
        String str;
        String str2 = this.A08;
        switch (str2.hashCode()) {
            case -1335157162:
                str = "device";
                break;
            case -1207360282:
                if (str2.equals("pin_on_map")) {
                    return 3;
                }
                break;
            case -1081415738:
                if (str2.equals("manual")) {
                    return 1;
                }
                break;
            case 1738549583:
                str = "nearest_neighborhood";
                break;
        }
        if (str2.equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean A04() {
        String str = this.A08;
        if (str.equals("country_default") || str.equals("approx_default")) {
            return true;
        }
        return false;
    }

    public boolean A05() {
        String str = this.A08;
        if ("city_default".equals(str) || "country_default".equals(str) || "manual".equals(str) || "nearest_neighborhood".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        String str = this.A08;
        if ("pin_on_map".equals(str)) {
            return true;
        }
        if (!"device".equals(str)) {
            return false;
        }
        Double d = this.A05;
        C18740tg.A06(d);
        if (d.doubleValue() - 800.0d <= 200.0d) {
            return true;
        }
        Double d2 = this.A09;
        if (d2 == null || d2.doubleValue() > 200.0d) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        String str = this.A08;
        if ("device".equals(str) || "pin_on_map".equals(str) || "map_view".equals(str)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Double d = this.A03;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode() * 43;
        }
        Double d2 = this.A04;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode() * 43;
        }
        int i2 = hashCode + hashCode2;
        Double d3 = this.A01;
        if (d3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d3.hashCode() * 43;
        }
        int i3 = i2 + hashCode3;
        Double d4 = this.A02;
        if (d4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d4.hashCode() * 43;
        }
        int hashCode6 = i3 + hashCode4 + (this.A08.hashCode() * 43);
        Double d5 = this.A09;
        if (d5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = d5.hashCode() * 43;
        }
        int i4 = hashCode6 + hashCode5;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode() * 43;
        }
        return i4 + i;
    }

    public AnonymousClass6QG(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, String str, String str2, String str3) {
        this.A05 = d;
        this.A03 = d2;
        this.A04 = d3;
        this.A01 = d4;
        this.A02 = d5;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A09 = d6;
    }

    public static AnonymousClass6QG A01(String str) {
        Double d;
        Double d2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            Double A0b = C90504aG.A0b("radius", A1C);
            Double A0b2 = C90504aG.A0b("latitude", A1C);
            Double A0b3 = C90504aG.A0b("longitude", A1C);
            int optInt = A1C.optInt("imprecise_tile_level", -1);
            double optDouble = A1C.optDouble("imprecise_latitude", -1.0d);
            double optDouble2 = A1C.optDouble("imprecise_longitude", -1.0d);
            String optString = A1C.optString("location_description");
            String string = A1C.getString("provider");
            Double A0b4 = C90504aG.A0b("accuracy", A1C);
            String optString2 = A1C.optString("country_code");
            if (optDouble == -1.0d) {
                d = null;
            } else {
                d = Double.valueOf(optDouble);
            }
            if (optDouble2 == -1.0d) {
                d2 = null;
            } else {
                d2 = Double.valueOf(optDouble2);
            }
            AnonymousClass6QG r10 = new AnonymousClass6QG(A0b, A0b2, A0b3, d, d2, A0b4, optString, optString2, string);
            r10.A00 = optInt;
            return r10;
        } catch (JSONException e) {
            Log.i("SearchLocation/fromJsonString Invalid search location string", e);
            return null;
        }
    }

    public String A03() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("radius", this.A05);
        A1B.put("latitude", this.A03);
        A1B.put("longitude", this.A04);
        A1B.put("imprecise_tile_level", this.A00);
        A1B.put("imprecise_latitude", this.A01);
        A1B.put("imprecise_longitude", this.A02);
        A1B.put("location_description", this.A07);
        A1B.put("provider", this.A08);
        A1B.put("accuracy", this.A09);
        return C90484aE.A0l(this.A06, "country_code", A1B);
    }
}
