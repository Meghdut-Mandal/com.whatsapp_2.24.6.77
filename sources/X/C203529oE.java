package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.9oE  reason: invalid class name and case insensitive filesystem */
public abstract class C203529oE {
    public static final Map A00 = AnonymousClass001.A0J();
    public static final Set A01 = C36441kJ.A16();
    public static final byte[] A02 = {80, 75, 3, 4};

    public static C131046Nn A04(InputStream inputStream, String str) {
        try {
            AnonymousClass00C.A0C(inputStream, 0);
            return A03(new AnonymousClass81I(A08(inputStream)), str, true);
        } finally {
            C203079nF.A04(inputStream);
        }
    }

    public static C131046Nn A05(String str) {
        return A03(new AnonymousClass81I(A08(C90524aI.A0P(str.getBytes()))), (String) null, true);
    }

    public static AnonymousClass6TF A07(Runnable runnable, String str, Callable callable) {
        AnonymousClass6TF r0 = null;
        if (str != null) {
            Object A04 = AnonymousClass9bR.A01.A00.A04(str);
            if (A04 != null) {
                Executor executor = AnonymousClass6TF.A04;
                r0 = new AnonymousClass6TF(new B8U(A04, 0), false);
            }
            Map map = A00;
            if (map.containsKey(str)) {
                r0 = (AnonymousClass6TF) map.get(str);
            }
            if (r0 != null) {
                if (runnable != null) {
                    runnable.run();
                }
                return r0;
            }
        }
        AnonymousClass6TF r3 = new AnonymousClass6TF(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            r3.A02(new C23198B9g(str, atomicBoolean, 0));
            r3.A01(new C23198B9g(str, atomicBoolean, 1));
            if (!atomicBoolean.get()) {
                Map map2 = A00;
                map2.put(str, r3);
                if (map2.size() == 1) {
                    ArrayList A15 = C36441kJ.A15(A01);
                    if (0 < A15.size()) {
                        A15.get(0);
                        throw AnonymousClass001.A0A("onIdleChanged");
                    }
                }
            }
        }
        return r3;
    }

