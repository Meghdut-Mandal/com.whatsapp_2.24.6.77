package X;

import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.6oa  reason: invalid class name and case insensitive filesystem */
public class C142256oa implements C160377ku {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C118905ov A03;
    public final String A04;
    public final AnonymousClass6IL A05;
    public final C115205iV A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C142256oa(X.AnonymousClass6IL r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            r4 = 0
            r5 = -1
            X.5iV r2 = new X.5iV
            r2.<init>(r10)
            if (r11 != 0) goto L_0x0012
            r3 = r4
        L_0x000a:
            r0 = r8
            r1 = r9
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0012:
            X.5ov r3 = new X.5ov
            r3.<init>(r4, r11)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142256oa.<init>(X.6IL, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r4 == r3) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C142256oa A00(X.C157187by r10, java.util.List r11) {
        /*
            r9 = this;
            X.5ov r3 = r9.A03
            r0 = 0
            if (r3 == 0) goto L_0x0025
            X.7by r2 = r3.A00
            r1 = r2
            if (r10 == 0) goto L_0x0015
            if (r2 == 0) goto L_0x0015
            X.6jF r2 = (X.C139106jF) r2
            java.util.List r0 = r2.A00
            X.6jF r2 = new X.6jF
            r2.<init>(r10, r0)
        L_0x0015:
            java.util.List r0 = r3.A01
            if (r11 != r0) goto L_0x001f
            if (r2 != r1) goto L_0x001f
            r4 = r3
        L_0x001c:
            if (r4 != r3) goto L_0x002c
        L_0x001e:
            return r9
        L_0x001f:
            X.5ov r4 = new X.5ov
            r4.<init>(r2, r11)
            goto L_0x001c
        L_0x0025:
            if (r11 == 0) goto L_0x001e
            X.5ov r4 = new X.5ov
            r4.<init>(r0, r11)
        L_0x002c:
            X.5iV r3 = r9.A06
            X.6IL r2 = r9.A05
            int r6 = r9.A01
            int r7 = r9.A02
            int r8 = r9.A00
            java.lang.String r5 = r9.A04
            X.6oa r1 = new X.6oa
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142256oa.A00(X.7by, java.util.List):X.6oa");
    }

    public void B6g(AnonymousClass5YN r20) {
        C115205iV r8 = this.A06;
        C121135se r7 = r8.A00;
        AnonymousClass6TG r1 = r7.A00;
        if (!Boolean.valueOf(AnonymousClass000.A1V(r1)).booleanValue()) {
            if (r1 == null) {
                String str = r7.A01;
                if (str.startsWith("lispx")) {
                    str = str.substring(15);
                }
                try {
                    ByteBuffer doCompile = MinsCompilerImpl$Helper.doCompile(str.getBytes(DefaultCrypto.UTF_8), false);
                    doCompile.order(ByteOrder.nativeOrder());
                    ByteBuffer slice = doCompile.slice();
                    slice.order(doCompile.order());
                    int capacity = doCompile.capacity();
                    int i = slice.getInt();
                    short s = slice.getShort() & 65535;
                    short s2 = 65535 & slice.getShort();
                    if (i == -1397639502 && s == 1 && s2 == 0) {
                        int i2 = slice.getInt();
                        int i3 = slice.getInt();
                        int position = doCompile.position();
                        if (i2 > capacity) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("buffer is smaller than encoded size ");
                            A0u.append(i2);
                            C36421kH.A1N(A0u);
                            A0u.append(capacity);
                            A0u.append(" byteBuffer.order:");
                            A0u.append(doCompile.order());
                            A0u.append(" native order:");
                            throw new AnonymousClass78W(AnonymousClass000.A0o(ByteOrder.nativeOrder(), A0u));
                        } else if (i2 >= position) {
                            int i4 = position + (i3 * 16);
                            if (i4 <= i2) {
                                C121145sf[] r9 = new C121145sf[i3];
                                int i5 = 0;
                                while (i5 < i3) {
                                    C121145sf r3 = new C121145sf();
                                    r3.A00 = slice.getInt();
                                    r3.A02 = slice.getInt();
                                    r3.A01 = slice.getInt();
                                    slice.getInt();
                                    int i6 = r3.A02;
                                    if (i6 % 4 == 0) {
                                        int i7 = r3.A01;
                                        if (i4 > i6 || i6 + i7 > i2) {
                                            Object[] objArr = new Object[2];
                                            AnonymousClass000.A1L(objArr, i5, 0);
                                            AnonymousClass000.A1L(objArr, r3.A00, 1);
                                            throw new AnonymousClass78W(String.format("section index %d kind %d invalid offset/size", objArr));
                                        }
                                        r9[i5] = r3;
                                        i5++;
                                    } else {
                                        Object[] objArr2 = new Object[2];
                                        AnonymousClass000.A1L(objArr2, i5, 0);
                                        AnonymousClass000.A1L(objArr2, r3.A00, 1);
                                        throw new AnonymousClass78W(String.format("section index %d kind %d invalid alignment", objArr2));
                                    }
                                }
                                if (i3 >= 4) {
                                    int i8 = 0;
                                    while (r9[i8].A00 == i8) {
                                        i8++;
                                        if (i8 >= 4) {
                                            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(r9[0].A01 / 16);
                                            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(r9[1].A01 / 16);
                                            String str2 = "";
                                            for (int i9 = 4; i9 < i3; i9++) {
                                                C121145sf r12 = r9[i9];
                                                if (r12.A00 == 4) {
                                                    ByteBuffer duplicate = slice.duplicate();
                                                    duplicate.position(r12.A02);
                                                    duplicate.limit(r12.A02 + r12.A01);
                                                    byte[] bArr = new byte[duplicate.remaining()];
                                                    duplicate.get(bArr);
                                                    str2 = new String(bArr, AnonymousClass6TG.A05);
                                                }
                                            }
                                            r7 = new C121135se(r7.A02, new AnonymousClass6TG(str2, slice, atomicReferenceArray, atomicReferenceArray2, r9), (String) null);
                                        }
                                    }
                                    throw new AnonymousClass78W(AnonymousClass000.A0r("missing required section ", AnonymousClass000.A0u(), i8));
                                }
                                throw new AnonymousClass78W("less than required number of sections");
                            }
                            throw new AnonymousClass78W("encoded size not enough for section headers");
                        } else {
                            throw new AnonymousClass78W("encoded size is too small");
                        }
                    } else {
                        throw new AnonymousClass78W("invalid magic or version");
                    }
                } catch (UnsupportedEncodingException e) {
                    throw AnonymousClass001.A0B(e);
                }
            }
            r8.A00 = r7;
        }
    }

    public String BH1() {
        AnonymousClass6TG r0 = this.A06.A00.A00;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public C157187by BHl() {
        C118905ov r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public C142246oZ BwQ() {
        C115205iV r0 = this.A06;
        C118905ov r3 = this.A03;
        AnonymousClass6TG r1 = r0.A00.A00;
        if (r1 != null) {
            return new C142246oZ(r1.A00(0), r3, (Object[]) null);
        }
        throw AnonymousClass001.A09("getMinsClosure() was called while minsClosure is null. This normally happens when getMinsClosure() is called before calling \"ensurePrepared()\" method");
    }

    public C142256oa(AnonymousClass6IL r1, C115205iV r2, C118905ov r3, String str, int i, int i2, int i3) {
        this.A06 = r2;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = str;
        this.A03 = r3;
        this.A05 = r1;
    }
}
