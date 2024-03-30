package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.lang.reflect.Field;

/* renamed from: X.5rc  reason: invalid class name and case insensitive filesystem */
public final class C120505rc {
    public final WDSSwitch A00;
    public final Field A01;

    public C120505rc(WDSSwitch wDSSwitch) {
        Field field;
        this.A00 = wDSSwitch;
        try {
            field = SwitchCompat.class.getDeclaredField("mThumbPosition");
            AnonymousClass00C.A08(field);
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        this.A01 = field;
    }
}
