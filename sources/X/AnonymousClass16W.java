package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16W  reason: invalid class name */
public class AnonymousClass16W extends AnonymousClass16V {
    public static AnonymousClass16U A04;
    public static AnonymousClass16U A05;
    public static AnonymousClass16U A06;
    public static final BigDecimal A07;
    public static final Parcelable.Creator CREATOR = new C36111jm(1);
    public AnonymousClass16X A00;
    public final AnonymousClass16X A01;
    public final String A02;
    public final String A03;

    static {
        BigDecimal bigDecimal = new BigDecimal(1);
        A07 = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        A06 = new AnonymousClass16W("XXX", "XXX", "#", "#", bigDecimal2, bigDecimal2, -1, 10, 1, 0);
        A05 = new AnonymousClass16W("INR", "₹", "R", "r", BigDecimal.valueOf(5000), bigDecimal, 0, 100, 2, 0);
        A04 = new AnonymousClass16W("BRL", "R$", "B", "b", BigDecimal.valueOf(1000), bigDecimal, 0, 100, 2, 0);
    }

    public SpannableStringBuilder BAV(Context context, int i) {
        String str;
        if (i == 1) {
            str = this.A03;
        } else {
            str = this.A02;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface A032 = C015006m.A03(context, R.font.payment_icons_regular);
        if (A032 != null) {
            spannableStringBuilder.setSpan(new C91984cw(A032), 0, this.A02.length(), 0);
        }
        return spannableStringBuilder;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass16W)) {
            return false;
        }
        AnonymousClass16W r4 = (AnonymousClass16W) obj;
        return super.equals(r4) && this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public String B7c(C18820ts r7, AnonymousClass16X r8) {
        String str = this.A02;
        BigDecimal bigDecimal = r8.A00;
        return AnonymousClass6US.A01(r7, str, this.A03, bigDecimal, bigDecimal.scale(), false);
    }

    public BigDecimal B7j(C18820ts r8, String str) {
        String str2 = this.A02;
        HashSet hashSet = AnonymousClass6US.A00;
        C132386Tk r5 = C132386Tk.A02;
        if (!TextUtils.isEmpty(str2)) {
            r5 = new C132386Tk(str2);
        }
        try {
            String str3 = r5.A00;
            int A002 = C132386Tk.A00(str3);
            C1261062o A003 = C131926Ri.A00(r8, false);
            C131486Pf r3 = new C131486Pf(A003.A00(), C18820ts.A01(r8.A00));
            if (A003.A02) {
                boolean z = C130766Mi.A03;
                new C130766Mi(r8.A0A(9));
                new C130766Mi(r8.A0A(11));
                r8.A0A(10);
                new C130766Mi(r8.A0A(6));
                new C130766Mi(r8.A0A(8));
                r8.A0A(7);
            } else {
                boolean z2 = C130766Mi.A03;
            }
            String A012 = r5.A01(r8);
            r3.A03(A002);
            return new BigDecimal(r3.A00(str.replace(A012, "").replace(str3, "").replace(C19430v1.A09, "").trim()).toString());
        } catch (Exception e) {
            Log.w("Currency parse threw: ", e);
            try {
                return new BigDecimal(str);
            } catch (Exception e2) {
                Log.w("Currency parse fallback threw: ", e2);
                return null;
            }
        }
    }

    public AnonymousClass16W(JSONObject jSONObject) {
        super(jSONObject);
        this.A02 = jSONObject.optString("currencyIconText");
        this.A03 = jSONObject.optString("requestCurrencyIconText");
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i = this.A01;
        this.A00 = AnonymousClass16X.A00(optJSONObject.optString("amount", ""), i);
        this.A01 = AnonymousClass16X.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i);
    }

    public JSONObject Bvn() {
        JSONObject Bvn = super.Bvn();
        try {
            Bvn.put("currencyIconText", this.A02);
            Bvn.put("requestCurrencyIconText", this.A03);
            Bvn.put("maxValue", this.A00.A01());
            Bvn.put("minValue", this.A01.A01());
            return Bvn;
        } catch (JSONException e) {
            Log.e("PAY: PaymentCurrency toJsonObject threw: ", e);
            return Bvn;
        }
    }

    public int hashCode() {
        return super.hashCode() + (this.A02.hashCode() * 31) + (this.A03.hashCode() * 31) + (this.A01.hashCode() * 31) + (this.A00.hashCode() * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass16W(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.math.BigDecimal r16, java.math.BigDecimal r17, int r18, int r19, int r20, int r21) {
        /*
            r11 = this;
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10)
            double r0 = (double) r8
            double r2 = java.lang.Math.log10(r0)
            int r1 = (int) r2
            X.16X r0 = new X.16X
            r2 = r16
            r0.<init>(r2, r1)
            r11.A00 = r0
            X.16X r0 = new X.16X
            r2 = r17
            r0.<init>(r2, r1)
            r11.A01 = r0
            r11.A02 = r14
            r11.A03 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16W.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, int, int, int, int):void");
    }

    public AnonymousClass16W(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        Class<AnonymousClass16X> cls = AnonymousClass16X.class;
        this.A00 = (AnonymousClass16X) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (AnonymousClass16X) parcel.readParcelable(cls.getClassLoader());
    }
}
