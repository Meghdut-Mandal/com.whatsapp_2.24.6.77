package X;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import com.facebook.bloks.common.implementations.components.imagenode.log.BloksImageCallerContext;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6lc  reason: invalid class name and case insensitive filesystem */
public class C140456lc implements C157827ek {
    public static final AnonymousClass7fC A09 = new C141966o7();
    public int A00;
    public C157187by A01;
    public Set A02;
    public final int A03;
    public final int A04;
    public final SparseArray A05;
    public final C140456lc A06;
    public final LinkedList A07;
    public final List A08;

    public static float A00(C1271967i r5, String str, String str2) {
        if (str != null) {
            try {
                return AnonymousClass6Y7.A01(str);
            } catch (AnonymousClass5R5 e) {
                Object[] A0M = AnonymousClass001.A0M();
                C36331k8.A1N(str2, str, A0M);
                AnonymousClass6RS.A00(r5, "BKBloksComponentsRichTextBinderUtil", String.format("Error parsing %s: %s", A0M), e);
            }
        }
        return 0.0f;
    }

    public static int A02(C1271967i r2, C140456lc r3, int i) {
        C140456lc A0W = r3.A0W(i);
        if (A0W != null) {
            return AnonymousClass5Z8.A01(r2, A0W, 0);
        }
        return 0;
    }

    public static final C140426lZ A06(C123035vp r2, C132456Tu r3, int i, int i2) {
        int i3;
        AnonymousClass00C.A0D(r3, 2);
        DisplayMetrics A0X = AnonymousClass000.A0X(r2.A02);
        AnonymousClass00C.A08(A0X);
        if (View.MeasureSpec.getMode(i2) == 0) {
            i3 = C14960mT.A01(((float) 52) * (((float) A0X.densityDpi) / ((float) 160)));
        } else {
            i3 = 50;
        }
        return A07(r3, A01(i, 0), A01(i2, i3));
    }

    public static C140426lZ A07(C132456Tu r2, int i, int i2) {
        return new C140426lZ(r2, (Object) null, i, i2);
    }

    public static final C118815om A09(C120825s8 r11, C123035vp r12, C140456lc r13, int i, int i2) {
        LongSparseArray longSparseArray;
        AnonymousClass00C.A0D(r13, 2);
        long j = (long) r13.A03;
        LongSparseArray longSparseArray2 = r11.A01;
        C118815om r3 = (C118815om) longSparseArray2.get(j);
        C130326Kq r7 = null;
        if (!(r3 == null && ((longSparseArray = r11.A00) == null || (r3 = (C118815om) longSparseArray.get(j)) == null))) {
            r7 = r3.A00.A01();
        }
        Context context = r12.A02;
        C128096Aw r8 = new C128096Aw(r13, (Object) null, (List) null);
        Object obj = r12.A03;
        C1271967i r32 = (C1271967i) obj;
        if (r32 != null) {
            r32.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        }
        int i3 = r12.A01;
        long A002 = AnonymousClass5YT.A00(i, i2);
        C118815om r33 = new C118815om(new C98264r9(r7, new C1507876t(context, r7, r8, obj, i3, A002), A002), r13);
        longSparseArray2.put(j, r33);
        return r33;
    }

    public C160377ku A0X(int i) {
        C139106jF r2;
        C118905ov r6;
        int i2 = i;
        Object A0I = A0I(this, i);
        if (A0I == null) {
            return null;
        }
        if (A0I instanceof C142256oa) {
            return ((C142256oa) A0I).A00(this.A01, this.A08);
        } else if (A0I instanceof C160377ku) {
            return (C160377ku) A0I;
        } else {
            if (A0I instanceof AnonymousClass6JJ) {
                return ((AnonymousClass6JJ) A0I).A00;
            }
            String str = (String) A0I;
            AnonymousClass00C.A0D(str, 2);
            C157187by r1 = this.A01;
            if (r1 != null) {
                AnonymousClass5o2 r0 = new AnonymousClass5o2(r1);
                List list = r0.A00;
                C90504aG.A10(i, list);
                r2 = new C139106jF(r0.A01, list);
            } else {
                r2 = null;
            }
            AnonymousClass6IL r4 = AnonymousClass6IL.A00;
            List list2 = this.A08;
            int i3 = this.A03;
            int i4 = this.A04;
            String str2 = (String) A0I(this, 128);
            C115205iV r5 = new C115205iV(str);
            if (list2 == null && r2 == null) {
                r6 = null;
            } else {
                r6 = new C118905ov(r2, list2);
            }
            return new C142256oa(r4, r5, r6, str2, i3, i4, i2);
        }
    }

