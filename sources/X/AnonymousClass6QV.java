package X;

import android.graphics.ColorSpace;

/* renamed from: X.6QV  reason: invalid class name */
public abstract class AnonymousClass6QV {
    public static final ColorSpace A02(AnonymousClass6FX r19) {
        ColorSpace.Named named;
        ColorSpace.Rgb rgb;
        AnonymousClass6FX r0 = r19;
        if (!AnonymousClass00C.A0J(r0, C114185go.A0G)) {
            if (AnonymousClass00C.A0J(r0, C114185go.A03)) {
                named = ColorSpace.Named.ACES;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A04)) {
                named = ColorSpace.Named.ACESCG;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A05)) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A06)) {
                named = ColorSpace.Named.BT2020;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A07)) {
                named = ColorSpace.Named.BT709;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A00)) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A01)) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A08)) {
                named = ColorSpace.Named.DCI_P3;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A09)) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0A)) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0B)) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0C)) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0D)) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0E)) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else if (AnonymousClass00C.A0J(r0, C114185go.A0F)) {
                named = ColorSpace.Named.SMPTE_C;
            } else if (r0 instanceof C94564iQ) {
                C94564iQ r1 = (C94564iQ) r0;
                float[] A00 = r1.A07.A00();
                C128406Cd r2 = r1.A06;
                if (r2 != null) {
                    rgb = new ColorSpace.Rgb(r0.A02, r1.A0C, A00, new ColorSpace.Rgb.TransferParameters(r2.A00, r2.A01, r2.A02, r2.A03, 0.0d, 0.0d, r2.A04));
                } else {
                    String str = r0.A02;
                    float[] fArr = r1.A0C;
                    AnonymousClass77S r3 = new AnonymousClass77S(r1.A09);
                    rgb = new ColorSpace.Rgb(str, fArr, A00, r3, new AnonymousClass77R(r1.A08), r0.A02(0), r0.A01(0));
                }
                return rgb;
            }
            return ColorSpace.get(named);
        }
        named = ColorSpace.Named.SRGB;
        return ColorSpace.get(named);
    }
}
