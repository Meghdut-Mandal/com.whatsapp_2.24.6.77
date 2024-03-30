package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass02Q;
import X.AnonymousClass0G9;
import X.AnonymousClass0GA;
import X.AnonymousClass5RW;
import X.AnonymousClass5U8;
import X.AnonymousClass5WL;
import X.AnonymousClass5WU;
import X.AnonymousClass5X4;
import X.AnonymousClass5X5;
import X.AnonymousClass5X6;
import X.AnonymousClass5X7;
import X.AnonymousClass5X9;
import X.AnonymousClass5XZ;
import X.AnonymousClass608;
import X.AnonymousClass64C;
import X.AnonymousClass68K;
import X.AnonymousClass68O;
import X.AnonymousClass69F;
import X.AnonymousClass6FE;
import X.AnonymousClass6G5;
import X.AnonymousClass6G8;
import X.AnonymousClass6MS;
import X.AnonymousClass6NB;
import X.AnonymousClass6QC;
import X.AnonymousClass6S2;
import X.AnonymousClass6U1;
import X.AnonymousClass6VV;
import X.AnonymousClass6VX;
import X.AnonymousClass6VZ;
import X.AnonymousClass6W2;
import X.AnonymousClass6WO;
import X.AnonymousClass6XQ;
import X.AnonymousClass6XT;
import X.AnonymousClass6Y0;
import X.AnonymousClass6h6;
import X.AnonymousClass759;
import X.AnonymousClass7JB;
import X.AnonymousClass7JC;
import X.AnonymousClass7NY;
import X.AnonymousClass7RW;
import X.AnonymousClass7RX;
import X.AnonymousClass7RY;
import X.AnonymousClass7RZ;
import X.AnonymousClass7bP;
import X.AnonymousClass7bQ;
import X.AnonymousClass7bU;
import X.AnonymousClass7bV;
import X.AnonymousClass7bW;
import X.AnonymousClass7e2;
import X.C003101g;
import X.C005102h;
import X.C006302t;
import X.C012005e;
import X.C05250Oz;
import X.C112475dx;
import X.C114335h3;
import X.C114355h5;
import X.C118315ng;
import X.C118345nj;
import X.C118365nl;
import X.C118405nq;
import X.C125205zU;
import X.C1263063k;
import X.C1264864f;
import X.C128856Dw;
import X.C129056Et;
import X.C130536Ll;
import X.C130596Lr;
import X.C132746Vb;
import X.C132986Wc;
import X.C133206Xf;
import X.C135616cz;
import X.C135936dV;
import X.C137066fX;
import X.C137076fY;
import X.C137326fx;
import X.C137346fz;
import X.C137386g3;
import X.C137496gE;
import X.C137506gF;
import X.C137526gH;
import X.C137536gI;
import X.C137556gL;
import X.C137846gp;
import X.C137856gq;
import X.C137866gr;
import X.C137906gv;
import X.C137916gw;
import X.C137926gx;
import X.C137936gy;
import X.C137966h1;
import X.C137976h2;
import X.C138006h7;
import X.C138066hD;
import X.C138076hG;
import X.C138126hL;
import X.C138226hV;
import X.C14960mT;
import X.C1506776e;
import X.C155477Wf;
import X.C155557Wn;
import X.C155567Wo;
import X.C156947ba;
import X.C156977bd;
import X.C156987be;
import X.C157007bg;
import X.C157017bh;
import X.C157027bi;
import X.C157587dm;
import X.C157597dn;
import X.C157617dp;
import X.C158847iK;
import X.C159887k5;
import X.C160967ls;
import X.C161267mT;
import X.C161327mZ;
import X.C161537n4;
import X.C161547n5;
import X.C161657nG;
import X.C161937ni;
import X.C163387q7;
import X.C164757sK;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90524aI;
import X.C92284dR;
import X.C92324da;
import X.C92384dr;
import X.C92404dt;
import X.C92564eB;
import X.C93994hT;
import X.C94014hV;
import X.C94114hf;
import X.C94214hq;
import X.C94714if;
import X.C94734ih;
import X.C94884ix;
import X.C95004jd;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class AndroidComposeView extends ViewGroup implements C161327mZ, C003101g, C158847iK, C156947ba {
    public static Class A1C;
    public static Method A1D;
    public long A00;
    public long A01;
    public long A02;
    public MotionEvent A03;
    public C161937ni A04;
    public C006302t A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public long A0B;
    public long A0C = C133206Xf.A02;
    public C92404dt A0D;
    public C92384dr A0E;
    public Constraints A0F;
    public List A0G;
    public C006302t A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public final C1506776e A0N;
    public final C137326fx A0O;
    public final C114335h3 A0P;
    public final AnonymousClass7bQ A0Q;
    public final C161657nG A0R;
    public final AnonymousClass7bU A0S;
    public final C137536gI A0T;
    public final AnonymousClass7bW A0U;
    public final AnonymousClass6NB A0V;
    public final C137846gp A0W;
    public final C137506gF A0X = new C137506gF((C137496gE) null, (C05250Oz) null, 1);
    public final AnonymousClass6Y0 A0Y;
    public final C1264864f A0Z;
    public final C137906gv A0a;
    public final C137936gy A0b;
    public final AndroidComposeViewAccessibilityDelegateCompat A0c;
    public final AnonymousClass7e2 A0d;
    public final C156977bd A0e;
    public final C156987be A0f;
    public final C159887k5 A0g;
    public final C138006h7 A0h;
    public final AnonymousClass608 A0i;
    public final C157017bh A0j;
    public final C118405nq A0k;
    public final AnonymousClass759 A0l;
    public final C005102h A0m;
    public final float[] A0n;
    public final float[] A0o;
    public final ViewTreeObserver.OnGlobalLayoutListener A0p;
    public final ViewTreeObserver.OnScrollChangedListener A0q;
    public final ViewTreeObserver.OnTouchModeChangeListener A0r;
    public final C161547n5 A0s;
    public final C161547n5 A0t;
    public final C161547n5 A0u;
    public final C157597dn A0v;
    public final C161267mT A0w;
    public final C161267mT A0x;
    public final C114355h5 A0y;
    public final AnonymousClass64C A0z;
    public final C1263063k A10;
    public final C156947ba A11;
    public final C135616cz A12;
    public final C118365nl A13;
    public final EmptySemanticsElement A14;
    public final C138126hL A15;
    public final Runnable A16;
    public final List A17;
    public final AtomicReference A18;
    public final AnonymousClass00S A19;
    public final float[] A1A;
    public final int[] A1B;

    public static final void A05(MotionEvent motionEvent, AndroidComposeView androidComposeView, int i, long j, boolean z) {
        AndroidComposeView androidComposeView2;
        int buttonState;
        long downTime;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        int i4 = i;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (!(i4 == 9 || i4 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (C36401kF.A1U(i3) ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i6 = 0; i6 < pointerCount; i6++) {
                pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
            }
            int i7 = 0;
            while (true) {
                androidComposeView2 = androidComposeView;
                if (i7 >= pointerCount) {
                    break;
                }
                if (i3 >= 0) {
                    i2 = 1;
                    if (i7 >= i3) {
                        int i8 = i2 + i7;
                        motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                        motionEvent.getPointerCoords(i8, pointerCoords);
                        long A0B2 = C90464aC.A0B(pointerCoords.x, pointerCoords.y);
                        long j2 = C133206Xf.A03;
                        long BOT = androidComposeView2.BOT(A0B2);
                        pointerCoords.x = C133206Xf.A00(BOT);
                        pointerCoords.y = C133206Xf.A01(BOT);
                        i7++;
                    }
                }
                i2 = 0;
                int i82 = i2 + i7;
                motionEvent.getPointerProperties(i82, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i7];
                motionEvent.getPointerCoords(i82, pointerCoords2);
                long A0B22 = C90464aC.A0B(pointerCoords2.x, pointerCoords2.y);
                long j22 = C133206Xf.A03;
                long BOT2 = androidComposeView2.BOT(A0B22);
                pointerCoords2.x = C133206Xf.A00(BOT2);
                pointerCoords2.y = C133206Xf.A01(BOT2);
                i7++;
            }
            if (z) {
                buttonState = 0;
            } else {
                buttonState = motionEvent.getButtonState();
            }
            long j3 = j;
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                downTime = j3;
            } else {
                downTime = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(downTime, j3, i4, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags());
            C118315ng A002 = androidComposeView2.A0z.A00(obtain, androidComposeView2);
            AnonymousClass00C.A0B(A002);
            androidComposeView2.A10.A00(A002, androidComposeView2, true);
            obtain.recycle();
        }
    }

    public static final boolean A0D() {
        Boolean bool;
        Method method;
        try {
            Object obj = null;
            if (A1C == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                A1C = cls;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                } else {
                    method = null;
                }
                A1D = method;
            }
            Method method2 = A1D;
            if (method2 != null) {
                Object[] objArr = new Object[2];
                objArr[0] = "debug.layout";
                AnonymousClass000.A1N(objArr, 1, false);
                obj = method2.invoke((Object) null, objArr);
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ void BVQ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BcJ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BhA(AnonymousClass012 r1) {
    }

    public /* synthetic */ void Bhq(AnonymousClass012 r1) {
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return A03(this, i);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, i, 0);
            Object invoke = declaredMethod.invoke(this, objArr);
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (r6.getSource() != r12.getSource()) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r6.getToolType(0) == r12.getToolType(0)) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r6.getButtonState() != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        r2 = r6.getActionMasked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r2 == 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (r2 == 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r2 == 6) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r6.getActionMasked() == 10) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r5 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r2 = r7.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r2.A00 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r2.A02.A00.A07();
        r0 = r2.A01.A00;
        r0.A00();
        r0.A00.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        A05(r6, r7, 10, r6.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r12.getToolType(0) == 3) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (r5 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r11 == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r3 == 3) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r3 == 9) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (A0E(r12) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        A05(r12, r7, 9, r12.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r6 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        r7.A03 = android.view.MotionEvent.obtainNoHistory(r12);
        r0 = A01(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00eb, code lost:
        r7.A0I = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (r6.getToolType(0) != 3) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r6 != null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r7 = r18
            X.759 r0 = r7.A0l
            r7.removeCallbacks(r0)
            r1 = 0
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x00f3 }
            r7.A00 = r2     // Catch:{ all -> 0x00f3 }
            X.7e2 r0 = r7.A0d     // Catch:{ all -> 0x00f3 }
            float[] r6 = r7.A0n     // Catch:{ all -> 0x00f3 }
            r0.B2D(r7, r6)     // Catch:{ all -> 0x00f3 }
            float[] r0 = r7.A0o     // Catch:{ all -> 0x00f3 }
            X.AnonymousClass5X7.A00(r6, r0)     // Catch:{ all -> 0x00f3 }
            r12 = r19
            float r2 = r12.getX()     // Catch:{ all -> 0x00f3 }
            float r0 = r12.getY()     // Catch:{ all -> 0x00f3 }
            long r4 = X.C90464aC.A0B(r2, r0)     // Catch:{ all -> 0x00f3 }
            long r2 = X.C133206Xf.A03     // Catch:{ all -> 0x00f3 }
            long r4 = X.AnonymousClass6VX.A00(r6, r4)     // Catch:{ all -> 0x00f3 }
            float r3 = r12.getRawX()     // Catch:{ all -> 0x00f3 }
            float r0 = X.C133206Xf.A00(r4)     // Catch:{ all -> 0x00f3 }
            float r3 = r3 - r0
            float r2 = r12.getRawY()     // Catch:{ all -> 0x00f3 }
            float r0 = X.C133206Xf.A01(r4)     // Catch:{ all -> 0x00f3 }
            float r2 = r2 - r0
            long r2 = X.C90464aC.A0B(r3, r2)     // Catch:{ all -> 0x00f3 }
            r7.A02 = r2     // Catch:{ all -> 0x00f3 }
            r11 = 1
            r7.A0I = r11     // Catch:{ all -> 0x00f3 }
            r7.BPk(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00f3 }
            int r3 = r12.getActionMasked()     // Catch:{ all -> 0x00ee }
            android.view.MotionEvent r6 = r7.A03     // Catch:{ all -> 0x00ee }
            r4 = 3
            if (r6 == 0) goto L_0x0061
            int r0 = r6.getToolType(r1)     // Catch:{ all -> 0x00ee }
            r5 = 1
            if (r0 == r4) goto L_0x0064
        L_0x0061:
            r5 = 0
            if (r6 == 0) goto L_0x00b6
        L_0x0064:
            int r2 = r6.getSource()     // Catch:{ all -> 0x00ee }
            int r0 = r12.getSource()     // Catch:{ all -> 0x00ee }
            if (r2 != r0) goto L_0x0078
            int r2 = r6.getToolType(r1)     // Catch:{ all -> 0x00ee }
            int r0 = r12.getToolType(r1)     // Catch:{ all -> 0x00ee }
            if (r2 == r0) goto L_0x00b6
        L_0x0078:
            int r0 = r6.getButtonState()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0095
            int r2 = r6.getActionMasked()     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x0095
            r0 = 2
            if (r2 == r0) goto L_0x0095
            r0 = 6
            if (r2 == r0) goto L_0x0095
            int r0 = r6.getActionMasked()     // Catch:{ all -> 0x00ee }
            r8 = 10
            if (r0 == r8) goto L_0x00b6
            if (r5 == 0) goto L_0x00b6
            goto L_0x00af
        L_0x0095:
            X.63k r2 = r7.A10     // Catch:{ all -> 0x00ee }
            boolean r0 = r2.A00     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00b6
            X.5h7 r0 = r2.A02     // Catch:{ all -> 0x00ee }
            X.00i r0 = r0.A00     // Catch:{ all -> 0x00ee }
            r0.A07()     // Catch:{ all -> 0x00ee }
            X.5nf r0 = r2.A01     // Catch:{ all -> 0x00ee }
            X.6FE r0 = r0.A00     // Catch:{ all -> 0x00ee }
            r0.A00()     // Catch:{ all -> 0x00ee }
            X.76e r0 = r0.A00     // Catch:{ all -> 0x00ee }
            r0.A06()     // Catch:{ all -> 0x00ee }
            goto L_0x00b6
        L_0x00af:
            long r9 = r6.getEventTime()     // Catch:{ all -> 0x00ee }
            A05(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x00ee }
        L_0x00b6:
            int r0 = r12.getToolType(r1)     // Catch:{ all -> 0x00ee }
            if (r0 == r4) goto L_0x00bd
            r11 = 0
        L_0x00bd:
            if (r5 != 0) goto L_0x00d9
            if (r11 == 0) goto L_0x00d9
            if (r3 == r4) goto L_0x00d9
            r0 = 9
            if (r3 == r0) goto L_0x00d9
            boolean r0 = r7.A0E(r12)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00d9
            long r15 = r12.getEventTime()     // Catch:{ all -> 0x00ee }
            r14 = 9
            r17 = 1
            r13 = r7
            A05(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x00ee }
        L_0x00d9:
            if (r6 == 0) goto L_0x00de
            r6.recycle()     // Catch:{ all -> 0x00ee }
        L_0x00de:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r12)     // Catch:{ all -> 0x00ee }
            r7.A03 = r0     // Catch:{ all -> 0x00ee }
            int r0 = A01(r12, r7)     // Catch:{ all -> 0x00ee }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f3 }
            r7.A0I = r1
            return r0
        L_0x00ee:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f3 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r7.A0I = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    public static final int A01(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        Object obj;
        if (androidComposeView.A0L) {
            androidComposeView.A0L = false;
            C138006h7.A01.setValue(new AnonymousClass68O(motionEvent.getMetaState()));
        }
        AnonymousClass64C r3 = androidComposeView.A0z;
        C118315ng A002 = r3.A00(motionEvent, androidComposeView);
        if (A002 != null) {
            List list = A002.A01;
            int A072 = C36431kI.A07(list);
            if (A072 >= 0) {
                while (true) {
                    int i = A072 - 1;
                    obj = list.get(A072);
                    if (!((C128856Dw) obj).A09) {
                        if (i < 0) {
                            break;
                        }
                        A072 = i;
                    } else {
                        break;
                    }
                }
            }
            obj = null;
            C128856Dw r1 = (C128856Dw) obj;
            if (r1 != null) {
                androidComposeView.A0C = r1.A04;
            }
            int A003 = androidComposeView.A10.A00(A002, androidComposeView, androidComposeView.A0E(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (A003 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                r3.A03.delete(pointerId);
                r3.A04.delete(pointerId);
            }
            return A003;
        }
        C1263063k r12 = androidComposeView.A10;
        if (r12.A00) {
            return 0;
        }
        r12.A02.A00.A07();
        AnonymousClass6FE r0 = r12.A01.A00;
        r0.A00();
        r0.A00.A06();
        return 0;
    }

    private final View A03(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (AnonymousClass00C.A0J(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View A032 = A03(viewGroup.getChildAt(i2), i);
                    if (A032 != null) {
                        return A032;
                    }
                }
            }
        }
        return null;
    }

    private final void A08(C137846gp r5) {
        int i = 0;
        this.A0Y.A0D(r5, false);
        C1506776e A092 = r5.A09();
        int i2 = A092.A00;
        if (i2 > 0) {
            Object[] objArr = A092.A01;
            do {
                A08((C137846gp) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public static final void A0A(AndroidComposeView androidComposeView) {
        if (!androidComposeView.A0I) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != androidComposeView.A00) {
                androidComposeView.A00 = currentAnimationTimeMillis;
                AnonymousClass7e2 r0 = androidComposeView.A0d;
                float[] fArr = androidComposeView.A0n;
                r0.B2D(androidComposeView, fArr);
                AnonymousClass5X7.A00(fArr, androidComposeView.A0o);
                ViewParent parent = androidComposeView.getParent();
                View view = androidComposeView;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = view.getParent();
                }
                int[] iArr = androidComposeView.A1B;
                view.getLocationOnScreen(iArr);
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                view.getLocationInWindow(iArr);
                long A0B2 = C90464aC.A0B(f - ((float) iArr[0]), f2 - ((float) iArr[1]));
                long j = C133206Xf.A03;
                androidComposeView.A02 = A0B2;
            }
        }
    }

    public static final void A0B(AndroidComposeView androidComposeView) {
        int[] iArr = androidComposeView.A1B;
        androidComposeView.getLocationOnScreen(iArr);
        long j = androidComposeView.A0B;
        int A082 = C90494aF.A08(j);
        int A032 = C90474aD.A03(j);
        boolean z = false;
        int i = iArr[0];
        if (!(A082 == i && A032 == iArr[1])) {
            androidComposeView.A0B = C90484aE.A0J(i, iArr[1]);
            if (!(A082 == Integer.MAX_VALUE || A032 == Integer.MAX_VALUE)) {
                androidComposeView.A0W.A0P.A0G.A0G();
                z = true;
            }
        }
        AnonymousClass6Y0 r2 = androidComposeView.A0Y;
        if (z) {
            AnonymousClass6MS r0 = r2.A04;
            C137846gp r1 = r2.A03;
            C1506776e r02 = r0.A01;
            r02.A06();
            r02.A0D(r1);
            r1.A0I = true;
        }
        r2.A04.A01();
    }

    /* access modifiers changed from: private */
    public final C118345nj get_viewTreeOwners() {
        return (C118345nj) this.A0s.getValue();
    }

    private void setFontFamilyResolver(C157027bi r2) {
        this.A0t.setValue(r2);
    }

    private void setLayoutDirection(AnonymousClass5RW r2) {
        this.A0u.setValue(r2);
    }

    private final void set_viewTreeOwners(C118345nj r2) {
        this.A0s.setValue(r2);
    }

    public final void A0H(C160967ls r2, boolean z) {
        List list;
        boolean z2 = this.A0J;
        if (z) {
            if (!z2) {
                list = this.A17;
            } else {
                list = this.A0G;
                if (list == null) {
                    list = AnonymousClass001.A0I();
                    this.A0G = list;
                }
            }
            list.add(r2);
        } else if (!z2) {
            this.A17.remove(r2);
            List list2 = this.A0G;
            if (list2 != null) {
                list2.remove(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0.A00 < 10) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(X.C160967ls r6) {
        /*
            r5 = this;
            X.4dr r0 = r5.A0E
            if (r0 == 0) goto L_0x0025
            boolean r0 = X.C92324da.A0I
            if (r0 != 0) goto L_0x0025
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0025
            X.5nl r2 = r5.A13
        L_0x0010:
            java.lang.ref.ReferenceQueue r0 = r2.A01
            java.lang.ref.Reference r1 = r0.poll()
            X.76e r0 = r2.A00
            if (r1 == 0) goto L_0x001e
            r0.A0F(r1)
            goto L_0x0010
        L_0x001e:
            int r1 = r0.A00
            r0 = 10
            r4 = 0
            if (r1 >= r0) goto L_0x0040
        L_0x0025:
            r4 = 1
            X.5nl r3 = r5.A13
        L_0x0028:
            java.lang.ref.ReferenceQueue r2 = r3.A01
            java.lang.ref.Reference r1 = r2.poll()
            if (r1 == 0) goto L_0x0036
            X.76e r0 = r3.A00
            r0.A0F(r1)
            goto L_0x0028
        L_0x0036:
            X.76e r1 = r3.A00
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6, r2)
            r1.A0D(r0)
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0I(X.7ls):boolean");
    }

    public C160967ls B4d(AnonymousClass00S r4, C006302t r5) {
        Object obj;
        C92384dr r0;
        C118365nl r2 = this.A13;
        while (true) {
            Reference poll = r2.A01.poll();
            if (poll == null) {
                break;
            }
            r2.A00.A0F(poll);
        }
        while (true) {
            C1506776e r1 = r2.A00;
            int i = r1.A00;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) r1.A04(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        C160967ls r12 = (C160967ls) obj;
        if (r12 != null) {
            r12.Boo(r4, r5);
            return r12;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.A0K) {
            try {
                return new C137866gr(this, r4, r5);
            } catch (Throwable unused) {
                this.A0K = false;
            }
        }
        if (this.A0E == null) {
            C125205zU r22 = C92324da.A0K;
            if (!C92324da.A0H) {
                r22.A00(new View(getContext()));
            }
            boolean z = C92324da.A0I;
            Context context = getContext();
            if (z) {
                r0 = new C92384dr(context);
            } else {
                r0 = new C95004jd(context);
            }
            this.A0E = r0;
            addView(r0);
        }
        boolean z2 = C92324da.A0H;
        C92384dr r02 = this.A0E;
        AnonymousClass00C.A0B(r02);
        return new C92324da(this, r02, r4, r5);
    }

    public void BPk(boolean z) {
        AnonymousClass6Y0 r1 = this.A0Y;
        if ((!r1.A02.A02()) || r1.A04.A01.A00 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            AnonymousClass00S r0 = null;
            if (z) {
                try {
                    r0 = this.A19;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (r1.A0E(r0)) {
                requestLayout();
            }
            r1.A04.A01();
            Trace.endSection();
        }
    }

    public void BPl(C137846gp r6, long j) {
        AnonymousClass6Y0 r3;
        IllegalArgumentException th;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            r3 = this.A0Y;
            if (!r6.A0H) {
                C137846gp r1 = r3.A03;
                if (!(!r6.equals(r1))) {
                    th = AnonymousClass001.A08("measureAndLayout called on root");
                } else if (r1.A09 == null) {
                    th = AnonymousClass001.A08("performMeasureAndLayout called with unattached root");
                } else if (!r1.A0P.A0G.A0C) {
                    th = AnonymousClass001.A08("performMeasureAndLayout called with unplaced root");
                } else if (!r3.A01) {
                    if (r3.A00 != null) {
                        r3.A01 = true;
                        r3.A02.A00(r6);
                        boolean A062 = AnonymousClass6Y0.A06(r6, r3, new Constraints(j));
                        AnonymousClass6Y0.A07(r6, r3, new Constraints(j));
                        if ((A062 || r6.A0P.A0B) && C36371kC.A1X(r6.A0C(), true)) {
                            r6.A0K();
                        }
                        C129056Et r12 = r6.A0P;
                        if (r12.A09 && r12.A0G.A0C) {
                            r6.A0N();
                            r3.A04.A01.A0D(r6);
                            r6.A0I = true;
                        }
                        r3.A01 = false;
                    }
                    AnonymousClass6Y0.A03(r3);
                } else {
                    th = AnonymousClass001.A08("performMeasureAndLayout called during measure layout");
                }
                throw th;
            }
            if (!(!r3.A02.A02())) {
                r3.A04.A01();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void BWU() {
        if (this.A07) {
            C130536Ll r0 = this.A0Z.A00;
            C155477Wf r30 = C155477Wf.A00;
            C1506776e r11 = r0.A05;
            synchronized (r11) {
                int i = r11.A00;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    C130596Lr r8 = (C130596Lr) r11.A01[i3];
                    AnonymousClass0GA r7 = r8.A04;
                    long[] jArr = r7.A02;
                    long[] jArr2 = jArr;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr2[i4];
                            if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                int A062 = C90484aE.A06(i4, length);
                                int i5 = 0;
                                while (true) {
                                    int i6 = A062;
                                    if (i5 >= i6) {
                                        if (i6 != 8) {
                                            break;
                                        }
                                    } else {
                                        if ((j & 255) < 128) {
                                            int i7 = (i4 << 3) + i5;
                                            Object obj = r7.A03[i7];
                                            AnonymousClass0G9 r2 = (AnonymousClass0G9) r7.A04[i7];
                                            if (AnonymousClass000.A1X(r30.invoke(obj))) {
                                                Object[] objArr = r2.A04;
                                                long[] jArr3 = r2.A03;
                                                long[] jArr4 = jArr3;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i8 = 0;
                                                    while (true) {
                                                        long j2 = jArr4[i8];
                                                        if ((AnonymousClass000.A0Q(j2) & -9187201950435737472L) != -9187201950435737472L) {
                                                            int A063 = C90484aE.A06(i8, length2);
                                                            int i9 = 0;
                                                            while (true) {
                                                                int i10 = A063;
                                                                if (i9 >= i10) {
                                                                    if (i10 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if ((j2 & 255) < 128) {
                                                                        Object obj2 = objArr[(i8 << 3) + i9];
                                                                        AnonymousClass68K r1 = r8.A09;
                                                                        r1.A02(obj2, obj);
                                                                        if ((obj2 instanceof C161537n4) && !r1.A00.A03(obj2)) {
                                                                            r8.A08.A00(obj2);
                                                                            r8.A0A.remove(obj2);
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                    i9++;
                                                                }
                                                            }
                                                        }
                                                        if (i8 == length2) {
                                                            break;
                                                        }
                                                        i8++;
                                                    }
                                                }
                                                r7.A06(i7);
                                            } else {
                                                continue;
                                            }
                                        }
                                        j >>= 8;
                                        i5++;
                                    }
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    if (r8.A04.A01 == 0) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr2 = r11.A01;
                        objArr2[i3 - i2] = objArr2[i3];
                    }
                }
                int i11 = i - i2;
                AnonymousClass02Q.A04(r11.A01, i11, i);
                r11.A00 = i11;
            }
            this.A07 = false;
        }
        C92404dt r02 = this.A0D;
        if (r02 != null) {
            A06(r02);
        }
        while (true) {
            C1506776e r5 = this.A0N;
            int i12 = r5.A00;
            if (i12 != 0) {
                for (int i13 = 0; i13 < i12; i13++) {
                    Object[] objArr3 = r5.A01;
                    AnonymousClass00S r12 = (AnonymousClass00S) objArr3[i13];
                    objArr3[i13] = null;
                    if (r12 != null) {
                        r12.invoke();
                    }
                }
                r5.A08(0, i12);
            } else {
                return;
            }
        }
    }

    public void BZb(C137846gp r3) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0c;
        androidComposeViewAccessibilityDelegateCompat.A0H = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0o() || androidComposeViewAccessibilityDelegateCompat.A09 != null) {
            AndroidComposeViewAccessibilityDelegateCompat.A0L(r3, androidComposeViewAccessibilityDelegateCompat);
        }
    }

    public void BgB() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0c;
        androidComposeViewAccessibilityDelegateCompat.A0H = true;
        if ((androidComposeViewAccessibilityDelegateCompat.A0o() || androidComposeViewAccessibilityDelegateCompat.A09 != null) && !androidComposeViewAccessibilityDelegateCompat.A0G) {
            androidComposeViewAccessibilityDelegateCompat.A0G = true;
            androidComposeViewAccessibilityDelegateCompat.A0M.post(androidComposeViewAccessibilityDelegateCompat.A0U);
        }
    }

    public void autofill(SparseArray sparseArray) {
        C137326fx r0;
        if (Build.VERSION.SDK_INT >= 26 && (r0 = this.A0O) != null) {
            AnonymousClass6G5.A00(sparseArray, r0);
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.A0c.A0p(i, this.A0C, false);
    }

    public boolean canScrollVertically(int i) {
        return this.A0c.A0p(i, this.A0C, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x00aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r3 = r19
            int r1 = r3.getActionMasked()
            r0 = 8
            r2 = r18
            if (r1 != r0) goto L_0x020e
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r3.isFromSource(r0)
            if (r0 == 0) goto L_0x01f6
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            r0 = 26
            float r0 = r3.getAxisValue(r0)
            float r14 = -r0
            android.content.Context r0 = r2.getContext()
            float r0 = X.C016507c.A01(r0, r1)
            float r13 = r14 * r0
            android.content.Context r0 = r2.getContext()
            float r0 = X.C016507c.A00(r0, r1)
            float r14 = r14 * r0
            long r16 = r3.getEventTime()
            int r15 = r3.getDeviceId()
            X.3JU r12 = new X.3JU
            r12.<init>(r13, r14, r15, r16)
            X.7nG r0 = r2.A0R
            X.6fz r0 = (X.C137346fz) r0
            X.4hq r0 = r0.A01
            X.4hq r2 = X.AnonymousClass6U1.A00(r0)
            java.lang.String r10 = "visitAncestors called on an unattached node"
            r8 = 16384(0x4000, float:2.2959E-41)
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x020c
            X.6gq r1 = r2.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x01f1
            X.6gq r9 = r1.A04
            X.6gp r5 = X.AnonymousClass6VZ.A02(r2)
            if (r5 == 0) goto L_0x00bc
        L_0x0063:
            int r0 = X.AnonymousClass6XQ.A00(r5, r8)
            if (r0 == 0) goto L_0x00ad
        L_0x0069:
            if (r9 == 0) goto L_0x00ad
            int r0 = r9.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x00aa
            r4 = r7
            r3 = r9
        L_0x0072:
            boolean r0 = r3 instanceof X.C161727nN
            if (r0 != 0) goto L_0x00bd
            int r0 = r3.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x00a0
            r0 = r3
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0085:
            if (r2 == 0) goto L_0x00a5
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0091
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x0094
            r3 = r2
        L_0x0091:
            X.6gq r2 = r2.A02
            goto L_0x0085
        L_0x0094:
            X.76e r4 = X.C90464aC.A0G(r4)
            X.6gq r3 = X.C90524aI.A0D(r4, r3)
            r4.A0D(r2)
            goto L_0x0091
        L_0x00a0:
            X.6gq r3 = X.AnonymousClass6VZ.A00(r4)
            goto L_0x00a7
        L_0x00a5:
            if (r1 != r6) goto L_0x00a0
        L_0x00a7:
            if (r3 == 0) goto L_0x00aa
            goto L_0x0072
        L_0x00aa:
            X.6gq r9 = r9.A04
            goto L_0x0069
        L_0x00ad:
            X.6gp r5 = r5.A0A()
            if (r5 == 0) goto L_0x00bc
            X.6XQ r0 = r5.A0R
            if (r0 == 0) goto L_0x00ba
            X.6gq r9 = r0.A05
            goto L_0x0063
        L_0x00ba:
            r9 = r7
            goto L_0x0063
        L_0x00bc:
            r3 = r7
        L_0x00bd:
            X.7nN r3 = (X.C161727nN) r3
            if (r3 == 0) goto L_0x020c
            r5 = 16384(0x4000, float:2.2959E-41)
            r9 = r3
            X.6gq r9 = (X.C137856gq) r9
            X.6gq r1 = r9.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x01ec
            X.6gq r11 = r1.A04
            X.6gp r10 = X.AnonymousClass6VZ.A02(r3)
            r3 = r7
            if (r10 == 0) goto L_0x0148
        L_0x00d5:
            int r0 = X.AnonymousClass6XQ.A00(r10, r5)
            if (r0 == 0) goto L_0x0128
        L_0x00db:
            if (r11 == 0) goto L_0x0128
            int r0 = r11.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0125
            r8 = r11
            r4 = r7
        L_0x00e4:
            boolean r0 = r8 instanceof X.C161727nN
            if (r0 == 0) goto L_0x00f8
            if (r3 != 0) goto L_0x00ee
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
        L_0x00ee:
            r3.add(r8)
        L_0x00f1:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r4)
        L_0x00f5:
            if (r8 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x00f8:
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x00f1
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x0122
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0113
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x0116
            r8 = r2
        L_0x0113:
            X.6gq r2 = r2.A02
            goto L_0x0107
        L_0x0116:
            X.76e r4 = X.C90464aC.A0G(r4)
            X.6gq r8 = X.C90524aI.A0D(r4, r8)
            r4.A0D(r2)
            goto L_0x0113
        L_0x0122:
            if (r1 != r6) goto L_0x00f1
            goto L_0x00f5
        L_0x0125:
            X.6gq r11 = r11.A04
            goto L_0x00db
        L_0x0128:
            X.6gp r10 = r10.A0A()
            if (r10 == 0) goto L_0x0137
            X.6XQ r0 = r10.A0R
            if (r0 == 0) goto L_0x0135
            X.6gq r11 = r0.A05
            goto L_0x00d5
        L_0x0135:
            r11 = r7
            goto L_0x00d5
        L_0x0137:
            if (r3 == 0) goto L_0x0148
            int r1 = X.C90504aG.A0C(r3)
            if (r1 < 0) goto L_0x0148
        L_0x013f:
            int r0 = r1 + -1
            r3.get(r1)
            if (r0 < 0) goto L_0x0148
            r1 = r0
            goto L_0x013f
        L_0x0148:
            X.6gq r8 = r9.A03
            r4 = r7
        L_0x014b:
            if (r8 == 0) goto L_0x0183
            boolean r0 = r8 instanceof X.C161727nN
            if (r0 != 0) goto L_0x017e
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x017e
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x017e
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0160:
            if (r2 == 0) goto L_0x017b
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x016c
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x016f
            r8 = r2
        L_0x016c:
            X.6gq r2 = r2.A02
            goto L_0x0160
        L_0x016f:
            X.76e r4 = X.C90464aC.A0G(r4)
            X.6gq r8 = X.C90524aI.A0D(r4, r8)
            r4.A0D(r2)
            goto L_0x016c
        L_0x017b:
            if (r1 != r6) goto L_0x017e
            goto L_0x014b
        L_0x017e:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r4)
            goto L_0x014b
        L_0x0183:
            X.6gq r4 = r9.A03
        L_0x0185:
            if (r4 == 0) goto L_0x01cd
            boolean r0 = r4 instanceof X.C161727nN
            if (r0 == 0) goto L_0x019b
            X.7nN r4 = (X.C161727nN) r4
            X.4hl r4 = (X.C94164hl) r4
            X.02t r0 = r4.A00
            if (r0 == 0) goto L_0x01c8
            boolean r0 = X.C90464aC.A1Y(r12, r0)
            if (r0 == 0) goto L_0x01c8
        L_0x0199:
            r1 = 1
            return r1
        L_0x019b:
            int r0 = r4.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r4 instanceof X.C94114hf
            if (r0 == 0) goto L_0x01c8
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x01aa:
            if (r2 == 0) goto L_0x01c5
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01b6
            int r1 = r1 + 1
            if (r1 != r6) goto L_0x01b9
            r4 = r2
        L_0x01b6:
            X.6gq r2 = r2.A02
            goto L_0x01aa
        L_0x01b9:
            X.76e r7 = X.C90464aC.A0G(r7)
            X.6gq r4 = X.C90524aI.A0D(r7, r4)
            r7.A0D(r2)
            goto L_0x01b6
        L_0x01c5:
            if (r1 != r6) goto L_0x01c8
            goto L_0x0185
        L_0x01c8:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r7)
            goto L_0x0185
        L_0x01cd:
            if (r3 == 0) goto L_0x020c
            int r2 = r3.size()
            r1 = 0
        L_0x01d4:
            if (r1 >= r2) goto L_0x020c
            java.lang.Object r0 = r3.get(r1)
            X.7nN r0 = (X.C161727nN) r0
            X.4hl r0 = (X.C94164hl) r0
            X.02t r0 = r0.A00
            if (r0 == 0) goto L_0x01e9
            boolean r0 = X.C90464aC.A1Y(r12, r0)
            if (r0 == 0) goto L_0x01e9
            goto L_0x0199
        L_0x01e9:
            int r1 = r1 + 1
            goto L_0x01d4
        L_0x01ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x01f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x01f6:
            boolean r0 = A0G(r3)
            if (r0 != 0) goto L_0x020e
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x020e
            int r0 = r2.A00(r3)
            r1 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x020c
            return r1
        L_0x020c:
            r1 = 0
            return r1
        L_0x020e:
            boolean r1 = super.dispatchGenericMotionEvent(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        r1 = X.AnonymousClass6GA.A01(r7, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x000e
            java.lang.Runnable r0 = r3.A16
            r3.removeCallbacks(r0)
            r0.run()
        L_0x000e:
            r4 = r18
            boolean r0 = A0G(r4)
            r2 = 0
            if (r0 != 0) goto L_0x0069
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L_0x0069
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = r3.A0c
            android.view.accessibility.AccessibilityManager r1 = r5.A0P
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x004b
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x004b
            int r6 = r4.getAction()
            r0 = 7
            r15 = 1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x0074
            r0 = 9
            if (r6 == r0) goto L_0x0074
            r0 = 10
            if (r6 != r0) goto L_0x004b
            int r6 = r5.A02
            if (r6 == r1) goto L_0x006a
            r5.A02 = r1
            r1 = 0
            r0 = 256(0x100, float:3.59E-43)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r5, r1, r1, r6, r0)
        L_0x004b:
            int r1 = r4.getActionMasked()
            r0 = 7
            if (r1 == r0) goto L_0x011a
            r0 = 10
            if (r1 != r0) goto L_0x0121
            boolean r0 = r3.A0E(r4)
            if (r0 == 0) goto L_0x0121
            int r1 = r4.getToolType(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0104
            int r0 = r4.getButtonState()
            if (r0 == 0) goto L_0x0104
        L_0x0069:
            return r2
        L_0x006a:
            androidx.compose.ui.platform.AndroidComposeView r0 = r5.A0T
            X.4dt r0 = r0.getAndroidViewsHandler$ui_release()
            r0.dispatchGenericMotionEvent(r4)
            goto L_0x004b
        L_0x0074:
            float r1 = r4.getX()
            float r0 = r4.getY()
            androidx.compose.ui.platform.AndroidComposeView r6 = r5.A0T
            r7 = 0
            r6.BPk(r15)
            X.76X r11 = new X.76X
            r11.<init>()
            X.6gp r10 = r6.A0W
            long r0 = X.C90464aC.A0B(r1, r0)
            long r8 = X.C133206Xf.A03
            X.6XQ r9 = r10.A0R
            X.4iy r8 = r9.A04
            long r13 = r8.A0J(r0)
            X.4iy r10 = r9.A04
            X.7km r12 = X.C94894iy.A0M
            r16 = 1
            r10.A0Z(r11, r12, r13, r15, r16)
            java.lang.Object r0 = X.C007103b.A0O(r11)
            X.6gq r0 = (X.C137856gq) r0
            if (r0 == 0) goto L_0x00ac
            X.6gp r7 = X.AnonymousClass6VZ.A02(r0)
        L_0x00ac:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x00ea
            X.6XQ r0 = r7.A0R
            if (r0 == 0) goto L_0x00ea
            r1 = 8
            X.6gq r0 = r0.A02
            int r0 = r0.A00
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            if (r0 != r15) goto L_0x00ea
            X.6WV r1 = X.AnonymousClass6GA.A01(r7, r2)
            X.4iy r0 = r1.A06()
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.A0b()
            if (r0 != 0) goto L_0x00ea
        L_0x00d1:
            X.72a r1 = r1.A05
            X.62Q r0 = X.C114205gq.A0A
            boolean r0 = X.C1496172a.A00(r1, r0)
            if (r0 != 0) goto L_0x00ea
            X.4dt r0 = r6.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A00
            r0.get(r7)
            int r0 = r7.A01
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r5, r0)
        L_0x00ea:
            X.4dt r0 = r6.getAndroidViewsHandler$ui_release()
            r0.dispatchGenericMotionEvent(r4)
            int r6 = r5.A02
            if (r6 == r8) goto L_0x004b
            r5.A02 = r8
            r1 = 0
            r0 = 128(0x80, float:1.794E-43)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r5, r1, r1, r8, r0)
            r0 = 256(0x100, float:3.59E-43)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r5, r1, r1, r6, r0)
            goto L_0x004b
        L_0x0104:
            android.view.MotionEvent r0 = r3.A03
            if (r0 == 0) goto L_0x010b
            r0.recycle()
        L_0x010b:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r4)
            r3.A03 = r0
            r0 = 1
            r3.A06 = r0
            java.lang.Runnable r0 = r3.A16
            r3.post(r0)
            return r2
        L_0x011a:
            boolean r0 = r3.A0F(r4)
            if (r0 != 0) goto L_0x0121
            return r2
        L_0x0121:
            int r0 = r3.A00(r4)
            r1 = 1
            r0 = r0 & 1
            if (r0 != 0) goto L_0x012b
            r1 = 0
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (((r3 & ((~r3) << 6)) & -9187201950435737472L) != 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        if (((((~r2) << 6) & r2) & -9187201950435737472L) == 0) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0149, code lost:
        r10 = X.AnonymousClass0G8.A00(r13, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        if (r13.A00 != 0) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015f, code lost:
        if (X.AnonymousClass000.A0T(r27, r10) == 254) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0161, code lost:
        r0 = X.C05860Ri.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0164, code lost:
        if (r15 == 0) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0166, code lost:
        r1 = (r15 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016a, code lost:
        r24 = r13.A02;
        X.AnonymousClass0G8.A01(r13, r1);
        r23 = r13.A02;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0176, code lost:
        if (r12 >= r15) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0182, code lost:
        if (X.AnonymousClass000.A0T(r27, r12) >= 128) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        r21 = r24[r12];
        r1 = X.AnonymousClass000.A04(X.AnonymousClass000.A08(r21));
        r20 = X.AnonymousClass0G8.A00(r13, r1 >>> 7);
        r2 = (long) (r1 & 127);
        r14 = r13.A03;
        r19 = r20 >> 3;
        r18 = (r20 & 7) << 3;
        r14[r19] = (r14[r19] & (~(255 << r18))) | (r2 << r18);
        r0 = X.AnonymousClass001.A01(r20, r13.A00);
        r19 = r0 >> 3;
        r18 = (r0 & 7) << 3;
        r14[r19] = ((~(255 << r18)) & r14[r19]) | (r2 << r18);
        r23[r20] = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c8, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d1, code lost:
        r10 = X.AnonymousClass0G8.A00(r13, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d7, code lost:
        r13.A01++;
        r3 = r13.A00;
        r11 = r13.A03;
        r18 = r10 >> 3;
        r16 = r11[r18];
        r12 = (r10 & 7) << 3;
        r13.A00 = r3 - (X.AnonymousClass000.A1Q((((r16 >> r12) & 255) > 128 ? 1 : (((r16 >> r12) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r11[r18] = (r16 & (~(255 << r12))) | (r8 << r12);
        r0 = X.AnonymousClass001.A01(r10, r13.A00);
        r14 = r0 >> 3;
        r12 = (r0 & 7) << 3;
        r11[r14] = ((~(255 << r12)) & r11[r14]) | (r8 << r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0242, code lost:
        if (r9 != null) goto L_0x0244;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x037c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x02ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r31) {
        /*
            r30 = this;
            r28 = r30
            boolean r0 = r28.isFocused()
            r29 = r31
            if (r0 == 0) goto L_0x03ca
            int r2 = r29.getMetaState()
            X.7n5 r1 = X.C138006h7.A01
            X.68O r0 = new X.68O
            r0.<init>(r2)
            r1.setValue(r0)
            r0 = r28
            X.7nG r0 = r0.A0R
            r26 = r0
            r0 = r26
            X.6fz r0 = (X.C137346fz) r0
            r26 = r0
            long r6 = X.C109135Wk.A01(r29)
            int r0 = r29.getAction()
            if (r0 == 0) goto L_0x00e5
            r1 = 1
            if (r0 != r1) goto L_0x00a5
            r0 = r26
            X.0G8 r10 = r0.A00
            if (r10 == 0) goto L_0x035e
            boolean r0 = r10.A02(r6)
            if (r0 != r1) goto L_0x035e
            int r0 = X.AnonymousClass000.A08(r6)
            int r0 = X.AnonymousClass000.A04(r0)
            r11 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r10.A00
            int r9 = r0 >>> 7
            r9 = r9 & r5
            r18 = 0
        L_0x004e:
            long[] r8 = r10.A03
            long r3 = X.AnonymousClass000.A0S(r8, r9)
            long r16 = X.AnonymousClass000.A0N(r11, r3)
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
        L_0x005f:
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            int r0 = java.lang.Long.numberOfTrailingZeros(r16)
            int r2 = r0 >> 3
            int r2 = r2 + r9
            r2 = r2 & r5
            long[] r0 = r10.A02
            r12 = r0[r2]
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            if (r2 < 0) goto L_0x00a5
            int r0 = r10.A01
            int r0 = r0 + -1
            r10.A01 = r0
            int r14 = r2 >> 3
            r0 = r2 & 7
            int r13 = r0 << 3
            r11 = r8[r14]
            r6 = 255(0xff, double:1.26E-321)
            long r3 = r6 << r13
            long r0 = ~r3
            long r11 = r11 & r0
            r9 = 254(0xfe, double:1.255E-321)
            long r0 = r9 << r13
            long r11 = r11 | r0
            r8[r14] = r11
            int r0 = X.AnonymousClass001.A01(r2, r5)
            int r5 = r0 >> 3
            r0 = r0 & 7
            int r4 = r0 << 3
            r2 = r8[r5]
            long r6 = r6 << r4
            long r0 = ~r6
            long r2 = r2 & r0
            long r9 = r9 << r4
            long r2 = r2 | r9
            r8[r5] = r2
        L_0x00a5:
            r0 = r26
            X.4hq r0 = r0.A01
            X.4hq r8 = X.AnonymousClass6U1.A00(r0)
            if (r8 == 0) goto L_0x0357
            r4 = 1024(0x400, float:1.435E-42)
            r3 = 9216(0x2400, float:1.2914E-41)
            X.6gq r2 = r8.A03
            r1 = r2
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0350
            int r0 = r2.A00
            r0 = r0 & r3
            r9 = 0
            if (r0 == 0) goto L_0x021d
        L_0x00c0:
            X.6gq r2 = r2.A02
            if (r2 == 0) goto L_0x021d
            int r0 = r2.A01
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00c0
            int r0 = r2.A01
            r0 = r0 & r4
            if (r0 != 0) goto L_0x021d
            r9 = r2
            goto L_0x00c0
        L_0x00d0:
            long r16 = X.AnonymousClass000.A0P(r16)
            goto L_0x005f
        L_0x00d5:
            long r1 = ~r3
            r0 = 6
            long r1 = r1 << r0
            long r3 = r3 & r1
            long r3 = r3 & r14
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            int r18 = r18 + 8
            int r9 = r9 + r18
            r9 = r9 & r5
            goto L_0x004e
        L_0x00e5:
            r0 = r26
            X.0G8 r13 = r0.A00
            if (r13 != 0) goto L_0x00f5
            r0 = 3
            X.0G8 r13 = new X.0G8
            r13.<init>(r0)
            r0 = r26
            r0.A00 = r13
        L_0x00f5:
            int r0 = X.AnonymousClass000.A08(r6)
            int r0 = X.AnonymousClass000.A04(r0)
            int r25 = r0 >>> 7
            r12 = r0 & 127(0x7f, float:1.78E-43)
            int r15 = r13.A00
            r11 = r25 & r15
            r14 = 0
        L_0x0106:
            long[] r0 = r13.A03
            r27 = r0
            long r2 = X.AnonymousClass000.A0S(r0, r11)
            long r8 = (long) r12
            r18 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r8 * r18
            long r4 = r2 ^ r0
            long r16 = r4 - r18
            long r0 = ~r4
            long r0 = r0 & r16
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r18
        L_0x0124:
            r16 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x013f
            int r4 = java.lang.Long.numberOfTrailingZeros(r0)
            int r10 = r4 >> 3
            int r10 = r10 + r11
            r10 = r10 & r15
            long[] r4 = r13.A02
            r16 = r4[r10]
            int r4 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0217
            long r0 = X.AnonymousClass000.A0P(r0)
            goto L_0x0124
        L_0x013f:
            long r0 = ~r2
            r4 = 6
            long r0 = r0 << r4
            long r0 = r0 & r2
            long r0 = r0 & r18
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x01cb
            r0 = r25
            int r10 = X.AnonymousClass0G8.A00(r13, r0)
            int r0 = r13.A00
            r4 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x01d7
            r0 = r27
            long r11 = X.AnonymousClass000.A0T(r0, r10)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d7
            X.0GA r0 = X.C05860Ri.A01
            r1 = 6
            if (r15 == 0) goto L_0x016a
            int r0 = r15 * 2
            int r1 = r0 + 1
        L_0x016a:
            long[] r0 = r13.A02
            r24 = r0
            X.AnonymousClass0G8.A01(r13, r1)
            long[] r0 = r13.A02
            r23 = r0
            r12 = 0
        L_0x0176:
            if (r12 >= r15) goto L_0x01d1
            r0 = r27
            long r10 = X.AnonymousClass000.A0T(r0, r12)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c8
            r21 = r24[r12]
            int r0 = X.AnonymousClass000.A08(r21)
            int r1 = X.AnonymousClass000.A04(r0)
            int r0 = r1 >>> 7
            int r20 = X.AnonymousClass0G8.A00(r13, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r0
            long[] r14 = r13.A03
            int r19 = r20 >> 3
            r0 = r20 & 7
            int r18 = r0 << 3
            r16 = r14[r19]
            long r10 = r4 << r18
            long r10 = ~r10
            long r16 = r16 & r10
            long r0 = r2 << r18
            long r16 = r16 | r0
            r14[r19] = r16
            int r1 = r13.A00
            r0 = r20
            int r0 = X.AnonymousClass001.A01(r0, r1)
            int r19 = r0 >> 3
            r0 = r0 & 7
            int r18 = r0 << 3
            r16 = r14[r19]
            long r10 = r4 << r18
            long r10 = ~r10
            long r10 = r10 & r16
            long r2 = r2 << r18
            long r10 = r10 | r2
            r14[r19] = r10
            r23[r20] = r21
        L_0x01c8:
            int r12 = r12 + 1
            goto L_0x0176
        L_0x01cb:
            int r14 = r14 + 8
            int r11 = r11 + r14
            r11 = r11 & r15
            goto L_0x0106
        L_0x01d1:
            r0 = r25
            int r10 = X.AnonymousClass0G8.A00(r13, r0)
        L_0x01d7:
            int r0 = r13.A01
            int r0 = r0 + 1
            r13.A01 = r0
            int r3 = r13.A00
            long[] r11 = r13.A03
            int r18 = r10 >> 3
            r16 = r11[r18]
            r0 = r10 & 7
            int r12 = r0 << 3
            long r14 = r16 >> r12
            long r14 = r14 & r4
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            int r3 = r3 - r0
            r13.A00 = r3
            long r2 = r4 << r12
            long r0 = ~r2
            long r16 = r16 & r0
            long r0 = r8 << r12
            long r16 = r16 | r0
            r11[r18] = r16
            int r0 = r13.A00
            int r0 = X.AnonymousClass001.A01(r10, r0)
            int r14 = r0 >> 3
            r0 = r0 & 7
            int r12 = r0 << 3
            r2 = r11[r14]
            long r4 = r4 << r12
            long r0 = ~r4
            long r0 = r0 & r2
            long r8 = r8 << r12
            long r0 = r0 | r8
            r11[r14] = r0
        L_0x0217:
            long[] r0 = r13.A02
            r0[r10] = r6
            goto L_0x00a5
        L_0x021d:
            java.lang.String r10 = "visitAncestors called on an unattached node"
            r7 = 8192(0x2000, float:1.14794E-41)
            r6 = 0
            r5 = 1
            if (r9 != 0) goto L_0x0244
            X.6gq r9 = r1.A04
            X.6gp r8 = X.AnonymousClass6VZ.A02(r8)
            if (r8 == 0) goto L_0x035e
        L_0x022d:
            int r0 = X.AnonymousClass6XQ.A00(r8, r7)
            if (r0 == 0) goto L_0x02ee
        L_0x0233:
            if (r9 == 0) goto L_0x02ee
            int r0 = r9.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x02ea
            r4 = r6
            r3 = r9
        L_0x023c:
            boolean r0 = r3 instanceof X.C161757nQ
            if (r0 == 0) goto L_0x02b5
            X.6gq r9 = r3.A03
            if (r9 == 0) goto L_0x035e
        L_0x0244:
            X.6gq r1 = r9.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x034b
            X.6gq r11 = r1.A04
            X.6gp r10 = X.AnonymousClass6VZ.A02(r9)
            r4 = r6
            if (r10 == 0) goto L_0x0310
        L_0x0253:
            int r0 = X.AnonymousClass6XQ.A00(r10, r7)
            if (r0 == 0) goto L_0x02a6
        L_0x0259:
            if (r11 == 0) goto L_0x02a6
            int r0 = r11.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x02a3
            r8 = r11
            r3 = r6
        L_0x0262:
            boolean r0 = r8 instanceof X.C161757nQ
            if (r0 == 0) goto L_0x0276
            if (r4 != 0) goto L_0x026c
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
        L_0x026c:
            r4.add(r8)
        L_0x026f:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r3)
        L_0x0273:
            if (r8 == 0) goto L_0x02a3
            goto L_0x0262
        L_0x0276:
            int r0 = r8.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x026f
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x026f
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0285:
            if (r2 == 0) goto L_0x02a0
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0291
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0294
            r8 = r2
        L_0x0291:
            X.6gq r2 = r2.A02
            goto L_0x0285
        L_0x0294:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r8 = X.C90524aI.A0D(r3, r8)
            r3.A0D(r2)
            goto L_0x0291
        L_0x02a0:
            if (r1 != r5) goto L_0x026f
            goto L_0x0273
        L_0x02a3:
            X.6gq r11 = r11.A04
            goto L_0x0259
        L_0x02a6:
            X.6gp r10 = r10.A0A()
            if (r10 == 0) goto L_0x02ff
            X.6XQ r0 = r10.A0R
            if (r0 == 0) goto L_0x02b3
            X.6gq r11 = r0.A05
            goto L_0x0253
        L_0x02b3:
            r11 = r6
            goto L_0x0253
        L_0x02b5:
            int r0 = r3.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x02e2
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x02e2
            r0 = r3
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x02c4:
            if (r2 == 0) goto L_0x02df
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x02d0
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x02d3
            r3 = r2
        L_0x02d0:
            X.6gq r2 = r2.A02
            goto L_0x02c4
        L_0x02d3:
            X.76e r4 = X.C90464aC.A0G(r4)
            X.6gq r3 = X.C90524aI.A0D(r4, r3)
            r4.A0D(r2)
            goto L_0x02d0
        L_0x02df:
            if (r1 != r5) goto L_0x02e2
            goto L_0x02e6
        L_0x02e2:
            X.6gq r3 = X.AnonymousClass6VZ.A00(r4)
        L_0x02e6:
            if (r3 == 0) goto L_0x02ea
            goto L_0x023c
        L_0x02ea:
            X.6gq r9 = r9.A04
            goto L_0x0233
        L_0x02ee:
            X.6gp r8 = r8.A0A()
            if (r8 == 0) goto L_0x035e
            X.6XQ r0 = r8.A0R
            if (r0 == 0) goto L_0x02fc
            X.6gq r9 = r0.A05
            goto L_0x022d
        L_0x02fc:
            r9 = r6
            goto L_0x022d
        L_0x02ff:
            if (r4 == 0) goto L_0x0310
            int r1 = X.C90504aG.A0C(r4)
            if (r1 < 0) goto L_0x0310
        L_0x0307:
            int r0 = r1 + -1
            r4.get(r1)
            if (r0 < 0) goto L_0x0310
            r1 = r0
            goto L_0x0307
        L_0x0310:
            X.6gq r8 = r9.A03
            r3 = r6
        L_0x0313:
            if (r8 == 0) goto L_0x036a
            boolean r0 = r8 instanceof X.C161757nQ
            if (r0 != 0) goto L_0x0346
            int r0 = r8.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0346
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0346
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0328:
            if (r2 == 0) goto L_0x0343
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0334
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0337
            r8 = r2
        L_0x0334:
            X.6gq r2 = r2.A02
            goto L_0x0328
        L_0x0337:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r8 = X.C90524aI.A0D(r3, r8)
            r3.A0D(r2)
            goto L_0x0334
        L_0x0343:
            if (r1 != r5) goto L_0x0346
            goto L_0x0313
        L_0x0346:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r3)
            goto L_0x0313
        L_0x034b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x0350:
            java.lang.String r0 = "visitLocalDescendants called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0357:
            java.lang.String r0 = "Event can't be processed because we do not have an active focus target."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x035e:
            r1 = r28
            r0 = r29
            boolean r1 = super.dispatchKeyEvent(r0)
            r0 = 0
            if (r1 == 0) goto L_0x037d
            goto L_0x037c
        L_0x036a:
            X.6gq r3 = r9.A03
        L_0x036c:
            if (r3 == 0) goto L_0x03b0
            boolean r0 = r3 instanceof X.C161757nQ
            if (r0 == 0) goto L_0x037e
            X.7nQ r3 = (X.C161757nQ) r3
            r0 = r29
            boolean r0 = r3.BZT(r0)
            if (r0 == 0) goto L_0x03ab
        L_0x037c:
            r0 = 1
        L_0x037d:
            return r0
        L_0x037e:
            int r0 = r3.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x03ab
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x03ab
            r0 = r3
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x038d:
            if (r2 == 0) goto L_0x03a8
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0399
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x039c
            r3 = r2
        L_0x0399:
            X.6gq r2 = r2.A02
            goto L_0x038d
        L_0x039c:
            X.76e r6 = X.C90464aC.A0G(r6)
            X.6gq r3 = X.C90524aI.A0D(r6, r3)
            r6.A0D(r2)
            goto L_0x0399
        L_0x03a8:
            if (r1 != r5) goto L_0x03ab
            goto L_0x036c
        L_0x03ab:
            X.6gq r3 = X.AnonymousClass6VZ.A00(r6)
            goto L_0x036c
        L_0x03b0:
            if (r4 == 0) goto L_0x035e
            int r3 = r4.size()
            r2 = 0
        L_0x03b7:
            if (r2 >= r3) goto L_0x035e
            java.lang.Object r1 = r4.get(r2)
            X.7nQ r1 = (X.C161757nQ) r1
            r0 = r29
            boolean r0 = r1.BZT(r0)
            if (r0 != 0) goto L_0x037c
            int r2 = r2 + 1
            goto L_0x03b7
        L_0x03ca:
            r1 = r28
            r0 = r29
            boolean r0 = super.dispatchKeyEvent(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A06) {
            Runnable runnable = this.A16;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A03;
            AnonymousClass00C.A0B(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A06 = false;
            } else {
                runnable.run();
            }
        }
        if (A0G(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !A0F(motionEvent))) {
            return false;
        }
        int A002 = A00(motionEvent);
        if ((A002 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((A002 & 1) == 0) {
            return false;
        }
        return true;
    }

    public final C92404dt getAndroidViewsHandler$ui_release() {
        if (this.A0D == null) {
            C92404dt r0 = new C92404dt(getContext());
            this.A0D = r0;
            addView(r0);
        }
        C92404dt r02 = this.A0D;
        AnonymousClass00C.A0B(r02);
        return r02;
    }

    public void getFocusedRect(Rect rect) {
        AnonymousClass6QC A022;
        C94214hq A002 = AnonymousClass6U1.A00(((C137346fz) this.A0R).A01);
        if (A002 == null || (A022 = AnonymousClass6U1.A02(A002)) == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = C14960mT.A01(A022.A01);
        rect.top = C14960mT.A01(A022.A03);
        rect.right = C14960mT.A01(A022.A02);
        rect.bottom = C14960mT.A01(A022.A00);
    }

    public C157027bi getFontFamilyResolver() {
        return (C157027bi) this.A0t.getValue();
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.A0Y.A02.A02();
    }

    public AnonymousClass5RW getLayoutDirection() {
        return (AnonymousClass5RW) this.A0u.getValue();
    }

    public long getMeasureIteration() {
        if (this.A0Y.A01) {
            return 1;
        }
        throw AnonymousClass001.A08("measureIteration should be only used during the measure/layout pass");
    }

    public AnonymousClass6WO getPlacementScope() {
        return new C94714if(this);
    }

    public final C118345nj getViewTreeOwners() {
        return (C118345nj) this.A0v.getValue();
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.A0c.A0n(consumer, jArr);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0Y.A0E(this.A19);
        this.A0F = null;
        A0B(this);
        if (this.A0D != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass6Y0 r2;
        IllegalArgumentException th;
        Constraints constraints;
        Constraints constraints2;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                A08(this.A0W);
            }
            long A022 = A02(i);
            long A023 = A02(i2);
            long A002 = C132746Vb.A00((int) (A022 >>> 32), (int) (A022 & 4294967295L), (int) (A023 >>> 32), (int) (4294967295L & A023));
            Constraints constraints3 = this.A0F;
            if (constraints3 == null) {
                this.A0F = new Constraints(A002);
                this.A09 = false;
            } else if (constraints3.A00 != A002) {
                this.A09 = true;
            }
            r2 = this.A0Y;
            Constraints constraints4 = r2.A00;
            boolean z = false;
            if (constraints4 == null || constraints4.A00 != A002) {
                if (!r2.A01) {
                    r2.A00 = new Constraints(A002);
                    C137846gp r4 = r2.A03;
                    C137846gp r3 = r4.A07;
                    if (r3 != null) {
                        r4.A0P.A0D = true;
                    }
                    r4.A0P.A0E = true;
                    AnonymousClass69F r0 = r2.A02;
                    if (r3 != null) {
                        z = true;
                    }
                    r0.A01(r4, z);
                } else {
                    th = AnonymousClass001.A08("updateRootConstraints called while measuring");
                    throw th;
                }
            }
            AnonymousClass69F r42 = r2.A02;
            if (!r42.A02()) {
                C137846gp r32 = r2.A03;
                if (r32.A09 == null) {
                    th = AnonymousClass001.A08("performMeasureAndLayout called with unattached root");
                } else if (!r32.A0P.A0G.A0C) {
                    th = AnonymousClass001.A08("performMeasureAndLayout called with unplaced root");
                } else if (!(!r2.A01)) {
                    th = AnonymousClass001.A08("performMeasureAndLayout called during measure layout");
                } else if (r2.A00 != null) {
                    r2.A01 = true;
                    if (!r42.A00.A00.isEmpty()) {
                        if (r32.A07 != null) {
                            if (r32 == r32) {
                                constraints2 = r2.A00;
                                AnonymousClass00C.A0B(constraints2);
                            } else {
                                constraints2 = null;
                            }
                            AnonymousClass6Y0.A06(r32, r2, constraints2);
                        } else {
                            AnonymousClass6Y0.A00(r32, r2);
                        }
                    }
                    if (r32 == r32) {
                        constraints = r2.A00;
                        AnonymousClass00C.A0B(constraints);
                    } else {
                        constraints = null;
                    }
                    AnonymousClass6Y0.A07(r32, r2, constraints);
                    r2.A01 = false;
                }
                throw th;
            }
            C94734ih r43 = this.A0W.A0P.A0G;
            setMeasuredDimension(r43.A01, r43.A00);
            if (this.A0D != null) {
                AnonymousClass000.A16(getAndroidViewsHandler$ui_release(), r43.A00, 1073741824, View.MeasureSpec.makeMeasureSpec(r43.A01, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C137326fx r0;
        if (Build.VERSION.SDK_INT >= 26 && viewStructure != null && (r0 = this.A0O) != null) {
            AnonymousClass6G5.A01(viewStructure, r0);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        AnonymousClass5RW r1;
        if (this.A0M) {
            if (i == 0 || i != 1) {
                r1 = AnonymousClass5RW.Ltr;
            } else {
                r1 = AnonymousClass5RW.Rtl;
            }
            setLayoutDirection(r1);
            ((C137346fz) this.A0R).A02 = r1;
        }
    }

    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        AnonymousClass6W2.A00.A03(longSparseArray, this.A0c);
    }

    public void onWindowFocusChanged(boolean z) {
        boolean A0D2;
        C90474aD.A11(this.A0h.A00, z);
        this.A0L = true;
        super.onWindowFocusChanged(z);
        if (z && this.A08 != (A0D2 = A0D())) {
            this.A08 = A0D2;
            A07(this.A0W);
        }
    }

    public AndroidComposeView(Context context, C005102h r14) {
        super(context);
        C137326fx r0;
        int i;
        int i2;
        AnonymousClass5RW r02;
        AnonymousClass7e2 r03;
        this.A0m = r14;
        this.A04 = AnonymousClass5XZ.A00(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.A00;
        this.A14 = emptySemanticsElement;
        this.A0R = new C137346fz(new AnonymousClass7RX(this));
        C135616cz r4 = new C135616cz(new AnonymousClass5WU(this, 0));
        this.A12 = r4;
        this.A0Q = r4;
        this.A0h = new C138006h7();
        KeyInputElement keyInputElement = new KeyInputElement(new AnonymousClass7RY(this));
        this.A0w = keyInputElement;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(C155567Wo.A00);
        this.A0x = rotaryInputElement;
        this.A0y = new C114355h5();
        C137846gp r2 = new C137846gp(false, C112475dx.A00.addAndGet(1));
        r2.BrB(C94884ix.A00);
        r2.Bqk(this.A04);
        r2.BrI(AnonymousClass5WL.A00(emptySemanticsElement, rotaryInputElement).Bva(((C137346fz) this.A0R).A03).Bva(keyInputElement).Bva(r4.A01));
        this.A0W = r2;
        this.A11 = this;
        this.A0i = new AnonymousClass608(r2);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0c = androidComposeViewAccessibilityDelegateCompat;
        this.A0P = new C114335h3();
        this.A17 = AnonymousClass001.A0I();
        this.A0z = new AnonymousClass64C();
        this.A10 = new C1263063k(this.A0W);
        this.A05 = C155557Wn.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            r0 = new C137326fx(this, this.A0P);
        } else {
            r0 = null;
        }
        this.A0O = r0;
        this.A0b = new C137936gy(context);
        this.A0a = new C137906gv(context);
        this.A0Z = new C1264864f(new AnonymousClass7RZ(this));
        this.A0Y = new AnonymousClass6Y0(this.A0W);
        this.A0g = new AnonymousClass6h6(ViewConfiguration.get(context));
        this.A0B = C90484aE.A0J(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 0;
        A1O[1] = 0;
        this.A1B = A1O;
        float[] A042 = AnonymousClass6VX.A04();
        this.A1A = A042;
        this.A0n = AnonymousClass6VX.A04();
        this.A0o = AnonymousClass6VX.A04();
        this.A00 = -1;
        this.A02 = C133206Xf.A01;
        this.A0K = true;
        C137076fY r8 = C137076fY.A00;
        this.A0s = C93994hT.A00(r8, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0v = new C94014hV((C157587dm) null, new AnonymousClass7JC(this));
        this.A0p = new C164757sK(this, 0);
        this.A0q = new C163387q7(this, 0);
        this.A0r = new C135936dV(this);
        C138126hL r1 = new C138126hL(this, this);
        this.A15 = r1;
        this.A0k = new C118405nq(r1);
        this.A18 = new AtomicReference((Object) null);
        this.A0e = new C137966h1(this.A0k);
        this.A0j = new C138066hD(context);
        AndroidFontLoader androidFontLoader = new AndroidFontLoader(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i = AnonymousClass000.A0U(context).fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.A0t = C93994hT.A00(C137066fX.A00, new FontFamilyResolverImpl(androidFontLoader, new C138076hG(i)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        Configuration A0U2 = AnonymousClass000.A0U(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = A0U2.fontWeightAdjustment;
        } else {
            i2 = 0;
        }
        this.A0A = i2;
        int layoutDirection = AnonymousClass000.A0U(context).getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection != 1) {
            r02 = AnonymousClass5RW.Ltr;
        } else {
            r02 = AnonymousClass5RW.Rtl;
        }
        this.A0u = C93994hT.A00(r8, r02, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0S = new C137526gH(this);
        this.A0T = new C137536gI(new AnonymousClass7RW(this), C36391kE.A00(isInTouchMode() ? 1 : 0));
        this.A0V = new AnonymousClass6NB(this);
        this.A0f = new C137976h2(this);
        this.A13 = new C118365nl();
        this.A0N = C1506776e.A02(new AnonymousClass00S[16]);
        this.A0l = new AnonymousClass759(this, 8);
        this.A16 = new AnonymousClass759(this, 7);
        this.A19 = new AnonymousClass7JB(this);
        if (Build.VERSION.SDK_INT >= 29) {
            r03 = new C137916gw();
        } else {
            r03 = new C137926gx(A042);
        }
        this.A0d = r03;
        setWillNotDraw(false);
        setFocusable(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            AnonymousClass5X6.A00(this);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C012005e.A0V(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(r4);
        this.A0W.A0T(this);
        if (i3 >= 29) {
            AnonymousClass5X4.A00(this);
        }
        this.A0U = new C137556gL(this);
    }

    private final long A02(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                size = Integer.MAX_VALUE;
            } else if (mode == 1073741824) {
                long j = (long) size;
                return j | (j << 32);
            } else {
                throw new IllegalStateException();
            }
        }
        return C90474aD.A0A(0, size);
    }

    private final void A06(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).BWU();
            } else if (childAt instanceof ViewGroup) {
                A06((ViewGroup) childAt);
            }
        }
    }

    private final void A07(C137846gp r5) {
        r5.A0H();
        C1506776e A092 = r5.A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                A07((C137846gp) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r4 == r5.A0W) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.C137846gp r4, androidx.compose.ui.platform.AndroidComposeView r5) {
        /*
            boolean r0 = r5.isLayoutRequested()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x004b
        L_0x000e:
            X.6Et r0 = r4.A0P
            X.4ih r0 = r0.A0G
            java.lang.Integer r1 = r0.A07
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x003c
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0044
            X.6gp r0 = r4.A0A()
            if (r0 == 0) goto L_0x003c
            X.6XQ r0 = r0.A0R
            X.4jW r0 = r0.A06
            long r2 = r0.A04
            int r1 = androidx.compose.ui.unit.Constraints.A01(r2)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r2)
            if (r1 != r0) goto L_0x0044
            int r1 = androidx.compose.ui.unit.Constraints.A00(r2)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r2)
            if (r1 != r0) goto L_0x0044
        L_0x003c:
            X.6gp r0 = r5.A0W
            if (r4 != r0) goto L_0x004b
        L_0x0040:
            r5.requestLayout()
        L_0x0043:
            return
        L_0x0044:
            X.6gp r4 = r4.A0A()
            if (r4 == 0) goto L_0x003c
            goto L_0x000e
        L_0x004b:
            int r0 = r5.getWidth()
            if (r0 == 0) goto L_0x0040
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x0040
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A09(X.6gp, androidx.compose.ui.platform.AndroidComposeView):void");
    }

    public static final /* synthetic */ void A0C(AndroidComposeView androidComposeView, C006302t r3, long j) {
        Resources A0F2 = C36341k9.A0F(androidComposeView);
        new C92284dR(new C138226hV(A0F2.getDisplayMetrics().density, A0F2.getConfiguration().fontScale), r3, j);
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass5X5.A00();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        throw AnonymousClass001.A0A("getClipData");
    }

    private final boolean A0E(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f > x || x > C36441kJ.A01(this) || 0.0f > y || y > C36441kJ.A02(this)) {
            return false;
        }
        return true;
    }

    private final boolean A0F(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A03) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        boolean z = false;
                        int pointerCount = motionEvent.getPointerCount();
                        int i = 1;
                        while (i < pointerCount) {
                            float x2 = motionEvent.getX(i);
                            if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                float y2 = motionEvent.getY(i);
                                if (!Float.isInfinite(y2) && !Float.isNaN(y2) && (Build.VERSION.SDK_INT < 29 || AnonymousClass5X9.A00(motionEvent, i))) {
                                    z = false;
                                    i++;
                                }
                            }
                        }
                        return z;
                    }
                }
            }
        }
        return true;
    }

    public long BOT(long j) {
        A0A(this);
        long A002 = AnonymousClass6VX.A00(this.A0n, j);
        float A003 = C133206Xf.A00(A002);
        long j2 = this.A02;
        return C90464aC.A0B(A003 + C133206Xf.A00(j2), C133206Xf.A01(A002) + C133206Xf.A01(j2));
    }

    public void BfS(AnonymousClass012 r2) {
        this.A08 = A0D();
    }

    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            A07(this.A0W);
        }
        BPk(true);
        AnonymousClass6VV.A04();
        this.A0J = true;
        C137386g3 r2 = this.A0y.A00;
        Canvas canvas2 = r2.A00;
        r2.A00 = canvas;
        this.A0W.A0R.A04.A0V(r2);
        r2.A00 = canvas2;
        List list = this.A17;
        if (C36401kF.A1a(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C160967ls) list.get(i)).Bwe();
            }
        }
        if (C92324da.A0I) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0J = false;
        List list2 = this.A0G;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C94214hq A002;
        if (isFocused() && (A002 = AnonymousClass6U1.A00(((C137346fz) this.A0R).A01)) != null) {
            C137856gq r1 = A002.A03;
            if (r1.A08) {
                C137856gq r8 = r1.A04;
                C137846gp A022 = AnonymousClass6VZ.A02(A002);
                if (A022 != null) {
                    while (true) {
                        if (AnonymousClass6XQ.A00(A022, C132986Wc.A0F) != 0) {
                            while (r8 != null) {
                                if ((r8.A01 & C132986Wc.A0F) != 0) {
                                    C1506776e r4 = null;
                                    C137856gq r3 = r8;
                                    do {
                                        if ((r3.A01 & C132986Wc.A0F) != 0 && (r3 instanceof C94114hf)) {
                                            int i = 0;
                                            for (C137856gq r2 = ((C94114hf) r3).A00; r2 != null; r2 = r2.A02) {
                                                if ((r2.A01 & C132986Wc.A0F) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        r3 = r2;
                                                    } else {
                                                        r4 = C90464aC.A0G(r4);
                                                        r3 = C90524aI.A0D(r4, r3);
                                                        r4.A0D(r2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                                continue;
                                            }
                                        }
                                        r3 = AnonymousClass6VZ.A00(r4);
                                        continue;
                                    } while (r3 != null);
                                }
                                r8 = r8.A04;
                            }
                        }
                        A022 = A022.A0A();
                        if (A022 == null) {
                            break;
                        }
                        AnonymousClass6XQ r0 = A022.A0R;
                        if (r0 != null) {
                            r8 = r0.A05;
                        } else {
                            r8 = null;
                        }
                    }
                }
            } else {
                throw AnonymousClass001.A09("visitAncestors called on an unattached node");
            }
        }
        return AnonymousClass000.A1P(super.dispatchKeyEventPreIme(keyEvent) ? 1 : 0);
    }

    public C137906gv getAccessibilityManager() {
        return this.A0a;
    }

    public AnonymousClass7bP getAutofill() {
        return this.A0O;
    }

    public C114335h3 getAutofillTree() {
        return this.A0P;
    }

    public C137936gy getClipboardManager() {
        return this.A0b;
    }

    public final C006302t getConfigurationChangeObserver() {
        return this.A05;
    }

    public C005102h getCoroutineContext() {
        return this.A0m;
    }

    public C161937ni getDensity() {
        return this.A04;
    }

    public AnonymousClass7bQ getDragAndDropManager() {
        return this.A0Q;
    }

    public C161657nG getFocusOwner() {
        return this.A0R;
    }

    public C157017bh getFontLoader() {
        return this.A0j;
    }

    public AnonymousClass7bU getHapticFeedBack() {
        return this.A0S;
    }

    public AnonymousClass7bV getInputModeManager() {
        return this.A0T;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A00;
    }

    public AnonymousClass6NB getModifierLocalManager() {
        return this.A0V;
    }

    public AnonymousClass7bW getPointerIconService() {
        return this.A0U;
    }

    public C137846gp getRoot() {
        return this.A0W;
    }

    public C156947ba getRootForTest() {
        return this.A11;
    }

    public AnonymousClass608 getSemanticsOwner() {
        return this.A0i;
    }

    public C137506gF getSharedDrawScope() {
        return this.A0X;
    }

    public boolean getShowLayoutBounds() {
        return this.A08;
    }

    public C1264864f getSnapshotObserver() {
        return this.A0Z;
    }

    public C156977bd getSoftwareKeyboardController() {
        return this.A0e;
    }

    public C118405nq getTextInputService() {
        return this.A0k;
    }

    public C156987be getTextToolbar() {
        return this.A0f;
    }

    public View getView() {
        return this;
    }

    public C159887k5 getViewConfiguration() {
        return this.A0g;
    }

    public C157007bg getWindowInfo() {
        return this.A0h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            X.6gp r0 = r4.A0W
            r4.A08(r0)
            r4.A07(r0)
            X.64f r0 = r4.A0Z
            X.6Ll r1 = r0.A00
            X.03v r0 = r1.A09
            X.6fm r0 = X.AnonymousClass6VV.A01(r0)
            r1.A01 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0026
            X.6fx r1 = r4.A0O
            if (r1 == 0) goto L_0x0026
            X.4eB r0 = X.C92564eB.A00
            r0.A00(r1)
        L_0x0026:
            X.012 r3 = X.AnonymousClass0QD.A00(r4)
            X.0m5 r2 = X.C14720m5.A00
            X.0lm r0 = new X.0lm
            r0.<init>(r4)
            X.0ic r1 = new X.0ic
            r1.<init>(r0, r2)
            X.0m6 r0 = X.C14730m6.A00
            X.0ih r0 = X.C15060md.A03(r0, r1)
            X.0hx r1 = new X.0hx
            r1.<init>(r0)
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L_0x00e7
            r2 = 0
        L_0x0048:
            X.017 r2 = (X.AnonymousClass017) r2
            X.5nj r0 = r4.getViewTreeOwners()
            if (r0 == 0) goto L_0x00dc
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            X.012 r0 = r0.A00
            if (r3 != r0) goto L_0x005a
            if (r2 == r0) goto L_0x007c
        L_0x005a:
            X.01M r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0063
            r0.A05(r4)
        L_0x0063:
            X.01M r0 = r3.getLifecycle()
            r0.A04(r4)
            X.5nj r1 = new X.5nj
            r1.<init>(r3, r2)
            r4.set_viewTreeOwners(r1)
            X.02t r0 = r4.A0H
            if (r0 == 0) goto L_0x0079
            r0.invoke(r1)
        L_0x0079:
            r0 = 0
            r4.A0H = r0
        L_0x007c:
            X.6gI r1 = r4.A0T
            boolean r0 = r4.isInTouchMode()
            int r2 = X.C36391kE.A00(r0)
            X.7n5 r1 = r1.A00
            X.68L r0 = new X.68L
            r0.<init>(r2)
            r1.setValue(r0)
            X.5nj r0 = r4.getViewTreeOwners()
            X.AnonymousClass00C.A0B(r0)
            X.012 r0 = r0.A00
            X.01M r0 = r0.getLifecycle()
            r0.A04(r4)
            X.5nj r0 = r4.getViewTreeOwners()
            X.AnonymousClass00C.A0B(r0)
            X.012 r0 = r0.A00
            X.01M r1 = r0.getLifecycle()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r4.A0c
            r1.A04(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r4.A0p
            r1.addOnGlobalLayoutListener(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r4.A0q
            r1.addOnScrollChangedListener(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnTouchModeChangeListener r0 = r4.A0r
            r1.addOnTouchModeChangeListener(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00db
            X.6da r0 = new X.6da
            r0.<init>()
            X.AnonymousClass6G8.A01(r4, r0)
        L_0x00db:
            return
        L_0x00dc:
            if (r3 == 0) goto L_0x00ed
            if (r2 != 0) goto L_0x0063
            java.lang.String r0 = "Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00e7:
            java.lang.Object r2 = r1.next()
            goto L_0x0048
        L_0x00ed:
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow():void");
    }

    public boolean onCheckIsTextEditor() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i;
        int i2;
        super.onConfigurationChanged(configuration);
        this.A04 = AnonymousClass5XZ.A00(getContext());
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.A0A) {
            this.A0A = i;
            Context context = getContext();
            AndroidFontLoader androidFontLoader = new AndroidFontLoader(context);
            if (Build.VERSION.SDK_INT >= 31) {
                i2 = AnonymousClass000.A0U(context).fontWeightAdjustment;
            } else {
                i2 = 0;
            }
            setFontFamilyResolver(new FontFamilyResolverImpl(androidFontLoader, new C138076hG(i2)));
        }
        this.A05.invoke(configuration);
    }

    public void onDetachedFromWindow() {
        C137326fx r1;
        AnonymousClass01M lifecycle;
        AnonymousClass01M lifecycle2;
        super.onDetachedFromWindow();
        C130536Ll r12 = this.A0Z.A00;
        C157617dp r0 = r12.A01;
        if (r0 != null) {
            r0.dispose();
        }
        C1506776e r5 = r12.A05;
        synchronized (r5) {
            int i = r5.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r5.A01;
                do {
                    C130596Lr r13 = (C130596Lr) objArr[i2];
                    r13.A09.A00.A05();
                    r13.A04.A05();
                    r13.A08.A00.A05();
                    r13.A0A.clear();
                    i2++;
                } while (i2 < i);
            }
        }
        C118345nj viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (lifecycle2 = viewTreeOwners.A00.getLifecycle()) == null)) {
            lifecycle2.A05(this);
        }
        C118345nj viewTreeOwners2 = getViewTreeOwners();
        if (!(viewTreeOwners2 == null || (lifecycle = viewTreeOwners2.A00.getLifecycle()) == null)) {
            lifecycle.A05(this.A0c);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && (r1 = this.A0O) != null) {
            C92564eB.A00.A01(r1);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A0p);
        getViewTreeObserver().removeOnScrollChangedListener(this.A0q);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0r);
        if (i3 >= 31) {
            AnonymousClass6G8.A00(this);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Owner FocusChanged(");
        Log.d("Compose Focus", C36321k7.A0H(A0u2, z));
        C137346fz r2 = (C137346fz) this.A0R;
        AnonymousClass6S2 r3 = r2.A05;
        r3.A01.A0D(new AnonymousClass7NY(this, z));
        if (!r3.A00) {
            try {
                r3.A00 = true;
                if (z) {
                    C94214hq r22 = r2.A01;
                    if (r22.A0G() == AnonymousClass5U8.Inactive) {
                        r22.A0J(AnonymousClass5U8.Active);
                    }
                } else {
                    AnonymousClass6XT.A06(r2.A01, true, true);
                }
            } finally {
                AnonymousClass6S2.A01(r3);
            }
        } else if (z) {
            C94214hq r23 = r2.A01;
            if (r23.A0G() == AnonymousClass5U8.Inactive) {
                r23.A0J(AnonymousClass5U8.Active);
            }
        } else {
            AnonymousClass6XT.A06(r2.A01, true, true);
        }
    }

    public final void setOnViewTreeOwnersAvailable(C006302t r2) {
        C118345nj viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            r2.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.A0H = r2;
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    public final void setConfigurationChangeObserver(C006302t r1) {
        this.A05 = r1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.A00 = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.A08 = z;
    }
}
