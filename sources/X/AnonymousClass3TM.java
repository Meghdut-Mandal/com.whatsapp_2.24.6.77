package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3TM  reason: invalid class name */
public abstract class AnonymousClass3TM {
    public static final C18950u5 A00 = new C18950u5(1, 1);
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[29];
        AnonymousClass000.A1J(numArr, 128525);
        numArr[1] = 128514;
        numArr[2] = 128558;
        numArr[3] = 128546;
        C36341k9.A1U(numArr, 128591);
        C36371kC.A1S(numArr, 128079);
        C36381kD.A1T(numArr, 127881);
        C36361kB.A1V(numArr, 128175);
        C36401kF.A1Q(128077, 128514, numArr);
        numArr[10] = 128558;
        numArr[11] = 128546;
        numArr[12] = 10084;
        numArr[13] = 128522;
        numArr[14] = 129392;
        numArr[15] = 129321;
        numArr[16] = 128154;
        numArr[17] = 129315;
        numArr[18] = 128518;
        numArr[19] = 128293;
        numArr[20] = 128588;
        numArr[21] = 129395;
        numArr[22] = 128557;
        numArr[23] = 128532;
        numArr[24] = 129402;
        numArr[25] = 128562;
        numArr[26] = 129327;
        numArr[27] = 128545;
        A01 = C36421kH.A0i(128548, numArr, 28);
    }

    public static final String A00(Context context, AnonymousClass3XT r5) {
        int i;
        int i2;
        String A0B;
        AnonymousClass00C.A0D(r5, 0);
        int i3 = r5.A00;
        if (i3 == 0) {
            A0B = context.getString(R.string.f12nameremoved);
        } else {
            Resources resources = context.getResources();
            if (i3 == 1) {
                i = r5.A01.size();
                i2 = R.plurals.f10nameremoved;
            } else if (i3 != 2) {
                return "";
            } else {
                i = r5.A02.size();
                i2 = R.plurals.f10nameremoved;
            }
            A0B = C36321k7.A0B(resources, i, 0, i2);
        }
        AnonymousClass00C.A08(A0B);
        return A0B;
    }

    public static final boolean A03(C61953Ed r2, boolean z) {
        if (r2 == null || !r2.A00()) {
            return false;
        }
        return r2.A01 > 0 || z;
    }

    public static final boolean A02(AnonymousClass17Y r5, C21060yb r6, String str) {
        C36321k7.A0x(r6, r5);
        ClipboardManager A09 = r6.A09();
        if (A09 == null) {
            r5.A06(R.string.f12nameremoved, 0);
            return false;
        } else if (str == null || str.length() == 0) {
            return true;
        } else {
            try {
                A09.setPrimaryClip(ClipData.newPlainText(str, str));
                r5.A06(R.string.f12nameremoved, 0);
                return true;
            } catch (NullPointerException | SecurityException e) {
                Log.e("invitelink/copy/npe", e);
                r5.A06(R.string.f12nameremoved, 0);
                return false;
            }
        }
    }

    public static final ArrayList A01(String str) {
        ArrayList A0l = C36341k9.A0l(str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (AnonymousClass000.A1Z(A01, jSONArray.getInt(i))) {
                    AnonymousClass000.A1F(A0l, jSONArray.getInt(i));
                }
            }
        } catch (JSONException e) {
            Log.e(AnonymousClass000.A0p("statusreply/statusreactions/invalid emoji list JSONArray:", str, AnonymousClass000.A0u()), e);
        }
        return A0l;
    }
}
