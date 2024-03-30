package X;

import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.urimod.Dimensions;
import com.facebook.fresco.urimod.UriModifier;
import com.facebook.fresco.urimod.UriModifierInterface;
import com.facebook.fresco.vito.listener.ImageListener;
import com.facebook.fresco.vito.provider.FrescoVitoProvider;
import com.facebook.fresco.vito.source.EmptyImageSource;
import com.facebook.fresco.vito.source.SingleImageSource;
import com.facebook.rendercore.fresco.FrescoRenderUnit;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6Xd  reason: invalid class name and case insensitive filesystem */
public final class C133186Xd {
    public static final C133186Xd A00 = new C133186Xd();

    public final void A03(FrescoRenderUnit frescoRenderUnit, int i, int i2) {
        AnonymousClass00C.A0D(frescoRenderUnit, 0);
        SingleImageSource imageSource = frescoRenderUnit.getImageSource();
        if (!(imageSource instanceof EmptyImageSource)) {
            boolean z = frescoRenderUnit.bloksModelShouldPrefetch;
            boolean z2 = frescoRenderUnit.bloksModelShouldForcePrefetch;
            boolean z3 = frescoRenderUnit.useTrueLayoutPrefetchForOptedInModels;
            boolean z4 = frescoRenderUnit.useTrueLayoutPrefetchForOptedOutModels;
            if (!z && !z2) {
                z3 = z4;
            }
            if (!z3) {
                return;
            }
            if (imageSource instanceof SingleImageSource) {
                Uri uri = imageSource.getUri();
                if (frescoRenderUnit.useSmartFetchForTrueLayoutPrefetch) {
                    Dimensions dimensions = new Dimensions(i, i2);
                    AnonymousClass84L r0 = frescoRenderUnit.imageOptions;
                    if (r0 == null) {
                        r0 = AnonymousClass84L.A0W;
                    }
                    UriModifierInterface.ModificationResult.Modified modifyUri = UriModifier.INSTANCE.modifyUri(uri, dimensions, r0.A01());
                    if (modifyUri instanceof UriModifierInterface.ModificationResult.Modified) {
                        uri = modifyUri.getNewUri();
                    }
                }
                FrescoVitoProvider.getPrefetcher().prefetchToBitmapCache$REDEX$MKMNdnV1lec(uri, frescoRenderUnit.imageOptions, frescoRenderUnit.callerContext, "BloksImageComponent");
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected SingleImageSource (got ");
            throw AnonymousClass001.A09(AnonymousClass000.A0m(C36441kJ.A1A(imageSource.getClass()), A0u));
        }
    }

    public static final C139716kO A00() {
        return new C139716kO();
    }

    public static final C132456Tu A02(C1271967i r22, C140456lc r23, Object obj) {
        String str;
        C97904qV r3;
        ImageListener imageListener;
        C139696kM r4;
        PointF pointF;
        ScalingUtils.ScaleType scaleType;
        AnonymousClass5RX r0;
        boolean z;
        boolean A0f;
        int A01;
        C1271967i r7 = r22;
        C140456lc r2 = r23;
        try {
            String str2 = (String) C140456lc.A0I(r2, 36);
            String str3 = (String) C140456lc.A0I(r2, 41);
            if (str2 == null || !r7.A03) {
                str2 = str3;
            }
            Uri uri = null;
            if (str2 != null) {
                try {
                    uri = C133036Wk.A01(str2);
                } catch (SecurityException e) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Parse uri \"");
                    A0u.append(str2);
                    AnonymousClass6RS.A00(r7, "UriParser", AnonymousClass000.A0q("\" failed.", A0u), e);
                }
            }
            C160377ku A0X = r2.A0X(44);
            if (A0X != null) {
                r3 = new C97904qV(r7, r2, A0X);
            } else {
                r3 = null;
            }
            ImageListener imageListener2 = (ImageListener) r3;
            List A0d = r2.A0d(133);
            AnonymousClass00C.A08(A0d);
            if (!C36401kF.A1a(A0d) || (imageListener = (C139716kO) C133266Xn.A05(r7, r2)) == null) {
                imageListener = imageListener2;
            } else if (imageListener2 != null) {
                ImageListener r1 = new C139716kO();
                List listeners = r1.getListeners();
                listeners.add(imageListener2);
                listeners.add(imageListener);
                imageListener = r1;
            }
            C160377ku A0X2 = r2.A0X(63);
            if (A0X2 == null) {
                r4 = null;
            } else {
                r4 = new C139696kM(r7, r2, A0X2);
            }
            SparseArray sparseArray = r7.A01;
            Object obj2 = sparseArray.get(R.id.bk_context_key_image_load_listener);
            ImagePerfDataListener r15 = new C139706kN();
            if (r4 != null) {
                r15.getListeners().add(r4);
            }
            if (obj2 != null) {
                r15.getListeners().add(obj2);
            }
            boolean A0f2 = r2.A0f(66, false);
            C140456lc A0W = r2.A0W(61);
            if (A0W != null) {
                pointF = new PointF(A0W.A0S(35, 0.5f), A0W.A0S(36, 0.5f));
            } else {
                pointF = null;
            }
            AnonymousClass84L r02 = AnonymousClass84L.A0W;
            AnonymousClass00C.A0D(r02, 0);
            AnonymousClass84K r6 = new AnonymousClass84K(r02);
            String A0M = C140456lc.A0M(r2);
            if (pointF != null) {
                scaleType = ScalingUtils.ScaleType.FOCUS_CROP;
            } else {
                if (A0M != null) {
                    try {
                        int A03 = C90524aI.A03(AnonymousClass6Y7.A09(A0M), C112715eL.A00);
                        if (A03 != 1) {
                            if (A03 == 2) {
                                scaleType = ScalingUtils.ScaleType.FIT_CENTER;
                            } else if (A03 == 3) {
                                scaleType = ScalingUtils.ScaleType.FIT_XY;
                            }
                        }
                    } catch (AnonymousClass5R5 e2) {
                        AnonymousClass6RS.A00((C1271967i) null, "ImageNodeHelper", AnonymousClass000.A0p("Error parsing image scale type: ", A0M, AnonymousClass000.A0u()), e2);
                    }
                }
                scaleType = ScalingUtils.ScaleType.CENTER_CROP;
            }
            AnonymousClass00C.A09(scaleType);
            r6.A07(scaleType);
            C140456lc A0W2 = r2.A0W(35);
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (!(A0W2 == null || (A01 = AnonymousClass5Z8.A01(r7, A0W2, 0)) == 0)) {
                porterDuffColorFilter = new PorterDuffColorFilter(A01, PorterDuff.Mode.SRC_ATOP);
            }
            r6.A06 = porterDuffColorFilter;
            r6.A0L = true;
            r6.A0O = false;
            r6.A0S = A0f2;
            r6.A0R = A0f2;
            r6.A0Q = r2.A0f(69, false);
            C140456lc A0W3 = r2.A0W(46);
            if (A0W3 == null || !A0W3.A0f(41, false)) {
                r0 = AnonymousClass5RX.DEFAULT;
            } else {
                r0 = AnonymousClass5RX.SMALL;
            }
            r6.A01 = r0;
            r6.A09 = pointF;
            C140456lc A0W4 = r2.A0W(65);
            if (A0W4 != null) {
                r6.A0K = Integer.valueOf(AnonymousClass5Z8.A01(r7, A0W4, 0));
                r6.A03 = 0;
                r6.A0C = null;
            }
            if (AnonymousClass00C.A0J((String) C140456lc.A0I(r2, 67), "fade")) {
                r6.A01 = 100;
            }
            if (r2.A0f(76, false)) {
                r6.A0H = C64903Pw.A01;
            }
            AnonymousClass84L r03 = new AnonymousClass84L(r6);
            boolean A0f3 = r2.A0f(74, false);
            Object obj3 = obj;
            if (uri == null) {
                z = false;
                A0f = false;
            } else {
                C140456lc A0W5 = r2.A0W(46);
                if (A0W5 != null) {
                    z = A0W5.A0f(38, true);
                } else {
                    z = true;
                }
                A0f = r2.A0f(70, false);
                if (A0f || (FrescoVitoProvider.getConfig().layoutPrefetchingEnabled(obj3) && z)) {
                    FrescoVitoProvider.getPrefetcher().prefetch(FrescoVitoProvider.getConfig().getPrefetchConfig().prefetchTargetOnPrepare(), uri, r03, obj3, "BloksImageComponent");
                }
            }
            C135026c0 r32 = new C135026c0((C135026c0) sparseArray.get(R.id.bk_context_key_context_chain), "i", "BloksImageComponent");
            long j = (long) r2.A03;
            if (r15.getListeners().isEmpty()) {
                r15 = null;
            }
            String str4 = (String) C140456lc.A0I(r2, 73);
            if (str4 != null) {
                C135026c0 r24 = new C135026c0(r32, "serialized_tag", "serialized_name");
                r24.A00 = str4;
                r32 = r24;
            }
            return new FrescoRenderUnit(j, uri, imageListener, r15, r03, A0f3, obj3, r32, z, A0f, false, false, false);
        } catch (Exception e3) {
            try {
                SparseArray sparseArray2 = r2.A05;
                Object obj4 = sparseArray2.get(36);
                Object obj5 = sparseArray2.get(41);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Error getting urls - darkUrl: ");
                String str5 = null;
                if (obj4 != null) {
                    str = obj4.toString();
                } else {
                    str = null;
                }
                A0u2.append(str);
                A0u2.append(", url: ");
                if (obj5 != null) {
                    str5 = obj5.toString();
                }
                AnonymousClass6RS.A00(r7, "ImageNodeHelper", AnonymousClass000.A0q(str5, A0u2), e3);
            } catch (Exception unused) {
            }
            throw e3;
        }
    }

    public static final C140426lZ A01(C132456Tu r4, int i, int i2) {
        int A002 = AnonymousClass5ZK.A00(Integer.MAX_VALUE, i);
        int A003 = AnonymousClass5ZK.A00(Integer.MAX_VALUE, i2);
        if (!(r4 instanceof FrescoRenderUnit)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected FrescoRenderUnit (got ");
            throw AnonymousClass001.A09(AnonymousClass000.A0m(C90474aD.A0W(r4), A0u));
        }
        A00.A03((FrescoRenderUnit) r4, A002, A003);
        return new C140426lZ(r4, new Rect(0, 0, A002, A003), A002, A003);
    }
}
