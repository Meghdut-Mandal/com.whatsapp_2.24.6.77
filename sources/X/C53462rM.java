package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.2rM  reason: invalid class name and case insensitive filesystem */
public abstract class C53462rM {
    public static final WDSSwitch A00(Context context, ListItemWithLeftIcon listItemWithLeftIcon) {
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        WDSSwitch wDSSwitch = new WDSSwitch(context, (AttributeSet) null, 0, 6, (C05250Oz) null);
        wDSSwitch.setId(R.id.mute_switch);
        wDSSwitch.setLayoutParams(A0N);
        listItemWithLeftIcon.A07(wDSSwitch);
        return wDSSwitch;
    }
}
