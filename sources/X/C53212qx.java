package X;

import com.whatsapp.R;
import java.util.HashMap;

/* renamed from: X.2qx  reason: invalid class name and case insensitive filesystem */
public class C53212qx extends HashMap {
    public final int A00;

    public C53212qx(int i) {
        Integer valueOf;
        String str;
        this.A00 = i;
        switch (i) {
            case 0:
                Integer valueOf2 = Integer.valueOf(R.drawable.large_2764_fe0f);
                put("️", valueOf2);
                put("❤", valueOf2);
                put("💓", Integer.valueOf(R.drawable.large_1f493));
                put("💕", Integer.valueOf(R.drawable.large_1f495));
                put("💖", Integer.valueOf(R.drawable.large_1f496));
                put("💗", Integer.valueOf(R.drawable.large_1f497));
                put("💘", Integer.valueOf(R.drawable.large_1f498));
                put("💙", Integer.valueOf(R.drawable.large_1f499));
                put("💚", Integer.valueOf(R.drawable.large_1f49a));
                put("💛", Integer.valueOf(R.drawable.large_1f49b));
                put("💜", Integer.valueOf(R.drawable.large_1f49c));
                put("💝", Integer.valueOf(R.drawable.large_1f49d));
                put("💞", Integer.valueOf(R.drawable.large_1f49e));
                put("🖤", Integer.valueOf(R.drawable.large_1f5a4));
                put("🤍", Integer.valueOf(R.drawable.large_1f90d));
                put("🤎", Integer.valueOf(R.drawable.large_1f90e));
                put("🧡", Integer.valueOf(R.drawable.large_1f9e1));
                put("🩵", Integer.valueOf(R.drawable.large_1fa75));
                put("🩶", Integer.valueOf(R.drawable.large_1fa76));
                put("🩷", Integer.valueOf(R.drawable.large_1fa77));
                valueOf = Integer.valueOf(R.drawable.large_2764_fe0f_200d_1f525);
                str = "❤‍🔥";
                break;
            case 1:
                put(C36331k8.A0K(C36361kB.A0i(), C68463bw.A00, this), C68443bu.A00);
                return;
            default:
                put("drugs", Integer.valueOf(R.string.f12nameremoved));
                put("tobacco", Integer.valueOf(R.string.f12nameremoved));
                put("alcohol", Integer.valueOf(R.string.f12nameremoved));
                put("supplements", Integer.valueOf(R.string.f12nameremoved));
                put("animals", Integer.valueOf(R.string.f12nameremoved));
                put("body_parts_fluids", Integer.valueOf(R.string.f12nameremoved));
                put("healthcare", Integer.valueOf(R.string.f12nameremoved));
                valueOf = Integer.valueOf(R.string.f12nameremoved);
                str = "digital_services_products";
                break;
        }
        put(str, valueOf);
    }
}
