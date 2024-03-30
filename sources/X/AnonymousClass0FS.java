package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0FS  reason: invalid class name */
public class AnonymousClass0FS extends AnonymousClass0Ds implements C010604l {
    public int A00;
    public int A01;
    public AnonymousClass0FR A02;
    public AnonymousClass0FR A03;
    public C06630Uk A04;
    public boolean A05;
    public boolean A06;

    public boolean isStateful() {
        return true;
    }

    private void A00(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        C010804n r5;
        int next;
        TypedArray A022 = AnonymousClass0Yh.A02(theme, resources, attributeSet, C56742wo.A01);
        int resourceId = A022.getResourceId(0, 0);
        int resourceId2 = A022.getResourceId(1, -1);
        if (resourceId2 > 0) {
            r5 = AnonymousClass02X.A03().A08(context, resourceId2);
        } else {
            r5 = null;
        }
        A022.recycle();
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        int[] trimStateSet = StateSet.trimStateSet(iArr, i);
        C010804n r52 = r5;
        if (r5 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(AnonymousClass000.A0p(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A0u()));
            } else if (xmlPullParser.getName().equals("vector")) {
                C010804n r53 = new C010804n();
                r53.inflate(resources, xmlPullParser, attributeSet, theme);
                r52 = r53;
            } else {
                Drawable createFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                r52 = createFromXmlInner;
                if (createFromXmlInner == null) {
                    throw new XmlPullParserException(AnonymousClass000.A0p(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A0u()));
                }
            }
        }
        AnonymousClass0FR r1 = this.A02;
        int A012 = r1.A01(r52);
        r1.A02[A012] = trimStateSet;
        r1.A01.A02(A012, Integer.valueOf(resourceId));
    }

    private void A01(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        AnonymousClass0BQ r11;
        long j;
        int next;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A022 = AnonymousClass0Yh.A02(theme2, resources2, attributeSet2, C56742wo.A02);
        int resourceId = A022.getResourceId(2, -1);
        int resourceId2 = A022.getResourceId(1, -1);
        int resourceId3 = A022.getResourceId(0, -1);
        Context context2 = context;
        if (resourceId3 > 0) {
            r11 = AnonymousClass02X.A03().A08(context2, resourceId3);
        } else {
            r11 = null;
        }
        boolean z = A022.getBoolean(3, false);
        A022.recycle();
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnonymousClass0BQ r112 = r11;
        if (r11 == null) {
            do {
                next = xmlPullParser2.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(AnonymousClass000.A0p(xmlPullParser2.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A0u()));
            } else if (xmlPullParser2.getName().equals("animated-vector")) {
                AnonymousClass0BQ r113 = new AnonymousClass0BQ(context2);
                r113.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
                r112 = r113;
            } else {
                Drawable createFromXmlInner = Drawable.createFromXmlInner(resources2, xmlPullParser2, attributeSet2, theme2);
                r112 = createFromXmlInner;
                if (createFromXmlInner == null) {
                    throw new XmlPullParserException(AnonymousClass000.A0p(xmlPullParser2.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A0u()));
                }
            }
        }
        if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(AnonymousClass000.A0q(": <transition> tag requires 'fromId' & 'toId' attributes", AnonymousClass000.A0w(xmlPullParser2)));
        }
        AnonymousClass0FR r14 = this.A02;
        int A012 = r14.A01(r112);
        long j2 = (long) resourceId;
        long j3 = (long) resourceId2;
        long j4 = j3 | (j2 << 32);
        if (z) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        long j5 = (long) A012;
        r14.A00.A09(j4, Long.valueOf(j5 | j));
        if (z) {
            r14.A00.A09(j2 | (j3 << 32), Long.valueOf(4294967296L | j5 | j));
        }
    }

    public void A05(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int depth;
        TypedArray A022 = AnonymousClass0Yh.A02(theme, resources, attributeSet, C56742wo.A00);
        setVisible(A022.getBoolean(1, true), true);
        AnonymousClass0FR r3 = this.A02;
        r3.A0B |= A022.getChangingConfigurations();
        r3.A0W = A022.getBoolean(2, r3.A0W);
        r3.A0U = A022.getBoolean(3, r3.A0U);
        r3.A0H = A022.getInt(4, r3.A0H);
        r3.A0I = A022.getInt(5, r3.A0I);
        setDither(A022.getBoolean(0, r3.A0V));
        this.A02.A05(resources);
        A022.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                onStateChange(getState());
            } else if (next == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    A00(context, theme, resources, attributeSet, xmlPullParser);
                } else if (xmlPullParser.getName().equals("transition")) {
                    A01(context, theme, resources, attributeSet, xmlPullParser);
                }
            }
        }
        onStateChange(getState());
    }

    public Drawable mutate() {
        if (!this.A06) {
            if (!this.A05) {
                super.mutate();
                if (this == this) {
                    this.A03.A07();
                    this.A05 = true;
                }
            }
            if (this == this) {
                this.A02.A07();
                this.A06 = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r4 >= 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (A03(r4) != false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            X.0FR r5 = r14.A02
            int[][] r2 = r5.A02
            int r1 = r5.A0K
            r4 = 0
        L_0x0007:
            if (r4 >= r1) goto L_0x011d
            r0 = r2[r4]
            boolean r0 = android.util.StateSet.stateSetMatches(r0, r15)
            if (r0 == 0) goto L_0x0119
            if (r4 < 0) goto L_0x011d
        L_0x0013:
            int r6 = r14.A00
            if (r4 == r6) goto L_0x0116
            X.0Uk r1 = r14.A04
            if (r1 == 0) goto L_0x0040
            int r6 = r14.A01
            if (r4 == r6) goto L_0x0032
            int r0 = r14.A00
            if (r4 != r0) goto L_0x003d
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x003d
            r1.A00()
            int r0 = r14.A00
            r14.A01 = r0
            r14.A00 = r4
        L_0x0032:
            r1 = 1
        L_0x0033:
            android.graphics.drawable.Drawable r0 = r14.A01
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.setState(r15)
            r1 = r1 | r0
        L_0x003c:
            return r1
        L_0x003d:
            r1.A02()
        L_0x0040:
            r0 = 0
            r14.A04 = r0
            r0 = -1
            r14.A00 = r0
            r14.A01 = r0
            X.0FR r5 = r14.A02
            r7 = 0
            if (r6 < 0) goto L_0x006a
            X.0fO r3 = r5.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            int[] r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.AnonymousClass009.A00(r1, r0, r6)
            if (r1 < 0) goto L_0x0066
            java.lang.Object[] r0 = r3.A02
            r1 = r0[r1]
            java.lang.Object r0 = X.C06840Vh.A00
            if (r1 == r0) goto L_0x0066
            r2 = r1
        L_0x0066:
            int r7 = X.AnonymousClass000.A0I(r2)
        L_0x006a:
            r0 = 0
            if (r4 < 0) goto L_0x010e
            X.0fO r3 = r5.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int[] r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.AnonymousClass009.A00(r1, r0, r4)
            if (r1 < 0) goto L_0x0086
            java.lang.Object[] r0 = r3.A02
            r1 = r0[r1]
            java.lang.Object r0 = X.C06840Vh.A00
            if (r1 == r0) goto L_0x0086
            r2 = r1
        L_0x0086:
            int r3 = X.AnonymousClass000.A0I(r2)
            if (r3 == 0) goto L_0x010e
            if (r7 == 0) goto L_0x010e
            long r0 = (long) r7
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r2 = r2 | r0
            X.00i r7 = r5.A00
            r0 = -1
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.A06(r9, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r7 = (int) r0
            if (r7 < 0) goto L_0x010e
            X.00i r0 = r5.A00
            java.lang.Object r0 = r0.A06(r9, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r12 = r0.longValue()
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r0
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            boolean r8 = X.AnonymousClass000.A1P(r0)
            r14.A03(r7)
            android.graphics.drawable.Drawable r7 = r14.A01
            boolean r0 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x00f6
            X.00i r0 = r5.A00
            java.lang.Object r0 = r0.A06(r9, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 & r0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r0)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            X.0FQ r0 = new X.0FQ
            r0.<init>(r7, r1, r8)
        L_0x00eb:
            r0.A01()
            r14.A04 = r0
            r14.A00 = r6
            r14.A01 = r4
            goto L_0x0032
        L_0x00f6:
            boolean r0 = r7 instanceof X.AnonymousClass0BQ
            if (r0 == 0) goto L_0x0102
            X.0BQ r7 = (X.AnonymousClass0BQ) r7
            X.0FP r0 = new X.0FP
            r0.<init>(r7)
            goto L_0x00eb
        L_0x0102:
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x010e
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            X.0FO r0 = new X.0FO
            r0.<init>(r7)
            goto L_0x00eb
        L_0x010e:
            boolean r0 = r14.A03(r4)
            if (r0 == 0) goto L_0x0116
            goto L_0x0032
        L_0x0116:
            r1 = 0
            goto L_0x0033
        L_0x0119:
            int r4 = r4 + 1
            goto L_0x0007
        L_0x011d:
            int[] r3 = android.util.StateSet.WILD_CARD
            int[][] r2 = r5.A02
            int r1 = r5.A0K
            r4 = 0
        L_0x0124:
            if (r4 >= r1) goto L_0x0131
            r0 = r2[r4]
            boolean r0 = android.util.StateSet.stateSetMatches(r0, r3)
            if (r0 != 0) goto L_0x0013
            int r4 = r4 + 1
            goto L_0x0124
        L_0x0131:
            r4 = -1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FS.onStateChange(int[]):boolean");
    }

    public AnonymousClass0FS(Resources resources, AnonymousClass0FR r3) {
        this.A01 = -1;
        this.A00 = -1;
        A04(new AnonymousClass0FR(resources, r3, this));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public void A04(C03190Dn r1) {
        super.A04(r1);
        AnonymousClass0FR r12 = (AnonymousClass0FR) r1;
        this.A03 = r12;
        this.A02 = r12;
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C06630Uk r0 = this.A04;
        if (r0 != null) {
            r0.A02();
            this.A04 = null;
            A03(this.A01);
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C06630Uk r0 = this.A04;
        if (r0 != null && (visible || z2)) {
            if (z) {
                r0.A01();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }

    public AnonymousClass0FS() {
        this((Resources) null, (AnonymousClass0FR) null);
    }
}
