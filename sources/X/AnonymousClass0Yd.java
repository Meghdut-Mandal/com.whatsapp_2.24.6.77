package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0Yd  reason: invalid class name */
public class AnonymousClass0Yd {
    public static final AnonymousClass0Yd A04 = new AnonymousClass0Yd(64, (CharSequence) null);
    public static final AnonymousClass0Yd A05 = new AnonymousClass0Yd(128, (CharSequence) null);
    public static final AnonymousClass0Yd A06 = new AnonymousClass0Yd(2, (CharSequence) null);
    public static final AnonymousClass0Yd A07 = new AnonymousClass0Yd(8, (CharSequence) null);
    public static final AnonymousClass0Yd A08 = new AnonymousClass0Yd(16, (CharSequence) null);
    public static final AnonymousClass0Yd A09 = new AnonymousClass0Yd(524288, (CharSequence) null);
    public static final AnonymousClass0Yd A0A;
    public static final AnonymousClass0Yd A0B = new AnonymousClass0Yd(16384, (CharSequence) null);
    public static final AnonymousClass0Yd A0C = new AnonymousClass0Yd(65536, (CharSequence) null);
    public static final AnonymousClass0Yd A0D = new AnonymousClass0Yd(1048576, (CharSequence) null);
    public static final AnonymousClass0Yd A0E;
    public static final AnonymousClass0Yd A0F;
    public static final AnonymousClass0Yd A0G;
    public static final AnonymousClass0Yd A0H = new AnonymousClass0Yd(262144, (CharSequence) null);
    public static final AnonymousClass0Yd A0I = new AnonymousClass0Yd(1, (CharSequence) null);
    public static final AnonymousClass0Yd A0J;
    public static final AnonymousClass0Yd A0K;
    public static final AnonymousClass0Yd A0L = new AnonymousClass0Yd(32, (CharSequence) null);
    public static final AnonymousClass0Yd A0M;
    public static final AnonymousClass0Yd A0N;
    public static final AnonymousClass0Yd A0O;
    public static final AnonymousClass0Yd A0P;
    public static final AnonymousClass0Yd A0Q;
    public static final AnonymousClass0Yd A0R;
    public static final AnonymousClass0Yd A0S;
    public static final AnonymousClass0Yd A0T = new AnonymousClass0Yd(32768, (CharSequence) null);
    public static final AnonymousClass0Yd A0U;
    public static final AnonymousClass0Yd A0V;
    public static final AnonymousClass0Yd A0W;
    public static final AnonymousClass0Yd A0X = new AnonymousClass0Yd((int) DefaultCrypto.BUFFER_SIZE, (CharSequence) null);
    public static final AnonymousClass0Yd A0Y;
    public static final AnonymousClass0Yd A0Z = new AnonymousClass0Yd((int) ZipDecompressor.UNZIP_BUFFER_SIZE, (CharSequence) null);
    public static final AnonymousClass0Yd A0a;
    public static final AnonymousClass0Yd A0b;
    public static final AnonymousClass0Yd A0c;
    public static final AnonymousClass0Yd A0d;
    public static final AnonymousClass0Yd A0e;
    public static final AnonymousClass0Yd A0f = new AnonymousClass0Yd(4, (CharSequence) null);
    public static final AnonymousClass0Yd A0g;
    public static final AnonymousClass0Yd A0h = new AnonymousClass0Yd(AnonymousClass0HE.class, (int) C132986Wc.A0F);
    public static final AnonymousClass0Yd A0i = new AnonymousClass0Yd(AnonymousClass0HF.class, 2097152);
    public static final AnonymousClass0Yd A0j;
    public static final AnonymousClass0Yd A0k;
    public static final AnonymousClass0Yd A0l;
    public final int A00;
    public final C16710px A01;
    public final Class A02;
    public final Object A03;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        Class<AnonymousClass0H9> cls = AnonymousClass0H9.class;
        A0N = new AnonymousClass0Yd((Class) cls, 256);
        A0V = new AnonymousClass0Yd((Class) cls, 512);
        Class<AnonymousClass0HA> cls2 = AnonymousClass0HA.class;
        A0O = new AnonymousClass0Yd((Class) cls2, (int) EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        A0W = new AnonymousClass0Yd((Class) cls2, (int) EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16 = null;
        A0j = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction, 16908342);
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        A0d = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, AnonymousClass0HC.class, accessibilityAction2, 16908343);
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17 = null;
        A0e = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction3, 16908344);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        A0b = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction4, 16908345);
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        A0Y = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction5, 16908346);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        A0c = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction6, 16908347);
        if (i >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18 = null;
        A0S = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction15, 16908358);
        if (i >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        }
        A0P = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction17, 16908359);
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction7 = null;
        }
        A0Q = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction7, 16908360);
        if (i >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
        A0R = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction18, 16908361);
        if (i >= 23) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction8 = null;
        }
        A0A = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction8, 16908348);
        int i2 = Build.VERSION.SDK_INT;
        if (i >= 24) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction9 = null;
        }
        A0g = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, AnonymousClass0HD.class, accessibilityAction9, 16908349);
        if (i2 >= 26) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction10 = null;
        }
        A0M = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, AnonymousClass0HB.class, accessibilityAction10, 16908354);
        int i3 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20 = null;
        A0l = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction16, 16908356);
        if (i2 >= 28) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction11 = null;
        }
        A0J = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction11, 16908357);
        if (i2 >= 30) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
        A0U = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction19, 16908362);
        if (i2 >= 30) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        A0K = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction21, 16908372);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction12 = null;
        }
        A0G = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction12, 16908373);
        if (i2 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction13 = null;
        }
        A0F = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction13, 16908374);
        if (i2 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction20, 16908375);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        A0k = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction14, 16908376);
        if (i4 >= 34) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        A0a = new AnonymousClass0Yd((C16710px) null, (CharSequence) null, (Class) null, accessibilityAction22, 16908382);
    }

    public AnonymousClass0Yd(int i, CharSequence charSequence) {
        this((C16710px) null, charSequence, (Class) null, (Object) null, i);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof AnonymousClass0Yd) && this.A03.equals(((AnonymousClass0Yd) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccessibilityActionCompat: ");
        String A012 = C07650Ys.A01(this.A00);
        if (A012.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                A012 = accessibilityAction.getLabel().toString();
            }
        }
        return AnonymousClass000.A0q(A012, A0u);
    }

    public AnonymousClass0Yd(Class cls, int i) {
        this((C16710px) null, (CharSequence) null, cls, (Object) null, i);
    }

    public AnonymousClass0Yd(C16710px r1, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }
}
