package X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3OC  reason: invalid class name */
public class AnonymousClass3OC {
    public int A00;
    public int A01;
    public AnonymousClass9N1 A02;
    public final Handler A03 = C36341k9.A0H();
    public final TouchServiceImpl A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Set A09;
    public final Set A0A;
    public final TouchService.HitTestCallback A0B = new C68313bh(this);
    public final List A0C;
    public final Map A0D;
    public final Set A0E;
    public final Set A0F;

    public static void A00(AnonymousClass3OC r2, Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        Map map = r2.A06;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = r2.A07.remove(remove)) != null && remove2 == C51402nl.GESTURE_IS_HANDLED_BY_ENGINE) {
            r2.A00--;
        }
        Set set = r2.A0E;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    public AnonymousClass3OC(TouchServiceImpl touchServiceImpl) {
        this.A04 = touchServiceImpl;
        this.A0A = C36441kJ.A16();
        this.A02 = new AnonymousClass9N1(false, false, false, false, false, false);
        this.A06 = AnonymousClass001.A0J();
        this.A07 = AnonymousClass001.A0J();
        this.A0D = AnonymousClass001.A0J();
        this.A08 = AnonymousClass001.A0J();
        this.A05 = new LinkedList();
        this.A0C = new LinkedList();
        this.A0E = C36441kJ.A16();
        this.A0F = C36441kJ.A16();
        this.A09 = C36441kJ.A17();
    }
}
