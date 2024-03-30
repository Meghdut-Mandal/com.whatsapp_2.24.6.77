package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0BQ  reason: invalid class name */
public class AnonymousClass0BQ extends C010704m implements Animatable {
    public AnonymousClass0BW A00;
    public Animator.AnimatorListener A01;
    public Context A02;
    public AnonymousClass0BS A03;
    public ArrayList A04;
    public final Drawable.Callback A05;

    public AnonymousClass0BQ(Context context) {
        this.A01 = null;
        this.A04 = null;
        this.A05 = new AnonymousClass0BR(this);
        this.A02 = context;
        this.A03 = new AnonymousClass0BS();
    }

    public static boolean A06(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011b, code lost:
        if (r16 == 0) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder A01(android.content.res.TypedArray r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r3 = r16
            r10 = r17
            android.util.TypedValue r0 = r14.peekValue(r10)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0126
            r13 = 1
            int r11 = r0.type
        L_0x000f:
            r9 = r18
            android.util.TypedValue r0 = r14.peekValue(r9)
            if (r0 == 0) goto L_0x0122
            r12 = 1
            int r8 = r0.type
        L_0x001a:
            r0 = 4
            r1 = 3
            if (r3 != r0) goto L_0x011b
            if (r13 == 0) goto L_0x0026
            boolean r0 = A06(r11)
            if (r0 != 0) goto L_0x002e
        L_0x0026:
            if (r12 == 0) goto L_0x011e
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x011e
        L_0x002e:
            r3 = 3
        L_0x002f:
            r2 = 0
        L_0x0030:
            r0 = 0
            r7 = 2
            if (r3 != r7) goto L_0x006f
            java.lang.String r8 = r14.getString(r10)
            java.lang.String r6 = r14.getString(r9)
            X.0YU[] r3 = X.AnonymousClass0YJ.A02(r8)
            X.0YU[] r2 = X.AnonymousClass0YJ.A02(r6)
            if (r3 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0055
            X.0ZE r1 = new X.0ZE
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
        L_0x0051:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r0)
        L_0x0055:
            return r0
        L_0x0056:
            X.0ZE r1 = new X.0ZE
            r1.<init>()
            if (r2 == 0) goto L_0x006a
            boolean r0 = X.AnonymousClass0YJ.A01(r3, r2)
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r3
            r0[r5] = r2
            goto L_0x0051
        L_0x006a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            goto L_0x0051
        L_0x006f:
            if (r3 != r1) goto L_0x0118
            X.0ZG r3 = X.AnonymousClass0ZG.A00
        L_0x0073:
            r6 = 5
            r1 = 0
            if (r2 == 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00a8
            if (r11 != r6) goto L_0x00a3
            float r2 = r14.getDimension(r10, r1)
        L_0x007f:
            if (r12 == 0) goto L_0x009e
            if (r8 != r6) goto L_0x0099
            float r0 = r14.getDimension(r9, r1)
        L_0x0087:
            float[] r1 = new float[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x008d:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r15, r1)
        L_0x0091:
            if (r0 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
            r0.setEvaluator(r3)
            return r0
        L_0x0099:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x0087
        L_0x009e:
            float[] r1 = new float[r5]
            r1[r4] = r2
            goto L_0x008d
        L_0x00a3:
            float r2 = r14.getFloat(r10, r1)
            goto L_0x007f
        L_0x00a8:
            if (r8 != r6) goto L_0x00b3
            float r0 = r14.getDimension(r9, r1)
        L_0x00ae:
            float[] r1 = new float[r5]
            r1[r4] = r0
            goto L_0x008d
        L_0x00b3:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x00ae
        L_0x00b8:
            if (r13 == 0) goto L_0x00fa
            if (r11 != r6) goto L_0x00ea
            float r0 = r14.getDimension(r10, r1)
            int r2 = (int) r0
        L_0x00c1:
            if (r12 == 0) goto L_0x00e5
            if (r8 != r6) goto L_0x00d5
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x00ca:
            int[] r1 = new int[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x00d0:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r15, r1)
            goto L_0x0091
        L_0x00d5:
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x00e0
            int r0 = r14.getColor(r9, r4)
            goto L_0x00ca
        L_0x00e0:
            int r0 = r14.getInt(r9, r4)
            goto L_0x00ca
        L_0x00e5:
            int[] r1 = new int[r5]
            r1[r4] = r2
            goto L_0x00d0
        L_0x00ea:
            boolean r0 = A06(r11)
            if (r0 == 0) goto L_0x00f5
            int r2 = r14.getColor(r10, r4)
            goto L_0x00c1
        L_0x00f5:
            int r2 = r14.getInt(r10, r4)
            goto L_0x00c1
        L_0x00fa:
            if (r12 == 0) goto L_0x0055
            if (r8 != r6) goto L_0x0108
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x0103:
            int[] r1 = new int[r5]
            r1[r4] = r0
            goto L_0x00d0
        L_0x0108:
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x0113
            int r0 = r14.getColor(r9, r4)
            goto L_0x0103
        L_0x0113:
            int r0 = r14.getInt(r9, r4)
            goto L_0x0103
        L_0x0118:
            r3 = r0
            goto L_0x0073
        L_0x011b:
            if (r16 != 0) goto L_0x002f
            goto L_0x011f
        L_0x011e:
            r3 = 0
        L_0x011f:
            r2 = 1
            goto L_0x0030
        L_0x0122:
            r12 = 0
            r8 = 0
            goto L_0x001a
        L_0x0126:
            r13 = 0
            r11 = 0
            goto L_0x000f
        L_0x012a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = " Can't morph from "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BQ.A01(android.content.res.TypedArray, java.lang.String, int, int, int):android.animation.PropertyValuesHolder");
    }

    public static AnonymousClass0BQ A03(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0BQ r2 = new AnonymousClass0BQ(context);
            Drawable A002 = AnonymousClass0BT.A00(context.getTheme(), context.getResources(), i);
            r2.A00 = A002;
            A002.setCallback(r2.A05);
            r2.A00 = new AnonymousClass0BW(r2.A00.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    AnonymousClass0BQ r0 = new AnonymousClass0BQ(context);
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        }
    }

    public void A07() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        Animator.AnimatorListener animatorListener = this.A01;
        if (animatorListener != null) {
            this.A03.A00.removeListener(animatorListener);
            this.A01 = null;
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void A08(C06590Ue r3) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            A04((AnimatedVectorDrawable) drawable, r3);
        } else if (r3 != null) {
            ArrayList arrayList = this.A04;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A04 = arrayList;
            }
            if (!arrayList.contains(r3)) {
                this.A04.add(r3);
                Animator.AnimatorListener animatorListener = this.A01;
                if (animatorListener == null) {
                    animatorListener = new C18020sU(this, 1);
                    this.A01 = animatorListener;
                }
                this.A03.A00.addListener(animatorListener);
            }
        }
    }

    public void A09(C06590Ue r3) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.A00;
        if (drawable != null) {
            A05((AnimatedVectorDrawable) drawable, r3);
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null && r3 != null) {
            arrayList.remove(r3);
            if (this.A04.size() == 0 && (animatorListener = this.A01) != null) {
                this.A03.A00.removeListener(animatorListener);
                this.A01 = null;
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass076.A08(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnonymousClass0BS r1 = this.A03;
        r1.A02.draw(canvas);
        if (r1.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0XY.A00(drawable);
        }
        return this.A03.A02.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass076.A00(drawable);
        }
        return this.A03.A02.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new AnonymousClass0BW(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A03.A02.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A03.A02.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Resources.NotFoundException notFoundException;
        Animator A002;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            AnonymousClass076.A02(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        int eventType = xmlPullParser2.getEventType();
        int depth = xmlPullParser2.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser2.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = AnonymousClass0Yh.A02(theme2, resources2, attributeSet2, AnonymousClass0SA.A00);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C010804n A003 = C010804n.A00(theme2, resources2, resourceId);
                        A003.A01 = false;
                        A003.setCallback(this.A05);
                        AnonymousClass0BS r2 = this.A03;
                        C010804n r1 = r2.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        r2.A02 = A003;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources2.obtainAttributes(attributeSet2, AnonymousClass0SA.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A02;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                A002 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources3 = context.getResources();
                                Resources.Theme theme3 = context.getTheme();
                                XmlResourceParser xmlResourceParser = null;
                                try {
                                    XmlResourceParser animation = resources3.getAnimation(resourceId2);
                                    A002 = A00((AnimatorSet) null, context, theme3, resources3, Xml.asAttributeSet(animation), animation, 0);
                                    if (animation != null) {
                                        animation.close();
                                    }
                                } catch (XmlPullParserException e) {
                                    e = e;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Can't load animation resource ID #0x");
                                    sb.append(Integer.toHexString(resourceId2));
                                    notFoundException = new Resources.NotFoundException(sb.toString());
                                } catch (IOException e2) {
                                    e = e2;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Can't load animation resource ID #0x");
                                    sb2.append(Integer.toHexString(resourceId2));
                                    notFoundException = new Resources.NotFoundException(sb2.toString());
                                } catch (Throwable th) {
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            AnonymousClass0BS r12 = this.A03;
                            A002.setTarget(r12.A02.A00.A08.A0E.get(string));
                            ArrayList arrayList = r12.A03;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                r12.A03 = arrayList;
                                r12.A01 = new AnonymousClass008();
                            }
                            arrayList.add(A002);
                            r12.A01.put(A002, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser2.next();
        }
        AnonymousClass0BS r0 = this.A03;
        AnimatorSet animatorSet = r0.A00;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            r0.A00 = animatorSet;
        }
        animatorSet.playTogether(r0.A03);
        return;
        notFoundException.initCause(e);
        throw notFoundException;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0XY.A02(drawable);
        }
        return this.A03.A02.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A03.A00.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A03.A02.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        drawable.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A03.A02.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A03.A02.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0XY.A01(drawable, z);
        } else {
            this.A03.A02.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A03.A02.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A06(drawable, i);
        } else {
            this.A03.A02.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A01(colorStateList, drawable);
        } else {
            this.A03.A02.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A04(mode, drawable);
        } else {
            this.A03.A02.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A03.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnonymousClass0BS r1 = this.A03;
        if (!r1.A00.isStarted()) {
            r1.A00.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A03.A00.end();
        }
    }

    public static void A04(AnimatedVectorDrawable animatedVectorDrawable, C06590Ue r2) {
        animatedVectorDrawable.registerAnimationCallback(r2.A00());
    }

    public static void A05(AnimatedVectorDrawable animatedVectorDrawable, C06590Ue r2) {
        animatedVectorDrawable.unregisterAnimationCallback(r2.A00());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.animation.Animator[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.PropertyValuesHolder[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.animation.Animator} */
    /* JADX WARNING: type inference failed for: r3v13, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cb, code lost:
        if (r6 == null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ef, code lost:
        if (r1 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02f1, code lost:
        r1 = A01(r19, r9, r18, 0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f9, code lost:
        if (r1 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0161, code lost:
        if (A06(r6.type) != false) goto L_0x0163;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator A00(android.animation.AnimatorSet r26, android.content.Context r27, android.content.res.Resources.Theme r28, android.content.res.Resources r29, android.util.AttributeSet r30, org.xmlpull.v1.XmlPullParser r31, int r32) {
        /*
            r25 = 1065353216(0x3f800000, float:1.0)
            r12 = r31
            int r24 = r12.getDepth()
            r13 = 0
            r23 = r13
        L_0x000b:
            int r1 = r12.next()
            r0 = 3
            r11 = 0
            if (r1 != r0) goto L_0x001c
            int r1 = r12.getDepth()
            r0 = r24
            if (r1 <= r0) goto L_0x0337
            goto L_0x000b
        L_0x001c:
            r0 = 1
            if (r1 == r0) goto L_0x0337
            r0 = 2
            if (r1 != r0) goto L_0x000b
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r1.equals(r0)
            r3 = r30
            if (r0 == 0) goto L_0x0052
            android.animation.ObjectAnimator r13 = new android.animation.ObjectAnimator
            r13.<init>()
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A02(r3, r4, r5, r6, r7, r8)
        L_0x0041:
            if (r26 == 0) goto L_0x000b
            if (r11 != 0) goto L_0x000b
            if (r23 != 0) goto L_0x004c
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
        L_0x004c:
            r0 = r23
            r0.add(r13)
            goto L_0x000b
        L_0x0052:
            java.lang.String r0 = "animator"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            r4 = 0
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r3
            r9 = r12
            android.animation.ValueAnimator r13 = A02(r4, r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x0068:
            java.lang.String r0 = "set"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009d
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            int[] r2 = X.AnonymousClass0SA.A04
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r1 = X.AnonymousClass0Yh.A02(r1, r0, r3, r2)
            java.lang.String r0 = "ordering"
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 != 0) goto L_0x0098
            r9 = 0
        L_0x0088:
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r3
            r3 = r13
            r8 = r12
            A00(r3, r4, r5, r6, r7, r8, r9)
            r1.recycle()
            goto L_0x0041
        L_0x0098:
            int r9 = r1.getInt(r11, r11)
            goto L_0x0088
        L_0x009d:
            java.lang.String r22 = "propertyValuesHolder"
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x031c
            android.util.AttributeSet r21 = android.util.Xml.asAttributeSet(r12)
            r20 = 0
            r14 = r20
        L_0x00af:
            int r0 = r12.getEventType()
            r3 = 0
            r4 = 3
            if (r0 == r4) goto L_0x02fc
            r10 = 1
            if (r0 == r10) goto L_0x02fc
            r2 = 2
            if (r0 == r2) goto L_0x00c1
            r12.next()
            goto L_0x00af
        L_0x00c1:
            java.lang.String r1 = r12.getName()
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ea
            int[] r5 = X.AnonymousClass0SA.A07
            r3 = r28
            r1 = r29
            r0 = r21
            android.content.res.TypedArray r19 = X.AnonymousClass0Yh.A02(r3, r1, r0, r5)
            java.lang.String r0 = "propertyName"
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 != 0) goto L_0x01dc
            r9 = 0
        L_0x00e2:
            java.lang.String r0 = "valueType"
            r1 = 4
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 != 0) goto L_0x01d4
            r18 = 4
        L_0x00ed:
            r8 = r18
            r2 = r20
        L_0x00f1:
            int r0 = r12.next()
            r7 = 3
            if (r0 == r7) goto L_0x01e4
            if (r0 == r10) goto L_0x01e4
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "keyframe"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 4
            if (r8 != r0) goto L_0x0132
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.AnonymousClass0SA.A05
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r1 = X.AnonymousClass0Yh.A02(r1, r0, r4, r3)
            java.lang.String r0 = "value"
            r8 = 0
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 == 0) goto L_0x012f
            android.util.TypedValue r0 = r1.peekValue(r11)
            if (r0 == 0) goto L_0x012f
            int r0 = r0.type
            boolean r0 = A06(r0)
            if (r0 == 0) goto L_0x012f
            r8 = 3
        L_0x012f:
            r1.recycle()
        L_0x0132:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.AnonymousClass0SA.A05
            r1 = r28
            r0 = r29
            android.content.res.TypedArray r3 = X.AnonymousClass0Yh.A02(r1, r0, r4, r3)
            java.lang.String r0 = "fraction"
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 != 0) goto L_0x01ce
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x014c:
            java.lang.String r5 = "value"
            boolean r0 = X.AnonymousClass0Yh.A04(r5, r12)
            if (r0 != 0) goto L_0x01c6
            r6 = 0
        L_0x0155:
            r1 = 0
        L_0x0156:
            r0 = 4
            if (r8 != r0) goto L_0x019e
            if (r1 == 0) goto L_0x01c1
            int r0 = r6.type
            boolean r0 = A06(r0)
            if (r0 == 0) goto L_0x01a8
        L_0x0163:
            boolean r0 = X.AnonymousClass0Yh.A04(r5, r12)
            if (r0 != 0) goto L_0x0199
            r0 = 0
        L_0x016a:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r4, r0)
        L_0x016e:
            java.lang.String r0 = "interpolator"
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r12)
            if (r0 == 0) goto L_0x0185
            int r1 = r3.getResourceId(r10, r11)
            if (r1 <= 0) goto L_0x0185
            r0 = r27
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r1)
            r4.setInterpolator(r0)
        L_0x0185:
            r3.recycle()
            if (r4 == 0) goto L_0x0194
            if (r2 != 0) goto L_0x0191
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0191:
            r2.add(r4)
        L_0x0194:
            r12.next()
            goto L_0x00f1
        L_0x0199:
            int r0 = r3.getInt(r11, r11)
            goto L_0x016a
        L_0x019e:
            if (r1 == 0) goto L_0x01ba
            if (r8 == 0) goto L_0x01a8
            if (r8 == r10) goto L_0x0163
            if (r8 == r7) goto L_0x0163
            r4 = 0
            goto L_0x016e
        L_0x01a8:
            r1 = 0
            boolean r0 = X.AnonymousClass0Yh.A04(r5, r12)
            if (r0 != 0) goto L_0x01b5
            r0 = 0
        L_0x01b0:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r4, r0)
            goto L_0x016e
        L_0x01b5:
            float r0 = r3.getFloat(r11, r1)
            goto L_0x01b0
        L_0x01ba:
            if (r8 == 0) goto L_0x01c1
            android.animation.Keyframe r4 = android.animation.Keyframe.ofInt(r4)
            goto L_0x016e
        L_0x01c1:
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r4)
            goto L_0x016e
        L_0x01c6:
            android.util.TypedValue r6 = r3.peekValue(r11)
            r1 = 1
            if (r6 != 0) goto L_0x0156
            goto L_0x0155
        L_0x01ce:
            float r4 = r3.getFloat(r7, r1)
            goto L_0x014c
        L_0x01d4:
            r0 = r19
            int r18 = r0.getInt(r2, r1)
            goto L_0x00ed
        L_0x01dc:
            r0 = r19
            java.lang.String r9 = r0.getString(r4)
            goto L_0x00e2
        L_0x01e4:
            if (r2 == 0) goto L_0x02f1
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x02f1
            r5 = 0
            java.lang.Object r3 = r2.get(r11)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            int r0 = r6 + -1
            java.lang.Object r1 = r2.get(r0)
            android.animation.Keyframe r1 = (android.animation.Keyframe) r1
            float r15 = r1.getFraction()
            r4 = 0
            int r0 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x020d
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a7
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setFraction(r0)
        L_0x020d:
            float r1 = r3.getFraction()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0283
            r3.setFraction(r4)
        L_0x021c:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r6]
            r2.toArray(r3)
        L_0x0221:
            if (r5 >= r6) goto L_0x02d2
            r2 = r3[r5]
            float r0 = r2.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0232
            if (r5 != 0) goto L_0x0235
            r2.setFraction(r4)
        L_0x0232:
            int r5 = r5 + 1
            goto L_0x0221
        L_0x0235:
            int r1 = r6 + -1
            if (r5 != r1) goto L_0x023f
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setFraction(r0)
            goto L_0x0232
        L_0x023f:
            int r0 = r5 + 1
            r15 = r5
        L_0x0242:
            if (r0 >= r1) goto L_0x0253
            r2 = r3[r0]
            float r2 = r2.getFraction()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0253
            int r2 = r0 + 1
            r15 = r0
            r0 = r2
            goto L_0x0242
        L_0x0253:
            int r0 = r15 + 1
            r0 = r3[r0]
            float r17 = r0.getFraction()
            int r0 = r5 + -1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            float r17 = r17 - r0
            r2 = r5
            int r0 = r15 - r5
            int r0 = r0 + 2
            float r0 = (float) r0
            float r17 = r17 / r0
        L_0x026d:
            if (r2 > r15) goto L_0x0232
            r16 = r3[r2]
            int r0 = r2 + -1
            r0 = r3[r0]
            float r1 = r0.getFraction()
            float r1 = r1 + r17
            r0 = r16
            r0.setFraction(r1)
            int r2 = r2 + 1
            goto L_0x026d
        L_0x0283:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L_0x0295
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r4)
        L_0x028f:
            r2.add(r11, r0)
            int r6 = r6 + 1
            goto L_0x021c
        L_0x0295:
            java.lang.Class r1 = r3.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x02a2
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r4)
            goto L_0x028f
        L_0x02a2:
            android.animation.Keyframe r0 = android.animation.Keyframe.ofObject(r4)
            goto L_0x028f
        L_0x02a7:
            int r16 = r2.size()
            java.lang.Class r0 = r1.getType()
            java.lang.Class r15 = java.lang.Float.TYPE
            if (r0 != r15) goto L_0x02c0
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r25)
        L_0x02b7:
            r0 = r16
            r2.add(r0, r1)
            int r6 = r6 + 1
            goto L_0x020d
        L_0x02c0:
            java.lang.Class r1 = r1.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L_0x02cd
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r25)
            goto L_0x02b7
        L_0x02cd:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofObject(r25)
            goto L_0x02b7
        L_0x02d2:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r9, r3)
            if (r8 != r7) goto L_0x02ef
            X.0ZG r0 = X.AnonymousClass0ZG.A00
            r1.setEvaluator(r0)
        L_0x02dd:
            if (r14 != 0) goto L_0x02e4
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x02e4:
            r14.add(r1)
        L_0x02e7:
            r19.recycle()
        L_0x02ea:
            r12.next()
            goto L_0x00af
        L_0x02ef:
            if (r1 != 0) goto L_0x02dd
        L_0x02f1:
            r1 = r18
            r0 = r19
            android.animation.PropertyValuesHolder r1 = A01(r0, r9, r1, r11, r10)
            if (r1 == 0) goto L_0x02e7
            goto L_0x02dd
        L_0x02fc:
            if (r14 == 0) goto L_0x0319
            int r2 = r14.size()
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r2]
        L_0x0304:
            if (r3 >= r2) goto L_0x030f
            java.lang.Object r0 = r14.get(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0304
        L_0x030f:
            boolean r0 = r13 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L_0x0319
            r0 = r13
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.setValues(r1)
        L_0x0319:
            r11 = 1
            goto L_0x0041
        L_0x031c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown animator name: "
            r1.append(r0)
            java.lang.String r0 = r12.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0337:
            if (r26 == 0) goto L_0x035c
            if (r23 == 0) goto L_0x035c
            int r0 = r23.size()
            android.animation.Animator[] r3 = new android.animation.Animator[r0]
            java.util.Iterator r2 = r23.iterator()
        L_0x0345:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0355
            java.lang.Object r1 = r2.next()
            int r0 = r11 + 1
            r3[r11] = r1
            r11 = r0
            goto L_0x0345
        L_0x0355:
            r0 = r26
            if (r32 != 0) goto L_0x035d
            r0.playTogether(r3)
        L_0x035c:
            return r13
        L_0x035d:
            r0.playSequentially(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BQ.A00(android.animation.AnimatorSet, android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser, int):android.animation.Animator");
    }

    public static ValueAnimator A02(ValueAnimator valueAnimator, Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int resourceId;
        String string;
        String string2;
        String string3;
        String string4;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i6;
        int i7;
        ValueAnimator valueAnimator2 = valueAnimator;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A022 = AnonymousClass0Yh.A02(theme2, resources2, attributeSet2, AnonymousClass0SA.A03);
        TypedArray A023 = AnonymousClass0Yh.A02(theme2, resources2, attributeSet2, AnonymousClass0SA.A06);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        if (!AnonymousClass0Yh.A04("duration", xmlPullParser2)) {
            i = 300;
        } else {
            i = A022.getInt(1, 300);
        }
        long j = (long) i;
        if (!AnonymousClass0Yh.A04("startOffset", xmlPullParser2)) {
            i2 = 0;
        } else {
            i2 = A022.getInt(2, 0);
        }
        long j2 = (long) i2;
        if (!AnonymousClass0Yh.A04("valueType", xmlPullParser2)) {
            i3 = 4;
        } else {
            i3 = A022.getInt(7, 4);
        }
        if (AnonymousClass0Yh.A04("valueFrom", xmlPullParser2) && AnonymousClass0Yh.A04("valueTo", xmlPullParser2)) {
            if (i3 == 4) {
                TypedValue peekValue = A022.peekValue(5);
                boolean z2 = true;
                i3 = 0;
                if (peekValue != null) {
                    z = true;
                    i6 = peekValue.type;
                } else {
                    z = false;
                    i6 = 0;
                }
                TypedValue peekValue2 = A022.peekValue(6);
                if (peekValue2 != null) {
                    i7 = peekValue2.type;
                } else {
                    z2 = false;
                    i7 = 0;
                }
                if ((z && A06(i6)) || (z2 && A06(i7))) {
                    i3 = 3;
                }
            }
            PropertyValuesHolder A012 = A01(A022, "", i3, 5, 6);
            if (A012 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{A012});
            }
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.setStartDelay(j2);
        if (!AnonymousClass0Yh.A04("repeatCount", xmlPullParser2)) {
            i4 = 0;
        } else {
            i4 = A022.getInt(3, 0);
        }
        valueAnimator2.setRepeatCount(i4);
        if (!AnonymousClass0Yh.A04("repeatMode", xmlPullParser2)) {
            i5 = 1;
        } else {
            i5 = A022.getInt(4, 1);
        }
        valueAnimator2.setRepeatMode(i5);
        if (A023 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (!AnonymousClass0Yh.A04("pathData", xmlPullParser2) || (string2 = A023.getString(1)) == null) {
                if (!AnonymousClass0Yh.A04("propertyName", xmlPullParser2)) {
                    string = null;
                } else {
                    string = A023.getString(0);
                }
                objectAnimator.setPropertyName(string);
            } else {
                if (!AnonymousClass0Yh.A04("propertyXName", xmlPullParser2)) {
                    string3 = null;
                } else {
                    string3 = A023.getString(2);
                }
                if (!AnonymousClass0Yh.A04("propertyYName", xmlPullParser2)) {
                    string4 = null;
                } else {
                    string4 = A023.getString(3);
                }
                if (string3 == null && string4 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A023.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                Path A002 = AnonymousClass0YJ.A00(string2);
                float f = 1.0f * 0.5f;
                PathMeasure pathMeasure = new PathMeasure(A002, false);
                ArrayList arrayList = new ArrayList();
                float f2 = 0.0f;
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A002, false);
                int min = Math.min(100, ((int) (f3 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / ((float) (min - 1));
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i8 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f2 - ((Number) arrayList.get(i9)).floatValue(), fArr3, (float[]) null);
                    fArr[i8] = fArr3[0];
                    fArr2[i8] = fArr3[1];
                    f2 += f4;
                    int i10 = i9 + 1;
                    if (i10 < arrayList.size() && f2 > ((Number) arrayList.get(i10)).floatValue()) {
                        pathMeasure2.nextContour();
                        i9 = i10;
                    }
                    i8++;
                }
                if (string3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (string4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string4, fArr2);
                }
                objectAnimator.setValues(propertyValuesHolder2 == null ? new PropertyValuesHolder[]{propertyValuesHolder} : propertyValuesHolder == null ? new PropertyValuesHolder[]{propertyValuesHolder2} : new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
            }
        }
        if (AnonymousClass0Yh.A04("interpolator", xmlPullParser2) && (resourceId = A022.getResourceId(0, 0)) > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        A022.recycle();
        if (A023 != null) {
            A023.recycle();
        }
        return valueAnimator2;
    }

    public AnonymousClass0BQ() {
        this.A01 = null;
        this.A04 = null;
        this.A05 = new AnonymousClass0BR(this);
        this.A02 = null;
        this.A03 = new AnonymousClass0BS();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
