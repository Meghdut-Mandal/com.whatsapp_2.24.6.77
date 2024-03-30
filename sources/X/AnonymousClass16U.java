package X;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.16U  reason: invalid class name */
public interface AnonymousClass16U extends Parcelable {
    String B7c(C18820ts r1, AnonymousClass16X r2);

    String B7d(C18820ts r1, AnonymousClass16X r2);

    String B7e(C18820ts r1, BigDecimal bigDecimal);

    BigDecimal B7j(C18820ts r1, String str);

    SpannableStringBuilder BAV(Context context, int i);

    JSONObject Bvn();

    void writeToParcel(Parcel parcel, int i);
}
