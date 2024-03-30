package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.5W2  reason: invalid class name */
public abstract class AnonymousClass5W2 {
    public static final void A00(C159827jz r8, C161337ma r9, Object obj, Object obj2, int i, int i2) {
        int i3;
        r9.Bun(1439843069);
        int i4 = i2;
        C159827jz r3 = r8;
        if ((i2 & 14) == 0) {
            i3 = C90464aC.A0A(r9, r8) | i2;
        } else {
            i3 = i2;
        }
        Object obj3 = obj;
        if ((i2 & 112) == 0) {
            i3 |= C90464aC.A09(r9, obj);
        }
        int i5 = i;
        if ((i2 & 896) == 0) {
            int i6 = 128;
            if (r9.B2d(i)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        Object obj4 = obj2;
        if ((i2 & 7168) == 0) {
            boolean B2f = r9.B2f(obj2);
            int i7 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (B2f) {
                i7 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) != 1170 || !r9.BHg()) {
            ((C158807iG) obj3).Azk(r9, obj2, AnonymousClass5WH.A00(r9, new AnonymousClass7YO(r8, obj2, i), 980966366), 568);
        } else {
            r9.BuE();
        }
        C136976fO B6Z = r9.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156077Yo(r3, obj3, obj4, i5, i4);
        }
    }
}