    public void A0e(AnonymousClass7fB r5) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A05;
            if (i < sparseArray.size()) {
                Object valueAt = sparseArray.valueAt(i);
                if (valueAt != null) {
                    r5.BxL(sparseArray.keyAt(i), valueAt);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static Uri A04(C140456lc r1) {
        String A0Z = r1.A0Z(38);
        Uri uri = C112725eM.A00;
        if (A0Z != null) {
            return Uri.parse(A0Z);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (A0S(145, 0.0f) != 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r6.A02 == X.C023109s.A01) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C132456Tu A08(X.C132456Tu r6, X.C1271967i r7) {
        /*
            r5 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A0S(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r5.A0S(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r5.A0S(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r5.A0S(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r5.A0S(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r5.A0S(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r3 = r5.A0d(r0)
            if (r4 != 0) goto L_0x0058
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0057
            java.lang.Integer r1 = r6.A02
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 == r0) goto L_0x0096
        L_0x0057:
            return r6
        L_0x0058:
            if (r6 != 0) goto L_0x0096
            int r0 = r5.A03
            long r1 = (long) r0
            boolean r0 = X.C133266Xn.A08(r7)
            X.4r2 r6 = new X.4r2
            r6.<init>(r7, r1, r0)
        L_0x0066:
            r1 = 2131428001(0x7f0b02a1, float:1.8477634E38)
            X.7fC r0 = A09
            java.lang.Object r1 = r7.A02(r0, r5, r1)
            X.5iN r1 = (X.C115125iN) r1
            X.6m1 r0 = new X.6m1
            r0.<init>(r1)
            X.C1257261a.A00(r0, r6)
            if (r4 == 0) goto L_0x0083
            X.6m0 r0 = new X.6m0
            r0.<init>(r5)
            X.C1257261a.A00(r0, r6)
        L_0x0083:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            X.6m9 r0 = new X.6m9
            r0.<init>(r7, r5, r1)
            X.C1257261a.A00(r0, r6)
            return r6
        L_0x0096:
            java.lang.Integer r1 = r6.A02
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x0066
            java.lang.String r0 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140456lc.A08(X.6Tu, X.67i):X.6Tu");
    }

    public static C140436la A0A(C123035vp r10, C132456Tu r11, C140456lc r12, int i, int i2) {
        int i3;
        C140456lc A0W = r12.A0W(36);
        if (A0W != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
            C140456lc A0W2 = r12.A0W(40);
            C130326Kq r4 = null;
            C123035vp r5 = r10;
            if (A0W2 != null) {
                C161007lx B2C = A0W2.B2C(r10, i, makeMeasureSpec);
                AnonymousClass00C.A0D(B2C, 2);
                r4 = AnonymousClass6T6.A00(r5, B2C, A0W2, (Object) null, AnonymousClass5YT.A00(i, makeMeasureSpec));
            }
            int size = View.MeasureSpec.getSize(i2);
            if (r4 != null) {
                i3 = r4.A02.A02.A03.height();
            } else {
                i3 = 0;
            }
            C161007lx B2C2 = A0W.B2C(r5, i, View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE));
            return new C140436la(B2C2, r11, r4, View.MeasureSpec.getSize(i), B2C2.getHeight() + i3, i3);
        }
        throw AnonymousClass001.A09("bk.cds.bottomsheet.Wrapper has no content.");
    }

    public static C140456lc A0B(C140456lc r1) {
        return r1.A0W(132);
    }

    public static C140456lc A0C(C140456lc r2, String str) {
        C142076oI r0 = new C142076oI(new C142206oV(str));
        r2.A0g(r0);
        return r0.A00;
    }

    public static C160377ku A0E(C140456lc r1) {
        return r1.A0X(35);
    }

    public static final Integer A0F(C140456lc r4) {
        Integer num = C023109s.A00;
        String str = (String) A0I(r4, 96);
        C140456lc A0W = r4.A0W(94);
        if (str == null || A0W == null) {
            return num;
        }
        if (str.equals("grid")) {
            if (A0W.A04 == 16373) {
                return C023109s.A01;
            }
            throw AnonymousClass001.A08("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        } else if (!str.equals("staggered_grid")) {
            return num;
        } else {
            if (A0W.A04 == 16483) {
                return C023109s.A0C;
            }
            throw AnonymousClass001.A08("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
    }

    public static Object A0I(C140456lc r0, int i) {
        return r0.A05.get(i);
    }

    public static String A0J(C140456lc r1) {
        return r1.A0Z(35);
    }

    public static String A0K(C140456lc r1) {
        return r1.A0Z(36);
    }

    public static String A0L(C140456lc r1) {
        return r1.A0Z(38);
    }

    public static String A0M(C140456lc r1) {
        return r1.A0Z(40);
    }

    public static String A0N(C140456lc r1) {
        return r1.A0Z(41);
    }

    public static String A0O(C140456lc r1) {
        return r1.A0Z(42);
    }

    public View A0V(C1271967i r3) {
        if (r3 == null) {
            return null;
        }
        return ((C115125iN) r3.A02(A09, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    public C140456lc A0W(int i) {
        SparseArray sparseArray = this.A05;
        Object obj = sparseArray.get(i);
        if (obj instanceof List) {
            List A0c = A0c(i);
            if (!A0c.isEmpty()) {
                return (C140456lc) C36391kE.A0t(A0c);
            }
            return null;
        } else if (obj instanceof C140456lc) {
            return (C140456lc) sparseArray.get(i);
        } else {
            return null;
        }
    }

    public String A0Y() {
        Object A0I = A0I(this, 33);
        if (A0I == null) {
            return null;
        }
        if (A0I instanceof String) {
            return (String) A0I;
        }
        if (A0I instanceof Number) {
            return String.valueOf(C36431kI.A09(A0I));
        }
        throw C90464aC.A0P(A0I, "Bloks id only supports long and String types but got: ", AnonymousClass000.A0u());
    }

    public C140456lc(List list, int i, int i2) {
        this.A07 = null;
        this.A05 = new SparseArray(i2 + 1);
        this.A04 = i;
        this.A03 = C113005eq.A00.incrementAndGet();
        this.A08 = list;
        this.A06 = null;
        this.A01 = null;
        C114095gd.A03.incrementAndGet();
    }

    public static int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return i2;
    }

    public static final int A03(C140456lc r3) {
        C140456lc A0B = A0B(r3);
        if (A0B == null || A0B.A04 != 16372) {
            return 1;
        }
        return A0B.A0T(35, 1);
    }

    public static C140426lZ A05(View view, C132456Tu r5, int i, int i2) {
        view.measure(i, i2);
        return new C140426lZ(r5, (Object) null, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static C98194r2 A0D(C1271967i r6, C140456lc r7) {
        C128926Ed r5 = (C128926Ed) r6.A01.get(R.id.cds_bottom_sheet_screen_data);
        if (r5 == null) {
            AnonymousClass6RS.A01("CDSBottomSheetWrapperBinderUtils", "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly.");
            return null;
        }
        C98194r2 r2 = new C98194r2(r6, (long) r7.A03, C133266Xn.A08(r6));
        r2.A0E(new C1257261a(new C140666lx(r5), r7));
        return r2;
    }

    public static Object A0G(C123035vp r0, C132456Tu r1) {
        return r1.A07().B4O(r0.A02);
    }

    public static final Object A0H(C1271967i r3, C140456lc r4) {
        String str = (String) r3.A01.get(R.id.bk_context_key_app_id);
        if (str == null) {
            return "BloksImageComponent";
        }
        C140456lc A0W = r4.A0W(46);
        String str2 = null;
        if (A0W != null) {
            str2 = A0M(A0W);
        }
        return new BloksImageCallerContext(str, str2, A0W);
    }

    public static String A0P(C140456lc r0, String str, int i) {
        String A0a = r0.A0a(i, str);
        AnonymousClass00C.A08(A0a);
        return A0a;
    }

    public static boolean A0Q(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i3) {
            return true;
        }
        if (mode == Integer.MIN_VALUE && mode2 == 0) {
            if (size >= i3) {
                return true;
            }
            return false;
        } else if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || i3 > size) {
            return false;
        } else {
            return true;
        }
    }

    public static final boolean A0R(C140456lc r3) {
        C140456lc A0B = A0B(r3);
        if (A0B == null || A0B.A04 != 16372) {
            return false;
        }
        return A0B.A0f(36, false);
    }

    public float A0S(int i, float f) {
        Number number = (Number) A0I(this, i);
        if (number != null) {
            return number.floatValue();
        }
        return f;
    }

    public int A0T(int i, int i2) {
        Object A0I = A0I(this, i);
        if (A0I == null) {
            return i2;
        }
        if (!(A0I instanceof String)) {
            return AnonymousClass000.A0I(A0I);
        }
        try {
            return Integer.parseInt((String) A0I);
        } catch (NumberFormatException unused) {
            AnonymousClass6RS.A01("BloksModel", "Non-int string parsed as int");
            return i2;
        }
    }

    public long A0U(int i, long j) {
        Object A0I = A0I(this, i);
        if (A0I == null) {
            return j;
        }
        if (!(A0I instanceof String)) {
            return C36431kI.A09(A0I);
        }
        try {
            return Long.parseLong((String) A0I);
        } catch (NumberFormatException unused) {
            AnonymousClass6RS.A01("BloksModel", "Non-long string parsed as long");
            return j;
        }
    }

    public String A0Z(int i) {
        return (String) A0I(this, i);
    }

    public String A0a(int i, String str) {
        String str2 = (String) A0I(this, i);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public List A0b() {
        List A0c;
        int A002 = AnonymousClass6NR.A00().A09.A00(this);
        if (Integer.valueOf(A002) == null || A002 == -1 || (A0c = A0c(A002)) == null) {
            return Collections.emptyList();
        }
        return A0c;
    }

    public List A0c(int i) {
        Object A0I = A0I(this, i);
        if (A0I == null) {
            return Collections.emptyList();
        }
        if (!(A0I instanceof C140456lc)) {
            return (List) A0I;
        }
        ArrayList A14 = C36441kJ.A14(1);
        A14.add(A0I);
        return A14;
    }

    public List A0d(int i) {
        List list = (List) A0I(this, i);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public boolean A0f(int i, boolean z) {
        Object A0I = A0I(this, i);
        if (A0I == null) {
            return z;
        }
        if (A0I instanceof Boolean) {
            return AnonymousClass000.A1X(A0I);
        }
        if (A0I instanceof Number) {
            return AnonymousClass000.A1O(AnonymousClass000.A0I(A0I));
        }
        AnonymousClass6RS.A01("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
        return z;
    }

    public boolean A0g(AnonymousClass7fF r8) {
        if (!r8.BxM(this)) {
            AnonymousClass6T8 A012 = AnonymousClass6NR.A01();
            int i = this.A04;
            int[] A013 = A012.A01(i);
            int i2 = 0;
            while (i2 < A013.length) {
                C140456lc A0W = A0W(A013[i2]);
                if (A0W == null || !A0W.A0g(r8)) {
                    i2++;
                }
            }
            int[] A002 = AnonymousClass6NR.A01().A00(i);
            for (int A0c : A002) {
                List A0c2 = A0c(A0c);
                for (int i3 = 0; i3 < A0c2.size(); i3++) {
                    C140456lc A0K = C90504aG.A0K(A0c2, i3);
                    if (A0K != null && A0K.A0g(r8)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v144, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v145, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v146, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v228, resolved type: X.4ug} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v229, resolved type: X.4um} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v230, resolved type: X.4uj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v231, resolved type: X.4up} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v232, resolved type: X.4uk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v233, resolved type: X.4uc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v234, resolved type: X.4uo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v235, resolved type: X.4ue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v238, resolved type: X.21X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v239, resolved type: X.4ua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v240, resolved type: X.4ub} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v241, resolved type: X.4uv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v242, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v243, resolved type: X.4ul} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v244, resolved type: X.4uu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v245, resolved type: X.4uh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v246, resolved type: X.4ui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v247, resolved type: X.4ut} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v248, resolved type: X.4un} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v249, resolved type: X.4ud} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v250, resolved type: X.4uf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v251, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v252, resolved type: X.4ug} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v253, resolved type: X.4uV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v254, resolved type: X.4uW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v255, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v256, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v257, resolved type: X.4r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v258, resolved type: X.4r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v259, resolved type: X.4r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v260, resolved type: X.4uY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v261, resolved type: X.6Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v265, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v266, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v267, resolved type: X.4r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v269, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v283, resolved type: X.4r3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v287, resolved type: X.4ur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v288, resolved type: X.4us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v289, resolved type: X.4uX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v290, resolved type: X.4uw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v291, resolved type: X.6Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v292, resolved type: X.6Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v293, resolved type: X.6Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v540, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v544, resolved type: X.7lx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v548, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v549, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v550, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v551, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v552, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v553, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v554, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v555, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v556, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v557, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v558, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v559, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v560, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v561, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v562, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v563, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v564, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v565, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v566, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v567, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v568, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v569, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v570, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v571, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v572, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v573, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v574, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v575, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v576, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v577, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v578, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v579, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v580, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v581, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v582, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v586, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v587, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v588, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v589, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v590, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v591, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v592, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v593, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v594, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v595, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v299, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v300, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v301, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v302, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v303, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v304, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v305, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v306, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v36, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v307, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v308, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v309, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v310, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v311, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v312, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v313, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v314, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v315, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v316, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v317, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v318, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v319, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v320, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v321, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v322, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v323, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v324, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v325, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v326, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v327, resolved type: X.4r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v328, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v329, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v330, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v333, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v335, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v337, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v339, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v340, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v341, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v342, resolved type: X.4r2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v347, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v348, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v349, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v350, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v351, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v352, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v353, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v354, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v355, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v356, resolved type: X.4uq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v597, resolved type: X.6lZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v598, resolved type: X.6lZ} */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.6la] */
    /* JADX WARNING: type inference failed for: r3v73, types: [X.6lW] */
    /* JADX WARNING: type inference failed for: r3v77, types: [X.7lx] */
    /* JADX WARNING: type inference failed for: r3v108, types: [X.7lx] */
    /* JADX WARNING: type inference failed for: r3v109, types: [X.7lx] */
    /* JADX WARNING: type inference failed for: r3v110, types: [X.7lx] */
    /* JADX WARNING: type inference failed for: r3v246, types: [X.6lY] */
    /* JADX WARNING: type inference failed for: r3v256, types: [X.6lY] */
    /* JADX WARNING: type inference failed for: r6v144, types: [X.4n1] */
    /* JADX WARNING: type inference failed for: r6v145, types: [X.4n8] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1004:0x141a, code lost:
        r12 = X.AnonymousClass5Y2.A00(r0);
        r3 = A0b();
        r13 = new X.C120825s8(r7, r0);
        r27 = X.C36361kB.A0r(A0b());
        X.AnonymousClass00C.A0B(r3);
        r19 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1006:0x143a, code lost:
        if (r19.hasNext() == false) goto L_0x1504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1007:0x143c, code lost:
        r11 = X.C90514aH.A0Y(r19);
        X.AnonymousClass00C.A0B(r11);
        r4 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1008:0x1447, code lost:
        if (r12 != 1) goto L_0x1500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1009:0x1449, code lost:
        if (r4 == 0) goto L_0x1500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1010:0x144b, code lost:
        r1 = X.C112845eY.A00;
        r10 = X.C90504aG.A08(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1011:0x1451, code lost:
        r14 = A0B(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1012:0x1455, code lost:
        if (r14 == null) goto L_0x149b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1014:0x145b, code lost:
        if (r14.A04 != 13366) goto L_0x149b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1015:0x145d, code lost:
        r14 = A0N(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1016:0x1461, code lost:
        if (r12 != 0) goto L_0x149b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x1463, code lost:
        if (r14 == null) goto L_0x149b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1019:?, code lost:
        r1 = X.AnonymousClass6Y7.A0A(r14);
        r3 = r1.A00;
        r1 = r1.A01.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x1471, code lost:
        if (r1 == 0) goto L_0x1484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1021:0x1473, code lost:
        if (r1 != 1) goto L_0x149b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x1475, code lost:
        r10 = android.view.View.MeasureSpec.makeMeasureSpec((int) (((double) (r3 * ((float) r4))) / 100.0d), 1073741824);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1023:0x1484, code lost:
        r10 = android.view.View.MeasureSpec.makeMeasureSpec((int) r3, 1073741824);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x148c, code lost:
        X.AnonymousClass6RS.A01("ListCollectionMeasureHelper", X.AnonymousClass000.A0p("Error parsing style width: ", r14, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1047:0x1500, code lost:
        r10 = X.C112845eY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1049:0x150c, code lost:
        if ((!A0f(63, false)) == false) goto L_0x1553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1050:0x150e, code lost:
        r7 = android.view.View.MeasureSpec.getMode(r44);
        r4 = android.view.View.MeasureSpec.getMode(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1051:0x151a, code lost:
        if (r7 == 1073741824) goto L_0x151e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1052:0x151c, code lost:
        if (r7 != Integer.MIN_VALUE) goto L_0x1553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1053:0x151e, code lost:
        if (r4 == 1073741824) goto L_0x1522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1054:0x1520, code lost:
        if (r4 != Integer.MIN_VALUE) goto L_0x1553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1055:0x1522, code lost:
        r14 = new int[]{android.view.View.MeasureSpec.getSize(r44), android.view.View.MeasureSpec.getSize(r8)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1056:0x1530, code lost:
        r5 = r14[0];
        r6 = r14[1];
        r1 = r27;
        r3 = new X.C140426lZ(r2, new X.C98274rA(X.AnonymousClass6UV.A01(r1, r0.A03, A0f(73, false)), new X.C120935sK(r1, r5, r6)), r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1059:?, code lost:
        r4 = (java.lang.String) A0I(r0, 55);
        r7 = (java.lang.String) A0I(r0, 56);
        r3 = (java.lang.String) A0I(r0, 44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1060:0x156b, code lost:
        if (r4 != null) goto L_0x156e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1062:0x156e, code lost:
        r4 = X.AnonymousClass6Y7.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1063:0x1573, code lost:
        r4 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1064:0x1574, code lost:
        if (r7 != null) goto L_0x1594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1065:0x1576, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1066:0x1577, code lost:
        if (r3 != null) goto L_0x158f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:0x1579, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1068:0x157a, code lost:
        r26 = (int) r1;
        r25 = (int) r3;
        r24 = (int) r4;
        r13 = 0;
        r23 = false;
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1069:0x1588, code lost:
        if (r12 != 0) goto L_0x1599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1070:0x158a, code lost:
        r23 = true;
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1071:0x158f, code lost:
        r3 = X.AnonymousClass6Y7.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1072:0x1594, code lost:
        r1 = X.AnonymousClass6Y7.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1073:0x1599, code lost:
        r12 = android.view.View.MeasureSpec.getMode(r44);
        r11 = android.view.View.MeasureSpec.getMode(r8);
        r14 = new int[]{-1, -1};
        r10 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1074:0x15ac, code lost:
        if (r12 != 1073741824) goto L_0x15b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1075:0x15ae, code lost:
        r14[0] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1076:0x15b0, code lost:
        r7 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1077:0x15b4, code lost:
        if (r11 != 1073741824) goto L_0x15b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x15b6, code lost:
        r14[1] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1079:0x15b8, code lost:
        if (r12 != 1073741824) goto L_0x15be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1080:0x15ba, code lost:
        if (r11 != 1073741824) goto L_0x15be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1082:0x15be, code lost:
        r21 = 0;
        r20 = 0;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1083:0x15c4, code lost:
        if (r23 == false) goto L_0x15cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1084:0x15c6, code lost:
        r21 = r26;
        r20 = r25;
        r19 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1085:0x15cc, code lost:
        if (r22 != false) goto L_0x15d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1086:0x15ce, code lost:
        r26 = 0;
        r25 = 0;
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1087:0x15d4, code lost:
        r5 = 0;
        r18 = 0;
        r4 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1089:0x15dd, code lost:
        if (r5 >= r27.size()) goto L_0x1668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1090:0x15df, code lost:
        r28 = ((X.C130326Kq) ((X.C118815om) r27.get(r5)).A00.A00()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1091:0x15f3, code lost:
        r17 = X.AnonymousClass000.A1Q(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1094:0x15fb, code lost:
        r15 = X.C36381kD.A1U(r5, X.C90504aG.A0C(r27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1096:?, code lost:
        r1 = r28.A02.A03.width();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1097:0x1609, code lost:
        if (r15 == false) goto L_0x1612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1098:0x160b, code lost:
        if (r17 == false) goto L_0x160f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1099:0x160d, code lost:
        r1 = r21 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1100:0x160f, code lost:
        r1 = r1 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1101:0x1612, code lost:
        if (r17 == false) goto L_0x1616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1102:0x1614, code lost:
        r1 = r21 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1103:0x1616, code lost:
        r1 = r1 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1104:0x1618, code lost:
        r13 = java.lang.Math.max(r13, r1);
        r18 = r18 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1105:0x1620, code lost:
        if (r12 != Integer.MIN_VALUE) goto L_0x162e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1106:0x1622, code lost:
        if (r23 == false) goto L_0x1628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1108:0x1626, code lost:
        if (r18 >= r10) goto L_0x162c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1109:0x1628, code lost:
        if (r22 == false) goto L_0x162e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1110:0x162a, code lost:
        if (r13 < r10) goto L_0x162e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1111:0x162c, code lost:
        r14[0] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1112:0x162e, code lost:
        r1 = r28.A02.A03.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1113:0x1638, code lost:
        if (r15 == false) goto L_0x1641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1114:0x163a, code lost:
        if (r17 == false) goto L_0x163e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1115:0x163c, code lost:
        r1 = r1 + r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1116:0x163e, code lost:
        r1 = r1 + r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1117:0x1641, code lost:
        if (r17 == false) goto L_0x1645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1118:0x1643, code lost:
        r1 = r1 + r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1119:0x1645, code lost:
        r1 = r1 + r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1120:0x1647, code lost:
        r4 = java.lang.Math.max(r4, r1);
        r3 = r3 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1121:0x164e, code lost:
        if (r11 != Integer.MIN_VALUE) goto L_0x165a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1122:0x1650, code lost:
        if (r22 == false) goto L_0x1654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1123:0x1652, code lost:
        if (r3 >= r7) goto L_0x1658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1124:0x1654, code lost:
        if (r23 == false) goto L_0x165a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1125:0x1656, code lost:
        if (r4 < r7) goto L_0x165a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1126:0x1658, code lost:
        r14[1] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1128:0x165d, code lost:
        if (r14[0] <= -1) goto L_0x1664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1130:0x1661, code lost:
        if (r14[1] <= -1) goto L_0x1664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1132:0x1664, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1133:0x1668, code lost:
        if (r12 != 0) goto L_0x166f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1134:0x166a, code lost:
        if (r23 == false) goto L_0x1681;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1135:0x166c, code lost:
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1137:0x1671, code lost:
        if (r12 != Integer.MIN_VALUE) goto L_0x1683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1138:0x1673, code lost:
        if (r23 == false) goto L_0x1676;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1140:0x1676, code lost:
        r13 = java.lang.Math.min(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x167b, code lost:
        r13 = java.lang.Math.min(r18, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1142:0x1681, code lost:
        r14[0] = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1143:0x1683, code lost:
        if (r11 != 0) goto L_0x168c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1144:0x1685, code lost:
        if (r22 == false) goto L_0x1688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1145:0x1687, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1146:0x1688, code lost:
        r14[1] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1148:0x168e, code lost:
        if (r11 != Integer.MIN_VALUE) goto L_0x1530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1149:0x1690, code lost:
        if (r22 == false) goto L_0x1697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1150:0x1692, code lost:
        r1 = java.lang.Math.min(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1151:0x1697, code lost:
        r1 = java.lang.Math.min(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1152:0x169b, code lost:
        r14[1] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1153:0x169f, code lost:
        r15 = A0S(35, 0.0f);
        r9 = A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1154:0x16ad, code lost:
        if (r15 != 0.0f) goto L_0x16ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1155:0x16af, code lost:
        r3 = r9.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1156:0x16b3, code lost:
        r1 = ((X.C140456lc) r3).B2C(r7, r44, r8);
        r3 = new X.C140416lY(r2, X.C90484aE.A0r(r1), r1.getWidth(), r1.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1158:0x16d3, code lost:
        if (r15 != 1.0f) goto L_0x16da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1159:0x16d5, code lost:
        r3 = r9.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1160:0x16da, code lost:
        r3 = r44;
        r10 = X.C90504aG.A0K(r9, 0).B2C(r7, r3, r8);
        r13 = X.C90504aG.A0K(r9, 1).B2C(r7, r3, r8);
        r6 = r10.getWidth();
        r12 = (int) (((float) r6) + (((float) (r13.getWidth() - r6)) * r15));
        r6 = r10.getHeight();
        r6 = (int) (((float) r6) + (((float) (r13.getHeight() - r6)) * r15));
        r5 = X.AnonymousClass001.A0I();
        r11 = (android.util.Pair) X.C133266Xn.A05(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1161:0x1712, code lost:
        if (r11 == null) goto L_0x2305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1163:0x171a, code lost:
        if (A0f(36, false) == false) goto L_0x1792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1164:0x171c, code lost:
        r9 = new X.C98194r2(r1, (long) X.C36381kD.A04(r11), X.C133266Xn.A08(r1));
        r9.A0E(new X.C1257261a(new X.C140466ld(), java.lang.Float.valueOf(1.0f - r15)));
        r17 = new X.C140436la(r10, r9, (java.lang.Object) null, r10.getWidth(), r10.getHeight(), 0);
        r9 = new X.C98194r2(r1, (long) X.C36381kD.A03(r11), X.C133266Xn.A08(r1));
        r9.A0E(new X.C1257261a(new X.C140466ld(), java.lang.Float.valueOf(r15)));
        r17 = new X.C140436la(r13, r9, (java.lang.Object) null, r13.getWidth(), r13.getHeight(), 0);
        r5.add(r17);
        r5.add(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1165:0x178b, code lost:
        r3 = new X.C140416lY(r2, r5, r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1166:0x1792, code lost:
        r5.add(r10);
        r5.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1167:0x1799, code lost:
        r15 = r7.A02;
        r14 = X.AnonymousClass6UX.A00(r15);
        r14.A0c = true;
        r14.A0M = 0;
        r3 = A0O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1168:0x17a9, code lost:
        if (r3 == null) goto L_0x17b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1171:0x17af, code lost:
        X.AnonymousClass72Q.A00(r14, java.lang.Integer.valueOf(X.AnonymousClass6Y7.A06(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1172:0x17b6, code lost:
        r3 = A0T(38, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1173:0x17bd, code lost:
        if (r3 <= -1) goto L_0x17fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1174:0x17bf, code lost:
        r14.A0Q = r3;
        r14.A0V = android.text.TextUtils.TruncateAt.END;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1175:0x17c5, code lost:
        r4 = A0d(51);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1176:0x17cf, code lost:
        if (r4.isEmpty() != false) goto L_0x17f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1177:0x17d1, code lost:
        r3 = X.AnonymousClass6Y5.A02(r1, r0, r4).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1178:0x17d7, code lost:
        r14.A0Y = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1179:0x17d9, code lost:
        r9 = (java.lang.String) A0I(r0, 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1180:0x17e5, code lost:
        if (r9 == null) goto L_0x1858;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1181:0x17e7, code lost:
        r4 = (java.lang.String) A0I(r0, 53);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1182:0x17ef, code lost:
        if (r4 == null) goto L_0x1852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1183:0x17f2, code lost:
        r3 = (java.lang.String) A0I(r0, 49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1184:0x17fa, code lost:
        if (r3 == null) goto L_0x17d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1185:0x17fd, code lost:
        if (r3 != -1) goto L_0x17c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1186:0x17ff, code lost:
        r31.B8r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1189:?, code lost:
        r6 = r9.replaceAll("[^0-9.]", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1190:0x1811, code lost:
        if (r6.length() == r9.length()) goto L_0x181a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1191:0x1813, code lost:
        X.AnonymousClass6RS.A01("text_size_ignored", "Only specify a size value for text_size if also specifying the text_size_unit property.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1192:0x181a, code lost:
        r12 = java.lang.Float.parseFloat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1193:0x1822, code lost:
        switch(r4.hashCode()) {
            case 3212: goto L_0x1835;
            case 3592: goto L_0x183e;
            case 3677: goto L_0x1847;
            default: goto L_0x1825;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1195:0x1834, code lost:
        throw new X.AnonymousClass5R5(X.AnonymousClass000.A0p("can't parse unknown textUniSize: ", r4, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1197:0x183b, code lost:
        if (r4.equals("dp") == false) goto L_0x1825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1200:0x1844, code lost:
        if (r4.equals("px") == false) goto L_0x1825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1203:0x184d, code lost:
        if (r4.equals("sp") != false) goto L_0x1856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1205:0x1850, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1206:0x1852, code lost:
        r12 = X.AnonymousClass6Y7.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1207:0x1856, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1208:0x1858, code lost:
        r12 = -1.0f;
        r11 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1209:0x185c, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1210:0x185d, code lost:
        r14.A0S = (int) X.C90464aC.A02(r15, r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1211:0x1864, code lost:
        r4 = (java.lang.String) A0I(r0, 46);
        r10 = A0J(r0);
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1212:0x1872, code lost:
        if (r10 == null) goto L_0x1880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1213:0x1874, code lost:
        r9 = X.AnonymousClass6NR.A00().A03.A00(r1.A00, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1214:0x1880, code lost:
        if (r4 == null) goto L_0x1895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1216:0x1886, code lost:
        if (r4.isEmpty() != false) goto L_0x1895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1218:?, code lost:
        r9 = X.C109545Xz.A00(r15, r9, r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1219:0x188d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1220:0x188e, code lost:
        X.AnonymousClass6RS.A00(r1, "BKBloksComponentsTextBinderUtil", "Error parsing typeface for Text", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02f0, code lost:
        if (r26 == 0.0f) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1259:0x1960, code lost:
        r12 = X.AnonymousClass6UX.A00(r7.A02);
        r12.A0c = true;
        r12.A0M = 0;
        r3 = A0O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1260:0x1970, code lost:
        if (r3 == null) goto L_0x197d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1263:0x1976, code lost:
        X.AnonymousClass72Q.A00(r12, java.lang.Integer.valueOf(X.AnonymousClass6Y7.A06(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1264:0x197d, code lost:
        r3 = A0T(40, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1265:0x1984, code lost:
        if (r3 <= -1) goto L_0x1a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1266:0x1986, code lost:
        r12.A0Q = r3;
        r12.A0V = android.text.TextUtils.TruncateAt.END;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1267:0x198c, code lost:
        r13 = A0f(68, false);
        r3 = 44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1268:0x1995, code lost:
        if (r13 == false) goto L_0x1999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1269:0x1997, code lost:
        r3 = 70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1270:0x1999, code lost:
        r5 = A0d(r3);
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1271:0x19a3, code lost:
        if (r5.isEmpty() != false) goto L_0x1a0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1272:0x19a5, code lost:
        r11 = X.AnonymousClass6Y5.A03(r1, r0, r5, r13);
        r12.A0Y = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1273:0x19ad, code lost:
        r9 = (java.lang.String) A0I(r0, 54);
        r6 = r1.A00;
        r5 = X.AnonymousClass5YY.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1274:0x19bb, code lost:
        if (r9 == null) goto L_0x19c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1276:0x19c3, code lost:
        if (r9.equals("text_first_strong") != false) goto L_0x1a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1277:0x19c5, code lost:
        r3 = X.AnonymousClass047.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1278:0x19c7, code lost:
        r12.A0W = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1279:0x19c9, code lost:
        r12.A0M = A02(r1, r0, 53);
        r12.A0N = A0T(52, 0);
        r5 = A0T(46, Integer.MIN_VALUE);
        r9 = A0T(48, Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1280:0x19e7, code lost:
        if (r5 == Integer.MIN_VALUE) goto L_0x1a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1281:0x19e9, code lost:
        if (r9 == Integer.MIN_VALUE) goto L_0x1a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1282:0x19eb, code lost:
        r10 = true;
        r6 = X.C36341k9.A00(r6);
        r5 = X.C90514aH.A06((float) r5, r6);
        r3 = X.C90514aH.A06((float) r9, r6);
        r12.A0O = r5;
        r12.A0P = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1284:0x1a01, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1285:0x1a03, code lost:
        if (r5 == false) goto L_0x1a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1286:0x1a05, code lost:
        r3 = X.AnonymousClass047.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1287:0x1a08, code lost:
        r3 = X.AnonymousClass047.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1288:0x1a0b, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1289:0x1a0e, code lost:
        if (r3 != -1) goto L_0x198c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1290:0x1a10, code lost:
        r31.B8r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1293:?, code lost:
        r3 = (java.lang.String) A0I(r0, 67);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1294:0x1a1d, code lost:
        if (r3 == null) goto L_0x1a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1295:0x1a1f, code lost:
        r5 = X.AnonymousClass6Y7.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1296:0x1a26, code lost:
        if (r5 < 0.0f) goto L_0x1a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1297:0x1a28, code lost:
        r12.A0K = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1298:0x1a2b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1299:0x1a2c, code lost:
        X.AnonymousClass6RS.A00(r1, "BKBloksComponentsRichTextBinderUtil", "Error parsing lineHeight for RichText", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1315:0x1ae1, code lost:
        if (r11.A02.isEmpty() != false) goto L_0x1ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1320:0x1aed, code lost:
        if (r6 != false) goto L_0x1aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1346:0x1b74, code lost:
        r5 = (X.C140456lc) r30.get(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1347:0x1b7e, code lost:
        if (r5 == null) goto L_0x2324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1348:0x1b80, code lost:
        r1 = r44;
        r4 = r5.B2C(r7, r1, r8);
        X.AnonymousClass00C.A0D(r4, 2);
        r6 = X.AnonymousClass6T6.A00(r7, r4, r5, (java.lang.Object) null, X.AnonymousClass5YT.A00(r1, r8));
        r4 = new int[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1349:0x1b9c, code lost:
        if (android.view.View.MeasureSpec.getMode(r44) != 0) goto L_0x1bce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1350:0x1b9e, code lost:
        r1 = r6.A02.A02.A03.width();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1351:0x1ba8, code lost:
        r4[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1352:0x1baf, code lost:
        if (android.view.View.MeasureSpec.getMode(r8) != 0) goto L_0x1bc9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1353:0x1bb1, code lost:
        r5 = r6.A02.A02.A03.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1354:0x1bbb, code lost:
        r4[1] = r5;
        r3 = new X.C140426lZ(r2, r6.A02, r4[0], r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1355:0x1bc9, code lost:
        r5 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1356:0x1bce, code lost:
        r1 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1357:0x1bd3, code lost:
        r3 = X.C133186Xd.A01(r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1358:0x1bdb, code lost:
        r3 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.calculateLayoutForComponent(r7, r0, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1359:0x1be3, code lost:
        r3 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.calculateLayoutForComponent(r7, r0, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1360:0x1beb, code lost:
        r3 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.calculateLayoutForComponent(r7, r0, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1362:0x1bf7, code lost:
        if (android.view.View.MeasureSpec.getMode(r8) != 0) goto L_0x1c19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1363:0x1bf9, code lost:
        r3 = (android.view.View) A0G(r7, r2);
        r3.measure(r44, r8);
        r4 = r3.getMeasuredHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1364:0x1c08, code lost:
        r3 = A07(r2, A01(r44, 0), A01(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1365:0x1c19, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1366:0x1c1b, code lost:
        r3 = A07(r2, X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r44), X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1368:0x1c32, code lost:
        if (android.view.View.MeasureSpec.getMode(r44) != 0) goto L_0x1c47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1369:0x1c34, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1371:0x1c39, code lost:
        if (android.view.View.MeasureSpec.getMode(r8) != 0) goto L_0x1c42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1372:0x1c3b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1373:0x1c3c, code lost:
        r3 = A07(r2, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1374:0x1c42, code lost:
        r1 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1375:0x1c47, code lost:
        r3 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1376:0x1c4c, code lost:
        r3 = A0W(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1377:0x1c52, code lost:
        if (r3 != null) goto L_0x1c5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1378:0x1c54, code lost:
        r3 = new X.C140426lZ(r2, (java.lang.Object) null, 24, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1381:?, code lost:
        r1 = (java.lang.String) A0I(r3, 36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1382:0x1c66, code lost:
        if (r1 != null) goto L_0x1c69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1384:0x1c69, code lost:
        r1 = X.AnonymousClass6Y7.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1385:0x1c6e, code lost:
        r1 = 24.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1386:0x1c70, code lost:
        r4 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1387:0x1c72, code lost:
        r4 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1390:0x1c7c, code lost:
        X.AnonymousClass00C.A0D(r2, 2);
        r3 = A0G(r7, r2);
        X.AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentsspinner.SpinnerImageView");
        r3 = A05((android.view.View) r3, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1391:0x1c93, code lost:
        r11 = r7.A02;
        r4 = X.AnonymousClass5Y5.A00(r11);
        r10 = A0J(r0);
        r6 = (java.lang.String) A0I(r0, 54);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1392:0x1ca8, code lost:
        if (r10 == null) goto L_0x1cc3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1393:0x1caa, code lost:
        r9 = X.AnonymousClass6NR.A00().A03.A00(r1.A00, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1394:0x1cb6, code lost:
        if (r6 == null) goto L_0x1ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1396:0x1cbc, code lost:
        if (r6.isEmpty() != false) goto L_0x1ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1398:?, code lost:
        r9 = X.C109545Xz.A00(r11, r9, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1399:0x1cc3, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1400:0x1cc5, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1401:0x1cc6, code lost:
        X.AnonymousClass6RS.A00(r1, "TextInputBinderUtils", "Error parsing text style for text input", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1410:0x1d13, code lost:
        X.AnonymousClass00C.A0D(r2, 2);
        r3 = A0G(r7, r2);
        X.AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type android.widget.ProgressBar");
        r3 = A05((android.view.View) r3, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1411:0x1d2a, code lost:
        r15 = X.C113015er.A00;
        r3 = (java.lang.String) A0I(r0, 49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1412:0x1d34, code lost:
        if (r3 == null) goto L_0x1d42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1414:0x1d3c, code lost:
        if (r3.equals("gone") == false) goto L_0x1d42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1415:0x1d3e, code lost:
        r3 = X.C131906Rg.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1416:0x1d42, code lost:
        r14 = !X.AnonymousClass5YY.A00(r7.A02);
        r5 = X.C133296Xs.A03(r0);
        r4 = new X.C132136Sh();
        A0e(new X.C141916o2(r4, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1417:0x1d5b, code lost:
        if (r14 != false) goto L_0x1d78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1418:0x1d5d, code lost:
        r10 = X.AnonymousClass5TC.A03;
        X.C132136Sh.A00(r4, 2);
        r6 = r4.A01;
        r9 = r4.A00;
        r3 = r9 + 1;
        r4.A00 = r3;
        r6[r9] = (float) 0;
        r4.A00 = r3 + 1;
        r6[r3] = (float) r10.mIntValue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1419:0x1d78, code lost:
        if (r5 == null) goto L_0x1d82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1420:0x1d7a, code lost:
        r5.A0e(new X.C141926o3(r4, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1421:0x1d82, code lost:
        r22 = java.util.Arrays.copyOf(r4.A01, r4.A00);
        r21 = A0b();
        r3 = new float[r21.size()][];
        r1 = new com.facebook.flexlayout.styles.FlexItemCallback[r21.size()];
        r20 = r21.iterator();
        r13 = 0;
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1423:0x1da5, code lost:
        if (r20.hasNext() == false) goto L_0x1e52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1424:0x1da7, code lost:
        r12 = (X.C157827ek) r20.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1425:0x1daf, code lost:
        if ((r12 instanceof X.C140456lc) == false) goto L_0x1dcd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1426:0x1db1, code lost:
        r6 = (X.C140456lc) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1427:0x1db8, code lost:
        if (r6.A04 != 13320) goto L_0x1dcd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1428:0x1dba, code lost:
        r5 = (java.lang.String) A0I(r6, 49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1429:0x1dc2, code lost:
        if (r5 == null) goto L_0x1dcd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1431:0x1dca, code lost:
        if (r5.equals("gone") == false) goto L_0x1dcd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1432:0x1dcd, code lost:
        r11 = X.C133296Xs.A03(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1433:0x1dd1, code lost:
        if (r11 == null) goto L_0x1e4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1434:0x1dd3, code lost:
        r10 = new X.AnonymousClass6Um();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1435:0x1de0, code lost:
        if (((java.lang.String) A0I(r11, 62)) == null) goto L_0x1e4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1437:0x1df0, code lost:
        if (((java.lang.String) A0I(r11, 62)).equals("absolute") == false) goto L_0x1e4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1438:0x1df2, code lost:
        r9 = true;
        r18 = X.AnonymousClass5T8.A01;
        r17 = X.AnonymousClass6Um.A02(r10);
        r5 = r10.A00;
        r4 = r5 + 1;
        r10.A00 = r4;
        r17[r5] = (float) 21;
        r10.A00 = r4 + 1;
        r17[r4] = (float) r18.mIntValue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1439:0x1e0f, code lost:
        if (r14 == false) goto L_0x1e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1440:0x1e11, code lost:
        r6 = X.C023109s.A00;
        r5 = X.C023109s.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1441:0x1e15, code lost:
        r11.A0e(new X.C141936o4(r10, r6, r5, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1442:0x1e1d, code lost:
        r3[r13] = java.util.Arrays.copyOf(r10.A01, r10.A00);
        r1[r13] = new com.facebook.flexlayout.styles.FlexItemCallback(new X.AnonymousClass6KY(r7, r12, r15, r14));
        r6 = X.C133296Xs.A03(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1443:0x1e38, code lost:
        if (r6 == null) goto L_0x1e44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1445:0x1e40, code lost:
        if (r6.A0T(81, 0) == 0) goto L_0x1e44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1446:0x1e42, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1447:0x1e44, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1448:0x1e48, code lost:
        r6 = X.C023109s.A0C;
        r5 = X.C023109s.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1449:0x1e4d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1450:0x1e4f, code lost:
        r10 = X.C133296Xs.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1452:0x1e56, code lost:
        if (r21.size() <= r13) goto L_0x1e64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1453:0x1e58, code lost:
        r3 = (float[][]) java.util.Arrays.copyOf(r3, r13);
        r1 = (com.facebook.flexlayout.styles.FlexItemCallback[]) java.util.Arrays.copyOf(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1454:0x1e64, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1455:0x1e65, code lost:
        if (r19 == false) goto L_0x1e80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1456:0x1e67, code lost:
        r5 = new java.lang.Integer[r13];
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1457:0x1e6a, code lost:
        if (r6 >= r13) goto L_0x1e75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1458:0x1e6c, code lost:
        r5[r6] = java.lang.Integer.valueOf(r6);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1459:0x1e75, code lost:
        java.util.Arrays.sort(r5, new X.C163887qv(r21, r15, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1460:0x1e80, code lost:
        r15 = X.C131906Rg.A01(r44);
        r14 = X.C131906Rg.A01(r8);
        r13 = r15[1];
        r12 = r14[1];
        r11 = X.C133296Xs.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1461:0x1e91, code lost:
        if (r11 != null) goto L_0x1ed9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1462:0x1e93, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1464:0x1e95, code lost:
        if (r10 == null) goto L_0x1eb7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1465:0x1e97, code lost:
        r15 = X.C131906Rg.A00(r10[0], r10[2], r10[4], r15[0], r15[1]);
        r14 = X.C131906Rg.A00(r10[1], r10[3], r10[5], r14[0], r14[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1466:0x1eb7, code lost:
        r24 = r15[0];
        r25 = r15[1];
        r26 = r14[0];
        r27 = r14[1];
        r4 = new com.facebook.flexlayout.layoutoutput.LayoutOutput(r3.length);
        com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r22, r3, r24, r25, r26, r27, r25, r27, r4, r1);
        r3 = new X.C140396lW(r4, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1467:0x1ed9, code lost:
        r10 = new float[]{X.C133296Xs.A00(r11, r13, 68, true), X.C133296Xs.A00(r11, r12, 42, true), X.C133296Xs.A00(r11, r13, 54, false), X.C133296Xs.A00(r11, r12, 53, false), X.C133296Xs.A00(r11, r13, 52, false), X.C133296Xs.A00(r11, r12, 51, false)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1468:0x1f12, code lost:
        r3 = X.AnonymousClass001.A0L();
        r5 = X.C36361kB.A1b(r3, r12);
        X.AnonymousClass6RS.A01("ComponentMapper", java.lang.String.format("Attempting to calculateLayoutForComponent for unrecognized component style id %s", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1469:0x1f2b, code lost:
        if (android.view.View.MeasureSpec.getMode(r44) != 1073741824) goto L_0x1f41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1470:0x1f2d, code lost:
        r3 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1472:0x1f35, code lost:
        if (android.view.View.MeasureSpec.getMode(r8) != 1073741824) goto L_0x1f3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1473:0x1f37, code lost:
        r5 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1474:0x1f3b, code lost:
        r3 = A07(r2, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1475:0x1f41, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1478:?, code lost:
        r1 = (java.lang.String) A0I(r0, 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1479:0x1f4b, code lost:
        if (r1 != null) goto L_0x1f4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1481:0x1f4e, code lost:
        r1 = X.AnonymousClass6Y7.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1482:0x1f53, code lost:
        r1 = 17280.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1483:0x1f55, code lost:
        r3 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1486:?, code lost:
        r1 = (java.lang.String) A0I(r0, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1487:0x1f5e, code lost:
        if (r1 != null) goto L_0x1f61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1489:0x1f61, code lost:
        r1 = X.AnonymousClass6Y7.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1490:0x1f66, code lost:
        r1 = 17280.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1491:0x1f68, code lost:
        r5 = X.C36441kJ.A1O();
        r5[0] = X.AnonymousClass5ZK.A00(r3, r44);
        r4 = X.AnonymousClass5ZK.A00((int) r1, r8);
        r5[1] = r4;
        r3 = new X.C140426lZ(r2, r5, r5[0], r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1492:0x1f86, code lost:
        r5 = r3.A01;
        r4 = (X.AnonymousClass07P) A0G(r7, r2);
        X.AnonymousClass6RY.A01(X.AnonymousClass6RY.A00(r1, r0), r4, r1, r0, r5);
        r3 = A05(r4, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1493:0x1f9d, code lost:
        r4 = r3.A01;
        r3 = (android.view.View) A0G(r7, r2);
        X.C109985Zw.A00(r3, r1, r0, r4);
        r3.measure(r44, r8);
        r5 = r3.getMeasuredWidth();
        r4 = r3.getMeasuredHeight();
        X.C90504aG.A0J(r3, com.whatsapp.R.id.recycler_view).setAdapter((X.AnonymousClass0CZ) null);
        r3 = new X.C140426lZ(r2, (java.lang.Object) null, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1494:0x1fc7, code lost:
        r6 = (android.view.View) A0G(r7, r2);
        X.AnonymousClass6RX.A01(r6, r1, r0, A0a(50, ""));
        r6.measure(r44, r8);
        r3 = new X.C140426lZ(r2, (java.lang.Object) null, r6.getMeasuredWidth(), r6.getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1495:0x1fed, code lost:
        r9 = r3.A01;
        r6 = (android.view.View) A0G(r7, r2);
        r3 = X.C109975Zv.A00(r0);
        r13 = X.C36441kJ.A1O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1496:0x2003, code lost:
        if (r3 <= 0) goto L_0x2046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1497:0x2005, code lost:
        X.C36391kE.A0O(r6, com.whatsapp.R.id.start_message).setText(A0L(r0));
        X.C90504aG.A16(X.C36391kE.A0O(r6, com.whatsapp.R.id.timer_text), r9.A06, r3);
        r6.measure(r44, r8);
        r13[0] = r6.getMeasuredWidth();
        r13[1] = r6.getMeasuredHeight();
        X.C36391kE.A0O(r6, com.whatsapp.R.id.start_message).setText("");
        X.C36391kE.A0O(r6, com.whatsapp.R.id.timer_text).setText("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1498:0x2046, code lost:
        r3 = A07(r2, r13[0], r13[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1499:0x2050, code lost:
        r3 = (android.view.View) A0G(r7, r2);
        r3.measure(r44, r8);
        r5 = X.C36441kJ.A1O();
        r5[0] = r3.getMeasuredWidth();
        r3 = r3.getMeasuredHeight();
        r5[1] = r3;
        r3 = A07(r2, r5[0], r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1500:0x2075, code lost:
        r6 = X.C90484aE.A0P();
        r5 = X.C36441kJ.A1O();
        r5[0] = X.AnonymousClass5ZK.A00(r6.widthPixels, r44);
        r3 = X.AnonymousClass5ZK.A00(r6.heightPixels, r8);
        r5[1] = r3;
        r3 = A07(r2, r5[0], r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1501:0x2099, code lost:
        if (r2 == null) goto L_0x2337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1502:0x209b, code lost:
        r3 = A0G(r7, r2);
        X.AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type android.view.View");
        r3 = A05((android.view.View) r3, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1503:0x20ae, code lost:
        r9 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1504:0x20b0, code lost:
        if (r17 == null) goto L_0x233e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1505:0x20b2, code lost:
        if (r9 == null) goto L_0x233e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1506:0x20b4, code lost:
        r11 = null;
        r7 = android.view.View.inflate(r7.A02, com.whatsapp.R.layout.f9nameremoved, (android.view.ViewGroup) null);
        A0f(52, true);
        A0f(56, true);
        A0f(59, false);
        r15 = A0d(44).iterator();
        r14 = null;
        r13 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1508:0x20e0, code lost:
        if (r15.hasNext() == false) goto L_0x210a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1509:0x20e2, code lost:
        r10 = X.C90514aH.A0Y(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1510:0x20f8, code lost:
        if (r10.A0a(36, "regular").equals("hd") == false) goto L_0x2161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1511:0x20fa, code lost:
        r14 = A04(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1512:0x20fe, code lost:
        r13 = r10.A0T(41, 0);
        r12 = r10.A0T(35, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1513:0x2106, code lost:
        if (r14 == null) goto L_0x20dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1514:0x2108, code lost:
        if (r11 == null) goto L_0x20dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1515:0x210a, code lost:
        if (r7 == null) goto L_0x2110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1516:0x210c, code lost:
        if (r11 != null) goto L_0x2132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1517:0x210e, code lost:
        if (r14 != null) goto L_0x2132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1518:0x2110, code lost:
        r7.measure(r44, r8);
        r4 = X.C36441kJ.A1O();
        r4[0] = r7.getMeasuredWidth();
        r4[1] = r7.getMeasuredHeight();
        r9.A02(r7);
        r3 = A07(r2, r4[0], r4[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1519:0x2132, code lost:
        r10 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r7.findViewById(com.whatsapp.R.id.video_player_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1520:0x213b, code lost:
        if (r14 != null) goto L_0x213f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1521:0x213d, code lost:
        if (r11 == null) goto L_0x2110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1522:0x213f, code lost:
        r1 = r10.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1523:0x2141, code lost:
        if (r1 != null) goto L_0x2153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1524:0x2143, code lost:
        r1 = X.AnonymousClass5NR.A00(X.C36361kB.A06(r10), r10.getGlobalUI(), r10.getSystemServices(), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1525:0x2153, code lost:
        r10.addView(r1.A08(), 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1526:0x2161, code lost:
        r11 = A04(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1527:0x2165, code lost:
        if (r13 == 0) goto L_0x20fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1528:0x2167, code lost:
        if (r12 != 0) goto L_0x2106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1529:0x216a, code lost:
        r3 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1530:0x216c, code lost:
        if (r2 == null) goto L_0x2345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1531:0x216e, code lost:
        r4 = (android.view.View) A0G(r7, r2);
        X.C109965Zu.A00(r4, r1, r0, r3);
        r4.measure(r44, r8);
        r5 = X.C36441kJ.A1O();
        r5[0] = r4.getMeasuredWidth();
        r4 = r4.getMeasuredHeight();
        r5[1] = r4;
        r3 = new X.C140426lZ(r2, r5, r5[0], r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1532:0x2197, code lost:
        r5 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1533:0x2199, code lost:
        if (r17 == null) goto L_0x234c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1534:0x219b, code lost:
        r6 = X.C36421kH.A0D(r7.A02, com.whatsapp.R.layout.f9nameremoved);
        r5.A03(r6, A0K(r0), A0f(35, false));
        r6.measure(r44, r8);
        r5 = X.C36441kJ.A1O();
        r5[0] = r6.getMeasuredWidth();
        r5[1] = r6.getMeasuredHeight();
        r1 = (com.whatsapp.videoplayback.VideoSurfaceView) X.C012005e.A02(r6, com.whatsapp.R.id.video_view);
        r1.A04();
        com.whatsapp.videoplayback.VideoSurfaceView.A03(r1, false);
        r3 = A07(r2, r5[0], r5[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1535:0x21e1, code lost:
        r3 = A06(r7, r2, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1536:0x21e9, code lost:
        r3 = A0A(r7, r2, r0, r44, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1537:0x21f1, code lost:
        r5 = X.C36441kJ.A1O();
        r5[0] = A01(r44, 0);
        r4 = A01(r8, 0);
        r5[1] = r4;
        r3 = new X.C140426lZ(r2, r5, r5[0], r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1538:0x220e, code lost:
        r5 = r3.A01;
        r3 = new com.whatsapp.TextEmojiLabel(r7.A02);
        X.C110005Zy.A00(r3, r1, r0, r5);
        r3.measure(r44, r8);
        r5 = X.C36441kJ.A1O();
        r5[0] = r3.getMeasuredWidth();
        r3 = r3.getMeasuredHeight();
        r5[1] = r3;
        r3 = A07(r2, r5[0], r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1539:0x2239, code lost:
        r3 = new X.C140426lZ(r2, (java.lang.Object) null, 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1540:0x2242, code lost:
        r3 = A07(r2, A01(r44, 0), A01(r8, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1541:0x2253, code lost:
        r3 = A07(r2, X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r44), X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1542:0x2266, code lost:
        r5 = X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r44);
        r4 = X.AnonymousClass5ZK.A00(Integer.MAX_VALUE, r8);
        r3 = new X.C140426lZ(r2, new android.graphics.Rect(0, 0, r5, r4), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0365, code lost:
        if (r15.A04 == r22.A04) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1581:0x22f7, code lost:
        throw X.AnonymousClass001.A09("A render unit was defined for this component but none was found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1583:0x22fd, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1586:0x2304, code lost:
        throw X.C90514aH.A0s("Invalid pixel format for Collection spacing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1588:0x230b, code lost:
        throw X.AnonymousClass001.A09("Controller for component returned null but it should have returned a Pair<Integer, Integer>");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1589:0x230c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1591:0x2311, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1592:0x2312, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1594:0x2317, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1598:0x231e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1600:0x2323, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1602:0x232a, code lost:
        throw X.AnonymousClass001.A09("PTR container has no child");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1603:0x232b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1605:0x2330, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1606:0x2331, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1608:0x2336, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1610:0x233d, code lost:
        throw X.AnonymousClass001.A09("A render unit was defined for this node but none was found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1612:0x2344, code lost:
        throw X.AnonymousClass001.A08("Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1614:0x234b, code lost:
        throw X.AnonymousClass001.A08("Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1616:0x2352, code lost:
        throw X.AnonymousClass001.A08("Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1704:0x00db, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ec, code lost:
        throw new X.AnonymousClass5R5(X.AnonymousClass000.A0p("can't parse unknown snap gravity: ", r9, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x049f, code lost:
        if (X.AnonymousClass5Z0.A00(r9.A02, r14) != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ce, code lost:
        if (X.AnonymousClass5Z0.A00(r9.A02, r14) != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05ea, code lost:
        if (r18 != 0) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x08df, code lost:
        r4.A0E(r3);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0964, code lost:
        r4 = A0D(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x096a, code lost:
        r4 = new X.C100384uv(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a3f, code lost:
        r2 = A08(r4, r1);
        r3 = X.AnonymousClass6NR.A00().A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a49, code lost:
        switch(r12) {
            case 13323: goto L_0x2266;
            case 13889: goto L_0x2197;
            case 13948: goto L_0x220e;
            case 14005: goto L_0x2239;
            case 14093: goto L_0x21e9;
            case 15763: goto L_0x216a;
            case 15768: goto L_0x20ae;
            case 15972: goto L_0x2239;
            case 15981: goto L_0x2253;
            case 16094: goto L_0x21f1;
            case 16534: goto L_0x2242;
            case 16682: goto L_0x21e1;
            case 16718: goto L_0x2099;
            default: goto L_0x0a4c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a4c, code lost:
        switch(r12) {
            case 13496: goto L_0x2075;
            case 13497: goto L_0x21f1;
            case 13498: goto L_0x1fed;
            case 13499: goto L_0x2050;
            default: goto L_0x0a4f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a4f, code lost:
        switch(r12) {
            case 13501: goto L_0x1fc7;
            case 13502: goto L_0x1f43;
            case 13503: goto L_0x1f9d;
            case 13504: goto L_0x1f86;
            default: goto L_0x0a52;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a56, code lost:
        if (X.C109575Yc.A00(r12) == false) goto L_0x1f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a58, code lost:
        switch(r12) {
            case 13317: goto L_0x0a7b;
            case 13320: goto L_0x1d2a;
            case 13323: goto L_0x1bd3;
            case 13326: goto L_0x1d13;
            case 13327: goto L_0x1b74;
            case 13329: goto L_0x1960;
            case 13334: goto L_0x0a60;
            case 13335: goto L_0x1799;
            case 13336: goto L_0x1c93;
            case 13666: goto L_0x1c7c;
            case 13708: goto L_0x1beb;
            case 13797: goto L_0x169f;
            case 14093: goto L_0x21e9;
            case 15728: goto L_0x1c4c;
            case 15778: goto L_0x1c2e;
            case 15981: goto L_0x1c1b;
            case 16160: goto L_0x1bf3;
            case 16260: goto L_0x1be3;
            case 16444: goto L_0x1bdb;
            case 16682: goto L_0x21e1;
            default: goto L_0x0a5b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a5f, code lost:
        throw X.C90464aC.A0O(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a60, code lost:
        if (r2 == null) goto L_0x22f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a62, code lost:
        r4 = (X.C160577lE) A0G(r7, r2);
        r4.measure(r44, r8);
        r3 = A07(r2, r4.getMeasuredWidth(), r4.getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a7b, code lost:
        r9 = 0;
        X.AnonymousClass00C.A0D(r2, 2);
        r3 = A0F(r0).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a89, code lost:
        if (r3 == 0) goto L_0x115a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0a8b, code lost:
        if (r3 == 1) goto L_0x0d8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a8d, code lost:
        r3 = X.AnonymousClass6M4.A00;
        r10 = r7.A02;
        r3 = r3.A00(r10, r0);
        r13 = r3.A01;
        r12 = r3.A02;
        r11 = r3.A04;
        r5 = r3.A00;
        r4 = r3.A03;
        r29 = X.AnonymousClass5ZC.A00(r10);
        r28 = X.C36361kB.A0r(A0b());
        r3 = new X.C120825s8(r7, r0);
        r10 = (android.view.View.MeasureSpec.getSize(r44) - r11.left) - r11.right;
        r14 = (android.view.View.MeasureSpec.getSize(r8) - r11.top) - r11.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ac6, code lost:
        if (r13 == 1) goto L_0x0ac9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0ac8, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0ac9, code lost:
        r26 = new int[r12];
        r17 = r10 / r12;
        r10 = r10 % r12;
        r14 = 0;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ad2, code lost:
        if (r14 >= r12) goto L_0x0ae6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ad4, code lost:
        r15 = r15 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0ad5, code lost:
        if (r15 <= 0) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0ad9, code lost:
        if ((r12 - r15) >= r10) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0adb, code lost:
        r3 = r17 + 1;
        r15 = r15 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0ade, code lost:
        r26[r14] = r3;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0ae3, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0ae6, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ae7, code lost:
        if (r13 != 1) goto L_0x0aea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ae9, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0aea, code lost:
        r25 = X.AnonymousClass5Y3.A00(r13, r10, r12, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0af0, code lost:
        if (r13 != 1) goto L_0x0b03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0af2, code lost:
        r10 = r4 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0af4, code lost:
        r5 = new X.AnonymousClass5o4[r12];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0af7, code lost:
        if (r4 >= r12) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0af9, code lost:
        r5[r4] = new X.AnonymousClass5o4();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b03, code lost:
        r10 = r5 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b06, code lost:
        r24 = X.C36361kB.A0r(A0b());
        r23 = X.C90514aH.A14(A0b());
        r22 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b1c, code lost:
        if (r23.hasNext() == false) goto L_0x0ce8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b1e, code lost:
        r21 = r23.next();
        r20 = r22 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0b24, code lost:
        if (r22 >= 0) goto L_0x0b2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0b2a, code lost:
        throw X.C36351kA.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0b2b, code lost:
        r21 = (X.C140456lc) r21;
        X.AnonymousClass00C.A0B(r21);
        r4 = A0B(r21);
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0b3a, code lost:
        if (r4 == null) goto L_0x0bdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0b40, code lost:
        if (r4.A04 != 16482) goto L_0x0bdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b42, code lost:
        r19 = r4.A0f(36, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b48, code lost:
        if (r19 == false) goto L_0x0bdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0b4a, code lost:
        r17 = new X.C10980fX(new X.C14510lk(r5)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0b5c, code lost:
        if (r17.hasNext() == false) goto L_0x0c1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0b5e, code lost:
        r14 = r17.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0b66, code lost:
        if (r17.hasNext() == false) goto L_0x0b88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0b68, code lost:
        r4 = ((X.AnonymousClass5o4) ((X.C06600Ug) r14).A01).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0b71, code lost:
        r15 = r17.next();
        r3 = ((X.AnonymousClass5o4) ((X.C06600Ug) r15).A01).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0b7e, code lost:
        if (r4 >= r3) goto L_0x0b82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b80, code lost:
        r4 = r3;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0b86, code lost:
        if (r17.hasNext() != false) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0b88, code lost:
        r14 = (X.C06600Ug) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0b8a, code lost:
        if (r14 == null) goto L_0x22f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0b8c, code lost:
        r18 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0b94, code lost:
        if (java.lang.Integer.valueOf(r18) == null) goto L_0x22f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0b96, code lost:
        if (r19 == false) goto L_0x0bd4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0b98, code lost:
        r15 = X.AnonymousClass001.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0b9c, code lost:
        r24.add(r15);
        r14 = A0B(r21);
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0ba7, code lost:
        if (r14 == null) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0bae, code lost:
        if (r14.A04 != 16482) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0bb0, code lost:
        r4 = A0I(r14, 35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0bb6, code lost:
        if (r4 == null) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0bba, code lost:
        if ((r4 instanceof java.lang.Number) == false) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0bbc, code lost:
        r4 = (java.lang.Number) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0bbe, code lost:
        if (r4 == null) goto L_0x0bc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0bc0, code lost:
        r17 = java.lang.Float.valueOf(r4.floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0bc8, code lost:
        if (r19 == false) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0bca, code lost:
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0bcc, code lost:
        if (r3 >= r12) goto L_0x0c21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0bce, code lost:
        r4 = r4 + r26[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0bd4, code lost:
        r15 = new android.graphics.Rect(r25[r18]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0bdc, code lost:
        r17 = new X.C10980fX(new X.C14510lk(r5)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0bee, code lost:
        if (r17.hasNext() == false) goto L_0x0c1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0bf0, code lost:
        r14 = r17.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0bf8, code lost:
        if (r17.hasNext() == false) goto L_0x0b88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0bfa, code lost:
        r4 = ((X.AnonymousClass5o4) ((X.C06600Ug) r14).A01).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c03, code lost:
        r15 = r17.next();
        r3 = ((X.AnonymousClass5o4) ((X.C06600Ug) r15).A01).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0c10, code lost:
        if (r4 <= r3) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0c12, code lost:
        r4 = r3;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0c18, code lost:
        if (r17.hasNext() != false) goto L_0x0c03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0c1c, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0c1f, code lost:
        r4 = r26[r18];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0c21, code lost:
        if (r13 != 1) goto L_0x0cac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0c23, code lost:
        r4 = r4 - r15.left;
        r3 = r15.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c28, code lost:
        r4 = r4 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c29, code lost:
        if (r17 == null) goto L_0x0ca9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0c2b, code lost:
        if (r19 != false) goto L_0x0ca9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0c2d, code lost:
        r3 = X.C112845eY.A00;
        r14 = X.C90504aG.A08((int) (((float) r4) * r17.floatValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0c3a, code lost:
        r3 = X.C90504aG.A08(r4);
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0c3f, code lost:
        if (r13 != 0) goto L_0x0c43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0c41, code lost:
        r4 = r14;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0c43, code lost:
        r4 = X.C36421kH.A0j(java.lang.Integer.valueOf(r4), r14);
        r4 = A09(r3, r7, r21, X.C90484aE.A0H(r4), X.C90474aD.A08(r4));
        r28.add(r4);
        r3 = ((X.C130326Kq) r4.A00.A00()).A02.A02.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0c6e, code lost:
        if (r13 != 1) goto L_0x0ca4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0c70, code lost:
        r4 = r3.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0c74, code lost:
        r17 = r5[r18];
        r3 = r17;
        r14 = r3.A00 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0c7d, code lost:
        if (r3.A01 == null) goto L_0x0cc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0c7f, code lost:
        r14 = r14 + (r10 * 2);
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0c83, code lost:
        if (r15 >= r12) goto L_0x0cb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0c85, code lost:
        r3 = r5[r15].A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0c89, code lost:
        if (r3 == null) goto L_0x0c99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0c8b, code lost:
        r3 = (android.graphics.Rect) r24.get(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0c95, code lost:
        if (r13 != 1) goto L_0x0c9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0c97, code lost:
        r3.bottom = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0c99, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0c9c, code lost:
        if (r29 != false) goto L_0x0ca1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0c9e, code lost:
        r3.right = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0ca1, code lost:
        r3.left = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0ca4, code lost:
        r4 = r3.width();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0ca9, code lost:
        r14 = X.C112845eY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0cac, code lost:
        r4 = r4 - r15.top;
        r3 = r15.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0cb3, code lost:
        r3 = (android.graphics.Rect) r24.get(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0cbd, code lost:
        if (r13 != 1) goto L_0x0cd6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0cbf, code lost:
        r3.top = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0cc1, code lost:
        r15 = new X.C114575hT(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0cc8, code lost:
        if (r19 == false) goto L_0x0cde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0cca, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0ccb, code lost:
        if (r4 >= r12) goto L_0x0ce4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0ccd, code lost:
        r3 = r5[r4];
        r3.A01 = r15;
        r3.A00 = r14;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0cd6, code lost:
        if (r29 != false) goto L_0x0cdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0cd8, code lost:
        r3.left = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0cdb, code lost:
        r3.right = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0cde, code lost:
        r3 = r17;
        r3.A01 = r15;
        r3.A00 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0ce4, code lost:
        r22 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0ce8, code lost:
        r3 = X.C133266Xn.A04(r1, r0);
        X.AnonymousClass00C.A08(r3);
        ((X.AnonymousClass6OR) r3).A08 = r24;
        r7 = android.view.View.MeasureSpec.getMode(r44);
        r4 = android.view.View.MeasureSpec.getMode(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0cfd, code lost:
        if (r13 != 1) goto L_0x0d08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0cff, code lost:
        if (r7 != 0) goto L_0x0d11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0d07, code lost:
        throw X.AnonymousClass001.A09("StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0d08, code lost:
        if (r4 != 0) goto L_0x0d11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0d10, code lost:
        throw X.AnonymousClass001.A09("StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0d11, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0d12, code lost:
        if (r12 == 0) goto L_0x0d1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0d14, code lost:
        r9 = r5[0];
        r3 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0d18, code lost:
        if (r3 != 0) goto L_0x0d6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0d1a, code lost:
        if (r9 == null) goto L_0x0d1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0d1c, code lost:
        r10 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0d1e, code lost:
        if (r13 != 1) goto L_0x0d68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0d20, code lost:
        r3 = r11.top;
        r1 = r11.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0d24, code lost:
        r10 = r10 + (r3 + r1);
        r5 = android.view.View.MeasureSpec.getSize(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0d2a, code lost:
        if (r13 != 0) goto L_0x0d36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0d2e, code lost:
        if (r7 == 1073741824) goto L_0x0d36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0d32, code lost:
        if (r7 != Integer.MIN_VALUE) goto L_0x0d66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0d34, code lost:
        if (r10 < r5) goto L_0x0d66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0d36, code lost:
        r3 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0d3a, code lost:
        if (r13 != 1) goto L_0x0d46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0d3e, code lost:
        if (r4 == 1073741824) goto L_0x0d46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0d42, code lost:
        if (r4 != Integer.MIN_VALUE) goto L_0x0d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0d44, code lost:
        if (r10 < r3) goto L_0x0d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0d46, code lost:
        r1 = X.C36421kH.A0j(java.lang.Integer.valueOf(r5), r3);
        r6 = X.C90484aE.A0H(r1);
        r5 = X.C90474aD.A08(r1);
        r3 = new X.C140426lZ(r2, new X.C120935sK(r28, r6, r5), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0d64, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0d66, code lost:
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0d68, code lost:
        r3 = r11.left;
        r1 = r11.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0d6d, code lost:
        r10 = r9.A00;
        r12 = new X.C15020mZ(1, r3).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0d7c, code lost:
        if (r12.hasNext() == false) goto L_0x0d1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0d7e, code lost:
        r3 = r5[r12.A00()];
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0d86, code lost:
        if (r10 >= r1) goto L_0x0d78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0d88, code lost:
        r9 = r3;
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0d8b, code lost:
        r4 = X.AnonymousClass6M4.A00;
        r3 = r7.A02;
        r43 = r3;
        r4 = r4.A00(r3, r0);
        r5 = r4.A01;
        r10 = r4.A02;
        r42 = r4.A00;
        r41 = r4.A03;
        r13 = r4.A04;
        r40 = A0I(r4.A05, 35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0db1, code lost:
        if ((r40 instanceof java.lang.Number) == false) goto L_0x0e08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0db3, code lost:
        r40 = (java.lang.Number) r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0db9, code lost:
        r14 = A0b();
        r38 = X.C36411kG.A13(r14);
        r12 = X.AnonymousClass001.A0I();
        r11 = r14.size();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0dca, code lost:
        if (r9 >= r11) goto L_0x0e0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0dcc, code lost:
        r4 = X.C90504aG.A0K(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0dd4, code lost:
        if (A0R(r4) == false) goto L_0x0e03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0dd6, code lost:
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0dd8, code lost:
        r15 = r15 + r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0dda, code lost:
        if (r15 <= r10) goto L_0x0dff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0ddc, code lost:
        r38.add(X.C007103b.A0Y(r12));
        r12.clear();
        r12.add(r4);
        r15 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0df1, code lost:
        if (r9 != X.C36431kI.A07(r14)) goto L_0x0dfc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0df3, code lost:
        r38.add(X.C007103b.A0Y(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0dfc, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0dff, code lost:
        r12.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0e03, code lost:
        r17 = A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0e08, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0e0b, code lost:
        r37 = r38.size();
        r36 = X.C36441kJ.A14(r37);
        r35 = X.C36361kB.A0r(A0b());
        r3 = new X.C120825s8(r7, r0);
        r11 = (android.view.View.MeasureSpec.getSize(r44) - r13.left) - r13.right;
        r4 = (android.view.View.MeasureSpec.getSize(r8) - r13.top) - r13.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0e36, code lost:
        if (r5 == 1) goto L_0x0e39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0e38, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0e39, code lost:
        r33 = new int[r10];
        r12 = r11 / r10;
        r11 = r11 % r10;
        r9 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0e42, code lost:
        if (r9 >= r10) goto L_0x0e55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0e44, code lost:
        r4 = r4 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0e45, code lost:
        if (r4 <= 0) goto L_0x0e53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0e49, code lost:
        if ((r10 - r4) >= r11) goto L_0x0e53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0e4b, code lost:
        r3 = r12 + 1;
        r4 = r4 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0e4e, code lost:
        r33[r9] = r3;
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0e53, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0e55, code lost:
        r32 = X.C36361kB.A0r(A0b());
        r31 = r38.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0e64, code lost:
        if (r12 >= r31) goto L_0x1051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0e66, code lost:
        r30 = (java.util.List) r38.get(r12);
        r29 = X.AnonymousClass001.A0I();
        r28 = X.AnonymousClass001.A0I();
        r27 = X.AnonymousClass5ZC.A00(r43);
        r26 = X.C36361kB.A0r(r30);
        r25 = r30.iterator();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x0e8b, code lost:
        if (r25.hasNext() == false) goto L_0x0f4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x0e8d, code lost:
        r4 = X.C90514aH.A0Y(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x0e95, code lost:
        if (A0R(r4) == false) goto L_0x0f44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0e97, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0e98, code lost:
        r9 = (r9 + r11) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0e9a, code lost:
        if (r5 != 1) goto L_0x0f3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0e9c, code lost:
        if (r12 != 0) goto L_0x0f40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0e9e, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x0ea0, code lost:
        if (r5 != 1) goto L_0x0f34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x0ea2, code lost:
        if (r11 != 0) goto L_0x0f38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0ea4, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x0ea6, code lost:
        if (r5 != 1) goto L_0x0f2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0eaa, code lost:
        if (r9 != (r10 - 1)) goto L_0x0f30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x0eac, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x0eae, code lost:
        if (r5 != 1) goto L_0x0f22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x0eb2, code lost:
        if (r12 != (r37 - 1)) goto L_0x0f27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0eb4, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x0eb6, code lost:
        r3 = (double) r10;
        r14 = ((double) r42) / r3;
        r20 = ((double) r41) / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0ec2, code lost:
        if (r19 == false) goto L_0x0f13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0ec4, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x0ec6, code lost:
        if (r24 == false) goto L_0x0f06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x0ec8, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x0ec9, code lost:
        if (r23 == false) goto L_0x0ef5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x0ecb, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x0ecc, code lost:
        if (r22 == false) goto L_0x0ee4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0ece, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x0ecf, code lost:
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x0ed3, code lost:
        if (r27 != false) goto L_0x0ee0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0ed5, code lost:
        r4 = new android.graphics.Rect(r3, r11, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0ed8, code lost:
        r26.add(r4);
        r11 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x0ee0, code lost:
        r4 = new android.graphics.Rect(r14, r11, r3, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0ee4, code lost:
        if (r5 != 0) goto L_0x0ef2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0ee6, code lost:
        r15 = r41 - X.C14960mT.A00(((double) (r9 + 1)) * r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x0ef2, code lost:
        r15 = r41 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x0ef5, code lost:
        if (r5 != 1) goto L_0x0f03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0ef7, code lost:
        r14 = r42 - X.C14960mT.A00(((double) (r9 + 1)) * r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x0f03, code lost:
        r14 = r42 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x0f06, code lost:
        if (r5 != 0) goto L_0x0f10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x0f08, code lost:
        r11 = X.C14960mT.A00(((double) r11) * r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:0x0f10, code lost:
        r11 = r41 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0f13, code lost:
        if (r5 != 1) goto L_0x0f1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0f15, code lost:
        r19 = X.C14960mT.A00(((double) r11) * r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0f1d, code lost:
        r19 = r42 / 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0f24, code lost:
        if (r9 != (r10 - 1)) goto L_0x0f27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x0f27, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x0f2c, code lost:
        if (r12 != (r37 - 1)) goto L_0x0f30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x0f30, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x0f34, code lost:
        if (r12 != 0) goto L_0x0f38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0f38, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x0f3c, code lost:
        if (r11 != 0) goto L_0x0f40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x0f40, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x0f44, code lost:
        r9 = A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x0f4a, code lost:
        r22 = r30.size();
        r21 = 0;
        r20 = 0;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:0x0f55, code lost:
        if (r15 >= r22) goto L_0x1004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x0f57, code lost:
        r14 = X.C90504aG.A0K(r30, r15);
        r19 = A0R(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x0f61, code lost:
        if (r19 == false) goto L_0x0ffe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x0f63, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:768:0x0f64, code lost:
        r3 = (android.graphics.Rect) r26.get(r15);
        r32.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x0f71, code lost:
        if (r40 == null) goto L_0x0ffa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:0x0f73, code lost:
        r18 = java.lang.Float.valueOf(r40.floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x0f7b, code lost:
        r4 = r15;
        r9 = r9 + r15;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x0f7e, code lost:
        if (r4 >= r9) goto L_0x0f87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x0f80, code lost:
        r11 = r11 + r33[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x0f87, code lost:
        if (r5 != 1) goto L_0x0ff5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x0f89, code lost:
        r9 = r3.left;
        r4 = r3.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x0f8d, code lost:
        r11 = r11 - (r9 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x0f8f, code lost:
        if (r18 == null) goto L_0x0ff2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x0f91, code lost:
        if (r19 != false) goto L_0x0ff2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x0f93, code lost:
        r9 = X.C112845eY.A00;
        r4 = X.C90504aG.A08((int) (((float) r11) * r18.floatValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x0fa0, code lost:
        if (r5 != 0) goto L_0x0fed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x0fa2, code lost:
        r9 = r4;
        r4 = X.C90504aG.A08(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:0x0fa7, code lost:
        r4 = X.C36421kH.A0j(java.lang.Integer.valueOf(r9), r4);
        r11 = X.C90484aE.A0H(r4);
        r9 = X.C90474aD.A08(r4);
        r29.add(new X.C120835s9(r3, r11, r9));
        r9 = ((X.C130326Kq) A09(r3, r7, r14, r11, r9).A00.A00()).A02.A02.A03;
        r20 = java.lang.Math.max(r20, r9.width());
        r21 = java.lang.Math.max(r21, r9.height());
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x0fed, code lost:
        r9 = X.C90504aG.A08(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x0ff2, code lost:
        r4 = X.C112845eY.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x0ff5, code lost:
        r9 = r3.top;
        r4 = r3.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x0ffa, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x0ffe, code lost:
        r9 = A03(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x1004, code lost:
        r17 = r30.size();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x100b, code lost:
        if (r15 >= r17) goto L_0x1046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x100d, code lost:
        r14 = X.C90504aG.A0K(r30, r15);
        r11 = (X.C120835s9) r29.get(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x101b, code lost:
        if (r5 != 0) goto L_0x103d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x101d, code lost:
        r3 = X.C112845eY.A00;
        r9 = X.C90504aG.A08(r20);
        r4 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x1025, code lost:
        r4 = A09(r3, r7, r14, r9, r4);
        r28.add(new X.AnonymousClass5o3(r11, r4));
        r35.add(r4);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x103d, code lost:
        r9 = r11.A01;
        r3 = X.C112845eY.A00;
        r4 = X.C90504aG.A08(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1046, code lost:
        r36.add(r28);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x1051, code lost:
        r3 = X.C133266Xn.A04(r1, r0);
        X.AnonymousClass00C.A08(r3);
        ((X.AnonymousClass6OR) r3).A08 = r32;
        r24 = android.view.View.MeasureSpec.getMode(r44);
        r23 = android.view.View.MeasureSpec.getMode(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x1066, code lost:
        if (r5 != 1) goto L_0x1071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x1068, code lost:
        if (r24 != 0) goto L_0x107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x1070, code lost:
        throw X.AnonymousClass001.A09("GridCollectionMeasureHelper: Width should be specified for vertical grid collection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x1071, code lost:
        if (r23 != 0) goto L_0x107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x1079, code lost:
        throw X.AnonymousClass001.A09("GridCollectionMeasureHelper: Height should be specified for horizontal grid collection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x107a, code lost:
        r22 = android.view.View.MeasureSpec.getSize(r44);
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:806:0x1083, code lost:
        if (r24 == 1073741824) goto L_0x1089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x1085, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x1087, code lost:
        if (r5 != 1) goto L_0x108b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x1089, code lost:
        r21 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x108b, code lost:
        r20 = android.view.View.MeasureSpec.getSize(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x1091, code lost:
        if (r23 == 1073741824) goto L_0x1095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x1093, code lost:
        if (r5 != 0) goto L_0x1097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x1095, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:814:0x1097, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:0x109a, code lost:
        if (r21 == -1) goto L_0x10bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x109c, code lost:
        if (r15 == -1) goto L_0x10bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:817:0x109e, code lost:
        r1 = java.lang.Integer.valueOf(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x10a2, code lost:
        r1 = X.C36421kH.A0j(r1, r15);
        r6 = X.C90484aE.A0H(r1);
        r5 = X.C90474aD.A08(r1);
        r3 = new X.C140426lZ(r2, new X.C120935sK(r35, r6, r5), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x10bc, code lost:
        r14 = r13.left + r13.right;
        r12 = r13.top + r13.bottom;
        r19 = r36.size();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:0x10cd, code lost:
        if (r13 >= r19) goto L_0x1148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:0x10cf, code lost:
        r18 = (java.util.List) r36.get(r13);
        r17 = r18.size();
        r11 = 0;
        r10 = 0;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:0x10e4, code lost:
        if (r9 >= r17) goto L_0x1122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x10e6, code lost:
        r3 = (X.AnonymousClass5o3) r18.get(r9);
        r7 = r3.A00.A02;
        r1 = ((X.C130326Kq) r3.A01.A00.A00()).A02.A02.A03;
        r11 = java.lang.Math.max(r11, (r1.width() + r7.left) + r7.right);
        r10 = java.lang.Math.max(r10, (r1.height() + r7.top) + r7.bottom);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1122, code lost:
        r14 = r14 + r11;
        r12 = r12 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x1126, code lost:
        if (r5 != 0) goto L_0x113b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x112a, code lost:
        if (r24 != Integer.MIN_VALUE) goto L_0x1132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x112c, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:0x112e, code lost:
        if (r14 < r1) goto L_0x1132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x1130, code lost:
        r21 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x1132, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x1135, code lost:
        if (r21 == -1) goto L_0x1145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x1137, code lost:
        if (r15 == -1) goto L_0x1145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x113d, code lost:
        if (r23 != Integer.MIN_VALUE) goto L_0x1132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:838:0x113f, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x1141, code lost:
        if (r12 < r1) goto L_0x1132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x1143, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:841:0x1145, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x1148, code lost:
        if (r5 != 1) goto L_0x1155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:843:0x114a, code lost:
        if (r15 != r3) goto L_0x114d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x114c, code lost:
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x114d, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x114f, code lost:
        r1 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x1157, code lost:
        if (r21 == r3) goto L_0x114f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x115a, code lost:
        r3 = (java.lang.String) A0I(r0, 99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x1162, code lost:
        if (r3 != null) goto L_0x1166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x1164, code lost:
        r3 = "v1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x116c, code lost:
        if (r3.equals("v2") == false) goto L_0x141a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x116e, code lost:
        r10 = X.AnonymousClass5Y2.A00(r0);
        r4 = A0f(63, false);
        r3 = android.view.View.MeasureSpec.getMode(r44);
        r1 = android.view.View.MeasureSpec.getMode(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x1183, code lost:
        if (r4 != false) goto L_0x1189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x1185, code lost:
        if (r10 != 1) goto L_0x11e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x1187, code lost:
        if (r3 != 0) goto L_0x11e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x1189, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:859:0x118b, code lost:
        if (r4 != false) goto L_0x1191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x118d, code lost:
        if (r10 != 1) goto L_0x11dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x118f, code lost:
        if (r1 != 0) goto L_0x11df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x1191, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:863:0x1193, code lost:
        if (r18 != false) goto L_0x1198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x1195, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:865:0x1196, code lost:
        if (r17 == false) goto L_0x1199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:0x1198, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x1199, code lost:
        r1 = new X.C1269166e(r7, r0);
        r1 = A0b();
        r4 = X.C36361kB.A0r(r1);
        r14 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x11b0, code lost:
        if (r14.hasNext() == false) goto L_0x11e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x11b2, code lost:
        r13 = X.C90514aH.A0Y(r14);
        X.AnonymousClass00C.A0B(r13);
        r24 = r44;
        r25 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:871:0x11bd, code lost:
        if (r10 != 1) goto L_0x11c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:872:0x11bf, code lost:
        r24 = r8;
        r25 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x11c3, code lost:
        r4.add(new X.C118815om(X.AnonymousClass6XE.A03(r1, r7, r13, r0, r10, r24, r25, !r18), r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x11dc, code lost:
        if (r3 != 0) goto L_0x11df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:0x11df, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x11e2, code lost:
        if (r1 != 0) goto L_0x11e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x11e5, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x11ea, code lost:
        if (r15 != false) goto L_0x120f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x11ec, code lost:
        r5 = android.view.View.MeasureSpec.getSize(r44);
        r1 = android.view.View.MeasureSpec.getSize(r8);
        r6 = X.AnonymousClass6UV.A01(r4, r0.A03, A0f(73, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x120f, code lost:
        r6 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:?, code lost:
        r1 = (java.lang.String) A0I(r0, 55);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x1218, code lost:
        if (r1 != null) goto L_0x121c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x121a, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x121c, code lost:
        r3 = X.AnonymousClass6Y7.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x1221, code lost:
        r3 = X.AnonymousClass000.A0u();
        r3.append("Invalid format for spacing-after: ");
        X.AnonymousClass6RS.A01("ListCollectionMeasureV2Helper", X.AnonymousClass000.A0q((java.lang.String) A0I(r0, 55), r3));
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0295, code lost:
        if (A0W(87) != null) goto L_0x0297;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1002:0x1407  */
    /* JADX WARNING: Removed duplicated region for block: B:1235:0x18c7  */
    /* JADX WARNING: Removed duplicated region for block: B:1238:0x18d3  */
    /* JADX WARNING: Removed duplicated region for block: B:1241:0x18e3  */
    /* JADX WARNING: Removed duplicated region for block: B:1244:0x1903  */
    /* JADX WARNING: Removed duplicated region for block: B:1247:0x1913  */
    /* JADX WARNING: Removed duplicated region for block: B:1249:0x1922  */
    /* JADX WARNING: Removed duplicated region for block: B:1251:0x192b  */
    /* JADX WARNING: Removed duplicated region for block: B:1253:0x1943  */
    /* JADX WARNING: Removed duplicated region for block: B:1258:0x1958  */
    /* JADX WARNING: Removed duplicated region for block: B:1341:0x1b49  */
    /* JADX WARNING: Removed duplicated region for block: B:1683:0x13db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05fb A[Catch:{ 5R5 -> 0x22d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x061e A[Catch:{ 5R5 -> 0x0627 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x061f A[Catch:{ 5R5 -> 0x0627 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06d2  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x126e A[Catch:{ 5R5 -> 0x1273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:907:0x1298  */
    /* JADX WARNING: Removed duplicated region for block: B:910:0x12a3  */
    /* JADX WARNING: Removed duplicated region for block: B:913:0x12b9  */
    /* JADX WARNING: Removed duplicated region for block: B:915:0x12bf  */
    /* JADX WARNING: Removed duplicated region for block: B:917:0x12c3  */
    /* JADX WARNING: Removed duplicated region for block: B:919:0x12c9  */
    /* JADX WARNING: Removed duplicated region for block: B:927:0x12e3  */
    /* JADX WARNING: Removed duplicated region for block: B:940:0x132a  */
    /* JADX WARNING: Removed duplicated region for block: B:942:0x1332  */
    /* JADX WARNING: Removed duplicated region for block: B:946:0x1344  */
    /* JADX WARNING: Removed duplicated region for block: B:978:0x13be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C161007lx B2C(X.C123035vp r46, int r47, int r48) {
        /*
            r45 = this;
            r7 = r46
            X.00T r0 = r7.A04
            java.lang.Object r16 = r0.getValue()
            r0 = r16
            X.6Jg r0 = (X.C129986Jg) r0
            r16 = r0
            X.5oS r1 = r0.A00
            r0 = r45
            r44 = r47
            r8 = r48
            if (r1 == 0) goto L_0x0067
            java.util.Map r1 = r1.A01
            java.lang.Object r3 = r1.get(r0)
            X.5sH r3 = (X.C120905sH) r3
            if (r3 == 0) goto L_0x0068
            int r5 = r3.A01
            X.7lx r4 = r3.A02
            int r2 = r4.getWidth()
            r1 = r44
            boolean r1 = A0Q(r5, r1, r2)
            if (r1 == 0) goto L_0x0068
            int r2 = r3.A00
            int r1 = r4.getHeight()
            boolean r1 = A0Q(r2, r8, r1)
            if (r1 == 0) goto L_0x0068
            X.68E r1 = X.AnonymousClass6RN.A00
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x0058
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Bloks cacheTraversal: "
            r2.append(r1)
            int r1 = r0.A04
            java.lang.String r1 = X.C36381kD.A10(r2, r1)
            X.AnonymousClass6RN.A00(r1)
        L_0x0058:
            r3 = 1
            X.5aA r2 = new X.5aA
            r1 = r16
            r2.<init>(r1, r0, r3)
            r0.A0g(r2)
            X.AnonymousClass68E.A00()
            return r4
        L_0x0067:
            r3 = 0
        L_0x0068:
            X.68E r1 = X.AnonymousClass6RN.A00
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x008d
            r1 = 128(0x80, float:1.794E-43)
            A0I(r0, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Bloks Layout: "
            r2.append(r1)
            int r1 = r0.A04
            java.lang.String r2 = X.C36381kD.A10(r2, r1)
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            X.68E r1 = X.AnonymousClass6RN.A00
            r1.A02(r2)
        L_0x008d:
            java.lang.Object r1 = r7.A03
            r17 = r1
            r1 = r17
            X.67i r1 = (X.C1271967i) r1
            java.util.Objects.requireNonNull(r1)
            if (r3 == 0) goto L_0x00a9
            X.7lx r2 = r3.A02
            X.6Tu r2 = r2.BGf()
            if (r2 == 0) goto L_0x00a9
            X.65A r2 = r1.A02
            X.7it r2 = r2.A01
            r2.B8r()
        L_0x00a9:
            X.65A r2 = r1.A02
            X.7it r2 = r2.A01
            r31 = r2
            r31.B8r()
            r2 = 0
            r4 = 156(0x9c, float:2.19E-43)
            android.util.SparseArray r3 = r0.A05
            r30 = r3
            java.lang.Object r4 = r3.get(r4)
            X.7ek r4 = (X.C157827ek) r4
            if (r4 == 0) goto L_0x00fc
            r3 = r44
            X.7lx r3 = r4.B2C(r7, r3, r8)
            boolean r4 = r3 instanceof X.C140386lV
            if (r4 != 0) goto L_0x00db
            X.6Tu r4 = r3.BGf()
            if (r4 == 0) goto L_0x00d7
            X.4qy r2 = new X.4qy
            r2.<init>(r4)
            r4 = r2
        L_0x00d7:
            X.6Tu r2 = r0.A08(r4, r1)
        L_0x00db:
            X.AnonymousClass6NR.A00()
            boolean r1 = r3 instanceof X.C140386lV
            if (r1 != 0) goto L_0x00e8
            X.6lV r1 = new X.6lV
            r1.<init>(r3, r2)
            r3 = r1
        L_0x00e8:
            X.5sH r2 = new X.5sH
            r1 = r44
            r2.<init>(r3, r1, r8)
            r1 = r16
            X.5oS r1 = r1.A01
            java.util.Map r1 = r1.A01
            r1.put(r0, r2)
            X.AnonymousClass68E.A00()
            return r3
        L_0x00fc:
            X.6NR r3 = X.AnonymousClass6NR.A00()
            X.6Sg r3 = r3.A09
            int r12 = r0.A04
            switch(r12) {
                case 13323: goto L_0x0a25;
                case 13648: goto L_0x0a1d;
                case 13889: goto L_0x0a15;
                case 13948: goto L_0x0a0d;
                case 14005: goto L_0x0978;
                case 14093: goto L_0x0964;
                case 15763: goto L_0x0a05;
                case 15768: goto L_0x09fb;
                case 15972: goto L_0x0971;
                case 15981: goto L_0x0a2d;
                case 16094: goto L_0x09f3;
                case 16534: goto L_0x098c;
                case 16682: goto L_0x096a;
                case 16718: goto L_0x097f;
                default: goto L_0x0107;
            }
        L_0x0107:
            switch(r12) {
                case 13496: goto L_0x095b;
                case 13497: goto L_0x0952;
                case 13498: goto L_0x0949;
                case 13499: goto L_0x0940;
                default: goto L_0x010a;
            }
        L_0x010a:
            switch(r12) {
                case 13501: goto L_0x0937;
                case 13502: goto L_0x092e;
                case 13503: goto L_0x0925;
                case 13504: goto L_0x091c;
                default: goto L_0x010d;
            }
        L_0x010d:
            boolean r2 = X.C109575Yc.A00(r12)
            if (r2 == 0) goto L_0x0907
            switch(r12) {
                case 13317: goto L_0x0149;
                case 13320: goto L_0x0679;
                case 13323: goto L_0x0892;
                case 13326: goto L_0x089c;
                case 13327: goto L_0x012d;
                case 13329: goto L_0x08a3;
                case 13334: goto L_0x0134;
                case 13335: goto L_0x08c5;
                case 13336: goto L_0x013b;
                case 13666: goto L_0x08e4;
                case 13708: goto L_0x011b;
                case 13797: goto L_0x08eb;
                case 14093: goto L_0x0964;
                case 15728: goto L_0x08f9;
                case 15778: goto L_0x0900;
                case 15981: goto L_0x0a35;
                case 16160: goto L_0x0142;
                case 16260: goto L_0x0121;
                case 16444: goto L_0x0127;
                case 16682: goto L_0x096a;
                default: goto L_0x0116;
            }
        L_0x0116:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r12)
            throw r0
        L_0x011b:
            X.6Tu r4 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.createRenderUnit(r1, r0)
            goto L_0x0a3f
        L_0x0121:
            X.6Tu r4 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.createRenderUnit(r1, r0)
            goto L_0x0a3f
        L_0x0127:
            X.6Tu r4 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.createRenderUnit(r1, r0)
            goto L_0x0a3f
        L_0x012d:
            X.4uw r4 = new X.4uw
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0134:
            X.4uX r4 = new X.4uX
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x013b:
            X.4us r4 = new X.4us
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0142:
            X.4ur r4 = new X.4ur
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0149:
            java.lang.Object r3 = X.C133266Xn.A05(r1, r0)
            X.6OR r3 = (X.AnonymousClass6OR) r3
            X.AnonymousClass5Y0.A00(r0)
            int r2 = r0.A03
            long r5 = (long) r2
            X.4rE r10 = r3.A01
            android.content.Context r11 = r1.A00
            r13 = 1
            r9 = 0
            X.AnonymousClass00C.A0D(r11, r13)
            java.lang.Integer r2 = A0F(r0)
            int r4 = r2.intValue()
            if (r4 == r9) goto L_0x01d8
            X.6M4 r2 = X.AnonymousClass6M4.A00
            if (r4 == r13) goto L_0x0197
            X.5wo r2 = r2.A00(r11, r0)
            int r4 = r2.A01
            int r2 = r2.A02
            X.4rB r9 = new X.4rB
            r9.<init>(r4, r2)
        L_0x0179:
            X.4r3 r4 = new X.4r3
            r4.<init>(r9, r10, r5)
            X.5hy r2 = r3.A03
            r4.A07 = r2
            r5 = 67
            r2 = 0
            boolean r6 = r0.A0f(r5, r2)
            r5 = 1
            if (r6 == 0) goto L_0x0382
            r6 = 71
            java.lang.Object r10 = A0I(r0, r6)
            java.lang.String r10 = (java.lang.String) r10
            r9 = 1082130432(0x40800000, float:4.0)
            goto L_0x020b
        L_0x0197:
            X.5wo r9 = r2.A00(r11, r0)
            java.util.List r2 = r0.A0b()
            X.AnonymousClass00C.A08(r2)
            java.util.ArrayList r4 = X.C36321k7.A0J(r2)
            java.util.Iterator r14 = r2.iterator()
        L_0x01aa:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x01c8
            X.6lc r13 = X.C90514aH.A0Y(r14)
            X.AnonymousClass00C.A0B(r13)
            boolean r2 = A0R(r13)
            if (r2 == 0) goto L_0x01c3
            int r2 = r9.A02
        L_0x01bf:
            X.AnonymousClass000.A1F(r4, r2)
            goto L_0x01aa
        L_0x01c3:
            int r2 = A03(r13)
            goto L_0x01bf
        L_0x01c8:
            r2 = 0
            X.7of r13 = new X.7of
            r13.<init>(r4, r2)
            int r4 = r9.A01
            int r2 = r9.A02
            X.4rC r9 = new X.4rC
            r9.<init>(r13, r4, r2)
            goto L_0x0179
        L_0x01d8:
            int r13 = X.AnonymousClass5Y2.A00(r0)
            r2 = 73
            r4 = 0
            boolean r2 = r0.A0f(r2, r9)
            java.util.List r9 = r0.A0b()
            java.util.Iterator r15 = X.C90514aH.A14(r9)
        L_0x01eb:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x0204
            java.lang.Object r14 = r15.next()
            r9 = r14
            X.6lc r9 = (X.C140456lc) r9
            X.AnonymousClass00C.A0B(r9)
            boolean r9 = X.AnonymousClass5Y4.A00(r9)
            if (r9 == 0) goto L_0x01eb
            if (r14 == 0) goto L_0x0204
            r4 = 1
        L_0x0204:
            X.4rD r9 = new X.4rD
            r9.<init>(r13, r2, r4)
            goto L_0x0179
        L_0x020b:
            float r6 = X.C36341k9.A00(r11)     // Catch:{ 5R5 -> 0x22bb }
            float r6 = r6 * r9
            if (r10 == 0) goto L_0x0216
            float r6 = X.AnonymousClass6Y7.A01(r10)     // Catch:{ 5R5 -> 0x22bb }
        L_0x0216:
            int r6 = (int) r6
            r29 = r6
            r6 = 70
            X.6lc r6 = r0.A0W(r6)
            if (r6 == 0) goto L_0x02e5
            int r21 = X.AnonymousClass5Z8.A01(r1, r6, r2)
        L_0x0225:
            r6 = 78
            int r20 = A02(r1, r0, r6)
            r6 = 68
            boolean r19 = r0.A0f(r6, r2)
            r6 = 72
            java.lang.Object r6 = A0I(r0, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x02df
            r6 = 0
        L_0x023c:
            int r6 = (int) r6
            r28 = r6
            X.4n9 r10 = r3.A06
            r6 = 87
            X.6lc r9 = r0.A0W(r6)
            if (r9 == 0) goto L_0x02c7
            r6 = 42
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r15 = (int) r6
            r6 = 40
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r6 = (int) r6
            r22 = r6
            r6 = 41
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r14 = (int) r6
            r6 = 35
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r13 = (int) r6
            r6 = 36
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r6 = (int) r6
            r18 = r6
            r6 = 38
            float r6 = X.AnonymousClass6Qn.A00(r9, r6)
            int r6 = (int) r6
            if (r15 != 0) goto L_0x027b
            r15 = r18
        L_0x027b:
            if (r14 != 0) goto L_0x027e
            r14 = r6
        L_0x027e:
            android.graphics.Rect r9 = new android.graphics.Rect
            r6 = r22
            r9.<init>(r15, r6, r14, r13)
        L_0x0285:
            r6 = 81
            X.6lc r6 = r0.A0W(r6)
            if (r6 != 0) goto L_0x0297
            r6 = 87
            X.6lc r6 = r0.A0W(r6)
            r18 = 0
            if (r6 == 0) goto L_0x0299
        L_0x0297:
            r18 = 1
        L_0x0299:
            r6 = 90
            java.lang.Object r13 = A0I(r0, r6)
            java.lang.String r13 = (java.lang.String) r13
            r6 = 0
            if (r13 != 0) goto L_0x02c2
            r23 = 0
        L_0x02a6:
            r13 = 89
            java.lang.Object r13 = A0I(r0, r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x02bd
            r24 = 0
        L_0x02b2:
            r13 = 93
            java.lang.Object r13 = A0I(r0, r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x02f2
            goto L_0x02ea
        L_0x02bd:
            float r24 = X.AnonymousClass6Y7.A01(r13)     // Catch:{ 5R5 -> 0x228f }
            goto L_0x02b2
        L_0x02c2:
            float r23 = X.AnonymousClass6Y7.A01(r13)     // Catch:{ 5R5 -> 0x229e }
            goto L_0x02a6
        L_0x02c7:
            r6 = 76
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x22ad }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x22ad }
            if (r6 != 0) goto L_0x02d2
            goto L_0x02d7
        L_0x02d2:
            float r6 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22ad }
            goto L_0x02d8
        L_0x02d7:
            r6 = 0
        L_0x02d8:
            int r6 = (int) r6
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r6, r6, r6, r6)
            goto L_0x0285
        L_0x02df:
            float r6 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22b4 }
            goto L_0x023c
        L_0x02e5:
            r21 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x0225
        L_0x02ea:
            float r26 = X.AnonymousClass6Y7.A01(r13)     // Catch:{ 5R5 -> 0x2280 }
            int r13 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x02f4
        L_0x02f2:
            r26 = 1056964608(0x3f000000, float:0.5)
        L_0x02f4:
            r13 = 91
            float r25 = r0.A0S(r13, r6)
            int r6 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x22e3
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x22e3
            r6 = 88
            int r27 = A02(r1, r0, r6)
            X.5ws r6 = new X.5ws
            r22 = r6
            r22.<init>(r23, r24, r25, r26, r27)
            if (r10 == 0) goto L_0x0419
            int r14 = r10.A04
            r13 = r21
            if (r14 != r13) goto L_0x0419
            int r14 = r10.A03
            r13 = r20
            if (r14 != r13) goto L_0x0419
            int r14 = r10.A06
            r13 = r29
            if (r14 != r13) goto L_0x0419
            int r14 = r10.A05
            r13 = r28
            if (r14 != r13) goto L_0x0419
            boolean r14 = r10.A09
            r13 = r19
            if (r14 != r13) goto L_0x0419
            android.graphics.Rect r13 = r10.A07
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x0419
            boolean r14 = r10.A0A
            r13 = r18
            if (r14 != r13) goto L_0x0419
            X.5ws r15 = r10.A08
            float r14 = r15.A01
            float r13 = r6.A01
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0419
            float r14 = r15.A00
            float r13 = r6.A00
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0419
            float r14 = r15.A02
            float r13 = r6.A02
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0419
            float r14 = r15.A03
            float r13 = r6.A03
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0419
            int r14 = r15.A04
            int r13 = r6.A04
            if (r14 != r13) goto L_0x0419
        L_0x0367:
            r6 = 77
            boolean r9 = r0.A0f(r6, r2)
            X.4nM r6 = new X.4nM
            r6.<init>(r10, r9)
            r4.A0F(r6)
            java.util.List r6 = r4.A08
            if (r6 != 0) goto L_0x037f
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r4.A08 = r6
        L_0x037f:
            r6.add(r10)
        L_0x0382:
            r6 = 50
            X.7ku r9 = r0.A0X(r6)
            if (r9 == 0) goto L_0x0392
            X.4nI r6 = new X.4nI
            r6.<init>(r1, r0, r9)
            r4.A0F(r6)
        L_0x0392:
            r6 = 61
            X.7ku r9 = r0.A0X(r6)
            if (r9 == 0) goto L_0x03a2
            X.4nH r6 = new X.4nH
            r6.<init>(r1, r0, r9)
            r4.A0F(r6)
        L_0x03a2:
            r6 = 49
            X.7ku r10 = r0.A0X(r6)
            if (r10 == 0) goto L_0x03b9
            android.view.ViewGroup$MarginLayoutParams r6 = X.C96474nO.A01
            X.62S r9 = new X.62S
            r9.<init>(r1, r0, r10)
            X.4nO r6 = new X.4nO
            r6.<init>(r9)
            r4.A0F(r6)
        L_0x03b9:
            r6 = 54
            java.lang.Object r9 = A0I(r0, r6)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x03d6
            java.lang.Integer r15 = X.C023109s.A0G
        L_0x03c5:
            java.lang.Integer r6 = X.C023109s.A0G
            if (r15 == r6) goto L_0x04ee
            java.lang.Integer r10 = X.C023109s.A01
            r6 = 69
            java.lang.Object r6 = A0I(r0, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0456
            goto L_0x0434
        L_0x03d6:
            int r6 = r9.hashCode()     // Catch:{ 5R5 -> 0x22dc }
            switch(r6) {
                case -1364013995: goto L_0x040e;
                case 100571: goto L_0x0403;
                case 3387192: goto L_0x03f8;
                case 109757538: goto L_0x03ed;
                default: goto L_0x03dd;
            }     // Catch:{ 5R5 -> 0x22dc }
        L_0x03dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5R5 -> 0x22dc }
            java.lang.String r0 = "can't parse unknown snap gravity: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r9, r1)     // Catch:{ 5R5 -> 0x22dc }
            X.5R5 r0 = new X.5R5     // Catch:{ 5R5 -> 0x22dc }
            r0.<init>(r1)     // Catch:{ 5R5 -> 0x22dc }
            throw r0     // Catch:{ 5R5 -> 0x22dc }
        L_0x03ed:
            java.lang.String r6 = "start"
            boolean r6 = r9.equals(r6)     // Catch:{ 5R5 -> 0x22dc }
            if (r6 == 0) goto L_0x03dd
            java.lang.Integer r15 = X.C023109s.A00     // Catch:{ 5R5 -> 0x22dc }
            goto L_0x03c5
        L_0x03f8:
            java.lang.String r6 = "none"
            boolean r6 = r9.equals(r6)     // Catch:{ 5R5 -> 0x22dc }
            if (r6 == 0) goto L_0x03dd
            java.lang.Integer r15 = X.C023109s.A0G     // Catch:{ 5R5 -> 0x22dc }
            goto L_0x03c5
        L_0x0403:
            java.lang.String r6 = "end"
            boolean r6 = r9.equals(r6)     // Catch:{ 5R5 -> 0x22dc }
            if (r6 == 0) goto L_0x03dd
            java.lang.Integer r15 = X.C023109s.A0C     // Catch:{ 5R5 -> 0x22dc }
            goto L_0x03c5
        L_0x040e:
            java.lang.String r6 = "center"
            boolean r6 = r9.equals(r6)     // Catch:{ 5R5 -> 0x22dc }
            if (r6 == 0) goto L_0x03dd
            java.lang.Integer r15 = X.C023109s.A01     // Catch:{ 5R5 -> 0x22dc }
            goto L_0x03c5
        L_0x0419:
            X.4n9 r10 = new X.4n9
            r22 = r9
            r23 = r6
            r24 = r21
            r25 = r20
            r26 = r29
            r27 = r28
            r28 = r19
            r29 = r18
            r21 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r3.A06 = r10
            goto L_0x0367
        L_0x0434:
            java.lang.String r9 = "linear"
            boolean r9 = r6.equals(r9)     // Catch:{ 5R5 -> 0x22c2 }
            if (r9 != 0) goto L_0x0454
            java.lang.String r9 = "pager"
            boolean r9 = r6.equals(r9)     // Catch:{ 5R5 -> 0x22c2 }
            if (r9 != 0) goto L_0x0456
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5R5 -> 0x22c2 }
            java.lang.String r0 = "can't parse unknown snap style: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r6, r1)     // Catch:{ 5R5 -> 0x22c2 }
            X.5R5 r0 = new X.5R5     // Catch:{ 5R5 -> 0x22c2 }
            r0.<init>(r1)     // Catch:{ 5R5 -> 0x22c2 }
            throw r0     // Catch:{ 5R5 -> 0x22c2 }
        L_0x0454:
            java.lang.Integer r10 = X.C023109s.A00     // Catch:{ 5R5 -> 0x22c2 }
        L_0x0456:
            r6 = 45
            java.lang.Object r6 = A0I(r0, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0487
            r6 = 0
        L_0x0461:
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            X.0I9 r13 = r3.A05
            int r10 = r10.intValue()
            java.lang.String r18 = "Invalid gravity type :"
            r9 = 2
            int r6 = r15.intValue()
            if (r10 == r2) goto L_0x04a8
            if (r6 == r2) goto L_0x048c
            if (r6 == r9) goto L_0x048c
            if (r6 == r5) goto L_0x048c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r18)
            java.lang.String r0 = X.AnonymousClass5ZL.A00(r15)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0487:
            float r6 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22c9 }
            goto L_0x0461
        L_0x048c:
            boolean r6 = r13 instanceof X.C95904mT
            if (r6 == 0) goto L_0x04a2
            r6 = r13
            X.4mT r6 = (X.C95904mT) r6
            X.6TC r9 = r6.A00
            java.lang.Integer r6 = r9.A03
            if (r6 != r15) goto L_0x04a2
            java.lang.Float r6 = r9.A02
            boolean r6 = X.AnonymousClass5Z0.A00(r6, r14)
            if (r6 == 0) goto L_0x04a2
            goto L_0x04d0
        L_0x04a2:
            X.4mT r13 = new X.4mT
            r13.<init>(r14, r15)
            goto L_0x04d0
        L_0x04a8:
            if (r6 == r2) goto L_0x04bb
            if (r6 == r9) goto L_0x04bb
            if (r6 == r5) goto L_0x04bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r18)
            java.lang.String r0 = X.AnonymousClass5ZL.A00(r15)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x04bb:
            boolean r6 = r13 instanceof X.C95744mD
            if (r6 == 0) goto L_0x060d
            r6 = r13
            X.4mD r6 = (X.C95744mD) r6
            X.6TC r9 = r6.A00
            java.lang.Integer r6 = r9.A03
            if (r6 != r15) goto L_0x060d
            java.lang.Float r6 = r9.A02
            boolean r6 = X.AnonymousClass5Z0.A00(r6, r14)
            if (r6 == 0) goto L_0x060d
        L_0x04d0:
            r4.A06 = r13
            r3.A05 = r13
            r3.A07 = r15
            r6 = 51
            X.7ku r9 = r0.A0X(r6)
            r6 = 97
            X.7ku r6 = r0.A0X(r6)
            if (r9 != 0) goto L_0x04e6
            if (r6 == 0) goto L_0x04ee
        L_0x04e6:
            X.4nP r6 = new X.4nP
            r6.<init>(r13, r1, r0)
            r4.A0F(r6)
        L_0x04ee:
            r18 = 0
            java.lang.Integer r6 = A0F(r0)
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x0514
            X.6M4 r6 = X.AnonymousClass6M4.A00
            X.5wo r6 = r6.A00(r11, r0)
            android.graphics.Rect r9 = r6.A04
            int r6 = r9.left
            if (r6 != 0) goto L_0x0512
            int r6 = r9.top
            if (r6 != 0) goto L_0x0512
            int r6 = r9.right
            if (r6 != 0) goto L_0x0512
            int r6 = r9.bottom
            if (r6 == 0) goto L_0x0514
        L_0x0512:
            r4.A04 = r9
        L_0x0514:
            java.lang.Integer r6 = A0F(r0)
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x056e
            if (r6 == r5) goto L_0x0568
            X.4n8 r6 = new X.4n8
            r6.<init>(r1, r0)
        L_0x0525:
            java.util.List r9 = r4.A08
            if (r9 != 0) goto L_0x052f
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            r4.A08 = r9
        L_0x052f:
            r9.add(r6)
        L_0x0532:
            r6 = 43
            boolean r6 = r0.A0f(r6, r2)
            if (r6 == 0) goto L_0x0546
            X.0C0 r6 = r3.A04
            if (r6 == 0) goto L_0x0562
            X.0C0 r6 = r3.A04
        L_0x0540:
            r3.A04 = r6
            r6.A00 = r2
            r4.A05 = r6
        L_0x0546:
            r6 = 35
            boolean r9 = r0.A0f(r6, r2)
            r6 = 2
            if (r9 == 0) goto L_0x0550
            r6 = 0
        L_0x0550:
            r4.A02 = r6
            r6 = 41
            X.6lc r6 = r0.A0W(r6)
            if (r6 == 0) goto L_0x0614
            int r6 = X.AnonymousClass5Z8.A01(r1, r6, r2)
            r4.A00 = r6
            goto L_0x0614
        L_0x0562:
            X.0C0 r6 = new X.0C0
            r6.<init>()
            goto L_0x0540
        L_0x0568:
            X.4n1 r6 = new X.4n1
            r6.<init>(r1, r0)
            goto L_0x0525
        L_0x056e:
            r6 = 55
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x22d5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x22d5 }
            r15 = 0
            if (r6 != 0) goto L_0x057c
            r22 = 0
            goto L_0x0580
        L_0x057c:
            float r22 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22d5 }
        L_0x0580:
            r6 = 56
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x22d5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 != 0) goto L_0x058d
            r20 = 0
            goto L_0x0591
        L_0x058d:
            float r20 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22d5 }
        L_0x0591:
            r6 = 44
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x22d5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 != 0) goto L_0x059e
            r21 = 0
            goto L_0x05a2
        L_0x059e:
            float r21 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x22d5 }
        L_0x05a2:
            r6 = 100
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x22d5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x22d5 }
            X.5SZ r11 = X.AnonymousClass5SZ.STRETCH     // Catch:{ 5R5 -> 0x22d5 }
            X.5SZ r10 = X.AnonymousClass5Y1.A00(r11, r6)     // Catch:{ 5R5 -> 0x22d5 }
            r14 = 0
            if (r10 != r11) goto L_0x05ec
            java.util.List r9 = r0.A0b()     // Catch:{ 5R5 -> 0x22d5 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ 5R5 -> 0x22d5 }
            boolean r6 = r9 instanceof java.util.Collection     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 == 0) goto L_0x05c5
            boolean r6 = r9.isEmpty()     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 == 0) goto L_0x05c5
            goto L_0x05fc
        L_0x05c5:
            java.util.Iterator r13 = r9.iterator()     // Catch:{ 5R5 -> 0x22d5 }
        L_0x05c9:
            boolean r6 = r13.hasNext()     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 == 0) goto L_0x05ea
            X.6lc r6 = X.C90514aH.A0Y(r13)     // Catch:{ 5R5 -> 0x22d5 }
            X.6lc r9 = A0B(r6)     // Catch:{ 5R5 -> 0x22d5 }
            r6 = r14
            if (r9 == 0) goto L_0x05de
            java.lang.String r6 = A0O(r9)     // Catch:{ 5R5 -> 0x22d5 }
        L_0x05de:
            X.5SZ r6 = X.AnonymousClass5Y1.A00(r10, r6)     // Catch:{ 5R5 -> 0x22d5 }
            if (r6 == r11) goto L_0x05c9
            int r18 = r18 + 1
            if (r18 >= 0) goto L_0x05c9
            goto L_0x22d0
        L_0x05ea:
            if (r18 == 0) goto L_0x05fc
        L_0x05ec:
            r9 = 1
        L_0x05ed:
            int r6 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x05fe
            int r6 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x05fe
            int r6 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x05fe
            if (r9 == 0) goto L_0x0532
            goto L_0x05fe
        L_0x05fc:
            r9 = 0
            goto L_0x05ed
        L_0x05fe:
            int r23 = X.AnonymousClass5Y2.A00(r0)     // Catch:{ 5R5 -> 0x22d5 }
            X.4nB r6 = new X.4nB     // Catch:{ 5R5 -> 0x22d5 }
            r19 = r10
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ 5R5 -> 0x22d5 }
            goto L_0x0525
        L_0x060d:
            X.4mD r13 = new X.4mD
            r13.<init>(r14, r15)
            goto L_0x04d0
        L_0x0614:
            r6 = 75
            java.lang.Object r6 = A0I(r0, r6)     // Catch:{ 5R5 -> 0x0627 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5R5 -> 0x0627 }
            if (r6 != 0) goto L_0x061f
            goto L_0x0624
        L_0x061f:
            float r2 = X.AnonymousClass6Y7.A01(r6)     // Catch:{ 5R5 -> 0x0627 }
            goto L_0x0625
        L_0x0624:
            r2 = 0
        L_0x0625:
            int r2 = (int) r2     // Catch:{ 5R5 -> 0x0627 }
            goto L_0x062f
        L_0x0627:
            r10 = move-exception
            java.lang.String r9 = "CollectionBinderUtils"
            java.lang.String r6 = "Invalid dimension for fading edge length"
            X.AnonymousClass6RS.A00(r1, r9, r6, r10)
        L_0x062f:
            r4.A01 = r2
            r6 = 66
            r2 = -1
            int r2 = r0.A0T(r6, r2)
            r4.A03 = r2
            r2 = 95
            boolean r2 = r0.A0f(r2, r5)
            r4.A0B = r2
            r2 = 98
            boolean r2 = r0.A0f(r2, r5)
            r4.A0A = r2
            X.5yn r5 = r3.A02
            X.5hR r3 = new X.5hR
            r3.<init>(r1)
            X.6m3 r2 = new X.6m3
            r2.<init>(r3, r5)
            X.C1257261a.A00(r2, r4)
            r31.B8r()
            r2 = 65
            java.lang.Object r3 = A0I(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0a3f
            java.lang.String r2 = "on_drag"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0a3f
            r3 = 0
            X.7oi r2 = new X.7oi
            r2.<init>(r1, r3)
            r4.A0F(r2)
            goto L_0x0a3f
        L_0x0679:
            r2 = 38
            X.6lc r6 = r0.A0W(r2)
            boolean r5 = X.C133266Xn.A08(r1)
            if (r6 == 0) goto L_0x068b
            r2 = 43
            boolean r5 = r6.A0f(r2, r5)
        L_0x068b:
            r2 = 49
            java.lang.Object r3 = A0I(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x078b
            java.lang.String r10 = X.C90514aH.A0y(r3)
            int r2 = r10.hashCode()
            r4 = 0
            r9 = -1
            switch(r2) {
                case -1901805651: goto L_0x0761;
                case 3178655: goto L_0x076f;
                case 466743410: goto L_0x077d;
                default: goto L_0x06a2;
            }
        L_0x06a2:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "unknown visibility "
            java.lang.String r4 = X.AnonymousClass000.A0p(r2, r3, r4)
            r3 = 0
            java.lang.String r2 = "Bloks Flexbox"
            X.AnonymousClass6RS.A00(r1, r2, r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L_0x06b6:
            int r2 = r2.intValue()
            r9 = 4
            if (r2 != r9) goto L_0x078b
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
            r4.A01 = r9
        L_0x06c7:
            r3 = 40
            r2 = 1
            boolean r2 = r0.A0f(r3, r2)
            if (r2 != 0) goto L_0x06dd
            if (r4 != 0) goto L_0x06da
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
        L_0x06da:
            r2 = 0
            r4.A07 = r2
        L_0x06dd:
            r2 = 45
            X.7ku r9 = r0.A0X(r2)
            if (r9 == 0) goto L_0x06f7
            if (r4 != 0) goto L_0x06ef
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
        L_0x06ef:
            r3 = 1
            X.3Yo r2 = new X.3Yo
            r2.<init>((X.C1271967i) r1, (X.C140456lc) r0, (X.C160377ku) r9, (int) r3)
            r4.A04 = r2
        L_0x06f7:
            if (r6 == 0) goto L_0x07dd
            if (r4 != 0) goto L_0x0703
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
        L_0x0703:
            r4.A05 = r6
            r2 = 35
            X.6lc r13 = r6.A0W(r2)
            X.67i r10 = r4.A09
            java.util.Objects.requireNonNull(r10)
            r9 = 0
            r3 = 0
            if (r13 == 0) goto L_0x075e
            X.6NR r2 = X.AnonymousClass6NR.A00()
            X.65V r6 = r2.A02
            X.6lc r2 = r4.A05
            android.graphics.drawable.Drawable r6 = r6.A00(r10, r13, r2)
            X.AnonymousClass6NR.A00()
            int r11 = r13.A04
            r2 = 13761(0x35c1, float:1.9283E-41)
            if (r11 == r2) goto L_0x0756
            r15 = 0
        L_0x072a:
            X.6lc r11 = r4.A05
            r2 = 49
            X.6lc r13 = r11.A0W(r2)
            if (r13 == 0) goto L_0x074b
            X.6NR r2 = X.AnonymousClass6NR.A00()
            X.65V r9 = r2.A02
            X.6lc r2 = r4.A05
            android.graphics.drawable.Drawable r9 = r9.A00(r10, r13, r2)
            X.AnonymousClass6NR.A00()
            int r11 = r13.A04
            r2 = 13761(0x35c1, float:1.9283E-41)
            if (r11 == r2) goto L_0x074e
            r2 = 0
        L_0x074a:
            r15 = r15 | r2
        L_0x074b:
            if (r6 != 0) goto L_0x07d4
            goto L_0x078e
        L_0x074e:
            r11 = 40
            r2 = 1
            boolean r2 = r13.A0f(r11, r2)
            goto L_0x074a
        L_0x0756:
            r11 = 40
            r2 = 1
            boolean r15 = r13.A0f(r11, r2)
            goto L_0x072a
        L_0x075e:
            r6 = r9
            r15 = 0
            goto L_0x072a
        L_0x0761:
            java.lang.String r2 = "invisible"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x06a2
            java.lang.Integer r2 = X.C36371kC.A0o()
            goto L_0x06b6
        L_0x076f:
            java.lang.String r2 = "gone"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x06a2
            java.lang.Integer r2 = X.C36391kE.A0r()
            goto L_0x06b6
        L_0x077d:
            java.lang.String r2 = "visible"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x06a2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x06b6
        L_0x078b:
            r4 = 0
            goto L_0x06c7
        L_0x078e:
            X.6lc r11 = r4.A05     // Catch:{ 5R5 -> 0x07ce }
            r2 = 43
            boolean r2 = r11.A0f(r2, r3)     // Catch:{ 5R5 -> 0x07ce }
            r14 = 1
            boolean r13 = X.AnonymousClass000.A1Q(r2)
            X.6lc r11 = r4.A05     // Catch:{ 5R5 -> 0x07ce }
            r2 = 46
            java.lang.Object r2 = A0I(r11, r2)     // Catch:{ 5R5 -> 0x07ce }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5R5 -> 0x07ce }
            r11 = 0
            if (r2 == 0) goto L_0x07b1
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x07ce }
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x07b1
            r14 = 0
        L_0x07b1:
            if (r13 != 0) goto L_0x07b5
            if (r14 == 0) goto L_0x07d4
        L_0x07b5:
            X.6lc r2 = r4.A05     // Catch:{ 5R5 -> 0x07ce }
            java.lang.String r2 = A0M(r2)     // Catch:{ 5R5 -> 0x07ce }
            if (r2 != 0) goto L_0x07be
            goto L_0x07c3
        L_0x07be:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x07ce }
            goto L_0x07c4
        L_0x07c3:
            r2 = 0
        L_0x07c4:
            int r2 = (int) r2     // Catch:{ 5R5 -> 0x07ce }
            if (r2 == 0) goto L_0x07d4
            X.6lc r2 = r4.A05     // Catch:{ 5R5 -> 0x07ce }
            X.4bY r6 = X.C131776Qo.A01(r10, r2, r3)     // Catch:{ 5R5 -> 0x07ce }
            goto L_0x07d4
        L_0x07ce:
            r3 = move-exception
            java.lang.String r2 = "HostWithDecoratorRenderUnit"
            X.AnonymousClass6RS.A02(r2, r3)
        L_0x07d4:
            r4.A02 = r6
            r4.A03 = r9
            if (r15 == 0) goto L_0x07dd
            r2 = 2
            r4.A00 = r2
        L_0x07dd:
            java.util.List r13 = r0.A0b()
            r6 = 0
            r11 = 0
        L_0x07e3:
            int r2 = r13.size()
            if (r11 >= r2) goto L_0x087b
            X.6lc r9 = X.C90504aG.A0K(r13, r11)
            X.6lc r10 = A0B(r9)
            if (r10 == 0) goto L_0x0877
            int r3 = r10.A04
            r2 = 13368(0x3438, float:1.8733E-41)
            if (r3 != r2) goto L_0x0877
            r2 = 75
            X.6lc r3 = r10.A0W(r2)
            if (r3 == 0) goto L_0x0877
            if (r6 != 0) goto L_0x0807
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
        L_0x0807:
            X.5xc r10 = new X.5xc
            r10.<init>()
            int r2 = r9.A03
            r10.A06 = r2
            r2 = 42
            java.lang.Object r2 = A0I(r3, r2)     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x081c
            r2 = 1
            goto L_0x0820
        L_0x081c:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x0820:
            r10.A05 = r2     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = A0J(r3)     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x082a
            r2 = 1
            goto L_0x082e
        L_0x082a:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x082e:
            r10.A00 = r2     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = A0N(r3)     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x0838
            r2 = 1
            goto L_0x083c
        L_0x0838:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x083c:
            r10.A04 = r2     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = A0K(r3)     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x0846
            r2 = 1
            goto L_0x084a
        L_0x0846:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x084a:
            r10.A01 = r2     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = A0L(r3)     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x0854
            r2 = 1
            goto L_0x0858
        L_0x0854:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x0858:
            r10.A02 = r2     // Catch:{ 5R5 -> 0x0869 }
            java.lang.String r2 = A0M(r3)     // Catch:{ 5R5 -> 0x0869 }
            if (r2 != 0) goto L_0x0862
            r2 = 1
            goto L_0x0866
        L_0x0862:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x0869 }
        L_0x0866:
            r10.A03 = r2     // Catch:{ 5R5 -> 0x0869 }
            goto L_0x0874
        L_0x0869:
            r9 = move-exception
            java.lang.String r3 = "FlexboxBinderUtils"
            java.lang.String r2 = "Error parsing touch expansion property"
            X.AnonymousClass6RS.A01(r3, r2)
            r9.printStackTrace()
        L_0x0874:
            r6.add(r10)
        L_0x0877:
            int r11 = r11 + 1
            goto L_0x07e3
        L_0x087b:
            if (r6 == 0) goto L_0x0a3f
            if (r4 != 0) goto L_0x0887
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
        L_0x0887:
            X.6lz r2 = new X.6lz
            r2.<init>(r6)
            X.61a r3 = new X.61a
            r3.<init>(r2, r6)
            goto L_0x08df
        L_0x0892:
            java.lang.Object r2 = A0H(r1, r0)
            X.6Tu r4 = X.C133186Xd.A02(r1, r0, r2)
            goto L_0x0a3f
        L_0x089c:
            X.4uY r4 = new X.4uY
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x08a3:
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r1 r4 = new X.4r1
            r4.<init>(r2)
            r2 = 41
            X.7ku r3 = r0.A0X(r2)
            if (r3 == 0) goto L_0x08bb
            X.6m6 r2 = new X.6m6
            r2.<init>(r1, r0, r3)
            X.C1257261a.A00(r2, r4)
        L_0x08bb:
            X.6ly r2 = new X.6ly
            r2.<init>(r1)
            X.C1257261a.A00(r2, r4)
            goto L_0x0a3f
        L_0x08c5:
            int r2 = r0.A03
            long r2 = (long) r2
            X.4r1 r4 = new X.4r1
            r4.<init>(r2)
            r2 = 40
            X.7ku r3 = r0.A0X(r2)
            if (r3 == 0) goto L_0x0a3f
            X.6m6 r2 = new X.6m6
            r2.<init>(r1, r0, r3)
            X.61a r3 = new X.61a
            r3.<init>(r2, r4)
        L_0x08df:
            r4.A0E(r3)
            goto L_0x0a3f
        L_0x08e4:
            X.4uZ r4 = new X.4uZ
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x08eb:
            int r2 = r0.A03
            long r2 = (long) r2
            boolean r5 = X.C133266Xn.A08(r1)
            X.4r2 r4 = new X.4r2
            r4.<init>(r1, r2, r5)
            goto L_0x0a3f
        L_0x08f9:
            X.4uW r4 = new X.4uW
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0900:
            X.4uV r4 = new X.4uV
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0907:
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            X.C36331k8.A1W(r3, r12)
            java.lang.String r2 = "Attempting to createRenderUnit for unrecognized component style id %s"
            java.lang.String r3 = java.lang.String.format(r2, r3)
            java.lang.String r2 = "ComponentMapper"
            X.AnonymousClass6RS.A01(r2, r3)
            r4 = 0
            goto L_0x0a3f
        L_0x091c:
            X.6Ti r2 = r3.A01
            X.4uf r4 = new X.4uf
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x0925:
            X.6Ti r2 = r3.A01
            X.4ud r4 = new X.4ud
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x092e:
            X.6Ti r2 = r3.A01
            X.4un r4 = new X.4un
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0937:
            X.6Ti r2 = r3.A01
            X.4ut r4 = new X.4ut
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x0940:
            X.6Ti r2 = r3.A01
            X.4ui r4 = new X.4ui
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0949:
            X.6Ti r2 = r3.A01
            X.4uh r4 = new X.4uh
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0952:
            X.6Ti r2 = r3.A01
            X.4uu r4 = new X.4uu
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x095b:
            X.6Ue r2 = r3.A00
            X.4ul r4 = new X.4ul
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0964:
            X.4r2 r4 = A0D(r1, r0)
            goto L_0x0a3f
        L_0x096a:
            X.4uv r4 = new X.4uv
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0971:
            X.4ub r4 = new X.4ub
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x0978:
            X.4ua r4 = new X.4ua
            r4.<init>(r1, r0)
            goto L_0x0a3f
        L_0x097f:
            X.6Ti r3 = r3.A01
            r2 = 2
            X.AnonymousClass00C.A0D(r3, r2)
            X.21X r4 = new X.21X
            r4.<init>(r1, r0, r3)
            goto L_0x0a3f
        L_0x098c:
            X.6Ue r4 = r3.A00
            android.content.Context r10 = r1.A00
            r9 = 0
            X.6lG r6 = new X.6lG
            r6.<init>(r9)
            android.content.Context r5 = r10.getApplicationContext()
            X.5RY r3 = X.AnonymousClass5RY.CAMERA1
            X.B3p r22 = X.AnonymousClass94V.A00(r10, r3)
            android.content.Context r19 = r5.getApplicationContext()
            X.9pq r21 = new X.9pq
            r21.<init>()
            X.A0j r5 = new X.A0j
            r24 = 0
            r18 = r5
            r20 = r2
            r23 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r5.A0F = r9
            r6 = 921600(0xe1000, float:1.291437E-39)
            java.lang.String r3 = "Video resolution level must be set before initializing the camera."
            boolean r2 = r5.A0H     // Catch:{ Exception -> 0x09d6 }
            if (r2 == 0) goto L_0x09d1
            r5.A09 = r6     // Catch:{ Exception -> 0x09d6 }
            r2 = 1048576(0x100000, float:1.469368E-39)
            r5.A05 = r2     // Catch:{ Exception -> 0x09d6 }
            r5.Brj(r6)     // Catch:{ Exception -> 0x09d6 }
            r3 = 1
            X.B3p r2 = r5.A0L     // Catch:{ Exception -> 0x09d6 }
            r2.BrC(r3)     // Catch:{ Exception -> 0x09d6 }
            goto L_0x09d6
        L_0x09d1:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r3)     // Catch:{ Exception -> 0x09d6 }
            throw r2     // Catch:{ Exception -> 0x09d6 }
        L_0x09d6:
            X.5wz r3 = r4.A02
            r2 = 3
            X.AnonymousClass00C.A0D(r3, r2)
            X.5pG r2 = new X.5pG
            r2.<init>(r1, r0)
            X.4uq r4 = new X.4uq
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r0
            r22 = r2
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0a3f
        L_0x09f3:
            X.6Ti r2 = r3.A01
            X.4ue r4 = new X.4ue
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x09fb:
            X.6Ti r2 = r3.A01
            if (r2 == 0) goto L_0x22ea
            X.4uo r4 = new X.4uo
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0a05:
            X.6Ti r2 = r3.A01
            X.4uc r4 = new X.4uc
            r4.<init>(r1, r0, r2)
            goto L_0x0a3f
        L_0x0a0d:
            X.6Ti r2 = r3.A01
            X.4uk r4 = new X.4uk
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0a15:
            X.6Ti r2 = r3.A01
            X.4up r4 = new X.4up
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0a1d:
            X.6Ti r2 = r3.A01
            X.4uj r4 = new X.4uj
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0a25:
            X.6Ti r2 = r3.A01
            X.4um r4 = new X.4um
            r4.<init>(r1, r0, r0, r2)
            goto L_0x0a3f
        L_0x0a2d:
            X.6j1 r2 = X.C138986j1.A00
            X.4ug r4 = new X.4ug
            r4.<init>(r2, r1, r0)
            goto L_0x0a3f
        L_0x0a35:
            X.6j0 r2 = new X.6j0
            r2.<init>()
            X.4ug r4 = new X.4ug
            r4.<init>(r2, r1, r0)
        L_0x0a3f:
            X.6Tu r2 = r0.A08(r4, r1)
            X.6NR r3 = X.AnonymousClass6NR.A00()
            X.6Sg r3 = r3.A09
            switch(r12) {
                case 13323: goto L_0x2266;
                case 13889: goto L_0x2197;
                case 13948: goto L_0x220e;
                case 14005: goto L_0x2239;
                case 14093: goto L_0x21e9;
                case 15763: goto L_0x216a;
                case 15768: goto L_0x20ae;
                case 15972: goto L_0x2239;
                case 15981: goto L_0x2253;
                case 16094: goto L_0x21f1;
                case 16534: goto L_0x2242;
                case 16682: goto L_0x21e1;
                case 16718: goto L_0x2099;
                default: goto L_0x0a4c;
            }
        L_0x0a4c:
            switch(r12) {
                case 13496: goto L_0x2075;
                case 13497: goto L_0x21f1;
                case 13498: goto L_0x1fed;
                case 13499: goto L_0x2050;
                default: goto L_0x0a4f;
            }
        L_0x0a4f:
            switch(r12) {
                case 13501: goto L_0x1fc7;
                case 13502: goto L_0x1f43;
                case 13503: goto L_0x1f9d;
                case 13504: goto L_0x1f86;
                default: goto L_0x0a52;
            }
        L_0x0a52:
            boolean r3 = X.C109575Yc.A00(r12)
            if (r3 == 0) goto L_0x1f12
            switch(r12) {
                case 13317: goto L_0x0a7b;
                case 13320: goto L_0x1d2a;
                case 13323: goto L_0x1bd3;
                case 13326: goto L_0x1d13;
                case 13327: goto L_0x1b74;
                case 13329: goto L_0x1960;
                case 13334: goto L_0x0a60;
                case 13335: goto L_0x1799;
                case 13336: goto L_0x1c93;
                case 13666: goto L_0x1c7c;
                case 13708: goto L_0x1beb;
                case 13797: goto L_0x169f;
                case 14093: goto L_0x21e9;
                case 15728: goto L_0x1c4c;
                case 15778: goto L_0x1c2e;
                case 15981: goto L_0x1c1b;
                case 16160: goto L_0x1bf3;
                case 16260: goto L_0x1be3;
                case 16444: goto L_0x1bdb;
                case 16682: goto L_0x21e1;
                default: goto L_0x0a5b;
            }
        L_0x0a5b:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r12)
            throw r0
        L_0x0a60:
            if (r2 == 0) goto L_0x22f1
            java.lang.Object r4 = A0G(r7, r2)
            X.7lE r4 = (X.C160577lE) r4
            r1 = r44
            r4.measure(r1, r8)
            int r3 = r4.getMeasuredWidth()
            int r1 = r4.getMeasuredHeight()
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x0a7b:
            r9 = 0
            r5 = 2
            r6 = 1
            X.AnonymousClass00C.A0D(r2, r5)
            java.lang.Integer r3 = A0F(r0)
            int r3 = r3.intValue()
            if (r3 == r9) goto L_0x115a
            if (r3 == r6) goto L_0x0d8b
            X.6M4 r3 = X.AnonymousClass6M4.A00
            android.content.Context r10 = r7.A02
            X.5wo r3 = r3.A00(r10, r0)
            int r13 = r3.A01
            int r12 = r3.A02
            android.graphics.Rect r11 = r3.A04
            int r5 = r3.A00
            int r4 = r3.A03
            boolean r29 = X.AnonymousClass5ZC.A00(r10)
            java.util.List r3 = r0.A0b()
            java.util.ArrayList r28 = X.C36361kB.A0r(r3)
            X.5s8 r27 = new X.5s8
            r3 = r27
            r3.<init>(r7, r0)
            int r10 = android.view.View.MeasureSpec.getSize(r44)
            int r3 = r11.left
            int r10 = r10 - r3
            int r3 = r11.right
            int r10 = r10 - r3
            int r14 = android.view.View.MeasureSpec.getSize(r8)
            int r3 = r11.top
            int r14 = r14 - r3
            int r3 = r11.bottom
            int r14 = r14 - r3
            if (r13 == r6) goto L_0x0ac9
            r10 = r14
        L_0x0ac9:
            int[] r3 = new int[r12]
            r26 = r3
            int r17 = r10 / r12
            int r10 = r10 % r12
            r14 = 0
            r15 = 0
        L_0x0ad2:
            if (r14 >= r12) goto L_0x0ae6
            int r15 = r15 + r10
            if (r15 <= 0) goto L_0x0ae3
            int r3 = r12 - r15
            if (r3 >= r10) goto L_0x0ae3
            int r3 = r17 + 1
            int r15 = r15 - r12
        L_0x0ade:
            r26[r14] = r3
            int r14 = r14 + 1
            goto L_0x0ad2
        L_0x0ae3:
            r3 = r17
            goto L_0x0ade
        L_0x0ae6:
            r10 = r4
            if (r13 != r6) goto L_0x0aea
            r10 = r5
        L_0x0aea:
            r3 = r29
            android.graphics.Rect[] r25 = X.AnonymousClass5Y3.A00(r13, r10, r12, r3)
            if (r13 != r6) goto L_0x0b03
            int r10 = r4 / 2
        L_0x0af4:
            X.5o4[] r5 = new X.AnonymousClass5o4[r12]
            r4 = 0
        L_0x0af7:
            if (r4 >= r12) goto L_0x0b06
            X.5o4 r3 = new X.5o4
            r3.<init>()
            r5[r4] = r3
            int r4 = r4 + 1
            goto L_0x0af7
        L_0x0b03:
            int r10 = r5 / 2
            goto L_0x0af4
        L_0x0b06:
            java.util.List r3 = r0.A0b()
            java.util.ArrayList r24 = X.C36361kB.A0r(r3)
            java.util.List r3 = r0.A0b()
            java.util.Iterator r23 = X.C90514aH.A14(r3)
            r22 = 0
        L_0x0b18:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x0ce8
            java.lang.Object r21 = r23.next()
            int r20 = r22 + 1
            if (r22 >= 0) goto L_0x0b2b
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x0b2b:
            r3 = r21
            X.6lc r3 = (X.C140456lc) r3
            r21 = r3
            X.AnonymousClass00C.A0B(r21)
            X.6lc r4 = A0B(r21)
            r19 = 0
            if (r4 == 0) goto L_0x0bdc
            int r14 = r4.A04
            r3 = 16482(0x4062, float:2.3096E-41)
            if (r14 != r3) goto L_0x0bdc
            r3 = 36
            boolean r19 = r4.A0f(r3, r9)
            if (r19 == 0) goto L_0x0bdc
            X.0lk r4 = new X.0lk
            r4.<init>(r5)
            X.0fX r3 = new X.0fX
            r3.<init>(r4)
            java.util.Iterator r17 = r3.iterator()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0c1c
            java.lang.Object r14 = r17.next()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0b88
            r3 = r14
            X.0Ug r3 = (X.C06600Ug) r3
            java.lang.Object r3 = r3.A01
            X.5o4 r3 = (X.AnonymousClass5o4) r3
            int r4 = r3.A00
        L_0x0b71:
            java.lang.Object r15 = r17.next()
            r3 = r15
            X.0Ug r3 = (X.C06600Ug) r3
            java.lang.Object r3 = r3.A01
            X.5o4 r3 = (X.AnonymousClass5o4) r3
            int r3 = r3.A00
            if (r4 >= r3) goto L_0x0b82
            r4 = r3
            r14 = r15
        L_0x0b82:
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x0b71
        L_0x0b88:
            X.0Ug r14 = (X.C06600Ug) r14
            if (r14 == 0) goto L_0x22f8
            int r3 = r14.A00
            r18 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            if (r3 == 0) goto L_0x22f8
            if (r19 == 0) goto L_0x0bd4
            android.graphics.Rect r15 = X.AnonymousClass001.A06()
        L_0x0b9c:
            r3 = r24
            r3.add(r15)
            X.6lc r14 = A0B(r21)
            r17 = 0
            if (r14 == 0) goto L_0x0bc8
            int r3 = r14.A04
            r4 = r3
            r3 = 16482(0x4062, float:2.3096E-41)
            if (r4 != r3) goto L_0x0bc8
            r3 = 35
            java.lang.Object r4 = A0I(r14, r3)
            if (r4 == 0) goto L_0x0bc8
            boolean r3 = r4 instanceof java.lang.Number
            if (r3 == 0) goto L_0x0bc8
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0bc8
            float r3 = r4.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
        L_0x0bc8:
            if (r19 == 0) goto L_0x0c1f
            r3 = 0
            r4 = 0
        L_0x0bcc:
            if (r3 >= r12) goto L_0x0c21
            r14 = r26[r3]
            int r4 = r4 + r14
            int r3 = r3 + 1
            goto L_0x0bcc
        L_0x0bd4:
            r3 = r25[r18]
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r3)
            goto L_0x0b9c
        L_0x0bdc:
            X.0lk r4 = new X.0lk
            r4.<init>(r5)
            X.0fX r3 = new X.0fX
            r3.<init>(r4)
            java.util.Iterator r17 = r3.iterator()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0c1c
            java.lang.Object r14 = r17.next()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0b88
            r3 = r14
            X.0Ug r3 = (X.C06600Ug) r3
            java.lang.Object r3 = r3.A01
            X.5o4 r3 = (X.AnonymousClass5o4) r3
            int r4 = r3.A00
        L_0x0c03:
            java.lang.Object r15 = r17.next()
            r3 = r15
            X.0Ug r3 = (X.C06600Ug) r3
            java.lang.Object r3 = r3.A01
            X.5o4 r3 = (X.AnonymousClass5o4) r3
            int r3 = r3.A00
            if (r4 <= r3) goto L_0x0c14
            r4 = r3
            r14 = r15
        L_0x0c14:
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x0c03
            goto L_0x0b88
        L_0x0c1c:
            r14 = 0
            goto L_0x0b88
        L_0x0c1f:
            r4 = r26[r18]
        L_0x0c21:
            if (r13 != r6) goto L_0x0cac
            int r3 = r15.left
            int r4 = r4 - r3
            int r3 = r15.right
        L_0x0c28:
            int r4 = r4 - r3
            if (r17 == 0) goto L_0x0ca9
            if (r19 != 0) goto L_0x0ca9
            float r14 = (float) r4
            float r3 = r17.floatValue()
            float r14 = r14 * r3
            int r14 = (int) r14
            int r3 = X.C112845eY.A00
            int r14 = X.C90504aG.A08(r14)
        L_0x0c3a:
            int r3 = X.C90504aG.A08(r4)
            r4 = r3
            if (r13 != 0) goto L_0x0c43
            r4 = r14
            r14 = r3
        L_0x0c43:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            X.011 r4 = X.C36421kH.A0j(r3, r14)
            int r3 = X.C90484aE.A0H(r4)
            int r15 = X.C90474aD.A08(r4)
            r14 = r27
            r4 = r21
            X.5om r4 = A09(r14, r7, r4, r3, r15)
            r3 = r28
            r3.add(r4)
            X.4r9 r3 = r4.A00
            java.lang.Object r3 = r3.A00()
            X.6Kq r3 = (X.C130326Kq) r3
            X.5vr r3 = r3.A02
            com.facebook.rendercore.RenderTreeNode r3 = r3.A02
            android.graphics.Rect r3 = r3.A03
            if (r13 != r6) goto L_0x0ca4
            int r4 = r3.height()
        L_0x0c74:
            r17 = r5[r18]
            r3 = r17
            int r14 = r3.A00
            int r14 = r14 + r4
            X.5hT r3 = r3.A01
            if (r3 == 0) goto L_0x0cc1
            int r3 = r10 * 2
            int r14 = r14 + r3
            r15 = 0
        L_0x0c83:
            if (r15 >= r12) goto L_0x0cb3
            r3 = r5[r15]
            X.5hT r3 = r3.A01
            if (r3 == 0) goto L_0x0c99
            int r3 = r3.A00
            r4 = r24
            java.lang.Object r3 = r4.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r13 != r6) goto L_0x0c9c
            r3.bottom = r10
        L_0x0c99:
            int r15 = r15 + 1
            goto L_0x0c83
        L_0x0c9c:
            if (r29 != 0) goto L_0x0ca1
            r3.right = r10
            goto L_0x0c99
        L_0x0ca1:
            r3.left = r10
            goto L_0x0c99
        L_0x0ca4:
            int r4 = r3.width()
            goto L_0x0c74
        L_0x0ca9:
            int r14 = X.C112845eY.A00
            goto L_0x0c3a
        L_0x0cac:
            int r3 = r15.top
            int r4 = r4 - r3
            int r3 = r15.bottom
            goto L_0x0c28
        L_0x0cb3:
            r4 = r24
            r3 = r22
            java.lang.Object r3 = r4.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r13 != r6) goto L_0x0cd6
            r3.top = r10
        L_0x0cc1:
            X.5hT r15 = new X.5hT
            r3 = r22
            r15.<init>(r3)
            if (r19 == 0) goto L_0x0cde
            r4 = 0
        L_0x0ccb:
            if (r4 >= r12) goto L_0x0ce4
            r3 = r5[r4]
            r3.A01 = r15
            r3.A00 = r14
            int r4 = r4 + 1
            goto L_0x0ccb
        L_0x0cd6:
            if (r29 != 0) goto L_0x0cdb
            r3.left = r10
            goto L_0x0cc1
        L_0x0cdb:
            r3.right = r10
            goto L_0x0cc1
        L_0x0cde:
            r3 = r17
            r3.A01 = r15
            r3.A00 = r14
        L_0x0ce4:
            r22 = r20
            goto L_0x0b18
        L_0x0ce8:
            java.lang.Object r3 = X.C133266Xn.A04(r1, r0)
            X.AnonymousClass00C.A08(r3)
            X.6OR r3 = (X.AnonymousClass6OR) r3
            r1 = r24
            r3.A08 = r1
            int r7 = android.view.View.MeasureSpec.getMode(r44)
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            if (r13 != r6) goto L_0x0d08
            if (r7 != 0) goto L_0x0d11
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0d08:
            if (r4 != 0) goto L_0x0d11
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0d11:
            r10 = 0
            if (r12 == 0) goto L_0x0d1e
            r9 = r5[r9]
            int r3 = r12 + -1
            if (r3 != 0) goto L_0x0d6d
            if (r9 == 0) goto L_0x0d1e
        L_0x0d1c:
            int r10 = r9.A00
        L_0x0d1e:
            if (r13 != r6) goto L_0x0d68
            int r3 = r11.top
            int r1 = r11.bottom
        L_0x0d24:
            int r3 = r3 + r1
            int r10 = r10 + r3
            int r5 = android.view.View.MeasureSpec.getSize(r44)
            if (r13 != 0) goto L_0x0d36
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == r1) goto L_0x0d36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r1) goto L_0x0d66
            if (r10 < r5) goto L_0x0d66
        L_0x0d36:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            if (r13 != r6) goto L_0x0d46
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r1) goto L_0x0d46
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r1) goto L_0x0d64
            if (r10 < r3) goto L_0x0d64
        L_0x0d46:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.011 r1 = X.C36421kH.A0j(r1, r3)
            int r6 = X.C90484aE.A0H(r1)
            int r5 = X.C90474aD.A08(r1)
            X.5sK r4 = new X.5sK
            r1 = r28
            r4.<init>(r1, r6, r5)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r4, r6, r5)
            goto L_0x00db
        L_0x0d64:
            r3 = r10
            goto L_0x0d46
        L_0x0d66:
            r5 = r10
            goto L_0x0d36
        L_0x0d68:
            int r3 = r11.left
            int r1 = r11.right
            goto L_0x0d24
        L_0x0d6d:
            int r10 = r9.A00
            X.0mZ r1 = new X.0mZ
            r1.<init>(r6, r3)
            X.0k7 r12 = r1.iterator()
        L_0x0d78:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0d1c
            int r1 = r12.A00()
            r3 = r5[r1]
            int r1 = r3.A00
            if (r10 >= r1) goto L_0x0d78
            r9 = r3
            r10 = r1
            goto L_0x0d78
        L_0x0d8b:
            X.6M4 r4 = X.AnonymousClass6M4.A00
            android.content.Context r3 = r7.A02
            r43 = r3
            X.5wo r4 = r4.A00(r3, r0)
            int r5 = r4.A01
            int r10 = r4.A02
            int r3 = r4.A00
            r42 = r3
            int r3 = r4.A03
            r41 = r3
            android.graphics.Rect r13 = r4.A04
            X.6lc r4 = r4.A05
            r3 = 35
            java.lang.Object r40 = A0I(r4, r3)
            r3 = r40
            boolean r3 = r3 instanceof java.lang.Number
            r39 = 0
            if (r3 == 0) goto L_0x0e08
            r3 = r40
            java.lang.Number r3 = (java.lang.Number) r3
            r40 = r3
        L_0x0db9:
            java.util.List r14 = r0.A0b()
            java.util.ArrayList r38 = X.C36411kG.A13(r14)
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            int r11 = r14.size()
            r15 = 0
        L_0x0dca:
            if (r9 >= r11) goto L_0x0e0b
            X.6lc r4 = X.C90504aG.A0K(r14, r9)
            boolean r3 = A0R(r4)
            if (r3 == 0) goto L_0x0e03
            r17 = r10
        L_0x0dd8:
            int r15 = r15 + r17
            if (r15 <= r10) goto L_0x0dff
            java.util.List r15 = X.C007103b.A0Y(r12)
            r3 = r38
            r3.add(r15)
            r12.clear()
            r12.add(r4)
            r15 = r17
        L_0x0ded:
            int r3 = X.C36431kI.A07(r14)
            if (r9 != r3) goto L_0x0dfc
            java.util.List r4 = X.C007103b.A0Y(r12)
            r3 = r38
            r3.add(r4)
        L_0x0dfc:
            int r9 = r9 + 1
            goto L_0x0dca
        L_0x0dff:
            r12.add(r4)
            goto L_0x0ded
        L_0x0e03:
            int r17 = A03(r4)
            goto L_0x0dd8
        L_0x0e08:
            r40 = r39
            goto L_0x0db9
        L_0x0e0b:
            int r37 = r38.size()
            java.util.ArrayList r36 = X.C36441kJ.A14(r37)
            java.util.List r3 = r0.A0b()
            java.util.ArrayList r35 = X.C36361kB.A0r(r3)
            X.5s8 r34 = new X.5s8
            r3 = r34
            r3.<init>(r7, r0)
            int r11 = android.view.View.MeasureSpec.getSize(r44)
            int r3 = r13.left
            int r11 = r11 - r3
            int r3 = r13.right
            int r11 = r11 - r3
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            int r3 = r13.top
            int r4 = r4 - r3
            int r3 = r13.bottom
            int r4 = r4 - r3
            if (r5 == r6) goto L_0x0e39
            r11 = r4
        L_0x0e39:
            int[] r3 = new int[r10]
            r33 = r3
            int r12 = r11 / r10
            int r11 = r11 % r10
            r9 = 0
            r4 = 0
        L_0x0e42:
            if (r9 >= r10) goto L_0x0e55
            int r4 = r4 + r11
            if (r4 <= 0) goto L_0x0e53
            int r3 = r10 - r4
            if (r3 >= r11) goto L_0x0e53
            int r3 = r12 + 1
            int r4 = r4 - r10
        L_0x0e4e:
            r33[r9] = r3
            int r9 = r9 + 1
            goto L_0x0e42
        L_0x0e53:
            r3 = r12
            goto L_0x0e4e
        L_0x0e55:
            java.util.List r3 = r0.A0b()
            java.util.ArrayList r32 = X.C36361kB.A0r(r3)
            int r31 = r38.size()
            r12 = 0
        L_0x0e62:
            r3 = r31
            if (r12 >= r3) goto L_0x1051
            r3 = r38
            java.lang.Object r30 = r3.get(r12)
            r3 = r30
            java.util.List r3 = (java.util.List) r3
            r30 = r3
            java.util.ArrayList r29 = X.AnonymousClass001.A0I()
            java.util.ArrayList r28 = X.AnonymousClass001.A0I()
            boolean r27 = X.AnonymousClass5ZC.A00(r43)
            java.util.ArrayList r26 = X.C36361kB.A0r(r30)
            java.util.Iterator r25 = r30.iterator()
            r11 = 0
        L_0x0e87:
            boolean r3 = r25.hasNext()
            if (r3 == 0) goto L_0x0f4a
            X.6lc r4 = X.C90514aH.A0Y(r25)
            boolean r3 = A0R(r4)
            if (r3 == 0) goto L_0x0f44
            r9 = r10
        L_0x0e98:
            int r9 = r9 + r11
            int r9 = r9 - r6
            if (r5 != r6) goto L_0x0f3c
            if (r12 != 0) goto L_0x0f40
        L_0x0e9e:
            r24 = 1
        L_0x0ea0:
            if (r5 != r6) goto L_0x0f34
            if (r11 != 0) goto L_0x0f38
        L_0x0ea4:
            r19 = 1
        L_0x0ea6:
            if (r5 != r6) goto L_0x0f2a
            int r3 = r10 + -1
            if (r9 != r3) goto L_0x0f30
        L_0x0eac:
            r23 = 1
        L_0x0eae:
            if (r5 != r6) goto L_0x0f22
            int r3 = r37 + -1
            if (r12 != r3) goto L_0x0f27
        L_0x0eb4:
            r22 = 1
        L_0x0eb6:
            r3 = r42
            double r14 = (double) r3
            double r3 = (double) r10
            r17 = r3
            double r14 = r14 / r3
            r3 = r41
            double r3 = (double) r3
            double r20 = r3 / r17
            if (r19 == 0) goto L_0x0f13
            r19 = 0
        L_0x0ec6:
            if (r24 == 0) goto L_0x0f06
            r11 = 0
        L_0x0ec9:
            if (r23 == 0) goto L_0x0ef5
            r14 = 0
        L_0x0ecc:
            if (r22 == 0) goto L_0x0ee4
            r15 = 0
        L_0x0ecf:
            android.graphics.Rect r4 = new android.graphics.Rect
            r3 = r19
            if (r27 != 0) goto L_0x0ee0
            r4.<init>(r3, r11, r14, r15)
        L_0x0ed8:
            r3 = r26
            r3.add(r4)
            int r11 = r9 + 1
            goto L_0x0e87
        L_0x0ee0:
            r4.<init>(r14, r11, r3, r15)
            goto L_0x0ed8
        L_0x0ee4:
            if (r5 != 0) goto L_0x0ef2
            int r3 = r9 + 1
            double r3 = (double) r3
            double r17 = r3 * r20
            int r3 = X.C14960mT.A00(r17)
            int r15 = r41 - r3
            goto L_0x0ecf
        L_0x0ef2:
            int r15 = r41 / 2
            goto L_0x0ecf
        L_0x0ef5:
            if (r5 != r6) goto L_0x0f03
            int r3 = r9 + 1
            double r3 = (double) r3
            double r17 = r3 * r14
            int r3 = X.C14960mT.A00(r17)
            int r14 = r42 - r3
            goto L_0x0ecc
        L_0x0f03:
            int r14 = r42 / 2
            goto L_0x0ecc
        L_0x0f06:
            if (r5 != 0) goto L_0x0f10
            double r3 = (double) r11
            double r17 = r3 * r20
            int r11 = X.C14960mT.A00(r17)
            goto L_0x0ec9
        L_0x0f10:
            int r11 = r41 / 2
            goto L_0x0ec9
        L_0x0f13:
            if (r5 != r6) goto L_0x0f1d
            double r3 = (double) r11
            double r17 = r3 * r14
            int r19 = X.C14960mT.A00(r17)
            goto L_0x0ec6
        L_0x0f1d:
            int r3 = r42 / 2
            r19 = r3
            goto L_0x0ec6
        L_0x0f22:
            int r3 = r10 + -1
            if (r9 != r3) goto L_0x0f27
            goto L_0x0eb4
        L_0x0f27:
            r22 = 0
            goto L_0x0eb6
        L_0x0f2a:
            int r3 = r37 + -1
            if (r12 != r3) goto L_0x0f30
            goto L_0x0eac
        L_0x0f30:
            r23 = 0
            goto L_0x0eae
        L_0x0f34:
            if (r12 != 0) goto L_0x0f38
            goto L_0x0ea4
        L_0x0f38:
            r19 = 0
            goto L_0x0ea6
        L_0x0f3c:
            if (r11 != 0) goto L_0x0f40
            goto L_0x0e9e
        L_0x0f40:
            r24 = 0
            goto L_0x0ea0
        L_0x0f44:
            int r9 = A03(r4)
            goto L_0x0e98
        L_0x0f4a:
            int r22 = r30.size()
            r21 = 0
            r20 = 0
            r15 = 0
        L_0x0f53:
            r3 = r22
            if (r15 >= r3) goto L_0x1004
            r3 = r30
            X.6lc r14 = X.C90504aG.A0K(r3, r15)
            boolean r19 = A0R(r14)
            if (r19 == 0) goto L_0x0ffe
            r9 = r10
        L_0x0f64:
            r3 = r26
            java.lang.Object r3 = r3.get(r15)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r4 = r32
            r4.add(r3)
            if (r40 == 0) goto L_0x0ffa
            float r4 = r40.floatValue()
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
        L_0x0f7b:
            r4 = r15
            int r9 = r9 + r15
            r11 = 0
        L_0x0f7e:
            if (r4 >= r9) goto L_0x0f87
            r17 = r33[r4]
            int r11 = r11 + r17
            int r4 = r4 + 1
            goto L_0x0f7e
        L_0x0f87:
            if (r5 != r6) goto L_0x0ff5
            int r9 = r3.left
            int r4 = r3.right
        L_0x0f8d:
            int r9 = r9 + r4
            int r11 = r11 - r9
            if (r18 == 0) goto L_0x0ff2
            if (r19 != 0) goto L_0x0ff2
            float r4 = (float) r11
            float r9 = r18.floatValue()
            float r4 = r4 * r9
            int r4 = (int) r4
            int r9 = X.C112845eY.A00
            int r4 = X.C90504aG.A08(r4)
        L_0x0fa0:
            if (r5 != 0) goto L_0x0fed
            r9 = r4
            int r4 = X.C90504aG.A08(r11)
        L_0x0fa7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            X.011 r4 = X.C36421kH.A0j(r9, r4)
            int r11 = X.C90484aE.A0H(r4)
            int r9 = X.C90474aD.A08(r4)
            X.5s9 r4 = new X.5s9
            r4.<init>(r3, r11, r9)
            r3 = r29
            r3.add(r4)
            r3 = r34
            X.5om r3 = A09(r3, r7, r14, r11, r9)
            X.4r9 r3 = r3.A00
            java.lang.Object r3 = r3.A00()
            X.6Kq r3 = (X.C130326Kq) r3
            X.5vr r3 = r3.A02
            com.facebook.rendercore.RenderTreeNode r3 = r3.A02
            android.graphics.Rect r9 = r3.A03
            int r4 = r9.width()
            r3 = r20
            int r20 = java.lang.Math.max(r3, r4)
            int r4 = r9.height()
            r3 = r21
            int r21 = java.lang.Math.max(r3, r4)
            int r15 = r15 + 1
            goto L_0x0f53
        L_0x0fed:
            int r9 = X.C90504aG.A08(r11)
            goto L_0x0fa7
        L_0x0ff2:
            int r4 = X.C112845eY.A00
            goto L_0x0fa0
        L_0x0ff5:
            int r9 = r3.top
            int r4 = r3.bottom
            goto L_0x0f8d
        L_0x0ffa:
            r18 = r39
            goto L_0x0f7b
        L_0x0ffe:
            int r9 = A03(r14)
            goto L_0x0f64
        L_0x1004:
            int r17 = r30.size()
            r15 = 0
        L_0x1009:
            r3 = r17
            if (r15 >= r3) goto L_0x1046
            r3 = r30
            X.6lc r14 = X.C90504aG.A0K(r3, r15)
            r3 = r29
            java.lang.Object r11 = r3.get(r15)
            X.5s9 r11 = (X.C120835s9) r11
            if (r5 != 0) goto L_0x103d
            int r3 = X.C112845eY.A00
            int r9 = X.C90504aG.A08(r20)
            int r4 = r11.A00
        L_0x1025:
            r3 = r34
            X.5om r4 = A09(r3, r7, r14, r9, r4)
            X.5o3 r9 = new X.5o3
            r9.<init>(r11, r4)
            r3 = r28
            r3.add(r9)
            r3 = r35
            r3.add(r4)
            int r15 = r15 + 1
            goto L_0x1009
        L_0x103d:
            int r9 = r11.A01
            int r3 = X.C112845eY.A00
            int r4 = X.C90504aG.A08(r21)
            goto L_0x1025
        L_0x1046:
            r4 = r36
            r3 = r28
            r4.add(r3)
            int r12 = r12 + 1
            goto L_0x0e62
        L_0x1051:
            java.lang.Object r3 = X.C133266Xn.A04(r1, r0)
            X.AnonymousClass00C.A08(r3)
            X.6OR r3 = (X.AnonymousClass6OR) r3
            r1 = r32
            r3.A08 = r1
            int r24 = android.view.View.MeasureSpec.getMode(r44)
            int r23 = android.view.View.MeasureSpec.getMode(r8)
            if (r5 != r6) goto L_0x1071
            if (r24 != 0) goto L_0x107a
            java.lang.String r0 = "GridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x1071:
            if (r23 != 0) goto L_0x107a
            java.lang.String r0 = "GridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x107a:
            int r22 = android.view.View.MeasureSpec.getSize(r44)
            r3 = 1073741824(0x40000000, float:2.0)
            r15 = -1
            r1 = r24
            if (r1 == r3) goto L_0x1089
            r21 = -1
            if (r5 != r6) goto L_0x108b
        L_0x1089:
            r21 = r22
        L_0x108b:
            int r20 = android.view.View.MeasureSpec.getSize(r8)
            r1 = r23
            if (r1 == r3) goto L_0x1095
            if (r5 != 0) goto L_0x1097
        L_0x1095:
            r15 = r20
        L_0x1097:
            r3 = -1
            r1 = r21
            if (r1 == r3) goto L_0x10bc
            if (r15 == r3) goto L_0x10bc
        L_0x109e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
        L_0x10a2:
            X.011 r1 = X.C36421kH.A0j(r1, r15)
            int r6 = X.C90484aE.A0H(r1)
            int r5 = X.C90474aD.A08(r1)
            X.5sK r4 = new X.5sK
            r1 = r35
            r4.<init>(r1, r6, r5)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r4, r6, r5)
            goto L_0x00db
        L_0x10bc:
            int r14 = r13.left
            int r1 = r13.right
            int r14 = r14 + r1
            int r12 = r13.top
            int r1 = r13.bottom
            int r12 = r12 + r1
            int r19 = r36.size()
            r13 = 0
        L_0x10cb:
            r1 = r19
            if (r13 >= r1) goto L_0x1148
            r1 = r36
            java.lang.Object r18 = r1.get(r13)
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            int r17 = r18.size()
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x10e2:
            r1 = r17
            if (r9 >= r1) goto L_0x1122
            r1 = r18
            java.lang.Object r3 = r1.get(r9)
            X.5o3 r3 = (X.AnonymousClass5o3) r3
            X.5s9 r1 = r3.A00
            android.graphics.Rect r7 = r1.A02
            X.5om r1 = r3.A01
            X.4r9 r1 = r1.A00
            java.lang.Object r1 = r1.A00()
            X.6Kq r1 = (X.C130326Kq) r1
            X.5vr r1 = r1.A02
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02
            android.graphics.Rect r1 = r1.A03
            r3 = r1
            int r4 = r1.width()
            int r1 = r7.left
            int r4 = r4 + r1
            int r1 = r7.right
            int r4 = r4 + r1
            int r3 = r3.height()
            int r1 = r7.top
            int r3 = r3 + r1
            int r1 = r7.bottom
            int r3 = r3 + r1
            int r11 = java.lang.Math.max(r11, r4)
            int r10 = java.lang.Math.max(r10, r3)
            int r9 = r9 + 1
            goto L_0x10e2
        L_0x1122:
            int r14 = r14 + r11
            int r12 = r12 + r10
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != 0) goto L_0x113b
            r1 = r24
            if (r1 != r3) goto L_0x1132
            r1 = r22
            if (r14 < r1) goto L_0x1132
            r21 = r1
        L_0x1132:
            r3 = -1
            r1 = r21
            if (r1 == r3) goto L_0x1145
            if (r15 == r3) goto L_0x1145
            goto L_0x109e
        L_0x113b:
            r1 = r23
            if (r1 != r3) goto L_0x1132
            r1 = r20
            if (r12 < r1) goto L_0x1132
            r15 = r1
            goto L_0x1132
        L_0x1145:
            int r13 = r13 + 1
            goto L_0x10cb
        L_0x1148:
            if (r5 != r6) goto L_0x1155
            if (r15 != r3) goto L_0x114d
            r15 = r12
        L_0x114d:
            r14 = r21
        L_0x114f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x10a2
        L_0x1155:
            r1 = r21
            if (r1 == r3) goto L_0x114f
            goto L_0x114d
        L_0x115a:
            r1 = 99
            java.lang.Object r3 = A0I(r0, r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x1166
            java.lang.String r3 = "v1"
        L_0x1166:
            java.lang.String r1 = "v2"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x141a
            java.lang.String r12 = "ListCollectionMeasureV2Helper"
            r11 = 1
            int r10 = X.AnonymousClass5Y2.A00(r0)
            r1 = 63
            boolean r4 = r0.A0f(r1, r9)
            int r3 = android.view.View.MeasureSpec.getMode(r44)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r4 != 0) goto L_0x1189
            if (r10 != r6) goto L_0x11e2
            if (r3 != 0) goto L_0x11e5
        L_0x1189:
            r18 = 1
            if (r4 != 0) goto L_0x1191
        L_0x118d:
            if (r10 != r6) goto L_0x11dc
            if (r1 != 0) goto L_0x11df
        L_0x1191:
            r17 = 1
        L_0x1193:
            if (r18 != 0) goto L_0x1198
            r15 = 0
            if (r17 == 0) goto L_0x1199
        L_0x1198:
            r15 = 1
        L_0x1199:
            X.66e r31 = new X.66e
            r1 = r31
            r1.<init>(r7, r0)
            java.util.List r1 = r0.A0b()
            java.util.ArrayList r4 = X.C36361kB.A0r(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x11ac:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x11e8
            X.6lc r13 = X.C90514aH.A0Y(r14)
            X.AnonymousClass00C.A0B(r13)
            r24 = r44
            r25 = r8
            if (r10 != r6) goto L_0x11c3
            r24 = r8
            r25 = r44
        L_0x11c3:
            r26 = r18 ^ 1
            r19 = r31
            r20 = r7
            r21 = r13
            r22 = r0
            r23 = r10
            X.4r9 r3 = X.AnonymousClass6XE.A03(r19, r20, r21, r22, r23, r24, r25, r26)
            X.5om r1 = new X.5om
            r1.<init>(r3, r13)
            r4.add(r1)
            goto L_0x11ac
        L_0x11dc:
            if (r3 != 0) goto L_0x11df
            goto L_0x1191
        L_0x11df:
            r17 = 0
            goto L_0x1193
        L_0x11e2:
            if (r1 != 0) goto L_0x11e5
            goto L_0x1189
        L_0x11e5:
            r18 = 0
            goto L_0x118d
        L_0x11e8:
            r3 = 73
            if (r15 != 0) goto L_0x120f
            int r5 = android.view.View.MeasureSpec.getSize(r44)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r6 = r0.A03
            boolean r3 = r0.A0f(r3, r9)
            X.5hu r6 = X.AnonymousClass6UV.A01(r4, r6, r3)
        L_0x11fe:
            X.5sK r3 = new X.5sK
            r3.<init>(r4, r5, r1)
            X.4rA r4 = new X.4rA
            r4.<init>(r6, r3)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r4, r5, r1)
            goto L_0x00db
        L_0x120f:
            r6 = 0
            r1 = 55
            java.lang.Object r1 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x1221 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x1221 }
            if (r1 != 0) goto L_0x121c
            r3 = 0
            goto L_0x123a
        L_0x121c:
            float r3 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x1221 }
            goto L_0x123a
        L_0x1221:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid format for spacing-after: "
            r3.append(r1)
            r1 = 55
            java.lang.Object r1 = A0I(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r3)
            X.AnonymousClass6RS.A01(r12, r1)
            r3 = 0
        L_0x123a:
            r1 = 56
            java.lang.Object r1 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x124b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x124b }
            if (r1 != 0) goto L_0x1246
            r13 = 0
            goto L_0x1264
        L_0x1246:
            float r13 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x124b }
            goto L_0x1264
        L_0x124b:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid format for spacing-before: "
            r13.append(r1)
            r1 = 56
            java.lang.Object r1 = A0I(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r13)
            X.AnonymousClass6RS.A01(r12, r1)
            r13 = 0
        L_0x1264:
            r1 = 44
            java.lang.Object r1 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x1273 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x1273 }
            if (r1 == 0) goto L_0x128b
            float r6 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x1273 }
            goto L_0x128b
        L_0x1273:
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid format for item-spacing: "
            r14.append(r1)
            r1 = 44
            java.lang.Object r1 = A0I(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r14)
            X.AnonymousClass6RS.A01(r12, r1)
        L_0x128b:
            int r1 = (int) r13
            r30 = r1
            int r1 = (int) r6
            r29 = r1
            int r1 = (int) r3
            r28 = r1
            r1 = r17
            if (r10 != r11) goto L_0x129c
            r1 = r18
            r18 = r17
        L_0x129c:
            r13 = 0
            r27 = 0
            r26 = 1
            if (r10 != 0) goto L_0x12a7
            r27 = 1
            r26 = 0
        L_0x12a7:
            int r25 = android.view.View.MeasureSpec.getMode(r44)
            int r24 = android.view.View.MeasureSpec.getMode(r8)
            int[] r14 = new int[r5]
            r14 = {-1, -1} // fill-array
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r25 == 0) goto L_0x1407
            int r6 = android.view.View.MeasureSpec.getSize(r44)
        L_0x12bd:
            if (r1 != 0) goto L_0x12c1
            r14[r9] = r6
        L_0x12c1:
            if (r24 == 0) goto L_0x12c7
            int r12 = android.view.View.MeasureSpec.getSize(r8)
        L_0x12c7:
            if (r18 != 0) goto L_0x12cb
            r14[r11] = r12
        L_0x12cb:
            r17 = r14[r9]
            r5 = -1
            r1 = r17
            if (r1 <= r5) goto L_0x1322
            r1 = r14[r11]
            if (r1 <= r5) goto L_0x1322
        L_0x12d6:
            r5 = r14[r9]
            java.util.Iterator r17 = r4.iterator()
            r6 = 0
        L_0x12dd:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x140c
            java.lang.Object r3 = r17.next()
            int r15 = r6 + 1
            if (r6 >= 0) goto L_0x12f0
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x12f0:
            X.5om r3 = (X.C118815om) r3
            X.6lc r3 = r3.A01
            r14 = r5
            if (r10 != r11) goto L_0x12f8
            r14 = r1
        L_0x12f8:
            int r12 = X.C112845eY.A00
            r13 = 1073741824(0x40000000, float:2.0)
            int r23 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r12 = r1
            if (r10 != r11) goto L_0x1304
            r12 = r5
        L_0x1304:
            int r24 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            r25 = 1
            r18 = r31
            r19 = r7
            r20 = r3
            r21 = r0
            r22 = r10
            X.4r9 r13 = X.AnonymousClass6XE.A03(r18, r19, r20, r21, r22, r23, r24, r25)
            X.5om r12 = new X.5om
            r12.<init>(r13, r3)
            r4.set(r6, r12)
            r6 = r15
            goto L_0x12dd
        L_0x1322:
            r23 = 0
            r22 = 0
            r21 = 0
            if (r27 == 0) goto L_0x1330
            r23 = r30
            r22 = r29
            r21 = r28
        L_0x1330:
            if (r26 != 0) goto L_0x1338
            r30 = 0
            r29 = 0
            r28 = 0
        L_0x1338:
            r15 = 0
            r20 = 0
            r3 = 0
            r19 = 0
        L_0x133e:
            int r1 = r4.size()
            if (r15 >= r1) goto L_0x13db
            java.lang.Object r1 = r4.get(r15)
            X.5om r1 = (X.C118815om) r1
            X.4r9 r1 = r1.A00
            java.lang.Object r1 = r1.A00()
            X.6Kq r1 = (X.C130326Kq) r1
            X.5vr r1 = r1.A02
            r32 = r1
            boolean r18 = X.AnonymousClass000.A1Q(r15)
            int r1 = X.C90504aG.A0C(r4)
            boolean r17 = X.C36381kD.A1U(r15, r1)
            r1 = r32
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02
            android.graphics.Rect r1 = r1.A03
            int r1 = r1.width()
            if (r17 == 0) goto L_0x13d4
            if (r18 == 0) goto L_0x1372
            int r1 = r23 + r1
        L_0x1372:
            int r1 = r1 + r22
        L_0x1374:
            int r13 = java.lang.Math.max(r13, r1)
            int r20 = r20 + r1
            r1 = r14[r9]
            if (r1 > r5) goto L_0x138a
            if (r27 == 0) goto L_0x1384
            r1 = r20
            if (r1 >= r6) goto L_0x1388
        L_0x1384:
            if (r26 == 0) goto L_0x138a
            if (r13 < r6) goto L_0x138a
        L_0x1388:
            r14[r9] = r6
        L_0x138a:
            r1 = r32
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02
            android.graphics.Rect r1 = r1.A03
            int r1 = r1.height()
            if (r17 == 0) goto L_0x13cd
            if (r18 == 0) goto L_0x139a
            int r1 = r30 + r1
        L_0x139a:
            int r1 = r1 + r29
        L_0x139c:
            int r3 = java.lang.Math.max(r3, r1)
            int r19 = r19 + r1
            if (r24 == 0) goto L_0x13b0
            if (r26 == 0) goto L_0x13aa
            r1 = r19
            if (r1 >= r12) goto L_0x13ae
        L_0x13aa:
            if (r27 == 0) goto L_0x13b0
            if (r3 < r12) goto L_0x13b0
        L_0x13ae:
            r14[r11] = r12
        L_0x13b0:
            r17 = r14[r9]
            r1 = r17
            if (r1 <= r5) goto L_0x13c9
            r1 = r14[r11]
            if (r1 <= r5) goto L_0x13c9
        L_0x13ba:
            r1 = r14[r11]
            if (r1 > r5) goto L_0x12d6
            if (r24 != 0) goto L_0x13f6
            if (r26 == 0) goto L_0x13c4
            r3 = r19
        L_0x13c4:
            r14[r11] = r3
            r1 = r3
            goto L_0x12d6
        L_0x13c9:
            int r15 = r15 + 1
            goto L_0x133e
        L_0x13cd:
            if (r18 == 0) goto L_0x13d1
            int r1 = r30 + r1
        L_0x13d1:
            int r1 = r1 + r28
            goto L_0x139c
        L_0x13d4:
            if (r18 == 0) goto L_0x13d8
            int r1 = r23 + r1
        L_0x13d8:
            int r1 = r1 + r21
            goto L_0x1374
        L_0x13db:
            r1 = r17
            if (r1 > r5) goto L_0x13ba
            if (r25 != 0) goto L_0x13e8
            if (r27 == 0) goto L_0x13e5
            r13 = r20
        L_0x13e5:
            r14[r9] = r13
            goto L_0x13ba
        L_0x13e8:
            if (r27 == 0) goto L_0x13f1
            r1 = r20
            int r13 = java.lang.Math.min(r1, r6)
            goto L_0x13e5
        L_0x13f1:
            int r13 = java.lang.Math.min(r13, r6)
            goto L_0x13e5
        L_0x13f6:
            if (r26 == 0) goto L_0x1402
            r1 = r19
            int r1 = java.lang.Math.min(r1, r12)
        L_0x13fe:
            r14[r11] = r1
            goto L_0x12d6
        L_0x1402:
            int r1 = java.lang.Math.min(r3, r12)
            goto L_0x13fe
        L_0x1407:
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x12bd
        L_0x140c:
            int r6 = r0.A03
            r3 = 73
            boolean r3 = r0.A0f(r3, r9)
            X.5hu r6 = X.AnonymousClass6UV.A01(r4, r6, r3)
            goto L_0x11fe
        L_0x141a:
            int r12 = X.AnonymousClass5Y2.A00(r0)
            java.util.List r3 = r0.A0b()
            X.5s8 r13 = new X.5s8
            r13.<init>(r7, r0)
            java.util.List r1 = r0.A0b()
            java.util.ArrayList r27 = X.C36361kB.A0r(r1)
            X.AnonymousClass00C.A0B(r3)
            java.util.Iterator r19 = r3.iterator()
        L_0x1436:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x1504
            X.6lc r11 = X.C90514aH.A0Y(r19)
            X.AnonymousClass00C.A0B(r11)
            int r4 = android.view.View.MeasureSpec.getSize(r44)
            if (r12 != r6) goto L_0x1500
            if (r4 == 0) goto L_0x1500
            int r1 = X.C112845eY.A00
            int r10 = X.C90504aG.A08(r4)
        L_0x1451:
            X.6lc r14 = A0B(r11)
            if (r14 == 0) goto L_0x149b
            int r3 = r14.A04
            r1 = 13366(0x3436, float:1.873E-41)
            if (r3 != r1) goto L_0x149b
            java.lang.String r14 = A0N(r14)
            if (r12 != 0) goto L_0x149b
            if (r14 == 0) goto L_0x149b
            X.6Mg r1 = X.AnonymousClass6Y7.A0A(r14)     // Catch:{ 5R5 -> 0x148c }
            float r3 = r1.A00     // Catch:{ 5R5 -> 0x148c }
            java.lang.Integer r1 = r1.A01     // Catch:{ 5R5 -> 0x148c }
            int r1 = r1.intValue()     // Catch:{ 5R5 -> 0x148c }
            if (r1 == r9) goto L_0x1484
            if (r1 != r6) goto L_0x149b
            float r1 = (float) r4     // Catch:{ 5R5 -> 0x148c }
            float r3 = r3 * r1
            double r3 = (double) r3     // Catch:{ 5R5 -> 0x148c }
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r17
            int r1 = (int) r3     // Catch:{ 5R5 -> 0x148c }
            r3 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r3)     // Catch:{ 5R5 -> 0x148c }
            goto L_0x149b
        L_0x1484:
            int r3 = (int) r3     // Catch:{ 5R5 -> 0x148c }
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)     // Catch:{ 5R5 -> 0x148c }
            goto L_0x149b
        L_0x148c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Error parsing style width: "
            java.lang.String r3 = X.AnonymousClass000.A0p(r1, r14, r3)
            java.lang.String r1 = "ListCollectionMeasureHelper"
            X.AnonymousClass6RS.A01(r1, r3)
        L_0x149b:
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            if (r12 == r6) goto L_0x14bc
            if (r4 == 0) goto L_0x14bc
            int r15 = X.C90504aG.A08(r4)
        L_0x14a7:
            X.6lc r14 = A0B(r11)
            if (r14 == 0) goto L_0x14f5
            int r3 = r14.A04
            r1 = 13366(0x3436, float:1.873E-41)
            if (r3 != r1) goto L_0x14f5
            java.lang.String r14 = A0J(r14)
            if (r12 != r6) goto L_0x14f5
            if (r14 == 0) goto L_0x14f5
            goto L_0x14bf
        L_0x14bc:
            int r15 = X.C112845eY.A00
            goto L_0x14a7
        L_0x14bf:
            X.6Mg r1 = X.AnonymousClass6Y7.A0A(r14)     // Catch:{ 5R5 -> 0x14e6 }
            float r3 = r1.A00     // Catch:{ 5R5 -> 0x14e6 }
            java.lang.Integer r1 = r1.A01     // Catch:{ 5R5 -> 0x14e6 }
            int r1 = r1.intValue()     // Catch:{ 5R5 -> 0x14e6 }
            if (r1 == r9) goto L_0x14de
            if (r1 != r6) goto L_0x14f5
            float r1 = (float) r4     // Catch:{ 5R5 -> 0x14e6 }
            float r3 = r3 * r1
            double r3 = (double) r3     // Catch:{ 5R5 -> 0x14e6 }
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r17
            int r1 = (int) r3     // Catch:{ 5R5 -> 0x14e6 }
            r3 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r3)     // Catch:{ 5R5 -> 0x14e6 }
            goto L_0x14f5
        L_0x14de:
            int r3 = (int) r3     // Catch:{ 5R5 -> 0x14e6 }
            r1 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)     // Catch:{ 5R5 -> 0x14e6 }
            goto L_0x14f5
        L_0x14e6:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Error parsing style height: "
            java.lang.String r3 = X.AnonymousClass000.A0p(r1, r14, r3)
            java.lang.String r1 = "ListCollectionMeasureHelper"
            X.AnonymousClass6RS.A01(r1, r3)
        L_0x14f5:
            X.5om r3 = A09(r13, r7, r11, r10, r15)
            r1 = r27
            r1.add(r3)
            goto L_0x1436
        L_0x1500:
            int r10 = X.C112845eY.A00
            goto L_0x1451
        L_0x1504:
            r1 = 63
            boolean r1 = r0.A0f(r1, r9)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x1553
            int r7 = android.view.View.MeasureSpec.getMode(r44)
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == r1) goto L_0x151e
            if (r7 != r3) goto L_0x1553
        L_0x151e:
            if (r4 == r1) goto L_0x1522
            if (r4 != r3) goto L_0x1553
        L_0x1522:
            int[] r14 = new int[r5]
            int r1 = android.view.View.MeasureSpec.getSize(r44)
            r14[r9] = r1
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            r14[r6] = r1
        L_0x1530:
            r5 = r14[r9]
            r6 = r14[r6]
            int r4 = r0.A03
            r1 = 73
            boolean r3 = r0.A0f(r1, r9)
            r1 = r27
            X.5hu r4 = X.AnonymousClass6UV.A01(r1, r4, r3)
            X.5sK r3 = new X.5sK
            r3.<init>(r1, r5, r6)
            X.4rA r1 = new X.4rA
            r1.<init>(r4, r3)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r1, r5, r6)
            goto L_0x00db
        L_0x1553:
            r1 = 55
            java.lang.Object r4 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x22fe }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 5R5 -> 0x22fe }
            r1 = 56
            java.lang.Object r7 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x22fe }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ 5R5 -> 0x22fe }
            r1 = 44
            java.lang.Object r3 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x22fe }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5R5 -> 0x22fe }
            if (r4 != 0) goto L_0x156e
            goto L_0x1573
        L_0x156e:
            float r4 = X.AnonymousClass6Y7.A01(r4)     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x1574
        L_0x1573:
            r4 = 0
        L_0x1574:
            if (r7 != 0) goto L_0x1594
            r1 = 0
        L_0x1577:
            if (r3 != 0) goto L_0x158f
            r3 = 0
        L_0x157a:
            int r1 = (int) r1     // Catch:{ 5R5 -> 0x22fe }
            r26 = r1
            int r1 = (int) r3     // Catch:{ 5R5 -> 0x22fe }
            r25 = r1
            int r1 = (int) r4     // Catch:{ 5R5 -> 0x22fe }
            r24 = r1
            r13 = 0
            r23 = 0
            r22 = 1
            if (r12 != 0) goto L_0x1599
            r23 = 1
            r22 = 0
            goto L_0x1599
        L_0x158f:
            float r3 = X.AnonymousClass6Y7.A01(r3)     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x157a
        L_0x1594:
            float r1 = X.AnonymousClass6Y7.A01(r7)     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x1577
        L_0x1599:
            int r12 = android.view.View.MeasureSpec.getMode(r44)     // Catch:{ 5R5 -> 0x22fe }
            int r11 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ 5R5 -> 0x22fe }
            int[] r14 = new int[r5]     // Catch:{ 5R5 -> 0x22fe }
            r14 = {-1, -1} // fill-array     // Catch:{ 5R5 -> 0x22fe }
            int r10 = android.view.View.MeasureSpec.getSize(r44)     // Catch:{ 5R5 -> 0x22fe }
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 != r1) goto L_0x15b0
            r14[r9] = r10     // Catch:{ 5R5 -> 0x22fe }
        L_0x15b0:
            int r7 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ 5R5 -> 0x22fe }
            if (r11 != r1) goto L_0x15b8
            r14[r6] = r7     // Catch:{ 5R5 -> 0x22fe }
        L_0x15b8:
            if (r12 != r1) goto L_0x15be
            if (r11 != r1) goto L_0x15be
            goto L_0x1530
        L_0x15be:
            r21 = 0
            r20 = 0
            r19 = 0
            if (r23 == 0) goto L_0x15cc
            r21 = r26
            r20 = r25
            r19 = r24
        L_0x15cc:
            if (r22 != 0) goto L_0x15d4
            r26 = 0
            r25 = 0
            r24 = 0
        L_0x15d4:
            r5 = 0
            r18 = 0
            r4 = 0
            r3 = 0
        L_0x15d9:
            int r1 = r27.size()     // Catch:{ 5R5 -> 0x22fe }
            if (r5 >= r1) goto L_0x1668
            r1 = r27
            java.lang.Object r1 = r1.get(r5)     // Catch:{ 5R5 -> 0x22fe }
            X.5om r1 = (X.C118815om) r1     // Catch:{ 5R5 -> 0x22fe }
            X.4r9 r1 = r1.A00     // Catch:{ 5R5 -> 0x22fe }
            java.lang.Object r1 = r1.A00()     // Catch:{ 5R5 -> 0x22fe }
            X.6Kq r1 = (X.C130326Kq) r1     // Catch:{ 5R5 -> 0x22fe }
            X.5vr r1 = r1.A02     // Catch:{ 5R5 -> 0x22fe }
            r28 = r1
            boolean r17 = X.AnonymousClass000.A1Q(r5)
            int r1 = X.C90504aG.A0C(r27)     // Catch:{ 5R5 -> 0x22fe }
            boolean r15 = X.C36381kD.A1U(r5, r1)
            r1 = r28
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02     // Catch:{ 5R5 -> 0x22fe }
            android.graphics.Rect r1 = r1.A03     // Catch:{ 5R5 -> 0x22fe }
            int r1 = r1.width()     // Catch:{ 5R5 -> 0x22fe }
            if (r15 == 0) goto L_0x1612
            if (r17 == 0) goto L_0x160f
            int r1 = r21 + r1
        L_0x160f:
            int r1 = r1 + r20
            goto L_0x1618
        L_0x1612:
            if (r17 == 0) goto L_0x1616
            int r1 = r21 + r1
        L_0x1616:
            int r1 = r1 + r19
        L_0x1618:
            int r13 = java.lang.Math.max(r13, r1)     // Catch:{ 5R5 -> 0x22fe }
            int r18 = r18 + r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r1) goto L_0x162e
            if (r23 == 0) goto L_0x1628
            r1 = r18
            if (r1 >= r10) goto L_0x162c
        L_0x1628:
            if (r22 == 0) goto L_0x162e
            if (r13 < r10) goto L_0x162e
        L_0x162c:
            r14[r9] = r10     // Catch:{ 5R5 -> 0x22fe }
        L_0x162e:
            r1 = r28
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02     // Catch:{ 5R5 -> 0x22fe }
            android.graphics.Rect r1 = r1.A03     // Catch:{ 5R5 -> 0x22fe }
            int r1 = r1.height()     // Catch:{ 5R5 -> 0x22fe }
            if (r15 == 0) goto L_0x1641
            if (r17 == 0) goto L_0x163e
            int r1 = r1 + r26
        L_0x163e:
            int r1 = r1 + r25
            goto L_0x1647
        L_0x1641:
            if (r17 == 0) goto L_0x1645
            int r1 = r1 + r26
        L_0x1645:
            int r1 = r1 + r24
        L_0x1647:
            int r4 = java.lang.Math.max(r4, r1)     // Catch:{ 5R5 -> 0x22fe }
            int r3 = r3 + r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r1) goto L_0x165a
            if (r22 == 0) goto L_0x1654
            if (r3 >= r7) goto L_0x1658
        L_0x1654:
            if (r23 == 0) goto L_0x165a
            if (r4 < r7) goto L_0x165a
        L_0x1658:
            r14[r6] = r7     // Catch:{ 5R5 -> 0x22fe }
        L_0x165a:
            r15 = r14[r9]     // Catch:{ 5R5 -> 0x22fe }
            r1 = -1
            if (r15 <= r1) goto L_0x1664
            r15 = r14[r6]     // Catch:{ 5R5 -> 0x22fe }
            if (r15 <= r1) goto L_0x1664
            goto L_0x1668
        L_0x1664:
            int r5 = r5 + 1
            goto L_0x15d9
        L_0x1668:
            if (r12 != 0) goto L_0x166f
            if (r23 == 0) goto L_0x1681
            r13 = r18
            goto L_0x1681
        L_0x166f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r1) goto L_0x1683
            if (r23 == 0) goto L_0x1676
            goto L_0x167b
        L_0x1676:
            int r13 = java.lang.Math.min(r13, r10)     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x1681
        L_0x167b:
            r1 = r18
            int r13 = java.lang.Math.min(r1, r10)     // Catch:{ 5R5 -> 0x22fe }
        L_0x1681:
            r14[r9] = r13     // Catch:{ 5R5 -> 0x22fe }
        L_0x1683:
            if (r11 != 0) goto L_0x168c
            if (r22 == 0) goto L_0x1688
            r4 = r3
        L_0x1688:
            r14[r6] = r4     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x1530
        L_0x168c:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r1) goto L_0x1530
            if (r22 == 0) goto L_0x1697
            int r1 = java.lang.Math.min(r3, r7)     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x169b
        L_0x1697:
            int r1 = java.lang.Math.min(r4, r7)     // Catch:{ 5R5 -> 0x22fe }
        L_0x169b:
            r14[r6] = r1     // Catch:{ 5R5 -> 0x22fe }
            goto L_0x1530
        L_0x169f:
            r4 = 35
            r3 = 0
            float r15 = r0.A0S(r4, r3)
            java.util.List r9 = r0.A0b()
            r4 = 0
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x16ce
            java.lang.Object r3 = r9.get(r4)
        L_0x16b3:
            X.6lc r3 = (X.C140456lc) r3
            r1 = r44
            X.7lx r1 = r3.B2C(r7, r1, r8)
            java.util.ArrayList r5 = X.C90484aE.A0r(r1)
            int r4 = r1.getWidth()
            int r1 = r1.getHeight()
            X.6lY r3 = new X.6lY
            r3.<init>(r2, r5, r4, r1)
            goto L_0x00db
        L_0x16ce:
            r6 = 1
            r14 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x16da
            java.lang.Object r3 = r9.get(r6)
            goto L_0x16b3
        L_0x16da:
            X.6lc r5 = X.C90504aG.A0K(r9, r4)
            r3 = r44
            X.7lx r10 = r5.B2C(r7, r3, r8)
            X.6lc r5 = X.C90504aG.A0K(r9, r6)
            X.7lx r13 = r5.B2C(r7, r3, r8)
            int r6 = r10.getWidth()
            float r5 = (float) r6
            int r3 = r13.getWidth()
            int r3 = r3 - r6
            float r3 = (float) r3
            float r3 = r3 * r15
            float r5 = r5 + r3
            int r12 = (int) r5
            int r6 = r10.getHeight()
            float r5 = (float) r6
            int r3 = r13.getHeight()
            int r3 = r3 - r6
            float r3 = (float) r3
            float r3 = r3 * r15
            float r5 = r5 + r3
            int r6 = (int) r5
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.Object r11 = X.C133266Xn.A05(r1, r0)
            android.util.Pair r11 = (android.util.Pair) r11
            if (r11 == 0) goto L_0x2305
            r3 = 36
            boolean r3 = r0.A0f(r3, r4)
            if (r3 == 0) goto L_0x1792
            int r3 = X.C36381kD.A04(r11)
            long r3 = (long) r3
            boolean r7 = X.C133266Xn.A08(r1)
            X.4r2 r9 = new X.4r2
            r9.<init>(r1, r3, r7)
            float r14 = r14 - r15
            java.lang.Float r7 = java.lang.Float.valueOf(r14)
            X.6ld r4 = new X.6ld
            r4.<init>()
            X.61a r3 = new X.61a
            r3.<init>(r4, r7)
            r9.A0E(r3)
            r20 = 0
            int r21 = r10.getWidth()
            int r22 = r10.getHeight()
            X.6la r7 = new X.6la
            r23 = 0
            r17 = r7
            r18 = r10
            r19 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23)
            int r3 = X.C36381kD.A03(r11)
            long r3 = (long) r3
            boolean r10 = X.C133266Xn.A08(r1)
            X.4r2 r9 = new X.4r2
            r9.<init>(r1, r3, r10)
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            X.6ld r3 = new X.6ld
            r3.<init>()
            X.61a r1 = new X.61a
            r1.<init>(r3, r4)
            r9.A0E(r1)
            int r21 = r13.getWidth()
            int r22 = r13.getHeight()
            X.6la r1 = new X.6la
            r18 = r13
            r19 = r9
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r5.add(r7)
            r5.add(r1)
        L_0x178b:
            X.6lY r3 = new X.6lY
            r3.<init>(r2, r5, r12, r6)
            goto L_0x00db
        L_0x1792:
            r5.add(r10)
            r5.add(r13)
            goto L_0x178b
        L_0x1799:
            android.content.Context r15 = r7.A02
            X.72Q r14 = X.AnonymousClass6UX.A00(r15)
            r3 = 1
            r14.A0c = r3
            r3 = 0
            r14.A0M = r3
            java.lang.String r3 = A0O(r0)
            if (r3 == 0) goto L_0x17b6
            int r3 = X.AnonymousClass6Y7.A06(r3)     // Catch:{ 5R5 -> 0x230c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.AnonymousClass72Q.A00(r14, r3)
        L_0x17b6:
            r3 = 38
            r4 = -1
            int r3 = r0.A0T(r3, r4)
            if (r3 <= r4) goto L_0x17fd
            r14.A0Q = r3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r14.A0V = r3
        L_0x17c5:
            r3 = 51
            java.util.List r4 = r0.A0d(r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x17f2
            X.5s4 r3 = X.AnonymousClass6Y5.A02(r1, r0, r4)
            java.lang.CharSequence r3 = r3.A00
        L_0x17d7:
            r14.A0Y = r3
        L_0x17d9:
            r3 = 45
            java.lang.Object r9 = A0I(r0, r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r13 = ""
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L_0x1858
            r3 = 53
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x1852
            goto L_0x1803
        L_0x17f2:
            r3 = 49
            java.lang.Object r3 = A0I(r0, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x17d9
            goto L_0x17d7
        L_0x17fd:
            if (r3 != r4) goto L_0x17c5
            r31.B8r()
            goto L_0x17c5
        L_0x1803:
            java.lang.String r3 = "[^0-9.]"
            java.lang.String r6 = r9.replaceAll(r3, r13)     // Catch:{ 5R5 -> 0x2312 }
            int r5 = r6.length()     // Catch:{ 5R5 -> 0x2312 }
            int r3 = r9.length()     // Catch:{ 5R5 -> 0x2312 }
            if (r5 == r3) goto L_0x181a
            java.lang.String r5 = "text_size_ignored"
            java.lang.String r3 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.AnonymousClass6RS.A01(r5, r3)     // Catch:{ 5R5 -> 0x2312 }
        L_0x181a:
            float r12 = java.lang.Float.parseFloat(r6)     // Catch:{ 5R5 -> 0x2312 }
            int r3 = r4.hashCode()     // Catch:{ 5R5 -> 0x2312 }
            switch(r3) {
                case 3212: goto L_0x1835;
                case 3592: goto L_0x183e;
                case 3677: goto L_0x1847;
                default: goto L_0x1825;
            }     // Catch:{ 5R5 -> 0x2312 }
        L_0x1825:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5R5 -> 0x2312 }
            java.lang.String r0 = "can't parse unknown textUniSize: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ 5R5 -> 0x2312 }
            X.5R5 r0 = new X.5R5     // Catch:{ 5R5 -> 0x2312 }
            r0.<init>(r1)     // Catch:{ 5R5 -> 0x2312 }
            throw r0     // Catch:{ 5R5 -> 0x2312 }
        L_0x1835:
            java.lang.String r3 = "dp"
            boolean r3 = r4.equals(r3)     // Catch:{ 5R5 -> 0x2312 }
            if (r3 == 0) goto L_0x1825
            goto L_0x1850
        L_0x183e:
            java.lang.String r3 = "px"
            boolean r3 = r4.equals(r3)     // Catch:{ 5R5 -> 0x2312 }
            if (r3 == 0) goto L_0x1825
            goto L_0x185c
        L_0x1847:
            java.lang.String r3 = "sp"
            boolean r3 = r4.equals(r3)     // Catch:{ 5R5 -> 0x2312 }
            if (r3 != 0) goto L_0x1856
            goto L_0x1825
        L_0x1850:
            r11 = 1
            goto L_0x185d
        L_0x1852:
            float r12 = X.AnonymousClass6Y7.A02(r9)     // Catch:{ 5R5 -> 0x2312 }
        L_0x1856:
            r11 = 2
            goto L_0x185d
        L_0x1858:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = -1
            goto L_0x1864
        L_0x185c:
            r11 = 0
        L_0x185d:
            float r3 = X.C90464aC.A02(r15, r12, r11)
            int r3 = (int) r3
            r14.A0S = r3
        L_0x1864:
            r3 = 46
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r10 = A0J(r0)
            r9 = 0
            r6 = 0
            if (r10 == 0) goto L_0x1880
            X.6NR r3 = X.AnonymousClass6NR.A00()
            X.5zd r5 = r3.A03
            android.content.Context r3 = r1.A00
            android.graphics.Typeface r9 = r5.A00(r3, r10)
        L_0x1880:
            if (r4 == 0) goto L_0x1895
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x1895
            android.graphics.Typeface r9 = X.C109545Xz.A00(r15, r9, r4, r10)     // Catch:{ 5R5 -> 0x188d }
            goto L_0x1895
        L_0x188d:
            r5 = move-exception
            java.lang.String r4 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r3 = "Error parsing typeface for Text"
            X.AnonymousClass6RS.A00(r1, r4, r3, r5)
        L_0x1895:
            if (r10 == 0) goto L_0x189b
            if (r9 == 0) goto L_0x189b
            r14.A0U = r9
        L_0x189b:
            r3 = 59
            java.lang.Object r3 = A0I(r0, r3)     // Catch:{ 5R5 -> 0x18b1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5R5 -> 0x18b1 }
            if (r3 == 0) goto L_0x18b9
            float r4 = X.AnonymousClass6Y7.A01(r3)     // Catch:{ 5R5 -> 0x18b1 }
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x18b9
            r14.A0K = r4     // Catch:{ 5R5 -> 0x18b1 }
            goto L_0x18b9
        L_0x18b1:
            r5 = move-exception
            java.lang.String r4 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r3 = "Error parsing lineHeight for Text"
            X.AnonymousClass6RS.A00(r1, r4, r3, r5)
        L_0x18b9:
            r4 = 36
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r0.A0S(r4, r3)
            r4 = 1
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x18cb
            r14.A0b = r4
            r14.A0L = r5
        L_0x18cb:
            r3 = 44
            X.6lc r3 = r0.A0W(r3)
            if (r3 == 0) goto L_0x1958
            java.lang.String r3 = X.AnonymousClass5Z7.A00(r3)
        L_0x18d7:
            android.util.DisplayMetrics r4 = X.AnonymousClass000.A0X(r15)
            r5 = 48
            X.6lc r5 = r0.A0W(r5)
            if (r5 == 0) goto L_0x1943
            int r1 = X.AnonymousClass5Z8.A01(r1, r5, r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
        L_0x18eb:
            r1 = 50
            boolean r15 = r0.A0f(r1, r6)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            int r10 = r5.length()
            r5.append(r3)
            int r3 = r5.length()
            if (r13 == 0) goto L_0x190f
            int r13 = r13.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r13)
            r5.setSpan(r1, r10, r3, r6)
        L_0x190f:
            int r1 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x1920
            float r1 = android.util.TypedValue.applyDimension(r11, r12, r4)
            int r4 = (int) r1
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            r1.<init>(r4)
            r5.setSpan(r1, r10, r3, r6)
        L_0x1920:
            if (r9 == 0) goto L_0x1929
            android.text.style.MetricAffectingSpan r1 = X.AnonymousClass6Y5.A00(r9)
            r5.setSpan(r1, r10, r3, r6)
        L_0x1929:
            if (r15 == 0) goto L_0x1933
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            r5.setSpan(r1, r10, r3, r6)
        L_0x1933:
            r1 = r2
            X.4r1 r1 = (X.C98184r1) r1
            r9 = r7
            r10 = r1
            r11 = r14
            r12 = r5
            r13 = r44
            r14 = r8
            X.6lZ r3 = X.AnonymousClass6UW.A02(r9, r10, r11, r12, r13, r14)
            goto L_0x00db
        L_0x1943:
            r1 = 43
            java.lang.Object r1 = A0I(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x194f
            r13 = 0
            goto L_0x18eb
        L_0x194f:
            int r1 = X.AnonymousClass6Y7.A04(r1)     // Catch:{ 5R5 -> 0x2318 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ 5R5 -> 0x2318 }
            goto L_0x18eb
        L_0x1958:
            r3 = 41
            java.lang.String r3 = r0.A0a(r3, r13)
            goto L_0x18d7
        L_0x1960:
            android.content.Context r3 = r7.A02
            X.72Q r12 = X.AnonymousClass6UX.A00(r3)
            r3 = 1
            r12.A0c = r3
            r5 = 0
            r12.A0M = r5
            java.lang.String r3 = A0O(r0)
            if (r3 == 0) goto L_0x197d
            int r3 = X.AnonymousClass6Y7.A06(r3)     // Catch:{ 5R5 -> 0x231e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.AnonymousClass72Q.A00(r12, r3)
        L_0x197d:
            r3 = 40
            r4 = -1
            int r3 = r0.A0T(r3, r4)
            if (r3 <= r4) goto L_0x1a0e
            r12.A0Q = r3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r12.A0V = r3
        L_0x198c:
            r3 = 68
            r4 = 0
            boolean r13 = r0.A0f(r3, r5)
            r3 = 44
            if (r13 == 0) goto L_0x1999
            r3 = 70
        L_0x1999:
            java.util.List r5 = r0.A0d(r3)
            boolean r3 = r5.isEmpty()
            r23 = 0
            if (r3 != 0) goto L_0x1a0b
            X.5s4 r11 = X.AnonymousClass6Y5.A03(r1, r0, r5, r13)
            java.lang.CharSequence r3 = r11.A00
            r12.A0Y = r3
        L_0x19ad:
            r3 = 54
            java.lang.Object r9 = A0I(r0, r3)
            java.lang.String r9 = (java.lang.String) r9
            android.content.Context r6 = r1.A00
            boolean r5 = X.AnonymousClass5YY.A00(r6)
            if (r9 == 0) goto L_0x19c9
            java.lang.String r3 = "text_first_strong"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x1a03
            X.048 r3 = X.AnonymousClass047.A03
        L_0x19c7:
            r12.A0W = r3
        L_0x19c9:
            r3 = 53
            int r3 = A02(r1, r0, r3)
            r12.A0M = r3
            r3 = 52
            int r3 = r0.A0T(r3, r4)
            r12.A0N = r3
            r3 = 46
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r0.A0T(r3, r10)
            r3 = 48
            int r9 = r0.A0T(r3, r10)
            if (r5 == r10) goto L_0x1a01
            if (r9 == r10) goto L_0x1a01
            r10 = 1
            float r6 = X.C36341k9.A00(r6)
            float r3 = (float) r5
            int r5 = X.C90514aH.A06(r3, r6)
            float r3 = (float) r9
            int r3 = X.C90514aH.A06(r3, r6)
            r12.A0O = r5
            r12.A0P = r3
        L_0x19fe:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x1a15
        L_0x1a01:
            r10 = 0
            goto L_0x19fe
        L_0x1a03:
            if (r5 == 0) goto L_0x1a08
            X.048 r3 = X.AnonymousClass047.A02
            goto L_0x19c7
        L_0x1a08:
            X.048 r3 = X.AnonymousClass047.A01
            goto L_0x19c7
        L_0x1a0b:
            r11 = r23
            goto L_0x19ad
        L_0x1a0e:
            if (r3 != r4) goto L_0x198c
            r31.B8r()
            goto L_0x198c
        L_0x1a15:
            r3 = 67
            java.lang.Object r3 = A0I(r0, r3)     // Catch:{ 5R5 -> 0x1a2b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5R5 -> 0x1a2b }
            if (r3 == 0) goto L_0x1a33
            float r5 = X.AnonymousClass6Y7.A01(r3)     // Catch:{ 5R5 -> 0x1a2b }
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x1a33
            r12.A0K = r5     // Catch:{ 5R5 -> 0x1a2b }
            goto L_0x1a33
        L_0x1a2b:
            r6 = move-exception
            java.lang.String r5 = "BKBloksComponentsRichTextBinderUtil"
            java.lang.String r3 = "Error parsing lineHeight for RichText"
            X.AnonymousClass6RS.A00(r1, r5, r3, r6)
        L_0x1a33:
            r3 = 38
            float r6 = r0.A0S(r3, r9)
            r5 = r10 ^ 1
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x1a44
            r12.A0b = r5
            r12.A0L = r6
        L_0x1a44:
            r3 = 32
            if (r13 == 0) goto L_0x1a4a
            r3 = 69
        L_0x1a4a:
            java.util.List r3 = r0.A0d(r3)
            X.5s4 r10 = X.AnonymousClass6Y5.A03(r1, r0, r3, r13)
            java.lang.String r3 = r10.A01
            r12.A0a = r3
            java.lang.CharSequence r3 = r10.A00
            r24 = r3
            android.text.SpannableString r20 = android.text.SpannableString.valueOf(r24)
            r3 = 50
            boolean r3 = r0.A0f(r3, r4)
            if (r3 == 0) goto L_0x1a69
            X.AnonymousClass6NR.A00()
        L_0x1a69:
            r3 = 140(0x8c, float:1.96E-43)
            X.6lc r9 = r0.A0W(r3)
            if (r9 == 0) goto L_0x1ac7
            r3 = 65
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "background start padding"
            float r15 = A00(r1, r4, r3)
            r3 = 63
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "background end padding"
            float r14 = A00(r1, r4, r3)
            r3 = 66
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "background top padding"
            float r6 = A00(r1, r4, r3)
            r3 = 62
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "background bottom padding"
            float r5 = A00(r1, r4, r3)
            r3 = 58
            java.lang.Object r4 = A0I(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "background corner radius"
            float r4 = A00(r1, r4, r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r15, r6, r14, r5)
            int r5 = X.AnonymousClass5Z8.A00(r1, r9)
            X.5sL r1 = new X.5sL
            r1.<init>(r3, r4, r5)
            r12.A0X = r1
        L_0x1ac7:
            r4 = r2
            X.4r1 r4 = (X.C98184r1) r4
            r17 = r7
            r18 = r4
            r19 = r12
            r21 = r44
            r22 = r8
            X.6lZ r3 = X.AnonymousClass6UW.A02(r17, r18, r19, r20, r21, r22)
            if (r11 == 0) goto L_0x1ae3
            java.util.List r1 = r11.A02
            boolean r1 = r1.isEmpty()
            r6 = 1
            if (r1 == 0) goto L_0x1ae4
        L_0x1ae3:
            r6 = 0
        L_0x1ae4:
            java.util.List r5 = r10.A02
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x1aef
            r1 = 0
            if (r6 == 0) goto L_0x1af0
        L_0x1aef:
            r1 = 1
        L_0x1af0:
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00db
            android.text.SpannableString r19 = android.text.SpannableString.valueOf(r24)
            if (r11 != 0) goto L_0x1b32
            r9 = r23
        L_0x1afc:
            java.util.Iterator r10 = r5.iterator()
        L_0x1b00:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x1b3b
            java.lang.Object r6 = r10.next()
            X.5uF r6 = (X.C122065uF) r6
            java.lang.Object r1 = r3.A00
            X.5y5 r1 = (X.C124375y5) r1
            if (r1 == 0) goto L_0x1b3b
            android.text.Layout r5 = r1.A02
            if (r5 == 0) goto L_0x1b3b
            X.64u r1 = r6.A02
            r17 = r1
            r18 = r5
            r20 = r6
            r17.A00(r18, r19, r20, r21, r22)
            r24 = r7
            r25 = r4
            r26 = r12
            r27 = r19
            r28 = r44
            r29 = r8
            X.6lZ r3 = X.AnonymousClass6UW.A02(r24, r25, r26, r27, r28, r29)
            goto L_0x1b00
        L_0x1b32:
            java.lang.CharSequence r1 = r11.A00
            android.text.SpannableString r23 = android.text.SpannableString.valueOf(r1)
            java.util.List r9 = r11.A02
            goto L_0x1afc
        L_0x1b3b:
            if (r23 == 0) goto L_0x00db
            if (r9 == 0) goto L_0x00db
            java.util.Iterator r9 = r9.iterator()
        L_0x1b43:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00db
            java.lang.Object r6 = r9.next()
            X.5uF r6 = (X.C122065uF) r6
            java.lang.Object r1 = r3.A00
            X.5y5 r1 = (X.C124375y5) r1
            if (r1 == 0) goto L_0x00db
            android.text.Layout r5 = r1.A02
            if (r5 == 0) goto L_0x00db
            X.64u r1 = r6.A02
            r21 = r1
            r22 = r5
            r24 = r6
            r25 = r44
            r26 = r8
            r21.A00(r22, r23, r24, r25, r26)
            r10 = r7
            r11 = r4
            r13 = r23
            r14 = r44
            r15 = r8
            X.6lZ r3 = X.AnonymousClass6UW.A02(r10, r11, r12, r13, r14, r15)
            goto L_0x1b43
        L_0x1b74:
            r3 = 35
            r1 = r30
            java.lang.Object r5 = r1.get(r3)
            X.6lc r5 = (X.C140456lc) r5
            if (r5 == 0) goto L_0x2324
            r1 = r44
            X.7lx r4 = r5.B2C(r7, r1, r8)
            r12 = 0
            r3 = 2
            X.AnonymousClass00C.A0D(r4, r3)
            long r13 = X.AnonymousClass5YT.A00(r1, r8)
            r9 = r7
            r10 = r4
            r11 = r5
            X.6Kq r6 = X.AnonymousClass6T6.A00(r9, r10, r11, r12, r13)
            int[] r4 = new int[r3]
            int r1 = android.view.View.MeasureSpec.getMode(r44)
            if (r1 != 0) goto L_0x1bce
            X.5vr r1 = r6.A02
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02
            android.graphics.Rect r1 = r1.A03
            int r1 = r1.width()
        L_0x1ba8:
            r3 = 0
            r4[r3] = r1
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 != 0) goto L_0x1bc9
            X.5vr r1 = r6.A02
            com.facebook.rendercore.RenderTreeNode r1 = r1.A02
            android.graphics.Rect r1 = r1.A03
            int r5 = r1.height()
        L_0x1bbb:
            r1 = 1
            r4[r1] = r5
            r4 = r4[r3]
            X.5vr r1 = r6.A02
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r1, r4, r5)
            goto L_0x00db
        L_0x1bc9:
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1bbb
        L_0x1bce:
            int r1 = android.view.View.MeasureSpec.getSize(r44)
            goto L_0x1ba8
        L_0x1bd3:
            r1 = r44
            X.6lZ r3 = X.C133186Xd.A01(r2, r1, r8)
            goto L_0x00db
        L_0x1bdb:
            r1 = r44
            X.7lx r3 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.calculateLayoutForComponent(r7, r0, r2, r1, r8)
            goto L_0x00db
        L_0x1be3:
            r1 = r44
            X.7lx r3 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.calculateLayoutForComponent(r7, r0, r2, r1, r8)
            goto L_0x00db
        L_0x1beb:
            r1 = r44
            X.7lx r3 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.calculateLayoutForComponent(r7, r0, r2, r1, r8)
            goto L_0x00db
        L_0x1bf3:
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 != 0) goto L_0x1c19
            java.lang.Object r3 = A0G(r7, r2)
            android.view.View r3 = (android.view.View) r3
            r1 = r44
            r3.measure(r1, r8)
            int r4 = r3.getMeasuredHeight()
        L_0x1c08:
            r3 = 0
            r1 = r44
            int r3 = A01(r1, r3)
            int r1 = A01(r8, r4)
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x1c19:
            r4 = 0
            goto L_0x1c08
        L_0x1c1b:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r44
            int r3 = X.AnonymousClass5ZK.A00(r4, r1)
            int r1 = X.AnonymousClass5ZK.A00(r4, r8)
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x1c2e:
            int r1 = android.view.View.MeasureSpec.getMode(r44)
            if (r1 != 0) goto L_0x1c47
            r3 = 0
        L_0x1c35:
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 != 0) goto L_0x1c42
            r1 = 0
        L_0x1c3c:
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x1c42:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1c3c
        L_0x1c47:
            int r3 = android.view.View.MeasureSpec.getSize(r44)
            goto L_0x1c35
        L_0x1c4c:
            r1 = 35
            X.6lc r3 = r0.A0W(r1)
            if (r3 != 0) goto L_0x1c5e
            r4 = 0
            r1 = 24
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r4, r1, r1)
            goto L_0x00db
        L_0x1c5e:
            r1 = 36
            java.lang.Object r1 = A0I(r3, r1)     // Catch:{ 5R5 -> 0x1c72 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x1c72 }
            if (r1 != 0) goto L_0x1c69
            goto L_0x1c6e
        L_0x1c69:
            float r1 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x1c72 }
            goto L_0x1c70
        L_0x1c6e:
            r1 = 1103101952(0x41c00000, float:24.0)
        L_0x1c70:
            int r4 = (int) r1     // Catch:{ 5R5 -> 0x1c72 }
            goto L_0x1c74
        L_0x1c72:
            r4 = 24
        L_0x1c74:
            r1 = 0
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r1, r4, r4)
            goto L_0x00db
        L_0x1c7c:
            r1 = 2
            X.AnonymousClass00C.A0D(r2, r1)
            java.lang.Object r3 = A0G(r7, r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentsspinner.SpinnerImageView"
            X.AnonymousClass00C.A0E(r3, r1)
            android.view.View r3 = (android.view.View) r3
            r1 = r44
            X.6lZ r3 = A05(r3, r2, r1, r8)
            goto L_0x00db
        L_0x1c93:
            r12 = 0
            android.content.Context r11 = r7.A02
            com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure r4 = X.AnonymousClass5Y5.A00(r11)
            java.lang.String r10 = A0J(r0)
            r3 = 54
            java.lang.Object r6 = A0I(r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "TextInputBinderUtils"
            if (r10 == 0) goto L_0x1cc3
            android.content.Context r5 = r1.A00
            X.6NR r3 = X.AnonymousClass6NR.A00()
            X.5zd r3 = r3.A03
            android.graphics.Typeface r9 = r3.A00(r5, r10)
            if (r6 == 0) goto L_0x1ccb
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x1ccb
            android.graphics.Typeface r9 = X.C109545Xz.A00(r11, r9, r6, r10)     // Catch:{ 5R5 -> 0x1cc5 }
            goto L_0x1ccb
        L_0x1cc3:
            r9 = 0
            goto L_0x1ccb
        L_0x1cc5:
            r5 = move-exception
            java.lang.String r3 = "Error parsing text style for text input"
            X.AnonymousClass6RS.A00(r1, r7, r3, r5)
        L_0x1ccb:
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r3 = X.C133266Xn.A04(r1, r0)
            X.5zL r3 = (X.C125115zL) r3
            java.lang.String r3 = r3.A0N
            r10 = r9
            r11 = r4
            r13 = r1
            r14 = r0
            r15 = r3
            X.AnonymousClass6XF.A02(r10, r11, r12, r13, r14, r15)
            r1 = r44
            r4.measure(r1, r8)
            int r1 = r4.getLineCount()
            X.5o7 r6 = new X.5o7
            r6.<init>(r9, r1)
            int r3 = android.view.View.MeasureSpec.getMode(r44)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r1) goto L_0x1d0e
            int r5 = android.view.View.MeasureSpec.getSize(r44)
        L_0x1cf8:
            int r4 = r4.getMeasuredHeight()
            int r1 = android.view.View.MeasureSpec.getMode(r44)
            if (r1 != 0) goto L_0x1d07
            java.lang.String r1 = "TextInput is being measured with unspecified width"
            X.AnonymousClass6RS.A01(r7, r1)
        L_0x1d07:
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r6, r5, r4)
            goto L_0x00db
        L_0x1d0e:
            int r5 = r4.getMeasuredWidth()
            goto L_0x1cf8
        L_0x1d13:
            r1 = 2
            X.AnonymousClass00C.A0D(r2, r1)
            java.lang.Object r3 = A0G(r7, r2)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.ProgressBar"
            X.AnonymousClass00C.A0E(r3, r1)
            android.view.View r3 = (android.view.View) r3
            r1 = r44
            X.6lZ r3 = A05(r3, r2, r1, r8)
            goto L_0x00db
        L_0x1d2a:
            X.6Xs r15 = X.C113015er.A00
            r1 = 49
            java.lang.Object r3 = A0I(r0, r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x1d42
            java.lang.String r1 = "gone"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x1d42
            X.7lx r3 = X.C131906Rg.A00
            goto L_0x00db
        L_0x1d42:
            android.content.Context r1 = r7.A02
            boolean r1 = X.AnonymousClass5YY.A00(r1)
            r14 = r1 ^ 1
            X.6lc r5 = X.C133296Xs.A03(r0)
            X.6Sh r4 = new X.6Sh
            r4.<init>()
            X.6o2 r1 = new X.6o2
            r1.<init>(r4, r0)
            r0.A0e(r1)
            if (r14 != 0) goto L_0x1d78
            X.5TC r10 = X.AnonymousClass5TC.RTL
            r1 = 2
            X.C132136Sh.A00(r4, r1)
            float[] r6 = r4.A01
            int r9 = r4.A00
            int r3 = r9 + 1
            r4.A00 = r3
            r1 = 0
            float r1 = (float) r1
            r6[r9] = r1
            int r1 = r3 + 1
            r4.A00 = r1
            int r1 = r10.mIntValue
            float r1 = (float) r1
            r6[r3] = r1
        L_0x1d78:
            if (r5 == 0) goto L_0x1d82
            X.6o3 r1 = new X.6o3
            r1.<init>(r4, r14)
            r5.A0e(r1)
        L_0x1d82:
            float[] r3 = r4.A01
            int r1 = r4.A00
            float[] r22 = java.util.Arrays.copyOf(r3, r1)
            java.util.List r21 = r0.A0b()
            int r1 = r21.size()
            float[][] r3 = new float[r1][]
            int r1 = r21.size()
            com.facebook.flexlayout.styles.FlexItemCallback[] r1 = new com.facebook.flexlayout.styles.FlexItemCallback[r1]
            java.util.Iterator r20 = r21.iterator()
            r13 = 0
            r19 = 0
        L_0x1da1:
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L_0x1e52
            java.lang.Object r12 = r20.next()
            X.7ek r12 = (X.C157827ek) r12
            boolean r4 = r12 instanceof X.C140456lc
            if (r4 == 0) goto L_0x1dcd
            r6 = r12
            X.6lc r6 = (X.C140456lc) r6
            int r5 = r6.A04
            r4 = 13320(0x3408, float:1.8665E-41)
            if (r5 != r4) goto L_0x1dcd
            r4 = 49
            java.lang.Object r5 = A0I(r6, r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x1dcd
            java.lang.String r4 = "gone"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x1dcd
            goto L_0x1da1
        L_0x1dcd:
            X.6lc r11 = X.C133296Xs.A03(r12)
            if (r11 == 0) goto L_0x1e4f
            X.6Um r10 = new X.6Um
            r10.<init>()
            r4 = 62
            java.lang.Object r4 = A0I(r11, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x1e4d
            r4 = 62
            java.lang.Object r5 = A0I(r11, r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "absolute"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x1e4d
            r9 = 1
            X.5T8 r18 = X.AnonymousClass5T8.ABSOLUTE
            float[] r17 = X.AnonymousClass6Um.A02(r10)
            int r5 = r10.A00
            int r4 = r5 + 1
            r10.A00 = r4
            r6 = 21
            float r6 = (float) r6
            r17[r5] = r6
            int r5 = r4 + 1
            r10.A00 = r5
            r5 = r18
            int r5 = r5.mIntValue
            float r5 = (float) r5
            r17[r4] = r5
        L_0x1e0f:
            if (r14 == 0) goto L_0x1e48
            java.lang.Integer r6 = X.C023109s.A00
            java.lang.Integer r5 = X.C023109s.A0C
        L_0x1e15:
            X.6o4 r4 = new X.6o4
            r4.<init>(r10, r6, r5, r9)
            r11.A0e(r4)
        L_0x1e1d:
            float[] r5 = r10.A01
            int r4 = r10.A00
            float[] r4 = java.util.Arrays.copyOf(r5, r4)
            r3[r13] = r4
            X.6KY r5 = new X.6KY
            r5.<init>(r7, r12, r15, r14)
            com.facebook.flexlayout.styles.FlexItemCallback r4 = new com.facebook.flexlayout.styles.FlexItemCallback
            r4.<init>(r5)
            r1[r13] = r4
            X.6lc r6 = X.C133296Xs.A03(r12)
            r5 = 0
            if (r6 == 0) goto L_0x1e44
            r4 = 81
            int r4 = r6.A0T(r4, r5)
            if (r4 == 0) goto L_0x1e44
            r19 = 1
        L_0x1e44:
            int r13 = r13 + 1
            goto L_0x1da1
        L_0x1e48:
            java.lang.Integer r6 = X.C023109s.A0C
            java.lang.Integer r5 = X.C023109s.A00
            goto L_0x1e15
        L_0x1e4d:
            r9 = 0
            goto L_0x1e0f
        L_0x1e4f:
            X.6Um r10 = X.C133296Xs.A00
            goto L_0x1e1d
        L_0x1e52:
            int r4 = r21.size()
            if (r4 <= r13) goto L_0x1e64
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r13)
            float[][] r3 = (float[][]) r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
            com.facebook.flexlayout.styles.FlexItemCallback[] r1 = (com.facebook.flexlayout.styles.FlexItemCallback[]) r1
        L_0x1e64:
            r5 = 0
            if (r19 == 0) goto L_0x1e80
            java.lang.Integer[] r5 = new java.lang.Integer[r13]
            r6 = 0
        L_0x1e6a:
            if (r6 >= r13) goto L_0x1e75
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5[r6] = r4
            int r6 = r6 + 1
            goto L_0x1e6a
        L_0x1e75:
            r7 = 2
            X.7qv r6 = new X.7qv
            r4 = r21
            r6.<init>(r4, r15, r7)
            java.util.Arrays.sort(r5, r6)
        L_0x1e80:
            float[] r15 = X.C131906Rg.A01(r44)
            float[] r14 = X.C131906Rg.A01(r8)
            r7 = 1
            r13 = r15[r7]
            r12 = r14[r7]
            X.6lc r11 = X.C133296Xs.A03(r0)
            if (r11 != 0) goto L_0x1ed9
            r10 = 0
        L_0x1e94:
            r13 = 0
            if (r10 == 0) goto L_0x1eb7
            r12 = r10[r13]
            r4 = 2
            r11 = r10[r4]
            r4 = 4
            r9 = r10[r4]
            r6 = r15[r13]
            r4 = r15[r7]
            float[] r15 = X.C131906Rg.A00(r12, r11, r9, r6, r4)
            r12 = r10[r7]
            r4 = 3
            r11 = r10[r4]
            r4 = 5
            r9 = r10[r4]
            r6 = r14[r13]
            r4 = r14[r7]
            float[] r14 = X.C131906Rg.A00(r12, r11, r9, r6, r4)
        L_0x1eb7:
            r24 = r15[r13]
            r25 = r15[r7]
            r26 = r14[r13]
            r27 = r14[r7]
            int r6 = r3.length
            com.facebook.flexlayout.layoutoutput.LayoutOutput r4 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r4.<init>(r6)
            r23 = r3
            r28 = r25
            r29 = r27
            r30 = r4
            r31 = r1
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.6lW r3 = new X.6lW
            r3.<init>(r4, r2, r5)
            goto L_0x00db
        L_0x1ed9:
            r4 = 6
            float[] r10 = new float[r4]
            r4 = 68
            float r4 = X.C133296Xs.A00(r11, r13, r4, r7)
            r9 = 0
            r10[r9] = r4
            r4 = 42
            float r4 = X.C133296Xs.A00(r11, r12, r4, r7)
            r10[r7] = r4
            r6 = 2
            r4 = 54
            float r4 = X.C133296Xs.A00(r11, r13, r4, r9)
            r10[r6] = r4
            r6 = 3
            r4 = 53
            float r4 = X.C133296Xs.A00(r11, r12, r4, r9)
            r10[r6] = r4
            r6 = 4
            r4 = 52
            float r4 = X.C133296Xs.A00(r11, r13, r4, r9)
            r10[r6] = r4
            r6 = 5
            r4 = 51
            float r4 = X.C133296Xs.A00(r11, r12, r4, r9)
            r10[r6] = r4
            goto L_0x1e94
        L_0x1f12:
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            boolean r5 = X.C36361kB.A1b(r3, r12)
            java.lang.String r1 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            java.lang.String r1 = "ComponentMapper"
            X.AnonymousClass6RS.A01(r1, r3)
            int r1 = android.view.View.MeasureSpec.getMode(r44)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x1f41
            int r3 = android.view.View.MeasureSpec.getSize(r44)
        L_0x1f31:
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 != r4) goto L_0x1f3b
            int r5 = android.view.View.MeasureSpec.getSize(r8)
        L_0x1f3b:
            X.6lZ r3 = A07(r2, r3, r5)
            goto L_0x00db
        L_0x1f41:
            r3 = 0
            goto L_0x1f31
        L_0x1f43:
            r1 = 45
            java.lang.Object r1 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x2331 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x2331 }
            if (r1 != 0) goto L_0x1f4e
            goto L_0x1f53
        L_0x1f4e:
            float r1 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x2331 }
            goto L_0x1f55
        L_0x1f53:
            r1 = 1183252480(0x46870000, float:17280.0)
        L_0x1f55:
            int r3 = (int) r1     // Catch:{ 5R5 -> 0x2331 }
            r1 = 40
            java.lang.Object r1 = A0I(r0, r1)     // Catch:{ 5R5 -> 0x232b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x232b }
            if (r1 != 0) goto L_0x1f61
            goto L_0x1f66
        L_0x1f61:
            float r1 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x232b }
            goto L_0x1f68
        L_0x1f66:
            r1 = 1183252480(0x46870000, float:17280.0)
        L_0x1f68:
            int r4 = (int) r1
            int[] r5 = X.C36441kJ.A1O()
            r1 = r44
            int r1 = X.AnonymousClass5ZK.A00(r3, r1)
            r3 = 0
            r5[r3] = r1
            int r4 = X.AnonymousClass5ZK.A00(r4, r8)
            r1 = 1
            r5[r1] = r4
            r1 = r5[r3]
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r5, r1, r4)
            goto L_0x00db
        L_0x1f86:
            X.6Ti r5 = r3.A01
            java.lang.Object r4 = A0G(r7, r2)
            X.07P r4 = (X.AnonymousClass07P) r4
            android.text.SpannableStringBuilder r3 = X.AnonymousClass6RY.A00(r1, r0)
            X.AnonymousClass6RY.A01(r3, r4, r1, r0, r5)
            r1 = r44
            X.6lZ r3 = A05(r4, r2, r1, r8)
            goto L_0x00db
        L_0x1f9d:
            X.6Ti r4 = r3.A01
            java.lang.Object r3 = A0G(r7, r2)
            android.view.View r3 = (android.view.View) r3
            r6 = 0
            X.C109985Zw.A00(r3, r1, r0, r4)
            r1 = r44
            r3.measure(r1, r8)
            int r5 = r3.getMeasuredWidth()
            int r4 = r3.getMeasuredHeight()
            r1 = 2131433218(0x7f0b1702, float:1.8488215E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.C90504aG.A0J(r3, r1)
            r1.setAdapter(r6)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r6, r5, r4)
            goto L_0x00db
        L_0x1fc7:
            java.lang.Object r6 = A0G(r7, r2)
            android.view.View r6 = (android.view.View) r6
            r4 = 50
            java.lang.String r3 = ""
            java.lang.String r3 = r0.A0a(r4, r3)
            r5 = 0
            X.AnonymousClass6RX.A01(r6, r1, r0, r3)
            r1 = r44
            r6.measure(r1, r8)
            int r4 = r6.getMeasuredWidth()
            int r1 = r6.getMeasuredHeight()
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r5, r4, r1)
            goto L_0x00db
        L_0x1fed:
            X.6Ti r9 = r3.A01
            java.lang.Object r6 = A0G(r7, r2)
            android.view.View r6 = (android.view.View) r6
            long r3 = X.C109975Zv.A00(r0)
            int[] r13 = X.C36441kJ.A1O()
            r12 = 1
            r7 = 0
            r10 = 0
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x2046
            java.lang.String r5 = A0L(r0)
            r1 = 2131434232(0x7f0b1af8, float:1.8490272E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r6, r1)
            r1.setText(r5)
            r1 = 2131434719(0x7f0b1cdf, float:1.849126E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r6, r1)
            X.0ts r1 = r9.A06
            X.C90504aG.A16(r5, r1, r3)
            r1 = r44
            r6.measure(r1, r8)
            int r1 = r6.getMeasuredWidth()
            r13[r7] = r1
            int r1 = r6.getMeasuredHeight()
            r13[r12] = r1
            r1 = 2131434232(0x7f0b1af8, float:1.8490272E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r6, r1)
            java.lang.String r3 = ""
            r1.setText(r3)
            r1 = 2131434719(0x7f0b1cdf, float:1.849126E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r6, r1)
            r1.setText(r3)
        L_0x2046:
            r3 = r13[r7]
            r1 = r13[r12]
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x2050:
            java.lang.Object r3 = A0G(r7, r2)
            android.view.View r3 = (android.view.View) r3
            r1 = r44
            r3.measure(r1, r8)
            int[] r5 = X.C36441kJ.A1O()
            int r1 = r3.getMeasuredWidth()
            r4 = 0
            r5[r4] = r1
            int r3 = r3.getMeasuredHeight()
            r1 = 1
            r5[r1] = r3
            r1 = r5[r4]
            X.6lZ r3 = A07(r2, r1, r3)
            goto L_0x00db
        L_0x2075:
            android.util.DisplayMetrics r6 = X.C90484aE.A0P()
            int[] r5 = X.C36441kJ.A1O()
            int r3 = r6.widthPixels
            r1 = r44
            int r1 = X.AnonymousClass5ZK.A00(r3, r1)
            r4 = 0
            r5[r4] = r1
            int r1 = r6.heightPixels
            int r3 = X.AnonymousClass5ZK.A00(r1, r8)
            r1 = 1
            r5[r1] = r3
            r1 = r5[r4]
            X.6lZ r3 = A07(r2, r1, r3)
            goto L_0x00db
        L_0x2099:
            if (r2 == 0) goto L_0x2337
            java.lang.Object r3 = A0G(r7, r2)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            X.AnonymousClass00C.A0E(r3, r1)
            android.view.View r3 = (android.view.View) r3
            r1 = r44
            X.6lZ r3 = A05(r3, r2, r1, r8)
            goto L_0x00db
        L_0x20ae:
            X.6Ti r9 = r3.A01
            if (r17 == 0) goto L_0x233e
            if (r9 == 0) goto L_0x233e
            android.content.Context r3 = r7.A02
            r1 = 2131624187(0x7f0e00fb, float:1.8875547E38)
            r11 = 0
            android.view.View r7 = android.view.View.inflate(r3, r1, r11)
            r1 = 52
            r6 = 1
            r0.A0f(r1, r6)
            r1 = 56
            r0.A0f(r1, r6)
            r1 = 59
            r5 = 0
            r0.A0f(r1, r5)
            r1 = 44
            java.util.List r1 = r0.A0d(r1)
            java.util.Iterator r15 = r1.iterator()
            r14 = 0
            r13 = 0
            r12 = 0
        L_0x20dc:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x210a
            X.6lc r10 = X.C90514aH.A0Y(r15)
            r3 = 36
            java.lang.String r1 = "regular"
            java.lang.String r3 = r10.A0a(r3, r1)
            java.lang.String r1 = "hd"
            boolean r4 = r3.equals(r1)
            r3 = 35
            r1 = 41
            if (r4 == 0) goto L_0x2161
            android.net.Uri r14 = A04(r10)
        L_0x20fe:
            int r13 = r10.A0T(r1, r5)
            int r12 = r10.A0T(r3, r5)
        L_0x2106:
            if (r14 == 0) goto L_0x20dc
            if (r11 == 0) goto L_0x20dc
        L_0x210a:
            if (r7 == 0) goto L_0x2110
            if (r11 != 0) goto L_0x2132
            if (r14 != 0) goto L_0x2132
        L_0x2110:
            r1 = r44
            r7.measure(r1, r8)
            int[] r4 = X.C36441kJ.A1O()
            int r1 = r7.getMeasuredWidth()
            r4[r5] = r1
            int r1 = r7.getMeasuredHeight()
            r4[r6] = r1
            r9.A02(r7)
            r3 = r4[r5]
            r1 = r4[r6]
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x2132:
            r1 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r10 = r7.findViewById(r1)
            com.whatsapp.videoplayback.BloksVideoPlayerView r10 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r10
            if (r14 != 0) goto L_0x213f
            if (r11 == 0) goto L_0x2110
        L_0x213f:
            X.3Qq r1 = r10.A0C
            if (r1 != 0) goto L_0x2153
            X.17Y r4 = r10.getGlobalUI()
            X.0yb r3 = r10.getSystemServices()
            android.app.Activity r1 = X.C36361kB.A06(r10)
            X.5NR r1 = X.AnonymousClass5NR.A00(r1, r4, r3, r10)
        L_0x2153:
            android.view.View r4 = r1.A08()
            r3 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r3)
            r10.addView(r4, r5, r1)
            goto L_0x2110
        L_0x2161:
            android.net.Uri r11 = A04(r10)
            if (r13 == 0) goto L_0x20fe
            if (r12 != 0) goto L_0x2106
            goto L_0x20fe
        L_0x216a:
            X.6Ti r3 = r3.A01
            if (r2 == 0) goto L_0x2345
            java.lang.Object r4 = A0G(r7, r2)
            android.view.View r4 = (android.view.View) r4
            X.C109965Zu.A00(r4, r1, r0, r3)
            r1 = r44
            r4.measure(r1, r8)
            int[] r5 = X.C36441kJ.A1O()
            int r1 = r4.getMeasuredWidth()
            r3 = 0
            r5[r3] = r1
            int r4 = r4.getMeasuredHeight()
            r1 = 1
            r5[r1] = r4
            r1 = r5[r3]
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r5, r1, r4)
            goto L_0x00db
        L_0x2197:
            X.6Ti r5 = r3.A01
            if (r17 == 0) goto L_0x234c
            android.content.Context r3 = r7.A02
            r1 = 2131624203(0x7f0e010b, float:1.887558E38)
            android.view.View r6 = X.C36421kH.A0D(r3, r1)
            java.lang.String r4 = A0K(r0)
            r1 = 35
            r3 = 0
            boolean r1 = r0.A0f(r1, r3)
            r5.A03(r6, r4, r1)
            r1 = r44
            r6.measure(r1, r8)
            int[] r5 = X.C36441kJ.A1O()
            int r1 = r6.getMeasuredWidth()
            r5[r3] = r1
            int r1 = r6.getMeasuredHeight()
            r4 = 1
            r5[r4] = r1
            r1 = 2131435134(0x7f0b1e7e, float:1.8492102E38)
            android.view.View r1 = X.C012005e.A02(r6, r1)
            com.whatsapp.videoplayback.VideoSurfaceView r1 = (com.whatsapp.videoplayback.VideoSurfaceView) r1
            r1.A04()
            com.whatsapp.videoplayback.VideoSurfaceView.A03(r1, r3)
            r3 = r5[r3]
            r1 = r5[r4]
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x21e1:
            r1 = r44
            X.6lZ r3 = A06(r7, r2, r1, r8)
            goto L_0x00db
        L_0x21e9:
            r1 = r44
            X.6la r3 = A0A(r7, r2, r0, r1, r8)
            goto L_0x00db
        L_0x21f1:
            int[] r5 = X.C36441kJ.A1O()
            r3 = 0
            r1 = r44
            int r1 = A01(r1, r3)
            r5[r3] = r1
            int r4 = A01(r8, r3)
            r1 = 1
            r5[r1] = r4
            r1 = r5[r3]
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r5, r1, r4)
            goto L_0x00db
        L_0x220e:
            X.6Ti r5 = r3.A01
            android.content.Context r4 = r7.A02
            com.whatsapp.TextEmojiLabel r3 = new com.whatsapp.TextEmojiLabel
            r3.<init>(r4)
            X.C110005Zy.A00(r3, r1, r0, r5)
            r1 = r44
            r3.measure(r1, r8)
            int[] r5 = X.C36441kJ.A1O()
            int r1 = r3.getMeasuredWidth()
            r4 = 0
            r5[r4] = r1
            int r3 = r3.getMeasuredHeight()
            r1 = 1
            r5[r1] = r3
            r1 = r5[r4]
            X.6lZ r3 = A07(r2, r1, r3)
            goto L_0x00db
        L_0x2239:
            r4 = 1
            r1 = 0
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r1, r4, r4)
            goto L_0x00db
        L_0x2242:
            r4 = 0
            r1 = r44
            int r3 = A01(r1, r4)
            int r1 = A01(r8, r4)
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x2253:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r44
            int r3 = X.AnonymousClass5ZK.A00(r4, r1)
            int r1 = X.AnonymousClass5ZK.A00(r4, r8)
            X.6lZ r3 = A07(r2, r3, r1)
            goto L_0x00db
        L_0x2266:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = r44
            int r5 = X.AnonymousClass5ZK.A00(r3, r1)
            int r4 = X.AnonymousClass5ZK.A00(r3, r8)
            r3 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r3, r3, r5, r4)
            X.6lZ r3 = new X.6lZ
            r3.<init>(r2, r1, r5, r4)
            goto L_0x00db
        L_0x2280:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Radius: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x228f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Height: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x229e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing scroll indicator's shadow Width: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22ad:
            java.lang.String r0 = "Invalid pixel format for scroll indicator margin"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22b4:
            java.lang.String r0 = "Invalid pixel format for scroll indicator corner radius"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22bb:
            java.lang.String r0 = "Invalid pixel format for scroll indicator size"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22c2:
            java.lang.String r0 = "Invalid snap style value"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22c9:
            java.lang.String r0 = "Invalid pixel format for left offset on snap"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22d0:
            java.lang.RuntimeException r0 = X.C36371kC.A0s()     // Catch:{ 5R5 -> 0x22d5 }
            throw r0     // Catch:{ 5R5 -> 0x22d5 }
        L_0x22d5:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22dc:
            java.lang.String r0 = "Invalid snap gravity value"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22e3:
            java.lang.String r0 = "Error parsing scroll indicator's shadow opacity: it should be in range [0..1]"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x22ea:
            java.lang.String r0 = "Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator or BloksModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x22f1:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x22f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x22fe:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x2305:
            java.lang.String r0 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x230c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x2312:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x2318:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x231e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x2324:
            java.lang.String r0 = "PTR container has no child"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x232b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x2331:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x2337:
            java.lang.String r0 = "A render unit was defined for this node but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x233e:
            java.lang.String r0 = "Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x2345:
            java.lang.String r0 = "Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x234c:
            java.lang.String r0 = "Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140456lc.B2C(X.5vp, int, int):X.7lx");
    }

    public C140456lc(C140456lc r2, C122225uV r3) {
        LinkedList linkedList = r2.A07;
        linkedList = linkedList == null ? C90524aI.A0l() : linkedList;
        this.A07 = linkedList;
        linkedList.addFirst(r3);
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A08 = r2.A08;
        C140456lc r0 = r2.A06;
        this.A06 = r0 == null ? null : r0;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        C114095gd.A03.incrementAndGet();
    }

    public C140456lc(C157187by r2, C140456lc r3, C140456lc r4, List list, int i) {
        this.A07 = r3.A07;
        this.A05 = r3.A05.clone();
        this.A04 = r3.A04;
        this.A03 = i;
        this.A08 = list;
        this.A06 = r4;
        this.A01 = r2;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        C114095gd.A03.incrementAndGet();
    }

    public C140456lc(int i) {
        this.A07 = null;
        this.A05 = new SparseArray();
        this.A04 = i;
        this.A03 = C113005eq.A00.incrementAndGet();
        this.A08 = null;
        this.A06 = null;
        this.A01 = null;
        C114095gd.A03.incrementAndGet();
    }
}
