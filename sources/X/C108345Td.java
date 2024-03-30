package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.5Td  reason: invalid class name and case insensitive filesystem */
public enum C108345Td {
    CALL_ENDED(1),
    STOP_FROM_BOTTOM_SHEET(2),
    STOP_FROM_GRID_TILE(4),
    PEER_TAKEOVER(16),
    ERROR(128),
    DISPLAY_PENDING_CALL(512),
    SCREEN_LOCKED(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH),
    OTHER(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    
    public final int value;

    public static void A00(C108345Td r2, C131176Oa r3) {
        AnonymousClass00C.A0D(r2, 0);
        r3.A08 = r2.value | r3.A08;
    }

    /* access modifiers changed from: public */
    static {
        C108345Td[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C108345Td(int i) {
        this.value = i;
    }
}