    public static C131046Nn A01(Context context, String str, String str2) {
        try {
            if (str.endsWith(".zip") || str.endsWith(".lottie")) {
                return A02(context, str2, new ZipInputStream(context.getAssets().open(str)));
            }
            return A04(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new C131046Nn((Throwable) e);
        }
    }

    public static C131046Nn A03(C21655ATw aTw, String str, boolean z) {
        C131046Nn r1;
        C21655ATw aTw2 = aTw;
        try {
            C197499bo r0 = C190939Ax.A00;
            float A002 = C203079nF.A00();
            C000700i r22 = new C000700i();
            ArrayList A0I = AnonymousClass001.A0I();
            HashMap A0J = AnonymousClass001.A0J();
            HashMap A0J2 = AnonymousClass001.A0J();
            HashMap A0J3 = AnonymousClass001.A0J();
            ArrayList A0I2 = AnonymousClass001.A0I();
            C10890fO r16 = new C10890fO();
            AnonymousClass9Y2 r4 = new AnonymousClass9Y2();
            aTw2.A0M();
            int i = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i2 = 0;
            while (aTw2.A0S()) {
                switch (aTw2.A0F(C190939Ax.A03)) {
                    case 0:
                        i = aTw2.A0E();
                        continue;
                    case 1:
                        i2 = aTw2.A0E();
                        continue;
                    case 2:
                        f = C21655ATw.A08(aTw2);
                        continue;
                    case 3:
                        f2 = C21655ATw.A08(aTw2) - 0.01f;
                        continue;
                    case 4:
                        f3 = C21655ATw.A08(aTw2);
                        continue;
                    case 5:
                        String[] split = aTw2.A0J().split("\\.");
                        int A08 = C165617ti.A08(split, 0);
                        int A082 = C165617ti.A08(split, 1);
                        int A083 = C165617ti.A08(split, 2);
                        if (A08 >= 4) {
                            if (A08 <= 4) {
                                if (A082 >= 4) {
                                    if (A082 <= 4) {
                                        if (A083 >= 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        AnonymousClass9Y2.A00(r4, "Lottie only supports bodymovin >= 4.4.0");
                        break;
                    case 6:
                        aTw2.A0L();
                        int i3 = 0;
                        while (aTw2.A0S()) {
                            C195509Uo A003 = C197009ay.A00(r4, aTw2);
                            if (A003.A0G == C023109s.A0C) {
                                i3++;
                            }
                            A0I.add(A003);
                            r22.A0A(A003.A07, A003);
                            if (i3 > 4) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("You have ");
                                A0u.append(i3);
                                AnonymousClass6GP.A00(AnonymousClass000.A0q(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.", A0u));
                            }
                        }
                        break;
                    case 7:
                        aTw2.A0L();
                        while (aTw2.A0S()) {
                            ArrayList A0I3 = AnonymousClass001.A0I();
                            C000700i r13 = new C000700i();
                            aTw2.A0M();
                            String str2 = null;
                            String str3 = null;
                            int i4 = 0;
                            int i5 = 0;
                            while (aTw2.A0S()) {
                                int A0F = aTw2.A0F(C190939Ax.A00);
                                if (A0F == 0) {
                                    str2 = aTw2.A0J();
                                } else if (A0F == 1) {
                                    aTw2.A0L();
                                    while (aTw2.A0S()) {
                                        C195509Uo A004 = C197009ay.A00(r4, aTw2);
                                        r13.A0A(A004.A07, A004);
                                        A0I3.add(A004);
                                    }
                                    aTw2.A0N();
                                } else if (A0F == 2) {
                                    i4 = aTw2.A0E();
                                } else if (A0F == 3) {
                                    i5 = aTw2.A0E();
                                } else if (A0F == 4) {
                                    str3 = aTw2.A0J();
                                } else if (A0F != 5) {
                                    aTw2.A0P();
                                    aTw2.A0Q();
                                } else {
                                    aTw2.A0J();
                                }
                            }
                            aTw2.A0O();
                            if (str3 != null) {
                                AnonymousClass9M8 r8 = new AnonymousClass9M8(i4, i5, str2, str3);
                                A0J2.put(r8.A04, r8);
                            } else {
                                A0J.put(str2, A0I3);
                            }
                        }
                        break;
                    case 8:
                        aTw2.A0M();
                        while (aTw2.A0S()) {
                            if (aTw2.A0F(C190939Ax.A01) != 0) {
                                aTw2.A0P();
                                aTw2.A0Q();
                            } else {
                                aTw2.A0L();
                                while (aTw2.A0S()) {
                                    C197499bo r02 = AnonymousClass98P.A00;
                                    aTw2.A0M();
                                    String str4 = null;
                                    String str5 = null;
                                    String str6 = null;
                                    while (aTw2.A0S()) {
                                        int A0F2 = aTw2.A0F(AnonymousClass98P.A00);
                                        if (A0F2 == 0) {
                                            str4 = aTw2.A0J();
                                        } else if (A0F2 == 1) {
                                            str5 = aTw2.A0J();
                                        } else if (A0F2 == 2) {
                                            str6 = aTw2.A0J();
                                        } else if (A0F2 != 3) {
                                            aTw2.A0P();
                                            aTw2.A0Q();
                                        } else {
                                            aTw2.A0D();
                                        }
                                    }
                                    aTw2.A0O();
                                    AnonymousClass9L2 r82 = new AnonymousClass9L2(str4, str5, str6);
                                    A0J3.put(r82.A02, r82);
                                }
                                aTw2.A0N();
                            }
                        }
                        aTw2.A0O();
                        continue;
                    case 9:
                        aTw2.A0L();
                        while (aTw2.A0S()) {
                            C197499bo r03 = AnonymousClass9AE.A00;
                            ArrayList A0I4 = AnonymousClass001.A0I();
                            aTw2.A0M();
                            String str7 = null;
                            String str8 = null;
                            double d = 0.0d;
                            char c = 0;
                            while (aTw2.A0S()) {
                                int A0F3 = aTw2.A0F(AnonymousClass9AE.A01);
                                if (A0F3 == 0) {
                                    c = aTw2.A0J().charAt(0);
                                } else if (A0F3 == 1) {
                                    aTw2.A0D();
                                } else if (A0F3 == 2) {
                                    d = aTw2.A0D();
                                } else if (A0F3 == 3) {
                                    str7 = aTw2.A0J();
                                } else if (A0F3 == 4) {
                                    str8 = aTw2.A0J();
                                } else if (A0F3 != 5) {
                                    aTw2.A0P();
                                    aTw2.A0Q();
                                } else {
                                    aTw2.A0M();
                                    while (aTw2.A0S()) {
                                        if (aTw2.A0F(AnonymousClass9AE.A00) != 0) {
                                            aTw2.A0P();
                                            aTw2.A0Q();
                                        } else {
                                            aTw2.A0L();
                                            while (aTw2.A0S()) {
                                                A0I4.add(C200559hb.A02(r4, aTw2));
                                            }
                                            aTw2.A0N();
                                        }
                                    }
                                    aTw2.A0O();
                                }
                            }
                            aTw2.A0O();
                            AnonymousClass9S0 r83 = new AnonymousClass9S0(str7, str8, A0I4, c, d);
                            r16.A02(r83.hashCode(), r83);
                        }
                        break;
                    case 10:
                        aTw2.A0L();
                        while (aTw2.A0S()) {
                            String str9 = null;
                            aTw2.A0M();
                            float f4 = 0.0f;
                            float f5 = 0.0f;
                            while (aTw2.A0S()) {
                                int A0F4 = aTw2.A0F(C190939Ax.A02);
                                if (A0F4 == 0) {
                                    str9 = aTw2.A0J();
                                } else if (A0F4 == 1) {
                                    f4 = C21655ATw.A08(aTw2);
                                } else if (A0F4 != 2) {
                                    aTw2.A0P();
                                    aTw2.A0Q();
                                } else {
                                    f5 = C21655ATw.A08(aTw2);
                                }
                            }
                            aTw2.A0O();
                            A0I2.add(new C192829Is(str9, f4, f5));
                        }
                        break;
                    default:
                        aTw2.A0P();
                        aTw2.A0Q();
                        continue;
                }
                aTw2.A0N();
            }
            r4.A04 = new Rect(0, 0, (int) (((float) i) * A002), (int) (((float) i2) * A002));
            r4.A02 = f;
            r4.A00 = f2;
            r4.A01 = f3;
            r4.A07 = A0I;
            r4.A05 = r22;
            r4.A0B = A0J;
            r4.A0A = A0J2;
            r4.A06 = r16;
            r4.A09 = A0J3;
            r4.A08 = A0I2;
            String str10 = str;
            if (str != null) {
                AnonymousClass9bR.A01.A00.A08(str10, r4);
            }
            r1 = new C131046Nn((Object) r4);
        } catch (Exception e) {
            r1 = new C131046Nn((Throwable) e);
        } catch (Throwable th) {
            if (z) {
                C203079nF.A04(aTw2);
            }
            throw th;
        }
        if (z) {
            C203079nF.A04(aTw2);
        }
        return r1;
    }

    public static AZL A08(InputStream inputStream) {
        return new AZL(new AZN(inputStream, new C1902897p()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C131046Nn A00(android.content.Context r9, java.lang.String r10, int r11) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ NotFoundException -> 0x006a }
            java.io.InputStream r1 = r0.openRawResource(r11)     // Catch:{ NotFoundException -> 0x006a }
            r0 = 0
            X.AnonymousClass00C.A0C(r1, r0)     // Catch:{ NotFoundException -> 0x006a }
            X.AZL r5 = A08(r1)     // Catch:{ NotFoundException -> 0x006a }
            r8 = 0
            X.AZM r0 = new X.AZM     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            r0.<init>(r5)     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            X.AZL r7 = new X.AZL     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            r7.<init>(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            byte[] r6 = A02     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            r4 = 4
            r3 = 0
        L_0x001f:
            byte r2 = r6[r3]     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            r0 = 1
            boolean r0 = r7.BoJ(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            if (r0 == 0) goto L_0x0042
            X.AU1 r0 = r7.A01     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            byte r0 = r0.A00()     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            if (r0 == r2) goto L_0x0036
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            goto L_0x004b
        L_0x0036:
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x001f
            r7.close()     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            goto L_0x004b
        L_0x0042:
            java.io.EOFException r0 = X.C165617ti.A0T()     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x0047 }
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ NotFoundException -> 0x006a }
        L_0x004b:
            boolean r0 = r0.booleanValue()     // Catch:{ NotFoundException -> 0x006a }
            if (r0 == 0) goto L_0x0060
            X.8xs r1 = new X.8xs     // Catch:{ NotFoundException -> 0x006a }
            r1.<init>(r5)     // Catch:{ NotFoundException -> 0x006a }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x006a }
            r0.<init>(r1)     // Catch:{ NotFoundException -> 0x006a }
            X.6Nn r0 = A02(r9, r10, r0)     // Catch:{ NotFoundException -> 0x006a }
            return r0
        L_0x0060:
            X.8xs r0 = new X.8xs     // Catch:{ NotFoundException -> 0x006a }
            r0.<init>(r5)     // Catch:{ NotFoundException -> 0x006a }
            X.6Nn r0 = A04(r0, r10)     // Catch:{ NotFoundException -> 0x006a }
            return r0
        L_0x006a:
            r1 = move-exception
            X.6Nn r0 = new X.6Nn
            r0.<init>((java.lang.Throwable) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203529oE.A00(android.content.Context, java.lang.String, int):X.6Nn");
    }

    public static C131046Nn A02(Context context, String str, ZipInputStream zipInputStream) {
        C131046Nn r3;
        FileOutputStream fileOutputStream;
        try {
            HashMap A0J = AnonymousClass001.A0J();
            HashMap A0J2 = AnonymousClass001.A0J();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                r3 = null;
                AnonymousClass9Y2 r4 = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        r4 = (AnonymousClass9Y2) A03(new AnonymousClass81I(A08(zipInputStream)), (String) null, false).A00;
                    } else {
                        if (!name.contains(".png")) {
                            if (!name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                                if (name.contains(".ttf") || name.contains(".otf")) {
                                    String[] split = name.split("/");
                                    String str2 = split[split.length - 1];
                                    String str3 = str2.split("\\.")[0];
                                    File A0w = C36441kJ.A0w(context.getCacheDir(), str2);
                                    new FileOutputStream(A0w);
                                    try {
                                        fileOutputStream = new FileOutputStream(A0w);
                                        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                                        while (true) {
                                            int read = zipInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (Throwable th) {
                                        StringBuilder A0u = AnonymousClass000.A0u();
                                        A0u.append("Unable to save font ");
                                        A0u.append(str3);
                                        A0u.append(" to the temporary file: ");
                                        A0u.append(str2);
                                        AnonymousClass6GP.A01(AnonymousClass000.A0q(". ", A0u), th);
                                    }
                                    Typeface createFromFile = Typeface.createFromFile(A0w);
                                    if (!A0w.delete()) {
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        C90464aC.A1A(A0w, "Failed to delete temp font file ", A0u2);
                                        AnonymousClass6GP.A00(AnonymousClass000.A0q(".", A0u2));
                                    }
                                    A0J2.put(str3, createFromFile);
                                } else {
                                    zipInputStream.closeEntry();
                                }
                            }
                        }
                        String[] split2 = name.split("/");
                        A0J.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (r4 == null) {
                    r3 = new C131046Nn((Throwable) AnonymousClass001.A08("Unable to parse composition"));
                    C203079nF.A04(zipInputStream);
                    return r3;
                }
                Iterator A10 = C36371kC.A10(A0J);
                while (A10.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A10);
                    String A0f = C90494aF.A0f(A11);
                    Iterator A0z = AnonymousClass000.A0z(r4.A0A);
                    while (true) {
                        if (!A0z.hasNext()) {
                            break;
                        }
                        AnonymousClass9M8 r9 = (AnonymousClass9M8) A0z.next();
                        if (r9.A03.equals(A0f)) {
                            Bitmap bitmap = (Bitmap) A11.getValue();
                            int i = r9.A02;
                            int i2 = r9.A01;
                            if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                                bitmap.recycle();
                                bitmap = createScaledBitmap;
                            }
                            r9.A00 = bitmap;
                        }
                    }
                }
                Iterator A102 = C36371kC.A10(A0J2);
                while (A102.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A102);
                    Iterator A0z2 = AnonymousClass000.A0z(r4.A09);
                    boolean z = false;
                    while (A0z2.hasNext()) {
                        AnonymousClass9L2 r7 = (AnonymousClass9L2) A0z2.next();
                        if (r7.A01.equals(A112.getKey())) {
                            r7.A00 = (Typeface) A112.getValue();
                            z = true;
                        }
                    }
                    if (!z) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("Parsed font for ");
                        A0u3.append(C90494aF.A0f(A112));
                        AnonymousClass6GP.A00(AnonymousClass000.A0q(" however it was not found in the animation.", A0u3));
                    }
                }
                if (A0J.isEmpty()) {
                    Iterator A0y = AnonymousClass000.A0y(r4.A0A);
                    while (true) {
                        if (!A0y.hasNext()) {
                            break;
                        }
                        AnonymousClass9M8 r2 = (AnonymousClass9M8) C36351kA.A0u(A0y);
                        if (r2 == null) {
                            break;
                        }
                        String str4 = r2.A03;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (str4.startsWith("data:") && str4.indexOf("base64,") > 0) {
                            byte[] decode = Base64.decode(C165607th.A0o(str4.indexOf(44), str4), 0);
                            r2.A00 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        }
                    }
                }
                if (str != null) {
                    AnonymousClass9bR.A01.A00.A08(str, r4);
                }
                r3 = new C131046Nn((Object) r4);
                C203079nF.A04(zipInputStream);
                return r3;
                throw th;
            } catch (IOException e) {
                r3 = new C131046Nn((Throwable) e);
            }
        } catch (IllegalArgumentException e2) {
            AnonymousClass6GP.A01("data URL did not have correct base64 format.", e2);
        } catch (Throwable th2) {
            C203079nF.A04(zipInputStream);
            throw th2;
        }
    }

    public static AnonymousClass6TF A06(Context context, int i) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("rawRes");
        if ((AnonymousClass000.A0U(context).uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        String A0r = AnonymousClass000.A0r(str, A0u, i);
        return A07((Runnable) null, A0r, new C21727AYe(context.getApplicationContext(), A0r, AnonymousClass001.A0F(context), i));
    }
}
