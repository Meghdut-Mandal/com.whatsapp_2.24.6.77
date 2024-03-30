package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass012;
import X.AnonymousClass03T;
import X.AnonymousClass0AJ;
import X.AnonymousClass0X7;
import X.AnonymousClass5RV;
import X.AnonymousClass5RW;
import X.AnonymousClass5XP;
import X.AnonymousClass62P;
import X.AnonymousClass62Q;
import X.AnonymousClass68P;
import X.AnonymousClass69I;
import X.AnonymousClass6DO;
import X.AnonymousClass6FW;
import X.AnonymousClass6GC;
import X.AnonymousClass6NL;
import X.AnonymousClass6Q1;
import X.AnonymousClass6QC;
import X.AnonymousClass6TT;
import X.AnonymousClass6W2;
import X.AnonymousClass6WP;
import X.AnonymousClass6WV;
import X.AnonymousClass6XD;
import X.AnonymousClass72L;
import X.AnonymousClass759;
import X.C000000a;
import X.C000400e;
import X.C003101g;
import X.C006302t;
import X.C007103b;
import X.C011705b;
import X.C019408g;
import X.C023109s;
import X.C10890fO;
import X.C109315Xc;
import X.C114195gp;
import X.C114205gq;
import X.C114415hD;
import X.C118355nk;
import X.C120705rw;
import X.C123595wl;
import X.C12960iw;
import X.C131346Or;
import X.C131596Pr;
import X.C132986Wc;
import X.C133206Xf;
import X.C135396cd;
import X.C135946dW;
import X.C135956dX;
import X.C137846gp;
import X.C138016h8;
import X.C14960mT;
import X.C1496172a;
import X.C15040mb;
import X.C154137Ra;
import X.C154147Rb;
import X.C157027bi;
import X.C160567lD;
import X.C17940sK;
import X.C18010sR;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C92484e3;
import X.C94894iy;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public final class AndroidComposeViewAccessibilityDelegateCompat extends C011705b implements C003101g {
    public static final int[] A0b = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public int A00;
    public int A01;
    public int A02 = Integer.MIN_VALUE;
    public AccessibilityNodeInfo A03;
    public C000000a A04;
    public C10890fO A05;
    public C10890fO A06;
    public C123595wl A07;
    public C120705rw A08;
    public C131596Pr A09;
    public Integer A0A;
    public Integer A0B;
    public HashMap A0C;
    public HashMap A0D;
    public List A0E;
    public Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public AnonymousClass0X7 A0J;
    public Map A0K;
    public C006302t A0L = new C154137Ra(this);
    public final Handler A0M;
    public final AccessibilityManager.AccessibilityStateChangeListener A0N;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0O;
    public final AccessibilityManager A0P;
    public final AnonymousClass008 A0Q;
    public final C000000a A0R;
    public final C000000a A0S;
    public final AndroidComposeView A0T;
    public final Runnable A0U;
    public final HashMap A0V;
    public final HashMap A0W;
    public final List A0X;
    public final C006302t A0Y;
    public final C114415hD A0Z;
    public final C18010sR A0a;

    private final String A0F(AnonymousClass6WV r6) {
        Object A0M2;
        C1496172a r3 = r6.A05;
        AnonymousClass62Q r2 = C114205gq.A02;
        Map map = r3.A02;
        if (map.containsKey(r2)) {
            return C109315Xc.A00(",", (List) r3.A01(r2));
        }
        if (map.containsKey(C114195gp.A0L)) {
            A0M2 = AnonymousClass5XP.A02(r3, C114205gq.A04);
        } else {
            List list = (List) AnonymousClass5XP.A02(r3, C114205gq.A0M);
            if (list == null) {
                return null;
            }
            A0M2 = C007103b.A0M(list);
        }
        AnonymousClass72L r0 = (AnonymousClass72L) A0M2;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static final void A0N(C120705rw r7, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass6WV r9) {
        List A002 = AnonymousClass6WV.A00(r9, false, true);
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass6WV r2 = (AnonymousClass6WV) A002.get(i);
            if (C90484aE.A1Y(A0H(androidComposeViewAccessibilityDelegateCompat), r2.A02) && !AnonymousClass000.A1Z(r7.A02, r2.A02)) {
                androidComposeViewAccessibilityDelegateCompat.A0S(r2);
            }
        }
        Map map = androidComposeViewAccessibilityDelegateCompat.A0F;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (!A0H(androidComposeViewAccessibilityDelegateCompat).containsKey(A11.getKey())) {
                int A0I2 = AnonymousClass000.A0I(A11.getKey());
                AnonymousClass008 r22 = androidComposeViewAccessibilityDelegateCompat.A0Q;
                Integer valueOf = Integer.valueOf(A0I2);
                if (r22.containsKey(valueOf)) {
                    r22.remove(valueOf);
                } else {
                    androidComposeViewAccessibilityDelegateCompat.A0R.add(valueOf);
                }
            }
        }
        List A003 = AnonymousClass6WV.A00(r9, false, true);
        int size2 = A003.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnonymousClass6WV r23 = (AnonymousClass6WV) A003.get(i2);
            if (C90484aE.A1Y(A0H(androidComposeViewAccessibilityDelegateCompat), r23.A02) && C90484aE.A1Y(map, r23.A02)) {
                Object A0r = C36371kC.A0r(map, r23.A02);
                AnonymousClass00C.A0B(A0r);
                A0N((C120705rw) A0r, androidComposeViewAccessibilityDelegateCompat, r23);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: X.4jY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: X.4ja} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: X.4ja} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: X.4jc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: X.4jb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: X.4jZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: X.4jZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v73, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r6.A0C != X.AnonymousClass5RW.Rtl) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0183, code lost:
        if (r15 != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0185, code lost:
        if (r14 == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0187, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018c, code lost:
        if (A0Y(r2, r3) == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018e, code lost:
        r2 = (X.C009003v) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0192, code lost:
        if (r2 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0194, code lost:
        r1 = java.lang.Float.valueOf(r3);
        r0 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019e, code lost:
        r3 = r1.BHd();
        r3 = new X.AnonymousClass6QC(0.0f, 0.0f, (float) X.C90494aF.A08(r3), (float) X.C90474aD.A03(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b3, code lost:
        r1 = (X.AnonymousClass62P) X.AnonymousClass5XP.A02(r8, X.C114205gq.A0R);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01bb, code lost:
        if (r1 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bd, code lost:
        if (r11 == false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bf, code lost:
        r3 = X.AnonymousClass6X0.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c3, code lost:
        if (r13 != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c5, code lost:
        if (r16 == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c7, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ca, code lost:
        if (r1.A02 == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01cc, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d1, code lost:
        if (A0Y(r1, r3) == false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01d3, code lost:
        r2 = (X.C009003v) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d7, code lost:
        if (r2 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d9, code lost:
        r1 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ae, code lost:
        r0 = java.lang.Float.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b2, code lost:
        r0 = r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02ff, code lost:
        r0 = r1.invoke(java.lang.Float.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03b9, code lost:
        if (r0 == false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0529, code lost:
        if (r7 != false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0531, code lost:
        if (r7 != false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0538, code lost:
        if (r7 != false) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        r3 = false;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r2 == 8192) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        r16 = false;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r2 == 16908345) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        if (r2 == 16908347) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        r14 = false;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r2 == 16908344) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        r13 = false;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (r2 == 16908346) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ce, code lost:
        if (r15 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        if (r14 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        if (r3 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d5, code lost:
        if (r16 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d8, code lost:
        if (r13 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r0 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        if (r3 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00de, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00df, code lost:
        if (r16 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e1, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e2, code lost:
        if (r3 != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e4, code lost:
        if (r16 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e6, code lost:
        r2 = r5.A05;
        r1 = (X.C131346Or) X.AnonymousClass5XP.A02(r2, X.C114205gq.A0G);
        r6 = X.AnonymousClass5XP.A00(r2, X.C114195gp.A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        if (r1 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f8, code lost:
        if (r6 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fa, code lost:
        r4 = r1.A00;
        r3 = X.C36441kJ.A03(r4.BBY());
        r1 = X.C36441kJ.A03(r4.BHr());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010e, code lost:
        if (r3 >= r1) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0110, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0111, code lost:
        r2 = X.C36441kJ.A03(r4.BHr());
        r1 = X.C36441kJ.A03(r4.BBY());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0123, code lost:
        if (r2 <= r1) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0125, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0126, code lost:
        r3 = (r3 - r2) / ((float) 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012b, code lost:
        if (r16 == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012d, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012e, code lost:
        r1 = (X.C006302t) r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0132, code lost:
        if (r1 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0134, code lost:
        r0 = 0.0f + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0138, code lost:
        r6 = r5.A04;
        r1 = r6.A0R.A06;
        r0 = r1.BF7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0142, code lost:
        if (r0 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0144, code lost:
        r3 = r0.BOQ(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0148, code lost:
        r9 = X.C90464aC.A0B(r3.A02 - r3.A01, r3.A00 - r3.A03);
        r0 = X.AnonymousClass6X0.A02;
        r8 = r5.A05;
        r5 = X.AnonymousClass5XP.A00(r8, X.C114195gp.A0H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0160, code lost:
        if (r5 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0162, code lost:
        r2 = (X.AnonymousClass62P) X.AnonymousClass5XP.A02(r8, X.C114205gq.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016b, code lost:
        if (r2 == null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        if (r12 == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016f, code lost:
        r3 = X.AnonymousClass6X0.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0173, code lost:
        if (r15 != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0175, code lost:
        if (r16 == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0177, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        if (r2.A02 == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017c, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0V(android.os.Bundle r13, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r14, int r15, int r16) {
        /*
            r6 = r14
            java.util.Map r0 = A0H(r14)
            java.lang.Object r0 = X.C36371kC.A0r(r0, r15)
            X.5nk r0 = (X.C118355nk) r0
            r7 = 0
            if (r0 == 0) goto L_0x0540
            X.6WV r5 = r0.A01
            r0 = 64
            r2 = r16
            if (r2 == r0) goto L_0x03ac
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x03d9
            r1 = 256(0x100, float:3.59E-43)
            r4 = 1
            if (r2 == r1) goto L_0x03f1
            r0 = 512(0x200, float:7.175E-43)
            if (r2 == r0) goto L_0x03f1
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r0) goto L_0x038e
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r2 == r0) goto L_0x036b
            boolean r0 = X.AnonymousClass6XD.A04(r5)
            if (r0 == 0) goto L_0x0540
            if (r2 == r4) goto L_0x0366
            r0 = 2
            r1 = 0
            if (r2 == r0) goto L_0x034d
            switch(r16) {
                case 16: goto L_0x0309;
                case 32: goto L_0x032a;
                case 4096: goto L_0x00af;
                case 8192: goto L_0x00a7;
                case 32768: goto L_0x032f;
                case 65536: goto L_0x0334;
                case 262144: goto L_0x0339;
                case 524288: goto L_0x033e;
                case 1048576: goto L_0x0343;
                case 2097152: goto L_0x007e;
                case 16908342: goto L_0x01df;
                case 16908349: goto L_0x02e1;
                case 16908372: goto L_0x0348;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r16) {
                case 16908344: goto L_0x00a7;
                case 16908345: goto L_0x00a7;
                case 16908346: goto L_0x00a7;
                case 16908347: goto L_0x00a7;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r16) {
                case 16908358: goto L_0x006c;
                case 16908359: goto L_0x0072;
                case 16908360: goto L_0x0078;
                case 16908361: goto L_0x0393;
                default: goto L_0x0040;
            }
        L_0x0040:
            X.0fO r0 = r14.A05
            java.lang.Object r0 = X.C06840Vh.A00(r0, r15)
            X.0fO r0 = (X.C10890fO) r0
            if (r0 == 0) goto L_0x0540
            java.lang.Object r0 = X.C06840Vh.A00(r0, r2)
            if (r0 == 0) goto L_0x0540
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A03
            java.lang.Object r1 = X.AnonymousClass5XP.A02(r1, r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0540
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x0540
            r1.get(r7)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x006c:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0E
            goto L_0x0397
        L_0x0072:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0B
            goto L_0x0397
        L_0x0078:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0C
            goto L_0x0397
        L_0x007e:
            if (r13 == 0) goto L_0x0086
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r1 = r13.getString(r0)
        L_0x0086:
            X.72a r2 = r5.A05
            X.62Q r0 = X.C114195gp.A0L
            X.69I r0 = X.AnonymousClass5XP.A00(r2, r0)
            if (r0 == 0) goto L_0x0540
            X.00P r3 = r0.A01
            X.02t r3 = (X.C006302t) r3
            if (r3 == 0) goto L_0x0540
            if (r1 != 0) goto L_0x009a
            java.lang.String r1 = ""
        L_0x009a:
            X.09w r2 = X.C023409w.A00
            X.72L r0 = new X.72L
            r0.<init>(r1, r2, r2)
            java.lang.Object r0 = r3.invoke(r0)
            goto L_0x03a7
        L_0x00a7:
            r3 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            r16 = 1
            if (r2 == r0) goto L_0x00b8
            goto L_0x00b0
        L_0x00af:
            r3 = 1
        L_0x00b0:
            r16 = 0
            r0 = 16908345(0x1020039, float:2.387739E-38)
            r15 = 1
            if (r2 == r0) goto L_0x00bf
        L_0x00b8:
            r15 = 0
            r0 = 16908347(0x102003b, float:2.3877394E-38)
            r14 = 1
            if (r2 == r0) goto L_0x00c6
        L_0x00bf:
            r14 = 0
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            r13 = 1
            if (r2 == r0) goto L_0x00cd
        L_0x00c6:
            r13 = 0
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            r0 = 1
            if (r2 == r1) goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            if (r15 != 0) goto L_0x00d7
            if (r14 != 0) goto L_0x00d7
            if (r3 != 0) goto L_0x00d7
            r12 = 0
            if (r16 == 0) goto L_0x00d8
        L_0x00d7:
            r12 = 1
        L_0x00d8:
            if (r13 != 0) goto L_0x00e1
            if (r0 != 0) goto L_0x00e1
            if (r3 != 0) goto L_0x00e1
            r11 = 0
            if (r16 == 0) goto L_0x0138
        L_0x00e1:
            r11 = 1
            if (r3 != 0) goto L_0x00e6
            if (r16 == 0) goto L_0x0138
        L_0x00e6:
            X.72a r2 = r5.A05
            X.62Q r0 = X.C114205gq.A0G
            java.lang.Object r1 = X.AnonymousClass5XP.A02(r2, r0)
            X.6Or r1 = (X.C131346Or) r1
            X.62Q r0 = X.C114195gp.A0J
            X.69I r6 = X.AnonymousClass5XP.A00(r2, r0)
            if (r1 == 0) goto L_0x0138
            if (r6 == 0) goto L_0x0138
            X.0sK r4 = r1.A00
            java.lang.Comparable r0 = r4.BBY()
            float r3 = X.C36441kJ.A03(r0)
            java.lang.Comparable r0 = r4.BHr()
            float r1 = X.C36441kJ.A03(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0111
            r3 = r1
        L_0x0111:
            java.lang.Comparable r0 = r4.BHr()
            float r2 = X.C36441kJ.A03(r0)
            java.lang.Comparable r0 = r4.BBY()
            float r1 = X.C36441kJ.A03(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            r2 = r1
        L_0x0126:
            float r3 = r3 - r2
            r0 = 20
            float r0 = (float) r0
            float r3 = r3 / r0
            if (r16 == 0) goto L_0x012e
            float r3 = -r3
        L_0x012e:
            X.00P r1 = r6.A01
            X.02t r1 = (X.C006302t) r1
            if (r1 == 0) goto L_0x0540
            r0 = 0
            float r0 = r0 + r3
            goto L_0x02ff
        L_0x0138:
            X.6gp r6 = r5.A04
            X.6XQ r0 = r6.A0R
            X.4jW r1 = r0.A06
            X.7la r0 = r1.BF7()
            if (r0 == 0) goto L_0x019e
            X.6QC r3 = r0.BOQ(r1, r4)
        L_0x0148:
            float r2 = r3.A02
            float r0 = r3.A01
            float r2 = r2 - r0
            float r1 = r3.A00
            float r0 = r3.A03
            float r1 = r1 - r0
            long r9 = X.C90464aC.A0B(r2, r1)
            long r0 = X.AnonymousClass6X0.A02
            X.72a r8 = r5.A05
            X.62Q r0 = X.C114195gp.A0H
            X.69I r5 = X.AnonymousClass5XP.A00(r8, r0)
            if (r5 == 0) goto L_0x0540
            X.62Q r0 = X.C114205gq.A08
            java.lang.Object r2 = X.AnonymousClass5XP.A02(r8, r0)
            X.62P r2 = (X.AnonymousClass62P) r2
            r4 = 0
            if (r2 == 0) goto L_0x01b3
            if (r12 == 0) goto L_0x01b3
            float r3 = X.AnonymousClass6X0.A01(r9)
            if (r15 != 0) goto L_0x0177
            if (r16 == 0) goto L_0x0178
        L_0x0177:
            float r3 = -r3
        L_0x0178:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x017d
            float r3 = -r3
        L_0x017d:
            X.5RW r1 = r6.A0C
            X.5RW r0 = X.AnonymousClass5RW.Rtl
            if (r1 != r0) goto L_0x0188
            if (r15 != 0) goto L_0x0187
            if (r14 == 0) goto L_0x0188
        L_0x0187:
            float r3 = -r3
        L_0x0188:
            boolean r0 = A0Y(r2, r3)
            if (r0 == 0) goto L_0x01b3
            X.00P r2 = r5.A01
            X.03v r2 = (X.C009003v) r2
            if (r2 == 0) goto L_0x0540
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            goto L_0x02b2
        L_0x019e:
            long r3 = r1.BHd()
            int r0 = X.C90494aF.A08(r3)
            float r2 = (float) r0
            int r0 = X.C90474aD.A03(r3)
            float r1 = (float) r0
            r0 = 0
            X.6QC r3 = new X.6QC
            r3.<init>(r0, r0, r2, r1)
            goto L_0x0148
        L_0x01b3:
            X.62Q r0 = X.C114205gq.A0R
            java.lang.Object r1 = X.AnonymousClass5XP.A02(r8, r0)
            X.62P r1 = (X.AnonymousClass62P) r1
            if (r1 == 0) goto L_0x0540
            if (r11 == 0) goto L_0x0540
            float r3 = X.AnonymousClass6X0.A00(r9)
            if (r13 != 0) goto L_0x01c7
            if (r16 == 0) goto L_0x01c8
        L_0x01c7:
            float r3 = -r3
        L_0x01c8:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01cd
            float r3 = -r3
        L_0x01cd:
            boolean r0 = A0Y(r1, r3)
            if (r0 == 0) goto L_0x0540
            X.00P r2 = r5.A01
            X.03v r2 = (X.C009003v) r2
            if (r2 == 0) goto L_0x0540
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            goto L_0x02ae
        L_0x01df:
            X.6WV r8 = r5.A08()
        L_0x01e3:
            if (r8 == 0) goto L_0x0540
            X.72a r1 = r8.A07()
            if (r1 == 0) goto L_0x02db
            X.62Q r0 = X.C114195gp.A0H
            X.69I r6 = X.AnonymousClass5XP.A00(r1, r0)
            if (r6 == 0) goto L_0x02db
            X.6gp r0 = r8.A04
            X.6XQ r0 = r0.A0R
            X.4jW r3 = r0.A06
            X.7la r0 = r3.BF7()
            if (r0 == 0) goto L_0x02c5
            X.6QC r9 = r0.BOQ(r3, r4)
        L_0x0203:
            X.7la r0 = r3.BF7()
            if (r0 == 0) goto L_0x02c0
            long r2 = X.C133206Xf.A03
            long r0 = r0.BOS(r2)
        L_0x020f:
            X.6QC r10 = r9.A02(r0)
            X.4iy r1 = r5.A06()
            if (r1 == 0) goto L_0x0225
            X.6gq r0 = r1.A0M()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0225
            long r2 = r1.BOS(r2)
        L_0x0225:
            X.4iy r0 = r5.A06()
            if (r0 == 0) goto L_0x02bc
            long r0 = r0.A03
        L_0x022d:
            long r0 = X.AnonymousClass6GI.A02(r0)
            X.6QC r2 = X.AnonymousClass5WT.A00(r2, r0)
            X.72a r1 = r8.A05
            X.62Q r0 = X.C114205gq.A08
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r1, r0)
            X.62P r11 = (X.AnonymousClass62P) r11
            X.62Q r0 = X.C114205gq.A0R
            java.lang.Object r9 = X.AnonymousClass5XP.A02(r1, r0)
            X.62P r9 = (X.AnonymousClass62P) r9
            float r8 = r2.A01
            float r0 = r10.A01
            float r8 = r8 - r0
            float r3 = r2.A02
            float r0 = r10.A02
            float r3 = r3 - r0
            float r1 = java.lang.Math.signum(r8)
            float r0 = java.lang.Math.signum(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02ba
            float r1 = java.lang.Math.abs(r8)
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x026a
            r8 = r3
        L_0x026a:
            if (r11 == 0) goto L_0x0271
            boolean r0 = r11.A02
            if (r0 != r4) goto L_0x0271
            float r8 = -r8
        L_0x0271:
            X.6gp r0 = r5.A04
            X.5RW r1 = r0.A0C
            X.5RW r0 = X.AnonymousClass5RW.Rtl
            if (r1 != r0) goto L_0x027a
            float r8 = -r8
        L_0x027a:
            float r3 = r2.A03
            float r0 = r10.A03
            float r3 = r3 - r0
            float r2 = r2.A00
            float r0 = r10.A00
            float r2 = r2 - r0
            float r1 = java.lang.Math.signum(r3)
            float r0 = java.lang.Math.signum(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02b8
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x029d
            r3 = r2
        L_0x029d:
            if (r9 == 0) goto L_0x02a4
            boolean r0 = r9.A02
            if (r0 != r4) goto L_0x02a4
            float r3 = -r3
        L_0x02a4:
            X.00P r2 = r6.A01
            X.03v r2 = (X.C009003v) r2
            if (r2 == 0) goto L_0x0540
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
        L_0x02ae:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
        L_0x02b2:
            java.lang.Object r0 = r2.invoke(r1, r0)
            goto L_0x03a7
        L_0x02b8:
            r3 = 0
            goto L_0x029d
        L_0x02ba:
            r8 = 0
            goto L_0x026a
        L_0x02bc:
            r0 = 0
            goto L_0x022d
        L_0x02c0:
            long r0 = X.C133206Xf.A03
            r2 = r0
            goto L_0x020f
        L_0x02c5:
            long r9 = r3.BHd()
            int r0 = X.C90494aF.A08(r9)
            float r2 = (float) r0
            int r0 = X.C90474aD.A03(r9)
            float r1 = (float) r0
            r0 = 0
            X.6QC r9 = new X.6QC
            r9.<init>(r0, r0, r2, r1)
            goto L_0x0203
        L_0x02db:
            X.6WV r8 = r8.A08()
            goto L_0x01e3
        L_0x02e1:
            if (r13 == 0) goto L_0x0540
            java.lang.String r2 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r0 = r13.containsKey(r2)
            if (r0 == 0) goto L_0x0540
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0J
            X.69I r0 = X.AnonymousClass5XP.A00(r1, r0)
            if (r0 == 0) goto L_0x0540
            X.00P r1 = r0.A01
            X.02t r1 = (X.C006302t) r1
            if (r1 == 0) goto L_0x0540
            float r0 = r13.getFloat(r2)
        L_0x02ff:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            goto L_0x03a7
        L_0x0309:
            X.72a r2 = r5.A05
            X.62Q r0 = X.C114195gp.A08
            X.69I r0 = X.AnonymousClass5XP.A00(r2, r0)
            if (r0 == 0) goto L_0x031f
            X.00P r0 = r0.A01
            X.00S r0 = (X.AnonymousClass00S) r0
            if (r0 == 0) goto L_0x031f
            java.lang.Object r1 = r0.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x031f:
            r0 = 0
            A0P(r14, r0, r0, r15, r4)
            if (r1 == 0) goto L_0x0540
            boolean r7 = r1.booleanValue()
            return r7
        L_0x032a:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0A
            goto L_0x0397
        L_0x032f:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0F
            goto L_0x0397
        L_0x0334:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A04
            goto L_0x0397
        L_0x0339:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A06
            goto L_0x0397
        L_0x033e:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A01
            goto L_0x0397
        L_0x0343:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A05
            goto L_0x0397
        L_0x0348:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A09
            goto L_0x0397
        L_0x034d:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114205gq.A06
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r1, r0)
            boolean r0 = X.C36371kC.A1X(r0, r4)
            if (r0 == 0) goto L_0x0540
            androidx.compose.ui.platform.AndroidComposeView r0 = r14.A0T
            X.7nG r0 = r0.A0R
            X.6fz r0 = (X.C137346fz) r0
            r0.B2p(r7, r4)
            r7 = 1
            return r7
        L_0x0366:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0G
            goto L_0x0397
        L_0x036b:
            r2 = -1
            if (r13 == 0) goto L_0x038c
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r1 = r13.getInt(r0, r2)
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r2 = r13.getInt(r0, r2)
        L_0x037a:
            boolean r7 = r14.A0b(r5, r1, r2, r7)
            if (r7 == 0) goto L_0x0540
            int r0 = r5.A02
            int r2 = A02(r14, r0)
            r1 = 0
            r0 = 0
            A0P(r14, r1, r1, r2, r0)
            return r7
        L_0x038c:
            r1 = -1
            goto L_0x037a
        L_0x038e:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A02
            goto L_0x0397
        L_0x0393:
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114195gp.A0D
        L_0x0397:
            X.69I r0 = X.AnonymousClass5XP.A00(r1, r0)
            if (r0 == 0) goto L_0x0540
            X.00P r0 = r0.A01
            X.00S r0 = (X.AnonymousClass00S) r0
            if (r0 == 0) goto L_0x0540
            java.lang.Object r0 = r0.invoke()
        L_0x03a7:
            boolean r7 = X.AnonymousClass000.A1X(r0)
            return r7
        L_0x03ac:
            android.view.accessibility.AccessibilityManager r1 = r14.A0P
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x03bb
            boolean r0 = r1.isTouchExplorationEnabled()
            r1 = 1
            if (r0 != 0) goto L_0x03bc
        L_0x03bb:
            r1 = 0
        L_0x03bc:
            r0 = 0
            if (r1 == 0) goto L_0x03f0
            int r2 = r14.A01
            if (r2 == r15) goto L_0x03f0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x03cd
            r1 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            A0P(r14, r1, r1, r2, r0)
        L_0x03cd:
            r14.A01 = r15
            androidx.compose.ui.platform.AndroidComposeView r0 = r14.A0T
            r0.invalidate()
            r1 = 0
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x03ec
        L_0x03d9:
            int r0 = r14.A01
            if (r0 != r15) goto L_0x0440
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r14.A01 = r0
            r0 = 0
            r14.A03 = r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r14.A0T
            r0.invalidate()
            r1 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x03ec:
            A0P(r14, r1, r1, r15, r0)
        L_0x03ef:
            r0 = 1
        L_0x03f0:
            return r0
        L_0x03f1:
            if (r13 == 0) goto L_0x0540
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r3 = r13.getInt(r0)
            java.lang.String r0 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r12 = r13.getBoolean(r0)
            if (r2 != r1) goto L_0x0402
            r7 = 1
        L_0x0402:
            int r1 = r5.A02
            java.lang.Integer r0 = r14.A0A
            r8 = -1
            if (r0 == 0) goto L_0x040f
            int r0 = r0.intValue()
            if (r1 == r0) goto L_0x0417
        L_0x040f:
            r14.A00 = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r14.A0A = r0
        L_0x0417:
            java.lang.String r0 = r14.A0F(r5)
            r11 = 0
            if (r0 == 0) goto L_0x0440
            int r10 = r0.length()
            if (r10 == 0) goto L_0x0440
            java.lang.String r1 = r14.A0F(r5)
            if (r1 == 0) goto L_0x0440
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0440
            if (r3 == r4) goto L_0x048e
            r0 = 2
            if (r3 == r0) goto L_0x0476
            r9 = 4
            if (r3 == r9) goto L_0x0442
            r0 = 8
            if (r3 == r0) goto L_0x04a6
            r0 = 16
            if (r3 == r0) goto L_0x0442
        L_0x0440:
            r0 = 0
            return r0
        L_0x0442:
            X.72a r2 = r5.A05
            X.62Q r0 = X.C114195gp.A07
            boolean r0 = X.C1496172a.A00(r2, r0)
            if (r0 == 0) goto L_0x0440
            X.6FW r0 = A0C(r2)
            if (r0 == 0) goto L_0x0440
            if (r3 != r9) goto L_0x0464
            X.4jb r2 = X.C94984jb.A01
            if (r2 != 0) goto L_0x045f
            X.4jb r2 = new X.4jb
            r2.<init>()
            X.C94984jb.A01 = r2
        L_0x045f:
            r2.A00 = r1
            r2.A00 = r0
            goto L_0x04df
        L_0x0464:
            X.4jc r2 = X.C94994jc.A03
            if (r2 != 0) goto L_0x046f
            X.4jc r2 = new X.4jc
            r2.<init>()
            X.C94994jc.A03 = r2
        L_0x046f:
            r2.A00 = r1
            r2.A01 = r0
            r2.A00 = r5
            goto L_0x04df
        L_0x0476:
            androidx.compose.ui.platform.AndroidComposeView r0 = r14.A0T
            android.content.res.Resources r0 = X.C36341k9.A0F(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            X.4ja r2 = X.C94974ja.A01
            if (r2 != 0) goto L_0x04b1
            X.4ja r2 = new X.4ja
            r2.<init>(r0)
            X.C94974ja.A01 = r2
            goto L_0x04b1
        L_0x048e:
            androidx.compose.ui.platform.AndroidComposeView r0 = r14.A0T
            android.content.res.Resources r0 = X.C36341k9.A0F(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            X.4jY r2 = X.C94954jY.A01
            if (r2 != 0) goto L_0x04b1
            X.4jY r2 = new X.4jY
            r2.<init>(r0)
            X.C94954jY.A01 = r2
            goto L_0x04b1
        L_0x04a6:
            X.4jZ r2 = X.C94964jZ.A00
            if (r2 != 0) goto L_0x04b1
            X.4jZ r2 = new X.4jZ
            r2.<init>()
            X.C94964jZ.A00 = r2
        L_0x04b1:
            boolean r0 = r2 instanceof X.C94974ja
            if (r0 == 0) goto L_0x04c5
            r0 = r2
            X.4ja r0 = (X.C94974ja) r0
            r0.A00 = r1
            java.text.BreakIterator r0 = r0.A00
            if (r0 != 0) goto L_0x04dc
            java.lang.String r0 = "impl"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04c5:
            boolean r0 = r2 instanceof X.C94954jY
            if (r0 == 0) goto L_0x04d9
            r0 = r2
            X.4jY r0 = (X.C94954jY) r0
            r0.A00 = r1
            java.text.BreakIterator r0 = r0.A00
            if (r0 != 0) goto L_0x04dc
            java.lang.String r0 = "impl"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04d9:
            r2.A00 = r1
            goto L_0x04df
        L_0x04dc:
            r0.setText(r1)
        L_0x04df:
            int r0 = r14.A03(r5)
            if (r0 != r8) goto L_0x0538
            r0 = r10
            if (r7 == 0) goto L_0x053b
            r0 = 0
        L_0x04e9:
            int[] r0 = r2.B7W(r0)
        L_0x04ed:
            if (r0 == 0) goto L_0x0440
            r13 = r0[r11]
            r14 = r0[r4]
            if (r12 == 0) goto L_0x052c
            X.72a r1 = r5.A05
            X.62Q r0 = X.C114205gq.A02
            java.util.Map r1 = r1.A02
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x052c
            X.62Q r0 = X.C114205gq.A04
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x052c
            int r2 = r6.A04(r5)
            if (r2 != r8) goto L_0x0529
            r2 = r14
            if (r7 == 0) goto L_0x0534
            r2 = r13
        L_0x0513:
            r1 = r14
        L_0x0514:
            r11 = 256(0x100, float:3.59E-43)
        L_0x0516:
            long r15 = android.os.SystemClock.uptimeMillis()
            X.5wl r0 = new X.5wl
            r9 = r0
            r10 = r5
            r12 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r6.A07 = r0
            r6.A0b(r5, r2, r1, r4)
            goto L_0x03ef
        L_0x0529:
            if (r7 == 0) goto L_0x0534
            goto L_0x0513
        L_0x052c:
            r2 = r13
            if (r7 == 0) goto L_0x0530
            r2 = r14
        L_0x0530:
            r1 = r2
            if (r7 == 0) goto L_0x0535
            goto L_0x0514
        L_0x0534:
            r1 = r13
        L_0x0535:
            r11 = 512(0x200, float:7.175E-43)
            goto L_0x0516
        L_0x0538:
            if (r7 == 0) goto L_0x053b
            goto L_0x04e9
        L_0x053b:
            int[] r0 = r2.Bm1(r0)
            goto L_0x04ed
        L_0x0540:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0V(android.os.Bundle, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int, int):boolean");
    }

    public static final boolean A0Y(AnonymousClass62P r2, float f) {
        if (f < 0.0f && C90464aC.A03(r2.A01) > 0.0f) {
            return true;
        }
        if (f <= 0.0f || C90464aC.A03(r2.A01) >= C90464aC.A03(r2.A00)) {
            return false;
        }
        return true;
    }

    public final boolean A0o() {
        return this.A0P.isEnabled() && C36401kF.A1a(this.A0E);
    }

    public /* synthetic */ void BVQ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BcJ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BfS(AnonymousClass012 r1) {
    }

    public static final int A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0T.A0i.A00().A02) {
            return -1;
        }
        return i;
    }

    private final int A03(AnonymousClass6WV r5) {
        C1496172a r3 = r5.A05;
        AnonymousClass62Q r0 = C114205gq.A02;
        Map map = r3.A02;
        if (!map.containsKey(r0)) {
            AnonymousClass62Q r1 = C114205gq.A0N;
            if (map.containsKey(r1)) {
                return C90474aD.A03(((AnonymousClass6TT) r3.A01(r1)).A00);
            }
        }
        return this.A00;
    }

    private final int A04(AnonymousClass6WV r5) {
        C1496172a r3 = r5.A05;
        AnonymousClass62Q r0 = C114205gq.A02;
        Map map = r3.A02;
        if (!map.containsKey(r0)) {
            AnonymousClass62Q r1 = C114205gq.A0N;
            if (map.containsKey(r1)) {
                return C90494aF.A08(((AnonymousClass6TT) r3.A01(r1)).A00);
            }
        }
        return this.A00;
    }

    public static final Rect A05(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C118355nk r8) {
        Rect rect = r8.A00;
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0T;
        long A0B2 = C90464aC.A0B((float) rect.left, (float) rect.top);
        long j = C133206Xf.A03;
        long BOT = androidComposeView.BOT(A0B2);
        long BOT2 = androidComposeView.BOT(C90464aC.A0B((float) rect.right, (float) rect.bottom));
        return new Rect((int) ((float) Math.floor((double) C133206Xf.A00(BOT))), (int) ((float) Math.floor((double) C133206Xf.A01(BOT))), C90514aH.A04(C133206Xf.A00(BOT2)), C90514aH.A04(C133206Xf.A01(BOT2)));
    }

    private final SpannableString A06(AnonymousClass6WV r9) {
        SpannableString spannableString;
        AnonymousClass72L r2;
        AndroidComposeView androidComposeView = this.A0T;
        C157027bi fontFamilyResolver = androidComposeView.getFontFamilyResolver();
        C1496172a r5 = r9.A05;
        AnonymousClass72L r22 = (AnonymousClass72L) AnonymousClass5XP.A02(r5, C114205gq.A04);
        SpannableString spannableString2 = null;
        if (r22 != null) {
            spannableString = A07(r22, fontFamilyResolver, this.A0Z, androidComposeView.A04);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) A0D(spannableString);
        List list = (List) AnonymousClass5XP.A02(r5, C114205gq.A0M);
        if (!(list == null || (r2 = (AnonymousClass72L) C007103b.A0M(list)) == null)) {
            spannableString2 = A07(r2, fontFamilyResolver, this.A0Z, androidComposeView.A04);
        }
        SpannableString spannableString4 = (SpannableString) A0D(spannableString2);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString A07(X.AnonymousClass72L r43, X.C157027bi r44, X.C114415hD r45, X.C161937ni r46) {
        /*
            r8 = r43
            java.lang.String r0 = r8.A00
            android.text.SpannableString r7 = X.C36441kJ.A0O(r0)
            java.util.List r6 = r8.A03
            r5 = 0
            if (r6 == 0) goto L_0x0170
            int r22 = r6.size()
            r4 = 0
        L_0x0012:
            r0 = r22
            if (r4 >= r0) goto L_0x0170
            java.lang.Object r0 = r6.get(r4)
            X.6Bu r0 = (X.C128326Bu) r0
            java.lang.Object r13 = r0.A02
            X.6FJ r13 = (X.AnonymousClass6FJ) r13
            int r3 = r0.A01
            int r2 = r0.A00
            r26 = 0
            X.7mU r12 = r13.A0C
            long r20 = r12.B9t()
            long r14 = r13.A01
            X.72W r0 = r13.A08
            r29 = r0
            X.68R r0 = r13.A06
            r43 = r0
            X.68S r0 = r13.A07
            r42 = r0
            java.lang.String r0 = r13.A0E
            r35 = r0
            long r10 = r13.A02
            X.68U r0 = r13.A0A
            r28 = r0
            X.6TV r0 = r13.A0D
            r27 = r0
            X.75Q r0 = r13.A09
            r25 = r0
            long r0 = r13.A00
            X.6Ot r9 = r13.A0B
            r23 = r9
            X.6PD r9 = r13.A03
            r24 = r9
            X.5Wf r13 = r13.A04
            long r18 = r12.B9t()
            long r16 = X.C133336Xx.A01
            int r9 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x0066
            X.7mU r12 = X.AnonymousClass6RG.A00(r20)
        L_0x0066:
            X.6FJ r9 = new X.6FJ
            r30 = r25
            r31 = r28
            r32 = r23
            r33 = r12
            r34 = r27
            r36 = r14
            r38 = r10
            r40 = r0
            r23 = r9
            r25 = r13
            r27 = r43
            r28 = r42
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
            X.7mU r0 = r9.A0C
            long r0 = r0.B9t()
            X.AnonymousClass6QX.A00(r7, r3, r2, r0)
            long r0 = r9.A01
            r11 = r46
            r10 = r7
            r12 = r3
            r13 = r2
            r14 = r0
            X.AnonymousClass6QX.A02(r10, r11, r12, r13, r14)
            X.72W r1 = r9.A08
            r10 = 33
            if (r1 != 0) goto L_0x00a3
            X.68R r0 = r9.A06
            if (r0 == 0) goto L_0x00b5
            X.72W r1 = X.AnonymousClass72W.A03
        L_0x00a3:
            X.68R r0 = r9.A06
            if (r0 == 0) goto L_0x016d
            int r0 = r0.A00
        L_0x00a9:
            int r1 = X.AnonymousClass5XW.A00(r1, r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7.setSpan(r0, r3, r2, r10)
        L_0x00b5:
            X.6Im r12 = r9.A05
            if (r12 == 0) goto L_0x00c7
            boolean r0 = r12 instanceof X.C95074jk
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = "sans-serif"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
        L_0x00c4:
            r7.setSpan(r0, r3, r2, r10)
        L_0x00c7:
            X.6Ot r0 = r9.A0B
            if (r0 == 0) goto L_0x00e5
            int r1 = r0.A00
            r0 = 1
            r0 = r0 | r1
            if (r0 != r1) goto L_0x00d9
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r7.setSpan(r0, r3, r2, r10)
        L_0x00d9:
            r0 = 2
            r0 = r0 | r1
            if (r0 != r1) goto L_0x00e5
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r7.setSpan(r0, r3, r2, r10)
        L_0x00e5:
            X.6TV r0 = r9.A0D
            if (r0 == 0) goto L_0x00f3
            float r1 = r0.A00
            android.text.style.ScaleXSpan r0 = new android.text.style.ScaleXSpan
            r0.<init>(r1)
            r7.setSpan(r0, r3, r2, r10)
        L_0x00f3:
            X.75Q r0 = r9.A09
            X.AnonymousClass6QX.A01(r7, r0, r3, r2)
            long r0 = r9.A00
            long r11 = X.C133336Xx.A05
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0112
            X.4iQ r9 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r9, r0)
            int r1 = X.C90514aH.A0D(r0)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            r7.setSpan(r0, r3, r2, r10)
        L_0x0112:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0116:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00c7
            X.68S r0 = r9.A07
            if (r0 == 0) goto L_0x016b
            int r14 = r0.A00
        L_0x0122:
            X.72W r0 = X.AnonymousClass72W.A03
            r11 = r44
            androidx.compose.ui.text.font.FontFamilyResolverImpl r11 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r11
            X.7mN r1 = r11.A03
            X.6hG r1 = (X.C138076hG) r1
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0143
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r13) goto L_0x0143
            r13 = 400(0x190, float:5.6E-43)
            int r13 = r13 + r1
            r1 = 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r13 >= r1) goto L_0x0166
            r13 = 1
        L_0x013e:
            X.72W r0 = new X.72W
            r0.<init>(r13)
        L_0x0143:
            X.6Ce r1 = new X.6Ce
            r17 = 0
            r15 = r0
            r16 = r26
            r18 = r14
            r13 = r1
            r14 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            X.7n3 r0 = androidx.compose.ui.text.font.FontFamilyResolverImpl.A00(r11, r1)
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.Typeface"
            X.AnonymousClass00C.A0E(r1, r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            android.text.style.TypefaceSpan r0 = X.AnonymousClass5XX.A00(r1)
            goto L_0x00c4
        L_0x0166:
            if (r13 <= r0) goto L_0x013e
            r13 = 1000(0x3e8, float:1.401E-42)
            goto L_0x013e
        L_0x016b:
            r14 = 1
            goto L_0x0122
        L_0x016d:
            r0 = 0
            goto L_0x00a9
        L_0x0170:
            int r6 = r8.length()
            java.util.List r8 = r8.A01
            if (r8 == 0) goto L_0x0196
            java.util.ArrayList r11 = X.C36361kB.A0r(r8)
            int r4 = r8.size()
            r3 = 0
        L_0x0181:
            if (r3 >= r4) goto L_0x0198
            java.lang.Object r2 = r8.get(r3)
            r1 = r2
            X.6Bu r1 = (X.C128326Bu) r1
            java.lang.Object r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass5XS
            if (r0 == 0) goto L_0x0193
            X.C128326Bu.A00(r1, r2, r11, r5, r6)
        L_0x0193:
            int r3 = r3 + 1
            goto L_0x0181
        L_0x0196:
            X.09w r11 = X.C023409w.A00
        L_0x0198:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>"
            X.AnonymousClass00C.A0E(r11, r0)
            int r9 = r11.size()
            r4 = 0
        L_0x01a2:
            r10 = 33
            if (r4 >= r9) goto L_0x01d0
            java.lang.Object r0 = r11.get(r4)
            X.6Bu r0 = (X.C128326Bu) r0
            java.lang.Object r1 = r0.A02
            X.5XS r1 = (X.AnonymousClass5XS) r1
            int r3 = r0.A01
            int r2 = r0.A00
            boolean r0 = r1 instanceof X.C95054ji
            if (r0 == 0) goto L_0x01cb
            X.4ji r1 = (X.C95054ji) r1
            java.lang.String r1 = r1.A00
            android.text.style.TtsSpan$VerbatimBuilder r0 = new android.text.style.TtsSpan$VerbatimBuilder
            r0.<init>(r1)
            android.text.style.TtsSpan r0 = r0.build()
            r7.setSpan(r0, r3, r2, r10)
            int r4 = r4 + 1
            goto L_0x01a2
        L_0x01cb:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01d0:
            if (r8 == 0) goto L_0x01f0
            java.util.ArrayList r9 = X.C36361kB.A0r(r8)
            int r4 = r8.size()
            r3 = 0
        L_0x01db:
            if (r3 >= r4) goto L_0x01f2
            java.lang.Object r2 = r8.get(r3)
            r1 = r2
            X.6Bu r1 = (X.C128326Bu) r1
            java.lang.Object r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass68Q
            if (r0 == 0) goto L_0x01ed
            X.C128326Bu.A00(r1, r2, r9, r5, r6)
        L_0x01ed:
            int r3 = r3 + 1
            goto L_0x01db
        L_0x01f0:
            X.09w r9 = X.C023409w.A00
        L_0x01f2:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>"
            X.AnonymousClass00C.A0E(r9, r0)
            int r8 = r9.size()
        L_0x01fb:
            if (r5 >= r8) goto L_0x0225
            java.lang.Object r0 = r9.get(r5)
            X.6Bu r0 = (X.C128326Bu) r0
            java.lang.Object r6 = r0.A02
            X.68Q r6 = (X.AnonymousClass68Q) r6
            int r4 = r0.A01
            int r3 = r0.A00
            r0 = r45
            java.util.WeakHashMap r2 = r0.A00
            java.lang.Object r1 = r2.get(r6)
            if (r1 != 0) goto L_0x021f
            java.lang.String r0 = r6.A00
            android.text.style.URLSpan r1 = new android.text.style.URLSpan
            r1.<init>(r0)
            r2.put(r6, r1)
        L_0x021f:
            r7.setSpan(r1, r4, r3, r10)
            int r5 = r5 + 1
            goto L_0x01fb
        L_0x0225:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A07(X.72L, X.7bi, X.5hD, X.7ni):android.text.SpannableString");
    }

    public static final AccessibilityEvent A0A(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A092 = A09(androidComposeViewAccessibilityDelegateCompat, i, DefaultCrypto.BUFFER_SIZE);
        if (num != null) {
            A092.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A092.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A092.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A092.getText().add(charSequence);
        }
        return A092;
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023e, code lost:
        if (r2.containsKey(X.C114205gq.A0A) != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06cd, code lost:
        if (X.AnonymousClass00C.A0J(X.AnonymousClass5XP.A02(r10, r13), true) != false) goto L_0x06d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0758  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0776  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.accessibility.AccessibilityNodeInfo A0B(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r23, int r24) {
        /*
            r9 = r23
            androidx.compose.ui.platform.AndroidComposeView r7 = r9.A0T
            X.5nj r0 = r7.getViewTreeOwners()
            r10 = 0
            if (r0 == 0) goto L_0x001c
            X.012 r0 = r0.A00
            X.01M r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001c
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r1 = r0.A02
        L_0x0017:
            X.01P r0 = X.AnonymousClass01P.DESTROYED
            if (r1 != r0) goto L_0x001e
            return r10
        L_0x001c:
            r1 = r10
            goto L_0x0017
        L_0x001e:
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            X.0Ys r6 = new X.0Ys
            r6.<init>(r0)
            java.util.Map r1 = A0H(r9)
            r8 = r24
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            r0 = r18
            java.lang.Object r3 = r1.get(r0)
            X.5nk r3 = (X.C118355nk) r3
            if (r3 != 0) goto L_0x003c
            return r10
        L_0x003c:
            X.6WV r5 = r3.A01
            r2 = -1
            if (r8 != r2) goto L_0x011d
            android.view.ViewParent r1 = A08(r7)
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x004c
            r10 = r1
            android.view.View r10 = (android.view.View) r10
        L_0x004c:
            r6.A00 = r2
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.A02
            r4.setParent(r10)
        L_0x0053:
            r6.A01 = r8
            r4.setSource(r7, r8)
            android.graphics.Rect r0 = A05(r9, r3)
            r4.setBoundsInScreen(r0)
            java.lang.String r0 = "android.view.View"
            r6.A0C(r0)
            X.72a r3 = r5.A05
            X.62Q r0 = X.C114205gq.A0H
            java.lang.Object r13 = X.AnonymousClass5XP.A02(r3, r0)
            X.68P r13 = (X.AnonymousClass68P) r13
            if (r13 == 0) goto L_0x0093
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0080
            r1 = 0
            r0 = 1
            java.util.List r0 = X.AnonymousClass6WV.A00(r5, r1, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0093
        L_0x0080:
            int r2 = r13.A00
            r0 = 4
            if (r2 != r0) goto L_0x00fc
            android.content.res.Resources r1 = X.C36341k9.A0F(r7)
            r0 = 2131897056(0x7f122ae0, float:1.942899E38)
        L_0x008c:
            java.lang.String r0 = r1.getString(r0)
            r6.A0G(r0)
        L_0x0093:
            X.62Q r11 = X.C114195gp.A0L
            java.util.Map r2 = r3.A02
            boolean r0 = r2.containsKey(r11)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "android.widget.EditText"
            r6.A0C(r0)
        L_0x00a2:
            X.72a r1 = r5.A07()
            X.62Q r0 = X.C114205gq.A0M
            boolean r0 = X.C1496172a.A00(r1, r0)
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "android.widget.TextView"
            r6.A0C(r0)
        L_0x00b3:
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r0.getPackageName()
            r4.setPackageName(r0)
            boolean r0 = X.AnonymousClass6XD.A05(r5)
            r6.A0N(r0)
            r0 = 0
            r10 = 1
            java.util.List r17 = X.AnonymousClass6WV.A00(r5, r0, r10)
            int r16 = r17.size()
            r1 = 0
            r12 = 0
        L_0x00d1:
            r0 = r16
            if (r12 >= r0) goto L_0x013f
            r0 = r17
            java.lang.Object r15 = r0.get(r12)
            X.6WV r15 = (X.AnonymousClass6WV) r15
            java.util.Map r14 = A0H(r9)
            int r0 = r15.A02
            boolean r0 = X.C90484aE.A1Y(r14, r0)
            if (r0 == 0) goto L_0x00f9
            X.4dt r0 = r7.getAndroidViewsHandler$ui_release()
            java.util.HashMap r14 = r0.A00
            X.6gp r0 = r15.A04
            r14.get(r0)
            int r0 = r15.A02
            r4.addChild(r7, r0)
        L_0x00f9:
            int r12 = r12 + 1
            goto L_0x00d1
        L_0x00fc:
            r0 = 2
            if (r2 != r0) goto L_0x0107
            android.content.res.Resources r1 = X.C36341k9.A0F(r7)
            r0 = 2131897055(0x7f122adf, float:1.9428989E38)
            goto L_0x008c
        L_0x0107:
            java.lang.String r1 = X.AnonymousClass6XD.A00(r2)
            r0 = 5
            if (r2 != r0) goto L_0x0118
            boolean r0 = r5.A09()
            if (r0 != 0) goto L_0x0118
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0093
        L_0x0118:
            r6.A0C(r1)
            goto L_0x0093
        L_0x011d:
            X.6WV r0 = r5.A08()
            if (r0 == 0) goto L_0x0782
            int r1 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0782
            X.608 r0 = r7.A0i
            X.6WV r0 = r0.A00()
            int r0 = r0.A02
            if (r1 == r0) goto L_0x0136
            r2 = r1
        L_0x0136:
            r6.A00 = r2
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.A02
            r4.setParent(r7, r2)
            goto L_0x0053
        L_0x013f:
            int r12 = r9.A01
            r0 = 1
            if (r8 != r12) goto L_0x06fc
            r4.setAccessibilityFocused(r10)
            X.0Yd r12 = X.AnonymousClass0Yd.A05
        L_0x0149:
            r6.A0A(r12)
            android.text.SpannableString r12 = r9.A06(r5)
            r4.setText(r12)
            X.62Q r14 = X.C114205gq.A05
            boolean r12 = r2.containsKey(r14)
            if (r12 == 0) goto L_0x0167
            r4.setContentInvalid(r10)
            java.lang.Object r12 = X.AnonymousClass5XP.A02(r3, r14)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r4.setError(r12)
        L_0x0167:
            java.lang.String r12 = r9.A0E(r5)
            r6.A0H(r12)
            boolean r12 = A0a(r5)
            r4.setCheckable(r12)
            X.62Q r12 = X.C114205gq.A0P
            java.lang.Object r12 = X.AnonymousClass5XP.A02(r3, r12)
            if (r12 == 0) goto L_0x0184
            X.5RV r14 = X.AnonymousClass5RV.On
            if (r12 != r14) goto L_0x06f3
            r4.setChecked(r10)
        L_0x0184:
            X.62Q r12 = X.C114205gq.A0J
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x019c
            boolean r14 = r10.booleanValue()
            if (r13 == 0) goto L_0x06ee
            int r13 = r13.A00
            r10 = 4
            if (r13 != r10) goto L_0x06ee
            r4.setSelected(r14)
        L_0x019c:
            boolean r10 = r3.A01
            if (r10 == 0) goto L_0x01aa
            java.util.List r10 = X.AnonymousClass6WV.A00(r5, r1, r0)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x01bd
        L_0x01aa:
            X.62Q r10 = X.C114205gq.A02
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x06eb
            java.lang.Object r10 = X.C007103b.A0M(r10)
            java.lang.String r10 = (java.lang.String) r10
        L_0x01ba:
            r6.A0D(r10)
        L_0x01bd:
            X.62Q r17 = X.C114205gq.A0L
            r10 = r17
            java.lang.Object r15 = X.AnonymousClass5XP.A02(r3, r10)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x01e1
            r14 = r5
        L_0x01ca:
            X.72a r13 = r14.A05
            X.62Q r10 = X.C112485dy.A00
            boolean r16 = X.C1496172a.A00(r13, r10)
            if (r16 == 0) goto L_0x06e3
            java.lang.Object r10 = r13.A01(r10)
            boolean r10 = X.AnonymousClass000.A1X(r10)
            if (r10 == 0) goto L_0x01e1
            r4.setViewIdResourceName(r15)
        L_0x01e1:
            X.62Q r10 = X.C114205gq.A07
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r10)
            if (r10 == 0) goto L_0x01ec
            r6.A0M(r0)
        L_0x01ec:
            X.72a r13 = r5.A07()
            X.62Q r10 = X.C114205gq.A0F
            boolean r10 = X.C1496172a.A00(r13, r10)
            r4.setPassword(r10)
            boolean r10 = r2.containsKey(r11)
            r4.setEditable(r10)
            boolean r10 = X.AnonymousClass6XD.A04(r5)
            r4.setEnabled(r10)
            X.62Q r13 = X.C114205gq.A06
            boolean r10 = r2.containsKey(r13)
            r4.setFocusable(r10)
            boolean r10 = r4.isFocusable()
            if (r10 == 0) goto L_0x022b
            java.lang.Object r10 = r3.A01(r13)
            boolean r10 = X.AnonymousClass000.A1X(r10)
            r4.setFocused(r10)
            boolean r10 = r4.isFocused()
            if (r10 == 0) goto L_0x06de
            r10 = 2
            r4.addAction(r10)
        L_0x022b:
            X.4iy r10 = r5.A06()
            if (r10 == 0) goto L_0x0237
            boolean r10 = r10.A0b()
            if (r10 != 0) goto L_0x0240
        L_0x0237:
            X.62Q r10 = X.C114205gq.A0A
            boolean r14 = r2.containsKey(r10)
            r10 = 1
            if (r14 == 0) goto L_0x0241
        L_0x0240:
            r10 = 0
        L_0x0241:
            r4.setVisibleToUser(r10)
            X.62Q r10 = X.C114205gq.A0D
            X.AnonymousClass5XP.A02(r3, r10)
            r6.A0L(r1)
            X.62Q r10 = X.C114195gp.A08
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r10)
            if (r14 == 0) goto L_0x0275
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r12)
            boolean r15 = X.C36371kC.A1X(r10, r0)
            r10 = r15 ^ 1
            r6.A0L(r10)
            boolean r10 = X.AnonymousClass6XD.A04(r5)
            if (r10 == 0) goto L_0x0275
            if (r15 != 0) goto L_0x0275
            java.lang.String r15 = r14.A00
            r14 = 16
            X.0Yd r10 = new X.0Yd
            r10.<init>((int) r14, (java.lang.CharSequence) r15)
            r6.A0A(r10)
        L_0x0275:
            r4.setLongClickable(r1)
            X.62Q r10 = X.C114195gp.A0A
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r10)
            if (r14 == 0) goto L_0x028e
            r4.setLongClickable(r0)
            boolean r10 = X.AnonymousClass6XD.A04(r5)
            if (r10 == 0) goto L_0x028e
            r10 = 32
            X.AnonymousClass69I.A00(r14, r6, r10)
        L_0x028e:
            X.62Q r10 = X.C114195gp.A02
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r10)
            if (r14 == 0) goto L_0x029b
            r10 = 16384(0x4000, float:2.2959E-41)
            X.AnonymousClass69I.A00(r14, r6, r10)
        L_0x029b:
            boolean r10 = X.AnonymousClass6XD.A04(r5)
            if (r10 == 0) goto L_0x02ed
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r11)
            if (r14 == 0) goto L_0x02ac
            r10 = 2097152(0x200000, float:2.938736E-39)
            X.AnonymousClass69I.A00(r14, r6, r10)
        L_0x02ac:
            X.62Q r10 = X.C114195gp.A09
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r10)
            if (r14 == 0) goto L_0x02ba
            r10 = 16908372(0x1020054, float:2.3877464E-38)
            X.AnonymousClass69I.A00(r14, r6, r10)
        L_0x02ba:
            X.62Q r10 = X.C114195gp.A04
            X.69I r14 = X.AnonymousClass5XP.A00(r3, r10)
            if (r14 == 0) goto L_0x02c7
            r10 = 65536(0x10000, float:9.18355E-41)
            X.AnonymousClass69I.A00(r14, r6, r10)
        L_0x02c7:
            X.62Q r10 = X.C114195gp.A0F
            X.69I r15 = X.AnonymousClass5XP.A00(r3, r10)
            if (r15 == 0) goto L_0x02ed
            boolean r10 = r4.isFocused()
            if (r10 == 0) goto L_0x02ed
            X.6gy r10 = r7.A0b
            android.content.ClipboardManager r10 = r10.A00
            android.content.ClipDescription r14 = r10.getPrimaryClipDescription()
            if (r14 == 0) goto L_0x02ed
            java.lang.String r10 = "text/*"
            boolean r10 = r14.hasMimeType(r10)
            if (r10 == 0) goto L_0x02ed
            r10 = 32768(0x8000, float:4.5918E-41)
            X.AnonymousClass69I.A00(r15, r6, r10)
        L_0x02ed:
            java.lang.String r10 = r9.A0F(r5)
            if (r10 == 0) goto L_0x0354
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0354
            r15 = 0
            int r14 = r9.A04(r5)
            int r10 = r9.A03(r5)
            r4.setTextSelection(r14, r10)
            X.62Q r10 = X.C114195gp.A0K
            X.69I r10 = X.AnonymousClass5XP.A00(r3, r10)
            r14 = 131072(0x20000, float:1.83671E-40)
            if (r10 == 0) goto L_0x0311
            java.lang.String r15 = r10.A00
        L_0x0311:
            X.0Yd r10 = new X.0Yd
            r10.<init>((int) r14, (java.lang.CharSequence) r15)
            r6.A0A(r10)
            r10 = 256(0x100, float:3.59E-43)
            r4.addAction(r10)
            r10 = 512(0x200, float:7.175E-43)
            r4.addAction(r10)
            r10 = 11
            r4.setMovementGranularities(r10)
            X.62Q r10 = X.C114205gq.A02
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0338
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0354
        L_0x0338:
            X.62Q r10 = X.C114195gp.A07
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto L_0x0354
            boolean r10 = r2.containsKey(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            if (r10 == 0) goto L_0x06ab
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r3, r13)
            boolean r10 = X.AnonymousClass00C.A0J(r10, r11)
            if (r10 != 0) goto L_0x06ab
        L_0x0354:
            int r11 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r11 < r10) goto L_0x038c
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.lang.String r10 = "androidx.compose.ui.semantics.id"
            r11.add(r10)
            java.lang.CharSequence r10 = r6.A05()
            if (r10 == 0) goto L_0x037c
            int r10 = r10.length()
            if (r10 == 0) goto L_0x037c
            X.62Q r10 = X.C114195gp.A07
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto L_0x037c
            java.lang.String r10 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r11.add(r10)
        L_0x037c:
            r10 = r17
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto L_0x0389
            java.lang.String r10 = "androidx.compose.ui.semantics.testTag"
            r11.add(r10)
        L_0x0389:
            X.AnonymousClass5X1.A00(r4, r11)
        L_0x038c:
            X.62Q r10 = X.C114205gq.A0G
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r3, r10)
            X.6Or r11 = (X.C131346Or) r11
            if (r11 == 0) goto L_0x040c
            X.62Q r14 = X.C114195gp.A0J
            boolean r10 = r2.containsKey(r14)
            if (r10 == 0) goto L_0x06a7
            java.lang.String r10 = "android.widget.SeekBar"
        L_0x03a0:
            r6.A0C(r10)
            X.6Or r10 = X.C131346Or.A01
            if (r11 == r10) goto L_0x03c1
            X.0sK r10 = r11.A00
            java.lang.Comparable r13 = r10.BHr()
            float r15 = X.C36441kJ.A03(r13)
            java.lang.Comparable r10 = r10.BBY()
            float r13 = X.C36441kJ.A03(r10)
            r10 = 0
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r10 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r0, r15, r13, r10)
            r4.setRangeInfo(r10)
        L_0x03c1:
            boolean r10 = r2.containsKey(r14)
            if (r10 == 0) goto L_0x040c
            boolean r10 = X.AnonymousClass6XD.A04(r5)
            if (r10 == 0) goto L_0x040c
            r15 = 0
            X.0sK r11 = r11.A00
            java.lang.Comparable r10 = r11.BBY()
            float r14 = X.C36441kJ.A03(r10)
            java.lang.Comparable r10 = r11.BHr()
            float r13 = X.C36441kJ.A03(r10)
            int r10 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x03e5
            r14 = r13
        L_0x03e5:
            int r10 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x03ee
            X.0Yd r10 = X.AnonymousClass0Yd.A0Z
            r6.A0A(r10)
        L_0x03ee:
            java.lang.Comparable r10 = r11.BHr()
            float r13 = X.C36441kJ.A03(r10)
            java.lang.Comparable r10 = r11.BBY()
            float r11 = X.C36441kJ.A03(r10)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0403
            r13 = r11
        L_0x0403:
            int r10 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x040c
            X.0Yd r10 = X.AnonymousClass0Yd.A0X
            r6.A0A(r10)
        L_0x040c:
            int r11 = android.os.Build.VERSION.SDK_INT
            r10 = 24
            if (r11 < r10) goto L_0x0415
            X.AnonymousClass5X2.A00(r5, r6)
        L_0x0415:
            X.72a r11 = r5.A07()
            X.62Q r10 = X.C114205gq.A00
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r11, r10)
            X.5nm r11 = (X.C118375nm) r11
            if (r11 == 0) goto L_0x0653
            int r13 = r11.A01
            int r11 = r11.A00
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r13 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r13, r11, r1, r1)
        L_0x042b:
            X.0SK r11 = new X.0SK
            r11.<init>(r13)
            r6.A0J(r11)
        L_0x0433:
            X.72a r13 = r5.A07()
            X.62Q r11 = X.C114205gq.A01
            X.AnonymousClass5XP.A02(r13, r11)
            X.6WV r13 = r5.A08()
            if (r13 == 0) goto L_0x0462
            X.72a r14 = r13.A07()
            X.62Q r11 = X.C114205gq.A0I
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r14, r11)
            if (r11 == 0) goto L_0x0462
            X.72a r11 = r13.A07()
            java.lang.Object r14 = X.AnonymousClass5XP.A02(r11, r10)
            X.5nm r14 = (X.C118375nm) r14
            if (r14 == 0) goto L_0x05d0
            int r11 = r14.A01
            if (r11 < 0) goto L_0x0462
            int r11 = r14.A00
            if (r11 >= 0) goto L_0x05d0
        L_0x0462:
            X.62Q r11 = X.C114205gq.A08
            java.lang.Object r13 = X.AnonymousClass5XP.A02(r3, r11)
            X.62P r13 = (X.AnonymousClass62P) r13
            X.62Q r11 = X.C114195gp.A0H
            java.lang.Object r15 = X.AnonymousClass5XP.A02(r3, r11)
            r14 = 0
            if (r13 == 0) goto L_0x04d3
            if (r15 == 0) goto L_0x04d3
            X.72a r11 = r5.A07()
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r11, r10)
            if (r11 != 0) goto L_0x0490
            X.72a r12 = r5.A07()
            X.62Q r11 = X.C114205gq.A0I
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r12, r11)
            if (r11 != 0) goto L_0x0490
            java.lang.String r11 = "android.widget.HorizontalScrollView"
            r6.A0C(r11)
        L_0x0490:
            X.00S r11 = r13.A00
            float r11 = X.C90464aC.A03(r11)
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x049d
            r4.setScrollable(r0)
        L_0x049d:
            boolean r11 = X.AnonymousClass6XD.A04(r5)
            if (r11 == 0) goto L_0x04d3
            boolean r11 = A0X(r13)
            if (r11 == 0) goto L_0x04bb
            X.0Yd r11 = X.AnonymousClass0Yd.A0Z
            r6.A0A(r11)
            X.6gp r11 = r5.A04
            X.5RW r12 = r11.A0C
            X.5RW r11 = X.AnonymousClass5RW.Rtl
            if (r12 != r11) goto L_0x05cc
            X.0Yd r11 = X.AnonymousClass0Yd.A0b
        L_0x04b8:
            r6.A0A(r11)
        L_0x04bb:
            boolean r11 = A0W(r13)
            if (r11 == 0) goto L_0x04d3
            X.0Yd r11 = X.AnonymousClass0Yd.A0X
            r6.A0A(r11)
            X.6gp r11 = r5.A04
            X.5RW r12 = r11.A0C
            X.5RW r11 = X.AnonymousClass5RW.Rtl
            if (r12 != r11) goto L_0x05c8
            X.0Yd r11 = X.AnonymousClass0Yd.A0c
        L_0x04d0:
            r6.A0A(r11)
        L_0x04d3:
            X.62Q r11 = X.C114205gq.A0R
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r3, r11)
            X.62P r11 = (X.AnonymousClass62P) r11
            if (r11 == 0) goto L_0x052d
            if (r15 == 0) goto L_0x052d
            X.72a r12 = r5.A07()
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r12, r10)
            if (r10 != 0) goto L_0x04fa
            X.72a r12 = r5.A07()
            X.62Q r10 = X.C114205gq.A0I
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r12, r10)
            if (r10 != 0) goto L_0x04fa
            java.lang.String r10 = "android.widget.ScrollView"
            r6.A0C(r10)
        L_0x04fa:
            X.00S r10 = r11.A00
            float r10 = X.C90464aC.A03(r10)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0507
            r4.setScrollable(r0)
        L_0x0507:
            boolean r0 = X.AnonymousClass6XD.A04(r5)
            if (r0 == 0) goto L_0x052d
            boolean r0 = A0X(r11)
            if (r0 == 0) goto L_0x051d
            X.0Yd r0 = X.AnonymousClass0Yd.A0Z
            r6.A0A(r0)
            X.0Yd r0 = X.AnonymousClass0Yd.A0Y
            r6.A0A(r0)
        L_0x051d:
            boolean r0 = A0W(r11)
            if (r0 == 0) goto L_0x052d
            X.0Yd r0 = X.AnonymousClass0Yd.A0X
            r6.A0A(r0)
            X.0Yd r0 = X.AnonymousClass0Yd.A0e
            r6.A0A(r0)
        L_0x052d:
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r10 < r0) goto L_0x0536
            X.AnonymousClass5X3.A00(r5, r6)
        L_0x0536:
            X.62Q r0 = X.C114205gq.A0E
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r3, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.A0F(r0)
            boolean r0 = X.AnonymousClass6XD.A04(r5)
            if (r0 == 0) goto L_0x0747
            X.62Q r0 = X.C114195gp.A06
            X.69I r10 = X.AnonymousClass5XP.A00(r3, r0)
            if (r10 == 0) goto L_0x0554
            r0 = 262144(0x40000, float:3.67342E-40)
            X.AnonymousClass69I.A00(r10, r6, r0)
        L_0x0554:
            X.62Q r0 = X.C114195gp.A01
            X.69I r10 = X.AnonymousClass5XP.A00(r3, r0)
            if (r10 == 0) goto L_0x0561
            r0 = 524288(0x80000, float:7.34684E-40)
            X.AnonymousClass69I.A00(r10, r6, r0)
        L_0x0561:
            X.62Q r0 = X.C114195gp.A05
            X.69I r10 = X.AnonymousClass5XP.A00(r3, r0)
            if (r10 == 0) goto L_0x056e
            r0 = 1048576(0x100000, float:1.469368E-39)
            X.AnonymousClass69I.A00(r10, r6, r0)
        L_0x056e:
            X.62Q r10 = X.C114195gp.A03
            boolean r0 = r2.containsKey(r10)
            if (r0 == 0) goto L_0x0747
            java.lang.Object r13 = r3.A01(r10)
            java.util.List r13 = (java.util.List) r13
            int r0 = r13.size()
            int[] r16 = A0b
            r2 = 32
            if (r0 >= r2) goto L_0x072c
            r0 = 10
            X.0fO r11 = new X.0fO
            r11.<init>(r0)
            java.util.LinkedHashMap r10 = X.C36431kI.A1G()
            X.0fO r3 = r9.A06
            int[] r2 = r3.A01
            int r0 = r3.A00
            int r0 = X.AnonymousClass009.A00(r2, r0, r8)
            if (r0 < 0) goto L_0x071c
            java.lang.Object r15 = X.C06840Vh.A00(r3, r8)
            r14 = 32
            java.util.ArrayList r12 = X.C36441kJ.A14(r14)
            r2 = 0
        L_0x05a8:
            r0 = r16[r2]
            X.AnonymousClass000.A1F(r12, r0)
            int r2 = r2 + 1
            if (r2 < r14) goto L_0x05a8
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0703
            r13.get(r1)
            X.AnonymousClass00C.A0B(r15)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x05c8:
            X.0Yd r11 = X.AnonymousClass0Yd.A0b
            goto L_0x04d0
        L_0x05cc:
            X.0Yd r11 = X.AnonymousClass0Yd.A0c
            goto L_0x04b8
        L_0x05d0:
            X.72a r11 = r5.A07()
            boolean r11 = X.C1496172a.A00(r11, r12)
            if (r11 == 0) goto L_0x0462
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()
            java.util.List r16 = X.AnonymousClass6WV.A00(r13, r1, r0)
            int r15 = r16.size()
            r13 = 0
            r21 = 0
        L_0x05e9:
            if (r13 >= r15) goto L_0x0619
            r11 = r16
            java.lang.Object r14 = r11.get(r13)
            X.6WV r14 = (X.AnonymousClass6WV) r14
            X.72a r11 = r14.A07()
            boolean r11 = X.C1496172a.A00(r11, r12)
            if (r11 == 0) goto L_0x0616
            r11 = r17
            r11.add(r14)
            X.6gp r11 = r14.A04
            X.6Et r11 = r11.A0P
            X.4ih r11 = r11.A0G
            int r14 = r11.A03
            X.6gp r11 = r5.A04
            X.6Et r11 = r11.A0P
            X.4ih r11 = r11.A0G
            int r11 = r11.A03
            if (r14 >= r11) goto L_0x0616
            int r21 = r21 + 1
        L_0x0616:
            int r13 = r13 + 1
            goto L_0x05e9
        L_0x0619:
            boolean r11 = X.C36411kG.A1a(r17)
            if (r11 == 0) goto L_0x0462
            boolean r11 = A0c(r17)
            r19 = 0
            if (r11 != 0) goto L_0x062b
            r19 = r21
            r21 = 0
        L_0x062b:
            X.72a r11 = r5.A07()
            java.util.Map r11 = r11.A02
            java.lang.Object r11 = r11.get(r12)
            if (r11 != 0) goto L_0x063b
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x063b:
            boolean r24 = X.AnonymousClass000.A1X(r11)
            r20 = 1
            r22 = 1
            r23 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r12 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r19, r20, r21, r22, r23, r24)
            X.0SL r11 = new X.0SL
            r11.<init>(r12)
            r6.A0K(r11)
            goto L_0x0462
        L_0x0653:
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()
            X.72a r13 = r5.A07()
            X.62Q r11 = X.C114205gq.A0I
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r13, r11)
            if (r11 == 0) goto L_0x0688
            java.util.List r16 = X.AnonymousClass6WV.A00(r5, r1, r0)
            int r14 = r16.size()
            r13 = 0
        L_0x066c:
            if (r13 >= r14) goto L_0x0688
            r11 = r16
            java.lang.Object r15 = r11.get(r13)
            X.6WV r15 = (X.AnonymousClass6WV) r15
            X.72a r11 = r15.A07()
            boolean r11 = X.C1496172a.A00(r11, r12)
            if (r11 == 0) goto L_0x0685
            r11 = r17
            r11.add(r15)
        L_0x0685:
            int r13 = r13 + 1
            goto L_0x066c
        L_0x0688:
            boolean r11 = r17.isEmpty()
            r13 = 1
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x0433
            boolean r11 = A0c(r17)
            if (r11 == 0) goto L_0x06a2
            r11 = 1
            int r13 = r17.size()
        L_0x069c:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r13 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r11, r13, r1, r1)
            goto L_0x042b
        L_0x06a2:
            int r11 = r17.size()
            goto L_0x069c
        L_0x06a7:
            java.lang.String r10 = "android.widget.ProgressBar"
            goto L_0x03a0
        L_0x06ab:
            X.6gp r15 = r5.A04
            X.7Wr r14 = X.C155597Wr.A00
        L_0x06af:
            X.6gp r15 = r15.A0A()
            if (r15 == 0) goto L_0x06d1
            java.lang.Object r10 = r14.invoke(r15)
            boolean r10 = X.AnonymousClass000.A1X(r10)
            if (r10 == 0) goto L_0x06af
            X.72a r10 = r15.A0B()
            if (r10 == 0) goto L_0x0354
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r10, r13)
            boolean r10 = X.AnonymousClass00C.A0J(r10, r11)
            if (r10 != 0) goto L_0x06d1
            goto L_0x0354
        L_0x06d1:
            int r10 = r4.getMovementGranularities()
            r10 = r10 | 4
            r10 = r10 | 16
            r4.setMovementGranularities(r10)
            goto L_0x0354
        L_0x06de:
            r4.addAction(r0)
            goto L_0x022b
        L_0x06e3:
            X.6WV r14 = r14.A08()
            if (r14 == 0) goto L_0x01e1
            goto L_0x01ca
        L_0x06eb:
            r10 = 0
            goto L_0x01ba
        L_0x06ee:
            r4.setChecked(r14)
            goto L_0x019c
        L_0x06f3:
            X.5RV r10 = X.AnonymousClass5RV.Off
            if (r12 != r10) goto L_0x0184
            r4.setChecked(r1)
            goto L_0x0184
        L_0x06fc:
            r4.setAccessibilityFocused(r1)
            X.0Yd r12 = X.AnonymousClass0Yd.A04
            goto L_0x0149
        L_0x0703:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x073f
            r2.get(r1)
            java.lang.Object r0 = r12.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x071c:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x073f
            r13.get(r1)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x072c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Can't have more than "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " custom actions for one widget"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x073f:
            X.0fO r0 = r9.A05
            r0.A02(r8, r11)
            r3.A02(r8, r10)
        L_0x0747:
            boolean r0 = r9.A0Z(r5)
            r6.A0O(r0)
            java.util.HashMap r1 = r9.A0D
            r0 = r18
            java.lang.Number r0 = X.C36441kJ.A10(r0, r1)
            if (r0 == 0) goto L_0x076c
            X.4dt r1 = r7.getAndroidViewsHandler$ui_release()
            int r0 = r0.intValue()
            X.AnonymousClass6XD.A02(r1, r0)
            r6.A08(r7, r0)
            java.lang.String r1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r0 = 0
            A0J(r0, r4, r9, r1, r8)
        L_0x076c:
            java.util.HashMap r1 = r9.A0C
            r0 = r18
            java.lang.Number r0 = X.C36441kJ.A10(r0, r1)
            if (r0 == 0) goto L_0x0781
            X.4dt r1 = r7.getAndroidViewsHandler$ui_release()
            int r0 = r0.intValue()
            X.AnonymousClass6XD.A02(r1, r0)
        L_0x0781:
            return r4
        L_0x0782:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "semanticsNode "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " has null parent"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0B(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int):android.view.accessibility.AccessibilityNodeInfo");
    }

    private final String A0E(AnonymousClass6WV r9) {
        float A032;
        Resources A0F2;
        int i;
        C1496172a r4 = r9.A05;
        Object A022 = AnonymousClass5XP.A02(r4, C114205gq.A0K);
        AnonymousClass5RV r1 = (AnonymousClass5RV) AnonymousClass5XP.A02(r4, C114205gq.A0P);
        AnonymousClass68P r6 = (AnonymousClass68P) AnonymousClass5XP.A02(r4, C114205gq.A0H);
        if (r1 != null) {
            int ordinal = r1.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && A022 == null) {
                        A0F2 = C36341k9.A0F(this.A0T);
                        i = R.string.f12nameremoved;
                    }
                } else if (r6 != null && r6.A00 == 2 && A022 == null) {
                    A0F2 = C36341k9.A0F(this.A0T);
                    i = R.string.f12nameremoved;
                }
            } else if (r6 != null && r6.A00 == 2 && A022 == null) {
                A0F2 = C36341k9.A0F(this.A0T);
                i = R.string.f12nameremoved;
            }
            A022 = A0F2.getString(i);
        }
        Boolean bool = (Boolean) AnonymousClass5XP.A02(r4, C114205gq.A0J);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((r6 == null || r6.A00 != 4) && A022 == null) {
                Resources A0F3 = C36341k9.A0F(this.A0T);
                int i2 = R.string.f12nameremoved;
                if (booleanValue) {
                    i2 = R.string.f12nameremoved;
                }
                A022 = A0F3.getString(i2);
            }
        }
        C131346Or r12 = (C131346Or) AnonymousClass5XP.A02(r4, C114205gq.A0G);
        if (r12 != null) {
            if (r12 != C131346Or.A01) {
                if (A022 == null) {
                    C17940sK r62 = r12.A00;
                    if (C36441kJ.A03(r62.BBY()) - C36441kJ.A03(r62.BHr()) == 0.0f) {
                        A032 = 0.0f;
                    } else {
                        A032 = (0.0f - C36441kJ.A03(r62.BHr())) / (C36441kJ.A03(r62.BBY()) - C36441kJ.A03(r62.BHr()));
                    }
                    float A012 = C15040mb.A01(A032, 0.0f, 1.0f);
                    int i3 = 0;
                    if (A012 != 0.0f) {
                        i3 = 100;
                        if (A012 != 1.0f) {
                            i3 = C14960mT.A01(A012 * ((float) 100));
                            if (i3 < 1) {
                                i3 = 1;
                            } else if (i3 > 99) {
                                i3 = 99;
                            }
                        }
                    }
                    Resources A0F4 = C36341k9.A0F(this.A0T);
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, i3, 0);
                    A022 = A0F4.getString(R.string.f12nameremoved, objArr);
                }
            } else if (A022 == null) {
                A022 = C36341k9.A0F(this.A0T).getString(R.string.f12nameremoved);
            }
        }
        return (String) A022;
    }

    public static final Map A0H(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        AnonymousClass6WV r3;
        if (androidComposeViewAccessibilityDelegateCompat.A0H) {
            androidComposeViewAccessibilityDelegateCompat.A0H = false;
            AnonymousClass6WV A002 = androidComposeViewAccessibilityDelegateCompat.A0T.A0i.A00();
            LinkedHashMap A1G = C36431kI.A1G();
            C137846gp r1 = A002.A04;
            if (r1.A0P.A0G.A0C && r1.A09 != null) {
                AnonymousClass6QC A042 = A002.A04();
                AnonymousClass6XD.A01(new Region(C14960mT.A01(A042.A01), C14960mT.A01(A042.A03), C14960mT.A01(A042.A02), C14960mT.A01(A042.A00)), new Region(), A002, A002, A1G);
            }
            androidComposeViewAccessibilityDelegateCompat.A0K = A1G;
            if (androidComposeViewAccessibilityDelegateCompat.A0o()) {
                HashMap hashMap = androidComposeViewAccessibilityDelegateCompat.A0D;
                hashMap.clear();
                HashMap hashMap2 = androidComposeViewAccessibilityDelegateCompat.A0C;
                hashMap2.clear();
                C118355nk r0 = (C118355nk) C36371kC.A0r(A0H(androidComposeViewAccessibilityDelegateCompat), -1);
                if (r0 != null) {
                    r3 = r0.A01;
                } else {
                    r3 = null;
                }
                AnonymousClass00C.A0B(r3);
                int i = 1;
                ArrayList A0G2 = androidComposeViewAccessibilityDelegateCompat.A0G(AnonymousClass03T.A03(r3), C36361kB.A1a(r3.A04.A0C, AnonymousClass5RW.Rtl));
                int A072 = C36431kI.A07(A0G2);
                if (1 <= A072) {
                    while (true) {
                        int i2 = ((AnonymousClass6WV) A0G2.get(i - 1)).A02;
                        int i3 = ((AnonymousClass6WV) A0G2.get(i)).A02;
                        Integer valueOf = Integer.valueOf(i2);
                        hashMap2.put(C90484aE.A0f(valueOf, hashMap, i3), valueOf);
                        if (i == A072) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0K;
    }

    private final void A0I() {
        C131596Pr r6 = this.A09;
        if (r6 != null && Build.VERSION.SDK_INT >= 29) {
            AnonymousClass008 r5 = this.A0Q;
            if (!r5.isEmpty()) {
                List A0Y2 = C007103b.A0Y(r5.values());
                ArrayList A0r = C36361kB.A0r(A0Y2);
                int size = A0Y2.size();
                for (int i = 0; i < size; i++) {
                    A0r.add(((AnonymousClass6Q1) A0Y2.get(i)).A01());
                }
                r6.A04(A0r);
                r5.clear();
            }
            C000000a r52 = this.A0R;
            if (!r52.isEmpty()) {
                List A0Y3 = C007103b.A0Y(r52);
                ArrayList A0r2 = C36361kB.A0r(A0Y3);
                int size2 = A0Y3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C36391kE.A1W(A0r2, (long) C36351kA.A06(A0Y3, i2));
                }
                r6.A05(C007103b.A0n(A0r2));
                r52.clear();
            }
        }
    }

    public static final void A0J(Bundle bundle, AccessibilityNodeInfo accessibilityNodeInfo, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i) {
        Bundle extras;
        int i2;
        int i3;
        float A052;
        float A053;
        RectF rectF;
        long j;
        HashMap hashMap;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
        Map A0H2 = A0H(androidComposeViewAccessibilityDelegateCompat2);
        Integer valueOf = Integer.valueOf(i);
        C118355nk r0 = (C118355nk) A0H2.get(valueOf);
        if (r0 != null) {
            AnonymousClass6WV r6 = r0.A01;
            String A0F2 = androidComposeViewAccessibilityDelegateCompat2.A0F(r6);
            String str2 = str;
            if (AnonymousClass00C.A0J(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                hashMap = androidComposeViewAccessibilityDelegateCompat2.A0D;
            } else if (AnonymousClass00C.A0J(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                hashMap = androidComposeViewAccessibilityDelegateCompat2.A0C;
            } else {
                C1496172a r2 = r6.A05;
                AnonymousClass62Q r02 = C114195gp.A07;
                Map map = r2.A02;
                Bundle bundle2 = bundle;
                if (!map.containsKey(r02) || bundle == null || !AnonymousClass00C.A0J(str2, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    AnonymousClass62Q r1 = C114205gq.A0L;
                    if (map.containsKey(r1) && bundle != null && AnonymousClass00C.A0J(str2, "androidx.compose.ui.semantics.testTag")) {
                        String str3 = (String) AnonymousClass5XP.A02(r2, r1);
                        if (str3 != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str2, str3);
                            return;
                        }
                        return;
                    } else if (AnonymousClass00C.A0J(str2, "androidx.compose.ui.semantics.id")) {
                        extras = accessibilityNodeInfo.getExtras();
                        i2 = r6.A02;
                        extras.putInt(str2, i2);
                    } else {
                        return;
                    }
                } else {
                    int i4 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i5 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i5 > 0 && i4 >= 0) {
                        if (A0F2 != null) {
                            i3 = A0F2.length();
                        } else {
                            i3 = Integer.MAX_VALUE;
                        }
                        if (i4 < i3) {
                            AnonymousClass6FW A0C2 = A0C(r2);
                            if (A0C2 != null) {
                                ArrayList A0I2 = AnonymousClass001.A0I();
                                int i6 = 0;
                                do {
                                    int i7 = i4 + i6;
                                    if (i7 >= A0C2.A04.A03.length()) {
                                        rectF = null;
                                    } else {
                                        AnonymousClass6NL r10 = A0C2.A03;
                                        if (i7 < 0 || i7 >= r10.A03.A00.A00.length()) {
                                            StringBuilder A0u = AnonymousClass000.A0u();
                                            A0u.append("offset(");
                                            A0u.append(i7);
                                            A0u.append(") is out of bounds [0, ");
                                            throw AnonymousClass001.A08(C36321k7.A0G(A0u, r10.A03.A00.length()));
                                        }
                                        List list = r10.A04;
                                        AnonymousClass6DO r15 = (AnonymousClass6DO) list.get(AnonymousClass6GC.A00(list, i7));
                                        C160567lD r102 = r15.A06;
                                        int i8 = r15.A05;
                                        int A022 = C15040mb.A02(i7, i8, r15.A04) - i8;
                                        C138016h8 r103 = (C138016h8) r102;
                                        if (A022 < 0 || A022 >= r103.A03.length()) {
                                            StringBuilder A0u2 = AnonymousClass000.A0u();
                                            A0u2.append("offset(");
                                            A0u2.append(A022);
                                            A0u2.append(") is out of bounds [0,");
                                            throw AnonymousClass001.A08(C36321k7.A0G(A0u2, r103.A03.length()));
                                        }
                                        AnonymousClass6WP r13 = r103.A01;
                                        Layout layout = r13.A08;
                                        int lineForOffset = layout.getLineForOffset(A022);
                                        float A032 = r13.A03(lineForOffset);
                                        float A023 = r13.A02(lineForOffset);
                                        boolean A1S = AnonymousClass000.A1S(layout.getParagraphDirection(lineForOffset), 1);
                                        boolean isRtlCharAt = layout.isRtlCharAt(A022);
                                        if (A1S) {
                                            if (!isRtlCharAt) {
                                                A052 = r13.A04(A022, false);
                                                A053 = r13.A04(A022 + 1, true);
                                            } else {
                                                A053 = r13.A05(A022, false);
                                                A052 = r13.A05(A022 + 1, true);
                                            }
                                        } else if (isRtlCharAt) {
                                            A053 = r13.A04(A022, false);
                                            A052 = r13.A04(A022 + 1, true);
                                        } else {
                                            A052 = r13.A05(A022, false);
                                            A053 = r13.A05(A022 + 1, true);
                                        }
                                        RectF rectF2 = new RectF(A052, A032, A053, A023);
                                        AnonymousClass6QC r12 = new AnonymousClass6QC(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
                                        long A0B2 = C90464aC.A0B(0.0f, r15.A01);
                                        long j2 = C133206Xf.A03;
                                        AnonymousClass6QC A024 = r12.A02(A0B2);
                                        rectF = null;
                                        C94894iy A062 = r6.A06();
                                        if (A062 == null || !A062.A0M().A08) {
                                            j = C133206Xf.A03;
                                        } else {
                                            j = A062.BOS(C133206Xf.A03);
                                        }
                                        AnonymousClass6QC A025 = A024.A02(j);
                                        AnonymousClass6QC A042 = r6.A04();
                                        if (A025.A02 > A042.A01 && A042.A02 > A025.A01 && A025.A00 > A042.A03 && A042.A00 > A025.A03) {
                                            AnonymousClass6QC A033 = A025.A03(A042);
                                            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat2.A0T;
                                            long BOT = androidComposeView.BOT(C90464aC.A0B(A033.A01, A033.A03));
                                            long BOT2 = androidComposeView.BOT(C90464aC.A0B(A033.A02, A033.A00));
                                            rectF = new RectF(C133206Xf.A00(BOT), C133206Xf.A01(BOT), C133206Xf.A00(BOT2), C133206Xf.A01(BOT2));
                                        }
                                    }
                                    A0I2.add(rectF);
                                    i6++;
                                } while (i6 < i5);
                                accessibilityNodeInfo.getExtras().putParcelableArray(str2, (Parcelable[]) A0I2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
            }
            Number A10 = C36441kJ.A10(valueOf, hashMap);
            if (A10 != null) {
                extras = accessibilityNodeInfo.getExtras();
                i2 = A10.intValue();
                extras.putInt(str2, i2);
            }
        }
    }

    public static final void A0L(C137846gp r1, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0S.add(r1)) {
            androidComposeViewAccessibilityDelegateCompat.A0a.BwE(AnonymousClass0AJ.A00);
        }
    }

    public static final void A0O(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        C123595wl r3 = androidComposeViewAccessibilityDelegateCompat.A07;
        if (r3 != null) {
            int i2 = r3.A05.A02;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - r3.A04 <= 1000) {
                AccessibilityEvent A092 = A09(androidComposeViewAccessibilityDelegateCompat, A02(androidComposeViewAccessibilityDelegateCompat, i2), C132986Wc.A0F);
                A092.setFromIndex(r3.A01);
                A092.setToIndex(r3.A03);
                A092.setAction(r3.A00);
                A092.setMovementGranularity(r3.A02);
                A092.getText().add(androidComposeViewAccessibilityDelegateCompat.A0F(r3.A05));
                A0K(A092, androidComposeViewAccessibilityDelegateCompat);
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A07 = null;
    }

    public static final void A0P(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Integer num, List list, int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return;
        }
        if (androidComposeViewAccessibilityDelegateCompat.A0o() || androidComposeViewAccessibilityDelegateCompat.A09 != null) {
            AccessibilityEvent A092 = A09(androidComposeViewAccessibilityDelegateCompat, i, i2);
            if (num != null) {
                A092.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                A092.setContentDescription(C109315Xc.A00(",", list));
            }
            A0K(A092, androidComposeViewAccessibilityDelegateCompat);
        }
    }

    public static final void A0Q(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i) {
        C131596Pr r2 = androidComposeViewAccessibilityDelegateCompat.A09;
        if (r2 != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId A012 = r2.A01((long) i);
            if (A012 != null) {
                r2.A03(A012, str);
                return;
            }
            throw AnonymousClass001.A09("Invalid content capture ID");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r3 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0S(X.AnonymousClass6WV r9) {
        /*
            r8 = this;
            X.6Pr r0 = r8.A09
            if (r0 == 0) goto L_0x015c
            X.72a r2 = r9.A05
            X.62Q r0 = X.C114205gq.A0B
            java.lang.Object r5 = X.AnonymousClass5XP.A02(r2, r0)
            java.lang.Integer r1 = r8.A0B
            java.lang.Integer r0 = X.C023109s.A00
            java.lang.Boolean r4 = X.C36381kD.A0j()
            java.lang.Boolean r3 = X.C36371kC.A0m()
            if (r1 != r0) goto L_0x013d
            boolean r0 = X.AnonymousClass00C.A0J(r5, r3)
            if (r0 == 0) goto L_0x013d
            X.62Q r0 = X.C114195gp.A0N
            X.69I r0 = X.AnonymousClass5XP.A00(r2, r0)
            if (r0 == 0) goto L_0x0031
            X.00P r0 = r0.A01
            X.02t r0 = (X.C006302t) r0
            if (r0 == 0) goto L_0x0031
            r0.invoke(r4)
        L_0x0031:
            int r4 = r9.A02
            X.6Pr r5 = r8.A09
            if (r5 == 0) goto L_0x0054
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0054
            androidx.compose.ui.platform.AndroidComposeView r0 = r8.A0T
            X.6ME r1 = X.AnonymousClass5XK.A00(r0)
            if (r1 == 0) goto L_0x0054
            X.6WV r0 = r9.A08()
            if (r0 == 0) goto L_0x006c
            int r0 = r0.A02
            long r0 = (long) r0
            android.view.autofill.AutofillId r3 = r5.A01(r0)
            if (r3 != 0) goto L_0x0070
        L_0x0054:
            r3 = 0
            r0 = 1
            java.util.List r2 = X.AnonymousClass6WV.A00(r9, r3, r0)
            int r1 = r2.size()
        L_0x005e:
            if (r3 >= r1) goto L_0x015c
            java.lang.Object r0 = r2.get(r3)
            X.6WV r0 = (X.AnonymousClass6WV) r0
            r8.A0S(r0)
            int r3 = r3 + 1
            goto L_0x005e
        L_0x006c:
            android.view.autofill.AutofillId r3 = r1.A01()
        L_0x0070:
            long r0 = (long) r4
            X.6Q1 r3 = r5.A02(r3, r0)
            if (r3 == 0) goto L_0x0054
            X.62Q r0 = X.C114205gq.A0F
            boolean r0 = X.C1496172a.A00(r2, r0)
            if (r0 != 0) goto L_0x0054
            X.62Q r0 = X.C114205gq.A0M
            java.lang.Object r1 = X.AnonymousClass5XP.A02(r2, r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r5 = "\n"
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "android.widget.TextView"
            r3.A06(r0)
            java.lang.String r0 = X.C109315Xc.A00(r5, r1)
            r3.A05(r0)
        L_0x0097:
            X.62Q r0 = X.C114205gq.A04
            java.lang.Object r1 = X.AnonymousClass5XP.A02(r2, r0)
            X.72L r1 = (X.AnonymousClass72L) r1
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = "android.widget.EditText"
            r3.A06(r0)
            r3.A05(r1)
        L_0x00a9:
            X.62Q r0 = X.C114205gq.A02
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r2, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = X.C109315Xc.A00(r5, r0)
            r3.A04(r0)
        L_0x00ba:
            X.62Q r0 = X.C114205gq.A0H
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r2, r0)
            X.68P r0 = (X.AnonymousClass68P) r0
            if (r0 == 0) goto L_0x00cf
            int r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass6XD.A00(r0)
            if (r0 == 0) goto L_0x00cf
            r3.A06(r0)
        L_0x00cf:
            X.6FW r0 = A0C(r2)
            if (r0 == 0) goto L_0x00f2
            X.6Dq r5 = r0.A04
            X.6V8 r0 = r5.A04
            X.6FJ r0 = r0.A02
            long r1 = r0.A01
            X.68V[] r0 = X.AnonymousClass6WI.A02
            float r2 = X.C90464aC.A00(r1)
            X.7ni r1 = r5.A06
            float r0 = r1.BAy()
            float r2 = r2 * r0
            float r0 = r1.BC0()
            float r2 = r2 * r0
            r3.A02(r2)
        L_0x00f2:
            X.6WV r1 = r9.A08()
            if (r1 == 0) goto L_0x0133
            X.4iy r2 = r9.A06()
            if (r2 == 0) goto L_0x0133
            X.6gq r0 = r2.A0M()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0133
            X.6gq r0 = r1.A03
            X.4iy r1 = X.C137856gq.A06(r0)
            r0 = 1
            X.6QC r7 = r1.BOQ(r2, r0)
        L_0x0111:
            float r1 = r7.A01
            int r6 = (int) r1
            float r5 = r7.A03
            int r2 = (int) r5
            float r0 = r7.A02
            float r0 = r0 - r1
            int r1 = (int) r0
            float r0 = r7.A00
            float r0 = r0 - r5
            int r0 = (int) r0
            r3.A03(r6, r2, r1, r0)
            X.00a r2 = r8.A0R
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0136
            r2.remove(r1)
            goto L_0x0054
        L_0x0133:
            X.6QC r7 = X.AnonymousClass6QC.A04
            goto L_0x0111
        L_0x0136:
            X.008 r0 = r8.A0Q
            r0.put(r1, r3)
            goto L_0x0054
        L_0x013d:
            java.lang.Integer r1 = r8.A0B
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0031
            boolean r0 = X.AnonymousClass00C.A0J(r5, r4)
            if (r0 == 0) goto L_0x0031
            X.62Q r0 = X.C114195gp.A0N
            X.69I r0 = X.AnonymousClass5XP.A00(r2, r0)
            if (r0 == 0) goto L_0x0031
            X.00P r0 = r0.A01
            X.02t r0 = (X.C006302t) r0
            if (r0 == 0) goto L_0x0031
            r0.invoke(r3)
            goto L_0x0031
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0S(X.6WV):void");
    }

    private final void A0T(AnonymousClass6WV r5) {
        if (this.A09 != null) {
            int i = r5.A02;
            AnonymousClass008 r2 = this.A0Q;
            Integer valueOf = Integer.valueOf(i);
            if (r2.containsKey(valueOf)) {
                r2.remove(valueOf);
            } else {
                this.A0R.add(valueOf);
            }
            List A002 = AnonymousClass6WV.A00(r5, false, true);
            int size = A002.size();
            for (int i2 = 0; i2 < size; i2++) {
                A0T((AnonymousClass6WV) A002.get(i2));
            }
        }
    }

    private final void A0U(AnonymousClass6WV r7, ArrayList arrayList, Map map) {
        boolean A1a = C36361kB.A1a(r7.A04.A0C, AnonymousClass5RW.Rtl);
        C1496172a A072 = r7.A07();
        boolean z = A072.A02.get(C114205gq.A0C);
        if (z == null) {
            z = false;
        }
        boolean A1X = AnonymousClass000.A1X(z);
        if (A1X || A0Z(r7)) {
            Set keySet = A0H(this).keySet();
            Integer valueOf = Integer.valueOf(r7.A02);
            if (keySet.contains(valueOf)) {
                arrayList.add(r7);
            }
            if (A1X) {
                map.put(valueOf, A0G(C90504aG.A0u(AnonymousClass6WV.A00(r7, !r7.A06, false)), A1a));
                return;
            }
        }
        List A002 = AnonymousClass6WV.A00(r7, !r7.A06, false);
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            A0U((AnonymousClass6WV) A002.get(i), arrayList, map);
        }
    }

    public static final boolean A0W(AnonymousClass62P r3) {
        AnonymousClass00S r2 = r3.A01;
        if (C90464aC.A03(r2) > 0.0f && !r3.A02) {
            return true;
        }
        if (C90464aC.A03(r2) >= C90464aC.A03(r3.A00) || !r3.A02) {
            return false;
        }
        return true;
    }

    public static final boolean A0X(AnonymousClass62P r3) {
        AnonymousClass00S r2 = r3.A01;
        if (C90464aC.A03(r2) < C90464aC.A03(r3.A00) && !r3.A02) {
            return true;
        }
        if (C90464aC.A03(r2) <= 0.0f || !r3.A02) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (A0a(r5) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0Z(X.AnonymousClass6WV r5) {
        /*
            r4 = this;
            X.72a r3 = r5.A05
            X.62Q r0 = X.C114205gq.A02
            java.lang.Object r0 = X.AnonymousClass5XP.A01(r3, r0)
            r2 = 0
            if (r0 != 0) goto L_0x001e
            android.text.SpannableString r0 = r4.A06(r5)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r4.A0E(r5)
            if (r0 != 0) goto L_0x001e
            boolean r0 = A0a(r5)
            r1 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x002b
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Z(X.6WV):boolean");
    }

    public static final boolean A0a(AnonymousClass6WV r4) {
        C1496172a r42 = r4.A05;
        Object A022 = AnonymousClass5XP.A02(r42, C114205gq.A0P);
        AnonymousClass68P r1 = (AnonymousClass68P) AnonymousClass5XP.A02(r42, C114205gq.A0H);
        boolean A1V = AnonymousClass000.A1V(A022);
        if (AnonymousClass5XP.A02(r42, C114205gq.A0J) == null) {
            return A1V;
        }
        if (r1 == null || r1.A00 != 4) {
            return true;
        }
        return A1V;
    }

    private final boolean A0b(AnonymousClass6WV r12, int i, int i2, boolean z) {
        String A0F2;
        Integer num;
        C1496172a r2 = r12.A05;
        AnonymousClass62Q r1 = C114195gp.A0K;
        boolean z2 = false;
        if (!C1496172a.A00(r2, r1) || !AnonymousClass6XD.A04(r12)) {
            if ((i == i2 && i2 == this.A00) || (A0F2 = A0F(r12)) == null) {
                return false;
            }
            if (i < 0 || i != i2 || i2 > A0F2.length()) {
                i = -1;
            }
            this.A00 = i;
            int length = A0F2.length();
            if (length > 0) {
                z2 = true;
            }
            int i3 = r12.A02;
            int A022 = A02(this, i3);
            Integer num2 = null;
            if (z2) {
                num = Integer.valueOf(this.A00);
                num2 = Integer.valueOf(length);
            } else {
                num = null;
            }
            A0K(A0A(this, A0F2, num, num, num2, A022), this);
            A0O(this, i3);
            return true;
        }
        C019408g r3 = (C019408g) ((AnonymousClass69I) r2.A01(r1)).A01;
        if (r3 != null) {
            return AnonymousClass000.A1X(r3.BKt(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r13 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ all -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[Catch:{ all -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0m(X.C023509x r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C151647Aj
            if (r0 == 0) goto L_0x002f
            r8 = r3
            X.7Aj r8 = (X.C151647Aj) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r8.label = r2
        L_0x0014:
            java.lang.Object r1 = r8.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r5) goto L_0x003a
            if (r0 != r6) goto L_0x0035
            java.lang.Object r4 = r8.L$2
            X.0iv r4 = (X.C12950iv) r4
            java.lang.Object r3 = r8.L$1
            X.00a r3 = (X.C000000a) r3
            java.lang.Object r2 = r8.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0058
        L_0x002f:
            X.7Aj r8 = new X.7Aj
            r8.<init>(r15, r3)
            goto L_0x0014
        L_0x0035:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            throw r1
        L_0x003a:
            java.lang.Object r4 = r8.L$2
            X.0iv r4 = (X.C12950iv) r4
            java.lang.Object r3 = r8.L$1
            X.00a r3 = (X.C000000a) r3
            java.lang.Object r2 = r8.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x006b
        L_0x0047:
            X.AnonymousClass0AN.A00(r1)
            r0 = 0
            X.00a r3 = new X.00a     // Catch:{ all -> 0x01c3 }
            r3.<init>(r0)     // Catch:{ all -> 0x01c3 }
            X.0sR r0 = r15.A0a     // Catch:{ all -> 0x01c3 }
            X.0iv r4 = r0.BNo()     // Catch:{ all -> 0x01c3 }
            r2 = r15
            goto L_0x005b
        L_0x0058:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x01c1 }
        L_0x005b:
            r8.L$0 = r2     // Catch:{ all -> 0x01c1 }
            r8.L$1 = r3     // Catch:{ all -> 0x01c1 }
            r8.L$2 = r4     // Catch:{ all -> 0x01c1 }
            r8.label = r5     // Catch:{ all -> 0x01c1 }
            java.lang.Object r1 = r4.A01(r8)     // Catch:{ all -> 0x01c1 }
            if (r1 != r7) goto L_0x006e
            goto L_0x01b7
        L_0x006b:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x01c1 }
        L_0x006e:
            boolean r0 = X.AnonymousClass000.A1X(r1)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01b9
            r4.A00()     // Catch:{ all -> 0x01c1 }
            X.6Pr r1 = r2.A09     // Catch:{ all -> 0x01c1 }
            r0 = 1
            if (r1 != 0) goto L_0x007d
            r0 = 0
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r2.A0I()     // Catch:{ all -> 0x01c1 }
        L_0x0082:
            boolean r0 = r2.A0o()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0197
            X.00a r11 = r2.A0S     // Catch:{ all -> 0x01c1 }
            int r10 = r11.size()     // Catch:{ all -> 0x01c1 }
            r9 = 0
        L_0x008f:
            if (r9 >= r10) goto L_0x0187
            java.lang.Object[] r0 = r11.A02     // Catch:{ all -> 0x01c1 }
            r14 = r0[r9]     // Catch:{ all -> 0x01c1 }
            X.6gp r14 = (X.C137846gp) r14     // Catch:{ all -> 0x01c1 }
            r13 = r14
            X.7mZ r0 = r14.A09     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0121
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A0T     // Catch:{ all -> 0x01c1 }
            X.4dt r0 = r0.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0121
            r12 = 0
            int r1 = r11.size()     // Catch:{ all -> 0x01c1 }
        L_0x00af:
            if (r12 >= r1) goto L_0x00c0
            java.lang.Object[] r0 = r11.A02     // Catch:{ all -> 0x01c1 }
            r0 = r0[r12]     // Catch:{ all -> 0x01c1 }
            X.6gp r0 = (X.C137846gp) r0     // Catch:{ all -> 0x01c1 }
            boolean r0 = X.AnonymousClass6XD.A03(r0, r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0121
            int r12 = r12 + 1
            goto L_0x00af
        L_0x00c0:
            X.6XQ r0 = r14.A0R     // Catch:{ all -> 0x01c1 }
            r1 = 8
            X.6gq r0 = r0.A02     // Catch:{ all -> 0x01c1 }
            int r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x00e5
            X.7Wq r1 = X.C155587Wq.A00     // Catch:{ all -> 0x01c1 }
        L_0x00d1:
            X.6gp r13 = r13.A0A()     // Catch:{ all -> 0x01c1 }
            if (r13 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.invoke(r13)     // Catch:{ all -> 0x01c1 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00d1
            goto L_0x00e3
        L_0x00e2:
            r13 = 0
        L_0x00e3:
            if (r13 == 0) goto L_0x0121
        L_0x00e5:
            X.72a r0 = r13.A0B()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0121
            boolean r0 = r0.A01     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0107
            X.7Wp r12 = X.C155577Wp.A00     // Catch:{ all -> 0x01c1 }
            r1 = r13
        L_0x00f2:
            X.6gp r1 = r1.A0A()     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x0103
            java.lang.Object r0 = r12.invoke(r1)     // Catch:{ all -> 0x01c1 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00f2
            goto L_0x0104
        L_0x0103:
            r1 = 0
        L_0x0104:
            if (r1 == 0) goto L_0x0107
            r13 = r1
        L_0x0107:
            int r1 = r13.A01     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c1 }
            boolean r0 = r3.add(r0)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0121
            int r13 = A02(r2, r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01c1 }
            r1 = 0
            r0 = 2048(0x800, float:2.87E-42)
            A0P(r2, r12, r1, r13, r0)     // Catch:{ all -> 0x01c1 }
        L_0x0121:
            X.7mZ r0 = r14.A09     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x014d
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A0T     // Catch:{ all -> 0x01c1 }
            X.4dt r0 = r0.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x014d
            int r1 = r14.A01     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r2.A0V     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r13 = r0.get(r12)     // Catch:{ all -> 0x01c1 }
            X.62P r13 = (X.AnonymousClass62P) r13     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r2.A0W     // Catch:{ all -> 0x01c1 }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ all -> 0x01c1 }
            X.62P r12 = (X.AnonymousClass62P) r12     // Catch:{ all -> 0x01c1 }
            if (r13 != 0) goto L_0x0151
            if (r12 != 0) goto L_0x0151
        L_0x014d:
            int r9 = r9 + 1
            goto L_0x008f
        L_0x0151:
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r1 = A09(r2, r1, r0)     // Catch:{ all -> 0x01c1 }
            if (r13 == 0) goto L_0x016d
            X.00S r0 = r13.A01     // Catch:{ all -> 0x01c1 }
            float r0 = X.C90464aC.A03(r0)     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setScrollX(r0)     // Catch:{ all -> 0x01c1 }
            X.00S r0 = r13.A00     // Catch:{ all -> 0x01c1 }
            float r0 = X.C90464aC.A03(r0)     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setMaxScrollX(r0)     // Catch:{ all -> 0x01c1 }
        L_0x016d:
            if (r12 == 0) goto L_0x0183
            X.00S r0 = r12.A01     // Catch:{ all -> 0x01c1 }
            float r0 = X.C90464aC.A03(r0)     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setScrollY(r0)     // Catch:{ all -> 0x01c1 }
            X.00S r0 = r12.A00     // Catch:{ all -> 0x01c1 }
            float r0 = X.C90464aC.A03(r0)     // Catch:{ all -> 0x01c1 }
            int r0 = (int) r0     // Catch:{ all -> 0x01c1 }
            r1.setMaxScrollY(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0183:
            A0K(r1, r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x014d
        L_0x0187:
            r3.clear()     // Catch:{ all -> 0x01c1 }
            boolean r0 = r2.A0G     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x0197
            r2.A0G = r5     // Catch:{ all -> 0x01c1 }
            android.os.Handler r1 = r2.A0M     // Catch:{ all -> 0x01c1 }
            java.lang.Runnable r0 = r2.A0U     // Catch:{ all -> 0x01c1 }
            r1.post(r0)     // Catch:{ all -> 0x01c1 }
        L_0x0197:
            X.00a r0 = r2.A0S     // Catch:{ all -> 0x01c1 }
            r0.clear()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r2.A0V     // Catch:{ all -> 0x01c1 }
            r0.clear()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r0 = r2.A0W     // Catch:{ all -> 0x01c1 }
            r0.clear()     // Catch:{ all -> 0x01c1 }
            r0 = 100
            r8.L$0 = r2     // Catch:{ all -> 0x01c1 }
            r8.L$1 = r3     // Catch:{ all -> 0x01c1 }
            r8.L$2 = r4     // Catch:{ all -> 0x01c1 }
            r8.label = r6     // Catch:{ all -> 0x01c1 }
            java.lang.Object r0 = X.C07330Xf.A00(r8, r0)     // Catch:{ all -> 0x01c1 }
            if (r0 != r7) goto L_0x005b
            goto L_0x01b8
        L_0x01b7:
            return r7
        L_0x01b8:
            return r7
        L_0x01b9:
            X.00a r0 = r2.A0S
            r0.clear()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x01c1:
            r1 = move-exception
            goto L_0x01c5
        L_0x01c3:
            r1 = move-exception
            r2 = r15
        L_0x01c5:
            X.00a r0 = r2.A0S
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0m(X.09x):java.lang.Object");
    }

    public void BhA(AnonymousClass012 r2) {
        A0S(this.A0T.A0i.A00());
        A0I();
    }

    public void Bhq(AnonymousClass012 r2) {
        A0T(this.A0T.A0i.A00());
        A0I();
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0T = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0P = accessibilityManager;
        this.A0N = new C135946dW(this);
        this.A0O = new C135956dX(this);
        this.A0E = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0B = C023109s.A00;
        this.A0M = C36341k9.A0H();
        this.A0J = new AnonymousClass0X7(new C92484e3(this));
        this.A01 = Integer.MIN_VALUE;
        this.A0V = AnonymousClass001.A0J();
        this.A0W = AnonymousClass001.A0J();
        this.A05 = new C10890fO(10);
        this.A06 = new C10890fO(10);
        this.A00 = -1;
        this.A0S = new C000000a(0);
        this.A0a = new C12960iw(1);
        this.A0H = true;
        this.A0Q = new AnonymousClass008();
        this.A0R = new C000000a(0);
        this.A0K = C000400e.A0D();
        this.A04 = new C000000a(0);
        this.A0D = AnonymousClass001.A0J();
        this.A0C = AnonymousClass001.A0J();
        this.A0Z = new C114415hD();
        this.A0F = C36431kI.A1G();
        this.A08 = new C120705rw(androidComposeView.A0i.A00(), C000400e.A0D());
        androidComposeView.addOnAttachStateChangeListener(new C135396cd(this));
        this.A0U = new AnonymousClass759((Object) this, 10);
        this.A0X = AnonymousClass001.A0I();
        this.A0Y = new C154147Rb(this);
    }

    public static ViewParent A08(View view) {
        return view.getParentForAccessibility();
    }

    public static final AccessibilityEvent A09(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        C118355nk r0;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0T;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0o() && (r0 = (C118355nk) C36371kC.A0r(A0H(androidComposeViewAccessibilityDelegateCompat), i)) != null) {
            obtain.setPassword(C1496172a.A00(r0.A01.A07(), C114205gq.A0F));
        }
        return obtain;
    }

    public static final AnonymousClass6FW A0C(C1496172a r3) {
        C006302t r1;
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass69I A002 = AnonymousClass5XP.A00(r3, C114195gp.A07);
        if (A002 == null || (r1 = (C006302t) A002.A01) == null || !C90464aC.A1Y(A0I2, r1)) {
            return null;
        }
        return (AnonymousClass6FW) C36441kJ.A12(A0I2);
    }

    public static final CharSequence A0D(CharSequence charSequence) {
        int i = 100000;
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        AnonymousClass00C.A0E(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b7 A[LOOP:1: B:7:0x0031->B:19:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[EDGE_INSN: B:43:0x00d1->B:23:0x00d1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A0G(java.util.List r20, boolean r21) {
        /*
            r19 = this;
            java.util.LinkedHashMap r14 = X.C36431kI.A1G()
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            r4 = r20
            int r3 = r4.size()
            r2 = 0
        L_0x000f:
            r18 = r19
            if (r2 >= r3) goto L_0x0021
            java.lang.Object r1 = r4.get(r2)
            X.6WV r1 = (X.AnonymousClass6WV) r1
            r0 = r18
            r0.A0U(r1, r13, r14)
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0021:
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            r11 = 0
            X.AnonymousClass00C.A0D(r13, r11)
            int r10 = X.C36431kI.A07(r13)
            r9 = 0
            if (r10 < 0) goto L_0x00d1
            r8 = 0
        L_0x0031:
            java.lang.Object r7 = r13.get(r8)
            X.6WV r7 = (X.AnonymousClass6WV) r7
            if (r8 == 0) goto L_0x00c0
            X.6QC r0 = r7.A05()
            float r6 = r0.A03
            X.6QC r0 = r7.A05()
            float r5 = r0.A00
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            boolean r17 = X.C36401kF.A1U(r0)
            X.AnonymousClass00C.A0D(r12, r11)
            int r0 = X.C36431kI.A07(r12)
            if (r0 < 0) goto L_0x00c0
            r4 = 0
        L_0x0055:
            java.lang.Object r1 = r12.get(r4)
            X.011 r1 = (X.AnonymousClass011) r1
            java.lang.Object r3 = r1.first
            X.6QC r3 = (X.AnonymousClass6QC) r3
            float r2 = r3.A03
            float r1 = r3.A00
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.C36401kF.A1U(r1)
            if (r17 != 0) goto L_0x00bb
            if (r1 != 0) goto L_0x00bb
            float r2 = r3.A03
            float r16 = java.lang.Math.max(r6, r2)
            float r1 = r3.A00
            float r15 = java.lang.Math.min(r5, r1)
            int r15 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x00bb
            r15 = 0
            float r0 = r3.A01
            float r0 = java.lang.Math.max(r0, r15)
            float r2 = java.lang.Math.max(r2, r6)
            float r6 = r3.A02
            r3 = 2139095040(0x7f800000, float:Infinity)
            float r3 = java.lang.Math.min(r6, r3)
            float r5 = java.lang.Math.min(r1, r5)
            X.6QC r1 = new X.6QC
            r1.<init>(r0, r2, r3, r5)
            java.lang.Object r0 = r12.get(r4)
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            X.011 r0 = X.C36441kJ.A19(r1, r0)
            r12.set(r4, r0)
            java.lang.Object r0 = r12.get(r4)
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
        L_0x00b5:
            if (r8 == r10) goto L_0x00d1
            int r8 = r8 + 1
            goto L_0x0031
        L_0x00bb:
            if (r4 == r0) goto L_0x00c0
            int r4 = r4 + 1
            goto L_0x0055
        L_0x00c0:
            X.6QC r1 = r7.A05()
            r0 = 1
            X.6WV[] r0 = new X.AnonymousClass6WV[r0]
            r0[r11] = r7
            java.util.ArrayList r0 = X.AnonymousClass03T.A03(r0)
            X.C90494aF.A1F(r1, r0, r12)
            goto L_0x00b5
        L_0x00d1:
            X.75g r0 = X.C1504375g.A00
            X.AnonymousClass03X.A08(r12, r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r7 = r12.size()
            r6 = 0
        L_0x00df:
            if (r6 >= r7) goto L_0x0107
            java.lang.Object r5 = r12.get(r6)
            X.011 r5 = (X.AnonymousClass011) r5
            java.lang.Object r4 = r5.second
            java.util.List r4 = (java.util.List) r4
            if (r21 == 0) goto L_0x0104
            X.75f r2 = X.C1504275f.A00
        L_0x00ef:
            java.util.Comparator r0 = X.C137846gp.A0V
            X.7qv r1 = new X.7qv
            r1.<init>(r2, r0, r11)
            r0 = 5
            X.C163897qw.A00(r1, r4, r0)
            java.lang.Object r0 = r5.second
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            int r6 = r6 + 1
            goto L_0x00df
        L_0x0104:
            X.75e r2 = X.C1504175e.A00
            goto L_0x00ef
        L_0x0107:
            X.7ZS r1 = X.AnonymousClass7ZS.A00
            r0 = 4
            X.C163897qw.A00(r1, r3, r0)
        L_0x010d:
            X.AnonymousClass00C.A0D(r3, r11)
            int r0 = X.C36431kI.A07(r3)
            if (r9 > r0) goto L_0x0145
            java.lang.Object r0 = r3.get(r9)
            X.6WV r0 = (X.AnonymousClass6WV) r0
            int r0 = r0.A02
            java.lang.Object r2 = X.C90484aE.A0j(r14, r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0142
            java.lang.Object r1 = r3.get(r9)
            X.6WV r1 = (X.AnonymousClass6WV) r1
            r0 = r18
            boolean r0 = r0.A0Z(r1)
            if (r0 != 0) goto L_0x013f
            r3.remove(r9)
        L_0x0137:
            r3.addAll(r9, r2)
            int r9 = X.C90524aI.A04(r2, r9)
            goto L_0x010d
        L_0x013f:
            int r9 = r9 + 1
            goto L_0x0137
        L_0x0142:
            int r9 = r9 + 1
            goto L_0x010d
        L_0x0145:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0G(java.util.List, boolean):java.util.ArrayList");
    }

    public static final void A0K(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0o()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                androidComposeViewAccessibilityDelegateCompat.A0I = true;
            }
            try {
                androidComposeViewAccessibilityDelegateCompat.A0L.invoke(accessibilityEvent);
            } finally {
                androidComposeViewAccessibilityDelegateCompat.A0I = false;
            }
        }
    }

    public static final void A0M(C120705rw r9, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass6WV r11) {
        LinkedHashSet A17 = C36441kJ.A17();
        List A002 = AnonymousClass6WV.A00(r11, false, true);
        int size = A002.size();
        int i = 0;
        while (true) {
            if (i < size) {
                AnonymousClass6WV r8 = (AnonymousClass6WV) A002.get(i);
                if (C90484aE.A1Y(A0H(androidComposeViewAccessibilityDelegateCompat), r8.A02)) {
                    if (!AnonymousClass000.A1Z(r9.A02, r8.A02)) {
                        break;
                    }
                    AnonymousClass000.A1F(A17, r8.A02);
                }
                i++;
            } else {
                Iterator it = r9.A02.iterator();
                while (it.hasNext()) {
                    if (!C36381kD.A1Z(A17, C36341k9.A0A(it))) {
                    }
                }
                List A003 = AnonymousClass6WV.A00(r11, false, true);
                int size2 = A003.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AnonymousClass6WV r2 = (AnonymousClass6WV) A003.get(i2);
                    if (C90484aE.A1Y(A0H(androidComposeViewAccessibilityDelegateCompat), r2.A02)) {
                        Object A0r = C36371kC.A0r(androidComposeViewAccessibilityDelegateCompat.A0F, r2.A02);
                        AnonymousClass00C.A0B(A0r);
                        A0M((C120705rw) A0r, androidComposeViewAccessibilityDelegateCompat, r2);
                    }
                }
                return;
            }
        }
        A0L(r11.A04, androidComposeViewAccessibilityDelegateCompat);
    }

    public static final void A0R(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent A092 = A09(androidComposeViewAccessibilityDelegateCompat, A02(androidComposeViewAccessibilityDelegateCompat, i), 32);
        A092.setContentChangeTypes(i2);
        if (str != null) {
            A092.getText().add(str);
        }
        A0K(A092, androidComposeViewAccessibilityDelegateCompat);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0c(java.util.List r11) {
        /*
            int r1 = r11.size()
            r6 = 1
            r0 = 2
            if (r1 < r0) goto L_0x00c5
            int r0 = r11.size()
            r1 = 0
            if (r0 == 0) goto L_0x0075
            int r0 = r11.size()
            if (r0 == r6) goto L_0x0075
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.Object r9 = r11.get(r1)
            int r4 = X.C36431kI.A07(r11)
            r3 = 0
        L_0x0022:
            if (r3 >= r4) goto L_0x0077
            int r3 = r3 + 1
            java.lang.Object r10 = r11.get(r3)
            r8 = r10
            X.6WV r8 = (X.AnonymousClass6WV) r8
            X.6WV r9 = (X.AnonymousClass6WV) r9
            X.6QC r0 = r9.A04()
            long r0 = r0.A00()
            float r2 = X.C133206Xf.A00(r0)
            X.6QC r0 = r8.A04()
            long r0 = r0.A00()
            float r0 = X.C133206Xf.A00(r0)
            float r7 = X.C90494aF.A01(r2, r0)
            X.6QC r0 = r9.A04()
            long r0 = r0.A00()
            float r2 = X.C133206Xf.A01(r0)
            X.6QC r0 = r8.A04()
            long r0 = r0.A00()
            float r0 = X.C133206Xf.A01(r0)
            float r0 = X.C90494aF.A01(r2, r0)
            long r1 = X.C90464aC.A0B(r7, r0)
            X.6Xf r0 = new X.6Xf
            r0.<init>(r1)
            r5.add(r0)
            r9 = r10
            goto L_0x0022
        L_0x0075:
            X.09w r5 = X.C023409w.A00
        L_0x0077:
            int r0 = r5.size()
            if (r0 != r6) goto L_0x0093
            java.lang.Object r8 = X.C007103b.A0L(r5)
        L_0x0081:
            X.6Xf r8 = (X.C133206Xf) r8
            long r2 = r8.A00
            float r1 = X.C133206Xf.A00(r2)
            float r0 = X.C133206Xf.A01(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            r6 = 0
            return r6
        L_0x0093:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.lang.Object r8 = X.C007103b.A0L(r5)
            int r7 = X.C36431kI.A07(r5)
            if (r6 > r7) goto L_0x0081
            r4 = 1
        L_0x00a4:
            java.lang.Object r0 = r5.get(r4)
            X.6Xf r0 = (X.C133206Xf) r0
            long r2 = r0.A00
            X.6Xf r8 = (X.C133206Xf) r8
            long r0 = r8.A00
            long r0 = X.C133206Xf.A03(r0, r2)
            X.6Xf r8 = new X.6Xf
            r8.<init>(r0)
            if (r4 == r7) goto L_0x0081
            int r4 = r4 + 1
            goto L_0x00a4
        L_0x00be:
            java.lang.String r0 = "Empty collection can't be reduced."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x00c5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0c(java.util.List):boolean");
    }

    public final boolean A0p(int i, long j, boolean z) {
        AnonymousClass62Q r3;
        AnonymousClass62P r2;
        if (!AnonymousClass00C.A0J(C90514aH.A11(), Thread.currentThread())) {
            return false;
        }
        Collection<C118355nk> values = A0H(this).values();
        if (AnonymousClass000.A1Q((j > C133206Xf.A02 ? 1 : (j == C133206Xf.A02 ? 0 : -1)))) {
            return false;
        }
        if (Float.isNaN(C133206Xf.A00(j)) || Float.isNaN(C133206Xf.A01(j))) {
            throw AnonymousClass001.A09("Offset argument contained a NaN value.");
        }
        if (z) {
            r3 = C114205gq.A0R;
        } else {
            r3 = C114205gq.A08;
        }
        if (values != null && values.isEmpty()) {
            return false;
        }
        for (C118355nk r22 : values) {
            Rect rect = r22.A00;
            AnonymousClass6QC r4 = new AnonymousClass6QC((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            if (C133206Xf.A00(j) >= r4.A01 && C133206Xf.A00(j) < r4.A02 && C133206Xf.A01(j) >= r4.A03 && C133206Xf.A01(j) < r4.A00 && (r2 = (AnonymousClass62P) AnonymousClass5XP.A02(r22.A01.A07(), r3)) != null) {
                boolean z2 = r2.A02;
                int i2 = i;
                if (z2) {
                    i2 = -i;
                }
                if ((i != 0 || !z2) && i2 >= 0) {
                    if (C90464aC.A03(r2.A01) < C90464aC.A03(r2.A00)) {
                        return true;
                    }
                } else if (C90464aC.A03(r2.A01) > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass0X7 A0l(View view) {
        return this.A0J;
    }

    public final void A0n(Consumer consumer, long[] jArr) {
        AnonymousClass6W2.A02(this, consumer, jArr);
    }
}
