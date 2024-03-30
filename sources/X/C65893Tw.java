package X;

import com.whatsapp.EmojiPicker$EmojiWeight;
import java.util.Set;

/* renamed from: X.3Tw  reason: invalid class name and case insensitive filesystem */
public class C65893Tw implements C16670pt {
    public Object A00;
    public final int A01;

    public C65893Tw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BvZ(Object obj) {
        switch (this.A01) {
            case 0:
                return ((C19730wQ) this.A00).A0M((AnonymousClass11F) obj);
            case 1:
                return ((Set) this.A00).contains(obj);
            case 2:
                return ((Set) this.A00).contains(new AnonymousClass1XQ(AnonymousClass3UO.A06(((EmojiPicker$EmojiWeight) obj).A01)));
            case 3:
                return this.A00.equals(((AnonymousClass3QK) obj).A02);
            case 4:
                AnonymousClass3QK r4 = (AnonymousClass3QK) obj;
                AnonymousClass00C.A0D(r4, 1);
                return ((C26831Lr) this.A00).A00.A0C(r4.A02);
            default:
                AnonymousClass3QK r42 = (AnonymousClass3QK) obj;
                AnonymousClass00C.A0D(r42, 1);
                return !((C26831Lr) this.A00).A00.A0C(r42.A02);
        }
    }
}
